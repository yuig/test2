package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class t2 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final s2 f65636l;

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65637a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.f f65638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65639c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65640d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f65641e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f65643g;

    /* renamed from: h, reason: collision with root package name */
    public xp2.c f65644h;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f65647k;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f65645i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public final AtomicLong f65646j = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final pk2.c f65642f = new pk2.c();

    static {
        s2 s2Var = new s2(null, -1L, 1);
        f65636l = s2Var;
        ok2.g.cancel(s2Var);
    }

    public t2(int i13, ak2.f fVar, xp2.b bVar, boolean z13) {
        this.f65637a = bVar;
        this.f65638b = fVar;
        this.f65639c = i13;
        this.f65640d = z13;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65641e) {
            return;
        }
        this.f65641e = true;
        e();
    }

    public final void b() {
        s2 s2Var;
        AtomicReference atomicReference = this.f65645i;
        s2 s2Var2 = (s2) atomicReference.get();
        s2 s2Var3 = f65636l;
        if (s2Var2 == s2Var3 || (s2Var = (s2) atomicReference.getAndSet(s2Var3)) == s2Var3 || s2Var == null) {
            return;
        }
        ok2.g.cancel(s2Var);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65641e) {
            return;
        }
        long j13 = this.f65647k + 1;
        this.f65647k = j13;
        s2 s2Var = (s2) this.f65645i.get();
        if (s2Var != null) {
            ok2.g.cancel(s2Var);
        }
        try {
            Object apply = this.f65638b.apply(obj);
            ck2.i.b(apply, "The publisher returned is null");
            xp2.a aVar = (xp2.a) apply;
            s2 s2Var2 = new s2(this, j13, this.f65639c);
            while (true) {
                s2 s2Var3 = (s2) this.f65645i.get();
                if (s2Var3 == f65636l) {
                    return;
                }
                AtomicReference atomicReference = this.f65645i;
                while (!atomicReference.compareAndSet(s2Var3, s2Var2)) {
                    if (atomicReference.get() != s2Var3) {
                        break;
                    }
                }
                aVar.b(s2Var2);
                return;
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            this.f65644h.cancel();
            onError(th3);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65643g) {
            return;
        }
        this.f65643g = true;
        this.f65644h.cancel();
        b();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65644h, cVar)) {
            this.f65644h = cVar;
            this.f65637a.d(this);
        }
    }

    public final void e() {
        boolean z13;
        Object obj;
        if (getAndIncrement() != 0) {
            return;
        }
        xp2.b bVar = this.f65637a;
        int i13 = 1;
        while (!this.f65643g) {
            if (this.f65641e) {
                if (this.f65640d) {
                    if (this.f65645i.get() == null) {
                        if (((Throwable) this.f65642f.get()) == null) {
                            bVar.a();
                            return;
                        }
                        pk2.c cVar = this.f65642f;
                        cVar.getClass();
                        bVar.onError(pk2.h.b(cVar));
                        return;
                    }
                } else {
                    if (((Throwable) this.f65642f.get()) != null) {
                        b();
                        pk2.c cVar2 = this.f65642f;
                        cVar2.getClass();
                        bVar.onError(pk2.h.b(cVar2));
                        return;
                    }
                    if (this.f65645i.get() == null) {
                        bVar.a();
                        return;
                    }
                }
            }
            s2 s2Var = (s2) this.f65645i.get();
            dk2.i iVar = s2Var != null ? s2Var.f65620d : null;
            if (iVar != null) {
                if (s2Var.f65621e) {
                    if (this.f65640d) {
                        if (iVar.isEmpty()) {
                            AtomicReference atomicReference = this.f65645i;
                            while (!atomicReference.compareAndSet(s2Var, null) && atomicReference.get() == s2Var) {
                            }
                        }
                    } else {
                        if (((Throwable) this.f65642f.get()) != null) {
                            b();
                            pk2.c cVar3 = this.f65642f;
                            cVar3.getClass();
                            bVar.onError(pk2.h.b(cVar3));
                            return;
                        }
                        if (iVar.isEmpty()) {
                            AtomicReference atomicReference2 = this.f65645i;
                            while (!atomicReference2.compareAndSet(s2Var, null) && atomicReference2.get() == s2Var) {
                            }
                        }
                    }
                }
                long j13 = this.f65646j.get();
                long j14 = 0;
                while (j14 != j13) {
                    if (!this.f65643g) {
                        boolean z14 = s2Var.f65621e;
                        try {
                            obj = iVar.poll();
                        } catch (Throwable th3) {
                            bp1.h.H(th3);
                            ok2.g.cancel(s2Var);
                            pk2.c cVar4 = this.f65642f;
                            cVar4.getClass();
                            pk2.h.a(cVar4, th3);
                            z14 = true;
                            obj = null;
                        }
                        boolean z15 = obj == null;
                        if (s2Var == this.f65645i.get()) {
                            if (z14) {
                                if (this.f65640d) {
                                    if (z15) {
                                        AtomicReference atomicReference3 = this.f65645i;
                                        while (!atomicReference3.compareAndSet(s2Var, null) && atomicReference3.get() == s2Var) {
                                        }
                                    }
                                } else if (((Throwable) this.f65642f.get()) != null) {
                                    pk2.c cVar5 = this.f65642f;
                                    cVar5.getClass();
                                    bVar.onError(pk2.h.b(cVar5));
                                    return;
                                } else if (z15) {
                                    AtomicReference atomicReference4 = this.f65645i;
                                    while (!atomicReference4.compareAndSet(s2Var, null) && atomicReference4.get() == s2Var) {
                                    }
                                }
                            }
                            if (z15) {
                                break;
                            }
                            bVar.c(obj);
                            j14++;
                        }
                        z13 = true;
                        break;
                    }
                    return;
                }
                z13 = false;
                if (j14 != 0 && !this.f65643g) {
                    if (j13 != Long.MAX_VALUE) {
                        this.f65646j.addAndGet(-j14);
                    }
                    if (s2Var.f65622f != 1) {
                        ((xp2.c) s2Var.get()).request(j14);
                    }
                }
                if (z13) {
                    continue;
                }
            }
            i13 = addAndGet(-i13);
            if (i13 == 0) {
                return;
            }
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (!this.f65641e) {
            pk2.c cVar = this.f65642f;
            cVar.getClass();
            if (pk2.h.a(cVar, th3)) {
                if (!this.f65640d) {
                    b();
                }
                this.f65641e = true;
                e();
                return;
            }
        }
        lb.l0.R0(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this.f65646j, j13);
            if (this.f65647k == 0) {
                this.f65644h.request(Long.MAX_VALUE);
            } else {
                e();
            }
        }
    }
}
