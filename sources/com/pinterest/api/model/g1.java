package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class g1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37899a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37900b;

    public g1(nm.o oVar) {
        this.f37899a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        i1 i1Var = new i1(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "api_key")) {
                if (this.f37900b == null) {
                    this.f37900b = a.cb.q(this.f37899a, String.class);
                }
                i1Var.f38589a = (String) this.f37900b.c(aVar);
                boolean[] zArr = i1Var.f38590b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new j1(i1Var.f38589a, i1Var.f38590b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        j1 j1Var = (j1) obj;
        if (j1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = j1Var.f38921b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f37900b == null) {
                this.f37900b = a.cb.q(this.f37899a, String.class);
            }
            nm.m mVar = this.f37900b;
            um.c h10 = cVar.h("api_key");
            str = j1Var.f38920a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
