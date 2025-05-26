package com.google.common.util.concurrent;

import com.google.common.util.concurrent.b;

/* loaded from: classes3.dex */
public final class i0 extends b.i implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f33569e;

    public i0(Runnable runnable) {
        runnable.getClass();
        this.f33569e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f33569e.run();
        } catch (Throwable th3) {
            w(th3);
            throw th3;
        }
    }

    @Override // com.google.common.util.concurrent.b
    public final String t() {
        return "task=[" + this.f33569e + "]";
    }
}
