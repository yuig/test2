package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class va extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42800a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42801b;

    public va(nm.o oVar) {
        this.f42800a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xa xaVar = new xa(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "pin_bookmark")) {
                if (this.f42801b == null) {
                    this.f42801b = a.cb.q(this.f42800a, String.class);
                }
                xaVar.f43634a = (String) this.f42801b.c(aVar);
                boolean[] zArr = xaVar.f43635b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ya(xaVar.f43634a, xaVar.f43635b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        ya yaVar = (ya) obj;
        if (yaVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yaVar.f43987b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f42801b == null) {
                this.f42801b = a.cb.q(this.f42800a, String.class);
            }
            nm.m mVar = this.f42801b;
            um.c h10 = cVar.h("pin_bookmark");
            str = yaVar.f43986a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
