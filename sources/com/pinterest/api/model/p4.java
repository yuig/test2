package com.pinterest.api.model;

import android.util.Log;

/* loaded from: classes3.dex */
public final class p4 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40873a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40874b;

    public p4(nm.o oVar) {
        this.f40873a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        r4 r4Var = new r4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            if (k03.equals("all")) {
                if (this.f40874b == null) {
                    this.f40874b = a.cb.q(this.f40873a, w4.class);
                }
                r4Var.f41479a = (w4) this.f40874b.c(aVar);
                boolean[] zArr = r4Var.f41480b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                Log.d("Plank", "Unmapped property for AnalyticsMetricsData: ".concat(k03));
                aVar.E();
            }
        }
        aVar.g();
        return new s4(r4Var.f41479a, r4Var.f41480b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        w4 w4Var;
        s4 s4Var = (s4) obj;
        if (s4Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s4Var.f41782b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40874b == null) {
                this.f40874b = a.cb.q(this.f40873a, w4.class);
            }
            nm.m mVar = this.f40874b;
            um.c h10 = cVar.h("all");
            w4Var = s4Var.f41781a;
            mVar.e(h10, w4Var);
        }
        cVar.g();
    }
}
