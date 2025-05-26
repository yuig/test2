package gk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes2.dex */
public final class a0 extends nk2.b {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.e f65322f;

    /* renamed from: g, reason: collision with root package name */
    public final ak2.e f65323g;

    /* renamed from: h, reason: collision with root package name */
    public final ak2.a f65324h;

    /* renamed from: i, reason: collision with root package name */
    public final ak2.a f65325i;

    public a0(xp2.b bVar, ak2.e eVar, ak2.e eVar2, ak2.a aVar, ak2.a aVar2) {
        super(bVar);
        this.f65322f = eVar;
        this.f65323g = eVar2;
        this.f65324h = aVar;
        this.f65325i = aVar2;
    }

    @Override // nk2.b, xp2.b
    public final void a() {
        if (this.f91189d) {
            return;
        }
        try {
            this.f65324h.run();
            this.f91189d = true;
            this.f91186a.a();
            try {
                this.f65325i.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                lb.l0.R0(th3);
            }
        } catch (Throwable th4) {
            b(th4);
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f91189d) {
            return;
        }
        int i13 = this.f91190e;
        xp2.b bVar = this.f91186a;
        if (i13 != 0) {
            bVar.c(null);
            return;
        }
        try {
            this.f65322f.accept(obj);
            bVar.c(obj);
        } catch (Throwable th3) {
            b(th3);
        }
    }

    @Override // nk2.b, xp2.b
    public final void onError(Throwable th3) {
        xp2.b bVar = this.f91186a;
        if (this.f91189d) {
            lb.l0.R0(th3);
            return;
        }
        this.f91189d = true;
        try {
            this.f65323g.accept(th3);
            bVar.onError(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            bVar.onError(new CompositeException(th3, th4));
        }
        try {
            this.f65325i.run();
        } catch (Throwable th5) {
            bp1.h.H(th5);
            lb.l0.R0(th5);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        CompositeException compositeException;
        ak2.e eVar = this.f65323g;
        try {
            Object poll = this.f91188c.poll();
            ak2.a aVar = this.f65325i;
            if (poll != null) {
                try {
                    this.f65322f.accept(poll);
                    aVar.run();
                } catch (Throwable th3) {
                    try {
                        bp1.h.H(th3);
                        try {
                            eVar.accept(th3);
                            pk2.g gVar = pk2.h.f100547a;
                            if (th3 instanceof Exception) {
                                throw th3;
                            }
                            throw th3;
                        } finally {
                        }
                    } catch (Throwable th4) {
                        aVar.run();
                        throw th4;
                    }
                }
            } else if (this.f91190e == 1) {
                this.f65324h.run();
                aVar.run();
            }
            return poll;
        } catch (Throwable th32) {
            bp1.h.H(th32);
            try {
                eVar.accept(th32);
                pk2.g gVar2 = pk2.h.f100547a;
                if (th32 instanceof Exception) {
                    throw th32;
                }
                throw th32;
            } finally {
            }
        }
    }
}
