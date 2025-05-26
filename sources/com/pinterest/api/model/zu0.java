package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class zu0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44464a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44465b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44466c;

    public zu0(nm.o oVar) {
        this.f44464a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yu0 yu0Var = new yu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1523982547:
                    if (k03.equals("start_scale")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -852420850:
                    if (k03.equals("center_x")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -852420849:
                    if (k03.equals("center_y")) {
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
                case 1951376614:
                    if (k03.equals("end_scale")) {
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
            nm.o oVar = this.f44464a;
            if (c13 == 0) {
                if (this.f44465b == null) {
                    this.f44465b = a.cb.q(oVar, Double.class);
                }
                yu0Var.f44132f = (Double) this.f44465b.c(aVar);
                boolean[] zArr = yu0Var.f44133g;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
            } else if (c13 == 1) {
                if (this.f44465b == null) {
                    this.f44465b = a.cb.q(oVar, Double.class);
                }
                yu0Var.f44129c = (Double) this.f44465b.c(aVar);
                boolean[] zArr2 = yu0Var.f44133g;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f44465b == null) {
                    this.f44465b = a.cb.q(oVar, Double.class);
                }
                yu0Var.f44130d = (Double) this.f44465b.c(aVar);
                boolean[] zArr3 = yu0Var.f44133g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f44466c == null) {
                    this.f44466c = a.cb.q(oVar, String.class);
                }
                yu0Var.f44127a = (String) this.f44466c.c(aVar);
                boolean[] zArr4 = yu0Var.f44133g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f44465b == null) {
                    this.f44465b = a.cb.q(oVar, Double.class);
                }
                yu0Var.f44131e = (Double) this.f44465b.c(aVar);
                boolean[] zArr5 = yu0Var.f44133g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f44466c == null) {
                    this.f44466c = a.cb.q(oVar, String.class);
                }
                yu0Var.f44128b = (String) this.f44466c.c(aVar);
                boolean[] zArr6 = yu0Var.f44133g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new bv0(yu0Var.f44127a, yu0Var.f44128b, yu0Var.f44129c, yu0Var.f44130d, yu0Var.f44131e, yu0Var.f44132f, yu0Var.f44133g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        String str;
        String str2;
        bv0 bv0Var = (bv0) obj;
        if (bv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bv0Var.f36220g;
        int length = zArr.length;
        nm.o oVar = this.f44464a;
        if (length > 0 && zArr[0]) {
            if (this.f44466c == null) {
                this.f44466c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44466c;
            um.c h10 = cVar.h("id");
            str2 = bv0Var.f36214a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44466c == null) {
                this.f44466c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44466c;
            um.c h13 = cVar.h("node_id");
            str = bv0Var.f36215b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44465b == null) {
                this.f44465b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f44465b;
            um.c h14 = cVar.h("center_x");
            d15 = bv0Var.f36216c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44465b == null) {
                this.f44465b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f44465b;
            um.c h15 = cVar.h("center_y");
            d14 = bv0Var.f36217d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44465b == null) {
                this.f44465b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f44465b;
            um.c h16 = cVar.h("end_scale");
            d13 = bv0Var.f36218e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44465b == null) {
                this.f44465b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f44465b;
            um.c h17 = cVar.h("start_scale");
            d2 = bv0Var.f36219f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
