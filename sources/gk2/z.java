package gk2;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes4.dex */
public final class z extends nk2.a {

    /* renamed from: f, reason: collision with root package name */
    public final ak2.e f65707f;

    /* renamed from: g, reason: collision with root package name */
    public final ak2.e f65708g;

    /* renamed from: h, reason: collision with root package name */
    public final ak2.a f65709h;

    /* renamed from: i, reason: collision with root package name */
    public final ak2.a f65710i;

    public z(dk2.a aVar, ak2.e eVar, ak2.e eVar2, ak2.a aVar2, ak2.a aVar3) {
        super(aVar);
        this.f65707f = eVar;
        this.f65708g = eVar2;
        this.f65709h = aVar2;
        this.f65710i = aVar3;
    }

    @Override // nk2.a, xp2.b
    public final void a() {
        if (this.f91184d) {
            return;
        }
        try {
            this.f65709h.run();
            this.f91184d = true;
            this.f91181a.a();
            try {
                this.f65710i.run();
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
        if (this.f91184d) {
            return;
        }
        int i13 = this.f91185e;
        dk2.a aVar = this.f91181a;
        if (i13 != 0) {
            aVar.c(null);
            return;
        }
        try {
            this.f65707f.accept(obj);
            aVar.c(obj);
        } catch (Throwable th3) {
            b(th3);
        }
    }

    @Override // dk2.a
    public final boolean f(Object obj) {
        if (this.f91184d) {
            return false;
        }
        try {
            this.f65707f.accept(obj);
            return this.f91181a.f(obj);
        } catch (Throwable th3) {
            b(th3);
            return false;
        }
    }

    @Override // nk2.a, xp2.b
    public final void onError(Throwable th3) {
        dk2.a aVar = this.f91181a;
        if (this.f91184d) {
            lb.l0.R0(th3);
            return;
        }
        this.f91184d = true;
        try {
            this.f65708g.accept(th3);
            aVar.onError(th3);
        } catch (Throwable th4) {
            bp1.h.H(th4);
            aVar.onError(new CompositeException(th3, th4));
        }
        try {
            this.f65710i.run();
        } catch (Throwable th5) {
            bp1.h.H(th5);
            lb.l0.R0(th5);
        }
    }

    @Override // dk2.i
    public final Object poll() {
        CompositeException compositeException;
        ak2.e eVar = this.f65708g;
        try {
            Object poll = this.f91183c.poll();
            ak2.a aVar = this.f65710i;
            if (poll != null) {
                try {
                    this.f65707f.accept(poll);
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
            } else if (this.f91185e == 1) {
                this.f65709h.run();
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
