package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class c70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36319a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36320b;

    public c70(nm.o oVar) {
        this.f36319a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b70 b70Var = new b70(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "privacy_url")) {
                if (this.f36320b == null) {
                    this.f36320b = a.cb.q(this.f36319a, String.class);
                }
                b70Var.f36007a = (String) this.f36320b.c(aVar);
                boolean[] zArr = b70Var.f36008b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new e70(b70Var.f36007a, b70Var.f36008b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        e70 e70Var = (e70) obj;
        if (e70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e70Var.f37195b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f36320b == null) {
                this.f36320b = a.cb.q(this.f36319a, String.class);
            }
            nm.m mVar = this.f36320b;
            um.c h10 = cVar.h("privacy_url");
            str = e70Var.f37194a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
