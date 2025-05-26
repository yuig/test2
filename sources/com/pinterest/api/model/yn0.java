package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class yn0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44088a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44089b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44090c;

    public yn0(nm.o oVar) {
        this.f44088a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xn0 xn0Var = new xn0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("text");
            nm.o oVar = this.f44088a;
            if (equals) {
                if (this.f44090c == null) {
                    this.f44090c = a.cb.q(oVar, String.class);
                }
                xn0Var.f43759a = (String) this.f44090c.c(aVar);
                boolean[] zArr = xn0Var.f43761c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("type")) {
                if (this.f44089b == null) {
                    this.f44089b = a.cb.q(oVar, Integer.class);
                }
                xn0Var.f43760b = (Integer) this.f44089b.c(aVar);
                boolean[] zArr2 = xn0Var.f43761c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ao0(xn0Var.f43759a, xn0Var.f43760b, xn0Var.f43761c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        ao0 ao0Var = (ao0) obj;
        if (ao0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ao0Var.f35826c;
        int length = zArr.length;
        nm.o oVar = this.f44088a;
        if (length > 0 && zArr[0]) {
            if (this.f44090c == null) {
                this.f44090c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44090c;
            um.c h10 = cVar.h("text");
            str = ao0Var.f35824a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44089b == null) {
                this.f44089b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f44089b;
            um.c h13 = cVar.h("type");
            num = ao0Var.f35825b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
