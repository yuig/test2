package com.google.common.util.concurrent;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kh2.c3;

/* loaded from: classes3.dex */
public final class j extends c3 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f33570a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f33571b;

    public j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f33570a = atomicReferenceFieldUpdater;
        this.f33571b = atomicIntegerFieldUpdater;
    }

    @Override // kh2.c3
    public final void r(i iVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f33570a;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == null);
    }

    @Override // kh2.c3
    public final int u(l lVar) {
        return this.f33571b.decrementAndGet(lVar);
    }
}
