package r4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class e extends tb.f {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f106107h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f106108i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f106109j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f106110k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f106111l;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f106107h = atomicReferenceFieldUpdater;
        this.f106108i = atomicReferenceFieldUpdater2;
        this.f106109j = atomicReferenceFieldUpdater3;
        this.f106110k = atomicReferenceFieldUpdater4;
        this.f106111l = atomicReferenceFieldUpdater5;
    }

    @Override // tb.f
    public final void a0(g gVar, g gVar2) {
        this.f106108i.lazySet(gVar, gVar2);
    }

    @Override // tb.f
    public final void b0(g gVar, Thread thread) {
        this.f106107h.lazySet(gVar, thread);
    }

    @Override // tb.f
    public final boolean x(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f106110k;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // tb.f
    public final boolean y(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f106111l;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // tb.f
    public final boolean z(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f106109j;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }
}
