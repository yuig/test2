package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class f8 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37588a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37589b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37590c;

    public f8(nm.o oVar) {
        this.f37588a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        h8 h8Var = new h8(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1351982455:
                    if (k03.equals("crop_x")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1351982454:
                    if (k03.equals("crop_y")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
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
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37588a;
            if (c13 == 0) {
                if (this.f37589b == null) {
                    this.f37589b = a.cb.q(oVar, Double.class);
                }
                h8Var.f38328c = (Double) this.f37589b.c(aVar);
                boolean[] zArr = h8Var.f38332g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f37589b == null) {
                    this.f37589b = a.cb.q(oVar, Double.class);
                }
                h8Var.f38329d = (Double) this.f37589b.c(aVar);
                boolean[] zArr2 = h8Var.f38332g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f37589b == null) {
                    this.f37589b = a.cb.q(oVar, Double.class);
                }
                h8Var.f38330e = (Double) this.f37589b.c(aVar);
                boolean[] zArr3 = h8Var.f38332g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f37590c == null) {
                    this.f37590c = a.cb.q(oVar, String.class);
                }
                h8Var.f38326a = (String) this.f37590c.c(aVar);
                boolean[] zArr4 = h8Var.f38332g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f37589b == null) {
                    this.f37589b = a.cb.q(oVar, Double.class);
                }
                h8Var.f38331f = (Double) this.f37589b.c(aVar);
                boolean[] zArr5 = h8Var.f38332g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f37590c == null) {
                    this.f37590c = a.cb.q(oVar, String.class);
                }
                h8Var.f38327b = (String) this.f37590c.c(aVar);
                boolean[] zArr6 = h8Var.f38332g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new i8(h8Var.f38326a, h8Var.f38327b, h8Var.f38328c, h8Var.f38329d, h8Var.f38330e, h8Var.f38331f, h8Var.f38332g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        String str;
        String str2;
        i8 i8Var = (i8) obj;
        if (i8Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i8Var.f38701g;
        int length = zArr.length;
        nm.o oVar = this.f37588a;
        if (length > 0 && zArr[0]) {
            if (this.f37590c == null) {
                this.f37590c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37590c;
            um.c h10 = cVar.h("id");
            str2 = i8Var.f38695a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37590c == null) {
                this.f37590c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37590c;
            um.c h13 = cVar.h("node_id");
            str = i8Var.f38696b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37589b == null) {
                this.f37589b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f37589b;
            um.c h14 = cVar.h("crop_x");
            d15 = i8Var.f38697c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37589b == null) {
                this.f37589b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f37589b;
            um.c h15 = cVar.h("crop_y");
            d14 = i8Var.f38698d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37589b == null) {
                this.f37589b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f37589b;
            um.c h16 = cVar.h("height");
            d13 = i8Var.f38699e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37589b == null) {
                this.f37589b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f37589b;
            um.c h17 = cVar.h("width");
            d2 = i8Var.f38700f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
