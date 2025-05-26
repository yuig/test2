package com.amazonaws.mobileconnectors.s3.transferutility;

import a.a;
import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.util.json.JsonUtils;
import com.google.gson.JsonSyntaxException;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Future;
import nm.o;

/* loaded from: classes3.dex */
class TransferRecord {
    public static final Log E = LogFactory.a(TransferRecord.class);
    public String A;
    public TransferUtilityOptions B;
    public Future C;
    public o D;

    /* renamed from: a, reason: collision with root package name */
    public int f28667a;

    /* renamed from: b, reason: collision with root package name */
    public int f28668b;

    /* renamed from: c, reason: collision with root package name */
    public int f28669c;

    /* renamed from: d, reason: collision with root package name */
    public int f28670d;

    /* renamed from: e, reason: collision with root package name */
    public int f28671e;

    /* renamed from: f, reason: collision with root package name */
    public long f28672f;

    /* renamed from: g, reason: collision with root package name */
    public long f28673g;

    /* renamed from: h, reason: collision with root package name */
    public long f28674h;

    /* renamed from: i, reason: collision with root package name */
    public TransferType f28675i;

    /* renamed from: j, reason: collision with root package name */
    public TransferState f28676j;

    /* renamed from: k, reason: collision with root package name */
    public String f28677k;

    /* renamed from: l, reason: collision with root package name */
    public String f28678l;

    /* renamed from: m, reason: collision with root package name */
    public String f28679m;

    /* renamed from: n, reason: collision with root package name */
    public String f28680n;

    /* renamed from: o, reason: collision with root package name */
    public String f28681o;

    /* renamed from: p, reason: collision with root package name */
    public String f28682p;

    /* renamed from: q, reason: collision with root package name */
    public String f28683q;

    /* renamed from: r, reason: collision with root package name */
    public String f28684r;

    /* renamed from: s, reason: collision with root package name */
    public String f28685s;

    /* renamed from: t, reason: collision with root package name */
    public String f28686t;

    /* renamed from: u, reason: collision with root package name */
    public Map f28687u;

    /* renamed from: v, reason: collision with root package name */
    public String f28688v;

    /* renamed from: w, reason: collision with root package name */
    public String f28689w;

    /* renamed from: x, reason: collision with root package name */
    public String f28690x;

    /* renamed from: y, reason: collision with root package name */
    public String f28691y;

    /* renamed from: z, reason: collision with root package name */
    public String f28692z;

