package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class g0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f34312a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f34313b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f34314c;

    public g0(g gVar, Runnable runnable, Runnable runnable2) {
        this.f34314c = gVar;
        this.f34312a = runnable;
        this.f34313b = runnable2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f34314c.f34311k) {
            this.f34312a.run();
            return;
        }
        Runnable runnable = this.f34313b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
