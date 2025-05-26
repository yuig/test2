package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class iz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38890a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38891b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38892c;

    public iz0(nm.o oVar) {
        this.f38890a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hz0 hz0Var = new hz0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -840348531) {
                if (hashCode != -389656369) {
                    if (hashCode == -89538361 && k03.equals("recommendation_reason_description")) {
                        c13 = 2;
                    }
                } else if (k03.equals("recommendation_reason_type")) {
                    c13 = 1;
                }
            } else if (k03.equals("recommendation_reason_details")) {
                c13 = 0;
            }
            nm.o oVar = this.f38890a;
            if (c13 == 0) {
                if (this.f38892c == null) {
                    this.f38892c = a.cb.q(oVar, String.class);
                }
                hz0Var.b((String) this.f38892c.c(aVar));
            } else if (c13 == 1) {
                if (this.f38891b == null) {
                    this.f38891b = a.cb.q(oVar, Integer.class);
                }
                hz0Var.c((Integer) this.f38891b.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f38892c == null) {
                    this.f38892c = a.cb.q(oVar, String.class);
                }
                hz0Var.a((String) this.f38892c.c(aVar));
            }
        }
        aVar.g();
        return new kz0(hz0Var.f38573a, hz0Var.f38574b, hz0Var.f38575c, hz0Var.f38576d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        kz0 kz0Var = (kz0) obj;
        if (kz0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kz0Var.f39570d;
        int length = zArr.length;
        nm.o oVar = this.f38890a;
        if (length > 0 && zArr[0]) {
            if (this.f38892c == null) {
                this.f38892c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38892c;
            um.c h10 = cVar.h("recommendation_reason_description");
            str2 = kz0Var.f39567a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38892c == null) {
                this.f38892c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38892c;
            um.c h13 = cVar.h("recommendation_reason_details");
            str = kz0Var.f39568b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38891b == null) {
                this.f38891b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f38891b;
            um.c h14 = cVar.h("recommendation_reason_type");
            num = kz0Var.f39569c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
