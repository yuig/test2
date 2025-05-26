package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private long f34342a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34343b = new Object();

    public boolean a() {
        boolean z13;
        synchronized (this.f34343b) {
            try {
                long j13 = this.f34342a;
                if (j13 <= 0) {
                    throw new IllegalStateException("Reference count decrement more than it should");
                }
                long max = Math.max(0L, j13 - 1);
                this.f34342a = max;
                z13 = max <= 0;
            } finally {
            }
        }
        return z13;
    }

    public void b() {
        synchronized (this.f34343b) {
            this.f34342a++;
        }
    }
}
