package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.DateUtils;

/* loaded from: classes3.dex */
public abstract class ServiceUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28822a = 0;

    static {
        LogFactory.a(ServiceUtils.class);
        new DateUtils();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("\"")) {
            trim = trim.substring(1);
        }
        return trim.endsWith("\"") ? trim.substring(0, trim.length() - 1) : trim;
    }

    public static boolean b(AmazonWebServiceRequest amazonWebServiceRequest, S3ClientOptions s3ClientOptions) {
        if ((s3ClientOptions != null && s3ClientOptions.f28784a) || System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            long[] jArr = ((GetObjectRequest) amazonWebServiceRequest).f28868e;
            if ((jArr == null ? null : (long[]) jArr.clone()) != null) {
                return true;
            }
        } else if (amazonWebServiceRequest instanceof PutObjectRequest) {
            PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
            ObjectMetadata objectMetadata = putObjectRequest.f28836h;
            if (objectMetadata != null && ((String) objectMetadata.f28888b.get("x-amz-server-side-encryption")) != null) {
                return true;
            }
            if (putObjectRequest.f28841m != null && (SSEAlgorithm.KMS.getAlgorithm() != null || putObjectRequest.f28841m.f28913a != null)) {
                return true;
            }
        } else if (amazonWebServiceRequest instanceof UploadPartRequest) {
            ((UploadPartRequest) amazonWebServiceRequest).getClass();
        }
        return false;
    }
}
