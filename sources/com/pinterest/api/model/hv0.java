package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class hv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38552a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38553b;

    public hv0(nm.o oVar) {
        this.f38552a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gv0 gv0Var = new gv0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 192046711) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("prefilled_value")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f38552a;
            if (c13 == 0) {
                if (this.f38553b == null) {
                    this.f38553b = a.cb.q(oVar, String.class);
                }
                gv0Var.f38158a = (String) this.f38553b.c(aVar);
                boolean[] zArr = gv0Var.f38161d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f38553b == null) {
                    this.f38553b = a.cb.q(oVar, String.class);
                }
                gv0Var.f38160c = (String) this.f38553b.c(aVar);
                boolean[] zArr2 = gv0Var.f38161d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f38553b == null) {
                    this.f38553b = a.cb.q(oVar, String.class);
                }
                gv0Var.f38159b = (String) this.f38553b.c(aVar);
                boolean[] zArr3 = gv0Var.f38161d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new jv0(gv0Var.f38158a, gv0Var.f38159b, gv0Var.f38160c, gv0Var.f38161d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        jv0 jv0Var = (jv0) obj;
        if (jv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jv0Var.f39159d;
        int length = zArr.length;
        nm.o oVar = this.f38552a;
        if (length > 0 && zArr[0]) {
            if (this.f38553b == null) {
                this.f38553b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38553b;
            um.c h10 = cVar.h("id");
            str3 = jv0Var.f39156a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38553b == null) {
                this.f38553b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38553b;
            um.c h13 = cVar.h("node_id");
            str2 = jv0Var.f39157b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38553b == null) {
                this.f38553b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38553b;
            um.c h14 = cVar.h("prefilled_value");
            str = jv0Var.f39158c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
