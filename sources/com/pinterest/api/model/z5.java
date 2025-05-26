package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class z5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44221a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44222b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44223c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44224d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44225e;

    public z5(nm.o oVar) {
        this.f44221a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b6 b6Var = new b6(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2046659981:
                    if (k03.equals("video_metadata")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -877843259:
                    if (k03.equals("image_alt")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -737607453:
                    if (k03.equals("icon_alt")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -737588055:
                    if (k03.equals("icon_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -730923020:
                    if (k03.equals("description_text_alignment")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 743373819:
                    if (k03.equals("video_placeholder_image_url")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 804991432:
                    if (k03.equals("image_aspect_ratio")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1333285803:
                    if (k03.equals("video_url")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1615288471:
                    if (k03.equals("display_type")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1851392783:
                    if (k03.equals("action_title")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1852205027:
                    if (k03.equals("action_uri")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 16;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44221a;
            switch (c13) {
                case 0:
                    if (this.f44222b == null) {
                        this.f44222b = a.cb.q(oVar, g6.class);
                    }
                    b6Var.f35993o = (g6) this.f44222b.c(aVar);
                    boolean[] zArr = b6Var.f35996r;
                    if (zArr.length <= 14) {
                        break;
                    } else {
                        zArr[14] = true;
                        break;
                    }
                case 1:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35983e = (String) this.f44225e.c(aVar);
                    boolean[] zArr2 = b6Var.f35996r;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35988j = (String) this.f44225e.c(aVar);
                    boolean[] zArr3 = b6Var.f35996r;
                    if (zArr3.length <= 9) {
                        break;
                    } else {
                        zArr3[9] = true;
                        break;
                    }
                case 3:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35990l = (String) this.f44225e.c(aVar);
                    boolean[] zArr4 = b6Var.f35996r;
                    if (zArr4.length <= 11) {
                        break;
                    } else {
                        zArr4[11] = true;
                        break;
                    }
                case 4:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35986h = (String) this.f44225e.c(aVar);
                    boolean[] zArr5 = b6Var.f35996r;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35987i = (String) this.f44225e.c(aVar);
                    boolean[] zArr6 = b6Var.f35996r;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case 6:
                    if (this.f44224d == null) {
                        this.f44224d = a.cb.q(oVar, Integer.class);
                    }
                    b6Var.f35984f = (Integer) this.f44224d.c(aVar);
                    boolean[] zArr7 = b6Var.f35996r;
                    if (zArr7.length <= 5) {
                        break;
                    } else {
                        zArr7[5] = true;
                        break;
                    }
                case 7:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35979a = (String) this.f44225e.c(aVar);
                    boolean[] zArr8 = b6Var.f35996r;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                case '\b':
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35992n = (String) this.f44225e.c(aVar);
                    boolean[] zArr9 = b6Var.f35996r;
                    if (zArr9.length <= 13) {
                        break;
                    } else {
                        zArr9[13] = true;
                        break;
                    }
                case '\t':
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35991m = (String) this.f44225e.c(aVar);
                    boolean[] zArr10 = b6Var.f35996r;
                    if (zArr10.length <= 12) {
                        break;
                    } else {
                        zArr10[12] = true;
                        break;
                    }
                case '\n':
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35994p = (String) this.f44225e.c(aVar);
                    boolean[] zArr11 = b6Var.f35996r;
                    if (zArr11.length <= 15) {
                        break;
                    } else {
                        zArr11[15] = true;
                        break;
                    }
                case 11:
                    if (this.f44223c == null) {
                        this.f44223c = a.cb.q(oVar, Double.class);
                    }
                    b6Var.f35989k = (Double) this.f44223c.c(aVar);
                    boolean[] zArr12 = b6Var.f35996r;
                    if (zArr12.length <= 10) {
                        break;
                    } else {
                        zArr12[10] = true;
                        break;
                    }
                case '\f':
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35995q = (String) this.f44225e.c(aVar);
                    boolean[] zArr13 = b6Var.f35996r;
                    if (zArr13.length <= 16) {
                        break;
                    } else {
                        zArr13[16] = true;
                        break;
                    }
                case '\r':
                    if (this.f44224d == null) {
                        this.f44224d = a.cb.q(oVar, Integer.class);
                    }
                    b6Var.f35985g = (Integer) this.f44224d.c(aVar);
                    boolean[] zArr14 = b6Var.f35996r;
                    if (zArr14.length <= 6) {
                        break;
                    } else {
                        zArr14[6] = true;
                        break;
                    }
                case 14:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35981c = (String) this.f44225e.c(aVar);
                    boolean[] zArr15 = b6Var.f35996r;
                    if (zArr15.length <= 2) {
                        break;
                    } else {
                        zArr15[2] = true;
                        break;
                    }
                case 15:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35982d = (String) this.f44225e.c(aVar);
                    boolean[] zArr16 = b6Var.f35996r;
                    if (zArr16.length <= 3) {
                        break;
                    } else {
                        zArr16[3] = true;
                        break;
                    }
                case 16:
                    if (this.f44225e == null) {
                        this.f44225e = a.cb.q(oVar, String.class);
                    }
                    b6Var.f35980b = (String) this.f44225e.c(aVar);
                    boolean[] zArr17 = b6Var.f35996r;
                    if (zArr17.length <= 1) {
                        break;
                    } else {
                        zArr17[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new c6(b6Var.f35979a, b6Var.f35980b, b6Var.f35981c, b6Var.f35982d, b6Var.f35983e, b6Var.f35984f, b6Var.f35985g, b6Var.f35986h, b6Var.f35987i, b6Var.f35988j, b6Var.f35989k, b6Var.f35990l, b6Var.f35991m, b6Var.f35992n, b6Var.f35993o, b6Var.f35994p, b6Var.f35995q, b6Var.f35996r, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        g6 g6Var;
        String str3;
        String str4;
        String str5;
        Double d2;
        String str6;
        String str7;
        String str8;
        Integer num;
        Integer num2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        c6 c6Var = (c6) obj;
        if (c6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = c6Var.f36313r;
        int length = zArr.length;
        nm.o oVar = this.f44221a;
        if (length > 0 && zArr[0]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44225e;
            um.c h10 = cVar.h("id");
            str13 = c6Var.f36296a;
            mVar.e(h10, str13);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44225e;
            um.c h13 = cVar.h("node_id");
            str12 = c6Var.f36297b;
            mVar2.e(h13, str12);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44225e;
            um.c h14 = cVar.h("action_title");
            str11 = c6Var.f36298c;
            mVar3.e(h14, str11);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44225e;
            um.c h15 = cVar.h("action_uri");
            str10 = c6Var.f36299d;
            mVar4.e(h15, str10);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44225e;
            um.c h16 = cVar.h("description");
            str9 = c6Var.f36300e;
            mVar5.e(h16, str9);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44224d == null) {
                this.f44224d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f44224d;
            um.c h17 = cVar.h("description_text_alignment");
            num2 = c6Var.f36301f;
            mVar6.e(h17, num2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44224d == null) {
                this.f44224d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f44224d;
            um.c h18 = cVar.h("display_type");
            num = c6Var.f36302g;
            mVar7.e(h18, num);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f44225e;
            um.c h19 = cVar.h("icon_alt");
            str8 = c6Var.f36303h;
            mVar8.e(h19, str8);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f44225e;
            um.c h23 = cVar.h("icon_url");
            str7 = c6Var.f36304i;
            mVar9.e(h23, str7);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f44225e;
            um.c h24 = cVar.h("image_alt");
            str6 = c6Var.f36305j;
            mVar10.e(h24, str6);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f44223c == null) {
                this.f44223c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar11 = this.f44223c;
            um.c h25 = cVar.h("image_aspect_ratio");
            d2 = c6Var.f36306k;
            mVar11.e(h25, d2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f44225e;
            um.c h26 = cVar.h("image_url");
            str5 = c6Var.f36307l;
            mVar12.e(h26, str5);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f44225e;
            um.c h27 = cVar.h("title");
            str4 = c6Var.f36308m;
            mVar13.e(h27, str4);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f44225e;
            um.c h28 = cVar.h("type");
            str3 = c6Var.f36309n;
            mVar14.e(h28, str3);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f44222b == null) {
                this.f44222b = a.cb.q(oVar, g6.class);
            }
            nm.m mVar15 = this.f44222b;
            um.c h29 = cVar.h("video_metadata");
            g6Var = c6Var.f36310o;
            mVar15.e(h29, g6Var);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f44225e;
            um.c h33 = cVar.h("video_placeholder_image_url");
            str2 = c6Var.f36311p;
            mVar16.e(h33, str2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f44225e == null) {
                this.f44225e = a.cb.q(oVar, String.class);
            }
            nm.m mVar17 = this.f44225e;
            um.c h34 = cVar.h("video_url");
            str = c6Var.f36312q;
            mVar17.e(h34, str);
        }
        cVar.g();
    }
}
