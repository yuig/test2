package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class mf extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40085a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40086b;

    public mf(nm.o oVar) {
        this.f40085a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lf lfVar = new lf(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f40086b == null) {
                    this.f40086b = this.f40085a.g(new TypeToken<List<sf>>(this) { // from class: com.pinterest.api.model.CountriesPhoneCodes$CountriesPhoneCodesTypeAdapter$2
                    }).b();
                }
                lfVar.f39736a = (List) this.f40086b.c(aVar);
                boolean[] zArr = lfVar.f39737b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new of(lfVar.f39736a, lfVar.f39737b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        of ofVar = (of) obj;
        if (ofVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ofVar.f40699b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40086b == null) {
                this.f40086b = this.f40085a.g(new TypeToken<List<sf>>(this) { // from class: com.pinterest.api.model.CountriesPhoneCodes$CountriesPhoneCodesTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40086b;
            um.c h10 = cVar.h("data");
            list = ofVar.f40698a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
