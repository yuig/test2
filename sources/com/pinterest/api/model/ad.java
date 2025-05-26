package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ad extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35700a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35701b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35702c;

    public ad(nm.o oVar) {
        this.f35700a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zc zcVar = new zc(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1221029593) {
                if (hashCode != 3355) {
                    if (hashCode != 113126854) {
                        if (hashCode != 2114448504) {
                            if (hashCode != 120) {
                                if (hashCode == 121 && k03.equals("y")) {
                                    c13 = 2;
                                }
                            } else if (k03.equals("x")) {
                                c13 = 1;
                            }
                        } else if (k03.equals("node_id")) {
                            c13 = 5;
                        }
                    } else if (k03.equals("width")) {
                        c13 = 4;
                    }
                } else if (k03.equals("id")) {
                    c13 = 3;
                }
            } else if (k03.equals("height")) {
                c13 = 0;
            }
            nm.o oVar = this.f35700a;
            if (c13 == 0) {
                if (this.f35701b == null) {
                    this.f35701b = a.cb.q(oVar, Double.class);
                }
                zcVar.f44283c = (Double) this.f35701b.c(aVar);
                boolean[] zArr = zcVar.f44287g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f35701b == null) {
                    this.f35701b = a.cb.q(oVar, Double.class);
                }
                zcVar.f44285e = (Double) this.f35701b.c(aVar);
                boolean[] zArr2 = zcVar.f44287g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f35701b == null) {
                    this.f35701b = a.cb.q(oVar, Double.class);
                }
                zcVar.f44286f = (Double) this.f35701b.c(aVar);
                boolean[] zArr3 = zcVar.f44287g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f35702c == null) {
                    this.f35702c = a.cb.q(oVar, String.class);
                }
                zcVar.f44281a = (String) this.f35702c.c(aVar);
                boolean[] zArr4 = zcVar.f44287g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f35701b == null) {
                    this.f35701b = a.cb.q(oVar, Double.class);
                }
                zcVar.f44284d = (Double) this.f35701b.c(aVar);
                boolean[] zArr5 = zcVar.f44287g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f35702c == null) {
                    this.f35702c = a.cb.q(oVar, String.class);
                }
                zcVar.f44282b = (String) this.f35702c.c(aVar);
                boolean[] zArr6 = zcVar.f44287g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new cd(zcVar.f44281a, zcVar.f44282b, zcVar.f44283c, zcVar.f44284d, zcVar.f44285e, zcVar.f44286f, zcVar.f44287g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        String str;
        String str2;
        cd cdVar = (cd) obj;
        if (cdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cdVar.f36373g;
        int length = zArr.length;
        nm.o oVar = this.f35700a;
        if (length > 0 && zArr[0]) {
            if (this.f35702c == null) {
                this.f35702c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35702c;
            um.c h10 = cVar.h("id");
            str2 = cdVar.f36367a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35702c == null) {
                this.f35702c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35702c;
            um.c h13 = cVar.h("node_id");
            str = cdVar.f36368b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35701b == null) {
                this.f35701b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f35701b;
            um.c h14 = cVar.h("height");
            d15 = cdVar.f36369c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35701b == null) {
                this.f35701b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f35701b;
            um.c h15 = cVar.h("width");
            d14 = cdVar.f36370d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35701b == null) {
                this.f35701b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f35701b;
            um.c h16 = cVar.h("x");
            d13 = cdVar.f36371e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35701b == null) {
                this.f35701b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f35701b;
            um.c h17 = cVar.h("y");
            d2 = cdVar.f36372f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
