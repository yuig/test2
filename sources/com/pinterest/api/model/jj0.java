package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class jj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39076a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39077b;

    public jj0(nm.o oVar) {
        this.f39076a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ij0 ij0Var = new ij0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1221029593) {
                if (hashCode != 113126854) {
                    if (hashCode != 120) {
                        if (hashCode == 121 && k03.equals("y")) {
                            c13 = 2;
                        }
                    } else if (k03.equals("x")) {
                        c13 = 1;
                    }
                } else if (k03.equals("width")) {
                    c13 = 3;
                }
            } else if (k03.equals("height")) {
                c13 = 0;
            }
            nm.o oVar = this.f39076a;
            if (c13 == 0) {
                if (this.f39077b == null) {
                    this.f39077b = a.cb.q(oVar, Double.class);
                }
                ij0Var.f38799a = (Double) this.f39077b.c(aVar);
                boolean[] zArr = ij0Var.f38803e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39077b == null) {
                    this.f39077b = a.cb.q(oVar, Double.class);
                }
                ij0Var.f38801c = (Double) this.f39077b.c(aVar);
                boolean[] zArr2 = ij0Var.f38803e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f39077b == null) {
                    this.f39077b = a.cb.q(oVar, Double.class);
                }
                ij0Var.f38802d = (Double) this.f39077b.c(aVar);
                boolean[] zArr3 = ij0Var.f38803e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39077b == null) {
                    this.f39077b = a.cb.q(oVar, Double.class);
                }
                ij0Var.f38800b = (Double) this.f39077b.c(aVar);
                boolean[] zArr4 = ij0Var.f38803e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new lj0(ij0Var.f38799a, ij0Var.f38800b, ij0Var.f38801c, ij0Var.f38802d, ij0Var.f38803e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        lj0 lj0Var = (lj0) obj;
        if (lj0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lj0Var.f39809e;
        int length = zArr.length;
        nm.o oVar = this.f39076a;
        if (length > 0 && zArr[0]) {
            if (this.f39077b == null) {
                this.f39077b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f39077b;
            um.c h10 = cVar.h("height");
            d15 = lj0Var.f39805a;
            mVar.e(h10, d15);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39077b == null) {
                this.f39077b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f39077b;
            um.c h13 = cVar.h("width");
            d14 = lj0Var.f39806b;
            mVar2.e(h13, d14);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39077b == null) {
                this.f39077b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f39077b;
            um.c h14 = cVar.h("x");
            d13 = lj0Var.f39807c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39077b == null) {
                this.f39077b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f39077b;
            um.c h15 = cVar.h("y");
            d2 = lj0Var.f39808d;
            mVar4.e(h15, d2);
        }
        cVar.g();
    }
}
