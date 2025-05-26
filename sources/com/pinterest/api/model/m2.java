package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class m2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39975a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39976b;

    public m2(nm.o oVar) {
        this.f39975a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o2 o2Var = new o2(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f39976b == null) {
                    this.f39976b = this.f39975a.g(new TypeToken<List<l2>>(this) { // from class: com.pinterest.api.model.AdvertiserPins$AdvertiserPinsTypeAdapter$2
                    }).b();
                }
                o2Var.f40598a = (List) this.f39976b.c(aVar);
                boolean[] zArr = o2Var.f40599b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new p2(o2Var.f40598a, o2Var.f40599b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        p2 p2Var = (p2) obj;
        if (p2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = p2Var.f40856b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f39976b == null) {
                this.f39976b = this.f39975a.g(new TypeToken<List<l2>>(this) { // from class: com.pinterest.api.model.AdvertiserPins$AdvertiserPinsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f39976b;
            um.c h10 = cVar.h("data");
            list = p2Var.f40855a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
