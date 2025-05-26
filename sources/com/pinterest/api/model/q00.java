package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class q00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41158a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41159b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41160c;

    public q00(nm.o oVar) {
        this.f41158a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p00 p00Var = new p00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("text");
            nm.o oVar = this.f41158a;
            if (equals) {
                if (this.f41160c == null) {
                    this.f41160c = a.cb.q(oVar, String.class);
                }
                p00Var.f40847b = (String) this.f41160c.c(aVar);
                boolean[] zArr = p00Var.f40848c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("option_id")) {
                if (this.f41159b == null) {
                    this.f41159b = a.cb.q(oVar, Integer.class);
                }
                p00Var.f40846a = (Integer) this.f41159b.c(aVar);
                boolean[] zArr2 = p00Var.f40848c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new s00(p00Var.f40846a, p00Var.f40847b, p00Var.f40848c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        s00 s00Var = (s00) obj;
        if (s00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s00Var.f41746c;
        int length = zArr.length;
        nm.o oVar = this.f41158a;
        if (length > 0 && zArr[0]) {
            if (this.f41159b == null) {
                this.f41159b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f41159b;
            um.c h10 = cVar.h("option_id");
            num = s00Var.f41744a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41160c == null) {
                this.f41160c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41160c;
            um.c h13 = cVar.h("text");
            str = s00Var.f41745b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
