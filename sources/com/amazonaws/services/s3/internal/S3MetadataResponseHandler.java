package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

/* loaded from: classes3.dex */
public class S3MetadataResponseHandler extends AbstractS3ResponseHandler<ObjectMetadata> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public final Object a(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        AbstractS3ResponseHandler.d(httpResponse, objectMetadata);
        AmazonWebServiceResponse c13 = AbstractS3ResponseHandler.c(httpResponse);
        c13.f28521a = objectMetadata;
        return c13;
    }
}
