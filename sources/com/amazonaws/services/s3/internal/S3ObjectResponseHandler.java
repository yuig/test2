package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.util.Map;

/* loaded from: classes3.dex */
public class S3ObjectResponseHandler extends AbstractS3ResponseHandler<S3Object> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object a(HttpResponse httpResponse) {
        S3Object s3Object = new S3Object();
        AmazonWebServiceResponse c13 = AbstractS3ResponseHandler.c(httpResponse);
        Map map = httpResponse.f28606d;
        if (map.get("x-amz-website-redirect-location") != null) {
        }
        map.get("x-amz-request-charged");
        if (map.get("x-amz-tagging-count") != null) {
            Integer.parseInt((String) map.get("x-amz-tagging-count"));
        }
        AbstractS3ResponseHandler.d(httpResponse, s3Object.f28902c);
        s3Object.f28903d = new S3ObjectInputStream(httpResponse.a());
        c13.f28521a = s3Object;
        return c13;
    }
}
