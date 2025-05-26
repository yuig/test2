package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ev extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37354a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37355b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37356c;

    public ev(nm.o oVar) {
        this.f37354a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dv dvVar = new dv(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("upload_space");
            nm.o oVar = this.f37354a;
            if (equals) {
                if (this.f37356c == null) {
                    this.f37356c = a.cb.q(oVar, jy0.class);
                }
                dvVar.f36968b = (jy0) this.f37356c.c(aVar);
                boolean[] zArr = dvVar.f36969c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("credentials")) {
                if (this.f37355b == null) {
                    this.f37355b = a.cb.q(oVar, yu.class);
                }
                dvVar.f36967a = (yu) this.f37355b.c(aVar);
                boolean[] zArr2 = dvVar.f36969c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new gv(dvVar.f36967a, dvVar.f36968b, dvVar.f36969c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        jy0 jy0Var;
        yu yuVar;
        gv gvVar = (gv) obj;
        if (gvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gvVar.f38157c;
        int length = zArr.length;
        nm.o oVar = this.f37354a;
        if (length > 0 && zArr[0]) {
            if (this.f37355b == null) {
                this.f37355b = a.cb.q(oVar, yu.class);
            }
            nm.m mVar = this.f37355b;
            um.c h10 = cVar.h("credentials");
            yuVar = gvVar.f38155a;
            mVar.e(h10, yuVar);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37356c == null) {
                this.f37356c = a.cb.q(oVar, jy0.class);
            }
            nm.m mVar2 = this.f37356c;
            um.c h13 = cVar.h("upload_space");
            jy0Var = gvVar.f38156b;
            mVar2.e(h13, jy0Var);
        }
        cVar.g();
    }
}
