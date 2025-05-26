package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class vh0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42869a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42870b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42871c;

    public vh0(nm.o oVar) {
        this.f42869a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        uh0 uh0Var = new uh0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1867470421) {
                if (hashCode != -1862432301) {
                    if (hashCode == -509350366 && k03.equals("shipping_localized_text")) {
                        c13 = 2;
                    }
                } else if (k03.equals("free_shipping_value")) {
                    c13 = 1;
                }
            } else if (k03.equals("free_shipping_price")) {
                c13 = 0;
            }
            nm.o oVar = this.f42869a;
            if (c13 == 0) {
                if (this.f42871c == null) {
                    this.f42871c = a.cb.q(oVar, String.class);
                }
                uh0Var.f42566a = (String) this.f42871c.c(aVar);
                boolean[] zArr = uh0Var.f42569d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42870b == null) {
                    this.f42870b = a.cb.q(oVar, Integer.class);
                }
                uh0Var.f42567b = (Integer) this.f42870b.c(aVar);
                boolean[] zArr2 = uh0Var.f42569d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42871c == null) {
                    this.f42871c = a.cb.q(oVar, String.class);
                }
                uh0Var.a((String) this.f42871c.c(aVar));
            }
        }
        aVar.g();
        return new xh0(uh0Var.f42566a, uh0Var.f42567b, uh0Var.f42568c, uh0Var.f42569d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        xh0 xh0Var = (xh0) obj;
        if (xh0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xh0Var.f43691d;
        int length = zArr.length;
        nm.o oVar = this.f42869a;
        if (length > 0 && zArr[0]) {
            if (this.f42871c == null) {
                this.f42871c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42871c;
            um.c h10 = cVar.h("free_shipping_price");
            str2 = xh0Var.f43688a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42870b == null) {
                this.f42870b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f42870b;
            um.c h13 = cVar.h("free_shipping_value");
            num = xh0Var.f43689b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42871c == null) {
                this.f42871c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42871c;
            um.c h14 = cVar.h("shipping_localized_text");
            str = xh0Var.f43690c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
