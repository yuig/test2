package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class g10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37901a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37902b;

    public g10(nm.o oVar) {
        this.f37901a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f10 f10Var = new f10(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 109780401) {
                    if (hashCode != 1766182403) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("cover_image_url")) {
                        c13 = 2;
                    }
                } else if (k03.equals("style")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f37901a;
            if (c13 == 0) {
                if (this.f37902b == null) {
                    this.f37902b = a.cb.q(oVar, String.class);
                }
                f10Var.f37411a = (String) this.f37902b.c(aVar);
                boolean[] zArr = f10Var.f37415e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f37902b == null) {
                    this.f37902b = a.cb.q(oVar, String.class);
                }
                f10Var.f37414d = (String) this.f37902b.c(aVar);
                boolean[] zArr2 = f10Var.f37415e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f37902b == null) {
                    this.f37902b = a.cb.q(oVar, String.class);
                }
                f10Var.f37413c = (String) this.f37902b.c(aVar);
                boolean[] zArr3 = f10Var.f37415e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f37902b == null) {
                    this.f37902b = a.cb.q(oVar, String.class);
                }
                f10Var.f37412b = (String) this.f37902b.c(aVar);
                boolean[] zArr4 = f10Var.f37415e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new i10(f10Var.f37411a, f10Var.f37412b, f10Var.f37413c, f10Var.f37414d, f10Var.f37415e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        i10 i10Var = (i10) obj;
        if (i10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i10Var.f38595e;
        int length = zArr.length;
        nm.o oVar = this.f37901a;
        if (length > 0 && zArr[0]) {
            if (this.f37902b == null) {
                this.f37902b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37902b;
            um.c h10 = cVar.h("id");
            str4 = i10Var.f38591a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37902b == null) {
                this.f37902b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37902b;
            um.c h13 = cVar.h("node_id");
            str3 = i10Var.f38592b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37902b == null) {
                this.f37902b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37902b;
            um.c h14 = cVar.h("cover_image_url");
            str2 = i10Var.f38593c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37902b == null) {
                this.f37902b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37902b;
            um.c h15 = cVar.h("style");
            str = i10Var.f38594d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
