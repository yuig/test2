package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferStatusUpdater;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectIdBuilder;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
class DownloadTask implements Callable<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    public static final Log f28639d = LogFactory.a(DownloadTask.class);

    /* renamed from: a, reason: collision with root package name */
    public final AmazonS3 f28640a;

    /* renamed from: b, reason: collision with root package name */
    public final TransferRecord f28641b;

    /* renamed from: c, reason: collision with root package name */
    public final TransferStatusUpdater f28642c;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.f28641b = transferRecord;
        this.f28640a = amazonS3;
        this.f28642c = transferStatusUpdater;
    }

    public static void a(File file, S3ObjectInputStream s3ObjectInputStream) {
        Log log = f28639d;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, file.length() > 0));
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int read = s3ObjectInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (IOException e13) {
                                log.j("got exception", e13);
                            }
                        }
                    }
                    bufferedOutputStream2.close();
                    try {
                        s3ObjectInputStream.close();
                    } catch (IOException e14) {
                        log.j("got exception", e14);
                    }
                } catch (SocketTimeoutException e15) {
                    e = e15;
                    String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
                    log.c(str);
                    throw new AmazonClientException(str, e);
                } catch (IOException e16) {
                    e = e16;
                    throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e17) {
                            log.j("got exception", e17);
                        }
                    }
                    if (s3ObjectInputStream == null) {
                        throw th;
                    }
                    try {
                        s3ObjectInputStream.close();
                        throw th;
                    } catch (IOException e18) {
                        log.j("got exception", e18);
                        throw th;
                    }
                }
            } catch (SocketTimeoutException e19) {
                e = e19;
            } catch (IOException e23) {
                e = e23;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        long longValue;
        int lastIndexOf;
        try {
            TransferNetworkLossHandler.a();
            throw null;
        } catch (TransferUtilityException e13) {
            Log log = f28639d;
            log.c("TransferUtilityException: [" + e13 + "]");
            TransferRecord transferRecord = this.f28641b;
            int i13 = transferRecord.f28667a;
            TransferState transferState = TransferState.IN_PROGRESS;
            TransferStatusUpdater transferStatusUpdater = this.f28642c;
            transferStatusUpdater.g(i13, transferState);
            ProgressListener a13 = transferStatusUpdater.a(transferRecord.f28667a);
            try {
                String str = transferRecord.f28677k;
                String str2 = transferRecord.f28678l;
                GetObjectRequest getObjectRequest = new GetObjectRequest();
                S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
                getObjectRequest.f28867d = s3ObjectIdBuilder;
                getObjectRequest.f28869f = new ArrayList();
                getObjectRequest.f28870g = new ArrayList();
                s3ObjectIdBuilder.f28904a = str;
                s3ObjectIdBuilder.f28905b = str2;
                s3ObjectIdBuilder.f28906c = null;
                TransferUtility.b(getObjectRequest);
                File file = new File(transferRecord.f28679m);
                long length = file.length();
                if (length > 0) {
                    log.f(String.format("Resume transfer %d from %d bytes", Integer.valueOf(transferRecord.f28667a), Long.valueOf(length)));
                    getObjectRequest.f28868e = new long[]{length, -1};
                }
                getObjectRequest.f28871h = a13;
                S3Object m13 = ((AmazonS3Client) this.f28640a).m(getObjectRequest);
                if (m13 == null) {
                    transferStatusUpdater.d(transferRecord.f28667a, new IllegalStateException("AmazonS3.getObject returns null"));
                    transferStatusUpdater.g(transferRecord.f28667a, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                ObjectMetadata objectMetadata = m13.f28902c;
                String str3 = (String) objectMetadata.f28888b.get("Content-Range");
                if (str3 == null || (lastIndexOf = str3.lastIndexOf("/")) < 0) {
                    Long l13 = (Long) objectMetadata.f28888b.get("Content-Length");
                    longValue = l13 == null ? 0L : l13.longValue();
                } else {
                    longValue = Long.parseLong(str3.substring(lastIndexOf + 1));
                }
                long j13 = longValue;
                this.f28642c.f(transferRecord.f28667a, length, j13, true);
                a(file, m13.f28903d);
                this.f28642c.f(transferRecord.f28667a, j13, j13, true);
                transferStatusUpdater.g(transferRecord.f28667a, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (Exception e14) {
                if (TransferState.PENDING_CANCEL.equals(transferRecord.f28676j)) {
                    int i14 = transferRecord.f28667a;
                    TransferState transferState2 = TransferState.CANCELED;
                    transferStatusUpdater.g(i14, transferState2);
                    log.g("Transfer is " + transferState2);
                    return Boolean.FALSE;
                }
                if (TransferState.PENDING_PAUSE.equals(transferRecord.f28676j)) {
                    int i15 = transferRecord.f28667a;
                    TransferState transferState3 = TransferState.PAUSED;
                    transferStatusUpdater.g(i15, transferState3);
                    log.g("Transfer is " + transferState3);
                    new ProgressEvent(0L).f28581b = 32;
                    ((TransferStatusUpdater.TransferProgressListener) a13).a(new ProgressEvent(0L));
                    return Boolean.FALSE;
                }
                try {
                    TransferNetworkLossHandler.a();
                    throw null;
                } catch (TransferUtilityException e15) {
                    log.c("TransferUtilityException: [" + e15 + "]");
                    if (RetryUtils.b(e14)) {
                        log.g("Transfer is interrupted. " + e14);
                        transferStatusUpdater.g(transferRecord.f28667a, TransferState.FAILED);
                        return Boolean.FALSE;
                    }
                    log.f("Failed to download: " + transferRecord.f28667a + " due to " + e14.getMessage());
                    transferStatusUpdater.d(transferRecord.f28667a, e14);
                    transferStatusUpdater.g(transferRecord.f28667a, TransferState.FAILED);
                    return Boolean.FALSE;
                }
            }
        }
    }
}
