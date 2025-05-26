package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class an extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35806a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35807b;

    public an(nm.o oVar) {
        this.f35806a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zm zmVar = new zm(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -877823861) {
                if (hashCode != 3355) {
                    if (hashCode != 604341972) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("image_signature")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("image_url")) {
                c13 = 0;
            }
            nm.o oVar = this.f35806a;
            if (c13 == 0) {
                if (this.f35807b == null) {
                    this.f35807b = a.cb.q(oVar, String.class);
                }
                zmVar.f44393d = (String) this.f35807b.c(aVar);
                boolean[] zArr = zmVar.f44394e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f35807b == null) {
                    this.f35807b = a.cb.q(oVar, String.class);
                }
                zmVar.f44390a = (String) this.f35807b.c(aVar);
                boolean[] zArr2 = zmVar.f44394e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f35807b == null) {
                    this.f35807b = a.cb.q(oVar, String.class);
                }
                zmVar.f44392c = (String) this.f35807b.c(aVar);
                boolean[] zArr3 = zmVar.f44394e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f35807b == null) {
                    this.f35807b = a.cb.q(oVar, String.class);
                }
                zmVar.f44391b = (String) this.f35807b.c(aVar);
                boolean[] zArr4 = zmVar.f44394e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new cn(zmVar.f44390a, zmVar.f44391b, zmVar.f44392c, zmVar.f44393d, zmVar.f44394e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        cn cnVar = (cn) obj;
        if (cnVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cnVar.f36475e;
        int length = zArr.length;
        nm.o oVar = this.f35806a;
        if (length > 0 && zArr[0]) {
            if (this.f35807b == null) {
                this.f35807b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35807b;
            um.c h10 = cVar.h("id");
            str4 = cnVar.f36471a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35807b == null) {
                this.f35807b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35807b;
            um.c h13 = cVar.h("node_id");
            str3 = cnVar.f36472b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35807b == null) {
                this.f35807b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35807b;
            um.c h14 = cVar.h("image_signature");
            str2 = cnVar.f36473c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35807b == null) {
                this.f35807b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35807b;
            um.c h15 = cVar.h("image_url");
            str = cnVar.f36474d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
