package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f31292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31293b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31294c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f31295d;

    public b1(d1 d1Var, boolean z13) {
        this.f31295d = d1Var;
        d1Var.f31350b.getClass();
        this.f31292a = System.currentTimeMillis();
        d1Var.f31350b.getClass();
        this.f31293b = SystemClock.elapsedRealtime();
        this.f31294c = z13;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.f31295d;
        if (d1Var.f31354f) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e13) {
            d1Var.d(e13, false, this.f31294c);
            b();
        }
    }
}
