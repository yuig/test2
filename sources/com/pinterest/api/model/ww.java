package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ww extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43405a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43406b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43407c;

    public ww(nm.o oVar) {
        this.f43405a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vw vwVar = new vw(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 550785075) {
                    if (hashCode != 2037392116) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("skin_tone")) {
                        c13 = 2;
                    }
                } else if (k03.equals("hair_pattern")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f43405a;
            if (c13 == 0) {
                if (this.f43407c == null) {
                    this.f43407c = a.cb.q(oVar, String.class);
                }
                vwVar.f43009a = (String) this.f43407c.c(aVar);
                boolean[] zArr = vwVar.f43013e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f43406b == null) {
                    this.f43406b = a.cb.q(oVar, cx.class);
                }
                vwVar.f43011c = (cx) this.f43406b.c(aVar);
                boolean[] zArr2 = vwVar.f43013e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f43406b == null) {
                    this.f43406b = a.cb.q(oVar, cx.class);
                }
                vwVar.f43012d = (cx) this.f43406b.c(aVar);
                boolean[] zArr3 = vwVar.f43013e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f43407c == null) {
                    this.f43407c = a.cb.q(oVar, String.class);
                }
                vwVar.f43010b = (String) this.f43407c.c(aVar);
                boolean[] zArr4 = vwVar.f43013e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new yw(vwVar.f43009a, vwVar.f43010b, vwVar.f43011c, vwVar.f43012d, vwVar.f43013e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        cx cxVar;
        cx cxVar2;
        String str;
        String str2;
        yw ywVar = (yw) obj;
        if (ywVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ywVar.f44138e;
        int length = zArr.length;
        nm.o oVar = this.f43405a;
        if (length > 0 && zArr[0]) {
            if (this.f43407c == null) {
                this.f43407c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43407c;
            um.c h10 = cVar.h("id");
            str2 = ywVar.f44134a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43407c == null) {
                this.f43407c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43407c;
            um.c h13 = cVar.h("node_id");
            str = ywVar.f44135b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43406b == null) {
                this.f43406b = a.cb.q(oVar, cx.class);
            }
            nm.m mVar3 = this.f43406b;
            um.c h14 = cVar.h("hair_pattern");
            cxVar2 = ywVar.f44136c;
            mVar3.e(h14, cxVar2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43406b == null) {
                this.f43406b = a.cb.q(oVar, cx.class);
            }
            nm.m mVar4 = this.f43406b;
            um.c h15 = cVar.h("skin_tone");
            cxVar = ywVar.f44137d;
            mVar4.e(h15, cxVar);
        }
        cVar.g();
    }
}
