package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class vx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43015a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43016b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43017c;

    public vx0(nm.o oVar) {
        this.f43015a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ux0 ux0Var = new ux0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3076010) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("data")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f43015a;
            if (c13 == 0) {
                if (this.f43017c == null) {
                    this.f43017c = a.cb.q(oVar, String.class);
                }
                ux0Var.f42671a = (String) this.f43017c.c(aVar);
                boolean[] zArr = ux0Var.f42674d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f43016b == null) {
                    this.f43016b = oVar.g(new TypeToken<List<px0>>(this) { // from class: com.pinterest.api.model.UnifiedFiltersData$UnifiedFiltersDataTypeAdapter$2
                    }).b();
                }
                ux0Var.f42673c = (List) this.f43016b.c(aVar);
                boolean[] zArr2 = ux0Var.f42674d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f43017c == null) {
                    this.f43017c = a.cb.q(oVar, String.class);
                }
                ux0Var.f42672b = (String) this.f43017c.c(aVar);
                boolean[] zArr3 = ux0Var.f42674d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new xx0(ux0Var.f42671a, ux0Var.f42672b, ux0Var.f42673c, ux0Var.f42674d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        xx0 xx0Var = (xx0) obj;
        if (xx0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xx0Var.f43830d;
        int length = zArr.length;
        nm.o oVar = this.f43015a;
        if (length > 0 && zArr[0]) {
            if (this.f43017c == null) {
                this.f43017c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43017c;
            um.c h10 = cVar.h("id");
            str2 = xx0Var.f43827a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43017c == null) {
                this.f43017c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43017c;
            um.c h13 = cVar.h("node_id");
            str = xx0Var.f43828b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43016b == null) {
                this.f43016b = oVar.g(new TypeToken<List<px0>>(this) { // from class: com.pinterest.api.model.UnifiedFiltersData$UnifiedFiltersDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43016b;
            um.c h14 = cVar.h("data");
            list = xx0Var.f43829c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
