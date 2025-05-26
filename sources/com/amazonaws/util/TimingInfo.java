package com.amazonaws.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class TimingInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f29049a;

    /* renamed from: b, reason: collision with root package name */
    public Long f29050b;

    public TimingInfo(long j13, Long l13) {
        this.f29049a = j13;
        this.f29050b = l13;
    }

    public void a(String str, TimingInfo timingInfo) {
    }

    public void b() {
        this.f29050b = Long.valueOf(System.nanoTime());
    }

    public void c(String str) {
    }

    public void d(long j13, String str) {
    }

    public final String toString() {
        Double valueOf = this.f29050b != null ? Double.valueOf(TimeUnit.NANOSECONDS.toMicros(r0.longValue() - this.f29049a) / 1000.0d) : null;
        return String.valueOf(valueOf == null ? -1.0d : valueOf.doubleValue());
    }
}
