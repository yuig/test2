package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class t70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42111a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42112b;

    public t70(nm.o oVar) {
        this.f42111a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        s70 s70Var = new s70(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "items")) {
                if (this.f42112b == null) {
                    this.f42112b = this.f42111a.g(new TypeToken<List<z70>>(this) { // from class: com.pinterest.api.model.ProductPinData$ProductPinDataTypeAdapter$2
                    }).b();
                }
                s70Var.f41825a = (List) this.f42112b.c(aVar);
                boolean[] zArr = s70Var.f41826b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new v70(s70Var.f41825a, s70Var.f41826b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        v70 v70Var = (v70) obj;
        if (v70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = v70Var.f42778b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f42112b == null) {
                this.f42112b = this.f42111a.g(new TypeToken<List<z70>>(this) { // from class: com.pinterest.api.model.ProductPinData$ProductPinDataTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42112b;
            um.c h10 = cVar.h("items");
            list = v70Var.f42777a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
