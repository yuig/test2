package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.g;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38192a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38193b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38194c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38195d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38196e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38197f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38198g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38199h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f38200i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f38201j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f38202k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f38203l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f38204m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f38205n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f38206o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f38207p;

    public h(nm.o oVar) {
        this.f38192a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j jVar = new j(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1624614445:
                    if (k03.equals("link_info")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1547838934:
                    if (k03.equals("grid_click_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1258855391:
                    if (k03.equals("is_native_browser_eligible")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1235303236:
                    if (k03.equals("shopping_integration_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1223891630:
                    if (k03.equals("grid_cta_data")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1150508209:
                    if (k03.equals("adapter")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1076472610:
                    if (k03.equals("badge_content_items")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1023580638:
                    if (k03.equals("disclosure_label")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -939806390:
                    if (k03.equals("dl_ad_closeup_ingress_variant")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -801958099:
                    if (k03.equals("pinner_geolocation")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -730171919:
                    if (k03.equals("attribution_style")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -702722614:
                    if (k03.equals("creative_type")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -686977647:
                    if (k03.equals("carousel_scroll_animation")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case -501540021:
                    if (k03.equals("custom_grid_configuration")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case -121156691:
                    if (k03.equals("is_weight_loss_ad")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 55192982:
                    if (k03.equals("exclude_from_grid_rep_tests")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 267100189:
                    if (k03.equals("disclosure_url")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 439491086:
                    if (k03.equals("third_party")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 493874463:
                    if (k03.equals("show_rating")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 617603721:
                    if (k03.equals("collection_grid_click_type")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 644453775:
                    if (k03.equals("campaign_objective_type")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 661286975:
                    if (k03.equals("dpa_variant_id")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case 700123128:
                    if (k03.equals("is_collage_single_destination")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case 770166324:
                    if (k03.equals("contextual_params")) {
                        c13 = 24;
                        break;
                    }
                    break;
                case 878213345:
                    if (k03.equals("ce_alt_image_signature")) {
                        c13 = 25;
                        break;
                    }
                    break;
                case 1046748518:
                    if (k03.equals("closeup_type")) {
                        c13 = 26;
                        break;
                    }
                    break;
                case 1080583727:
                    if (k03.equals("badge_item")) {
                        c13 = 27;
                        break;
                    }
                    break;
                case 1122958727:
                    if (k03.equals("show_price")) {
                        c13 = 28;
                        break;
                    }
                    break;
                case 1205427403:
                    if (k03.equals("destination_type")) {
                        c13 = 29;
                        break;
                    }
                    break;
                case 1701718064:
                    if (k03.equals("description_header")) {
                        c13 = 30;
                        break;
                    }
                    break;
                case 1818719821:
                    if (k03.equals("third_party_v2")) {
                        c13 = 31;
                        break;
                    }
                    break;
                case 1939875509:
                    if (k03.equals("media_type")) {
                        c13 = ' ';
                        break;
                    }
                    break;
                case 1944649980:
                    if (k03.equals("ad_format_modularization_experiment_platform")) {
                        c13 = '!';
                        break;
                    }
                    break;
                case 1976750174:
                    if (k03.equals("is_webview_ad")) {
                        c13 = '\"';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '#';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38192a;
            switch (c13) {
                case 0:
                    if (this.f38202k == null) {
                        this.f38202k = a.cb.q(oVar, gu.class);
                    }
                    jVar.d((gu) this.f38202k.c(aVar));
                    break;
                case 1:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38916w = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr = jVar.K;
                    if (zArr.length <= 22) {
                        break;
                    } else {
                        zArr[22] = true;
                        break;
                    }
                case 2:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.f38919z = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr2 = jVar.K;
                    if (zArr2.length <= 25) {
                        break;
                    } else {
                        zArr2[25] = true;
                        break;
                    }
                case 3:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.F = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr3 = jVar.K;
                    if (zArr3.length <= 31) {
                        break;
                    } else {
                        zArr3[31] = true;
                        break;
                    }
                case 4:
                    if (this.f38200i == null) {
                        this.f38200i = a.cb.q(oVar, ln.class);
                    }
                    jVar.f38917x = (ln) this.f38200i.c(aVar);
                    boolean[] zArr4 = jVar.K;
                    if (zArr4.length <= 23) {
                        break;
                    } else {
                        zArr4[23] = true;
                        break;
                    }
                case 5:
                    if (this.f38193b == null) {
                        this.f38193b = a.cb.q(oVar, k.class);
                    }
                    jVar.f38897d = (k) this.f38193b.c(aVar);
                    boolean[] zArr5 = jVar.K;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 6:
                    if (this.f38203l == null) {
                        this.f38203l = oVar.g(new TypeToken<List<bu0>>(this) { // from class: com.pinterest.api.model.AdData$AdDataTypeAdapter$3
                        }).b();
                    }
                    jVar.f38899f = (List) this.f38203l.c(aVar);
                    boolean[] zArr6 = jVar.K;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 7:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.f38911r = (String) this.f38206o.c(aVar);
                    boolean[] zArr7 = jVar.K;
                    if (zArr7.length <= 17) {
                        break;
                    } else {
                        zArr7[17] = true;
                        break;
                    }
                case '\b':
                    if (this.f38195d == null) {
                        this.f38195d = a.cb.q(oVar, g.b.class);
                    }
                    jVar.f38913t = (g.b) this.f38195d.c(aVar);
                    boolean[] zArr8 = jVar.K;
                    if (zArr8.length <= 19) {
                        break;
                    } else {
                        zArr8[19] = true;
                        break;
                    }
                case '\t':
                    if (this.f38205n == null) {
                        this.f38205n = a.cb.q(oVar, g60.class);
                    }
                    jVar.E = (g60) this.f38205n.c(aVar);
                    boolean[] zArr9 = jVar.K;
                    if (zArr9.length <= 30) {
                        break;
                    } else {
                        zArr9[30] = true;
                        break;
                    }
                case '\n':
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38898e = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr10 = jVar.K;
                    if (zArr10.length <= 4) {
                        break;
                    } else {
                        zArr10[4] = true;
                        break;
                    }
                case 11:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38907n = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr11 = jVar.K;
                    if (zArr11.length <= 13) {
                        break;
                    } else {
                        zArr11[13] = true;
                        break;
                    }
                case '\f':
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.a((Integer) this.f38201j.c(aVar));
                    break;
                case '\r':
                    if (this.f38204m == null) {
                        this.f38204m = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AdData$AdDataTypeAdapter$4
                        }).b();
                    }
                    jVar.f38908o = (Map) this.f38204m.c(aVar);
                    boolean[] zArr12 = jVar.K;
                    if (zArr12.length <= 14) {
                        break;
                    } else {
                        zArr12[14] = true;
                        break;
                    }
                case 14:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.B = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr13 = jVar.K;
                    if (zArr13.length <= 27) {
                        break;
                    } else {
                        zArr13[27] = true;
                        break;
                    }
                case 15:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.h((String) this.f38206o.c(aVar));
                    break;
                case 16:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.f38915v = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr14 = jVar.K;
                    if (zArr14.length <= 21) {
                        break;
                    } else {
                        zArr14[21] = true;
                        break;
                    }
                case 17:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.f38912s = (String) this.f38206o.c(aVar);
                    boolean[] zArr15 = jVar.K;
                    if (zArr15.length <= 18) {
                        break;
                    } else {
                        zArr15[18] = true;
                        break;
                    }
                case 18:
                    if (this.f38196e == null) {
                        this.f38196e = a.cb.q(oVar, r.class);
                    }
                    jVar.f((r) this.f38196e.c(aVar));
                    break;
                case 19:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.H = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr16 = jVar.K;
                    if (zArr16.length <= 33) {
                        break;
                    } else {
                        zArr16[33] = true;
                        break;
                    }
                case 20:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38905l = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr17 = jVar.K;
                    if (zArr17.length <= 11) {
                        break;
                    } else {
                        zArr17[11] = true;
                        break;
                    }
                case 21:
                    if (this.f38194c == null) {
                        this.f38194c = a.cb.q(oVar, g.a.class);
                    }
                    jVar.f38901h = (g.a) this.f38194c.c(aVar);
                    boolean[] zArr18 = jVar.K;
                    if (zArr18.length <= 7) {
                        break;
                    } else {
                        zArr18[7] = true;
                        break;
                    }
                case 22:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.b((String) this.f38206o.c(aVar));
                    break;
                case 23:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.f38918y = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr19 = jVar.K;
                    if (zArr19.length <= 24) {
                        break;
                    } else {
                        zArr19[24] = true;
                        break;
                    }
                case 24:
                    if (this.f38199h == null) {
                        this.f38199h = a.cb.q(oVar, pe.class);
                    }
                    jVar.f38906m = (pe) this.f38199h.c(aVar);
                    boolean[] zArr20 = jVar.K;
                    if (zArr20.length <= 12) {
                        break;
                    } else {
                        zArr20[12] = true;
                        break;
                    }
                case 25:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.f38903j = (String) this.f38206o.c(aVar);
                    boolean[] zArr21 = jVar.K;
                    if (zArr21.length <= 9) {
                        break;
                    } else {
                        zArr21[9] = true;
                        break;
                    }
                case 26:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38904k = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr22 = jVar.K;
                    if (zArr22.length <= 10) {
                        break;
                    } else {
                        zArr22[10] = true;
                        break;
                    }
                case 27:
                    if (this.f38197f == null) {
                        this.f38197f = a.cb.q(oVar, e7.class);
                    }
                    jVar.f38900g = (e7) this.f38197f.c(aVar);
                    boolean[] zArr23 = jVar.K;
                    if (zArr23.length <= 6) {
                        break;
                    } else {
                        zArr23[6] = true;
                        break;
                    }
                case 28:
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.G = (Boolean) this.f38198g.c(aVar);
                    boolean[] zArr24 = jVar.K;
                    if (zArr24.length <= 32) {
                        break;
                    } else {
                        zArr24[32] = true;
                        break;
                    }
                case 29:
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38910q = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr25 = jVar.K;
                    if (zArr25.length <= 16) {
                        break;
                    } else {
                        zArr25[16] = true;
                        break;
                    }
                case 30:
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.f38909p = (String) this.f38206o.c(aVar);
                    boolean[] zArr26 = jVar.K;
                    if (zArr26.length <= 15) {
                        break;
                    } else {
                        zArr26[15] = true;
                        break;
                    }
                case 31:
                    if (this.f38207p == null) {
                        this.f38207p = a.cb.q(oVar, fu0.class);
                    }
                    jVar.g((fu0) this.f38207p.c(aVar));
                    break;
                case ' ':
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.D = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr27 = jVar.K;
                    if (zArr27.length <= 29) {
                        break;
                    } else {
                        zArr27[29] = true;
                        break;
                    }
                case '!':
                    if (this.f38201j == null) {
                        this.f38201j = a.cb.q(oVar, Integer.class);
                    }
                    jVar.f38896c = (Integer) this.f38201j.c(aVar);
                    boolean[] zArr28 = jVar.K;
                    if (zArr28.length <= 2) {
                        break;
                    } else {
                        zArr28[2] = true;
                        break;
                    }
                case '\"':
                    if (this.f38198g == null) {
                        this.f38198g = a.cb.q(oVar, Boolean.class);
                    }
                    jVar.c((Boolean) this.f38198g.c(aVar));
                    break;
                case '#':
                    if (this.f38206o == null) {
                        this.f38206o = a.cb.q(oVar, String.class);
                    }
                    jVar.e((String) this.f38206o.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new g(jVar.f38894a, jVar.f38895b, jVar.f38896c, jVar.f38897d, jVar.f38898e, jVar.f38899f, jVar.f38900g, jVar.f38901h, jVar.f38902i, jVar.f38903j, jVar.f38904k, jVar.f38905l, jVar.f38906m, jVar.f38907n, jVar.f38908o, jVar.f38909p, jVar.f38910q, jVar.f38911r, jVar.f38912s, jVar.f38913t, jVar.f38914u, jVar.f38915v, jVar.f38916w, jVar.f38917x, jVar.f38918y, jVar.f38919z, jVar.A, jVar.B, jVar.C, jVar.D, jVar.E, jVar.F, jVar.G, jVar.H, jVar.I, jVar.f38893J, jVar.K, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        fu0 fu0Var;
        r rVar;
        Boolean bool;
        Boolean bool2;
        Integer num;
        g60 g60Var;
        Integer num2;
        gu guVar;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        ln lnVar;
        Integer num3;
        Boolean bool7;
        String str;
        g.b bVar;
        String str2;
        String str3;
        Integer num4;
        String str4;
        Map map;
        Integer num5;
        pe peVar;
        Integer num6;
        Integer num7;
        String str5;
        Integer num8;
        g.a aVar;
        e7 e7Var;
        List list;
        Integer num9;
        k kVar;
        Integer num10;
        String str6;
        String str7;
        g gVar = (g) obj;
        if (gVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gVar.K;
        int length = zArr.length;
        nm.o oVar = this.f38192a;
        if (length > 0 && zArr[0]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38206o;
            um.c h10 = cVar.h("id");
            str7 = gVar.f37861a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38206o;
            um.c h13 = cVar.h("node_id");
            str6 = gVar.f37862b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f38201j;
            um.c h14 = cVar.h("ad_format_modularization_experiment_platform");
            num10 = gVar.f37863c;
            mVar3.e(h14, num10);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38193b == null) {
                this.f38193b = a.cb.q(oVar, k.class);
            }
            nm.m mVar4 = this.f38193b;
            um.c h15 = cVar.h("adapter");
            kVar = gVar.f37864d;
            mVar4.e(h15, kVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f38201j;
            um.c h16 = cVar.h("attribution_style");
            num9 = gVar.f37865e;
            mVar5.e(h16, num9);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38203l == null) {
                this.f38203l = oVar.g(new TypeToken<List<bu0>>(this) { // from class: com.pinterest.api.model.AdData$AdDataTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f38203l;
            um.c h17 = cVar.h("badge_content_items");
            list = gVar.f37866f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38197f == null) {
                this.f38197f = a.cb.q(oVar, e7.class);
            }
            nm.m mVar7 = this.f38197f;
            um.c h18 = cVar.h("badge_item");
            e7Var = gVar.f37867g;
            mVar7.e(h18, e7Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38194c == null) {
                this.f38194c = a.cb.q(oVar, g.a.class);
            }
            nm.m mVar8 = this.f38194c;
            um.c h19 = cVar.h("campaign_objective_type");
            aVar = gVar.f37868h;
            mVar8.e(h19, aVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f38201j;
            um.c h23 = cVar.h("carousel_scroll_animation");
            num8 = gVar.f37869i;
            mVar9.e(h23, num8);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f38206o;
            um.c h24 = cVar.h("ce_alt_image_signature");
            str5 = gVar.f37870j;
            mVar10.e(h24, str5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f38201j;
            um.c h25 = cVar.h("closeup_type");
            num7 = gVar.f37871k;
            mVar11.e(h25, num7);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f38201j;
            um.c h26 = cVar.h("collection_grid_click_type");
            num6 = gVar.f37872l;
            mVar12.e(h26, num6);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38199h == null) {
                this.f38199h = a.cb.q(oVar, pe.class);
            }
            nm.m mVar13 = this.f38199h;
            um.c h27 = cVar.h("contextual_params");
            peVar = gVar.f37873m;
            mVar13.e(h27, peVar);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar14 = this.f38201j;
            um.c h28 = cVar.h("creative_type");
            num5 = gVar.f37874n;
            mVar14.e(h28, num5);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f38204m == null) {
                this.f38204m = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AdData$AdDataTypeAdapter$2
                }).b();
            }
            nm.m mVar15 = this.f38204m;
            um.c h29 = cVar.h("custom_grid_configuration");
            map = gVar.f37875o;
            mVar15.e(h29, map);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f38206o;
            um.c h33 = cVar.h("description_header");
            str4 = gVar.f37876p;
            mVar16.e(h33, str4);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar17 = this.f38201j;
            um.c h34 = cVar.h("destination_type");
            num4 = gVar.f37877q;
            mVar17.e(h34, num4);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f38206o;
            um.c h35 = cVar.h("disclosure_label");
            str3 = gVar.f37878r;
            mVar18.e(h35, str3);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f38206o;
            um.c h36 = cVar.h("disclosure_url");
            str2 = gVar.f37879s;
            mVar19.e(h36, str2);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f38195d == null) {
                this.f38195d = a.cb.q(oVar, g.b.class);
            }
            nm.m mVar20 = this.f38195d;
            um.c h37 = cVar.h("dl_ad_closeup_ingress_variant");
            bVar = gVar.f37880t;
            mVar20.e(h37, bVar);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f38206o == null) {
                this.f38206o = a.cb.q(oVar, String.class);
            }
            nm.m mVar21 = this.f38206o;
            um.c h38 = cVar.h("dpa_variant_id");
            str = gVar.f37881u;
            mVar21.e(h38, str);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar22 = this.f38198g;
            um.c h39 = cVar.h("exclude_from_grid_rep_tests");
            bool7 = gVar.f37882v;
            mVar22.e(h39, bool7);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar23 = this.f38201j;
            um.c h43 = cVar.h("grid_click_type");
            num3 = gVar.f37883w;
            mVar23.e(h43, num3);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f38200i == null) {
                this.f38200i = a.cb.q(oVar, ln.class);
            }
            nm.m mVar24 = this.f38200i;
            um.c h44 = cVar.h("grid_cta_data");
            lnVar = gVar.f37884x;
            mVar24.e(h44, lnVar);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar25 = this.f38198g;
            um.c h45 = cVar.h("is_collage_single_destination");
            bool6 = gVar.f37885y;
            mVar25.e(h45, bool6);
        }
        if (zArr.length > 25 && zArr[25]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar26 = this.f38198g;
            um.c h46 = cVar.h("is_native_browser_eligible");
            bool5 = gVar.f37886z;
            mVar26.e(h46, bool5);
        }
        if (zArr.length > 26 && zArr[26]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar27 = this.f38198g;
            um.c h47 = cVar.h("is_webview_ad");
            bool4 = gVar.A;
            mVar27.e(h47, bool4);
        }
        if (zArr.length > 27 && zArr[27]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar28 = this.f38198g;
            um.c h48 = cVar.h("is_weight_loss_ad");
            bool3 = gVar.B;
            mVar28.e(h48, bool3);
        }
        if (zArr.length > 28 && zArr[28]) {
            if (this.f38202k == null) {
                this.f38202k = a.cb.q(oVar, gu.class);
            }
            nm.m mVar29 = this.f38202k;
            um.c h49 = cVar.h("link_info");
            guVar = gVar.C;
            mVar29.e(h49, guVar);
        }
        if (zArr.length > 29 && zArr[29]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar30 = this.f38201j;
            um.c h53 = cVar.h("media_type");
            num2 = gVar.D;
            mVar30.e(h53, num2);
        }
        if (zArr.length > 30 && zArr[30]) {
            if (this.f38205n == null) {
                this.f38205n = a.cb.q(oVar, g60.class);
            }
            nm.m mVar31 = this.f38205n;
            um.c h54 = cVar.h("pinner_geolocation");
            g60Var = gVar.E;
            mVar31.e(h54, g60Var);
        }
        if (zArr.length > 31 && zArr[31]) {
            if (this.f38201j == null) {
                this.f38201j = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar32 = this.f38201j;
            um.c h55 = cVar.h("shopping_integration_type");
            num = gVar.F;
            mVar32.e(h55, num);
        }
        if (zArr.length > 32 && zArr[32]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar33 = this.f38198g;
            um.c h56 = cVar.h("show_price");
            bool2 = gVar.G;
            mVar33.e(h56, bool2);
        }
        if (zArr.length > 33 && zArr[33]) {
            if (this.f38198g == null) {
                this.f38198g = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar34 = this.f38198g;
            um.c h57 = cVar.h("show_rating");
            bool = gVar.H;
            mVar34.e(h57, bool);
        }
        if (zArr.length > 34 && zArr[34]) {
            if (this.f38196e == null) {
                this.f38196e = a.cb.q(oVar, r.class);
            }
            nm.m mVar35 = this.f38196e;
            um.c h58 = cVar.h("third_party");
            rVar = gVar.I;
            mVar35.e(h58, rVar);
        }
        if (zArr.length > 35 && zArr[35]) {
            if (this.f38207p == null) {
                this.f38207p = a.cb.q(oVar, fu0.class);
            }
            nm.m mVar36 = this.f38207p;
            um.c h59 = cVar.h("third_party_v2");
            fu0Var = gVar.f37860J;
            mVar36.e(h59, fu0Var);
        }
        cVar.g();
    }
}
