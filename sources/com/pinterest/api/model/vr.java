package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class vr extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42958a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42959b;

    public vr(nm.o oVar) {
        this.f42958a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ur urVar = new ur(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f42959b == null) {
                    this.f42959b = a.cb.q(this.f42958a, fs.class);
                }
                urVar.f42625a = (fs) this.f42959b.c(aVar);
                boolean[] zArr = urVar.f42626b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new xr(urVar.f42625a, urVar.f42626b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        fs fsVar;
        xr xrVar = (xr) obj;
        if (xrVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xrVar.f43773b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f42959b == null) {
                this.f42959b = a.cb.q(this.f42958a, fs.class);
            }
            nm.m mVar = this.f42959b;
            um.c h10 = cVar.h("data");
            fsVar = xrVar.f43772a;
            mVar.e(h10, fsVar);
        }
        cVar.g();
    }
}
