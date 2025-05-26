package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class sy0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42020a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42021b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42022c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42023d;

    public sy0(nm.o oVar) {
        this.f42020a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ry0 ry0Var = new ry0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3288564) {
                    if (hashCode != 767620096) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("recommendation_type")) {
                        c13 = 2;
                    }
                } else if (k03.equals("keys")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f42020a;
            if (c13 == 0) {
                if (this.f42023d == null) {
                    this.f42023d = a.cb.q(oVar, String.class);
                }
                ry0Var.f41722a = (String) this.f42023d.c(aVar);
                boolean[] zArr = ry0Var.f41726e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42022c == null) {
                    this.f42022c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.UsecaseRecommendationReason$UsecaseRecommendationReasonTypeAdapter$2
                    }).b();
                }
                ry0Var.f41724c = (List) this.f42022c.c(aVar);
                boolean[] zArr2 = ry0Var.f41726e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f42021b == null) {
                    this.f42021b = a.cb.q(oVar, Integer.class);
                }
                ry0Var.f41725d = (Integer) this.f42021b.c(aVar);
                boolean[] zArr3 = ry0Var.f41726e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42023d == null) {
                    this.f42023d = a.cb.q(oVar, String.class);
                }
                ry0Var.f41723b = (String) this.f42023d.c(aVar);
                boolean[] zArr4 = ry0Var.f41726e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new uy0(ry0Var.f41722a, ry0Var.f41723b, ry0Var.f41724c, ry0Var.f41725d, ry0Var.f41726e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        List list;
        String str;
        String str2;
        uy0 uy0Var = (uy0) obj;
        if (uy0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = uy0Var.f42679e;
        int length = zArr.length;
        nm.o oVar = this.f42020a;
        if (length > 0 && zArr[0]) {
            if (this.f42023d == null) {
                this.f42023d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42023d;
            um.c h10 = cVar.h("id");
            str2 = uy0Var.f42675a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42023d == null) {
                this.f42023d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42023d;
            um.c h13 = cVar.h("node_id");
            str = uy0Var.f42676b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42022c == null) {
                this.f42022c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.UsecaseRecommendationReason$UsecaseRecommendationReasonTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42022c;
            um.c h14 = cVar.h("keys");
            list = uy0Var.f42677c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42021b == null) {
                this.f42021b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f42021b;
            um.c h15 = cVar.h("recommendation_type");
            num = uy0Var.f42678d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
