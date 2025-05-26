package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class m01 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39958a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39959b;

    public m01(nm.o oVar) {
        this.f39958a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        l01 l01Var = new l01(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("subtitle");
            nm.o oVar = this.f39958a;
            if (equals) {
                if (this.f39959b == null) {
                    this.f39959b = a.cb.q(oVar, String.class);
                }
                l01Var.f39617a = (String) this.f39959b.c(aVar);
                boolean[] zArr = l01Var.f39619c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("title")) {
                if (this.f39959b == null) {
                    this.f39959b = a.cb.q(oVar, String.class);
                }
                l01Var.f39618b = (String) this.f39959b.c(aVar);
                boolean[] zArr2 = l01Var.f39619c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new o01(l01Var.f39617a, l01Var.f39618b, l01Var.f39619c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        o01 o01Var = (o01) obj;
        if (o01Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o01Var.f40584c;
        int length = zArr.length;
        nm.o oVar = this.f39958a;
        if (length > 0 && zArr[0]) {
            if (this.f39959b == null) {
                this.f39959b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39959b;
            um.c h10 = cVar.h("subtitle");
            str2 = o01Var.f40582a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39959b == null) {
                this.f39959b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39959b;
            um.c h13 = cVar.h("title");
            str = o01Var.f40583b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
