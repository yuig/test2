package rr0;

import pk.a0;
import yq0.t;

/* loaded from: classes.dex */
public final class c extends rk2.b {

    /* renamed from: b, reason: collision with root package name */
    public final nr0.h f109879b;

    /* renamed from: c, reason: collision with root package name */
    public final ky.e f109880c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f109881d;

    public c(nr0.h hVar, ky.e eVar, boolean z13) {
        this.f109879b = hVar;
        this.f109880c = eVar;
        this.f109881d = z13;
    }

    @Override // uj2.v
    public final void a() {
        if (this.f109881d) {
            e(true);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        qr0.d dVar = (qr0.d) obj;
        if (!dVar.d().isEmpty() || a0.x0(dVar.r())) {
            e(true);
        }
    }

    @Override // rk2.b
    public final void d() {
        ky.e eVar = this.f109880c;
        if (eVar != null) {
            eVar.a();
        }
        boolean z13 = this.f109881d;
        uk1.c cVar = this.f109879b;
        if (z13) {
            if (eVar != null) {
                eVar.b(false);
            }
            ((sq0.e) cVar).N8(true);
        }
        ((t) cVar).setLoadState(yk1.i.LOADING);
    }

    public final void e(boolean z13) {
        uk1.c cVar = this.f109879b;
        ((sq0.e) cVar).N8(false);
        ((t) cVar).setLoadState(z13 ? yk1.i.LOADED : yk1.i.ERROR);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        e(false);
        ((t) this.f109879b).resetRecyclerScrollListener();
    }
}
