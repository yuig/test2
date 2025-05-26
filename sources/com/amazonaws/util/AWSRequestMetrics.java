package com.amazonaws.util;

import com.amazonaws.metrics.MetricType;

@Deprecated
/* loaded from: classes3.dex */
public class AWSRequestMetrics {

    /* renamed from: a, reason: collision with root package name */
    public final TimingInfo f29031a;

    public enum Field implements MetricType {
        AWSErrorCode,
        AWSRequestID,
        BytesProcessed,
        ClientExecuteTime,
        CredentialsRequestTime,
        Exception,
        HttpRequestTime,
        RedirectLocation,
        RequestMarshallTime,
        RequestSigningTime,
        ResponseProcessingTime,
        RequestCount,
        RetryCount,
        HttpClientRetryCount,
        HttpClientSendRequestTime,
        HttpClientReceiveResponseTime,
        RetryPauseTime,
        ServiceEndpoint,
        ServiceName,
        StatusCode
    }

    public AWSRequestMetrics() {
        System.currentTimeMillis();
        this.f29031a = new TimingInfo(System.nanoTime(), null);
    }

    public void a(Field field, Object obj) {
    }

    public void b(Field field) {
    }

    public void c(Field field) {
    }

    public void d(Field field, long j13) {
    }

    public void e(Field field) {
    }

    public AWSRequestMetrics(TimingInfo timingInfo) {
        this.f29031a = timingInfo;
    }
}
