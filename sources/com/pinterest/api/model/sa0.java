package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class sa0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41847a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41848b;

    public sa0(nm.o oVar) {
        this.f41847a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ra0 ra0Var = new ra0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 110371416) {
                    if (hashCode != 980445913) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("primary_action_text")) {
                        c13 = 2;
                    }
                } else if (k03.equals("title")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f41847a;
            if (c13 == 0) {
                if (this.f41848b == null) {
                    this.f41848b = a.cb.q(oVar, String.class);
                }
                ra0Var.f41524a = (String) this.f41848b.c(aVar);
                boolean[] zArr = ra0Var.f41528e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f41848b == null) {
                    this.f41848b = a.cb.q(oVar, String.class);
                }
                ra0Var.f41527d = (String) this.f41848b.c(aVar);
                boolean[] zArr2 = ra0Var.f41528e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f41848b == null) {
                    this.f41848b = a.cb.q(oVar, String.class);
                }
                ra0Var.f41526c = (String) this.f41848b.c(aVar);
                boolean[] zArr3 = ra0Var.f41528e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f41848b == null) {
                    this.f41848b = a.cb.q(oVar, String.class);
                }
                ra0Var.f41525b = (String) this.f41848b.c(aVar);
                boolean[] zArr4 = ra0Var.f41528e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ua0(ra0Var.f41524a, ra0Var.f41525b, ra0Var.f41526c, ra0Var.f41527d, ra0Var.f41528e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ua0 ua0Var = (ua0) obj;
        if (ua0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ua0Var.f42490e;
        int length = zArr.length;
        nm.o oVar = this.f41847a;
        if (length > 0 && zArr[0]) {
            if (this.f41848b == null) {
                this.f41848b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41848b;
            um.c h10 = cVar.h("id");
            str4 = ua0Var.f42486a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41848b == null) {
                this.f41848b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41848b;
            um.c h13 = cVar.h("node_id");
            str3 = ua0Var.f42487b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41848b == null) {
                this.f41848b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41848b;
            um.c h14 = cVar.h("primary_action_text");
            str2 = ua0Var.f42488c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41848b == null) {
                this.f41848b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41848b;
            um.c h15 = cVar.h("title");
            str = ua0Var.f42489d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
