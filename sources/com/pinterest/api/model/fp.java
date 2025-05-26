package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class fp extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37734a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37735b;

    public fp(nm.o oVar) {
        this.f37734a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ep epVar = new ep(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "board_id")) {
                if (this.f37735b == null) {
                    this.f37735b = a.cb.q(this.f37734a, String.class);
                }
                epVar.f37315a = (String) this.f37735b.c(aVar);
                boolean[] zArr = epVar.f37316b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new hp(epVar.f37315a, epVar.f37316b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        hp hpVar = (hp) obj;
        if (hpVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hpVar.f38510b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f37735b == null) {
                this.f37735b = a.cb.q(this.f37734a, String.class);
            }
            nm.m mVar = this.f37735b;
            um.c h10 = cVar.h("board_id");
            str = hpVar.f38509a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
