package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.S3VersionResult;

/* loaded from: classes3.dex */
public class S3VersionHeaderHandler<T extends S3VersionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public final void a(Object obj, HttpResponse httpResponse) {
        ((S3VersionResult) obj).d();
    }
}
