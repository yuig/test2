package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class yw0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44139a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44140b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44141c;

    public yw0(nm.o oVar) {
        this.f44139a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xw0 xw0Var = new xw0(0);
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
                case -927281440:
                    if (k03.equals("spacing_after")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1346344699:
                    if (k03.equals("spacing_before")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2024311912:
                    if (k03.equals("font_weight")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44139a;
            switch (c13) {
                case 0:
                    if (this.f44140b == null) {
                        this.f44140b = a.cb.q(oVar, Integer.class);
                    }
                    xw0Var.f43811b = (Integer) this.f44140b.c(aVar);
                    boolean[] zArr = xw0Var.f43817h;
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 1:
                    if (this.f44140b == null) {
                        this.f44140b = a.cb.q(oVar, Integer.class);
                    }
                    xw0Var.f43813d = (Integer) this.f44140b.c(aVar);
                    boolean[] zArr2 = xw0Var.f43817h;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f44141c == null) {
                        this.f44141c = a.cb.q(oVar, String.class);
                    }
                    xw0Var.f43810a = (String) this.f44141c.c(aVar);
                    boolean[] zArr3 = xw0Var.f43817h;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f44141c == null) {
                        this.f44141c = a.cb.q(oVar, String.class);
                    }
                    xw0Var.f43815f = (String) this.f44141c.c(aVar);
                    boolean[] zArr4 = xw0Var.f43817h;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f44141c == null) {
                        this.f44141c = a.cb.q(oVar, String.class);
                    }
                    xw0Var.f43816g = (String) this.f44141c.c(aVar);
                    boolean[] zArr5 = xw0Var.f43817h;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f44140b == null) {
                        this.f44140b = a.cb.q(oVar, Integer.class);
                    }
                    xw0Var.f43814e = (Integer) this.f44140b.c(aVar);
                    boolean[] zArr6 = xw0Var.f43817h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f44140b == null) {
                        this.f44140b = a.cb.q(oVar, Integer.class);
                    }
                    xw0Var.f43812c = (Integer) this.f44140b.c(aVar);
                    boolean[] zArr7 = xw0Var.f43817h;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ax0(xw0Var.f43810a, xw0Var.f43811b, xw0Var.f43812c, xw0Var.f43813d, xw0Var.f43814e, xw0Var.f43815f, xw0Var.f43816g, xw0Var.f43817h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str3;
        ax0 ax0Var = (ax0) obj;
        if (ax0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ax0Var.f35894h;
        int length = zArr.length;
        nm.o oVar = this.f44139a;
        if (length > 0 && zArr[0]) {
            if (this.f44141c == null) {
                this.f44141c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44141c;
            um.c h10 = cVar.h("id");
            str3 = ax0Var.f35887a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44140b == null) {
                this.f44140b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f44140b;
            um.c h13 = cVar.h("font_size");
            num4 = ax0Var.f35888b;
            mVar2.e(h13, num4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44140b == null) {
                this.f44140b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f44140b;
            um.c h14 = cVar.h("font_weight");
            num3 = ax0Var.f35889c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44140b == null) {
                this.f44140b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f44140b;
            um.c h15 = cVar.h("spacing_after");
            num2 = ax0Var.f35890d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44140b == null) {
                this.f44140b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f44140b;
            um.c h16 = cVar.h("spacing_before");
            num = ax0Var.f35891e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44141c == null) {
                this.f44141c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f44141c;
            um.c h17 = cVar.h("text");
            str2 = ax0Var.f35892f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44141c == null) {
                this.f44141c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f44141c;
            um.c h18 = cVar.h("type");
            str = ax0Var.f35893g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
