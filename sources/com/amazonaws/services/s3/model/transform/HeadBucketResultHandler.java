package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.model.HeadBucketResult;

/* loaded from: classes3.dex */
public class HeadBucketResultHandler extends AbstractS3ResponseHandler<HeadBucketResult> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object a(HttpResponse httpResponse) {
        AmazonWebServiceResponse amazonWebServiceResponse = new AmazonWebServiceResponse();
        HeadBucketResult headBucketResult = new HeadBucketResult();
        headBucketResult.f28875a = (String) httpResponse.f28606d.get("x-amz-bucket-region");
        amazonWebServiceResponse.f28521a = headBucketResult;
        return amazonWebServiceResponse;
    }
}
