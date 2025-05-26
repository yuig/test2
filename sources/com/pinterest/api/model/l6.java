package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class l6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39659a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39660b;

    public l6(nm.o oVar) {
        this.f39659a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n6 n6Var = new n6(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "session_internal")) {
                if (this.f39660b == null) {
                    this.f39660b = a.cb.q(this.f39659a, String.class);
                }
                n6Var.f40338a = (String) this.f39660b.c(aVar);
                boolean[] zArr = n6Var.f40339b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new o6(n6Var.f40338a, n6Var.f40339b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        o6 o6Var = (o6) obj;
        if (o6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o6Var.f40626b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f39660b == null) {
                this.f39660b = a.cb.q(this.f39659a, String.class);
            }
            nm.m mVar = this.f39660b;
            um.c h10 = cVar.h("session_internal");
            str = o6Var.f40625a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
