package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class qe0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41280a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41281b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41282c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41283d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41284e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41285f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41286g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41287h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41288i;

    public qe0(nm.o oVar) {
        this.f41280a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pe0 pe0Var = new pe0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2120607484:
                    if (k03.equals("mobile_app")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1876039681:
                    if (k03.equals("display_description")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1615766951:
                    if (k03.equals("apple_touch_icon_images")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1161803523:
                    if (k03.equals("actions")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1152254205:
                    if (k03.equals("favicon_images")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1107912085:
                    if (k03.equals("is_product_pin_v2")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1033514171:
                    if (k03.equals("favicon_link")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1003761308:
                    if (k03.equals("products")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -881947619:
                    if (k03.equals("aggregate_rating")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -743689689:
                    if (k03.equals("display_cook_time")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -636222346:
                    if (k03.equals("has_instant_content")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -533477245:
                    if (k03.equals("site_name")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 7343131:
                    if (k03.equals("apple_touch_icon_link")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 519182448:
                    if (k03.equals("type_name")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1615086568:
                    if (k03.equals("display_name")) {
                        c13 = 17;
                        break;
                    }
                    break;
            }
            boolean[] zArr = pe0Var.f40963s;
            nm.o oVar = this.f41280a;
            switch (c13) {
                case 0:
                    if (this.f41287h == null) {
                        this.f41287h = a.cb.q(oVar, dw.class);
                    }
                    pe0Var.f40957m = (dw) this.f41287h.c(aVar);
                    if (zArr.length > 12) {
                        zArr[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40950f = (String) this.f41288i.c(aVar);
                    if (zArr.length > 5) {
                        zArr[5] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (this.f41286g == null) {
                        this.f41286g = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$6
                        }).b();
                    }
                    pe0Var.f40947c = (Map) this.f41286g.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (this.f41285f == null) {
                        this.f41285f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$5
                        }).b();
                    }
                    pe0Var.f40945a = (List) this.f41285f.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 4:
                    if (this.f41286g == null) {
                        this.f41286g = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$7
                        }).b();
                    }
                    pe0Var.f40952h = (Map) this.f41286g.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f41282c == null) {
                        this.f41282c = a.cb.q(oVar, Boolean.class);
                    }
                    pe0Var.c((Boolean) this.f41282c.c(aVar));
                    break;
                case 6:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40953i = (String) this.f41288i.c(aVar);
                    if (zArr.length > 8) {
                        zArr[8] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f41284e == null) {
                        this.f41284e = oVar.g(new TypeToken<List<we0>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$8
                        }).b();
                    }
                    pe0Var.f40958n = (List) this.f41284e.c(aVar);
                    boolean[] zArr2 = pe0Var.f40963s;
                    if (zArr2.length > 13) {
                        zArr2[13] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f41281b == null) {
                        this.f41281b = a.cb.q(oVar, v2.class);
                    }
                    pe0Var.f40946b = (v2) this.f41281b.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f41283d == null) {
                        this.f41283d = a.cb.q(oVar, Integer.class);
                    }
                    pe0Var.f40949e = (Integer) this.f41283d.c(aVar);
                    if (zArr.length > 4) {
                        zArr[4] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f41282c == null) {
                        this.f41282c = a.cb.q(oVar, Boolean.class);
                    }
                    pe0Var.b((Boolean) this.f41282c.c(aVar));
                    break;
                case 11:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40959o = (String) this.f41288i.c(aVar);
                    if (zArr.length > 14) {
                        zArr[14] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40955k = (String) this.f41288i.c(aVar);
                    if (zArr.length > 10) {
                        zArr[10] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40962r = (String) this.f41288i.c(aVar);
                    if (zArr.length > 17) {
                        zArr[17] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40960p = (String) this.f41288i.c(aVar);
                    if (zArr.length > 15) {
                        zArr[15] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40948d = (String) this.f41288i.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40961q = (String) this.f41288i.c(aVar);
                    boolean[] zArr3 = pe0Var.f40963s;
                    if (zArr3.length > 16) {
                        zArr3[16] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f41288i == null) {
                        this.f41288i = a.cb.q(oVar, String.class);
                    }
                    pe0Var.f40951g = (String) this.f41288i.c(aVar);
                    boolean[] zArr4 = pe0Var.f40963s;
                    if (zArr4.length > 6) {
                        zArr4[6] = true;
                        break;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return pe0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        List list;
        dw dwVar;
        Boolean bool;
        String str5;
        Boolean bool2;
        String str6;
        Map map;
        String str7;
        String str8;
        Integer num;
        String str9;
        Map map2;
        v2 v2Var;
        List list2;
        se0 se0Var = (se0) obj;
        if (se0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = se0Var.f41887s;
        int length = zArr.length;
        nm.o oVar = this.f41280a;
        if (length > 0 && zArr[0]) {
            if (this.f41285f == null) {
                this.f41285f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f41285f;
            um.c h10 = cVar.h("actions");
            list2 = se0Var.f41869a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41281b == null) {
                this.f41281b = a.cb.q(oVar, v2.class);
            }
            nm.m mVar2 = this.f41281b;
            um.c h13 = cVar.h("aggregate_rating");
            v2Var = se0Var.f41870b;
            mVar2.e(h13, v2Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41286g == null) {
                this.f41286g = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$2
                }).b();
            }
            nm.m mVar3 = this.f41286g;
            um.c h14 = cVar.h("apple_touch_icon_images");
            map2 = se0Var.f41871c;
            mVar3.e(h14, map2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41288i;
            um.c h15 = cVar.h("apple_touch_icon_link");
            str9 = se0Var.f41872d;
            mVar4.e(h15, str9);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41283d == null) {
                this.f41283d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41283d;
            um.c h16 = cVar.h("display_cook_time");
            num = se0Var.f41873e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41288i;
            um.c h17 = cVar.h("display_description");
            str8 = se0Var.f41874f;
            mVar6.e(h17, str8);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41288i;
            um.c h18 = cVar.h("display_name");
            str7 = se0Var.f41875g;
            mVar7.e(h18, str7);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41286g == null) {
                this.f41286g = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$3
                }).b();
            }
            nm.m mVar8 = this.f41286g;
            um.c h19 = cVar.h("favicon_images");
            map = se0Var.f41876h;
            mVar8.e(h19, map);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f41288i;
            um.c h23 = cVar.h("favicon_link");
            str6 = se0Var.f41877i;
            mVar9.e(h23, str6);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41282c == null) {
                this.f41282c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f41282c;
            um.c h24 = cVar.h("has_instant_content");
            bool2 = se0Var.f41878j;
            mVar10.e(h24, bool2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f41288i;
            um.c h25 = cVar.h("id");
            str5 = se0Var.f41879k;
            mVar11.e(h25, str5);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41282c == null) {
                this.f41282c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f41282c;
            um.c h26 = cVar.h("is_product_pin_v2");
            bool = se0Var.f41880l;
            mVar12.e(h26, bool);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f41287h == null) {
                this.f41287h = a.cb.q(oVar, dw.class);
            }
            nm.m mVar13 = this.f41287h;
            um.c h27 = cVar.h("mobile_app");
            dwVar = se0Var.f41881m;
            mVar13.e(h27, dwVar);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f41284e == null) {
                this.f41284e = oVar.g(new TypeToken<List<we0>>(this) { // from class: com.pinterest.api.model.RichSummary$RichSummaryTypeAdapter$4
                }).b();
            }
            nm.m mVar14 = this.f41284e;
            um.c h28 = cVar.h("products");
            list = se0Var.f41882n;
            mVar14.e(h28, list);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f41288i;
            um.c h29 = cVar.h("site_name");
            str4 = se0Var.f41883o;
            mVar15.e(h29, str4);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f41288i;
            um.c h33 = cVar.h("type");
            str3 = se0Var.f41884p;
            mVar16.e(h33, str3);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar17 = this.f41288i;
            um.c h34 = cVar.h("type_name");
            str2 = se0Var.f41885q;
            mVar17.e(h34, str2);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f41288i == null) {
                this.f41288i = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f41288i;
            um.c h35 = cVar.h("url");
            str = se0Var.f41886r;
            mVar18.e(h35, str);
        }
        cVar.g();
    }
}
