package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ed0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37245a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37246b;

    public ed0(nm.o oVar) {
        this.f37245a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dd0 dd0Var = new dd0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f37246b == null) {
                    this.f37246b = this.f37245a.g(new TypeToken<List<cd0>>(this) { // from class: com.pinterest.api.model.ReportReasons$ReportReasonsTypeAdapter$2
                    }).b();
                }
                dd0Var.f36734a = (List) this.f37246b.c(aVar);
                boolean[] zArr = dd0Var.f36735b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new gd0(dd0Var.f36734a, dd0Var.f36735b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        gd0 gd0Var = (gd0) obj;
        if (gd0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gd0Var.f38047b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f37246b == null) {
                this.f37246b = this.f37245a.g(new TypeToken<List<cd0>>(this) { // from class: com.pinterest.api.model.ReportReasons$ReportReasonsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f37246b;
            um.c h10 = cVar.h("data");
            list = gd0Var.f38046a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
