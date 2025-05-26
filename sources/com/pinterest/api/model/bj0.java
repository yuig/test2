package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class bj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36115a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36116b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36117c;

    public bj0(nm.o oVar) {
        this.f36115a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        aj0 aj0Var = new aj0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1604143506:
                    if (k03.equals("background_color_hex")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1539906063:
                    if (k03.equals("font_size")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1539861206:
                    if (k03.equals("font_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1767875043:
                    if (k03.equals("alignment")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1981253695:
                    if (k03.equals("color_hex")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36115a;
            if (c13 == 0) {
                if (this.f36117c == null) {
                    this.f36117c = a.cb.q(oVar, String.class);
                }
                aj0Var.f35766b = (String) this.f36117c.c(aVar);
                boolean[] zArr = aj0Var.f35771g;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f36116b == null) {
                    this.f36116b = a.cb.q(oVar, Double.class);
                }
                aj0Var.f35768d = (Double) this.f36116b.c(aVar);
                boolean[] zArr2 = aj0Var.f35771g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f36116b == null) {
                    this.f36116b = a.cb.q(oVar, Double.class);
                }
                aj0Var.f35769e = (Double) this.f36116b.c(aVar);
                boolean[] zArr3 = aj0Var.f35771g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f36117c == null) {
                    this.f36117c = a.cb.q(oVar, String.class);
                }
                aj0Var.f35770f = (String) this.f36117c.c(aVar);
                boolean[] zArr4 = aj0Var.f35771g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f36116b == null) {
                    this.f36116b = a.cb.q(oVar, Double.class);
                }
                aj0Var.f35765a = (Double) this.f36116b.c(aVar);
                boolean[] zArr5 = aj0Var.f35771g;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36117c == null) {
                    this.f36117c = a.cb.q(oVar, String.class);
                }
                aj0Var.f35767c = (String) this.f36117c.c(aVar);
                boolean[] zArr6 = aj0Var.f35771g;
                if (zArr6.length > 2) {
                    zArr6[2] = true;
                }
            }
        }
        aVar.g();
        return new dj0(aj0Var.f35765a, aj0Var.f35766b, aj0Var.f35767c, aj0Var.f35768d, aj0Var.f35769e, aj0Var.f35770f, aj0Var.f35771g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Double d2;
        Double d13;
        String str2;
        String str3;
        Double d14;
        dj0 dj0Var = (dj0) obj;
        if (dj0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dj0Var.f36861g;
        int length = zArr.length;
        nm.o oVar = this.f36115a;
        if (length > 0 && zArr[0]) {
            if (this.f36116b == null) {
                this.f36116b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f36116b;
            um.c h10 = cVar.h("alignment");
            d14 = dj0Var.f36855a;
            mVar.e(h10, d14);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36117c == null) {
                this.f36117c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36117c;
            um.c h13 = cVar.h("background_color_hex");
            str3 = dj0Var.f36856b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36117c == null) {
                this.f36117c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36117c;
            um.c h14 = cVar.h("color_hex");
            str2 = dj0Var.f36857c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36116b == null) {
                this.f36116b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f36116b;
            um.c h15 = cVar.h("font_size");
            d13 = dj0Var.f36858d;
            mVar4.e(h15, d13);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36116b == null) {
                this.f36116b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f36116b;
            um.c h16 = cVar.h("font_type");
            d2 = dj0Var.f36859e;
            mVar5.e(h16, d2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36117c == null) {
                this.f36117c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36117c;
            um.c h17 = cVar.h("text");
            str = dj0Var.f36860f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
