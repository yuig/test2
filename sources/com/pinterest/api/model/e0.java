package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class e0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37000a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37001b;

    public e0(nm.o oVar) {
        this.f37000a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        g0 g0Var = new g0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "answers")) {
                if (this.f37001b == null) {
                    this.f37001b = this.f37000a.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AdLeadFormV2$AdLeadFormV2TypeAdapter$2
                    }).b();
                }
                g0Var.f37887a = (List) this.f37001b.c(aVar);
                boolean[] zArr = g0Var.f37888b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new h0(g0Var.f37887a, g0Var.f37888b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        h0 h0Var = (h0) obj;
        if (h0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = h0Var.f38209b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f37001b == null) {
                this.f37001b = this.f37000a.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AdLeadFormV2$AdLeadFormV2TypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f37001b;
            um.c h10 = cVar.h("answers");
            list = h0Var.f38208a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
