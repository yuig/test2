package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class n3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40304a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40305b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40306c;

    public n3(nm.o oVar) {
        this.f40304a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p3 p3Var = new p3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1329870297) {
                if (hashCode != 3355) {
                    if (hashCode != 111972721) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("value")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("data_status")) {
                c13 = 0;
            }
            nm.o oVar = this.f40304a;
            if (c13 == 0) {
                if (this.f40306c == null) {
                    this.f40306c = a.cb.q(oVar, String.class);
                }
                p3Var.f40870c = (String) this.f40306c.c(aVar);
                boolean[] zArr = p3Var.f40872e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f40306c == null) {
                    this.f40306c = a.cb.q(oVar, String.class);
                }
                p3Var.f40868a = (String) this.f40306c.c(aVar);
                boolean[] zArr2 = p3Var.f40872e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f40305b == null) {
                    this.f40305b = a.cb.q(oVar, Double.class);
                }
                p3Var.f40871d = (Double) this.f40305b.c(aVar);
                boolean[] zArr3 = p3Var.f40872e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40306c == null) {
                    this.f40306c = a.cb.q(oVar, String.class);
                }
                p3Var.f40869b = (String) this.f40306c.c(aVar);
                boolean[] zArr4 = p3Var.f40872e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new q3(p3Var.f40868a, p3Var.f40869b, p3Var.f40870c, p3Var.f40871d, p3Var.f40872e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        String str2;
        String str3;
        q3 q3Var = (q3) obj;
        if (q3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = q3Var.f41200e;
        int length = zArr.length;
        nm.o oVar = this.f40304a;
        if (length > 0 && zArr[0]) {
            if (this.f40306c == null) {
                this.f40306c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40306c;
            um.c h10 = cVar.h("id");
            str3 = q3Var.f41196a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40306c == null) {
                this.f40306c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40306c;
            um.c h13 = cVar.h("node_id");
            str2 = q3Var.f41197b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40306c == null) {
                this.f40306c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40306c;
            um.c h14 = cVar.h("data_status");
            str = q3Var.f41198c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40305b == null) {
                this.f40305b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f40305b;
            um.c h15 = cVar.h("value");
            d2 = q3Var.f41199d;
            mVar4.e(h15, d2);
        }
        cVar.g();
    }
}
