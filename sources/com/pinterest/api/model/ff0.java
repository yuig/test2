package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ff0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37655a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37656b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37657c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37658d;

    public ff0(nm.o oVar) {
        this.f37655a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bf0 bf0Var = new bf0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2096486348:
                    if (k03.equals("audio_dark_animation_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2022641747:
                    if (k03.equals("dominant_color_dark_hex")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1914420470:
                    if (k03.equals("accent_color_hex")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -866554606:
                    if (k03.equals("cover_image_dark_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -117551776:
                    if (k03.equals("dominant_color_hex")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 109761319:
                    if (k03.equals("steps")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 200387979:
                    if (k03.equals("audio_animation_url")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 493600573:
                    if (k03.equals("thumbnail_image_dark_url")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 507526452:
                    if (k03.equals("duration_minutes")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 742064670:
                    if (k03.equals("font_color_dark_hex")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1283242063:
                    if (k03.equals("font_color_hex")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1766182403:
                    if (k03.equals("cover_image_url")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1863578691:
                    if (k03.equals("accent_color_dark_hex")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 17;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37655a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36058f = (String) this.f37658d.c(aVar);
                    boolean[] zArr = bf0Var.f36071s;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36061i = (String) this.f37658d.c(aVar);
                    boolean[] zArr2 = bf0Var.f36071s;
                    if (zArr2.length > 8) {
                        zArr2[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36056d = (String) this.f37658d.c(aVar);
                    boolean[] zArr3 = bf0Var.f36071s;
                    if (zArr3.length > 3) {
                        zArr3[3] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36059g = (String) this.f37658d.c(aVar);
                    boolean[] zArr4 = bf0Var.f36071s;
                    if (zArr4.length > 6) {
                        zArr4[6] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36062j = (String) this.f37658d.c(aVar);
                    boolean[] zArr5 = bf0Var.f36071s;
                    if (zArr5.length > 9) {
                        zArr5[9] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36053a = (String) this.f37658d.c(aVar);
                    boolean[] zArr6 = bf0Var.f36071s;
                    if (zArr6.length > 0) {
                        z13 = false;
                        zArr6[0] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36066n = (String) this.f37658d.c(aVar);
                    boolean[] zArr7 = bf0Var.f36071s;
                    if (zArr7.length > 13) {
                        zArr7[13] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f37657c == null) {
                        this.f37657c = oVar.g(new TypeToken<List<ef0>>(this) { // from class: com.pinterest.api.model.SafetyAudioTreatment$SafetyAudioTreatmentTypeAdapter$2
                        }).b();
                    }
                    bf0Var.f36067o = (List) this.f37657c.c(aVar);
                    boolean[] zArr8 = bf0Var.f36071s;
                    if (zArr8.length > 14) {
                        zArr8[14] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36070r = (String) this.f37658d.c(aVar);
                    boolean[] zArr9 = bf0Var.f36071s;
                    if (zArr9.length > 17) {
                        zArr9[17] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36057e = (String) this.f37658d.c(aVar);
                    boolean[] zArr10 = bf0Var.f36071s;
                    if (zArr10.length > 4) {
                        zArr10[4] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36068p = (String) this.f37658d.c(aVar);
                    boolean[] zArr11 = bf0Var.f36071s;
                    if (zArr11.length > 15) {
                        zArr11[15] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f37656b == null) {
                        this.f37656b = a.cb.q(oVar, Integer.class);
                    }
                    bf0Var.f36063k = (Integer) this.f37656b.c(aVar);
                    boolean[] zArr12 = bf0Var.f36071s;
                    if (zArr12.length > 10) {
                        zArr12[10] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36064l = (String) this.f37658d.c(aVar);
                    boolean[] zArr13 = bf0Var.f36071s;
                    if (zArr13.length > 11) {
                        zArr13[11] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36069q = (String) this.f37658d.c(aVar);
                    boolean[] zArr14 = bf0Var.f36071s;
                    if (zArr14.length > 16) {
                        zArr14[16] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36065m = (String) this.f37658d.c(aVar);
                    boolean[] zArr15 = bf0Var.f36071s;
                    if (zArr15.length > 12) {
                        zArr15[12] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36060h = (String) this.f37658d.c(aVar);
                    boolean[] zArr16 = bf0Var.f36071s;
                    if (zArr16.length > 7) {
                        zArr16[7] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36055c = (String) this.f37658d.c(aVar);
                    boolean[] zArr17 = bf0Var.f36071s;
                    if (zArr17.length > 2) {
                        zArr17[2] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f37658d == null) {
                        this.f37658d = a.cb.q(oVar, String.class);
                    }
                    bf0Var.f36054b = (String) this.f37658d.c(aVar);
                    boolean[] zArr18 = bf0Var.f36071s;
                    if (zArr18.length > 1) {
                        zArr18[1] = true;
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
        return new hf0(bf0Var.f36053a, bf0Var.f36054b, bf0Var.f36055c, bf0Var.f36056d, bf0Var.f36057e, bf0Var.f36058f, bf0Var.f36059g, bf0Var.f36060h, bf0Var.f36061i, bf0Var.f36062j, bf0Var.f36063k, bf0Var.f36064l, bf0Var.f36065m, bf0Var.f36066n, bf0Var.f36067o, bf0Var.f36068p, bf0Var.f36069q, bf0Var.f36070r, bf0Var.f36071s, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        String str5;
        String str6;
        Integer num;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        hf0 hf0Var = (hf0) obj;
        if (hf0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hf0Var.f38429s;
        int length = zArr.length;
        nm.o oVar = this.f37655a;
        if (length > 0 && zArr[0]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37658d;
            um.c h10 = cVar.h("id");
            str16 = hf0Var.f38411a;
            mVar.e(h10, str16);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37658d;
            um.c h13 = cVar.h("node_id");
            str15 = hf0Var.f38412b;
            mVar2.e(h13, str15);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37658d;
            um.c h14 = cVar.h("accent_color_dark_hex");
            str14 = hf0Var.f38413c;
            mVar3.e(h14, str14);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37658d;
            um.c h15 = cVar.h("accent_color_hex");
            str13 = hf0Var.f38414d;
            mVar4.e(h15, str13);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f37658d;
            um.c h16 = cVar.h("audio_animation_url");
            str12 = hf0Var.f38415e;
            mVar5.e(h16, str12);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37658d;
            um.c h17 = cVar.h("audio_dark_animation_url");
            str11 = hf0Var.f38416f;
            mVar6.e(h17, str11);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f37658d;
            um.c h18 = cVar.h("cover_image_dark_url");
            str10 = hf0Var.f38417g;
            mVar7.e(h18, str10);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f37658d;
            um.c h19 = cVar.h("cover_image_url");
            str9 = hf0Var.f38418h;
            mVar8.e(h19, str9);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37658d;
            um.c h23 = cVar.h("dominant_color_dark_hex");
            str8 = hf0Var.f38419i;
            mVar9.e(h23, str8);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f37658d;
            um.c h24 = cVar.h("dominant_color_hex");
            str7 = hf0Var.f38420j;
            mVar10.e(h24, str7);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37656b == null) {
                this.f37656b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f37656b;
            um.c h25 = cVar.h("duration_minutes");
            num = hf0Var.f38421k;
            mVar11.e(h25, num);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f37658d;
            um.c h26 = cVar.h("font_color_dark_hex");
            str6 = hf0Var.f38422l;
            mVar12.e(h26, str6);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f37658d;
            um.c h27 = cVar.h("font_color_hex");
            str5 = hf0Var.f38423m;
            mVar13.e(h27, str5);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f37658d;
            um.c h28 = cVar.h("key");
            str4 = hf0Var.f38424n;
            mVar14.e(h28, str4);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f37657c == null) {
                this.f37657c = oVar.g(new TypeToken<List<ef0>>(this) { // from class: com.pinterest.api.model.SafetyAudioTreatment$SafetyAudioTreatmentTypeAdapter$1
                }).b();
            }
            nm.m mVar15 = this.f37657c;
            um.c h29 = cVar.h("steps");
            list = hf0Var.f38425o;
            mVar15.e(h29, list);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f37658d;
            um.c h33 = cVar.h("thumbnail_image_dark_url");
            str3 = hf0Var.f38426p;
            mVar16.e(h33, str3);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar17 = this.f37658d;
            um.c h34 = cVar.h("thumbnail_image_url");
            str2 = hf0Var.f38427q;
            mVar17.e(h34, str2);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f37658d == null) {
                this.f37658d = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f37658d;
            um.c h35 = cVar.h("title");
            str = hf0Var.f38428r;
            mVar18.e(h35, str);
        }
        cVar.g();
    }
}
