package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* loaded from: classes3.dex */
public final class RetryPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final RetryCondition f28769a;

    /* renamed from: b, reason: collision with root package name */
    public final BackoffStrategy f28770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28772d;

    public interface BackoffStrategy {

        /* renamed from: a, reason: collision with root package name */
        public static final BackoffStrategy f28773a = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            public final long a(int i13) {
                return 0L;
            }
        };

        long a(int i13);
    }

    public interface RetryCondition {

        /* renamed from: a, reason: collision with root package name */
        public static final RetryCondition f28774a = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            public final boolean a(AmazonClientException amazonClientException, int i13) {
                return false;
            }
        };

        boolean a(AmazonClientException amazonClientException, int i13);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i13, boolean z13) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f28764c : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f28765d : backoffStrategy;
        if (i13 < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f28769a = retryCondition;
        this.f28770b = backoffStrategy;
        this.f28771c = i13;
        this.f28772d = z13;
    }
}
