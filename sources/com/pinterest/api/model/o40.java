package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class o40 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40623a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40624b;

    public o40(nm.o oVar) {
        this.f40623a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n40 n40Var = new n40(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "results")) {
                if (this.f40624b == null) {
                    this.f40624b = this.f40623a.g(new TypeToken<List<m40>>(this) { // from class: com.pinterest.api.model.PinInterestTagSuggestions$PinInterestTagSuggestionsTypeAdapter$2
                    }).b();
                }
                n40Var.f40331a = (List) this.f40624b.c(aVar);
                boolean[] zArr = n40Var.f40332b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new q40(n40Var.f40331a, n40Var.f40332b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        q40 q40Var = (q40) obj;
        if (q40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = q40Var.f41209b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40624b == null) {
                this.f40624b = this.f40623a.g(new TypeToken<List<m40>>(this) { // from class: com.pinterest.api.model.PinInterestTagSuggestions$PinInterestTagSuggestionsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40624b;
            um.c h10 = cVar.h("results");
            list = q40Var.f41208a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
