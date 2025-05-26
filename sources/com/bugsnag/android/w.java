package com.bugsnag.android;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes3.dex */
public final class w extends id.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id.c f29671e;

    public /* synthetic */ w(id.c cVar, int i13) {
        this.f29670d = i13;
        this.f29671e = cVar;
    }

    @Override // id.d
    public final Object c() {
        q1 q1Var;
        int i13 = this.f29670d;
        id.c cVar = this.f29671e;
        switch (i13) {
            case 0:
                return ((r0) cVar.get()).a();
            case 1:
                r1 r1Var = (r1) cVar.get();
                ReentrantReadWriteLock.ReadLock readLock = r1Var.f29465c.readLock();
                readLock.lock();
                try {
                    q1Var = r1Var.a();
                } catch (Throwable th3) {
                    try {
                        r1Var.f29464b.a("Unexpectedly failed to load LastRunInfo.", th3);
                        q1Var = null;
                    } catch (Throwable th4) {
                        readLock.unlock();
                        throw th4;
                    }
                }
                readLock.unlock();
                r1Var.b(new q1(0, false, false));
                return q1Var;
            default:
                return ((r0) cVar.get()).a();
        }
    }
}
