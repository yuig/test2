package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;

/* loaded from: classes3.dex */
public class S3RequesterChargedHeaderHandler<T extends S3RequesterChargedResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void a(Object obj, HttpResponse httpResponse) {
        ((S3RequesterChargedResult) obj).c(httpResponse.f28606d.get("x-amz-request-charged") != null);
    }
}
