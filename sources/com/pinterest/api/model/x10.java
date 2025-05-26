package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class x10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43538a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43539b;

    public x10(nm.o oVar) {
        this.f43538a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        w10 w10Var = new w10(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "checkout_url")) {
                if (this.f43539b == null) {
                    this.f43539b = a.cb.q(this.f43538a, String.class);
                }
                w10Var.f43137a = (String) this.f43539b.c(aVar);
                boolean[] zArr = w10Var.f43138b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new z10(w10Var.f43137a, w10Var.f43138b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        z10 z10Var = (z10) obj;
        if (z10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z10Var.f44176b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f43539b == null) {
                this.f43539b = a.cb.q(this.f43538a, String.class);
            }
            nm.m mVar = this.f43539b;
            um.c h10 = cVar.h("checkout_url");
            str = z10Var.f44175a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
