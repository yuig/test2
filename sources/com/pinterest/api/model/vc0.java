package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class vc0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42825a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42826b;

    public vc0(nm.o oVar) {
        this.f42825a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        uc0 uc0Var = new uc0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3373707) {
                    if (hashCode != 1981253695) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("color_hex")) {
                        c13 = 2;
                    }
                } else if (k03.equals("name")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            boolean[] zArr = uc0Var.f42513e;
            nm.o oVar = this.f42825a;
            if (c13 == 0) {
                if (this.f42826b == null) {
                    this.f42826b = a.cb.q(oVar, String.class);
                }
                uc0Var.f42509a = (String) this.f42826b.c(aVar);
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42826b == null) {
                    this.f42826b = a.cb.q(oVar, String.class);
                }
                uc0Var.f42512d = (String) this.f42826b.c(aVar);
                boolean[] zArr2 = uc0Var.f42513e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f42826b == null) {
                    this.f42826b = a.cb.q(oVar, String.class);
                }
                uc0Var.f42511c = (String) this.f42826b.c(aVar);
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42826b == null) {
                    this.f42826b = a.cb.q(oVar, String.class);
                }
                uc0Var.f42510b = (String) this.f42826b.c(aVar);
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            }
        }
        aVar.g();
        return new xc0(uc0Var.f42509a, uc0Var.f42510b, uc0Var.f42511c, uc0Var.f42512d, uc0Var.f42513e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        xc0 xc0Var = (xc0) obj;
        if (xc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xc0Var.f43652e;
        int length = zArr.length;
        nm.o oVar = this.f42825a;
        if (length > 0 && zArr[0]) {
            if (this.f42826b == null) {
                this.f42826b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42826b;
            um.c h10 = cVar.h("id");
            str4 = xc0Var.f43648a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42826b == null) {
                this.f42826b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42826b;
            um.c h13 = cVar.h("node_id");
            str3 = xc0Var.f43649b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42826b == null) {
                this.f42826b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42826b;
            um.c h14 = cVar.h("color_hex");
            str2 = xc0Var.f43650c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42826b == null) {
                this.f42826b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42826b;
            um.c h15 = cVar.h("name");
            str = xc0Var.f43651d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
