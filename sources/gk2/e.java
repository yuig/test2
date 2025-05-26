package gk2;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class e extends c {

    /* renamed from: m, reason: collision with root package name */
    public final xp2.b f65381m;

    /* renamed from: n, reason: collision with root package name */
    public final AtomicInteger f65382n;

    public e(xp2.b bVar, ak2.f fVar, int i13) {
        super(fVar, i13);
        this.f65381m = bVar;
        this.f65382n = new AtomicInteger();
    }

    @Override // gk2.g
    public final void b(Throwable th3) {
        pk2.c cVar = this.f65350j;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        this.f65345e.cancel();
        if (getAndIncrement() == 0) {
            cVar.getClass();
            this.f65381m.onError(pk2.h.b(cVar));
        }
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
        if (get() == 0 && compareAndSet(0, 1)) {
            xp2.b bVar = this.f65381m;
            bVar.c(obj);
            if (compareAndSet(1, 0)) {
                return;
            }
            pk2.c cVar = this.f65350j;
            cVar.getClass();
            bVar.onError(pk2.h.b(cVar));
        }
    }

    @Override // gk2.c
    public final void g() {
        if (this.f65382n.getAndIncrement() == 0) {
            while (!this.f65349i) {
                if (!this.f65351k) {
                    boolean z13 = this.f65348h;
                    try {
                        Object poll = this.f65347g.poll();
                        boolean z14 = poll == null;
                        if (z13 && z14) {
                            this.f65381m.a();
                            return;
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
                                        Object call = ((Callable) aVar).call();
                                        if (call == null) {
                                            continue;
                                        } else if (!this.f65341a.f95479h) {
                                            this.f65351k = true;
                                            this.f65341a.h(new h(call, this.f65341a));
                                        } else if (get() == 0 && compareAndSet(0, 1)) {
                                            this.f65381m.c(call);
                                            if (!compareAndSet(1, 0)) {
                                                xp2.b bVar = this.f65381m;
                                                pk2.c cVar = this.f65350j;
                                                cVar.getClass();
                                                bVar.onError(pk2.h.b(cVar));
                                                return;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        bp1.h.H(th3);
                                        this.f65345e.cancel();
                                        pk2.c cVar2 = this.f65350j;
                                        cVar2.getClass();
                                        pk2.h.a(cVar2, th3);
                                        xp2.b bVar2 = this.f65381m;
                                        pk2.c cVar3 = this.f65350j;
                                        cVar3.getClass();
                                        bVar2.onError(pk2.h.b(cVar3));
                                        return;
                                    }
                                } else {
                                    this.f65351k = true;
                                    aVar.b(this.f65341a);
                                }
                            } catch (Throwable th4) {
                                bp1.h.H(th4);
                                this.f65345e.cancel();
                                pk2.c cVar4 = this.f65350j;
                                cVar4.getClass();
                                pk2.h.a(cVar4, th4);
                                xp2.b bVar3 = this.f65381m;
                                pk2.c cVar5 = this.f65350j;
                                cVar5.getClass();
                                bVar3.onError(pk2.h.b(cVar5));
                                return;
                            }
                        }
                    } catch (Throwable th5) {
                        bp1.h.H(th5);
                        this.f65345e.cancel();
                        pk2.c cVar6 = this.f65350j;
                        cVar6.getClass();
                        pk2.h.a(cVar6, th5);
                        xp2.b bVar4 = this.f65381m;
                        pk2.c cVar7 = this.f65350j;
                        cVar7.getClass();
                        bVar4.onError(pk2.h.b(cVar7));
                        return;
                    }
                }
                if (this.f65382n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // gk2.c
    public final void h() {
        this.f65381m.d(this);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f65350j;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        this.f65341a.cancel();
        if (getAndIncrement() == 0) {
            cVar.getClass();
            this.f65381m.onError(pk2.h.b(cVar));
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65341a.request(j13);
    }
}
