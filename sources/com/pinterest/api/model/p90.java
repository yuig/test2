package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class p90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40921a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40922b;

    public p90(nm.o oVar) {
        this.f40921a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o90 o90Var = new o90(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("link");
            nm.o oVar = this.f40921a;
            if (equals) {
                if (this.f40922b == null) {
                    this.f40922b = a.cb.q(oVar, String.class);
                }
                o90Var.f40652b = (String) this.f40922b.c(aVar);
                boolean[] zArr = o90Var.f40653c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("label")) {
                if (this.f40922b == null) {
                    this.f40922b = a.cb.q(oVar, String.class);
                }
                o90Var.f40651a = (String) this.f40922b.c(aVar);
                boolean[] zArr2 = o90Var.f40653c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new r90(o90Var.f40651a, o90Var.f40652b, o90Var.f40653c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        r90 r90Var = (r90) obj;
        if (r90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = r90Var.f41523c;
        int length = zArr.length;
        nm.o oVar = this.f40921a;
        if (length > 0 && zArr[0]) {
            if (this.f40922b == null) {
                this.f40922b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40922b;
            um.c h10 = cVar.h("label");
            str2 = r90Var.f41521a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40922b == null) {
                this.f40922b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40922b;
            um.c h13 = cVar.h("link");
            str = r90Var.f41522b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
