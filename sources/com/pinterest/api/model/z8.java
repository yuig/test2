package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class z8 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44242a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44243b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44244c;

    public z8(nm.o oVar) {
        this.f44242a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b9 b9Var = new b9(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3292052) {
                if (hashCode != 111972721) {
                    if (hashCode == 829251210 && k03.equals("confidence")) {
                        c13 = 2;
                    }
                } else if (k03.equals("value")) {
                    c13 = 1;
                }
            } else if (k03.equals("kind")) {
                c13 = 0;
            }
            nm.o oVar = this.f44242a;
            if (c13 == 0) {
                if (this.f44244c == null) {
                    this.f44244c = a.cb.q(oVar, String.class);
                }
                b9Var.f36016b = (String) this.f44244c.c(aVar);
                boolean[] zArr = b9Var.f36018d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f44243b == null) {
                    this.f44243b = a.cb.q(oVar, Double.class);
                }
                b9Var.f36017c = (Double) this.f44243b.c(aVar);
                boolean[] zArr2 = b9Var.f36018d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f44243b == null) {
                    this.f44243b = a.cb.q(oVar, Double.class);
                }
                b9Var.f36015a = (Double) this.f44243b.c(aVar);
                boolean[] zArr3 = b9Var.f36018d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new c9(b9Var.f36015a, b9Var.f36016b, b9Var.f36017c, b9Var.f36018d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        Double d13;
        c9 c9Var = (c9) obj;
        if (c9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = c9Var.f36324d;
        int length = zArr.length;
        nm.o oVar = this.f44242a;
        if (length > 0 && zArr[0]) {
            if (this.f44243b == null) {
                this.f44243b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f44243b;
            um.c h10 = cVar.h("confidence");
            d13 = c9Var.f36321a;
            mVar.e(h10, d13);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44244c == null) {
                this.f44244c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44244c;
            um.c h13 = cVar.h("kind");
            str = c9Var.f36322b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44243b == null) {
                this.f44243b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f44243b;
            um.c h14 = cVar.h("value");
            d2 = c9Var.f36323c;
            mVar3.e(h14, d2);
        }
        cVar.g();
    }
}
