package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.util.Date;

/* loaded from: classes3.dex */
public class PutObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {
    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void b(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void c(boolean z13) {
    }

    @Override // com.amazonaws.services.s3.internal.S3VersionResult
    public final void d() {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void g(Date date) {
    }
}
