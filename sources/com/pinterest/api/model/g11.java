package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class g11 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37903a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37904b;

    public g11(nm.o oVar) {
        this.f37903a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f11 f11Var = new f11(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("pin_id");
            nm.o oVar = this.f37903a;
            if (equals) {
                if (this.f37904b == null) {
                    this.f37904b = a.cb.q(oVar, String.class);
                }
                f11Var.b((String) this.f37904b.c(aVar));
            } else if (k03.equals("session_id")) {
                if (this.f37904b == null) {
                    this.f37904b = a.cb.q(oVar, String.class);
                }
                f11Var.c((String) this.f37904b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return f11Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        i11 i11Var = (i11) obj;
        if (i11Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i11Var.f38598c;
        int length = zArr.length;
        nm.o oVar = this.f37903a;
        if (length > 0 && zArr[0]) {
            if (this.f37904b == null) {
                this.f37904b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37904b;
            um.c h10 = cVar.h("pin_id");
            str2 = i11Var.f38596a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37904b == null) {
                this.f37904b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37904b;
            um.c h13 = cVar.h("session_id");
            str = i11Var.f38597b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
