package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class f20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37419a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37420b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37421c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37422d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37423e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37424f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f37425g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f37426h;

    public f20(nm.o oVar) {
        this.f37419a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        e20 e20Var = new e20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2060497896:
                    if (k03.equals("subtitle")) {
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
                case -1643894913:
                    if (k03.equals("feed_pins")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1487392650:
                    if (k03.equals("pear_simple_styles")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1326197564:
                    if (k03.equals("domain")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1011512447:
                    if (k03.equals("insight_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -805908241:
                    if (k03.equals("secondary_style_names")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -560789379:
                    if (k03.equals("primary_style_names")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 93997959:
                    if (k03.equals("brand")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1252696326:
                    if (k03.equals("cover_pins")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1313010159:
                    if (k03.equals("background_pins")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1587764724:
                    if (k03.equals("description_detail")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1636071003:
                    if (k03.equals("pear_styles")) {
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
            nm.o oVar = this.f37419a;
            switch (c13) {
                case 0:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37054p = (String) this.f37425g.c(aVar);
                    boolean[] zArr = e20Var.f37056r;
                    if (zArr.length <= 15) {
                        break;
                    } else {
                        zArr[15] = true;
                        break;
                    }
                case 1:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37045g = (String) this.f37425g.c(aVar);
                    boolean[] zArr2 = e20Var.f37056r;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f37423e == null) {
                        this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$10
                        }).b();
                    }
                    e20Var.f37048j = (List) this.f37423e.c(aVar);
                    boolean[] zArr3 = e20Var.f37056r;
                    if (zArr3.length <= 9) {
                        break;
                    } else {
                        zArr3[9] = true;
                        break;
                    }
                case 3:
                    if (this.f37421c == null) {
                        this.f37421c = oVar.g(new TypeToken<List<l20>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$11
                        }).b();
                    }
                    e20Var.f37050l = (List) this.f37421c.c(aVar);
                    boolean[] zArr4 = e20Var.f37056r;
                    if (zArr4.length <= 11) {
                        break;
                    } else {
                        zArr4[11] = true;
                        break;
                    }
                case 4:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37047i = (String) this.f37425g.c(aVar);
                    boolean[] zArr5 = e20Var.f37056r;
                    if (zArr5.length <= 8) {
                        break;
                    } else {
                        zArr5[8] = true;
                        break;
                    }
                case 5:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37049k = (String) this.f37425g.c(aVar);
                    boolean[] zArr6 = e20Var.f37056r;
                    if (zArr6.length <= 10) {
                        break;
                    } else {
                        zArr6[10] = true;
                        break;
                    }
                case 6:
                    if (this.f37424f == null) {
                        this.f37424f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$14
                        }).b();
                    }
                    e20Var.f37053o = (List) this.f37424f.c(aVar);
                    boolean[] zArr7 = e20Var.f37056r;
                    if (zArr7.length <= 14) {
                        break;
                    } else {
                        zArr7[14] = true;
                        break;
                    }
                case 7:
                    if (this.f37424f == null) {
                        this.f37424f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$13
                        }).b();
                    }
                    e20Var.f37052n = (List) this.f37424f.c(aVar);
                    boolean[] zArr8 = e20Var.f37056r;
                    if (zArr8.length <= 13) {
                        break;
                    } else {
                        zArr8[13] = true;
                        break;
                    }
                case '\b':
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37039a = (String) this.f37425g.c(aVar);
                    boolean[] zArr9 = e20Var.f37056r;
                    if (zArr9.length <= 0) {
                        break;
                    } else {
                        zArr9[0] = true;
                        break;
                    }
                case '\t':
                    if (this.f37420b == null) {
                        this.f37420b = a.cb.q(oVar, v7.class);
                    }
                    e20Var.f37042d = (v7) this.f37420b.c(aVar);
                    boolean[] zArr10 = e20Var.f37056r;
                    if (zArr10.length <= 3) {
                        break;
                    } else {
                        zArr10[3] = true;
                        break;
                    }
                case '\n':
                    if (this.f37426h == null) {
                        this.f37426h = a.cb.q(oVar, wy0.class);
                    }
                    e20Var.f37043e = (wy0) this.f37426h.c(aVar);
                    boolean[] zArr11 = e20Var.f37056r;
                    if (zArr11.length <= 4) {
                        break;
                    } else {
                        zArr11[4] = true;
                        break;
                    }
                case 11:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37055q = (String) this.f37425g.c(aVar);
                    boolean[] zArr12 = e20Var.f37056r;
                    if (zArr12.length <= 16) {
                        break;
                    } else {
                        zArr12[16] = true;
                        break;
                    }
                case '\f':
                    if (this.f37423e == null) {
                        this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$9
                        }).b();
                    }
                    e20Var.f37044f = (List) this.f37423e.c(aVar);
                    boolean[] zArr13 = e20Var.f37056r;
                    if (zArr13.length <= 5) {
                        break;
                    } else {
                        zArr13[5] = true;
                        break;
                    }
                case '\r':
                    if (this.f37423e == null) {
                        this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$8
                        }).b();
                    }
                    e20Var.f37041c = (List) this.f37423e.c(aVar);
                    boolean[] zArr14 = e20Var.f37056r;
                    if (zArr14.length <= 2) {
                        break;
                    } else {
                        zArr14[2] = true;
                        break;
                    }
                case 14:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37046h = (String) this.f37425g.c(aVar);
                    boolean[] zArr15 = e20Var.f37056r;
                    if (zArr15.length <= 7) {
                        break;
                    } else {
                        zArr15[7] = true;
                        break;
                    }
                case 15:
                    if (this.f37422d == null) {
                        this.f37422d = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$12
                        }).b();
                    }
                    e20Var.f37051m = (List) this.f37422d.c(aVar);
                    boolean[] zArr16 = e20Var.f37056r;
                    if (zArr16.length <= 12) {
                        break;
                    } else {
                        zArr16[12] = true;
                        break;
                    }
                case 16:
                    if (this.f37425g == null) {
                        this.f37425g = a.cb.q(oVar, String.class);
                    }
                    e20Var.f37040b = (String) this.f37425g.c(aVar);
                    boolean[] zArr17 = e20Var.f37056r;
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
        return new h20(e20Var.f37039a, e20Var.f37040b, e20Var.f37041c, e20Var.f37042d, e20Var.f37043e, e20Var.f37044f, e20Var.f37045g, e20Var.f37046h, e20Var.f37047i, e20Var.f37048j, e20Var.f37049k, e20Var.f37050l, e20Var.f37051m, e20Var.f37052n, e20Var.f37053o, e20Var.f37054p, e20Var.f37055q, e20Var.f37056r, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        List list4;
        String str3;
        List list5;
        String str4;
        String str5;
        String str6;
        List list6;
        wy0 wy0Var;
        v7 v7Var;
        List list7;
        String str7;
        String str8;
        h20 h20Var = (h20) obj;
        if (h20Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = h20Var.f38265r;
        int length = zArr.length;
        nm.o oVar = this.f37419a;
        if (length > 0 && zArr[0]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37425g;
            um.c h10 = cVar.h("id");
            str8 = h20Var.f38248a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37425g;
            um.c h13 = cVar.h("node_id");
            str7 = h20Var.f38249b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37423e == null) {
                this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f37423e;
            um.c h14 = cVar.h("background_pins");
            list7 = h20Var.f38250c;
            mVar3.e(h14, list7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37420b == null) {
                this.f37420b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar4 = this.f37420b;
            um.c h15 = cVar.h("board");
            v7Var = h20Var.f38251d;
            mVar4.e(h15, v7Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37426h == null) {
                this.f37426h = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar5 = this.f37426h;
            um.c h16 = cVar.h("brand");
            wy0Var = h20Var.f38252e;
            mVar5.e(h16, wy0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37423e == null) {
                this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$2
                }).b();
            }
            nm.m mVar6 = this.f37423e;
            um.c h17 = cVar.h("cover_pins");
            list6 = h20Var.f38253f;
            mVar6.e(h17, list6);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f37425g;
            um.c h18 = cVar.h("description");
            str6 = h20Var.f38254g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f37425g;
            um.c h19 = cVar.h("description_detail");
            str5 = h20Var.f38255h;
            mVar8.e(h19, str5);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37425g;
            um.c h23 = cVar.h("domain");
            str4 = h20Var.f38256i;
            mVar9.e(h23, str4);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37423e == null) {
                this.f37423e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$3
                }).b();
            }
            nm.m mVar10 = this.f37423e;
            um.c h24 = cVar.h("feed_pins");
            list5 = h20Var.f38257j;
            mVar10.e(h24, list5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f37425g;
            um.c h25 = cVar.h("insight_type");
            str3 = h20Var.f38258k;
            mVar11.e(h25, str3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37421c == null) {
                this.f37421c = oVar.g(new TypeToken<List<l20>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$4
                }).b();
            }
            nm.m mVar12 = this.f37421c;
            um.c h26 = cVar.h("pear_simple_styles");
            list4 = h20Var.f38259l;
            mVar12.e(h26, list4);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37422d == null) {
                this.f37422d = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$5
                }).b();
            }
            nm.m mVar13 = this.f37422d;
            um.c h27 = cVar.h("pear_styles");
            list3 = h20Var.f38260m;
            mVar13.e(h27, list3);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37424f == null) {
                this.f37424f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$6
                }).b();
            }
            nm.m mVar14 = this.f37424f;
            um.c h28 = cVar.h("primary_style_names");
            list2 = h20Var.f38261n;
            mVar14.e(h28, list2);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f37424f == null) {
                this.f37424f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearInsight$PearInsightTypeAdapter$7
                }).b();
            }
            nm.m mVar15 = this.f37424f;
            um.c h29 = cVar.h("secondary_style_names");
            list = h20Var.f38262o;
            mVar15.e(h29, list);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f37425g;
            um.c h33 = cVar.h("subtitle");
            str2 = h20Var.f38263p;
            mVar16.e(h33, str2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f37425g == null) {
                this.f37425g = a.cb.q(oVar, String.class);
            }
            nm.m mVar17 = this.f37425g;
            um.c h34 = cVar.h("title");
            str = h20Var.f38264q;
            mVar17.e(h34, str);
        }
        cVar.g();
    }
}
