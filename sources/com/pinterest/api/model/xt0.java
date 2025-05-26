package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class xt0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43790a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43791b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43792c;

    public xt0(nm.o oVar) {
        this.f43790a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wt0 wt0Var = new wt0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("verification_configs");
            nm.o oVar = this.f43790a;
            if (equals) {
                if (this.f43792c == null) {
                    this.f43792c = oVar.g(new TypeToken<List<vt0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdVerificationData$ThirdPartyAdVerificationDataTypeAdapter$2
                    }).b();
                }
                wt0Var.f43374b = (List) this.f43792c.c(aVar);
                boolean[] zArr = wt0Var.f43375c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("is_enabled")) {
                if (this.f43791b == null) {
                    this.f43791b = a.cb.q(oVar, Boolean.class);
                }
                wt0Var.f43373a = (Boolean) this.f43791b.c(aVar);
                boolean[] zArr2 = wt0Var.f43375c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new zt0(wt0Var.f43373a, wt0Var.f43374b, wt0Var.f43375c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Boolean bool;
        zt0 zt0Var = (zt0) obj;
        if (zt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zt0Var.f44461c;
        int length = zArr.length;
        nm.o oVar = this.f43790a;
        if (length > 0 && zArr[0]) {
            if (this.f43791b == null) {
                this.f43791b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f43791b;
            um.c h10 = cVar.h("is_enabled");
            bool = zt0Var.f44459a;
            mVar.e(h10, bool);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43792c == null) {
                this.f43792c = oVar.g(new TypeToken<List<vt0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdVerificationData$ThirdPartyAdVerificationDataTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f43792c;
            um.c h13 = cVar.h("verification_configs");
            list = zt0Var.f44460b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
