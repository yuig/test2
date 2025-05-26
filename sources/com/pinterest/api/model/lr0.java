package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class lr0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39868a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39869b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39870c;

    public lr0(nm.o oVar) {
        this.f39868a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        kr0 kr0Var = new kr0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("values");
            nm.o oVar = this.f39868a;
            if (equals) {
                if (this.f39869b == null) {
                    this.f39869b = oVar.g(new TypeToken<List<Double>>(this) { // from class: com.pinterest.api.model.SurveyCondition$SurveyConditionTypeAdapter$2
                    }).b();
                }
                kr0Var.f39519b = (List) this.f39869b.c(aVar);
                boolean[] zArr = kr0Var.f39520c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("operator")) {
                if (this.f39870c == null) {
                    this.f39870c = a.cb.q(oVar, String.class);
                }
                kr0Var.f39518a = (String) this.f39870c.c(aVar);
                boolean[] zArr2 = kr0Var.f39520c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new nr0(kr0Var.f39518a, kr0Var.f39519b, kr0Var.f39520c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        nr0 nr0Var = (nr0) obj;
        if (nr0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nr0Var.f40471c;
        int length = zArr.length;
        nm.o oVar = this.f39868a;
        if (length > 0 && zArr[0]) {
            if (this.f39870c == null) {
                this.f39870c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39870c;
            um.c h10 = cVar.h("operator");
            str = nr0Var.f40469a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39869b == null) {
                this.f39869b = oVar.g(new TypeToken<List<Double>>(this) { // from class: com.pinterest.api.model.SurveyCondition$SurveyConditionTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f39869b;
            um.c h13 = cVar.h("values");
            list = nr0Var.f40470b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
