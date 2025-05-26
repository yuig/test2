package gk2;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: m, reason: collision with root package name */
    public final xp2.b f65368m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f65369n;

    public d(int i13, ak2.f fVar, xp2.b bVar, boolean z13) {
        super(fVar, i13);
        this.f65368m = bVar;
        this.f65369n = z13;
    }

    @Override // gk2.g
    public final void b(Throwable th3) {
        pk2.c cVar = this.f65350j;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        if (!this.f65369n) {
            this.f65345e.cancel();
            this.f65348h = true;
        }
        this.f65351k = false;
        g();
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f65349i) {
            return;
        }
        this.f65349i = true;
        this.f65341a.cancel();
        this.f65345e.cancel();
    }

    @Override // gk2.g
    public final void e(Object obj) {
        this.f65368m.c(obj);
    }

    @Override // gk2.c
    public final void g() {
        Object obj;
        if (getAndIncrement() == 0) {
            while (!this.f65349i) {
                if (!this.f65351k) {
                    boolean z13 = this.f65348h;
                    if (z13 && !this.f65369n && ((Throwable) this.f65350j.get()) != null) {
                        xp2.b bVar = this.f65368m;
                        pk2.c cVar = this.f65350j;
                        cVar.getClass();
                        bVar.onError(pk2.h.b(cVar));
                        return;
                    }
                    try {
                        Object poll = this.f65347g.poll();
                        boolean z14 = poll == null;
                        if (z13 && z14) {
                            pk2.c cVar2 = this.f65350j;
                            cVar2.getClass();
                            Throwable b13 = pk2.h.b(cVar2);
                            if (b13 != null) {
                                this.f65368m.onError(b13);
                                return;
                            } else {
                                this.f65368m.a();
                                return;
                            }
                        }
                        if (!z14) {
                            try {
                                Object apply = this.f65342b.apply(poll);
                                ck2.i.b(apply, "The mapper returned a null Publisher");
                                xp2.a aVar = (xp2.a) apply;
                                if (this.f65352l != 1) {
                                    int i13 = this.f65346f + 1;
                                    if (i13 == this.f65344d) {
                                        this.f65346f = 0;
                                        this.f65345e.request(i13);
                                    } else {
                                        this.f65346f = i13;
                                    }
                                }
                                if (aVar instanceof Callable) {
                                    try {
                                        obj = ((Callable) aVar).call();
                                    } catch (Throwable th3) {
                                        bp1.h.H(th3);
                                        pk2.c cVar3 = this.f65350j;
                                        cVar3.getClass();
                                        pk2.h.a(cVar3, th3);
                                        if (!this.f65369n) {
                                            this.f65345e.cancel();
                                            xp2.b bVar2 = this.f65368m;
                                            pk2.c cVar4 = this.f65350j;
                                            cVar4.getClass();
                                            bVar2.onError(pk2.h.b(cVar4));
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj == null) {
                                        continue;
                                    } else if (this.f65341a.f95479h) {
                                        this.f65368m.c(obj);
                                    } else {
                                        this.f65351k = true;
                                        this.f65341a.h(new h(obj, this.f65341a));
                                    }
                                } else {
                                    this.f65351k = true;
                                    aVar.b(this.f65341a);
                                }
                            } catch (Throwable th4) {
                                bp1.h.H(th4);
                                this.f65345e.cancel();
                                pk2.c cVar5 = this.f65350j;
                                cVar5.getClass();
                                pk2.h.a(cVar5, th4);
                                xp2.b bVar3 = this.f65368m;
                                pk2.c cVar6 = this.f65350j;
                                cVar6.getClass();
                                bVar3.onError(pk2.h.b(cVar6));
                                return;
                            }
                        }
                    } catch (Throwable th5) {
                        bp1.h.H(th5);
                        this.f65345e.cancel();
                        pk2.c cVar7 = this.f65350j;
                        cVar7.getClass();
                        pk2.h.a(cVar7, th5);
                        xp2.b bVar4 = this.f65368m;
                        pk2.c cVar8 = this.f65350j;
                        cVar8.getClass();
                        bVar4.onError(pk2.h.b(cVar8));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // gk2.c
    public final void h() {
        this.f65368m.d(this);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f65350j;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
        } else {
            this.f65348h = true;
            g();
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65341a.request(j13);
    }
}
