package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.f3;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class g3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37917a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37918b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37919c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37920d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37921e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37922f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f37923g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f37924h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f37925i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f37926j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f37927k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f37928l;

    public g3(nm.o oVar) {
        this.f37917a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        i3 i3Var = new i3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1957859307:
                    if (k03.equals("catalog_collection_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1842055179:
                    if (k03.equals("collections_header_text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1747001600:
                    if (k03.equals("is_dynamic_collections")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1657388219:
                    if (k03.equals("dpa_layout_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1496002765:
                    if (k03.equals("creator_analytics")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1363069311:
                    if (k03.equals("is_shop_the_look")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1266734491:
                    if (k03.equals("aggregated_stats")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1120985297:
                    if (k03.equals("comment_count")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -740223502:
                    if (k03.equals("has_xy_tags")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -434638717:
                    if (k03.equals("pin_tags")) {
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
                case 124730180:
                    if (k03.equals("is_stela")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 545689279:
                    if (k03.equals("slideshow_collections_aspect_ratio")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1113600752:
                    if (k03.equals("quick_replies_templates")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1240767211:
                    if (k03.equals("pin_tags_chips")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1351244414:
                    if (k03.equals("did_it_data")) {
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
            boolean[] zArr = i3Var.f38629s;
            nm.o oVar = this.f37917a;
            switch (c13) {
                case 0:
                    if (this.f37923g == null) {
                        this.f37923g = a.cb.q(oVar, Integer.class);
                    }
                    i3Var.f38614d = (Integer) this.f37923g.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f37928l == null) {
                        this.f37928l = a.cb.q(oVar, String.class);
                    }
                    i3Var.f38615e = (String) this.f37928l.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 2:
                    if (this.f37921e == null) {
                        this.f37921e = a.cb.q(oVar, Boolean.class);
                    }
                    i3Var.f38622l = (Boolean) this.f37921e.c(aVar);
                    if (zArr.length <= 11) {
                        break;
                    } else {
                        zArr[11] = true;
                        break;
                    }
                case 3:
                    if (this.f37919c == null) {
                        this.f37919c = a.cb.q(oVar, f3.a.class);
                    }
                    i3Var.f38619i = (f3.a) this.f37919c.c(aVar);
                    boolean[] zArr2 = i3Var.f38629s;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 4:
                    if (this.f37927k == null) {
                        this.f37927k = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$5
                        }).b();
                    }
                    i3Var.c((Map) this.f37927k.c(aVar));
                    break;
                case 5:
                    if (this.f37921e == null) {
                        this.f37921e = a.cb.q(oVar, Boolean.class);
                    }
                    i3Var.f38623m = (Boolean) this.f37921e.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case 6:
                    if (this.f37920d == null) {
                        this.f37920d = a.cb.q(oVar, m3.class);
                    }
                    i3Var.f38613c = (m3) this.f37920d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 7:
                    if (this.f37923g == null) {
                        this.f37923g = a.cb.q(oVar, Integer.class);
                    }
                    i3Var.f38616f = (Integer) this.f37923g.c(aVar);
                    boolean[] zArr3 = i3Var.f38629s;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f37921e == null) {
                        this.f37921e = a.cb.q(oVar, Boolean.class);
                    }
                    i3Var.f38620j = (Boolean) this.f37921e.c(aVar);
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f37925i == null) {
                        this.f37925i = oVar.g(new TypeToken<List<s50>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$6
                        }).b();
                    }
                    i3Var.e((List) this.f37925i.c(aVar));
                    break;
                case '\n':
                    if (this.f37928l == null) {
                        this.f37928l = a.cb.q(oVar, String.class);
                    }
                    i3Var.f38611a = (String) this.f37928l.c(aVar);
                    boolean[] zArr4 = i3Var.f38629s;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 11:
                    if (this.f37921e == null) {
                        this.f37921e = a.cb.q(oVar, Boolean.class);
                    }
                    i3Var.f38624n = (Boolean) this.f37921e.c(aVar);
                    if (zArr.length <= 13) {
                        break;
                    } else {
                        zArr[13] = true;
                        break;
                    }
                case '\f':
                    if (this.f37922f == null) {
                        this.f37922f = a.cb.q(oVar, Double.class);
                    }
                    i3Var.h((Double) this.f37922f.c(aVar));
                    break;
                case '\r':
                    if (this.f37928l == null) {
                        this.f37928l = a.cb.q(oVar, String.class);
                    }
                    i3Var.d((String) this.f37928l.c(aVar));
                    break;
                case 14:
                    if (this.f37926j == null) {
                        this.f37926j = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$8
                        }).b();
                    }
                    i3Var.g((List) this.f37926j.c(aVar));
                    break;
                case 15:
                    if (this.f37924h == null) {
                        this.f37924h = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$7
                        }).b();
                    }
                    i3Var.f((List) this.f37924h.c(aVar));
                    break;
                case 16:
                    if (this.f37918b == null) {
                        this.f37918b = a.cb.q(oVar, e3.class);
                    }
                    i3Var.f38618h = (e3) this.f37918b.c(aVar);
                    boolean[] zArr5 = i3Var.f38629s;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 17:
                    if (this.f37928l == null) {
                        this.f37928l = a.cb.q(oVar, String.class);
                    }
                    i3Var.f38612b = (String) this.f37928l.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return i3Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        List list;
        List list2;
        List list3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str;
        Boolean bool4;
        f3.a aVar;
        e3 e3Var;
        Map map;
        Integer num;
        String str2;
        Integer num2;
        m3 m3Var;
        String str3;
        String str4;
        f3 f3Var = (f3) obj;
        if (f3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = f3Var.f37445s;
        int length = zArr.length;
        nm.o oVar = this.f37917a;
        if (length > 0 && zArr[0]) {
            if (this.f37928l == null) {
                this.f37928l = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37928l;
            um.c h10 = cVar.h("id");
            str4 = f3Var.f37427a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37928l == null) {
                this.f37928l = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37928l;
            um.c h13 = cVar.h("node_id");
            str3 = f3Var.f37428b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37920d == null) {
                this.f37920d = a.cb.q(oVar, m3.class);
            }
            nm.m mVar3 = this.f37920d;
            um.c h14 = cVar.h("aggregated_stats");
            m3Var = f3Var.f37429c;
            mVar3.e(h14, m3Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37923g == null) {
                this.f37923g = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f37923g;
            um.c h15 = cVar.h("catalog_collection_type");
            num2 = f3Var.f37430d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37928l == null) {
                this.f37928l = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f37928l;
            um.c h16 = cVar.h("collections_header_text");
            str2 = f3Var.f37431e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37923g == null) {
                this.f37923g = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f37923g;
            um.c h17 = cVar.h("comment_count");
            num = f3Var.f37432f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37927k == null) {
                this.f37927k = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f37927k;
            um.c h18 = cVar.h("creator_analytics");
            map = f3Var.f37433g;
            mVar7.e(h18, map);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37918b == null) {
                this.f37918b = a.cb.q(oVar, e3.class);
            }
            nm.m mVar8 = this.f37918b;
            um.c h19 = cVar.h("did_it_data");
            e3Var = f3Var.f37434h;
            mVar8.e(h19, e3Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37919c == null) {
                this.f37919c = a.cb.q(oVar, f3.a.class);
            }
            nm.m mVar9 = this.f37919c;
            um.c h23 = cVar.h("dpa_layout_type");
            aVar = f3Var.f37435i;
            mVar9.e(h23, aVar);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37921e == null) {
                this.f37921e = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f37921e;
            um.c h24 = cVar.h("has_xy_tags");
            bool4 = f3Var.f37436j;
            mVar10.e(h24, bool4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37928l == null) {
                this.f37928l = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f37928l;
            um.c h25 = cVar.h("image_signature");
            str = f3Var.f37437k;
            mVar11.e(h25, str);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37921e == null) {
                this.f37921e = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f37921e;
            um.c h26 = cVar.h("is_dynamic_collections");
            bool3 = f3Var.f37438l;
            mVar12.e(h26, bool3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37921e == null) {
                this.f37921e = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f37921e;
            um.c h27 = cVar.h("is_shop_the_look");
            bool2 = f3Var.f37439m;
            mVar13.e(h27, bool2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37921e == null) {
                this.f37921e = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar14 = this.f37921e;
            um.c h28 = cVar.h("is_stela");
            bool = f3Var.f37440n;
            mVar14.e(h28, bool);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f37925i == null) {
                this.f37925i = oVar.g(new TypeToken<List<s50>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$2
                }).b();
            }
            nm.m mVar15 = this.f37925i;
            um.c h29 = cVar.h("pin_tags");
            list3 = f3Var.f37441o;
            mVar15.e(h29, list3);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f37924h == null) {
                this.f37924h = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$3
                }).b();
            }
            nm.m mVar16 = this.f37924h;
            um.c h33 = cVar.h("pin_tags_chips");
            list2 = f3Var.f37442p;
            mVar16.e(h33, list2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f37926j == null) {
                this.f37926j = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AggregatedPinData$AggregatedPinDataTypeAdapter$4
                }).b();
            }
            nm.m mVar17 = this.f37926j;
            um.c h34 = cVar.h("quick_replies_templates");
            list = f3Var.f37443q;
            mVar17.e(h34, list);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f37922f == null) {
                this.f37922f = a.cb.q(oVar, Double.class);
            }
            nm.m mVar18 = this.f37922f;
            um.c h35 = cVar.h("slideshow_collections_aspect_ratio");
            d2 = f3Var.f37444r;
            mVar18.e(h35, d2);
        }
        cVar.g();
    }
}
