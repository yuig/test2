package com.pinterest.api.model;

import android.util.Log;

/* loaded from: classes3.dex */
public final class d4 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36649a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36650b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36651c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36652d;

    public d4(nm.o oVar) {
        this.f36649a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f4 f4Var = new f4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 95468472) {
                    if (hashCode == 111972721 && k03.equals("value")) {
                        c13 = 2;
                    }
                } else if (k03.equals("delta")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f36649a;
            if (c13 == 0) {
                if (this.f36652d == null) {
                    this.f36652d = a.cb.q(oVar, String.class);
                }
                f4Var.f37559b = (String) this.f36652d.c(aVar);
                boolean[] zArr = f4Var.f37561d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f36650b == null) {
                    this.f36650b = a.cb.q(oVar, Double.class);
                }
                f4Var.f37558a = (Double) this.f36650b.c(aVar);
                boolean[] zArr2 = f4Var.f37561d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                Log.d("Plank", "Unmapped property for AnalyticsMetricItem: ".concat(k03));
                aVar.E();
            } else {
                if (this.f36651c == null) {
                    this.f36651c = a.cb.q(oVar, Integer.class);
                }
                f4Var.f37560c = (Integer) this.f36651c.c(aVar);
                boolean[] zArr3 = f4Var.f37561d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new g4(f4Var.f37558a, f4Var.f37559b, f4Var.f37560c, f4Var.f37561d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Double d2;
        g4 g4Var = (g4) obj;
        if (g4Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = g4Var.f37961d;
        int length = zArr.length;
        nm.o oVar = this.f36649a;
        if (length > 0 && zArr[0]) {
            if (this.f36650b == null) {
                this.f36650b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f36650b;
            um.c h10 = cVar.h("delta");
            d2 = g4Var.f37958a;
            mVar.e(h10, d2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36652d == null) {
                this.f36652d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36652d;
            um.c h13 = cVar.h("id");
            str = g4Var.f37959b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36651c == null) {
                this.f36651c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f36651c;
            um.c h14 = cVar.h("value");
            num = g4Var.f37960c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
