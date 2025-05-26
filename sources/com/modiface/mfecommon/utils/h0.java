package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    boolean f34321a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f34322b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f34323c;

    public /* synthetic */ h0(g gVar, Runnable runnable, b0 b0Var) {
        this(gVar, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f34323c.f34311k) {
            this.f34322b.run();
            this.f34321a = true;
        }
    }

    private h0(g gVar, Runnable runnable) {
        this.f34323c = gVar;
        this.f34321a = false;
        this.f34322b = runnable;
    }
}
