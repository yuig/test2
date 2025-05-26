package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import com.amazonaws.DefaultRequest;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.services.s3.util.Mimetypes;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
class UploadTask implements Callable<Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public static final Log f28741g = LogFactory.a(UploadTask.class);

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f28742h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final AmazonS3 f28743a;

    /* renamed from: b, reason: collision with root package name */
    public final TransferRecord f28744b;

    /* renamed from: c, reason: collision with root package name */
    public final TransferDBUtil f28745c;

    /* renamed from: d, reason: collision with root package name */
    public final TransferStatusUpdater f28746d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f28747e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f28748f;

    public class UploadPartTaskMetadata {

        /* renamed from: a, reason: collision with root package name */
        public Future f28749a;

        /* renamed from: b, reason: collision with root package name */
        public long f28750b;

        /* renamed from: c, reason: collision with root package name */
        public TransferState f28751c;
    }

    public class UploadTaskProgressListener implements ProgressListener {

        /* renamed from: a, reason: collision with root package name */
        public long f28752a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28753b;

        public UploadTaskProgressListener(long j13) {
            this.f28752a = j13;
            this.f28753b = j13;
        }

        @Override // com.amazonaws.event.ProgressListener
        public final void a(ProgressEvent progressEvent) {
        }
    }

    static {
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            f28742h.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.f28744b = transferRecord;
        this.f28743a = amazonS3;
        this.f28745c = transferDBUtil;
        this.f28746d = transferStatusUpdater;
    }

    public static PutObjectRequest b(TransferRecord transferRecord) {
        File file = new File(transferRecord.f28679m);
        String str = transferRecord.f28677k;
        String str2 = transferRecord.f28678l;
        PutObjectRequest putObjectRequest = new PutObjectRequest();
        putObjectRequest.f28832d = str;
        putObjectRequest.f28833e = str2;
        putObjectRequest.f28834f = file;
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.f28888b.put("Content-Length", Long.valueOf(file.length()));
        String str3 = transferRecord.f28685s;
        if (str3 != null) {
            objectMetadata.f28888b.put("Cache-Control", str3);
        }
        String str4 = transferRecord.f28683q;
        if (str4 != null) {
            objectMetadata.f28888b.put("Content-Disposition", str4);
        }
        String str5 = transferRecord.f28684r;
        if (str5 != null) {
            objectMetadata.f28888b.put("Content-Encoding", str5);
        }
        String str6 = transferRecord.f28682p;
        if (str6 != null) {
            objectMetadata.f28888b.put("Content-Type", str6);
        } else {
            objectMetadata.f28888b.put("Content-Type", Mimetypes.a().b(file));
        }
        String str7 = transferRecord.f28686t;
        if (str7 != null) {
            putObjectRequest.f28839k = str7;
        }
        String str8 = transferRecord.f28688v;
        if (str8 != null) {
            objectMetadata.f28891e = str8;
        }
        if (transferRecord.f28689w != null) {
            objectMetadata.f28889c = new Date(Long.valueOf(transferRecord.f28689w).longValue());
        }
        String str9 = transferRecord.f28690x;
        if (str9 != null) {
            objectMetadata.h(str9);
        }
        Map map = transferRecord.f28687u;
        if (map != null) {
            objectMetadata.f28887a = map;
            String str10 = (String) map.get("x-amz-tagging");
            if (str10 != null) {
                try {
                    String[] split = str10.split("&");
                    ArrayList arrayList = new ArrayList();
                    for (String str11 : split) {
                        String[] split2 = str11.split("=");
                        arrayList.add(new Tag(split2[0], split2[1]));
                    }
                    ObjectTagging objectTagging = new ObjectTagging();
                    objectTagging.f28893a = arrayList;
                    putObjectRequest.f28842n = objectTagging;
                } catch (Exception e13) {
                    f28741g.d("Error in passing the object tags as request headers.", e13);
                }
            }
            String str12 = (String) transferRecord.f28687u.get("x-amz-website-redirect-location");
            if (str12 != null) {
                putObjectRequest.f28840l = str12;
            }
            String str13 = (String) transferRecord.f28687u.get("x-amz-request-payer");
            if (str13 != null) {
                putObjectRequest.f28899o = "requester".equals(str13);
            }
        }
        String str14 = transferRecord.f28692z;
        if (str14 != null) {
            objectMetadata.f28888b.put("Content-MD5", str14);
        }
        String str15 = transferRecord.f28691y;
        if (str15 != null) {
            putObjectRequest.f28841m = new SSEAwsKeyManagementParams(str15);
        }
        putObjectRequest.f28836h = objectMetadata;
        String str16 = transferRecord.A;
        putObjectRequest.f28837i = str16 == null ? null : (CannedAccessControlList) f28742h.get(str16);
        return putObjectRequest;
    }

    public final void a(String str, int i13, String str2, String str3) {
        XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler;
        this.f28745c.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = TransferDBUtil.f28651c.b(TransferDBUtil.d(i13));
            while (cursor.moveToNext()) {
                int i14 = cursor.getInt(cursor.getColumnIndexOrThrow("part_num"));
                String string = cursor.getString(cursor.getColumnIndexOrThrow("etag"));
                PartETag partETag = new PartETag();
                partETag.f28896a = i14;
                partETag.f28897b = string;
                arrayList.add(partETag);
            }
            cursor.close();
            CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest();
            new ArrayList();
            TransferUtility.a(completeMultipartUploadRequest);
            AmazonS3Client amazonS3Client = (AmazonS3Client) this.f28743a;
            amazonS3Client.getClass();
            ValidationUtils.a(str, "The bucket name parameter must be specified when completing a multipart upload");
            ValidationUtils.a(str2, "The key parameter must be specified when completing a multipart upload");
            ValidationUtils.a(str3, "The upload ID parameter must be specified when completing a multipart upload");
            int i15 = 0;
            while (true) {
                DefaultRequest i16 = amazonS3Client.i(str, str2, completeMultipartUploadRequest, HttpMethodName.POST, null);
                i16.b("uploadId", str3);
                byte[] a13 = RequestXmlFactory.a(arrayList);
                i16.a("Content-Type", "application/xml");
                i16.a("Content-Length", String.valueOf(a13.length));
                i16.f28539i = new ByteArrayInputStream(a13);
                completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) amazonS3Client.n(i16, new ResponseHeaderHandlerChain(new Unmarshaller<XmlResponsesSaxParser.CompleteMultipartUploadHandler, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                    @Override // com.amazonaws.transform.Unmarshaller
                    public final Object a(InputStream inputStream) {
                        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                        XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                        xmlResponsesSaxParser.d(completeMultipartUploadHandler2, inputStream);
                        return completeMultipartUploadHandler2;
                    }
                }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), str, str2);
                if (completeMultipartUploadHandler.f28965c != null) {
                    return;
                }
                AmazonS3Exception amazonS3Exception = completeMultipartUploadHandler.f28966d;
                int i17 = i15 + 1;
                RetryPolicy retryPolicy = amazonS3Client.f28513b.f28527c;
                if (retryPolicy == null || retryPolicy.f28769a == null || retryPolicy == PredefinedRetryPolicies.f28762a || !amazonS3Client.f28783m.a(amazonS3Exception, i15)) {
                    break;
                } else {
                    i15 = i17;
                }
            }
            throw completeMultipartUploadHandler.f28966d;
        } catch (Throwable th3) {
            if (cursor != null) {
                cursor.close();
            }
            throw th3;
        }
    }

    public final String c(PutObjectRequest putObjectRequest) {
        String str = putObjectRequest.f28832d;
        InitiateMultipartUploadRequest initiateMultipartUploadRequest = new InitiateMultipartUploadRequest();
        String str2 = putObjectRequest.f28833e;
        initiateMultipartUploadRequest.f28877e = putObjectRequest.f28837i;
        initiateMultipartUploadRequest.f28876d = putObjectRequest.f28836h;
        initiateMultipartUploadRequest.f28878f = putObjectRequest.f28841m;
        initiateMultipartUploadRequest.f28879g = putObjectRequest.f28842n;
        TransferUtility.a(initiateMultipartUploadRequest);
        AmazonS3Client amazonS3Client = (AmazonS3Client) this.f28743a;
        amazonS3Client.getClass();
        ValidationUtils.a(str, "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.a(str2, "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest i13 = amazonS3Client.i(str, str2, initiateMultipartUploadRequest, HttpMethodName.POST, null);
        i13.b("uploads", null);
        CannedAccessControlList cannedAccessControlList = initiateMultipartUploadRequest.f28877e;
        if (cannedAccessControlList != null) {
            i13.a("x-amz-acl", cannedAccessControlList.toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f28876d;
        if (objectMetadata != null) {
            AmazonS3Client.o(i13, objectMetadata);
        }
        String s13 = AmazonS3Client.s(initiateMultipartUploadRequest.f28879g);
        if (s13 != null) {
            i13.a("x-amz-tagging", s13);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParams = initiateMultipartUploadRequest.f28878f;
        if (sSEAwsKeyManagementParams != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                i13.a("x-amz-server-side-encryption", algorithm);
            }
            String str3 = sSEAwsKeyManagementParams.f28913a;
            if (str3 != null) {
                i13.a("x-amz-server-side-encryption-aws-kms-key-id", str3);
            }
        }
        i13.a("Content-Length", String.valueOf(0));
        i13.f28539i = new ByteArrayInputStream(new byte[0]);
        return ((InitiateMultipartUploadResult) amazonS3Client.n(i13, new ResponseHeaderHandlerChain(new Unmarshaller<InitiateMultipartUploadResult, InputStream>() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            public final Object a(InputStream inputStream) {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.d(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.f28993c;
            }
        }, new ServerSideEncryptionHeaderHandler()), str, str2)).f28880a;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0327 A[LOOP:4: B:65:0x0321->B:67:0x0327, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x035a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean call() {
        /*
            Method dump skipped, instructions count: 1355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.UploadTask.call():java.lang.Object");
    }
}
