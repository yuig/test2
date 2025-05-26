package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class u0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42372a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42373b;

    public u0(nm.o oVar) {
        this.f42372a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        w0 w0Var = new w0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "data")) {
                if (this.f42373b == null) {
                    this.f42373b = this.f42372a.g(new TypeToken<List<t0>>(this) { // from class: com.pinterest.api.model.AddressBookEmailContacts$AddressBookEmailContactsTypeAdapter$2
                    }).b();
                }
                w0Var.f43122a = (List) this.f42373b.c(aVar);
                boolean[] zArr = w0Var.f43123b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new x0(w0Var.f43122a, w0Var.f43123b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        x0 x0Var = (x0) obj;
        if (x0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = x0Var.f43520b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f42373b == null) {
                this.f42373b = this.f42372a.g(new TypeToken<List<t0>>(this) { // from class: com.pinterest.api.model.AddressBookEmailContacts$AddressBookEmailContactsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42373b;
            um.c h10 = cVar.h("data");
            list = x0Var.f43519a;
            mVar.e(h10, list);
        }
        cVar.g();
    }
}
