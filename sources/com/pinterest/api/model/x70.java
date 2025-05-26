package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class x70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43613a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43614b;

    public x70(nm.o oVar) {
        this.f43613a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        w70 w70Var = new w70(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "additional_images")) {
                if (this.f43614b == null) {
                    this.f43614b = this.f43613a.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductPinDataItem$ProductPinDataItemTypeAdapter$2
                    }).b();
                }
                w70Var.f43189a = (List) this.f43614b.c(aVar);
                boolean[] zArr = w70Var.f43190b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new z70(w70Var.f43189a, w70Var.f43190b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        z70 z70Var = (z70) obj;
        if (z70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z70Var.f44241b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f43614b == null) {
                this.f43614b = this.f43613a.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductPinDataItem$ProductPinDataItemTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f43614b;
            um.c h10 = cVar.h("additional_images");
            list = z70Var.f44240a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
