package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class cm extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36466a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36467b;

    public cm(nm.o oVar) {
        this.f36466a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yl ylVar = new yl(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "components")) {
                if (this.f36467b == null) {
                    this.f36467b = this.f36466a.g(new TypeToken<List<bm>>(this) { // from class: com.pinterest.api.model.FormattedDescription$FormattedDescriptionTypeAdapter$2
                    }).b();
                }
                ylVar.f44070a = (List) this.f36467b.c(aVar);
                boolean[] zArr = ylVar.f44071b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new em(ylVar.f44070a, ylVar.f44071b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        em emVar = (em) obj;
        if (emVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = emVar.f37303b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f36467b == null) {
                this.f36467b = this.f36466a.g(new TypeToken<List<bm>>(this) { // from class: com.pinterest.api.model.FormattedDescription$FormattedDescriptionTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36467b;
            um.c h10 = cVar.h("components");
            list = emVar.f37302a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
