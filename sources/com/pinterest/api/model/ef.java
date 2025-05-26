package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ef extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37258a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37259b;

    public ef(nm.o oVar) {
        this.f37258a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        df dfVar = new df(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("h");
            nm.o oVar = this.f37258a;
            if (equals) {
                if (this.f37259b == null) {
                    this.f37259b = a.cb.q(oVar, Integer.class);
                }
                dfVar.f36817a = (Integer) this.f37259b.c(aVar);
                boolean[] zArr = dfVar.f36819c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("m")) {
                if (this.f37259b == null) {
                    this.f37259b = a.cb.q(oVar, Integer.class);
                }
                dfVar.f36818b = (Integer) this.f37259b.c(aVar);
                boolean[] zArr2 = dfVar.f36819c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new gf(dfVar.f36817a, dfVar.f36818b, dfVar.f36819c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        gf gfVar = (gf) obj;
        if (gfVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gfVar.f38058c;
        int length = zArr.length;
        nm.o oVar = this.f37258a;
        if (length > 0 && zArr[0]) {
            if (this.f37259b == null) {
                this.f37259b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f37259b;
            um.c h10 = cVar.h("h");
            num2 = gfVar.f38056a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37259b == null) {
                this.f37259b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f37259b;
            um.c h13 = cVar.h("m");
            num = gfVar.f38057b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
