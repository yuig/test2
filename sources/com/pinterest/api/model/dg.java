package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class dg extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36820a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36821b;

    public dg(nm.o oVar) {
        this.f36820a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cg cgVar = new cg(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("engagement_goal");
            nm.o oVar = this.f36820a;
            if (equals) {
                if (this.f36821b == null) {
                    this.f36821b = a.cb.q(oVar, Integer.class);
                }
                cgVar.f36413b = (Integer) this.f36821b.c(aVar);
                boolean[] zArr = cgVar.f36414c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("engagement_count")) {
                if (this.f36821b == null) {
                    this.f36821b = a.cb.q(oVar, Integer.class);
                }
                cgVar.f36412a = (Integer) this.f36821b.c(aVar);
                boolean[] zArr2 = cgVar.f36414c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new fg(cgVar.f36412a, cgVar.f36413b, cgVar.f36414c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        fg fgVar = (fg) obj;
        if (fgVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fgVar.f37661c;
        int length = zArr.length;
        nm.o oVar = this.f36820a;
        if (length > 0 && zArr[0]) {
            if (this.f36821b == null) {
                this.f36821b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f36821b;
            um.c h10 = cVar.h("engagement_count");
            num2 = fgVar.f37659a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36821b == null) {
                this.f36821b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f36821b;
            um.c h13 = cVar.h("engagement_goal");
            num = fgVar.f37660b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
