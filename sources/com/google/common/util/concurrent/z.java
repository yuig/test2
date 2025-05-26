package com.google.common.util.concurrent;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes3.dex */
public final class z extends AbstractOwnableSynchronizer implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f33589a;

    public z(a0 a0Var) {
        this.f33589a = a0Var;
    }

    public static void a(z zVar, Thread thread) {
        zVar.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.f33589a.toString();
    }
}
