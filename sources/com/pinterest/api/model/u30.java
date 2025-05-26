package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class u30 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42403a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42404b;

    public u30(nm.o oVar) {
        this.f42403a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t30 t30Var = new t30(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1788888058:
                    if (k03.equals("QUARTILE_95_PERCENT_VIEW")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1196508642:
                    if (k03.equals("PIN_CLICK")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1079622593:
                    if (k03.equals("ENGAGEMENT")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -985065639:
                    if (k03.equals("OUTBOUND_CLICK")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -653548204:
                    if (k03.equals("VIDEO_10S_VIEW")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2537853:
                    if (k03.equals("SAVE")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 173186194:
                    if (k03.equals("PRODUCT_TAG_SAVE")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 527629662:
                    if (k03.equals("PRODUCT_TAG_IMPRESSION")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 552788586:
                    if (k03.equals("VIDEO_MRC_VIEW")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 605715977:
                    if (k03.equals("IMPRESSION")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1059343603:
                    if (k03.equals("PRODUCT_TAG_CLICK")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1411190894:
                    if (k03.equals("VIDEO_AVG_WATCH_TIME")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1459086382:
                    if (k03.equals("PRODUCT_TAG_OUTBOUND_CLICK")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1802823759:
                    if (k03.equals("VIDEO_V50_WATCH_TIME")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42403a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42074i = (a40) this.f42404b.c(aVar);
                    boolean[] zArr = t30Var.f42080o;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42069d = (a40) this.f42404b.c(aVar);
                    boolean[] zArr2 = t30Var.f42080o;
                    if (zArr2.length > 3) {
                        zArr2[3] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42066a = (a40) this.f42404b.c(aVar);
                    boolean[] zArr3 = t30Var.f42080o;
                    if (zArr3.length > 0) {
                        z13 = false;
                        zArr3[0] = true;
                        break;
                    }
                    break;
                case 3:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42068c = (a40) this.f42404b.c(aVar);
                    boolean[] zArr4 = t30Var.f42080o;
                    if (zArr4.length > 2) {
                        zArr4[2] = true;
                        break;
                    }
                    break;
                case 4:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42076k = (a40) this.f42404b.c(aVar);
                    boolean[] zArr5 = t30Var.f42080o;
                    if (zArr5.length > 10) {
                        zArr5[10] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42075j = (a40) this.f42404b.c(aVar);
                    boolean[] zArr6 = t30Var.f42080o;
                    if (zArr6.length > 9) {
                        zArr6[9] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42073h = (a40) this.f42404b.c(aVar);
                    boolean[] zArr7 = t30Var.f42080o;
                    if (zArr7.length > 7) {
                        zArr7[7] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42071f = (a40) this.f42404b.c(aVar);
                    boolean[] zArr8 = t30Var.f42080o;
                    if (zArr8.length > 5) {
                        zArr8[5] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42078m = (a40) this.f42404b.c(aVar);
                    boolean[] zArr9 = t30Var.f42080o;
                    if (zArr9.length > 12) {
                        zArr9[12] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42067b = (a40) this.f42404b.c(aVar);
                    boolean[] zArr10 = t30Var.f42080o;
                    if (zArr10.length > 1) {
                        zArr10[1] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42070e = (a40) this.f42404b.c(aVar);
                    boolean[] zArr11 = t30Var.f42080o;
                    if (zArr11.length > 4) {
                        zArr11[4] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42077l = (a40) this.f42404b.c(aVar);
                    boolean[] zArr12 = t30Var.f42080o;
                    if (zArr12.length > 11) {
                        zArr12[11] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42072g = (a40) this.f42404b.c(aVar);
                    boolean[] zArr13 = t30Var.f42080o;
                    if (zArr13.length > 6) {
                        zArr13[6] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f42404b == null) {
                        this.f42404b = a.cb.q(oVar, a40.class);
                    }
                    t30Var.f42079n = (a40) this.f42404b.c(aVar);
                    boolean[] zArr14 = t30Var.f42080o;
                    if (zArr14.length > 13) {
                        zArr14[13] = true;
                        break;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
            z13 = false;
        }
        aVar.g();
        return new w30(t30Var.f42066a, t30Var.f42067b, t30Var.f42068c, t30Var.f42069d, t30Var.f42070e, t30Var.f42071f, t30Var.f42072g, t30Var.f42073h, t30Var.f42074i, t30Var.f42075j, t30Var.f42076k, t30Var.f42077l, t30Var.f42078m, t30Var.f42079n, t30Var.f42080o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        a40 a40Var;
        a40 a40Var2;
        a40 a40Var3;
        a40 a40Var4;
        a40 a40Var5;
        a40 a40Var6;
        a40 a40Var7;
        a40 a40Var8;
        a40 a40Var9;
        a40 a40Var10;
        a40 a40Var11;
        a40 a40Var12;
        a40 a40Var13;
        a40 a40Var14;
        w30 w30Var = (w30) obj;
        if (w30Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w30Var.f43165o;
        int length = zArr.length;
        nm.o oVar = this.f42403a;
        if (length > 0 && zArr[0]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar = this.f42404b;
            um.c h10 = cVar.h("ENGAGEMENT");
            a40Var14 = w30Var.f43151a;
            mVar.e(h10, a40Var14);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar2 = this.f42404b;
            um.c h13 = cVar.h("IMPRESSION");
            a40Var13 = w30Var.f43152b;
            mVar2.e(h13, a40Var13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar3 = this.f42404b;
            um.c h14 = cVar.h("OUTBOUND_CLICK");
            a40Var12 = w30Var.f43153c;
            mVar3.e(h14, a40Var12);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar4 = this.f42404b;
            um.c h15 = cVar.h("PIN_CLICK");
            a40Var11 = w30Var.f43154d;
            mVar4.e(h15, a40Var11);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar5 = this.f42404b;
            um.c h16 = cVar.h("PRODUCT_TAG_CLICK");
            a40Var10 = w30Var.f43155e;
            mVar5.e(h16, a40Var10);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar6 = this.f42404b;
            um.c h17 = cVar.h("PRODUCT_TAG_IMPRESSION");
            a40Var9 = w30Var.f43156f;
            mVar6.e(h17, a40Var9);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar7 = this.f42404b;
            um.c h18 = cVar.h("PRODUCT_TAG_OUTBOUND_CLICK");
            a40Var8 = w30Var.f43157g;
            mVar7.e(h18, a40Var8);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar8 = this.f42404b;
            um.c h19 = cVar.h("PRODUCT_TAG_SAVE");
            a40Var7 = w30Var.f43158h;
            mVar8.e(h19, a40Var7);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar9 = this.f42404b;
            um.c h23 = cVar.h("QUARTILE_95_PERCENT_VIEW");
            a40Var6 = w30Var.f43159i;
            mVar9.e(h23, a40Var6);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar10 = this.f42404b;
            um.c h24 = cVar.h("SAVE");
            a40Var5 = w30Var.f43160j;
            mVar10.e(h24, a40Var5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar11 = this.f42404b;
            um.c h25 = cVar.h("VIDEO_10S_VIEW");
            a40Var4 = w30Var.f43161k;
            mVar11.e(h25, a40Var4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar12 = this.f42404b;
            um.c h26 = cVar.h("VIDEO_AVG_WATCH_TIME");
            a40Var3 = w30Var.f43162l;
            mVar12.e(h26, a40Var3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar13 = this.f42404b;
            um.c h27 = cVar.h("VIDEO_MRC_VIEW");
            a40Var2 = w30Var.f43163m;
            mVar13.e(h27, a40Var2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f42404b == null) {
                this.f42404b = a.cb.q(oVar, a40.class);
            }
            nm.m mVar14 = this.f42404b;
            um.c h28 = cVar.h("VIDEO_V50_WATCH_TIME");
            a40Var = w30Var.f43164n;
            mVar14.e(h28, a40Var);
        }
        cVar.g();
    }
}
