package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class xk0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43733a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43734b;

    public xk0(nm.o oVar) {
        this.f43733a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wk0 wk0Var = new wk0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1466589265:
                    if (k03.equals("y_coord")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -40300674:
                    if (k03.equals("rotation")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 48012732:
                    if (k03.equals("corner_radius")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 113126854:
                    if (k03.equals("width")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1940874350:
                    if (k03.equals("x_coord")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43733a;
            if (c13 == 0) {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43284f = (Double) this.f43734b.c(aVar);
                boolean[] zArr = wk0Var.f43285g;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
            } else if (c13 == 1) {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43280b = (Double) this.f43734b.c(aVar);
                boolean[] zArr2 = wk0Var.f43285g;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43281c = (Double) this.f43734b.c(aVar);
                boolean[] zArr3 = wk0Var.f43285g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43279a = (Double) this.f43734b.c(aVar);
                boolean[] zArr4 = wk0Var.f43285g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43282d = (Double) this.f43734b.c(aVar);
                boolean[] zArr5 = wk0Var.f43285g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43734b == null) {
                    this.f43734b = a.cb.q(oVar, Double.class);
                }
                wk0Var.f43283e = (Double) this.f43734b.c(aVar);
                boolean[] zArr6 = wk0Var.f43285g;
                if (zArr6.length > 4) {
                    zArr6[4] = true;
                }
            }
        }
        aVar.g();
        return wk0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        Double d17;
        zk0 zk0Var = (zk0) obj;
        if (zk0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zk0Var.f44380g;
        int length = zArr.length;
        nm.o oVar = this.f43733a;
        if (length > 0 && zArr[0]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f43734b;
            um.c h10 = cVar.h("corner_radius");
            d17 = zk0Var.f44374a;
            mVar.e(h10, d17);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f43734b;
            um.c h13 = cVar.h("height");
            d16 = zk0Var.f44375b;
            mVar2.e(h13, d16);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f43734b;
            um.c h14 = cVar.h("rotation");
            d15 = zk0Var.f44376c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f43734b;
            um.c h15 = cVar.h("width");
            d14 = zk0Var.f44377d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f43734b;
            um.c h16 = cVar.h("x_coord");
            d13 = zk0Var.f44378e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43734b == null) {
                this.f43734b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f43734b;
            um.c h17 = cVar.h("y_coord");
            d2 = zk0Var.f44379f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
