package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.AbortedException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.s3.transferutility.UploadTask;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class UploadPartTask implements Callable<Boolean> {

    /* renamed from: f, reason: collision with root package name */
    public static final Log f28732f = LogFactory.a(UploadPartTask.class);

    /* renamed from: a, reason: collision with root package name */
    public final UploadTask.UploadPartTaskMetadata f28733a;

    /* renamed from: b, reason: collision with root package name */
    public final UploadPartTaskProgressListener f28734b;

    /* renamed from: c, reason: collision with root package name */
    public final UploadPartRequest f28735c;

    /* renamed from: d, reason: collision with root package name */
    public final AmazonS3 f28736d;

    /* renamed from: e, reason: collision with root package name */
    public final TransferDBUtil f28737e;

    public class UploadPartTaskProgressListener implements ProgressListener {

        /* renamed from: a, reason: collision with root package name */
        public final UploadTask.UploadTaskProgressListener f28738a;

        /* renamed from: b, reason: collision with root package name */
        public long f28739b;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.f28738a = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final void a(ProgressEvent progressEvent) {
            if (32 == progressEvent.f28581b) {
                UploadPartTask.f28732f.f("Reset Event triggered. Resetting the bytesCurrent to 0.");
                this.f28739b = 0L;
            } else {
                this.f28739b += progressEvent.f28580a;
            }
            UploadTask.UploadTaskProgressListener uploadTaskProgressListener = this.f28738a;
            int i13 = UploadPartTask.this.f28735c.f28921h;
            long j13 = this.f28739b;
            synchronized (uploadTaskProgressListener) {
                UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = (UploadTask.UploadPartTaskMetadata) UploadTask.this.f28747e.get(Integer.valueOf(i13));
                if (uploadPartTaskMetadata == null) {
                    UploadTask.f28741g.g("Update received for unknown part. Ignoring.");
                    return;
                }
                uploadPartTaskMetadata.f28750b = j13;
                long j14 = uploadTaskProgressListener.f28753b;
                Iterator it = UploadTask.this.f28747e.entrySet().iterator();
                while (it.hasNext()) {
                    j14 += ((UploadTask.UploadPartTaskMetadata) ((Map.Entry) it.next()).getValue()).f28750b;
                }
                if (j14 > uploadTaskProgressListener.f28752a) {
                    UploadTask uploadTask = UploadTask.this;
                    TransferRecord transferRecord = uploadTask.f28744b;
                    long j15 = transferRecord.f28672f;
                    if (j14 <= j15) {
                        uploadTask.f28746d.f(transferRecord.f28667a, j14, j15, true);
                        uploadTaskProgressListener.f28752a = j14;
                    }
                }
            }
        }
    }

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.f28733a = uploadPartTaskMetadata;
        this.f28734b = new UploadPartTaskProgressListener(uploadTaskProgressListener);
        this.f28735c = uploadPartRequest;
        this.f28736d = amazonS3;
        this.f28737e = transferDBUtil;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() {
        TransferDBUtil transferDBUtil = this.f28737e;
        Log log = f28732f;
        TransferState transferState = TransferState.IN_PROGRESS;
        UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.f28733a;
        uploadPartTaskMetadata.f28751c = transferState;
        UploadPartRequest uploadPartRequest = this.f28735c;
        UploadPartTaskProgressListener uploadPartTaskProgressListener = this.f28734b;
        uploadPartRequest.f28518a = uploadPartTaskProgressListener;
        int i13 = 1;
        while (true) {
            try {
                UploadPartResult a13 = this.f28736d.a(uploadPartRequest);
                TransferState transferState2 = TransferState.PART_COMPLETED;
                uploadPartTaskMetadata.f28751c = transferState2;
                int i14 = uploadPartRequest.f28917d;
                transferDBUtil.getClass();
                TransferDBUtil.h(i14, transferState2);
                int i15 = uploadPartRequest.f28917d;
                String str = a13.f28925a;
                transferDBUtil.getClass();
                TransferDBUtil.g(i15, str);
                return Boolean.TRUE;
            } catch (AbortedException unused) {
                log.f("Upload part aborted.");
                ProgressEvent progressEvent = new ProgressEvent(0L);
                progressEvent.f28581b = 32;
                uploadPartTaskProgressListener.a(progressEvent);
                return Boolean.FALSE;
            } catch (Exception e13) {
                log.c("Unexpected error occurred: " + e13);
                ProgressEvent progressEvent2 = new ProgressEvent(0L);
                progressEvent2.f28581b = 32;
                uploadPartTaskProgressListener.a(progressEvent2);
                try {
                    TransferNetworkLossHandler.a();
                    throw null;
                } catch (TransferUtilityException e14) {
                    log.c("TransferUtilityException: [" + e14 + "]");
                    if (i13 >= 3) {
                        TransferState transferState3 = TransferState.FAILED;
                        uploadPartTaskMetadata.f28751c = transferState3;
                        int i16 = uploadPartRequest.f28917d;
                        transferDBUtil.getClass();
                        TransferDBUtil.h(i16, transferState3);
                        log.d("Encountered error uploading part ", e13);
                        throw e13;
                    }
                    long random = ((1 << i13) * 1000) + ((long) (Math.random() * 1000.0d));
                    log.g("Retrying in " + random + " ms.");
                    TimeUnit.MILLISECONDS.sleep(random);
                    log.a("Retry attempt: " + i13, e13);
                    i13++;
                }
            }
        }
    }
}
