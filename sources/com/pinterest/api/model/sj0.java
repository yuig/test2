package com.pinterest.api.model;

import com.pinterest.api.model.rj0;

/* loaded from: classes.dex */
public final class sj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41927a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41928b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41929c;

    public sj0(nm.o oVar) {
        this.f41927a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qj0 qj0Var = new qj0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1998892262) {
                if (hashCode != -892481550) {
                    if (hashCode == 1028554796 && k03.equals("creator")) {
                        c13 = 2;
                    }
                } else if (k03.equals("status")) {
                    c13 = 1;
                }
            } else if (k03.equals("sponsor")) {
                c13 = 0;
            }
            nm.o oVar = this.f41927a;
            if (c13 == 0) {
                if (this.f41929c == null) {
                    this.f41929c = a.cb.q(oVar, wy0.class);
                }
                qj0Var.c((wy0) this.f41929c.c(aVar));
            } else if (c13 == 1) {
                if (this.f41928b == null) {
                    this.f41928b = a.cb.q(oVar, rj0.a.class);
                }
                qj0Var.d((rj0.a) this.f41928b.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41929c == null) {
                    this.f41929c = a.cb.q(oVar, wy0.class);
                }
                qj0Var.b((wy0) this.f41929c.c(aVar));
            }
        }
        aVar.g();
        return qj0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        rj0.a aVar;
        wy0 wy0Var;
        wy0 wy0Var2;
        rj0 rj0Var = (rj0) obj;
        if (rj0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rj0Var.f41616d;
        int length = zArr.length;
        nm.o oVar = this.f41927a;
        if (length > 0 && zArr[0]) {
            if (this.f41929c == null) {
                this.f41929c = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar = this.f41929c;
            um.c h10 = cVar.h("creator");
            wy0Var2 = rj0Var.f41613a;
            mVar.e(h10, wy0Var2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41929c == null) {
                this.f41929c = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar2 = this.f41929c;
            um.c h13 = cVar.h("sponsor");
            wy0Var = rj0Var.f41614b;
            mVar2.e(h13, wy0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41928b == null) {
                this.f41928b = a.cb.q(oVar, rj0.a.class);
            }
            nm.m mVar3 = this.f41928b;
            um.c h14 = cVar.h("status");
            aVar = rj0Var.f41615c;
            mVar3.e(h14, aVar);
        }
        cVar.g();
    }
}
