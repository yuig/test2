package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class xv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43801a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43802b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43803c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43804d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43805e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43806f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43807g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43808h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f43809i;

    public xv0(nm.o oVar) {
        this.f43801a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wv0 wv0Var = new wv0(0);
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
                case -1824803606:
                    if (k03.equals("show_creator")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1606977950:
                    if (k03.equals("has_dark_display_color")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1481666138:
                    if (k03.equals("display_color")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1442735800:
                    if (k03.equals("image_urls")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1196995252:
                    if (k03.equals("is_story_pin_animated")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -447071065:
                    if (k03.equals("article_creator_user")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -388812593:
                    if (k03.equals("content_pin")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -310874633:
                    if (k03.equals("header_pin_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -176996514:
                    if (k03.equals("is_video_cover")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 55393153:
                    if (k03.equals("is_feed_single_column")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 447951309:
                    if (k03.equals("is_product_pin_feed")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 529591859:
                    if (k03.equals("article_description")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1252696326:
                    if (k03.equals("cover_pins")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1333280721:
                    if (k03.equals("video_pin")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1615288471:
                    if (k03.equals("display_type")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 1691391383:
                    if (k03.equals("override_navigation_url")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 1820427719:
                    if (k03.equals("creators")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 1980072205:
                    if (k03.equals("cover_pin")) {
                        c13 = 20;
                        break;
                    }
                    break;
            }
            boolean[] zArr = wv0Var.f43404v;
            nm.o oVar = this.f43801a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.f43401s = (String) this.f43808h.c(aVar);
                    if (zArr.length <= 18) {
                        break;
                    } else {
                        zArr[18] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.f43400r = (Boolean) this.f43802b.c(aVar);
                    if (zArr.length > 17) {
                        zArr[17] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.f43391i = (Boolean) this.f43802b.c(aVar);
                    if (zArr.length > 8) {
                        zArr[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.f43389g = (String) this.f43808h.c(aVar);
                    if (zArr.length > 6) {
                        zArr[6] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f43805e == null) {
                        this.f43805e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$6
                        }).b();
                    }
                    wv0Var.f43394l = (List) this.f43805e.c(aVar);
                    if (zArr.length > 11) {
                        zArr[11] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.f43397o = (Boolean) this.f43802b.c(aVar);
                    if (zArr.length > 14) {
                        zArr[14] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (this.f43809i == null) {
                        this.f43809i = a.cb.q(oVar, wy0.class);
                    }
                    wv0Var.f43383a = (wy0) this.f43809i.c(aVar);
                    if (zArr.length > 0) {
                        z13 = false;
                        zArr[0] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f43807g == null) {
                        this.f43807g = a.cb.q(oVar, f30.class);
                    }
                    wv0Var.f43385c = (f30) this.f43807g.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.f43392j = (String) this.f43808h.c(aVar);
                    if (zArr.length > 9) {
                        zArr[9] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.f43398p = (Boolean) this.f43802b.c(aVar);
                    if (zArr.length > 15) {
                        zArr[15] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.d((String) this.f43808h.c(aVar));
                    break;
                case 11:
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.b((Boolean) this.f43802b.c(aVar));
                    break;
                case '\f':
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.c((String) this.f43808h.c(aVar));
                    break;
                case '\r':
                    if (this.f43802b == null) {
                        this.f43802b = a.cb.q(oVar, Boolean.class);
                    }
                    wv0Var.f43396n = (Boolean) this.f43802b.c(aVar);
                    if (zArr.length > 13) {
                        zArr[13] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.f43384b = (String) this.f43808h.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f43804d == null) {
                        this.f43804d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$4
                        }).b();
                    }
                    wv0Var.f43387e = (List) this.f43804d.c(aVar);
                    if (zArr.length > 4) {
                        zArr[4] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f43807g == null) {
                        this.f43807g = a.cb.q(oVar, f30.class);
                    }
                    wv0Var.f43403u = (f30) this.f43807g.c(aVar);
                    if (zArr.length > 20) {
                        zArr[20] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f43803c == null) {
                        this.f43803c = a.cb.q(oVar, Integer.class);
                    }
                    wv0Var.f43390h = (Integer) this.f43803c.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f43808h == null) {
                        this.f43808h = a.cb.q(oVar, String.class);
                    }
                    wv0Var.f43399q = (String) this.f43808h.c(aVar);
                    if (zArr.length > 16) {
                        zArr[16] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f43806f == null) {
                        this.f43806f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$5
                        }).b();
                    }
                    wv0Var.f43388f = (List) this.f43806f.c(aVar);
                    if (zArr.length > 5) {
                        zArr[5] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f43807g == null) {
                        this.f43807g = a.cb.q(oVar, f30.class);
                    }
                    wv0Var.f43386d = (f30) this.f43807g.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
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
        return wv0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        String str;
        String str2;
        Boolean bool;
        String str3;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        List list;
        String str4;
        String str5;
        Boolean bool6;
        Integer num;
        String str6;
        List list2;
        List list3;
        f30 f30Var2;
        f30 f30Var3;
        String str7;
        wy0 wy0Var;
        zv0 zv0Var = (zv0) obj;
        if (zv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zv0Var.f44492v;
        int length = zArr.length;
        nm.o oVar = this.f43801a;
        if (length > 0 && zArr[0]) {
            if (this.f43809i == null) {
                this.f43809i = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar = this.f43809i;
            um.c h10 = cVar.h("article_creator_user");
            wy0Var = zv0Var.f44471a;
            mVar.e(h10, wy0Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43808h;
            um.c h13 = cVar.h("article_description");
            str7 = zv0Var.f44472b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43807g == null) {
                this.f43807g = a.cb.q(oVar, f30.class);
            }
            nm.m mVar3 = this.f43807g;
            um.c h14 = cVar.h("content_pin");
            f30Var3 = zv0Var.f44473c;
            mVar3.e(h14, f30Var3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43807g == null) {
                this.f43807g = a.cb.q(oVar, f30.class);
            }
            nm.m mVar4 = this.f43807g;
            um.c h15 = cVar.h("cover_pin");
            f30Var2 = zv0Var.f44474d;
            mVar4.e(h15, f30Var2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43804d == null) {
                this.f43804d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f43804d;
            um.c h16 = cVar.h("cover_pins");
            list3 = zv0Var.f44475e;
            mVar5.e(h16, list3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43806f == null) {
                this.f43806f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$2
                }).b();
            }
            nm.m mVar6 = this.f43806f;
            um.c h17 = cVar.h("creators");
            list2 = zv0Var.f44476f;
            mVar6.e(h17, list2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f43808h;
            um.c h18 = cVar.h("display_color");
            str6 = zv0Var.f44477g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43803c == null) {
                this.f43803c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f43803c;
            um.c h19 = cVar.h("display_type");
            num = zv0Var.f44478h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f43802b;
            um.c h23 = cVar.h("has_dark_display_color");
            bool6 = zv0Var.f44479i;
            mVar9.e(h23, bool6);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f43808h;
            um.c h24 = cVar.h("header_pin_id");
            str5 = zv0Var.f44480j;
            mVar10.e(h24, str5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f43808h;
            um.c h25 = cVar.h("id");
            str4 = zv0Var.f44481k;
            mVar11.e(h25, str4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f43805e == null) {
                this.f43805e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TodayArticle$TodayArticleTypeAdapter$3
                }).b();
            }
            nm.m mVar12 = this.f43805e;
            um.c h26 = cVar.h("image_urls");
            list = zv0Var.f44482l;
            mVar12.e(h26, list);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f43802b;
            um.c h27 = cVar.h("is_feed_single_column");
            bool5 = zv0Var.f44483m;
            mVar13.e(h27, bool5);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar14 = this.f43802b;
            um.c h28 = cVar.h("is_product_pin_feed");
            bool4 = zv0Var.f44484n;
            mVar14.e(h28, bool4);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar15 = this.f43802b;
            um.c h29 = cVar.h("is_story_pin_animated");
            bool3 = zv0Var.f44485o;
            mVar15.e(h29, bool3);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar16 = this.f43802b;
            um.c h33 = cVar.h("is_video_cover");
            bool2 = zv0Var.f44486p;
            mVar16.e(h33, bool2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar17 = this.f43808h;
            um.c h34 = cVar.h("override_navigation_url");
            str3 = zv0Var.f44487q;
            mVar17.e(h34, str3);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f43802b == null) {
                this.f43802b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar18 = this.f43802b;
            um.c h35 = cVar.h("show_creator");
            bool = zv0Var.f44488r;
            mVar18.e(h35, bool);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f43808h;
            um.c h36 = cVar.h("subtitle");
            str2 = zv0Var.f44489s;
            mVar19.e(h36, str2);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f43808h == null) {
                this.f43808h = a.cb.q(oVar, String.class);
            }
            nm.m mVar20 = this.f43808h;
            um.c h37 = cVar.h("title");
            str = zv0Var.f44490t;
            mVar20.e(h37, str);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f43807g == null) {
                this.f43807g = a.cb.q(oVar, f30.class);
            }
            nm.m mVar21 = this.f43807g;
            um.c h38 = cVar.h("video_pin");
            f30Var = zv0Var.f44491u;
            mVar21.e(h38, f30Var);
        }
        cVar.g();
    }
}
