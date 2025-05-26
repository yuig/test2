package uk2;

import uj2.v;

/* loaded from: classes2.dex */
public final class c implements xj2.c, pk2.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f122391a;

    /* renamed from: b, reason: collision with root package name */
    public final d f122392b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122394d;

    /* renamed from: e, reason: collision with root package name */
    public g.i f122395e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f122396f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f122397g;

    /* renamed from: h, reason: collision with root package name */
    public long f122398h;

    public c(v vVar, d dVar) {
        this.f122391a = vVar;
        this.f122392b = dVar;
    }

    public final void a(long j13, Object obj) {
        if (this.f122397g) {
            return;
        }
        if (!this.f122396f) {
            synchronized (this) {
                try {
                    if (this.f122397g) {
                        return;
                    }
                    if (this.f122398h == j13) {
                        return;
                    }
                    if (this.f122394d) {
                        g.i iVar = this.f122395e;
                        if (iVar == null) {
                            iVar = new g.i();
                            this.f122395e = iVar;
                        }
                        iVar.h(obj);
                        return;
                    }
                    this.f122393c = true;
                    this.f122396f = true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        test(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        if (this.f122397g) {
            return;
        }
        this.f122397g = true;
        this.f122392b.T(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f122397g;
    }

    @Override // ak2.g
    public final boolean test(Object obj) {
        return this.f122397g || pk2.l.accept(obj, this.f122391a);
    }
}
