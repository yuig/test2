package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class v8 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42779a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42780b;

    public v8(nm.o oVar) {
        this.f42779a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x8 x8Var = new x8(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("metadata");
            nm.o oVar = this.f42779a;
            if (equals) {
                if (this.f42780b == null) {
                    this.f42780b = a.cb.q(oVar, String.class);
                }
                x8Var.f43615a = (String) this.f42780b.c(aVar);
                boolean[] zArr = x8Var.f43617c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("title")) {
                if (this.f42780b == null) {
                    this.f42780b = a.cb.q(oVar, String.class);
                }
                x8Var.f43616b = (String) this.f42780b.c(aVar);
                boolean[] zArr2 = x8Var.f43617c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new y8(x8Var.f43615a, x8Var.f43616b, x8Var.f43617c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        y8 y8Var = (y8) obj;
        if (y8Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = y8Var.f43972c;
        int length = zArr.length;
        nm.o oVar = this.f42779a;
        if (length > 0 && zArr[0]) {
            if (this.f42780b == null) {
                this.f42780b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42780b;
            um.c h10 = cVar.h("metadata");
            str2 = y8Var.f43970a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42780b == null) {
                this.f42780b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42780b;
            um.c h13 = cVar.h("title");
            str = y8Var.f43971b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
