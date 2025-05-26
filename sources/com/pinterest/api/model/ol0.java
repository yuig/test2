package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class ol0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40751a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40752b;

    public ol0(nm.o oVar) {
        this.f40751a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        nl0 nl0Var = new nl0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "difficulty")) {
                if (this.f40752b == null) {
                    this.f40752b = a.cb.q(this.f40751a, Integer.class);
                }
                nl0Var.b((Integer) this.f40752b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return nl0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        ql0 ql0Var = (ql0) obj;
        if (ql0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ql0Var.f41333b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f40752b == null) {
                this.f40752b = a.cb.q(this.f40751a, Integer.class);
            }
            nm.m mVar = this.f40752b;
            um.c h10 = cVar.h("difficulty");
            num = ql0Var.f41332a;
            mVar.e(h10, num);
        }
        cVar.g();
    }
}
