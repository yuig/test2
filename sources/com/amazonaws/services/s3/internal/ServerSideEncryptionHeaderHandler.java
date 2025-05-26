package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import java.util.Map;

/* loaded from: classes3.dex */
public class ServerSideEncryptionHeaderHandler<T extends ServerSideEncryptionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void a(Object obj, HttpResponse httpResponse) {
        ServerSideEncryptionResult serverSideEncryptionResult = (ServerSideEncryptionResult) obj;
        Map map = httpResponse.f28606d;
        serverSideEncryptionResult.h((String) map.get("x-amz-server-side-encryption"));
        serverSideEncryptionResult.a((String) map.get("x-amz-server-side-encryption-customer-algorithm"));
        serverSideEncryptionResult.i((String) map.get("x-amz-server-side-encryption-customer-key-MD5"));
    }
}
