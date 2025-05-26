package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class w extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43120a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43121b;

    public w(nm.o oVar) {
        this.f43120a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y yVar = new y(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "url")) {
                if (this.f43121b == null) {
                    this.f43121b = a.cb.q(this.f43120a, String.class);
                }
                yVar.f43857a = (String) this.f43121b.c(aVar);
                boolean[] zArr = yVar.f43858b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new z(yVar.f43857a, yVar.f43858b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        z zVar = (z) obj;
        if (zVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zVar.f44165b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f43121b == null) {
                this.f43121b = a.cb.q(this.f43120a, String.class);
            }
            nm.m mVar = this.f43121b;
            um.c h10 = cVar.h("url");
            str = zVar.f44164a;
            mVar.e(h10, str);
        }
        cVar.g();
    }
}
