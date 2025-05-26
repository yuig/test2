package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class n0 extends AtomicReference implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f65543b;

    public /* synthetic */ n0(AtomicInteger atomicInteger, int i13) {
        this.f65542a = i13;
        this.f65543b = atomicInteger;
    }

    @Override // uj2.m
    public final void a() {
        boolean z13;
        int i13 = this.f65542a;
        AtomicInteger atomicInteger = this.f65543b;
        switch (i13) {
            case 0:
                o0 o0Var = (o0) atomicInteger;
                o0Var.f65557e.c(this);
                int i14 = o0Var.get();
                AtomicInteger atomicInteger2 = o0Var.f65558f;
                int i15 = o0Var.f65555c;
                if (i14 != 0 || !o0Var.compareAndSet(0, 1)) {
                    atomicInteger2.decrementAndGet();
                    if (i15 != Integer.MAX_VALUE) {
                        o0Var.f65562j.request(1L);
                    }
                    if (o0Var.getAndIncrement() == 0) {
                        o0Var.e();
                        break;
                    }
                } else {
                    z13 = atomicInteger2.decrementAndGet() == 0;
                    lk2.c cVar = (lk2.c) o0Var.f65561i.get();
                    if (!z13 || (cVar != null && !cVar.isEmpty())) {
                        if (i15 != Integer.MAX_VALUE) {
                            o0Var.f65562j.request(1L);
                        }
                        if (o0Var.decrementAndGet() != 0) {
                            o0Var.e();
                            break;
                        }
                    } else {
                        pk2.c cVar2 = o0Var.f65559g;
                        cVar2.getClass();
                        Throwable b13 = pk2.h.b(cVar2);
                        xp2.b bVar = o0Var.f65553a;
                        if (b13 == null) {
                            bVar.a();
                            break;
                        } else {
                            bVar.onError(b13);
                            break;
                        }
                    }
                }
                break;
            default:
                jk2.r0 r0Var = (jk2.r0) atomicInteger;
                r0Var.f76668d.c(this);
                int i16 = r0Var.get();
                AtomicInteger atomicInteger3 = r0Var.f76669e;
                if (i16 != 0 || !r0Var.compareAndSet(0, 1)) {
                    atomicInteger3.decrementAndGet();
                    r0Var.e();
                    break;
                } else {
                    z13 = atomicInteger3.decrementAndGet() == 0;
                    lk2.c cVar3 = (lk2.c) r0Var.f76672h.get();
                    if (!z13 || (cVar3 != null && !cVar3.isEmpty())) {
                        if (r0Var.decrementAndGet() != 0) {
                            r0Var.f();
                            break;
                        }
                    } else {
                        pk2.c cVar4 = r0Var.f76670f;
                        cVar4.getClass();
                        Throwable b14 = pk2.h.b(cVar4);
                        uj2.v vVar = r0Var.f76666b;
                        if (b14 == null) {
                            vVar.a();
                            break;
                        } else {
                            vVar.onError(b14);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        switch (this.f65542a) {
            case 0:
                bk2.c.setOnce(this, cVar);
                break;
            default:
                bk2.c.setOnce(this, cVar);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f65542a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f65542a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f65542a;
        AtomicInteger atomicInteger = this.f65543b;
        switch (i13) {
            case 0:
                o0 o0Var = (o0) atomicInteger;
                xj2.b bVar = o0Var.f65557e;
                bVar.c(this);
                pk2.c cVar = o0Var.f65559g;
                cVar.getClass();
                if (!pk2.h.a(cVar, th3)) {
                    lb.l0.R0(th3);
                    break;
                } else {
                    if (!o0Var.f65554b) {
                        o0Var.f65562j.cancel();
                        bVar.dispose();
                    } else if (o0Var.f65555c != Integer.MAX_VALUE) {
                        o0Var.f65562j.request(1L);
                    }
                    o0Var.f65558f.decrementAndGet();
                    if (o0Var.getAndIncrement() == 0) {
                        o0Var.e();
                        break;
                    }
                }
                break;
            default:
                jk2.r0 r0Var = (jk2.r0) atomicInteger;
                xj2.b bVar2 = r0Var.f76668d;
                bVar2.c(this);
                pk2.c cVar2 = r0Var.f76670f;
                cVar2.getClass();
                if (!pk2.h.a(cVar2, th3)) {
                    lb.l0.R0(th3);
                    break;
                } else {
                    if (!r0Var.f76667c) {
                        r0Var.f76673i.dispose();
                        bVar2.dispose();
                    }
                    r0Var.f76669e.decrementAndGet();
                    r0Var.e();
                    break;
                }
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        boolean z13;
        switch (this.f65542a) {
            case 0:
                o0 o0Var = (o0) this.f65543b;
                o0Var.f65557e.c(this);
                if (o0Var.get() == 0 && o0Var.compareAndSet(0, 1)) {
                    z13 = o0Var.f65558f.decrementAndGet() == 0;
                    if (o0Var.f65556d.get() != 0) {
                        o0Var.f65553a.c(obj);
                        lk2.c cVar = (lk2.c) o0Var.f65561i.get();
                        if (z13 && (cVar == null || cVar.isEmpty())) {
                            pk2.c cVar2 = o0Var.f65559g;
                            cVar2.getClass();
                            Throwable b13 = pk2.h.b(cVar2);
                            if (b13 != null) {
                                o0Var.f65553a.onError(b13);
                                return;
                            } else {
                                o0Var.f65553a.a();
                                return;
                            }
                        }
                        d7.b.l0(o0Var.f65556d, 1L);
                        if (o0Var.f65555c != Integer.MAX_VALUE) {
                            o0Var.f65562j.request(1L);
                        }
                    } else {
                        lk2.c g13 = o0Var.g();
                        synchronized (g13) {
                            g13.offer(obj);
                        }
                    }
                    if (o0Var.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    lk2.c g14 = o0Var.g();
                    synchronized (g14) {
                        g14.offer(obj);
                    }
                    o0Var.f65558f.decrementAndGet();
                    if (o0Var.getAndIncrement() != 0) {
                        return;
                    }
                }
                o0Var.e();
                return;
            default:
                jk2.r0 r0Var = (jk2.r0) this.f65543b;
                r0Var.f76668d.c(this);
                if (r0Var.get() == 0 && r0Var.compareAndSet(0, 1)) {
                    r0Var.f76666b.c(obj);
                    z13 = r0Var.f76669e.decrementAndGet() == 0;
                    lk2.c cVar3 = (lk2.c) r0Var.f76672h.get();
                    if (z13 && (cVar3 == null || cVar3.isEmpty())) {
                        pk2.c cVar4 = r0Var.f76670f;
                        cVar4.getClass();
                        Throwable b14 = pk2.h.b(cVar4);
                        if (b14 != null) {
                            r0Var.f76666b.onError(b14);
                            return;
                        } else {
                            r0Var.f76666b.a();
                            return;
                        }
                    }
                    if (r0Var.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    lk2.c g15 = r0Var.g();
                    synchronized (g15) {
                        g15.offer(obj);
                    }
                    r0Var.f76669e.decrementAndGet();
                    if (r0Var.getAndIncrement() != 0) {
                        return;
                    }
                }
                r0Var.f();
                return;
        }
    }
}
