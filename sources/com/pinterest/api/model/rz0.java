package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class rz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41732a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41733b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41734c;

    public rz0(nm.o oVar) {
        this.f41732a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qz0 c13 = tz0.c();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("verified");
            nm.o oVar = this.f41732a;
            if (equals) {
                if (this.f41733b == null) {
                    this.f41733b = a.cb.q(oVar, Boolean.class);
                }
                c13.c((Boolean) this.f41733b.c(aVar));
            } else if (k03.equals("name")) {
                if (this.f41734c == null) {
                    this.f41734c = a.cb.q(oVar, String.class);
                }
                c13.b((String) this.f41734c.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return c13.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        String str;
        tz0 tz0Var = (tz0) obj;
        if (tz0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tz0Var.f42369c;
        int length = zArr.length;
        nm.o oVar = this.f41732a;
        if (length > 0 && zArr[0]) {
            if (this.f41734c == null) {
                this.f41734c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41734c;
            um.c h10 = cVar.h("name");
            str = tz0Var.f42367a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41733b == null) {
                this.f41733b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f41733b;
            um.c h13 = cVar.h("verified");
            bool = tz0Var.f42368b;
            mVar2.e(h13, bool);
        }
        cVar.g();
    }
}
