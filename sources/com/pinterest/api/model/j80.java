package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class j80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39000a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39001b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39002c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39003d;

    public j80(nm.o oVar) {
        this.f39000a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        i80 i80Var = new i80(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -935593396) {
                if (hashCode != 271064221) {
                    if (hashCode == 2040006954 && k03.equals("summary_metrics")) {
                        c13 = 2;
                    }
                } else if (k03.equals("daily_metrics")) {
                    c13 = 1;
                }
            } else if (k03.equals("date_availability")) {
                c13 = 0;
            }
            nm.o oVar = this.f39000a;
            if (c13 == 0) {
                if (this.f39003d == null) {
                    this.f39003d = a.cb.q(oVar, w30.class);
                }
                i80Var.f38703b = (w30) this.f39003d.c(aVar);
                boolean[] zArr = i80Var.f38705d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f39002c == null) {
                    this.f39002c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.ProductTagAnalyticsSummary$ProductTagAnalyticsSummaryTypeAdapter$2
                    }).b();
                }
                i80Var.f38702a = (List) this.f39002c.c(aVar);
                boolean[] zArr2 = i80Var.f38705d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f39001b == null) {
                    this.f39001b = a.cb.q(oVar, k4.class);
                }
                i80Var.f38704c = (k4) this.f39001b.c(aVar);
                boolean[] zArr3 = i80Var.f38705d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new l80(i80Var.f38702a, i80Var.f38703b, i80Var.f38704c, i80Var.f38705d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        k4 k4Var;
        w30 w30Var;
        List list;
        l80 l80Var = (l80) obj;
        if (l80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = l80Var.f39670d;
        int length = zArr.length;
        nm.o oVar = this.f39000a;
        if (length > 0 && zArr[0]) {
            if (this.f39002c == null) {
                this.f39002c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.ProductTagAnalyticsSummary$ProductTagAnalyticsSummaryTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f39002c;
            um.c h10 = cVar.h("daily_metrics");
            list = l80Var.f39667a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39003d == null) {
                this.f39003d = a.cb.q(oVar, w30.class);
            }
            nm.m mVar2 = this.f39003d;
            um.c h13 = cVar.h("date_availability");
            w30Var = l80Var.f39668b;
            mVar2.e(h13, w30Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39001b == null) {
                this.f39001b = a.cb.q(oVar, k4.class);
            }
            nm.m mVar3 = this.f39001b;
            um.c h14 = cVar.h("summary_metrics");
            k4Var = l80Var.f39669c;
            mVar3.e(h14, k4Var);
        }
        cVar.g();
    }
}
