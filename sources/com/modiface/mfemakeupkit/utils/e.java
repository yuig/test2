package com.modiface.mfemakeupkit.utils;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private long f34674a = 0;

    public float a() {
        if (this.f34674a != 0) {
            return (System.currentTimeMillis() - this.f34674a) / 1000.0f;
        }
        return 0.0f;
    }

    public void b() {
        this.f34674a = System.currentTimeMillis();
    }

    public void c() {
        this.f34674a = 0L;
    }
}
