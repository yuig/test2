package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes3.dex */
public final class zf extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44318a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44319b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44320c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44321d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44322e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44323f;

    public zf(nm.o oVar) {
        this.f44318a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yf yfVar = new yf(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2076510893:
                    if (k03.equals("product_tag_click")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1788292820:
                    if (k03.equals("video_total_time")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1594228512:
                    if (k03.equals("is_realtime")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1298724489:
                    if (k03.equals("full_screen_play")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -712141003:
                    if (k03.equals("profile_visit")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -604268962:
                    if (k03.equals("pin_click")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -527007067:
                    if (k03.equals("user_follow")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -337082082:
                    if (k03.equals("product_tag_impression")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -47502093:
                    if (k03.equals("video_average_time")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 3522941:
                    if (k03.equals("save")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 55126294:
                    if (k03.equals("timestamp")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 120623625:
                    if (k03.equals("impression")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 279519097:
                    if (k03.equals("outbound_click")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 346933444:
                    if (k03.equals("full_screen_playtime")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 357843255:
                    if (k03.equals("video_p95_views")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 935914772:
                    if (k03.equals("video_10s_view")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1075021267:
                    if (k03.equals("is_unified_pin")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 1388054954:
                    if (k03.equals("video_views")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 1538622478:
                    if (k03.equals("product_tag_outbound_click")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 1873144914:
                    if (k03.equals("product_tag_save")) {
                        c13 = 20;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44318a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44029i = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr = yfVar.f44042v;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f44321d == null) {
                        this.f44321d = a.cb.q(oVar, Double.class);
                    }
                    yfVar.f44040t = (Double) this.f44321d.c(aVar);
                    boolean[] zArr2 = yfVar.f44042v;
                    if (zArr2.length > 19) {
                        zArr2[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f44319b == null) {
                        this.f44319b = a.cb.q(oVar, Boolean.class);
                    }
                    yfVar.f44025e = (Boolean) this.f44319b.c(aVar);
                    boolean[] zArr3 = yfVar.f44042v;
                    if (zArr3.length > 4) {
                        zArr3[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44021a = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr4 = yfVar.f44042v;
                    if (zArr4.length > 0) {
                        z13 = false;
                        zArr4[0] = true;
                        break;
                    }
                    break;
                case 4:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44033m = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr5 = yfVar.f44042v;
                    if (zArr5.length > 12) {
                        zArr5[12] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44028h = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr6 = yfVar.f44042v;
                    if (zArr6.length > 7) {
                        zArr6[7] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44036p = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr7 = yfVar.f44042v;
                    if (zArr7.length > 15) {
                        zArr7[15] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44030j = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr8 = yfVar.f44042v;
                    if (zArr8.length > 9) {
                        zArr8[9] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44038r = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr9 = yfVar.f44042v;
                    if (zArr9.length > 17) {
                        zArr9[17] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f44323f == null) {
                        this.f44323f = a.cb.q(oVar, String.class);
                    }
                    yfVar.f44023c = (String) this.f44323f.c(aVar);
                    boolean[] zArr10 = yfVar.f44042v;
                    if (zArr10.length > 2) {
                        zArr10[2] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44034n = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr11 = yfVar.f44042v;
                    if (zArr11.length > 13) {
                        zArr11[13] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f44320c == null) {
                        this.f44320c = a.cb.q(oVar, Date.class);
                    }
                    yfVar.f44035o = (Date) this.f44320c.c(aVar);
                    boolean[] zArr12 = yfVar.f44042v;
                    if (zArr12.length > 14) {
                        zArr12[14] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44024d = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr13 = yfVar.f44042v;
                    if (zArr13.length > 3) {
                        zArr13[3] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44027g = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr14 = yfVar.f44042v;
                    if (zArr14.length > 6) {
                        zArr14[6] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f44321d == null) {
                        this.f44321d = a.cb.q(oVar, Double.class);
                    }
                    yfVar.f44022b = (Double) this.f44321d.c(aVar);
                    boolean[] zArr15 = yfVar.f44042v;
                    if (zArr15.length > 1) {
                        zArr15[1] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44039s = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr16 = yfVar.f44042v;
                    if (zArr16.length > 18) {
                        zArr16[18] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44037q = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr17 = yfVar.f44042v;
                    if (zArr17.length > 16) {
                        zArr17[16] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f44319b == null) {
                        this.f44319b = a.cb.q(oVar, Boolean.class);
                    }
                    yfVar.f44026f = (Boolean) this.f44319b.c(aVar);
                    boolean[] zArr18 = yfVar.f44042v;
                    if (zArr18.length > 5) {
                        zArr18[5] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44041u = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr19 = yfVar.f44042v;
                    if (zArr19.length > 20) {
                        zArr19[20] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44031k = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr20 = yfVar.f44042v;
                    if (zArr20.length > 10) {
                        zArr20[10] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f44322e == null) {
                        this.f44322e = a.cb.q(oVar, Integer.class);
                    }
                    yfVar.f44032l = (Integer) this.f44322e.c(aVar);
                    boolean[] zArr21 = yfVar.f44042v;
                    if (zArr21.length > 11) {
                        zArr21[11] = true;
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
        return new bg(yfVar.f44021a, yfVar.f44022b, yfVar.f44023c, yfVar.f44024d, yfVar.f44025e, yfVar.f44026f, yfVar.f44027g, yfVar.f44028h, yfVar.f44029i, yfVar.f44030j, yfVar.f44031k, yfVar.f44032l, yfVar.f44033m, yfVar.f44034n, yfVar.f44035o, yfVar.f44036p, yfVar.f44037q, yfVar.f44038r, yfVar.f44039s, yfVar.f44040t, yfVar.f44041u, yfVar.f44042v, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Double d2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Date date;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Boolean bool;
        Boolean bool2;
        Integer num14;
        String str;
        Double d13;
        Integer num15;
        bg bgVar = (bg) obj;
        if (bgVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bgVar.f36093v;
        int length = zArr.length;
        nm.o oVar = this.f44318a;
        if (length > 0 && zArr[0]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f44322e;
            um.c h10 = cVar.h("full_screen_play");
            num15 = bgVar.f36072a;
            mVar.e(h10, num15);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44321d == null) {
                this.f44321d = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f44321d;
            um.c h13 = cVar.h("full_screen_playtime");
            d13 = bgVar.f36073b;
            mVar2.e(h13, d13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44323f == null) {
                this.f44323f = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44323f;
            um.c h14 = cVar.h("id");
            str = bgVar.f36074c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f44322e;
            um.c h15 = cVar.h("impression");
            num14 = bgVar.f36075d;
            mVar4.e(h15, num14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44319b == null) {
                this.f44319b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f44319b;
            um.c h16 = cVar.h("is_realtime");
            bool2 = bgVar.f36076e;
            mVar5.e(h16, bool2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44319b == null) {
                this.f44319b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f44319b;
            um.c h17 = cVar.h("is_unified_pin");
            bool = bgVar.f36077f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f44322e;
            um.c h18 = cVar.h("outbound_click");
            num13 = bgVar.f36078g;
            mVar7.e(h18, num13);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f44322e;
            um.c h19 = cVar.h("pin_click");
            num12 = bgVar.f36079h;
            mVar8.e(h19, num12);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f44322e;
            um.c h23 = cVar.h("product_tag_click");
            num11 = bgVar.f36080i;
            mVar9.e(h23, num11);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f44322e;
            um.c h24 = cVar.h("product_tag_impression");
            num10 = bgVar.f36081j;
            mVar10.e(h24, num10);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f44322e;
            um.c h25 = cVar.h("product_tag_outbound_click");
            num9 = bgVar.f36082k;
            mVar11.e(h25, num9);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f44322e;
            um.c h26 = cVar.h("product_tag_save");
            num8 = bgVar.f36083l;
            mVar12.e(h26, num8);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar13 = this.f44322e;
            um.c h27 = cVar.h("profile_visit");
            num7 = bgVar.f36084m;
            mVar13.e(h27, num7);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar14 = this.f44322e;
            um.c h28 = cVar.h("save");
            num6 = bgVar.f36085n;
            mVar14.e(h28, num6);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f44320c == null) {
                this.f44320c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar15 = this.f44320c;
            um.c h29 = cVar.h("timestamp");
            date = bgVar.f36086o;
            mVar15.e(h29, date);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar16 = this.f44322e;
            um.c h33 = cVar.h("user_follow");
            num5 = bgVar.f36087p;
            mVar16.e(h33, num5);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar17 = this.f44322e;
            um.c h34 = cVar.h("video_10s_view");
            num4 = bgVar.f36088q;
            mVar17.e(h34, num4);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar18 = this.f44322e;
            um.c h35 = cVar.h("video_average_time");
            num3 = bgVar.f36089r;
            mVar18.e(h35, num3);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar19 = this.f44322e;
            um.c h36 = cVar.h("video_p95_views");
            num2 = bgVar.f36090s;
            mVar19.e(h36, num2);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f44321d == null) {
                this.f44321d = a.cb.q(oVar, Double.class);
            }
            nm.m mVar20 = this.f44321d;
            um.c h37 = cVar.h("video_total_time");
            d2 = bgVar.f36091t;
            mVar20.e(h37, d2);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f44322e == null) {
                this.f44322e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar21 = this.f44322e;
            um.c h38 = cVar.h("video_views");
            num = bgVar.f36092u;
            mVar21.e(h38, num);
        }
        cVar.g();
    }
}
