package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class nb extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40379a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40380b;

    public nb(nm.o oVar) {
        this.f40379a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mb mbVar = new mb(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f40380b == null) {
                    this.f40380b = this.f40379a.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.BusinessAccountType$BusinessAccountTypeTypeAdapter$2
                    }).b();
                }
                mbVar.f40048a = (List) this.f40380b.c(aVar);
                boolean[] zArr = mbVar.f40049b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new pb(mbVar.f40048a, mbVar.f40049b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        pb pbVar = (pb) obj;
        if (pbVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pbVar.f40932b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40380b == null) {
                this.f40380b = this.f40379a.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.BusinessAccountType$BusinessAccountTypeTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40380b;
            um.c h10 = cVar.h("data");
            list = pbVar.f40931a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
