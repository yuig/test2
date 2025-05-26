package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class xs extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43776a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43777b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43778c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43779d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43780e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43781f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43782g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43783h;

    public xs(nm.o oVar) {
        this.f43776a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ws wsVar = new ws(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2107390546:
                    if (k03.equals("follower_count")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1089162399:
                    if (k03.equals("recommendation_source")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -970359973:
                    if (k03.equals("url_name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -433228923:
                    if (k03.equals("is_followed")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 954203207:
                    if (k03.equals("tv_interest")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1121694334:
                    if (k03.equals("best_pins_images")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1411166050:
                    if (k03.equals("feed_update_time")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1537780732:
                    if (k03.equals("category_id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 14;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43776a;
            switch (c13) {
                case 0:
                    if (this.f43779d == null) {
                        this.f43779d = a.cb.q(oVar, Integer.class);
                    }
                    wsVar.f43359g = (Integer) this.f43779d.c(aVar);
                    boolean[] zArr = wsVar.f43368p;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f43781f == null) {
                        this.f43781f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Interest$InterestTypeAdapter$4
                        }).b();
                    }
                    wsVar.f43361i = (Map) this.f43781f.c(aVar);
                    boolean[] zArr2 = wsVar.f43368p;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 2:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.h((String) this.f43782g.c(aVar));
                    break;
                case 3:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.j((String) this.f43782g.c(aVar));
                    break;
                case 4:
                    if (this.f43777b == null) {
                        this.f43777b = a.cb.q(oVar, Boolean.class);
                    }
                    wsVar.f43362j = (Boolean) this.f43777b.c(aVar);
                    boolean[] zArr3 = wsVar.f43368p;
                    if (zArr3.length <= 9) {
                        break;
                    } else {
                        zArr3[9] = true;
                        break;
                    }
                case 5:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.f43353a = (String) this.f43782g.c(aVar);
                    boolean[] zArr4 = wsVar.f43368p;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 6:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.g((String) this.f43782g.c(aVar));
                    break;
                case 7:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.f43364l = (String) this.f43782g.c(aVar);
                    boolean[] zArr5 = wsVar.f43368p;
                    if (zArr5.length <= 11) {
                        break;
                    } else {
                        zArr5[11] = true;
                        break;
                    }
                case '\b':
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.f((String) this.f43782g.c(aVar));
                    break;
                case '\t':
                    if (this.f43783h == null) {
                        this.f43783h = a.cb.q(oVar, fx0.class);
                    }
                    wsVar.i((fx0) this.f43783h.c(aVar));
                    break;
                case '\n':
                    if (this.f43780e == null) {
                        this.f43780e = oVar.g(new TypeToken<List<sr>>(this) { // from class: com.pinterest.api.model.Interest$InterestTypeAdapter$3
                        }).b();
                    }
                    wsVar.c((List) this.f43780e.c(aVar));
                    break;
                case 11:
                    if (this.f43778c == null) {
                        this.f43778c = a.cb.q(oVar, Date.class);
                    }
                    wsVar.e((Date) this.f43778c.c(aVar));
                    break;
                case '\f':
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.d((String) this.f43782g.c(aVar));
                    break;
                case '\r':
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.b((String) this.f43782g.c(aVar));
                    break;
                case 14:
                    if (this.f43782g == null) {
                        this.f43782g = a.cb.q(oVar, String.class);
                    }
                    wsVar.f43354b = (String) this.f43782g.c(aVar);
                    boolean[] zArr6 = wsVar.f43368p;
                    if (zArr6.length <= 1) {
                        break;
                    } else {
                        zArr6[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return wsVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        fx0 fx0Var;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        Map map;
        String str5;
        Integer num;
        Date date;
        String str6;
        List list;
        String str7;
        String str8;
        String str9;
        zs zsVar = (zs) obj;
        if (zsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zsVar.f44444p;
        int length = zArr.length;
        nm.o oVar = this.f43776a;
        if (length > 0 && zArr[0]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43782g;
            um.c h10 = cVar.h("id");
            str9 = zsVar.f44429a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43782g;
            um.c h13 = cVar.h("node_id");
            str8 = zsVar.f44430b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43782g;
            um.c h14 = cVar.h("background_color");
            str7 = zsVar.f44431c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43780e == null) {
                this.f43780e = oVar.g(new TypeToken<List<sr>>(this) { // from class: com.pinterest.api.model.Interest$InterestTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f43780e;
            um.c h15 = cVar.h("best_pins_images");
            list = zsVar.f44432d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43782g;
            um.c h16 = cVar.h("category_id");
            str6 = zsVar.f44433e;
            mVar5.e(h16, str6);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43778c == null) {
                this.f43778c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar6 = this.f43778c;
            um.c h17 = cVar.h("feed_update_time");
            date = zsVar.f44434f;
            mVar6.e(h17, date);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43779d == null) {
                this.f43779d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f43779d;
            um.c h18 = cVar.h("follower_count");
            num = zsVar.f44435g;
            mVar7.e(h18, num);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f43782g;
            um.c h19 = cVar.h("image_signature");
            str5 = zsVar.f44436h;
            mVar8.e(h19, str5);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43781f == null) {
                this.f43781f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Interest$InterestTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f43781f;
            um.c h23 = cVar.h("images");
            map = zsVar.f44437i;
            mVar9.e(h23, map);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43777b == null) {
                this.f43777b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f43777b;
            um.c h24 = cVar.h("is_followed");
            bool = zsVar.f44438j;
            mVar10.e(h24, bool);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f43782g;
            um.c h25 = cVar.h("key");
            str4 = zsVar.f44439k;
            mVar11.e(h25, str4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f43782g;
            um.c h26 = cVar.h("name");
            str3 = zsVar.f44440l;
            mVar12.e(h26, str3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f43782g;
            um.c h27 = cVar.h("recommendation_source");
            str2 = zsVar.f44441m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f43783h == null) {
                this.f43783h = a.cb.q(oVar, fx0.class);
            }
            nm.m mVar14 = this.f43783h;
            um.c h28 = cVar.h("tv_interest");
            fx0Var = zsVar.f44442n;
            mVar14.e(h28, fx0Var);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f43782g == null) {
                this.f43782g = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f43782g;
            um.c h29 = cVar.h("url_name");
            str = zsVar.f44443o;
            mVar15.e(h29, str);
        }
        cVar.g();
    }
}
