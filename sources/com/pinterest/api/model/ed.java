package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ed extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37242a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37243b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37244c;

    public ed(nm.o oVar) {
        this.f37242a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dd ddVar = new dd(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1221029593) {
                if (hashCode != 3355) {
                    if (hashCode != 113126854) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("width")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("height")) {
                c13 = 0;
            }
            nm.o oVar = this.f37242a;
            if (c13 == 0) {
                if (this.f37243b == null) {
                    this.f37243b = a.cb.q(oVar, Double.class);
                }
                ddVar.f36731c = (Double) this.f37243b.c(aVar);
                boolean[] zArr = ddVar.f36733e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f37244c == null) {
                    this.f37244c = a.cb.q(oVar, String.class);
                }
                ddVar.f36729a = (String) this.f37244c.c(aVar);
                boolean[] zArr2 = ddVar.f36733e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f37243b == null) {
                    this.f37243b = a.cb.q(oVar, Double.class);
                }
                ddVar.f36732d = (Double) this.f37243b.c(aVar);
                boolean[] zArr3 = ddVar.f36733e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f37244c == null) {
                    this.f37244c = a.cb.q(oVar, String.class);
                }
                ddVar.f36730b = (String) this.f37244c.c(aVar);
                boolean[] zArr4 = ddVar.f36733e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new gd(ddVar.f36729a, ddVar.f36730b, ddVar.f36731c, ddVar.f36732d, ddVar.f36733e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        String str;
        String str2;
        gd gdVar = (gd) obj;
        if (gdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gdVar.f38045e;
        int length = zArr.length;
        nm.o oVar = this.f37242a;
        if (length > 0 && zArr[0]) {
            if (this.f37244c == null) {
                this.f37244c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37244c;
            um.c h10 = cVar.h("id");
            str2 = gdVar.f38041a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37244c == null) {
                this.f37244c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37244c;
            um.c h13 = cVar.h("node_id");
            str = gdVar.f38042b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37243b == null) {
                this.f37243b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f37243b;
            um.c h14 = cVar.h("height");
            d13 = gdVar.f38043c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37243b == null) {
                this.f37243b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f37243b;
            um.c h15 = cVar.h("width");
            d2 = gdVar.f38044d;
            mVar4.e(h15, d2);
        }
        cVar.g();
    }
}
