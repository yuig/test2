package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class qf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41291a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41292b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41293c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41294d;

    public qf0(nm.o oVar) {
        this.f41291a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mf0 mf0Var = new mf0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2022641747:
                    if (k03.equals("dominant_color_dark_hex")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1914420470:
                    if (k03.equals("accent_color_hex")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -866554606:
                    if (k03.equals("cover_image_dark_url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -117551776:
                    if (k03.equals("dominant_color_hex")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 109761319:
                    if (k03.equals("steps")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 493600573:
                    if (k03.equals("thumbnail_image_dark_url")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 507526452:
                    if (k03.equals("duration_minutes")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 742064670:
                    if (k03.equals("font_color_dark_hex")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1283242063:
                    if (k03.equals("font_color_hex")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1766182403:
                    if (k03.equals("cover_image_url")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1863578691:
                    if (k03.equals("accent_color_dark_hex")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 15;
                        break;
                    }
                    break;
            }
            boolean[] zArr = mf0Var.f40103q;
            nm.o oVar = this.f41291a;
            switch (c13) {
                case 0:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40093g = (String) this.f41294d.c(aVar);
                    if (zArr.length > 6) {
                        zArr[6] = true;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40090d = (String) this.f41294d.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40091e = (String) this.f41294d.c(aVar);
                    boolean[] zArr2 = mf0Var.f40103q;
                    if (zArr2.length > 4) {
                        zArr2[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40094h = (String) this.f41294d.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40087a = (String) this.f41294d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 5:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40098l = (String) this.f41294d.c(aVar);
                    if (zArr.length > 11) {
                        zArr[11] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f41293c == null) {
                        this.f41293c = oVar.g(new TypeToken<List<pf0>>(this) { // from class: com.pinterest.api.model.SafetyTextTreatment$SafetyTextTreatmentTypeAdapter$2
                        }).b();
                    }
                    mf0Var.f40099m = (List) this.f41293c.c(aVar);
                    if (zArr.length > 12) {
                        zArr[12] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40102p = (String) this.f41294d.c(aVar);
                    boolean[] zArr3 = mf0Var.f40103q;
                    if (zArr3.length > 15) {
                        zArr3[15] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40100n = (String) this.f41294d.c(aVar);
                    boolean[] zArr4 = mf0Var.f40103q;
                    if (zArr4.length > 13) {
                        zArr4[13] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f41292b == null) {
                        this.f41292b = a.cb.q(oVar, Integer.class);
                    }
                    mf0Var.f40095i = (Integer) this.f41292b.c(aVar);
                    boolean[] zArr5 = mf0Var.f40103q;
                    if (zArr5.length > 8) {
                        zArr5[8] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40096j = (String) this.f41294d.c(aVar);
                    boolean[] zArr6 = mf0Var.f40103q;
                    if (zArr6.length > 9) {
                        zArr6[9] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40101o = (String) this.f41294d.c(aVar);
                    boolean[] zArr7 = mf0Var.f40103q;
                    if (zArr7.length > 14) {
                        zArr7[14] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40097k = (String) this.f41294d.c(aVar);
                    boolean[] zArr8 = mf0Var.f40103q;
                    if (zArr8.length > 10) {
                        zArr8[10] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40092f = (String) this.f41294d.c(aVar);
                    boolean[] zArr9 = mf0Var.f40103q;
                    if (zArr9.length > 5) {
                        zArr9[5] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40089c = (String) this.f41294d.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f41294d == null) {
                        this.f41294d = a.cb.q(oVar, String.class);
                    }
                    mf0Var.f40088b = (String) this.f41294d.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                        break;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return mf0Var.a();
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
        sf0 sf0Var = (sf0) obj;
        if (sf0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sf0Var.f41910q;
        int length = zArr.length;
        nm.o oVar = this.f41291a;
        if (length > 0 && zArr[0]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41294d;
            um.c h10 = cVar.h("id");
            str14 = sf0Var.f41894a;
            mVar.e(h10, str14);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41294d;
            um.c h13 = cVar.h("node_id");
            str13 = sf0Var.f41895b;
            mVar2.e(h13, str13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41294d;
            um.c h14 = cVar.h("accent_color_dark_hex");
            str12 = sf0Var.f41896c;
            mVar3.e(h14, str12);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41294d;
            um.c h15 = cVar.h("accent_color_hex");
            str11 = sf0Var.f41897d;
            mVar4.e(h15, str11);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41294d;
            um.c h16 = cVar.h("cover_image_dark_url");
            str10 = sf0Var.f41898e;
            mVar5.e(h16, str10);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41294d;
            um.c h17 = cVar.h("cover_image_url");
            str9 = sf0Var.f41899f;
            mVar6.e(h17, str9);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41294d;
            um.c h18 = cVar.h("dominant_color_dark_hex");
            str8 = sf0Var.f41900g;
            mVar7.e(h18, str8);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f41294d;
            um.c h19 = cVar.h("dominant_color_hex");
            str7 = sf0Var.f41901h;
            mVar8.e(h19, str7);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41292b == null) {
                this.f41292b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f41292b;
            um.c h23 = cVar.h("duration_minutes");
            num = sf0Var.f41902i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f41294d;
            um.c h24 = cVar.h("font_color_dark_hex");
            str6 = sf0Var.f41903j;
            mVar10.e(h24, str6);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f41294d;
            um.c h25 = cVar.h("font_color_hex");
            str5 = sf0Var.f41904k;
            mVar11.e(h25, str5);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f41294d;
            um.c h26 = cVar.h("key");
            str4 = sf0Var.f41905l;
            mVar12.e(h26, str4);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f41293c == null) {
                this.f41293c = oVar.g(new TypeToken<List<pf0>>(this) { // from class: com.pinterest.api.model.SafetyTextTreatment$SafetyTextTreatmentTypeAdapter$1
                }).b();
            }
            nm.m mVar13 = this.f41293c;
            um.c h27 = cVar.h("steps");
            list = sf0Var.f41906m;
            mVar13.e(h27, list);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f41294d;
            um.c h28 = cVar.h("thumbnail_image_dark_url");
            str3 = sf0Var.f41907n;
            mVar14.e(h28, str3);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f41294d;
            um.c h29 = cVar.h("thumbnail_image_url");
            str2 = sf0Var.f41908o;
            mVar15.e(h29, str2);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f41294d == null) {
                this.f41294d = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f41294d;
            um.c h33 = cVar.h("title");
            str = sf0Var.f41909p;
            mVar16.e(h33, str);
        }
        cVar.g();
    }
}
