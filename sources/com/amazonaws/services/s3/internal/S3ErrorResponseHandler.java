package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

/* loaded from: classes3.dex */
public class S3ErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* renamed from: a, reason: collision with root package name */
    public static final Log f28813a = LogFactory.a(S3ErrorResponseHandler.class);

    public static AmazonS3Exception b(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        StringBuilder sb3 = new StringBuilder();
        int i13 = httpResponse.f28604b;
        sb3.append(i13);
        sb3.append(" ");
        sb3.append(httpResponse.f28603a);
        amazonS3Exception.f28508b = sb3.toString();
        amazonS3Exception.f28510d = i13;
        AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
        Map map = httpResponse.f28606d;
        amazonS3Exception.f28507a = (String) map.get("x-amz-request-id");
        amazonS3Exception.f28846f = (String) map.get("x-amz-id-2");
        HashMap hashMap = new HashMap();
        hashMap.put("x-amz-bucket-region", map.get("x-amz-bucket-region"));
        amazonS3Exception.f28847g = hashMap;
        return amazonS3Exception;
    }

    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object a(HttpResponse httpResponse) {
        Log log = f28813a;
        InputStream a13 = httpResponse.a();
        String str = httpResponse.f28603a;
        if (a13 == null) {
            return b(str, httpResponse);
        }
        try {
            String iOUtils = IOUtils.toString(a13);
            try {
                Document b13 = XpathUtils.b(iOUtils);
                String a14 = XpathUtils.a("Error/Message", b13);
                String a15 = XpathUtils.a("Error/Code", b13);
                String a16 = XpathUtils.a("Error/RequestId", b13);
                String a17 = XpathUtils.a("Error/HostId", b13);
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(a14);
                amazonS3Exception.f28510d = httpResponse.f28604b;
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.f28508b = a15;
                amazonS3Exception.f28507a = a16;
                amazonS3Exception.f28846f = a17;
                return amazonS3Exception;
            } catch (Exception e13) {
                if (log.b()) {
                    log.a("Failed in parsing the response as XML: " + iOUtils, e13);
                }
                return b(iOUtils, httpResponse);
            }
        } catch (IOException e14) {
            if (log.b()) {
                log.a("Failed in reading the error response", e14);
            }
            return b(str, httpResponse);
        }
    }
}
