package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class e60 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37186a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37187b;

    public e60(nm.o oVar) {
        this.f37186a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        d60 d60Var = new d60(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -2053263135) {
                if (hashCode != 3355) {
                    if (hashCode != 1481071862) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("country_code")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("postal_code")) {
                c13 = 0;
            }
            nm.o oVar = this.f37186a;
            if (c13 == 0) {
                if (this.f37187b == null) {
                    this.f37187b = a.cb.q(oVar, String.class);
                }
                d60Var.d((String) this.f37187b.c(aVar));
            } else if (c13 == 1) {
                if (this.f37187b == null) {
                    this.f37187b = a.cb.q(oVar, String.class);
                }
                d60Var.e((String) this.f37187b.c(aVar));
            } else if (c13 == 2) {
                if (this.f37187b == null) {
                    this.f37187b = a.cb.q(oVar, String.class);
                }
                d60Var.b((String) this.f37187b.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f37187b == null) {
                    this.f37187b = a.cb.q(oVar, String.class);
                }
                d60Var.c((String) this.f37187b.c(aVar));
            }
        }
        aVar.g();
        return d60Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        g60 g60Var = (g60) obj;
        if (g60Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = g60Var.f37976e;
        int length = zArr.length;
        nm.o oVar = this.f37186a;
        if (length > 0 && zArr[0]) {
            if (this.f37187b == null) {
                this.f37187b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37187b;
            um.c h10 = cVar.h("id");
            str4 = g60Var.f37972a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37187b == null) {
                this.f37187b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37187b;
            um.c h13 = cVar.h("node_id");
            str3 = g60Var.f37973b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37187b == null) {
                this.f37187b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37187b;
            um.c h14 = cVar.h("country_code");
            str2 = g60Var.f37974c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37187b == null) {
                this.f37187b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37187b;
            um.c h15 = cVar.h("postal_code");
            str = g60Var.f37975d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
