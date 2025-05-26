package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class dy extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36990a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36991b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36992c;

    public dy(nm.o oVar) {
        this.f36990a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cy cyVar = new cy(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1724546052) {
                if (hashCode != -1377687758) {
                    if (hashCode == 110371416 && k03.equals("title")) {
                        c13 = 2;
                    }
                } else if (k03.equals("button")) {
                    c13 = 1;
                }
            } else if (k03.equals("description")) {
                c13 = 0;
            }
            nm.o oVar = this.f36990a;
            if (c13 == 0) {
                if (this.f36991b == null) {
                    this.f36991b = a.cb.q(oVar, tm.class);
                }
                cyVar.f36564b = (tm) this.f36991b.c(aVar);
                boolean[] zArr = cyVar.f36566d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f36992c == null) {
                    this.f36992c = a.cb.q(oVar, jy.class);
                }
                cyVar.f36563a = (jy) this.f36992c.c(aVar);
                boolean[] zArr2 = cyVar.f36566d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f36991b == null) {
                    this.f36991b = a.cb.q(oVar, tm.class);
                }
                cyVar.f36565c = (tm) this.f36991b.c(aVar);
                boolean[] zArr3 = cyVar.f36566d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new fy(cyVar.f36563a, cyVar.f36564b, cyVar.f36565c, cyVar.f36566d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        tm tmVar;
        tm tmVar2;
        jy jyVar;
        fy fyVar = (fy) obj;
        if (fyVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fyVar.f37853d;
        int length = zArr.length;
        nm.o oVar = this.f36990a;
        if (length > 0 && zArr[0]) {
            if (this.f36992c == null) {
                this.f36992c = a.cb.q(oVar, jy.class);
            }
            nm.m mVar = this.f36992c;
            um.c h10 = cVar.h("button");
            jyVar = fyVar.f37850a;
            mVar.e(h10, jyVar);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36991b == null) {
                this.f36991b = a.cb.q(oVar, tm.class);
            }
            nm.m mVar2 = this.f36991b;
            um.c h13 = cVar.h("description");
            tmVar2 = fyVar.f37851b;
            mVar2.e(h13, tmVar2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36991b == null) {
                this.f36991b = a.cb.q(oVar, tm.class);
            }
            nm.m mVar3 = this.f36991b;
            um.c h14 = cVar.h("title");
            tmVar = fyVar.f37852c;
            mVar3.e(h14, tmVar);
        }
        cVar.g();
    }
}
