package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class mg extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40104a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40105b;

    public mg(nm.o oVar) {
        this.f40104a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lg lgVar = new lg(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "image_urls")) {
                if (this.f40105b == null) {
                    this.f40105b = this.f40104a.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.DataModelsUrls$DataModelsUrlsTypeAdapter$2
                    }).b();
                }
                lgVar.f39746a = (Map) this.f40105b.c(aVar);
                boolean[] zArr = lgVar.f39747b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new og(lgVar.f39746a, lgVar.f39747b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        og ogVar = (og) obj;
        if (ogVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ogVar.f40701b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40105b == null) {
                this.f40105b = this.f40104a.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.DataModelsUrls$DataModelsUrlsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40105b;
            um.c h10 = cVar.h("image_urls");
            map = ogVar.f40700a;
            mVar.e(h10, map);
        }
        cVar.g();
    }
}
