package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.retry.RetryPolicy;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class PredefinedRetryPolicies {

    /* renamed from: a, reason: collision with root package name */
    public static final RetryPolicy f28762a = new RetryPolicy(RetryPolicy.RetryCondition.f28774a, RetryPolicy.BackoffStrategy.f28773a, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final RetryPolicy f28763b;

    /* renamed from: c, reason: collision with root package name */
    public static final SDKDefaultRetryCondition f28764c;

    /* renamed from: d, reason: collision with root package name */
    public static final RetryPolicy.BackoffStrategy f28765d;

    public static final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* renamed from: b, reason: collision with root package name */
        public final Random f28766b = new Random();

        /* renamed from: c, reason: collision with root package name */
        public final int f28767c = 100;

        /* renamed from: d, reason: collision with root package name */
        public final int f28768d = 20000;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        public final long a(int i13) {
            if (i13 <= 0) {
                return 0L;
            }
            return this.f28766b.nextInt(Math.min(this.f28768d, (1 << i13) * this.f28767c));
        }
    }

    public static class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        public final boolean a(AmazonClientException amazonClientException, int i13) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int i14 = amazonServiceException.f28510d;
            if (i14 != 500 && i14 != 503 && i14 != 502 && i14 != 504) {
                String a13 = amazonServiceException.a();
                if (!"Throttling".equals(a13) && !"ThrottlingException".equals(a13) && !"ProvisionedThroughputExceededException".equals(a13) && !RetryUtils.a(amazonServiceException)) {
                    return false;
                }
            }
            return true;
        }
    }

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f28764c = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f28765d = sDKDefaultBackoffStrategy;
        f28763b = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }
}
