package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class g50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37965a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37966b;

    public g50(nm.o oVar) {
        this.f37965a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f50 f50Var = new f50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -988161019) {
                if (hashCode != -877823861) {
                    if (hashCode != 3355) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("image_url")) {
                    c13 = 1;
                }
            } else if (k03.equals("pin_id")) {
                c13 = 0;
            }
            nm.o oVar = this.f37965a;
            if (c13 == 0) {
                if (this.f37966b == null) {
                    this.f37966b = a.cb.q(oVar, String.class);
                }
                f50Var.f37570d = (String) this.f37966b.c(aVar);
                boolean[] zArr = f50Var.f37571e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f37966b == null) {
                    this.f37966b = a.cb.q(oVar, String.class);
                }
                f50Var.f37569c = (String) this.f37966b.c(aVar);
                boolean[] zArr2 = f50Var.f37571e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f37966b == null) {
                    this.f37966b = a.cb.q(oVar, String.class);
                }
                f50Var.f37567a = (String) this.f37966b.c(aVar);
                boolean[] zArr3 = f50Var.f37571e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f37966b == null) {
                    this.f37966b = a.cb.q(oVar, String.class);
                }
                f50Var.f37568b = (String) this.f37966b.c(aVar);
                boolean[] zArr4 = f50Var.f37571e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new i50(f50Var.f37567a, f50Var.f37568b, f50Var.f37569c, f50Var.f37570d, f50Var.f37571e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        i50 i50Var = (i50) obj;
        if (i50Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i50Var.f38677e;
        int length = zArr.length;
        nm.o oVar = this.f37965a;
        if (length > 0 && zArr[0]) {
            if (this.f37966b == null) {
                this.f37966b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37966b;
            um.c h10 = cVar.h("id");
            str4 = i50Var.f38673a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37966b == null) {
                this.f37966b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37966b;
            um.c h13 = cVar.h("node_id");
            str3 = i50Var.f38674b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37966b == null) {
                this.f37966b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37966b;
            um.c h14 = cVar.h("image_url");
            str2 = i50Var.f38675c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37966b == null) {
                this.f37966b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37966b;
            um.c h15 = cVar.h("pin_id");
            str = i50Var.f38676d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
