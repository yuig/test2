package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class s extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41735a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41736b;

    public s(nm.o oVar) {
        this.f41735a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u uVar = new u(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "api_key")) {
                if (this.f41736b == null) {
                    this.f41736b = a.cb.q(this.f41735a, String.class);
                }
                uVar.f42370a = (String) this.f41736b.c(aVar);
                boolean[] zArr = uVar.f42371b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new v(uVar.f42370a, uVar.f42371b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        v vVar = (v) obj;
        if (vVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vVar.f42692b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f41736b == null) {
                this.f41736b = a.cb.q(this.f41735a, String.class);
            }
            nm.m mVar = this.f41736b;
            um.c h10 = cVar.h("api_key");
            str = vVar.f42691a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
