package com.modiface.mfemakeupkit.facetracking;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f34486a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34487b;

    public i(a aVar, AtomicBoolean atomicBoolean) {
        this.f34487b = aVar;
        this.f34486a = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        AtomicBoolean atomicBoolean = this.f34486a;
        bVar = this.f34487b.f34458a;
        atomicBoolean.set(bVar.g());
    }
}
