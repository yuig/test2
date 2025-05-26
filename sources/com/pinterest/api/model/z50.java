package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class z50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44226a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44227b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44228c;

    public z50(nm.o oVar) {
        this.f44226a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y50 y50Var = new y50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -434615388) {
                if (hashCode != 3355) {
                    if (hashCode != 3556653) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("text")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("pin_type")) {
                c13 = 0;
            }
            nm.o oVar = this.f44226a;
            if (c13 == 0) {
                if (this.f44227b == null) {
                    this.f44227b = a.cb.q(oVar, Integer.class);
                }
                y50Var.f43956c = (Integer) this.f44227b.c(aVar);
                boolean[] zArr = y50Var.f43958e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f44228c == null) {
                    this.f44228c = a.cb.q(oVar, String.class);
                }
                y50Var.f43954a = (String) this.f44228c.c(aVar);
                boolean[] zArr2 = y50Var.f43958e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f44228c == null) {
                    this.f44228c = a.cb.q(oVar, String.class);
                }
                y50Var.f43957d = (String) this.f44228c.c(aVar);
                boolean[] zArr3 = y50Var.f43958e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f44228c == null) {
                    this.f44228c = a.cb.q(oVar, String.class);
                }
                y50Var.f43955b = (String) this.f44228c.c(aVar);
                boolean[] zArr4 = y50Var.f43958e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new b60(y50Var.f43954a, y50Var.f43955b, y50Var.f43956c, y50Var.f43957d, y50Var.f43958e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        String str3;
        b60 b60Var = (b60) obj;
        if (b60Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = b60Var.f36001e;
        int length = zArr.length;
        nm.o oVar = this.f44226a;
        if (length > 0 && zArr[0]) {
            if (this.f44228c == null) {
                this.f44228c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44228c;
            um.c h10 = cVar.h("id");
            str3 = b60Var.f35997a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44228c == null) {
                this.f44228c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44228c;
            um.c h13 = cVar.h("node_id");
            str2 = b60Var.f35998b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44227b == null) {
                this.f44227b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f44227b;
            um.c h14 = cVar.h("pin_type");
            num = b60Var.f35999c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44228c == null) {
                this.f44228c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44228c;
            um.c h15 = cVar.h("text");
            str = b60Var.f36000d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
