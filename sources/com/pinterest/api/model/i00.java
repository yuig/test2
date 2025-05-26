package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38580a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38581b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38582c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38583d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38584e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38585f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38586g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38587h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f38588i;

    public i00(nm.o oVar) {
        this.f38580a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        h00 h00Var = new h00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1807755978:
                    if (k03.equals("request_params")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1798367007:
                    if (k03.equals("search_parameters")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1274492040:
                    if (k03.equals("filter")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1116724143:
                    if (k03.equals("product_filter_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -890206629:
                    if (k03.equals("filter_keys")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -854547461:
                    if (k03.equals("filters")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -567321830:
                    if (k03.equals("contents")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -191571122:
                    if (k03.equals("feed_url")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 461177713:
                    if (k03.equals("search_query")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1890642929:
                    if (k03.equals("annotated_title")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38580a;
            switch (c13) {
                case 0:
                    if (this.f38586g == null) {
                        this.f38586g = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$9
                        }).b();
                    }
                    h00Var.f38219j = (Map) this.f38586g.c(aVar);
                    boolean[] zArr = h00Var.f38224o;
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 1:
                    if (this.f38585f == null) {
                        this.f38585f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$10
                        }).b();
                    }
                    h00Var.f38220k = (List) this.f38585f.c(aVar);
                    boolean[] zArr2 = h00Var.f38224o;
                    if (zArr2.length <= 10) {
                        break;
                    } else {
                        zArr2[10] = true;
                        break;
                    }
                case 2:
                    if (this.f38588i == null) {
                        this.f38588i = a.cb.q(oVar, px0.class);
                    }
                    h00Var.f38215f = (px0) this.f38588i.c(aVar);
                    boolean[] zArr3 = h00Var.f38224o;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f38582c == null) {
                        this.f38582c = a.cb.q(oVar, Integer.class);
                    }
                    h00Var.f38218i = (Integer) this.f38582c.c(aVar);
                    boolean[] zArr4 = h00Var.f38224o;
                    if (zArr4.length <= 8) {
                        break;
                    } else {
                        zArr4[8] = true;
                        break;
                    }
                case 4:
                    if (this.f38585f == null) {
                        this.f38585f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$7
                        }).b();
                    }
                    h00Var.f38216g = (List) this.f38585f.c(aVar);
                    boolean[] zArr5 = h00Var.f38224o;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f38583d == null) {
                        this.f38583d = oVar.g(new TypeToken<List<xl>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$8
                        }).b();
                    }
                    h00Var.f38217h = (List) this.f38583d.c(aVar);
                    boolean[] zArr6 = h00Var.f38224o;
                    if (zArr6.length <= 7) {
                        break;
                    } else {
                        zArr6[7] = true;
                        break;
                    }
                case 6:
                    if (this.f38584e == null) {
                        this.f38584e = oVar.g(new TypeToken<List<g00>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$6
                        }).b();
                    }
                    h00Var.f38213d = (List) this.f38584e.c(aVar);
                    boolean[] zArr7 = h00Var.f38224o;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case 7:
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.b((String) this.f38587h.c(aVar));
                    break;
                case '\b':
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.f38210a = (String) this.f38587h.c(aVar);
                    boolean[] zArr8 = h00Var.f38224o;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                case '\t':
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.f38223n = (String) this.f38587h.c(aVar);
                    boolean[] zArr9 = h00Var.f38224o;
                    if (zArr9.length <= 13) {
                        break;
                    } else {
                        zArr9[13] = true;
                        break;
                    }
                case '\n':
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.f38222m = (String) this.f38587h.c(aVar);
                    boolean[] zArr10 = h00Var.f38224o;
                    if (zArr10.length <= 12) {
                        break;
                    } else {
                        zArr10[12] = true;
                        break;
                    }
                case 11:
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.f38221l = (String) this.f38587h.c(aVar);
                    boolean[] zArr11 = h00Var.f38224o;
                    if (zArr11.length <= 11) {
                        break;
                    } else {
                        zArr11[11] = true;
                        break;
                    }
                case '\f':
                    if (this.f38581b == null) {
                        this.f38581b = a.cb.q(oVar, y5.class);
                    }
                    h00Var.f38212c = (y5) this.f38581b.c(aVar);
                    boolean[] zArr12 = h00Var.f38224o;
                    if (zArr12.length <= 2) {
                        break;
                    } else {
                        zArr12[2] = true;
                        break;
                    }
                case '\r':
                    if (this.f38587h == null) {
                        this.f38587h = a.cb.q(oVar, String.class);
                    }
                    h00Var.f38211b = (String) this.f38587h.c(aVar);
                    boolean[] zArr13 = h00Var.f38224o;
                    if (zArr13.length <= 1) {
                        break;
                    } else {
                        zArr13[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return h00Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        List list;
        Map map;
        Integer num;
        List list2;
        List list3;
        px0 px0Var;
        String str4;
        List list4;
        y5 y5Var;
        String str5;
        String str6;
        k00 k00Var = (k00) obj;
        if (k00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = k00Var.f39238o;
        int length = zArr.length;
        nm.o oVar = this.f38580a;
        if (length > 0 && zArr[0]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38587h;
            um.c h10 = cVar.h("id");
            str6 = k00Var.f39224a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38587h;
            um.c h13 = cVar.h("node_id");
            str5 = k00Var.f39225b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38581b == null) {
                this.f38581b = a.cb.q(oVar, y5.class);
            }
            nm.m mVar3 = this.f38581b;
            um.c h14 = cVar.h("annotated_title");
            y5Var = k00Var.f39226c;
            mVar3.e(h14, y5Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38584e == null) {
                this.f38584e = oVar.g(new TypeToken<List<g00>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f38584e;
            um.c h15 = cVar.h("contents");
            list4 = k00Var.f39227d;
            mVar4.e(h15, list4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38587h;
            um.c h16 = cVar.h("feed_url");
            str4 = k00Var.f39228e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38588i == null) {
                this.f38588i = a.cb.q(oVar, px0.class);
            }
            nm.m mVar6 = this.f38588i;
            um.c h17 = cVar.h("filter");
            px0Var = k00Var.f39229f;
            mVar6.e(h17, px0Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38585f == null) {
                this.f38585f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f38585f;
            um.c h18 = cVar.h("filter_keys");
            list3 = k00Var.f39230g;
            mVar7.e(h18, list3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38583d == null) {
                this.f38583d = oVar.g(new TypeToken<List<xl>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$3
                }).b();
            }
            nm.m mVar8 = this.f38583d;
            um.c h19 = cVar.h("filters");
            list2 = k00Var.f39231h;
            mVar8.e(h19, list2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38582c == null) {
                this.f38582c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f38582c;
            um.c h23 = cVar.h("product_filter_type");
            num = k00Var.f39232i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38586g == null) {
                this.f38586g = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$4
                }).b();
            }
            nm.m mVar10 = this.f38586g;
            um.c h24 = cVar.h("request_params");
            map = k00Var.f39233j;
            mVar10.e(h24, map);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38585f == null) {
                this.f38585f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmoduleaction$OnebarmoduleactionTypeAdapter$5
                }).b();
            }
            nm.m mVar11 = this.f38585f;
            um.c h25 = cVar.h("search_parameters");
            list = k00Var.f39234k;
            mVar11.e(h25, list);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f38587h;
            um.c h26 = cVar.h("search_query");
            str3 = k00Var.f39235l;
            mVar12.e(h26, str3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f38587h;
            um.c h27 = cVar.h("title");
            str2 = k00Var.f39236m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f38587h == null) {
                this.f38587h = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f38587h;
            um.c h28 = cVar.h("type");
            str = k00Var.f39237n;
            mVar14.e(h28, str);
        }
        cVar.g();
    }
}