    public final void a(final AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        TransferState transferState = this.f28676j;
        if (TransferState.COMPLETED.equals(transferState) || TransferState.FAILED.equals(transferState) || TransferState.CANCELED.equals(transferState)) {
            return;
        }
        transferStatusUpdater.g(this.f28667a, TransferState.PENDING_CANCEL);
        Future future = this.C;
        if ((future == null || future.isDone()) ? false : true) {
            this.C.cancel(true);
        }
        if (TransferType.UPLOAD.equals(this.f28675i) && this.f28669c == 1) {
            new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.s3.transferutility.TransferRecord.1
                @Override // java.lang.Runnable
                public final void run() {
                    TransferRecord transferRecord = TransferRecord.this;
                    try {
                        ((AmazonS3Client) amazonS3).g(new AbortMultipartUploadRequest(transferRecord.f28677k, transferRecord.f28678l, transferRecord.f28680n));
                        TransferRecord.E.f("Successfully clean up multipart upload: " + transferRecord.f28667a);
                    } catch (AmazonClientException e13) {
                        TransferRecord.E.a("Failed to abort multiplart upload: " + transferRecord.f28667a, e13);
                    }
                }
            }).start();
        } else if (TransferType.DOWNLOAD.equals(this.f28675i)) {
            new File(this.f28679m).delete();
        }
    }

    public final void b(AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater, ConnectivityManager connectivityManager) {
        TransferUtilityOptions transferUtilityOptions;
        TransferNetworkConnectionType transferNetworkConnectionType;
        Future future = this.C;
        if ((future == null || future.isDone()) && this.f28671e == 0 && !TransferState.COMPLETED.equals(this.f28676j)) {
            if (connectivityManager == null || (transferUtilityOptions = this.B) == null || (transferNetworkConnectionType = transferUtilityOptions.f28731c) == null || transferNetworkConnectionType.isConnected(connectivityManager)) {
                if (this.f28675i.equals(TransferType.DOWNLOAD)) {
                    this.C = TransferThreadPool.b(new DownloadTask(this, amazonS3, transferStatusUpdater));
                    return;
                } else {
                    this.C = TransferThreadPool.b(new UploadTask(this, amazonS3, transferDBUtil, transferStatusUpdater));
                    return;
                }
            }
            E.g("Network Connection " + this.B.f28731c + " is not available.");
            transferStatusUpdater.g(this.f28667a, TransferState.WAITING_FOR_NETWORK);
        }
    }

    public final void c(Cursor cursor) {
        this.f28667a = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
        this.f28668b = cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
        this.f28675i = TransferType.getType(cursor.getString(cursor.getColumnIndexOrThrow("type")));
        this.f28676j = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow(AnimatedTarget.PROPERTY_STATE)));
        this.f28677k = cursor.getString(cursor.getColumnIndexOrThrow("bucket_name"));
        this.f28678l = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        cursor.getString(cursor.getColumnIndexOrThrow("version_id"));
        this.f28672f = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
        this.f28673g = cursor.getLong(cursor.getColumnIndexOrThrow("bytes_current"));
        cursor.getLong(cursor.getColumnIndexOrThrow("speed"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_requester_pays"));
        this.f28669c = cursor.getInt(cursor.getColumnIndexOrThrow("is_multipart"));
        this.f28670d = cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
        cursor.getInt(cursor.getColumnIndexOrThrow("is_encrypted"));
        this.f28671e = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
        this.f28681o = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
        this.f28679m = cursor.getString(cursor.getColumnIndexOrThrow("file"));
        this.f28680n = cursor.getString(cursor.getColumnIndexOrThrow("multipart_id"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_start"));
        cursor.getLong(cursor.getColumnIndexOrThrow("range_last"));
        this.f28674h = cursor.getLong(cursor.getColumnIndexOrThrow("file_offset"));
        this.f28682p = cursor.getString(cursor.getColumnIndexOrThrow("header_content_type"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_content_language"));
        this.f28683q = cursor.getString(cursor.getColumnIndexOrThrow("header_content_disposition"));
        this.f28684r = cursor.getString(cursor.getColumnIndexOrThrow("header_content_encoding"));
        this.f28685s = cursor.getString(cursor.getColumnIndexOrThrow("header_cache_control"));
        cursor.getString(cursor.getColumnIndexOrThrow("header_expire"));
        this.f28687u = JsonUtils.a(cursor.getString(cursor.getColumnIndexOrThrow("user_metadata")));
        this.f28688v = cursor.getString(cursor.getColumnIndexOrThrow("expiration_time_rule_id"));
        this.f28689w = cursor.getString(cursor.getColumnIndexOrThrow("http_expires_date"));
        this.f28690x = cursor.getString(cursor.getColumnIndexOrThrow("sse_algorithm"));
        this.f28691y = cursor.getString(cursor.getColumnIndexOrThrow("kms_key"));
        this.f28692z = cursor.getString(cursor.getColumnIndexOrThrow("content_md5"));
        this.A = cursor.getString(cursor.getColumnIndexOrThrow("canned_acl"));
        this.f28686t = cursor.getString(cursor.getColumnIndexOrThrow("header_storage_class"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("transfer_utility_options"));
        try {
            this.B = (TransferUtilityOptions) this.D.b(TransferUtilityOptions.class, string);
        } catch (JsonSyntaxException e13) {
            E.d(a.k("Failed to deserialize: ", string, ", setting to default"), e13);
            this.B = new TransferUtilityOptions();
        }
    }

    public final String toString() {
        return "[id:" + this.f28667a + ",bucketName:" + this.f28677k + ",key:" + this.f28678l + ",file:" + this.f28679m + ",type:" + this.f28675i + ",bytesTotal:" + this.f28672f + ",bytesCurrent:" + this.f28673g + ",fileOffset:" + this.f28674h + ",state:" + this.f28676j + ",cannedAcl:" + this.A + ",mainUploadId:" + this.f28668b + ",isMultipart:" + this.f28669c + ",isLastPart:" + this.f28670d + ",partNumber:" + this.f28671e + ",multipartId:" + this.f28680n + ",eTag:" + this.f28681o + ",storageClass:" + this.f28686t + ",userMetadata:" + this.f28687u.toString() + ",transferUtilityOptions:" + this.D.k(this.B) + "]";
    }
}
