package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class u01 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42377a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42378b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42379c;

    public u01(nm.o oVar) {
        this.f42377a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t01 t01Var = new t01(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("visit_response");
            nm.o oVar = this.f42377a;
            if (equals) {
                if (this.f42379c == null) {
                    this.f42379c = a.cb.q(oVar, m11.class);
                }
                t01Var.f42043b = (m11) this.f42379c.c(aVar);
                boolean[] zArr = t01Var.f42044c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("cookies")) {
                if (this.f42378b == null) {
                    this.f42378b = a.cb.q(oVar, e11.class);
                }
                t01Var.f42042a = (e11) this.f42378b.c(aVar);
                boolean[] zArr2 = t01Var.f42044c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new w01(t01Var.f42042a, t01Var.f42043b, t01Var.f42044c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        m11 m11Var;
        e11 e11Var;
        w01 w01Var = (w01) obj;
        if (w01Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w01Var.f43134c;
        int length = zArr.length;
        nm.o oVar = this.f42377a;
        if (length > 0 && zArr[0]) {
            if (this.f42378b == null) {
                this.f42378b = a.cb.q(oVar, e11.class);
            }
            nm.m mVar = this.f42378b;
            um.c h10 = cVar.h("cookies");
            e11Var = w01Var.f43132a;
            mVar.e(h10, e11Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42379c == null) {
                this.f42379c = a.cb.q(oVar, m11.class);
            }
            nm.m mVar2 = this.f42379c;
            um.c h13 = cVar.h("visit_response");
            m11Var = w01Var.f43133b;
            mVar2.e(h13, m11Var);
        }
        cVar.g();
    }
}
