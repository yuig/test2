package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class z20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44203a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44204b;

    public z20(nm.o oVar) {
        this.f44203a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y20 y20Var = new y20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1824432610) {
                if (hashCode != 3355) {
                    if (hashCode != 3059181) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("code")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("phone_code")) {
                c13 = 0;
            }
            nm.o oVar = this.f44203a;
            if (c13 != 0) {
                boolean[] zArr = y20Var.f43908e;
                if (c13 == 1) {
                    if (this.f44204b == null) {
                        this.f44204b = a.cb.q(oVar, String.class);
                    }
                    y20Var.f43904a = (String) this.f44204b.c(aVar);
                    if (zArr.length > 0) {
                        zArr[0] = true;
                    }
                } else if (c13 == 2) {
                    if (this.f44204b == null) {
                        this.f44204b = a.cb.q(oVar, String.class);
                    }
                    y20Var.f43906c = (String) this.f44204b.c(aVar);
                    boolean[] zArr2 = y20Var.f43908e;
                    if (zArr2.length > 2) {
                        zArr2[2] = true;
                    }
                } else if (c13 != 3) {
                    aVar.E();
                } else {
                    if (this.f44204b == null) {
                        this.f44204b = a.cb.q(oVar, String.class);
                    }
                    y20Var.f43905b = (String) this.f44204b.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                    }
                }
            } else {
                if (this.f44204b == null) {
                    this.f44204b = a.cb.q(oVar, String.class);
                }
                y20Var.f43907d = (String) this.f44204b.c(aVar);
                boolean[] zArr3 = y20Var.f43908e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            }
        }
        aVar.g();
        return new b30(y20Var.f43904a, y20Var.f43905b, y20Var.f43906c, y20Var.f43907d, y20Var.f43908e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        b30 b30Var = (b30) obj;
        if (b30Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = b30Var.f35960e;
        int length = zArr.length;
        nm.o oVar = this.f44203a;
        if (length > 0 && zArr[0]) {
            if (this.f44204b == null) {
                this.f44204b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44204b;
            um.c h10 = cVar.h("id");
            str4 = b30Var.f35956a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44204b == null) {
                this.f44204b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44204b;
            um.c h13 = cVar.h("node_id");
            str3 = b30Var.f35957b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44204b == null) {
                this.f44204b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44204b;
            um.c h14 = cVar.h("code");
            str2 = b30Var.f35958c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44204b == null) {
                this.f44204b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44204b;
            um.c h15 = cVar.h("phone_code");
            str = b30Var.f35959d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
