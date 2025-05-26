package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class t4 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42081a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42082b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42083c;

    public t4(nm.o oVar) {
        this.f42081a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        v4 v4Var = new v4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -405896971) {
                if (hashCode != 271064221) {
                    if (hashCode == 2040006954 && k03.equals("summary_metrics")) {
                        c13 = 2;
                    }
                } else if (k03.equals("daily_metrics")) {
                    c13 = 1;
                }
            } else if (k03.equals("hourly_metrics")) {
                c13 = 0;
            }
            nm.o oVar = this.f42081a;
            if (c13 == 0) {
                if (this.f42083c == null) {
                    this.f42083c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMetricsSeries$AnalyticsMetricsSeriesTypeAdapter$4
                    }).b();
                }
                v4Var.f42727b = (List) this.f42083c.c(aVar);
                boolean[] zArr = v4Var.f42729d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f42083c == null) {
                    this.f42083c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMetricsSeries$AnalyticsMetricsSeriesTypeAdapter$3
                    }).b();
                }
                v4Var.f42726a = (List) this.f42083c.c(aVar);
                boolean[] zArr2 = v4Var.f42729d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42082b == null) {
                    this.f42082b = a.cb.q(oVar, i5.class);
                }
                v4Var.f42728c = (i5) this.f42082b.c(aVar);
                boolean[] zArr3 = v4Var.f42729d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new w4(v4Var.f42726a, v4Var.f42727b, v4Var.f42728c, v4Var.f42729d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        i5 i5Var;
        List list;
        List list2;
        w4 w4Var = (w4) obj;
        if (w4Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w4Var.f43169d;
        int length = zArr.length;
        nm.o oVar = this.f42081a;
        if (length > 0 && zArr[0]) {
            if (this.f42083c == null) {
                this.f42083c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMetricsSeries$AnalyticsMetricsSeriesTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42083c;
            um.c h10 = cVar.h("daily_metrics");
            list2 = w4Var.f43166a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42083c == null) {
                this.f42083c = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMetricsSeries$AnalyticsMetricsSeriesTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f42083c;
            um.c h13 = cVar.h("hourly_metrics");
            list = w4Var.f43167b;
            mVar2.e(h13, list);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42082b == null) {
                this.f42082b = a.cb.q(oVar, i5.class);
            }
            nm.m mVar3 = this.f42082b;
            um.c h14 = cVar.h("summary_metrics");
            i5Var = w4Var.f43168c;
            mVar3.e(h14, i5Var);
        }
        cVar.g();
    }
}
