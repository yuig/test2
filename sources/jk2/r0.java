package jk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class r0 extends AtomicInteger implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76665a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.v f76666b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f76667c;

    /* renamed from: d, reason: collision with root package name */
    public final xj2.b f76668d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f76669e;

    /* renamed from: f, reason: collision with root package name */
    public final pk2.c f76670f;

    /* renamed from: g, reason: collision with root package name */
    public final ak2.f f76671g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f76672h;

    /* renamed from: i, reason: collision with root package name */
    public xj2.c f76673i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f76674j;

    public r0(int i13, uj2.v vVar, ak2.f fVar, boolean z13) {
        this.f76665a = i13;
        if (i13 != 1) {
            this.f76666b = vVar;
            this.f76671g = fVar;
            this.f76667c = z13;
            this.f76668d = new xj2.b();
            this.f76670f = new pk2.c();
            this.f76669e = new AtomicInteger(1);
            this.f76672h = new AtomicReference();
            return;
        }
        this.f76666b = vVar;
        this.f76671g = fVar;
        this.f76667c = z13;
        this.f76668d = new xj2.b();
        this.f76670f = new pk2.c();
        this.f76669e = new AtomicInteger(1);
        this.f76672h = new AtomicReference();
    }

    @Override // uj2.v
    public final void a() {
        AtomicInteger atomicInteger = this.f76669e;
        switch (this.f76665a) {
            case 0:
                atomicInteger.decrementAndGet();
                e();
                break;
            default:
                atomicInteger.decrementAndGet();
                e();
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76665a;
        uj2.v vVar = this.f76666b;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76673i, cVar)) {
                    this.f76673i = cVar;
                    vVar.b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f76673i, cVar)) {
                    this.f76673i = cVar;
                    vVar.b(this);
                    break;
                }
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        switch (this.f76665a) {
            case 0:
                try {
                    Object apply = this.f76671g.apply(obj);
                    ck2.i.b(apply, "The mapper returned a null MaybeSource");
                    uj2.n nVar = (uj2.n) apply;
                    this.f76669e.getAndIncrement();
                    gk2.n0 n0Var = new gk2.n0(this, 1);
                    if (!this.f76674j && this.f76668d.a(n0Var)) {
                        ((uj2.l) nVar).f(n0Var);
                        break;
                    }
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    this.f76673i.dispose();
                    onError(th3);
                }
                break;
            default:
                try {
                    Object apply2 = this.f76671g.apply(obj);
                    ck2.i.b(apply2, "The mapper returned a null SingleSource");
                    uj2.f0 f0Var = (uj2.f0) apply2;
                    this.f76669e.getAndIncrement();
                    s0 s0Var = new s0(this);
                    if (!this.f76674j && this.f76668d.a(s0Var)) {
                        ((uj2.b0) f0Var).p(s0Var);
                        break;
                    }
                } catch (Throwable th4) {
                    bp1.h.H(th4);
                    this.f76673i.dispose();
                    onError(th4);
                    return;
                }
                break;
        }
    }

    public final void d() {
        AtomicReference atomicReference = this.f76672h;
        switch (this.f76665a) {
            case 0:
                lk2.c cVar = (lk2.c) atomicReference.get();
                if (cVar != null) {
                    cVar.clear();
                    break;
                }
                break;
            default:
                lk2.c cVar2 = (lk2.c) atomicReference.get();
                if (cVar2 != null) {
                    cVar2.clear();
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76665a) {
            case 0:
                this.f76674j = true;
                this.f76673i.dispose();
                this.f76668d.dispose();
                break;
            default:
                this.f76674j = true;
                this.f76673i.dispose();
                this.f76668d.dispose();
                break;
        }
    }

    public final void e() {
        switch (this.f76665a) {
            case 0:
                if (getAndIncrement() == 0) {
                    f();
                    break;
                }
                break;
            default:
                if (getAndIncrement() == 0) {
                    f();
                    break;
                }
                break;
        }
    }

    public final void f() {
        switch (this.f76665a) {
            case 0:
                uj2.v vVar = this.f76666b;
                AtomicInteger atomicInteger = this.f76669e;
                AtomicReference atomicReference = this.f76672h;
                int i13 = 1;
                while (!this.f76674j) {
                    if (!this.f76667c && ((Throwable) this.f76670f.get()) != null) {
                        pk2.c cVar = this.f76670f;
                        cVar.getClass();
                        Throwable b13 = pk2.h.b(cVar);
                        d();
                        vVar.onError(b13);
                        break;
                    } else {
                        boolean z13 = atomicInteger.get() == 0;
                        lk2.c cVar2 = (lk2.c) atomicReference.get();
                        Object poll = cVar2 != null ? cVar2.poll() : null;
                        boolean z14 = poll == null;
                        if (z13 && z14) {
                            pk2.c cVar3 = this.f76670f;
                            cVar3.getClass();
                            Throwable b14 = pk2.h.b(cVar3);
                            if (b14 == null) {
                                vVar.a();
                                break;
                            } else {
                                vVar.onError(b14);
                                break;
                            }
                        } else if (z14) {
                            i13 = addAndGet(-i13);
                            if (i13 == 0) {
                                break;
                            }
                        } else {
                            vVar.c(poll);
                        }
                    }
                }
                d();
                break;
            default:
                uj2.v vVar2 = this.f76666b;
                AtomicInteger atomicInteger2 = this.f76669e;
                AtomicReference atomicReference2 = this.f76672h;
                int i14 = 1;
                while (!this.f76674j) {
                    if (!this.f76667c && ((Throwable) this.f76670f.get()) != null) {
                        pk2.c cVar4 = this.f76670f;
                        cVar4.getClass();
                        Throwable b15 = pk2.h.b(cVar4);
                        d();
                        vVar2.onError(b15);
                        break;
                    } else {
                        boolean z15 = atomicInteger2.get() == 0;
                        lk2.c cVar5 = (lk2.c) atomicReference2.get();
                        Object poll2 = cVar5 != null ? cVar5.poll() : null;
                        boolean z16 = poll2 == null;
                        if (z15 && z16) {
                            pk2.c cVar6 = this.f76670f;
                            cVar6.getClass();
                            Throwable b16 = pk2.h.b(cVar6);
                            if (b16 == null) {
                                vVar2.a();
                                break;
                            } else {
                                vVar2.onError(b16);
                                break;
                            }
                        } else if (z16) {
                            i14 = addAndGet(-i14);
                            if (i14 == 0) {
                                break;
                            }
                        } else {
                            vVar2.c(poll2);
                        }
                    }
                }
                d();
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final lk2.c g() {
        lk2.c cVar;
        lk2.c cVar2;
        AtomicReference atomicReference = this.f76672h;
        switch (this.f76665a) {
            case 0:
                while (true) {
                    cVar = (lk2.c) atomicReference.get();
                    if (cVar == null) {
                        cVar = new lk2.c(uj2.h.f122339a);
                        while (!atomicReference.compareAndSet(null, cVar)) {
                            if (atomicReference.get() != null) {
                                break;
                            }
                        }
                    }
                }
                return cVar;
            default:
                while (true) {
                    cVar2 = (lk2.c) atomicReference.get();
                    if (cVar2 == null) {
                        cVar2 = new lk2.c(uj2.h.f122339a);
                        while (!atomicReference.compareAndSet(null, cVar2)) {
                            if (atomicReference.get() != null) {
                                break;
                            }
                        }
                    }
                }
                return cVar2;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76665a) {
        }
        return this.f76674j;
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        AtomicInteger atomicInteger = this.f76669e;
        int i13 = this.f76665a;
        xj2.b bVar = this.f76668d;
        boolean z13 = this.f76667c;
        pk2.c cVar = this.f76670f;
        switch (i13) {
            case 0:
                atomicInteger.decrementAndGet();
                cVar.getClass();
                if (!pk2.h.a(cVar, th3)) {
                    lb.l0.R0(th3);
                    break;
                } else {
                    if (!z13) {
                        bVar.dispose();
                    }
                    e();
                    break;
                }
            default:
                atomicInteger.decrementAndGet();
                cVar.getClass();
                if (!pk2.h.a(cVar, th3)) {
                    lb.l0.R0(th3);
                    break;
                } else {
                    if (!z13) {
                        bVar.dispose();
                    }
                    e();
                    break;
                }
        }
    }
}
