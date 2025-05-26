package com.google.android.gms.internal.recaptcha;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f31755a;

    public h1(Unsafe unsafe) {
        this.f31755a = unsafe;
    }

    public abstract byte a(long j13, Object obj);

    public final void b(int i13, long j13, Object obj) {
        this.f31755a.putInt(obj, j13, i13);
    }

    public final void c(long j13, Object obj, long j14) {
        this.f31755a.putLong(obj, j13, j14);
    }

    public abstract void d(long j13, Object obj, boolean z13);

    public abstract void e(Object obj, long j13, double d2);

    public abstract void f(Object obj, long j13, float f13);

    public abstract boolean g(long j13, Object obj);

    public abstract float h(long j13, Object obj);

    public abstract double i(long j13, Object obj);

    public final int j(long j13, Object obj) {
        return this.f31755a.getInt(obj, j13);
    }

    public final long k(long j13, Object obj) {
        return this.f31755a.getLong(obj, j13);
    }
}
