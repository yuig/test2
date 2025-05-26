package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class f5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37565a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37566b;

    public f5(nm.o oVar) {
        this.f37565a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        h5 h5Var = new h5(0);
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
            nm.o oVar = this.f37565a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38274g = (m5) this.f37566b.c(aVar);
                    boolean[] zArr = h5Var.C;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38271d = (m5) this.f37566b.c(aVar);
                    boolean[] zArr2 = h5Var.C;
                    if (zArr2.length > 3) {
                        zArr2[3] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38276i = (m5) this.f37566b.c(aVar);
                    boolean[] zArr3 = h5Var.C;
                    if (zArr3.length > 8) {
                        zArr3[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38287t = (m5) this.f37566b.c(aVar);
                    boolean[] zArr4 = h5Var.C;
                    if (zArr4.length > 19) {
                        zArr4[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38272e = (m5) this.f37566b.c(aVar);
                    boolean[] zArr5 = h5Var.C;
                    if (zArr5.length > 4) {
                        zArr5[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38289v = (m5) this.f37566b.c(aVar);
                    boolean[] zArr6 = h5Var.C;
                    if (zArr6.length > 21) {
                        zArr6[21] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38280m = (m5) this.f37566b.c(aVar);
                    boolean[] zArr7 = h5Var.C;
                    if (zArr7.length > 12) {
                        zArr7[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38273f = (m5) this.f37566b.c(aVar);
                    boolean[] zArr8 = h5Var.C;
                    if (zArr8.length > 5) {
                        zArr8[5] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38270c = (m5) this.f37566b.c(aVar);
                    boolean[] zArr9 = h5Var.C;
                    if (zArr9.length > 2) {
                        zArr9[2] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\t':
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38278k = (m5) this.f37566b.c(aVar);
                    boolean[] zArr10 = h5Var.C;
                    if (zArr10.length > 10) {
                        zArr10[10] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\n':
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38286s = (m5) this.f37566b.c(aVar);
                    boolean[] zArr11 = h5Var.C;
                    if (zArr11.length > 18) {
                        zArr11[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    z13 = false;
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38292y = (m5) this.f37566b.c(aVar);
                    boolean[] zArr12 = h5Var.C;
                    if (zArr12.length > 24) {
                        zArr12[24] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\f':
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38268a = (m5) this.f37566b.c(aVar);
                    boolean[] zArr13 = h5Var.C;
                    if (zArr13.length > 0) {
                        z13 = false;
                        zArr13[0] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38279l = (m5) this.f37566b.c(aVar);
                    boolean[] zArr14 = h5Var.C;
                    if (zArr14.length > 11) {
                        zArr14[11] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38291x = (m5) this.f37566b.c(aVar);
                    boolean[] zArr15 = h5Var.C;
                    if (zArr15.length > 23) {
                        zArr15[23] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38290w = (m5) this.f37566b.c(aVar);
                    boolean[] zArr16 = h5Var.C;
                    if (zArr16.length > 22) {
                        zArr16[22] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38288u = (m5) this.f37566b.c(aVar);
                    boolean[] zArr17 = h5Var.C;
                    if (zArr17.length > 20) {
                        zArr17[20] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38285r = (m5) this.f37566b.c(aVar);
                    boolean[] zArr18 = h5Var.C;
                    if (zArr18.length > 17) {
                        zArr18[17] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38283p = (m5) this.f37566b.c(aVar);
                    boolean[] zArr19 = h5Var.C;
                    if (zArr19.length > 15) {
                        zArr19[15] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.A = (m5) this.f37566b.c(aVar);
                    boolean[] zArr20 = h5Var.C;
                    if (zArr20.length > 26) {
                        zArr20[26] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38281n = (m5) this.f37566b.c(aVar);
                    boolean[] zArr21 = h5Var.C;
                    if (zArr21.length > 13) {
                        zArr21[13] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38275h = (m5) this.f37566b.c(aVar);
                    boolean[] zArr22 = h5Var.C;
                    if (zArr22.length > 7) {
                        zArr22[7] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38282o = (m5) this.f37566b.c(aVar);
                    boolean[] zArr23 = h5Var.C;
                    if (zArr23.length > 14) {
                        zArr23[14] = true;
                        break;
                    }
                    break;
                case 23:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38293z = (m5) this.f37566b.c(aVar);
                    boolean[] zArr24 = h5Var.C;
                    if (zArr24.length > 25) {
                        zArr24[25] = true;
                        break;
                    }
                    break;
                case 24:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38284q = (m5) this.f37566b.c(aVar);
                    boolean[] zArr25 = h5Var.C;
                    if (zArr25.length > 16) {
                        zArr25[16] = true;
                        break;
                    }
                    break;
                case 25:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38269b = (m5) this.f37566b.c(aVar);
                    boolean[] zArr26 = h5Var.C;
                    if (zArr26.length > 1) {
                        zArr26[1] = true;
                        break;
                    }
                    break;
                case 26:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.f38277j = (m5) this.f37566b.c(aVar);
                    boolean[] zArr27 = h5Var.C;
                    if (zArr27.length > 9) {
                        zArr27[9] = true;
                        break;
                    }
                    break;
                case 27:
                    if (this.f37566b == null) {
                        this.f37566b = a.cb.q(oVar, m5.class);
                    }
                    h5Var.B = (m5) this.f37566b.c(aVar);
                    boolean[] zArr28 = h5Var.C;
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
        return new i5(h5Var.f38268a, h5Var.f38269b, h5Var.f38270c, h5Var.f38271d, h5Var.f38272e, h5Var.f38273f, h5Var.f38274g, h5Var.f38275h, h5Var.f38276i, h5Var.f38277j, h5Var.f38278k, h5Var.f38279l, h5Var.f38280m, h5Var.f38281n, h5Var.f38282o, h5Var.f38283p, h5Var.f38284q, h5Var.f38285r, h5Var.f38286s, h5Var.f38287t, h5Var.f38288u, h5Var.f38289v, h5Var.f38290w, h5Var.f38291x, h5Var.f38292y, h5Var.f38293z, h5Var.A, h5Var.B, h5Var.C, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        m5 m5Var;
        m5 m5Var2;
        m5 m5Var3;
        m5 m5Var4;
        m5 m5Var5;
        m5 m5Var6;
        m5 m5Var7;
        m5 m5Var8;
        m5 m5Var9;
        m5 m5Var10;
        m5 m5Var11;
        m5 m5Var12;
        m5 m5Var13;
        m5 m5Var14;
        m5 m5Var15;
        m5 m5Var16;
        m5 m5Var17;
        m5 m5Var18;
        m5 m5Var19;
        m5 m5Var20;
        m5 m5Var21;
        m5 m5Var22;
        m5 m5Var23;
        m5 m5Var24;
        m5 m5Var25;
        m5 m5Var26;
        m5 m5Var27;
        m5 m5Var28;
        i5 i5Var = (i5) obj;
        if (i5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i5Var.C;
        int length = zArr.length;
        nm.o oVar = this.f37565a;
        if (length > 0 && zArr[0]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar = this.f37566b;
            um.c h10 = cVar.h("CLICKTHROUGH");
            m5Var28 = i5Var.f38647a;
            mVar.e(h10, m5Var28);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar2 = this.f37566b;
            um.c h13 = cVar.h("CLOSEUP");
            m5Var27 = i5Var.f38648b;
            mVar2.e(h13, m5Var27);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar3 = this.f37566b;
            um.c h14 = cVar.h("ENGAGEMENT");
            m5Var26 = i5Var.f38649c;
            mVar3.e(h14, m5Var26);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar4 = this.f37566b;
            um.c h15 = cVar.h("ENGAGEMENT_RATE");
            m5Var25 = i5Var.f38650d;
            mVar4.e(h15, m5Var25);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar5 = this.f37566b;
            um.c h16 = cVar.h("ENGAGERS");
            m5Var24 = i5Var.f38651e;
            mVar5.e(h16, m5Var24);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar6 = this.f37566b;
            um.c h17 = cVar.h("FULL_SCREEN_PLAY");
            m5Var23 = i5Var.f38652f;
            mVar6.e(h17, m5Var23);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar7 = this.f37566b;
            um.c h18 = cVar.h("FULL_SCREEN_PLAYTIME");
            m5Var22 = i5Var.f38653g;
            mVar7.e(h18, m5Var22);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar8 = this.f37566b;
            um.c h19 = cVar.h("IMPRESSION");
            m5Var21 = i5Var.f38654h;
            mVar8.e(h19, m5Var21);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar9 = this.f37566b;
            um.c h23 = cVar.h("MONTHLY_ENGAGERS");
            m5Var20 = i5Var.f38655i;
            mVar9.e(h23, m5Var20);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar10 = this.f37566b;
            um.c h24 = cVar.h("MONTHLY_TOTAL_AUDIENCE");
            m5Var19 = i5Var.f38656j;
            mVar10.e(h24, m5Var19);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar11 = this.f37566b;
            um.c h25 = cVar.h("OUTBOUND_CLICK");
            m5Var18 = i5Var.f38657k;
            mVar11.e(h25, m5Var18);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar12 = this.f37566b;
            um.c h26 = cVar.h("OUTBOUND_CLICK_RATE");
            m5Var17 = i5Var.f38658l;
            mVar12.e(h26, m5Var17);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar13 = this.f37566b;
            um.c h27 = cVar.h("PIN_CLICK");
            m5Var16 = i5Var.f38659m;
            mVar13.e(h27, m5Var16);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar14 = this.f37566b;
            um.c h28 = cVar.h("PIN_CLICK_RATE");
            m5Var15 = i5Var.f38660n;
            mVar14.e(h28, m5Var15);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar15 = this.f37566b;
            um.c h29 = cVar.h("PRODUCT_TAG_CLICK");
            m5Var14 = i5Var.f38661o;
            mVar15.e(h29, m5Var14);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar16 = this.f37566b;
            um.c h33 = cVar.h("PRODUCT_TAG_IMPRESSION");
            m5Var13 = i5Var.f38662p;
            mVar16.e(h33, m5Var13);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar17 = this.f37566b;
            um.c h34 = cVar.h("PRODUCT_TAG_OUTBOUND_CLICK");
            m5Var12 = i5Var.f38663q;
            mVar17.e(h34, m5Var12);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar18 = this.f37566b;
            um.c h35 = cVar.h("PRODUCT_TAG_SAVE");
            m5Var11 = i5Var.f38664r;
            mVar18.e(h35, m5Var11);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar19 = this.f37566b;
            um.c h36 = cVar.h("PROFILE_VISIT");
            m5Var10 = i5Var.f38665s;
            mVar19.e(h36, m5Var10);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar20 = this.f37566b;
            um.c h37 = cVar.h("QUARTILE_95_PERCENT_VIEW");
            m5Var9 = i5Var.f38666t;
            mVar20.e(h37, m5Var9);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar21 = this.f37566b;
            um.c h38 = cVar.h("SAVE");
            m5Var8 = i5Var.f38667u;
            mVar21.e(h38, m5Var8);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar22 = this.f37566b;
            um.c h39 = cVar.h("SAVE_RATE");
            m5Var7 = i5Var.f38668v;
            mVar22.e(h39, m5Var7);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar23 = this.f37566b;
            um.c h43 = cVar.h("TOTAL_AUDIENCE");
            m5Var6 = i5Var.f38669w;
            mVar23.e(h43, m5Var6);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar24 = this.f37566b;
            um.c h44 = cVar.h("USER_FOLLOW");
            m5Var5 = i5Var.f38670x;
            mVar24.e(h44, m5Var5);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar25 = this.f37566b;
            um.c h45 = cVar.h("VIDEO_10S_VIEW");
            m5Var4 = i5Var.f38671y;
            mVar25.e(h45, m5Var4);
        }
        if (zArr.length > 25 && zArr[25]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar26 = this.f37566b;
            um.c h46 = cVar.h("VIDEO_AVG_WATCH_TIME");
            m5Var3 = i5Var.f38672z;
            mVar26.e(h46, m5Var3);
        }
        if (zArr.length > 26 && zArr[26]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar27 = this.f37566b;
            um.c h47 = cVar.h("VIDEO_MRC_VIEW");
            m5Var2 = i5Var.A;
            mVar27.e(h47, m5Var2);
        }
        if (zArr.length > 27 && zArr[27]) {
            if (this.f37566b == null) {
                this.f37566b = a.cb.q(oVar, m5.class);
            }
            nm.m mVar28 = this.f37566b;
            um.c h48 = cVar.h("VIDEO_V50_WATCH_TIME");
            m5Var = i5Var.B;
            mVar28.e(h48, m5Var);
        }
        cVar.g();
    }
}
