package uk2;

import lb.l0;
import uj2.v;

/* loaded from: classes4.dex */
public final class m extends p implements pk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final p f122433a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122434b;

    /* renamed from: c, reason: collision with root package name */
    public g.i f122435c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f122436d;

    public m(f fVar) {
        this.f122433a = fVar;
    }

    @Override // uj2.q
    public final void G(v vVar) {
        this.f122433a.d(vVar);
    }

    @Override // uk2.p
    public final boolean Q() {
        return this.f122433a.Q();
    }

    public final void R() {
        g.i iVar;
        while (true) {
            synchronized (this) {
                try {
                    iVar = this.f122435c;
                    if (iVar == null) {
                        this.f122434b = false;
                        return;
                    }
                    this.f122435c = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            iVar.u(this);
        }
    }

    @Override // uj2.v
    public final void a() {
        if (this.f122436d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f122436d) {
                    return;
                }
                this.f122436d = true;
                if (!this.f122434b) {
                    this.f122434b = true;
                    this.f122433a.a();
                    return;
                }
                g.i iVar = this.f122435c;
                if (iVar == null) {
                    iVar = new g.i();
                    this.f122435c = iVar;
                }
                iVar.h(pk2.l.complete());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (!this.f122436d) {
            synchronized (this) {
                try {
                    boolean z13 = true;
                    if (!this.f122436d) {
                        if (this.f122434b) {
                            g.i iVar = this.f122435c;
                            if (iVar == null) {
                                iVar = new g.i();
                                this.f122435c = iVar;
                            }
                            iVar.h(pk2.l.disposable(cVar));
                            return;
                        }
                        this.f122434b = true;
                        z13 = false;
                    }
                    if (!z13) {
                        this.f122433a.b(cVar);
                        R();
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        cVar.dispose();
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f122436d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f122436d) {
                    return;
                }
                if (!this.f122434b) {
                    this.f122434b = true;
                    this.f122433a.c(obj);
                    R();
                } else {
                    g.i iVar = this.f122435c;
                    if (iVar == null) {
                        iVar = new g.i();
                        this.f122435c = iVar;
                    }
                    iVar.h(pk2.l.next(obj));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (this.f122436d) {
            l0.R0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z13 = true;
                if (!this.f122436d) {
                    this.f122436d = true;
                    if (this.f122434b) {
                        g.i iVar = this.f122435c;
                        if (iVar == null) {
                            iVar = new g.i();
                            this.f122435c = iVar;
                        }
                        iVar.H(pk2.l.error(th3));
                        return;
                    }
                    this.f122434b = true;
                    z13 = false;
                }
                if (z13) {
                    l0.R0(th3);
                } else {
                    this.f122433a.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // ak2.g
    public final boolean test(Object obj) {
        return pk2.l.acceptFull(obj, this.f122433a);
    }
}
