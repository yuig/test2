package com.amazonaws.mobileconnectors.s3.transferutility;

import a.a;
import a.c;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.JsonUtils;
import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import java.io.File;
import java.util.TreeMap;
import nm.o;

/* loaded from: classes3.dex */
class TransferDBUtil {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f28650b;

    /* renamed from: c, reason: collision with root package name */
    public static TransferDBBase f28651c;

    /* renamed from: a, reason: collision with root package name */
    public final o f28652a = new o();

    static {
        LogFactory.a(TransferDBUtil.class);
        f28650b = new Object();
    }

    public TransferDBUtil(Context context) {
        synchronized (f28650b) {
            try {
                if (f28651c == null) {
                    f28651c = new TransferDBBase(context);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static int a(int i13) {
        TransferDBBase transferDBBase = f28651c;
        Uri e13 = e(i13);
        int match = transferDBBase.f28647b.match(e13);
        transferDBBase.a();
        if (match == 10) {
            return transferDBBase.f28649d.delete("awstransfer", null, null);
        }
        if (match != 20) {
            throw new IllegalArgumentException(c.g("Unknown URI: ", e13));
        }
        String lastPathSegment = e13.getLastPathSegment();
        if (!TextUtils.isEmpty(null)) {
            return transferDBBase.f28649d.delete("awstransfer", a.k("_id=", lastPathSegment, " and null"), null);
        }
        return transferDBBase.f28649d.delete("awstransfer", "_id=" + lastPathSegment, null);
    }

    public static ContentValues c(ObjectMetadata objectMetadata) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_metadata", JsonUtils.b(objectMetadata.f28887a));
        contentValues.put("header_content_type", (String) objectMetadata.f28888b.get("Content-Type"));
        TreeMap treeMap = objectMetadata.f28888b;
        contentValues.put("header_content_encoding", (String) treeMap.get("Content-Encoding"));
        contentValues.put("header_cache_control", (String) treeMap.get("Cache-Control"));
        contentValues.put("content_md5", (String) objectMetadata.f28888b.get("Content-MD5"));
        contentValues.put("header_content_disposition", (String) treeMap.get("Content-Disposition"));
        contentValues.put("sse_algorithm", (String) objectMetadata.f28888b.get("x-amz-server-side-encryption"));
        contentValues.put("kms_key", (String) treeMap.get("x-amz-server-side-encryption-aws-kms-key-id"));
        contentValues.put("expiration_time_rule_id", objectMetadata.f28891e);
        if (DateUtils.a(objectMetadata.f28889c) != null) {
            contentValues.put("http_expires_date", String.valueOf(DateUtils.a(objectMetadata.f28889c).getTime()));
        }
        Object obj = objectMetadata.f28888b.get("x-amz-storage-class");
        if ((obj == null ? null : obj.toString()) != null) {
            Object obj2 = objectMetadata.f28888b.get("x-amz-storage-class");
            contentValues.put("header_storage_class", obj2 != null ? obj2.toString() : null);
        }
        return contentValues;
    }

    public static Uri d(int i13) {
        return Uri.parse(f28651c.f28646a + "/part/" + i13);
    }

    public static Uri e(int i13) {
        return Uri.parse(f28651c.f28646a + "/" + i13);
    }

    public static TransferRecord f(int i13) {
        Cursor b13;
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            b13 = f28651c.b(e(i13));
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (b13.moveToFirst()) {
                transferRecord = new TransferRecord();
                transferRecord.D = new o();
                transferRecord.f28667a = i13;
                transferRecord.c(b13);
            }
            b13.close();
            return transferRecord;
        } catch (Throwable th4) {
            th = th4;
            cursor = b13;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void g(int i13, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f28651c.c(e(i13), contentValues, null, null);
    }

    public static int h(int i13, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(AnimatedTarget.PROPERTY_STATE, transferState.toString());
        return TransferState.FAILED.equals(transferState) ? f28651c.c(e(i13), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()}) : f28651c.c(e(i13), contentValues, null, null);
    }

    public static int i(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(transferRecord.f28667a));
        contentValues.put(AnimatedTarget.PROPERTY_STATE, transferRecord.f28676j.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f28672f));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f28673g));
        return f28651c.c(e(transferRecord.f28667a), contentValues, null, null);
    }

    public final ContentValues b(String str, String str2, File file, long j13, int i13, long j14, int i14, ObjectMetadata objectMetadata, TransferUtilityOptions transferUtilityOptions) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", TransferType.UPLOAD.toString());
        contentValues.put(AnimatedTarget.PROPERTY_STATE, TransferState.WAITING.toString());
        contentValues.put("bucket_name", str);
        contentValues.put("key", str2);
        contentValues.put("file", file.getAbsolutePath());
        contentValues.put("bytes_current", (Long) 0L);
        contentValues.put("bytes_total", Long.valueOf(j14));
        contentValues.put("is_multipart", (Integer) 1);
        contentValues.put("part_num", Integer.valueOf(i13));
        contentValues.put("file_offset", Long.valueOf(j13));
        contentValues.put("multipart_id", "");
        contentValues.put("is_last_part", Integer.valueOf(i14));
        contentValues.put("is_encrypted", (Integer) 0);
        contentValues.putAll(c(objectMetadata));
        if (transferUtilityOptions != null) {
            contentValues.put("transfer_utility_options", this.f28652a.k(transferUtilityOptions));
        }
        return contentValues;
    }
}
