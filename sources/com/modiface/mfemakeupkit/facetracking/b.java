package com.modiface.mfemakeupkit.facetracking;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicInteger f34470a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f34471b;

    public b(a aVar, AtomicInteger atomicInteger) {
        this.f34471b = aVar;
        this.f34470a = atomicInteger;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.modiface.mfemakeupkit.mfea.b bVar;
        AtomicInteger atomicInteger = this.f34470a;
        bVar = this.f34471b.f34458a;
        atomicInteger.set(bVar.m());
    }
}
