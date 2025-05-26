package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public final class d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f34291a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f34292b;

    public d0(g gVar, Runnable runnable) {
        this.f34292b = gVar;
        this.f34291a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f34291a;
        if (runnable != null) {
            runnable.run();
        }
        this.f34292b.c();
    }
}
