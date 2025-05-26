package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class v3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42724a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42725b;

    public v3(nm.o oVar) {
        this.f42724a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x3 x3Var = new x3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1898693436:
                    if (k03.equals("FULL_SCREEN_PLAYTIME")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1836676896:
                    if (k03.equals("ENGAGEMENT_RATE")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1817922188:
                    if (k03.equals("MONTHLY_ENGAGERS")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1788888058:
                    if (k03.equals("QUARTILE_95_PERCENT_VIEW")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1699445406:
                    if (k03.equals("ENGAGERS")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1294751134:
                    if (k03.equals("SAVE_RATE")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1196508642:
                    if (k03.equals("PIN_CLICK")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1159035529:
                    if (k03.equals("FULL_SCREEN_PLAY")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -1079622593:
                    if (k03.equals("ENGAGEMENT")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -985065639:
                    if (k03.equals("OUTBOUND_CLICK")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -974732555:
                    if (k03.equals("PROFILE_VISIT")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -653548204:
                    if (k03.equals("VIDEO_10S_VIEW")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -129571779:
                    if (k03.equals("CLICKTHROUGH")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case -49441274:
                    if (k03.equals("OUTBOUND_CLICK_RATE")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case -38699355:
                    if (k03.equals("USER_FOLLOW")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case -7311169:
                    if (k03.equals("TOTAL_AUDIENCE")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 2537853:
                    if (k03.equals("SAVE")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 173186194:
                    if (k03.equals("PRODUCT_TAG_SAVE")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 527629662:
                    if (k03.equals("PRODUCT_TAG_IMPRESSION")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 552788586:
                    if (k03.equals("VIDEO_MRC_VIEW")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 570943073:
                    if (k03.equals("PIN_CLICK_RATE")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 605715977:
                    if (k03.equals("IMPRESSION")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 1059343603:
                    if (k03.equals("PRODUCT_TAG_CLICK")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case 1411190894:
                    if (k03.equals("VIDEO_AVG_WATCH_TIME")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case 1459086382:
                    if (k03.equals("PRODUCT_TAG_OUTBOUND_CLICK")) {
                        c13 = 24;
                        break;
                    }
                    break;
                case 1584519795:
                    if (k03.equals("CLOSEUP")) {
                        c13 = 25;
                        break;
                    }
                    break;
                case 1741474641:
                    if (k03.equals("MONTHLY_TOTAL_AUDIENCE")) {
                        c13 = 26;
                        break;
                    }
                    break;
                case 1802823759:
                    if (k03.equals("VIDEO_V50_WATCH_TIME")) {
                        c13 = 27;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42724a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43550g = (q3) this.f42725b.c(aVar);
                    boolean[] zArr = x3Var.C;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43547d = (q3) this.f42725b.c(aVar);
                    boolean[] zArr2 = x3Var.C;
                    if (zArr2.length > 3) {
                        zArr2[3] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43552i = (q3) this.f42725b.c(aVar);
                    boolean[] zArr3 = x3Var.C;
                    if (zArr3.length > 8) {
                        zArr3[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43563t = (q3) this.f42725b.c(aVar);
                    boolean[] zArr4 = x3Var.C;
                    if (zArr4.length > 19) {
                        zArr4[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43548e = (q3) this.f42725b.c(aVar);
                    boolean[] zArr5 = x3Var.C;
                    if (zArr5.length > 4) {
                        zArr5[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43565v = (q3) this.f42725b.c(aVar);
                    boolean[] zArr6 = x3Var.C;
                    if (zArr6.length > 21) {
                        zArr6[21] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43556m = (q3) this.f42725b.c(aVar);
                    boolean[] zArr7 = x3Var.C;
                    if (zArr7.length > 12) {
                        zArr7[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43549f = (q3) this.f42725b.c(aVar);
                    boolean[] zArr8 = x3Var.C;
                    if (zArr8.length > 5) {
                        zArr8[5] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43546c = (q3) this.f42725b.c(aVar);
                    boolean[] zArr9 = x3Var.C;
                    if (zArr9.length > 2) {
                        zArr9[2] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\t':
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43554k = (q3) this.f42725b.c(aVar);
                    boolean[] zArr10 = x3Var.C;
                    if (zArr10.length > 10) {
                        zArr10[10] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\n':
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43562s = (q3) this.f42725b.c(aVar);
                    boolean[] zArr11 = x3Var.C;
                    if (zArr11.length > 18) {
                        zArr11[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    z13 = false;
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43568y = (q3) this.f42725b.c(aVar);
                    boolean[] zArr12 = x3Var.C;
                    if (zArr12.length > 24) {
                        zArr12[24] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\f':
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43544a = (q3) this.f42725b.c(aVar);
                    boolean[] zArr13 = x3Var.C;
                    if (zArr13.length > 0) {
                        z13 = false;
                        zArr13[0] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43555l = (q3) this.f42725b.c(aVar);
                    boolean[] zArr14 = x3Var.C;
                    if (zArr14.length > 11) {
                        zArr14[11] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43567x = (q3) this.f42725b.c(aVar);
                    boolean[] zArr15 = x3Var.C;
                    if (zArr15.length > 23) {
                        zArr15[23] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43566w = (q3) this.f42725b.c(aVar);
                    boolean[] zArr16 = x3Var.C;
                    if (zArr16.length > 22) {
                        zArr16[22] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43564u = (q3) this.f42725b.c(aVar);
                    boolean[] zArr17 = x3Var.C;
                    if (zArr17.length > 20) {
                        zArr17[20] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43561r = (q3) this.f42725b.c(aVar);
                    boolean[] zArr18 = x3Var.C;
                    if (zArr18.length > 17) {
                        zArr18[17] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43559p = (q3) this.f42725b.c(aVar);
                    boolean[] zArr19 = x3Var.C;
                    if (zArr19.length > 15) {
                        zArr19[15] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.A = (q3) this.f42725b.c(aVar);
                    boolean[] zArr20 = x3Var.C;
                    if (zArr20.length > 26) {
                        zArr20[26] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43557n = (q3) this.f42725b.c(aVar);
                    boolean[] zArr21 = x3Var.C;
                    if (zArr21.length > 13) {
                        zArr21[13] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43551h = (q3) this.f42725b.c(aVar);
                    boolean[] zArr22 = x3Var.C;
                    if (zArr22.length > 7) {
                        zArr22[7] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43558o = (q3) this.f42725b.c(aVar);
                    boolean[] zArr23 = x3Var.C;
                    if (zArr23.length > 14) {
                        zArr23[14] = true;
                        break;
                    }
                    break;
                case 23:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43569z = (q3) this.f42725b.c(aVar);
                    boolean[] zArr24 = x3Var.C;
                    if (zArr24.length > 25) {
                        zArr24[25] = true;
                        break;
                    }
                    break;
                case 24:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43560q = (q3) this.f42725b.c(aVar);
                    boolean[] zArr25 = x3Var.C;
                    if (zArr25.length > 16) {
                        zArr25[16] = true;
                        break;
                    }
                    break;
                case 25:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43545b = (q3) this.f42725b.c(aVar);
                    boolean[] zArr26 = x3Var.C;
                    if (zArr26.length > 1) {
                        zArr26[1] = true;
                        break;
                    }
                    break;
                case 26:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.f43553j = (q3) this.f42725b.c(aVar);
                    boolean[] zArr27 = x3Var.C;
                    if (zArr27.length > 9) {
                        zArr27[9] = true;
                        break;
                    }
                    break;
                case 27:
                    if (this.f42725b == null) {
                        this.f42725b = a.cb.q(oVar, q3.class);
                    }
                    x3Var.B = (q3) this.f42725b.c(aVar);
                    boolean[] zArr28 = x3Var.C;
                    if (zArr28.length > 27) {
                        zArr28[27] = true;
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
        return new y3(x3Var.f43544a, x3Var.f43545b, x3Var.f43546c, x3Var.f43547d, x3Var.f43548e, x3Var.f43549f, x3Var.f43550g, x3Var.f43551h, x3Var.f43552i, x3Var.f43553j, x3Var.f43554k, x3Var.f43555l, x3Var.f43556m, x3Var.f43557n, x3Var.f43558o, x3Var.f43559p, x3Var.f43560q, x3Var.f43561r, x3Var.f43562s, x3Var.f43563t, x3Var.f43564u, x3Var.f43565v, x3Var.f43566w, x3Var.f43567x, x3Var.f43568y, x3Var.f43569z, x3Var.A, x3Var.B, x3Var.C, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        q3 q3Var;
        q3 q3Var2;
        q3 q3Var3;
        q3 q3Var4;
        q3 q3Var5;
        q3 q3Var6;
        q3 q3Var7;
        q3 q3Var8;
        q3 q3Var9;
        q3 q3Var10;
        q3 q3Var11;
        q3 q3Var12;
        q3 q3Var13;
        q3 q3Var14;
        q3 q3Var15;
        q3 q3Var16;
        q3 q3Var17;
        q3 q3Var18;
        q3 q3Var19;
        q3 q3Var20;
        q3 q3Var21;
        q3 q3Var22;
        q3 q3Var23;
        q3 q3Var24;
        q3 q3Var25;
        q3 q3Var26;
        q3 q3Var27;
        q3 q3Var28;
        y3 y3Var = (y3) obj;
        if (y3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = y3Var.C;
        int length = zArr.length;
        nm.o oVar = this.f42724a;
        if (length > 0 && zArr[0]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar = this.f42725b;
            um.c h10 = cVar.h("CLICKTHROUGH");
            q3Var28 = y3Var.f43909a;
            mVar.e(h10, q3Var28);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar2 = this.f42725b;
            um.c h13 = cVar.h("CLOSEUP");
            q3Var27 = y3Var.f43910b;
            mVar2.e(h13, q3Var27);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar3 = this.f42725b;
            um.c h14 = cVar.h("ENGAGEMENT");
            q3Var26 = y3Var.f43911c;
            mVar3.e(h14, q3Var26);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar4 = this.f42725b;
            um.c h15 = cVar.h("ENGAGEMENT_RATE");
            q3Var25 = y3Var.f43912d;
            mVar4.e(h15, q3Var25);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar5 = this.f42725b;
            um.c h16 = cVar.h("ENGAGERS");
            q3Var24 = y3Var.f43913e;
            mVar5.e(h16, q3Var24);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar6 = this.f42725b;
            um.c h17 = cVar.h("FULL_SCREEN_PLAY");
            q3Var23 = y3Var.f43914f;
            mVar6.e(h17, q3Var23);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar7 = this.f42725b;
            um.c h18 = cVar.h("FULL_SCREEN_PLAYTIME");
            q3Var22 = y3Var.f43915g;
            mVar7.e(h18, q3Var22);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar8 = this.f42725b;
            um.c h19 = cVar.h("IMPRESSION");
            q3Var21 = y3Var.f43916h;
            mVar8.e(h19, q3Var21);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar9 = this.f42725b;
            um.c h23 = cVar.h("MONTHLY_ENGAGERS");
            q3Var20 = y3Var.f43917i;
            mVar9.e(h23, q3Var20);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar10 = this.f42725b;
            um.c h24 = cVar.h("MONTHLY_TOTAL_AUDIENCE");
            q3Var19 = y3Var.f43918j;
            mVar10.e(h24, q3Var19);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar11 = this.f42725b;
            um.c h25 = cVar.h("OUTBOUND_CLICK");
            q3Var18 = y3Var.f43919k;
            mVar11.e(h25, q3Var18);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar12 = this.f42725b;
            um.c h26 = cVar.h("OUTBOUND_CLICK_RATE");
            q3Var17 = y3Var.f43920l;
            mVar12.e(h26, q3Var17);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar13 = this.f42725b;
            um.c h27 = cVar.h("PIN_CLICK");
            q3Var16 = y3Var.f43921m;
            mVar13.e(h27, q3Var16);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar14 = this.f42725b;
            um.c h28 = cVar.h("PIN_CLICK_RATE");
            q3Var15 = y3Var.f43922n;
            mVar14.e(h28, q3Var15);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar15 = this.f42725b;
            um.c h29 = cVar.h("PRODUCT_TAG_CLICK");
            q3Var14 = y3Var.f43923o;
            mVar15.e(h29, q3Var14);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar16 = this.f42725b;
            um.c h33 = cVar.h("PRODUCT_TAG_IMPRESSION");
            q3Var13 = y3Var.f43924p;
            mVar16.e(h33, q3Var13);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar17 = this.f42725b;
            um.c h34 = cVar.h("PRODUCT_TAG_OUTBOUND_CLICK");
            q3Var12 = y3Var.f43925q;
            mVar17.e(h34, q3Var12);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar18 = this.f42725b;
            um.c h35 = cVar.h("PRODUCT_TAG_SAVE");
            q3Var11 = y3Var.f43926r;
            mVar18.e(h35, q3Var11);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar19 = this.f42725b;
            um.c h36 = cVar.h("PROFILE_VISIT");
            q3Var10 = y3Var.f43927s;
            mVar19.e(h36, q3Var10);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar20 = this.f42725b;
            um.c h37 = cVar.h("QUARTILE_95_PERCENT_VIEW");
            q3Var9 = y3Var.f43928t;
            mVar20.e(h37, q3Var9);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar21 = this.f42725b;
            um.c h38 = cVar.h("SAVE");
            q3Var8 = y3Var.f43929u;
            mVar21.e(h38, q3Var8);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar22 = this.f42725b;
            um.c h39 = cVar.h("SAVE_RATE");
            q3Var7 = y3Var.f43930v;
            mVar22.e(h39, q3Var7);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar23 = this.f42725b;
            um.c h43 = cVar.h("TOTAL_AUDIENCE");
            q3Var6 = y3Var.f43931w;
            mVar23.e(h43, q3Var6);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar24 = this.f42725b;
            um.c h44 = cVar.h("USER_FOLLOW");
            q3Var5 = y3Var.f43932x;
            mVar24.e(h44, q3Var5);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar25 = this.f42725b;
            um.c h45 = cVar.h("VIDEO_10S_VIEW");
            q3Var4 = y3Var.f43933y;
            mVar25.e(h45, q3Var4);
        }
        if (zArr.length > 25 && zArr[25]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar26 = this.f42725b;
            um.c h46 = cVar.h("VIDEO_AVG_WATCH_TIME");
            q3Var3 = y3Var.f43934z;
            mVar26.e(h46, q3Var3);
        }
        if (zArr.length > 26 && zArr[26]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar27 = this.f42725b;
            um.c h47 = cVar.h("VIDEO_MRC_VIEW");
            q3Var2 = y3Var.A;
            mVar27.e(h47, q3Var2);
        }
        if (zArr.length > 27 && zArr[27]) {
            if (this.f42725b == null) {
                this.f42725b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar28 = this.f42725b;
            um.c h48 = cVar.h("VIDEO_V50_WATCH_TIME");
            q3Var = y3Var.B;
            mVar28.e(h48, q3Var);
        }
        cVar.g();
    }
}
