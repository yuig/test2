package com.amazonaws.mobileconnectors.s3.transferutility;

import a.c;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Uri;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.VersionInfoUtils;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.io.File;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public class TransferUtility {

    /* renamed from: g, reason: collision with root package name */
    public static final Log f28715g = LogFactory.a(TransferUtility.class);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f28716h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final String f28717i = "";

    /* renamed from: a, reason: collision with root package name */
    public final TransferStatusUpdater f28718a;

    /* renamed from: b, reason: collision with root package name */
    public final TransferDBUtil f28719b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f28720c;

    /* renamed from: d, reason: collision with root package name */
    public final AmazonS3 f28721d;

    /* renamed from: e, reason: collision with root package name */
    public final String f28722e;

    /* renamed from: f, reason: collision with root package name */
    public final TransferUtilityOptions f28723f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public AmazonS3 f28724a;

        /* renamed from: b, reason: collision with root package name */
        public Context f28725b;

        /* renamed from: c, reason: collision with root package name */
        public String f28726c;

        /* renamed from: d, reason: collision with root package name */
        public TransferUtilityOptions f28727d;
    }

    public TransferUtility(AmazonS3 amazonS3, Context context, String str, TransferUtilityOptions transferUtilityOptions) {
        TransferStatusUpdater transferStatusUpdater;
        this.f28721d = amazonS3;
        this.f28722e = str;
        this.f28723f = transferUtilityOptions;
        this.f28719b = new TransferDBUtil(context.getApplicationContext());
        Context applicationContext = context.getApplicationContext();
        Log log = TransferStatusUpdater.f28695c;
        synchronized (TransferStatusUpdater.class) {
            try {
                if (TransferStatusUpdater.f28699g == null) {
                    TransferDBUtil transferDBUtil = new TransferDBUtil(applicationContext);
                    TransferStatusUpdater.f28698f = transferDBUtil;
                    TransferStatusUpdater.f28699g = new TransferStatusUpdater(transferDBUtil);
                }
                transferStatusUpdater = TransferStatusUpdater.f28699g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f28718a = transferStatusUpdater;
        TransferThreadPool.a(transferUtilityOptions.f28729a);
        this.f28720c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static void a(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptions = amazonWebServiceRequest.f28519b;
        StringBuilder sb3 = new StringBuilder("TransferService_multipart/");
        sb3.append(e());
        String str = VersionInfoUtils.f29053a;
        sb3.append("2.22.6");
        requestClientOptions.a(sb3.toString());
    }

    public static void b(AmazonWebServiceRequest amazonWebServiceRequest) {
        StringBuilder sb3 = new StringBuilder("TransferService/");
        sb3.append(e());
        String str = VersionInfoUtils.f29053a;
        sb3.append("2.22.6");
        amazonWebServiceRequest.f28519b.a(sb3.toString());
    }

    public static String e() {
        synchronized (f28716h) {
            try {
                String str = f28717i;
                if (str != null && !str.trim().isEmpty()) {
                    return f28717i.trim() + "/";
                }
                return "";
            } finally {
            }
        }
    }

    public final void c(int i13) {
        f(i13, "cancel_transfer");
        this.f28719b.getClass();
        TransferDBUtil.a(i13);
    }

    public final TransferObserver d(int i13) {
        Cursor b13;
        TransferDBUtil transferDBUtil = this.f28719b;
        Cursor cursor = null;
        try {
            transferDBUtil.getClass();
            b13 = TransferDBUtil.f28651c.b(TransferDBUtil.e(i13));
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (!b13.moveToNext()) {
                b13.close();
                return null;
            }
            TransferObserver transferObserver = new TransferObserver(i13, transferDBUtil);
            transferObserver.d(b13);
            b13.close();
            return transferObserver;
        } catch (Throwable th4) {
            th = th4;
            cursor = b13;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final synchronized void f(int i13, String str) {
        TransferRecord transferRecord;
        S3ClientReference.f28643a.put(Integer.valueOf(i13), this.f28721d);
        TransferStatusUpdater transferStatusUpdater = this.f28718a;
        synchronized (transferStatusUpdater) {
            transferRecord = (TransferRecord) transferStatusUpdater.f28700a.get(Integer.valueOf(i13));
        }
        if (transferRecord == null) {
            this.f28719b.getClass();
            transferRecord = TransferDBUtil.f(i13);
            if (transferRecord == null) {
                f28715g.c("Cannot find transfer with id: " + i13);
                return;
            }
            TransferStatusUpdater transferStatusUpdater2 = this.f28718a;
            synchronized (transferStatusUpdater2) {
                transferStatusUpdater2.f28700a.put(Integer.valueOf(transferRecord.f28667a), transferRecord);
            }
        } else if ("add_transfer".equals(str)) {
            f28715g.h("Transfer has already been added: " + i13);
            return;
        }
        if (!"add_transfer".equals(str) && !"resume_transfer".equals(str)) {
            if ("pause_transfer".equals(str)) {
                TransferStatusUpdater transferStatusUpdater3 = this.f28718a;
                TransferState transferState = transferRecord.f28676j;
                if (!TransferState.COMPLETED.equals(transferState) && !TransferState.FAILED.equals(transferState) && !TransferState.CANCELED.equals(transferState) && !TransferState.PAUSED.equals(transferRecord.f28676j)) {
                    TransferState transferState2 = TransferState.PENDING_PAUSE;
                    if (!transferState2.equals(transferRecord.f28676j)) {
                        transferStatusUpdater3.g(transferRecord.f28667a, transferState2);
                        Future future = transferRecord.C;
                        if (future != null && !future.isDone()) {
                            transferRecord.C.cancel(true);
                        }
                    }
                }
            } else if ("cancel_transfer".equals(str)) {
                transferRecord.a(this.f28721d, this.f28718a);
            } else {
                f28715g.c("Unknown action: ".concat(str));
            }
        }
        transferRecord.b(this.f28721d, this.f28719b, this.f28718a, this.f28720c);
    }

    public final TransferObserver g(File file, String str) {
        int parseInt;
        String str2 = this.f28722e;
        if (str2 == null) {
            throw new IllegalArgumentException("TransferUtility has not been configured with a default bucket. Please use the corresponding method that specifies bucket name or configure the default bucket name in construction of the object. See TransferUtility.builder().defaultBucket() or TransferUtility.builder().awsConfiguration()");
        }
        ObjectMetadata objectMetadata = new ObjectMetadata();
        if (file == null || file.isDirectory() || !file.exists()) {
            throw new IllegalArgumentException("Invalid file: " + file);
        }
        long length = file.length();
        TransferUtilityOptions transferUtilityOptions = this.f28723f;
        long j13 = transferUtilityOptions.f28730b;
        TransferDBUtil transferDBUtil = this.f28719b;
        int i13 = 0;
        if (length > j13) {
            long length2 = file.length();
            double d2 = length2;
            long max = (long) Math.max(Math.ceil(d2 / 10000.0d), transferUtilityOptions.f28730b);
            int ceil = ((int) Math.ceil(d2 / max)) + 1;
            ContentValues[] contentValuesArr = new ContentValues[ceil];
            long j14 = 0;
            long j15 = max;
            contentValuesArr[0] = this.f28719b.b(str2, str, file, 0L, 0, file.length(), 0, objectMetadata, this.f28723f);
            int i14 = 1;
            int i15 = 1;
            long j16 = length2;
            int i16 = ceil;
            while (i14 < i16) {
                long j17 = j15;
                long j18 = j16 - j17;
                int i17 = i14;
                contentValuesArr[i17] = this.f28719b.b(str2, str, file, j14, i15, Math.min(j17, j16), j18 <= 0 ? 1 : 0, objectMetadata, this.f28723f);
                j14 += j17;
                i15++;
                i14 = i17 + 1;
                i16 = i16;
                j16 = j18;
                j15 = j17;
            }
            int i18 = i16;
            transferDBUtil.getClass();
            TransferDBBase transferDBBase = TransferDBUtil.f28651c;
            Uri uri = transferDBBase.f28646a;
            int match = transferDBBase.f28647b.match(uri);
            transferDBBase.a();
            try {
                if (match != 10) {
                    throw new IllegalArgumentException(c.g("Unknown URI: ", uri));
                }
                try {
                    transferDBBase.f28649d.beginTransaction();
                    parseInt = (int) transferDBBase.f28649d.insertOrThrow("awstransfer", null, contentValuesArr[0]);
                    for (int i19 = 1; i19 < i18; i19++) {
                        try {
                            contentValuesArr[i19].put("main_upload_id", Integer.valueOf(parseInt));
                            transferDBBase.f28649d.insertOrThrow("awstransfer", null, contentValuesArr[i19]);
                        } catch (Exception e13) {
                            e = e13;
                            i13 = parseInt;
                            TransferDBBase.f28644e.d("bulkInsert error : ", e);
                            transferDBBase.f28649d.endTransaction();
                            parseInt = i13;
                            int i23 = parseInt;
                            TransferObserver transferObserver = new TransferObserver(i23, this.f28719b, str2, str, file);
                            f(i23, "add_transfer");
                            return transferObserver;
                        }
                    }
                    transferDBBase.f28649d.setTransactionSuccessful();
                    transferDBBase.f28649d.endTransaction();
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                transferDBBase.f28649d.endTransaction();
                throw th3;
            }
        } else {
            Object obj = TransferType.UPLOAD;
            transferDBUtil.getClass();
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", obj.toString());
            contentValues.put(AnimatedTarget.PROPERTY_STATE, TransferState.WAITING.toString());
            contentValues.put("bucket_name", str2);
            contentValues.put("key", str);
            contentValues.put("file", file.getAbsolutePath());
            contentValues.put("bytes_current", (Long) 0L);
            if (obj.equals(obj)) {
                contentValues.put("bytes_total", Long.valueOf(file.length()));
            }
            contentValues.put("is_multipart", (Integer) 0);
            contentValues.put("part_num", (Integer) 0);
            contentValues.put("is_encrypted", (Integer) 0);
            contentValues.putAll(TransferDBUtil.c(objectMetadata));
            contentValues.put("transfer_utility_options", transferDBUtil.f28652a.k(transferUtilityOptions));
            TransferDBBase transferDBBase2 = TransferDBUtil.f28651c;
            Uri uri2 = transferDBBase2.f28646a;
            int match2 = transferDBBase2.f28647b.match(uri2);
            transferDBBase2.a();
            if (match2 != 10) {
                throw new IllegalArgumentException(c.g("Unknown URI: ", uri2));
            }
            parseInt = Integer.parseInt(Uri.parse("transfers/" + transferDBBase2.f28649d.insertOrThrow("awstransfer", null, contentValues)).getLastPathSegment());
        }
        int i232 = parseInt;
        TransferObserver transferObserver2 = new TransferObserver(i232, this.f28719b, str2, str, file);
        f(i232, "add_transfer");
        return transferObserver2;
    }
}
