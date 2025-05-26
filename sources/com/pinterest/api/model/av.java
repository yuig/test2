package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class av extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35871a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35872b;

    public av(nm.o oVar) {
        this.f35871a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zu zuVar = new zu(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "credentials")) {
                if (this.f35872b == null) {
                    this.f35872b = a.cb.q(this.f35871a, yu.class);
                }
                zuVar.f44462a = (yu) this.f35872b.c(aVar);
                boolean[] zArr = zuVar.f44463b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new cv(zuVar.f44462a, zuVar.f44463b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        yu yuVar;
        cv cvVar = (cv) obj;
        if (cvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cvVar.f36536b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f35872b == null) {
                this.f35872b = a.cb.q(this.f35871a, yu.class);
            }
            nm.m mVar = this.f35872b;
            um.c h10 = cVar.h("credentials");
            yuVar = cvVar.f36535a;
            mVar.e(h10, yuVar);
        }
        cVar.g();
    }
}
