package com.amazonaws.metrics;

/* loaded from: classes3.dex */
public abstract class ByteThroughputProvider {

    /* renamed from: a, reason: collision with root package name */
    public long f28632a;

    /* renamed from: b, reason: collision with root package name */
    public int f28633b;

    /* renamed from: c, reason: collision with root package name */
    public final ThroughputMetricType f28634c;

    public ByteThroughputProvider(ThroughputMetricType throughputMetricType) {
        this.f28634c = throughputMetricType;
    }

    public final String toString() {
        return String.format("providerId=%s, throughputType=%s, byteCount=%d, duration=%d", super.toString(), this.f28634c, Integer.valueOf(this.f28633b), Long.valueOf(this.f28632a));
    }
}
