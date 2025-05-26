package sk2;

import g.i;
import lb.l0;
import pk2.l;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    public final a f113104b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f113105c;

    /* renamed from: d, reason: collision with root package name */
    public i f113106d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f113107e;

    public d(f fVar) {
        this.f113104b = fVar;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f113107e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f113107e) {
                    return;
                }
                this.f113107e = true;
                if (!this.f113105c) {
                    this.f113105c = true;
                    this.f113104b.a();
                    return;
                }
                i iVar = this.f113106d;
                if (iVar == null) {
                    iVar = new i();
                    this.f113106d = iVar;
                }
                iVar.h(l.complete());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f113107e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f113107e) {
                    return;
                }
                if (!this.f113105c) {
                    this.f113105c = true;
                    this.f113104b.c(obj);
                    o();
                } else {
                    i iVar = this.f113106d;
                    if (iVar == null) {
                        iVar = new i();
                        this.f113106d = iVar;
                    }
                    iVar.h(l.next(obj));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (!this.f113107e) {
            synchronized (this) {
                try {
                    boolean z13 = true;
                    if (!this.f113107e) {
                        if (this.f113105c) {
                            i iVar = this.f113106d;
                            if (iVar == null) {
                                iVar = new i();
                                this.f113106d = iVar;
                            }
                            iVar.h(l.subscription(cVar));
                            return;
                        }
                        this.f113105c = true;
                        z13 = false;
                    }
                    if (!z13) {
                        this.f113104b.d(cVar);
                        o();
                        return;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        cVar.cancel();
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        this.f113104b.b(bVar);
    }

    public final void o() {
        i iVar;
        while (true) {
            synchronized (this) {
                try {
                    iVar = this.f113106d;
                    if (iVar == null) {
                        this.f113105c = false;
                        return;
                    }
                    this.f113106d = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            iVar.g(this.f113104b);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f113107e) {
            l0.R0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z13 = true;
                if (!this.f113107e) {
                    this.f113107e = true;
                    if (this.f113105c) {
                        i iVar = this.f113106d;
                        if (iVar == null) {
                            iVar = new i();
                            this.f113106d = iVar;
                        }
                        iVar.H(l.error(th3));
                        return;
                    }
                    this.f113105c = true;
                    z13 = false;
                }
                if (z13) {
                    l0.R0(th3);
                } else {
                    this.f113104b.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
