package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class c11 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36276a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36277b;

    public c11(nm.o oVar) {
        this.f36276a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b11 b11Var = new b11(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "session_internal")) {
                if (this.f36277b == null) {
                    this.f36277b = a.cb.q(this.f36276a, String.class);
                }
                b11Var.f35948a = (String) this.f36277b.c(aVar);
                boolean[] zArr = b11Var.f35949b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new e11(b11Var.f35948a, b11Var.f35949b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        e11 e11Var = (e11) obj;
        if (e11Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e11Var.f37034b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f36277b == null) {
                this.f36277b = a.cb.q(this.f36276a, String.class);
            }
            nm.m mVar = this.f36277b;
            um.c h10 = cVar.h("session_internal");
            str = e11Var.f37033a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
