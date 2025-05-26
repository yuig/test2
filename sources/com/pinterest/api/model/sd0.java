package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class sd0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41857a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41858b;

    public sd0(nm.o oVar) {
        this.f41857a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        rd0 rd0Var = new rd0(0);
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
                case 48012732:
                    if (k03.equals("corner_radius")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 113126854:
                    if (k03.equals("width")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1940874350:
                    if (k03.equals("x_coord")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41857a;
            if (c13 == 0) {
                if (this.f41858b == null) {
                    this.f41858b = a.cb.q(oVar, Double.class);
                }
                rd0Var.f41555e = (Double) this.f41858b.c(aVar);
                boolean[] zArr = rd0Var.f41556f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f41858b == null) {
                    this.f41858b = a.cb.q(oVar, Double.class);
                }
                rd0Var.f41552b = (Double) this.f41858b.c(aVar);
                boolean[] zArr2 = rd0Var.f41556f;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f41858b == null) {
                    this.f41858b = a.cb.q(oVar, Double.class);
                }
                rd0Var.f41551a = (Double) this.f41858b.c(aVar);
                boolean[] zArr3 = rd0Var.f41556f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f41858b == null) {
                    this.f41858b = a.cb.q(oVar, Double.class);
                }
                rd0Var.f41553c = (Double) this.f41858b.c(aVar);
                boolean[] zArr4 = rd0Var.f41556f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41858b == null) {
                    this.f41858b = a.cb.q(oVar, Double.class);
                }
                rd0Var.f41554d = (Double) this.f41858b.c(aVar);
                boolean[] zArr5 = rd0Var.f41556f;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            }
        }
        aVar.g();
        return new ud0(rd0Var.f41551a, rd0Var.f41552b, rd0Var.f41553c, rd0Var.f41554d, rd0Var.f41555e, rd0Var.f41556f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        Double d16;
        ud0 ud0Var = (ud0) obj;
        if (ud0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ud0Var.f42523f;
        int length = zArr.length;
        nm.o oVar = this.f41857a;
        if (length > 0 && zArr[0]) {
            if (this.f41858b == null) {
                this.f41858b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f41858b;
            um.c h10 = cVar.h("corner_radius");
            d16 = ud0Var.f42518a;
            mVar.e(h10, d16);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41858b == null) {
                this.f41858b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f41858b;
            um.c h13 = cVar.h("height");
            d15 = ud0Var.f42519b;
            mVar2.e(h13, d15);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41858b == null) {
                this.f41858b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f41858b;
            um.c h14 = cVar.h("width");
            d14 = ud0Var.f42520c;
            mVar3.e(h14, d14);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41858b == null) {
                this.f41858b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f41858b;
            um.c h15 = cVar.h("x_coord");
            d13 = ud0Var.f42521d;
            mVar4.e(h15, d13);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41858b == null) {
                this.f41858b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f41858b;
            um.c h16 = cVar.h("y_coord");
            d2 = ud0Var.f42522e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
