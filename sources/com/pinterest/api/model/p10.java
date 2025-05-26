package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class p10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40853a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40854b;

    public p10(nm.o oVar) {
        this.f40853a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o10 o10Var = new o10(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 96712) {
                    if (hashCode != 3373707) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("name")) {
                        c13 = 2;
                    }
                } else if (k03.equals("amt")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f40853a;
            if (c13 == 0) {
                if (this.f40854b == null) {
                    this.f40854b = a.cb.q(oVar, String.class);
                }
                o10Var.f40588a = (String) this.f40854b.c(aVar);
                boolean[] zArr = o10Var.f40592e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f40854b == null) {
                    this.f40854b = a.cb.q(oVar, String.class);
                }
                o10Var.f40590c = (String) this.f40854b.c(aVar);
                boolean[] zArr2 = o10Var.f40592e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f40854b == null) {
                    this.f40854b = a.cb.q(oVar, String.class);
                }
                o10Var.f40591d = (String) this.f40854b.c(aVar);
                boolean[] zArr3 = o10Var.f40592e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40854b == null) {
                    this.f40854b = a.cb.q(oVar, String.class);
                }
                o10Var.f40589b = (String) this.f40854b.c(aVar);
                boolean[] zArr4 = o10Var.f40592e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new r10(o10Var.f40588a, o10Var.f40589b, o10Var.f40590c, o10Var.f40591d, o10Var.f40592e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        r10 r10Var = (r10) obj;
        if (r10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = r10Var.f41471e;
        int length = zArr.length;
        nm.o oVar = this.f40853a;
        if (length > 0 && zArr[0]) {
            if (this.f40854b == null) {
                this.f40854b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40854b;
            um.c h10 = cVar.h("id");
            str4 = r10Var.f41467a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40854b == null) {
                this.f40854b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40854b;
            um.c h13 = cVar.h("node_id");
            str3 = r10Var.f41468b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40854b == null) {
                this.f40854b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40854b;
            um.c h14 = cVar.h("amt");
            str2 = r10Var.f41469c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40854b == null) {
                this.f40854b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40854b;
            um.c h15 = cVar.h("name");
            str = r10Var.f41470d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
