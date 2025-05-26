package vk2;

import g.i;
import lb.l0;
import ok2.g;
import pk2.l;
import uj2.k;
import xp2.b;
import xp2.c;

/* loaded from: classes2.dex */
public final class a implements k, c {

    /* renamed from: a, reason: collision with root package name */
    public final b f126097a;

    /* renamed from: b, reason: collision with root package name */
    public c f126098b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f126099c;

    /* renamed from: d, reason: collision with root package name */
    public i f126100d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f126101e;

    public a(b bVar) {
        this.f126097a = bVar;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f126101e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f126101e) {
                    return;
                }
                if (!this.f126099c) {
                    this.f126101e = true;
                    this.f126099c = true;
                    this.f126097a.a();
                } else {
                    i iVar = this.f126100d;
                    if (iVar == null) {
                        iVar = new i();
                        this.f126100d = iVar;
                    }
                    iVar.h(l.complete());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        i iVar;
        if (this.f126101e) {
            return;
        }
        if (obj == null) {
            this.f126098b.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f126101e) {
                    return;
                }
                if (this.f126099c) {
                    i iVar2 = this.f126100d;
                    if (iVar2 == null) {
                        iVar2 = new i();
                        this.f126100d = iVar2;
                    }
                    iVar2.h(l.next(obj));
                    return;
                }
                this.f126099c = true;
                this.f126097a.c(obj);
                do {
                    synchronized (this) {
                        try {
                            iVar = this.f126100d;
                            if (iVar == null) {
                                this.f126099c = false;
                                return;
                            }
                            this.f126100d = null;
                        } finally {
                        }
                    }
                } while (!iVar.g(this.f126097a));
            } finally {
            }
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f126098b.cancel();
    }

    @Override // xp2.b
    public final void d(c cVar) {
        if (g.validate(this.f126098b, cVar)) {
            this.f126098b = cVar;
            this.f126097a.d(this);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f126101e) {
            l0.R0(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z13 = true;
                if (!this.f126101e) {
                    if (this.f126099c) {
                        this.f126101e = true;
                        i iVar = this.f126100d;
                        if (iVar == null) {
                            iVar = new i();
                            this.f126100d = iVar;
                        }
                        iVar.H(l.error(th3));
                        return;
                    }
                    this.f126101e = true;
                    this.f126099c = true;
                    z13 = false;
                }
                if (z13) {
                    l0.R0(th3);
                } else {
                    this.f126097a.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f126098b.request(j13);
    }
}
