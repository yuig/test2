package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class mr extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40197a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40198b;

    public mr(nm.o oVar) {
        this.f40197a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lr lrVar = new lr(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("max_y");
            nm.o oVar = this.f40197a;
            if (equals) {
                if (this.f40198b == null) {
                    this.f40198b = a.cb.q(oVar, Double.class);
                }
                lrVar.f39865a = (Double) this.f40198b.c(aVar);
                boolean[] zArr = lrVar.f39867c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("min_y")) {
                if (this.f40198b == null) {
                    this.f40198b = a.cb.q(oVar, Double.class);
                }
                lrVar.f39866b = (Double) this.f40198b.c(aVar);
                boolean[] zArr2 = lrVar.f39867c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new or(lrVar.f39865a, lrVar.f39866b, lrVar.f39867c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        or orVar = (or) obj;
        if (orVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = orVar.f40784c;
        int length = zArr.length;
        nm.o oVar = this.f40197a;
        if (length > 0 && zArr[0]) {
            if (this.f40198b == null) {
                this.f40198b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f40198b;
            um.c h10 = cVar.h("max_y");
            d13 = orVar.f40782a;
            mVar.e(h10, d13);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40198b == null) {
                this.f40198b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f40198b;
            um.c h13 = cVar.h("min_y");
            d2 = orVar.f40783b;
            mVar2.e(h13, d2);
        }
        cVar.g();
    }
}
