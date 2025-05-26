package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.model.AmazonS3Exception;

/* loaded from: classes3.dex */
public class CompleteMultipartUploadRetryCondition implements RetryPolicy.RetryCondition {

    /* renamed from: b, reason: collision with root package name */
    public final int f28792b = 3;

    @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
    public final boolean a(AmazonClientException amazonClientException, int i13) {
        AmazonS3Exception amazonS3Exception;
        return (amazonClientException instanceof AmazonS3Exception) && (amazonS3Exception = (AmazonS3Exception) amazonClientException) != null && amazonS3Exception.a() != null && amazonS3Exception.f28509c != null && amazonS3Exception.a().contains("InternalError") && amazonS3Exception.f28509c.contains("Please try again.") && i13 < this.f28792b;
    }
}
