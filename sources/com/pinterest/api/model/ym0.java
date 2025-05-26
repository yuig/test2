package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ym0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44081a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44082b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44083c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44084d;

    public ym0(nm.o oVar) {
        this.f44081a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xm0 xm0Var = new xm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1953161068:
                    if (k03.equals("src_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -362404825:
                    if (k03.equals("normalized_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2122907556:
                    if (k03.equals("canonical_url")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44081a;
            switch (c13) {
                case 0:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43748f = (String) this.f44084d.c(aVar);
                    boolean[] zArr = xm0Var.f43751i;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43747e = (String) this.f44084d.c(aVar);
                    boolean[] zArr2 = xm0Var.f43751i;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43749g = (String) this.f44084d.c(aVar);
                    boolean[] zArr3 = xm0Var.f43751i;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43750h = (String) this.f44084d.c(aVar);
                    boolean[] zArr4 = xm0Var.f43751i;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f44083c == null) {
                        this.f44083c = a.cb.q(oVar, om0.class);
                    }
                    xm0Var.f43745c = (om0) this.f44083c.c(aVar);
                    boolean[] zArr5 = xm0Var.f43751i;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43746d = (String) this.f44084d.c(aVar);
                    boolean[] zArr6 = xm0Var.f43751i;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f44082b == null) {
                        this.f44082b = a.cb.q(oVar, Integer.class);
                    }
                    xm0Var.f43743a = (Integer) this.f44082b.c(aVar);
                    boolean[] zArr7 = xm0Var.f43751i;
                    if (zArr7.length <= 0) {
                        break;
                    } else {
                        zArr7[0] = true;
                        break;
                    }
                case 7:
                    if (this.f44084d == null) {
                        this.f44084d = a.cb.q(oVar, String.class);
                    }
                    xm0Var.f43744b = (String) this.f44084d.c(aVar);
                    boolean[] zArr8 = xm0Var.f43751i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new an0(xm0Var.f43743a, xm0Var.f43744b, xm0Var.f43745c, xm0Var.f43746d, xm0Var.f43747e, xm0Var.f43748f, xm0Var.f43749g, xm0Var.f43750h, xm0Var.f43751i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        om0 om0Var;
        String str6;
        Integer num;
        an0 an0Var = (an0) obj;
        if (an0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = an0Var.f35816i;
        int length = zArr.length;
        nm.o oVar = this.f44081a;
        if (length > 0 && zArr[0]) {
            if (this.f44082b == null) {
                this.f44082b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f44082b;
            um.c h10 = cVar.h("block_type");
            num = an0Var.f35808a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44084d;
            um.c h13 = cVar.h("canonical_url");
            str6 = an0Var.f35809b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44083c == null) {
                this.f44083c = a.cb.q(oVar, om0.class);
            }
            nm.m mVar3 = this.f44083c;
            um.c h14 = cVar.h("image");
            om0Var = an0Var.f35810c;
            mVar3.e(h14, om0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44084d;
            um.c h15 = cVar.h("image_signature");
            str5 = an0Var.f35811d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44084d;
            um.c h16 = cVar.h("normalized_url");
            str4 = an0Var.f35812e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f44084d;
            um.c h17 = cVar.h("src_url");
            str3 = an0Var.f35813f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f44084d;
            um.c h18 = cVar.h("text");
            str2 = an0Var.f35814g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44084d == null) {
                this.f44084d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f44084d;
            um.c h19 = cVar.h("type");
            str = an0Var.f35815h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
