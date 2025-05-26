package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class m0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39951a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39952b;

    public m0(nm.o oVar) {
        this.f39951a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o0 o0Var = new o0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -533477245) {
                if (hashCode != 3355) {
                    if (hashCode != 116079) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("url")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("site_name")) {
                c13 = 0;
            }
            nm.o oVar = this.f39951a;
            if (c13 == 0) {
                if (this.f39952b == null) {
                    this.f39952b = a.cb.q(oVar, String.class);
                }
                o0Var.f40565c = (String) this.f39952b.c(aVar);
                boolean[] zArr = o0Var.f40567e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f39952b == null) {
                    this.f39952b = a.cb.q(oVar, String.class);
                }
                o0Var.f40563a = (String) this.f39952b.c(aVar);
                boolean[] zArr2 = o0Var.f40567e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f39952b == null) {
                    this.f39952b = a.cb.q(oVar, String.class);
                }
                o0Var.f40566d = (String) this.f39952b.c(aVar);
                boolean[] zArr3 = o0Var.f40567e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39952b == null) {
                    this.f39952b = a.cb.q(oVar, String.class);
                }
                o0Var.f40564b = (String) this.f39952b.c(aVar);
                boolean[] zArr4 = o0Var.f40567e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new p0(o0Var.f40563a, o0Var.f40564b, o0Var.f40565c, o0Var.f40566d, o0Var.f40567e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        p0 p0Var = (p0) obj;
        if (p0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = p0Var.f40845e;
        int length = zArr.length;
        nm.o oVar = this.f39951a;
        if (length > 0 && zArr[0]) {
            if (this.f39952b == null) {
                this.f39952b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39952b;
            um.c h10 = cVar.h("id");
            str4 = p0Var.f40841a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39952b == null) {
                this.f39952b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39952b;
            um.c h13 = cVar.h("node_id");
            str3 = p0Var.f40842b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39952b == null) {
                this.f39952b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39952b;
            um.c h14 = cVar.h("site_name");
            str2 = p0Var.f40843c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39952b == null) {
                this.f39952b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f39952b;
            um.c h15 = cVar.h("url");
            str = p0Var.f40844d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
