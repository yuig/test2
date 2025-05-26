package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class yd extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44011a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44012b;

    public yd(nm.o oVar) {
        this.f44011a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xd xdVar = new xd(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f44012b == null) {
                    this.f44012b = a.cb.q(this.f44011a, String.class);
                }
                xdVar.f43653a = (String) this.f44012b.c(aVar);
                boolean[] zArr = xdVar.f43654b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ae(xdVar.f43653a, xdVar.f43654b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        ae aeVar = (ae) obj;
        if (aeVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = aeVar.f35709b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f44012b == null) {
                this.f44012b = a.cb.q(this.f44011a, String.class);
            }
            nm.m mVar = this.f44012b;
            um.c h10 = cVar.h("data");
            str = aeVar.f35708a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
