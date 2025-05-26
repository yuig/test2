package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class nz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40554a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40555b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40556c;

    public nz0(nm.o oVar) {
        this.f40554a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mz0 mz0Var = new mz0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("official_user");
            nm.o oVar = this.f40554a;
            if (equals) {
                if (this.f40556c == null) {
                    this.f40556c = a.cb.q(oVar, wy0.class);
                }
                mz0Var.f40268b = (wy0) this.f40556c.c(aVar);
                boolean[] zArr = mz0Var.f40269c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("id")) {
                if (this.f40555b == null) {
                    this.f40555b = a.cb.q(oVar, String.class);
                }
                mz0Var.b((String) this.f40555b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return mz0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        String str;
        pz0 pz0Var = (pz0) obj;
        if (pz0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pz0Var.f41146c;
        int length = zArr.length;
        nm.o oVar = this.f40554a;
        if (length > 0 && zArr[0]) {
            if (this.f40555b == null) {
                this.f40555b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40555b;
            um.c h10 = cVar.h("id");
            str = pz0Var.f41144a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40556c == null) {
                this.f40556c = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar2 = this.f40556c;
            um.c h13 = cVar.h("official_user");
            wy0Var = pz0Var.f41145b;
            mVar2.e(h13, wy0Var);
        }
        cVar.g();
    }
}
