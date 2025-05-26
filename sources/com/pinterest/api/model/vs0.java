package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;

/* loaded from: classes3.dex */
public final class vs0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42975a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42976b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42977c;

    public vs0(nm.o oVar) {
        this.f42975a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        us0 us0Var = new us0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 102459) {
                    if (hashCode != 957831062) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals(AdRevenueScheme.COUNTRY)) {
                        c13 = 2;
                    }
                } else if (k03.equals("gma")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f42975a;
            if (c13 == 0) {
                if (this.f42976b == null) {
                    this.f42976b = a.cb.q(oVar, String.class);
                }
                us0Var.f42635a = (String) this.f42976b.c(aVar);
                boolean[] zArr = us0Var.f42639e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42977c == null) {
                    this.f42977c = a.cb.q(oVar, bt0.class);
                }
                us0Var.f42638d = (bt0) this.f42977c.c(aVar);
                boolean[] zArr2 = us0Var.f42639e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f42976b == null) {
                    this.f42976b = a.cb.q(oVar, String.class);
                }
                us0Var.f42637c = (String) this.f42976b.c(aVar);
                boolean[] zArr3 = us0Var.f42639e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42976b == null) {
                    this.f42976b = a.cb.q(oVar, String.class);
                }
                us0Var.f42636b = (String) this.f42976b.c(aVar);
                boolean[] zArr4 = us0Var.f42639e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new xs0(us0Var.f42635a, us0Var.f42636b, us0Var.f42637c, us0Var.f42638d, us0Var.f42639e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        bt0 bt0Var;
        String str;
        String str2;
        String str3;
        xs0 xs0Var = (xs0) obj;
        if (xs0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xs0Var.f43788e;
        int length = zArr.length;
        nm.o oVar = this.f42975a;
        if (length > 0 && zArr[0]) {
            if (this.f42976b == null) {
                this.f42976b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42976b;
            um.c h10 = cVar.h("id");
            str3 = xs0Var.f43784a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42976b == null) {
                this.f42976b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42976b;
            um.c h13 = cVar.h("node_id");
            str2 = xs0Var.f43785b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42976b == null) {
                this.f42976b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42976b;
            um.c h14 = cVar.h(AdRevenueScheme.COUNTRY);
            str = xs0Var.f43786c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42977c == null) {
                this.f42977c = a.cb.q(oVar, bt0.class);
            }
            nm.m mVar4 = this.f42977c;
            um.c h15 = cVar.h("gma");
            bt0Var = xs0Var.f43787d;
            mVar4.e(h15, bt0Var);
        }
        cVar.g();
    }
}
