package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class od0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40680a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40681b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40682c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40683d;

    public od0(nm.o oVar) {
        this.f40680a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        nd0 nd0Var = new nd0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -413121989) {
                if (hashCode != 100743639) {
                    if (hashCode == 102727412 && k03.equals("label")) {
                        c13 = 2;
                    }
                } else if (k03.equals("eligible")) {
                    c13 = 1;
                }
            } else if (k03.equals("req_type")) {
                c13 = 0;
            }
            nm.o oVar = this.f40680a;
            if (c13 == 0) {
                if (this.f40682c == null) {
                    this.f40682c = a.cb.q(oVar, Integer.class);
                }
                nd0Var.f40390c = (Integer) this.f40682c.c(aVar);
                boolean[] zArr = nd0Var.f40391d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f40681b == null) {
                    this.f40681b = a.cb.q(oVar, Boolean.class);
                }
                nd0Var.f40388a = (Boolean) this.f40681b.c(aVar);
                boolean[] zArr2 = nd0Var.f40391d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f40683d == null) {
                    this.f40683d = a.cb.q(oVar, String.class);
                }
                nd0Var.f40389b = (String) this.f40683d.c(aVar);
                boolean[] zArr3 = nd0Var.f40391d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new qd0(nd0Var.f40388a, nd0Var.f40389b, nd0Var.f40390c, nd0Var.f40391d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Boolean bool;
        qd0 qd0Var = (qd0) obj;
        if (qd0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qd0Var.f41277d;
        int length = zArr.length;
        nm.o oVar = this.f40680a;
        if (length > 0 && zArr[0]) {
            if (this.f40681b == null) {
                this.f40681b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f40681b;
            um.c h10 = cVar.h("eligible");
            bool = qd0Var.f41274a;
            mVar.e(h10, bool);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40683d == null) {
                this.f40683d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40683d;
            um.c h13 = cVar.h("label");
            str = qd0Var.f41275b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40682c == null) {
                this.f40682c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40682c;
            um.c h14 = cVar.h("req_type");
            num = qd0Var.f41276c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
