package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class nn0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40444a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40445b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40446c;

    public nn0(nm.o oVar) {
        this.f40444a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mn0 mn0Var = new mn0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3575610) {
                if (hashCode != 111972721) {
                    if (hashCode == 338885083 && k03.equals("category_type")) {
                        c13 = 2;
                    }
                } else if (k03.equals("value")) {
                    c13 = 1;
                }
            } else if (k03.equals("type")) {
                c13 = 0;
            }
            nm.o oVar = this.f40444a;
            if (c13 == 0) {
                if (this.f40445b == null) {
                    this.f40445b = a.cb.q(oVar, Integer.class);
                }
                mn0Var.f40168b = (Integer) this.f40445b.c(aVar);
                boolean[] zArr = mn0Var.f40170d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f40446c == null) {
                    this.f40446c = a.cb.q(oVar, String.class);
                }
                mn0Var.f40169c = (String) this.f40446c.c(aVar);
                boolean[] zArr2 = mn0Var.f40170d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f40445b == null) {
                    this.f40445b = a.cb.q(oVar, Integer.class);
                }
                mn0Var.f40167a = (Integer) this.f40445b.c(aVar);
                boolean[] zArr3 = mn0Var.f40170d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new pn0(mn0Var.f40167a, mn0Var.f40168b, mn0Var.f40169c, mn0Var.f40170d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        pn0 pn0Var = (pn0) obj;
        if (pn0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pn0Var.f41035d;
        int length = zArr.length;
        nm.o oVar = this.f40444a;
        if (length > 0 && zArr[0]) {
            if (this.f40445b == null) {
                this.f40445b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f40445b;
            um.c h10 = cVar.h("category_type");
            num2 = pn0Var.f41032a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40445b == null) {
                this.f40445b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f40445b;
            um.c h13 = cVar.h("type");
            num = pn0Var.f41033b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40446c == null) {
                this.f40446c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40446c;
            um.c h14 = cVar.h("value");
            str = pn0Var.f41034c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
