package com.modiface.mfecommon.utils;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f34354a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f34355b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f34356c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f34357d;

    public o0(p pVar, Object obj, Runnable runnable, AtomicBoolean atomicBoolean) {
        this.f34357d = pVar;
        this.f34354a = obj;
        this.f34355b = runnable;
        this.f34356c = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f34354a) {
            this.f34355b.run();
            this.f34356c.set(true);
            this.f34354a.notify();
        }
    }
}
