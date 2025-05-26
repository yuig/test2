package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class nj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40425a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40426b;

    public nj0(nm.o oVar) {
        this.f40425a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mj0 mj0Var = new mj0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("height");
            nm.o oVar = this.f40425a;
            if (equals) {
                if (this.f40426b == null) {
                    this.f40426b = a.cb.q(oVar, Double.class);
                }
                mj0Var.f40139a = (Double) this.f40426b.c(aVar);
                boolean[] zArr = mj0Var.f40141c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("width")) {
                if (this.f40426b == null) {
                    this.f40426b = a.cb.q(oVar, Double.class);
                }
                mj0Var.f40140b = (Double) this.f40426b.c(aVar);
                boolean[] zArr2 = mj0Var.f40141c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new pj0(mj0Var.f40139a, mj0Var.f40140b, mj0Var.f40141c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        pj0 pj0Var = (pj0) obj;
        if (pj0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pj0Var.f41013c;
        int length = zArr.length;
        nm.o oVar = this.f40425a;
        if (length > 0 && zArr[0]) {
            if (this.f40426b == null) {
                this.f40426b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f40426b;
            um.c h10 = cVar.h("height");
            d13 = pj0Var.f41011a;
            mVar.e(h10, d13);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40426b == null) {
                this.f40426b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f40426b;
            um.c h13 = cVar.h("width");
            d2 = pj0Var.f41012b;
            mVar2.e(h13, d2);
        }
        cVar.g();
    }
}
