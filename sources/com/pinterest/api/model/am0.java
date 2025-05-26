package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class am0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35804a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35805b;

    public am0(nm.o oVar) {
        this.f35804a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zl0 zl0Var = new zl0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("all");
            nm.o oVar = this.f35804a;
            if (equals) {
                if (this.f35805b == null) {
                    this.f35805b = oVar.g(new TypeToken<List<yl0>>(this) { // from class: com.pinterest.api.model.StoryPinFonts$StoryPinFontsTypeAdapter$3
                    }).b();
                }
                zl0Var.f44387a = (List) this.f35805b.c(aVar);
                boolean[] zArr = zl0Var.f44389c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("tags")) {
                if (this.f35805b == null) {
                    this.f35805b = oVar.g(new TypeToken<List<yl0>>(this) { // from class: com.pinterest.api.model.StoryPinFonts$StoryPinFontsTypeAdapter$4
                    }).b();
                }
                zl0Var.f44388b = (List) this.f35805b.c(aVar);
                boolean[] zArr2 = zl0Var.f44389c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new cm0(zl0Var.f44387a, zl0Var.f44388b, zl0Var.f44389c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        cm0 cm0Var = (cm0) obj;
        if (cm0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cm0Var.f36470c;
        int length = zArr.length;
        nm.o oVar = this.f35804a;
        if (length > 0 && zArr[0]) {
            if (this.f35805b == null) {
                this.f35805b = oVar.g(new TypeToken<List<yl0>>(this) { // from class: com.pinterest.api.model.StoryPinFonts$StoryPinFontsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f35805b;
            um.c h10 = cVar.h("all");
            list2 = cm0Var.f36468a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35805b == null) {
                this.f35805b = oVar.g(new TypeToken<List<yl0>>(this) { // from class: com.pinterest.api.model.StoryPinFonts$StoryPinFontsTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f35805b;
            um.c h13 = cVar.h("tags");
            list = cm0Var.f36469b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
