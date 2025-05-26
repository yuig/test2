package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class gq0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38112a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38113b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38114c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38115d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38116e;

    public gq0(nm.o oVar) {
        this.f38112a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        fq0 fq0Var = new fq0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1539906063:
                    if (k03.equals("font_size")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1420614337:
                    if (k03.equals("hex_color")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1179531240:
                    if (k03.equals("highlight_color")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -680931573:
                    if (k03.equals("font_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3148879:
                    if (k03.equals("font")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 94842723:
                    if (k03.equals("color")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1152559194:
                    if (k03.equals("vertical_alignment")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1767875043:
                    if (k03.equals("alignment")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38112a;
            switch (c13) {
                case 0:
                    if (this.f38113b == null) {
                        this.f38113b = a.cb.q(oVar, Double.class);
                    }
                    fq0Var.f37750e = (Double) this.f38113b.c(aVar);
                    boolean[] zArr = fq0Var.f37754i;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f38116e == null) {
                        this.f38116e = a.cb.q(oVar, String.class);
                    }
                    fq0Var.f37751f = (String) this.f38116e.c(aVar);
                    boolean[] zArr2 = fq0Var.f37754i;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f38116e == null) {
                        this.f38116e = a.cb.q(oVar, String.class);
                    }
                    fq0Var.f37752g = (String) this.f38116e.c(aVar);
                    boolean[] zArr3 = fq0Var.f37754i;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f38114c == null) {
                        this.f38114c = a.cb.q(oVar, Integer.class);
                    }
                    fq0Var.f37749d = (Integer) this.f38114c.c(aVar);
                    boolean[] zArr4 = fq0Var.f37754i;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case 4:
                    if (this.f38115d == null) {
                        this.f38115d = a.cb.q(oVar, yl0.class);
                    }
                    fq0Var.f37748c = (yl0) this.f38115d.c(aVar);
                    boolean[] zArr5 = fq0Var.f37754i;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f38114c == null) {
                        this.f38114c = a.cb.q(oVar, Integer.class);
                    }
                    fq0Var.f37747b = (Integer) this.f38114c.c(aVar);
                    boolean[] zArr6 = fq0Var.f37754i;
                    if (zArr6.length <= 1) {
                        break;
                    } else {
                        zArr6[1] = true;
                        break;
                    }
                case 6:
                    if (this.f38114c == null) {
                        this.f38114c = a.cb.q(oVar, Integer.class);
                    }
                    fq0Var.f37753h = (Integer) this.f38114c.c(aVar);
                    boolean[] zArr7 = fq0Var.f37754i;
                    if (zArr7.length <= 7) {
                        break;
                    } else {
                        zArr7[7] = true;
                        break;
                    }
                case 7:
                    if (this.f38114c == null) {
                        this.f38114c = a.cb.q(oVar, Integer.class);
                    }
                    fq0Var.f37746a = (Integer) this.f38114c.c(aVar);
                    boolean[] zArr8 = fq0Var.f37754i;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new iq0(fq0Var.f37746a, fq0Var.f37747b, fq0Var.f37748c, fq0Var.f37749d, fq0Var.f37750e, fq0Var.f37751f, fq0Var.f37752g, fq0Var.f37753h, fq0Var.f37754i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        Double d2;
        Integer num2;
        yl0 yl0Var;
        Integer num3;
        Integer num4;
        iq0 iq0Var = (iq0) obj;
        if (iq0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = iq0Var.f38855i;
        int length = zArr.length;
        nm.o oVar = this.f38112a;
        if (length > 0 && zArr[0]) {
            if (this.f38114c == null) {
                this.f38114c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f38114c;
            um.c h10 = cVar.h("alignment");
            num4 = iq0Var.f38847a;
            mVar.e(h10, num4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38114c == null) {
                this.f38114c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f38114c;
            um.c h13 = cVar.h("color");
            num3 = iq0Var.f38848b;
            mVar2.e(h13, num3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38115d == null) {
                this.f38115d = a.cb.q(oVar, yl0.class);
            }
            nm.m mVar3 = this.f38115d;
            um.c h14 = cVar.h("font");
            yl0Var = iq0Var.f38849c;
            mVar3.e(h14, yl0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38114c == null) {
                this.f38114c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f38114c;
            um.c h15 = cVar.h("font_id");
            num2 = iq0Var.f38850d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38113b == null) {
                this.f38113b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f38113b;
            um.c h16 = cVar.h("font_size");
            d2 = iq0Var.f38851e;
            mVar5.e(h16, d2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38116e == null) {
                this.f38116e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38116e;
            um.c h17 = cVar.h("hex_color");
            str2 = iq0Var.f38852f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38116e == null) {
                this.f38116e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f38116e;
            um.c h18 = cVar.h("highlight_color");
            str = iq0Var.f38853g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38114c == null) {
                this.f38114c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f38114c;
            um.c h19 = cVar.h("vertical_alignment");
            num = iq0Var.f38854h;
            mVar8.e(h19, num);
        }
        cVar.g();
    }
}
