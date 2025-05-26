package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class cq0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36494a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36495b;

    public cq0(nm.o oVar) {
        this.f36494a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bq0 bq0Var = new bq0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "text")) {
                if (this.f36495b == null) {
                    this.f36495b = a.cb.q(this.f36494a, String.class);
                }
                bq0Var.f36167a = (String) this.f36495b.c(aVar);
                boolean[] zArr = bq0Var.f36168b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new eq0(bq0Var.f36167a, bq0Var.f36168b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        eq0 eq0Var = (eq0) obj;
        if (eq0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = eq0Var.f37333b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f36495b == null) {
                this.f36495b = a.cb.q(this.f36494a, String.class);
            }
            nm.m mVar = this.f36495b;
            um.c h10 = cVar.h("text");
            str = eq0Var.f37332a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
