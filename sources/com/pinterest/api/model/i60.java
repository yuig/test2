package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i60 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38678a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38679b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38680c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38681d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38682e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38683f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38684g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38685h;

    public i60(nm.o oVar) {
        this.f38678a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        h60 h60Var = new h60(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2053263135:
                    if (k03.equals("postal_code")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1698410561:
                    if (k03.equals("source_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1439978388:
                    if (k03.equals("latitude")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1418847835:
                    if (k03.equals("simple_tips")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1111107765:
                    if (k03.equals("source_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -934795532:
                    if (k03.equals("region")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -891990013:
                    if (k03.equals("street")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -84974051:
                    if (k03.equals("source_icon")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -84827089:
                    if (k03.equals("source_name")) {
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
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 50511102:
                    if (k03.equals("category")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 99469071:
                    if (k03.equals("hours")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 106642798:
                    if (k03.equals("phone")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 137365935:
                    if (k03.equals("longitude")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 338577355:
                    if (k03.equals("category_join")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 957831062:
                    if (k03.equals(AdRevenueScheme.COUNTRY)) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 1419904786:
                    if (k03.equals("extra_street")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 1900805475:
                    if (k03.equals("locality")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 22;
                        break;
                    }
                    break;
            }
            boolean[] zArr = h60Var.f38319x;
            nm.o oVar = this.f38678a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38310o = (String) this.f38685h.c(aVar);
                    boolean[] zArr2 = h60Var.f38319x;
                    if (zArr2.length <= 14) {
                        break;
                    } else {
                        zArr2[14] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38314s = (String) this.f38685h.c(aVar);
                    if (zArr.length > 18) {
                        zArr[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f38679b == null) {
                        this.f38679b = a.cb.q(oVar, Double.class);
                    }
                    h60Var.f38305j = (Double) this.f38679b.c(aVar);
                    boolean[] zArr3 = h60Var.f38319x;
                    if (zArr3.length > 9) {
                        zArr3[9] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f38682e == null) {
                        this.f38682e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$6
                        }).b();
                    }
                    h60Var.f38312q = (List) this.f38682e.c(aVar);
                    if (zArr.length > 16) {
                        zArr[16] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f38681d == null) {
                        this.f38681d = oVar.g(new TypeToken<List<s60>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$5
                        }).b();
                    }
                    h60Var.f38304i = (List) this.f38681d.c(aVar);
                    if (zArr.length > 8) {
                        zArr[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38316u = (String) this.f38685h.c(aVar);
                    if (zArr.length > 20) {
                        zArr[20] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38311p = (String) this.f38685h.c(aVar);
                    boolean[] zArr4 = h60Var.f38319x;
                    if (zArr4.length > 15) {
                        zArr4[15] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38317v = (String) this.f38685h.c(aVar);
                    boolean[] zArr5 = h60Var.f38319x;
                    if (zArr5.length > 21) {
                        zArr5[21] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38313r = (String) this.f38685h.c(aVar);
                    if (zArr.length > 17) {
                        zArr[17] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\t':
                    z13 = false;
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38315t = (String) this.f38685h.c(aVar);
                    if (zArr.length > 19) {
                        zArr[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\n':
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38296a = (String) this.f38685h.c(aVar);
                    boolean[] zArr6 = h60Var.f38319x;
                    if (zArr6.length > 0) {
                        z13 = false;
                        zArr6[0] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38318w = (String) this.f38685h.c(aVar);
                    if (zArr.length > 22) {
                        zArr[22] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38308m = (String) this.f38685h.c(aVar);
                    if (zArr.length > 12) {
                        zArr[12] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38298c = (String) this.f38685h.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f38680c == null) {
                        this.f38680c = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$4
                        }).b();
                    }
                    h60Var.f38302g = (List) this.f38680c.c(aVar);
                    if (zArr.length > 6) {
                        zArr[6] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f38684g == null) {
                        this.f38684g = a.cb.q(oVar, s60.class);
                    }
                    h60Var.f38303h = (s60) this.f38684g.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38309n = (String) this.f38685h.c(aVar);
                    if (zArr.length > 13) {
                        zArr[13] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f38679b == null) {
                        this.f38679b = a.cb.q(oVar, Double.class);
                    }
                    h60Var.f38307l = (Double) this.f38679b.c(aVar);
                    boolean[] zArr7 = h60Var.f38319x;
                    if (zArr7.length > 11) {
                        zArr7[11] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f38683f == null) {
                        this.f38683f = a.cb.q(oVar, o60.class);
                    }
                    h60Var.f38299d = (o60) this.f38683f.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38300e = (String) this.f38685h.c(aVar);
                    boolean[] zArr8 = h60Var.f38319x;
                    if (zArr8.length > 4) {
                        zArr8[4] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38301f = (String) this.f38685h.c(aVar);
                    boolean[] zArr9 = h60Var.f38319x;
                    if (zArr9.length > 5) {
                        zArr9[5] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38306k = (String) this.f38685h.c(aVar);
                    boolean[] zArr10 = h60Var.f38319x;
                    if (zArr10.length > 10) {
                        zArr10[10] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f38685h == null) {
                        this.f38685h = a.cb.q(oVar, String.class);
                    }
                    h60Var.f38297b = (String) this.f38685h.c(aVar);
                    boolean[] zArr11 = h60Var.f38319x;
                    if (zArr11.length > 1) {
                        zArr11[1] = true;
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
        return h60Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List list;
        String str7;
        String str8;
        String str9;
        String str10;
        Double d2;
        String str11;
        Double d13;
        List list2;
        s60 s60Var;
        List list3;
        String str12;
        String str13;
        o60 o60Var;
        String str14;
        String str15;
        String str16;
        k60 k60Var = (k60) obj;
        if (k60Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = k60Var.f39325x;
        int length = zArr.length;
        nm.o oVar = this.f38678a;
        if (length > 0 && zArr[0]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38685h;
            um.c h10 = cVar.h("id");
            str16 = k60Var.f39302a;
            mVar.e(h10, str16);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38685h;
            um.c h13 = cVar.h("node_id");
            str15 = k60Var.f39303b;
            mVar2.e(h13, str15);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38685h;
            um.c h14 = cVar.h("category");
            str14 = k60Var.f39304c;
            mVar3.e(h14, str14);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38683f == null) {
                this.f38683f = a.cb.q(oVar, o60.class);
            }
            nm.m mVar4 = this.f38683f;
            um.c h15 = cVar.h("category_join");
            o60Var = k60Var.f39305d;
            mVar4.e(h15, o60Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38685h;
            um.c h16 = cVar.h(AdRevenueScheme.COUNTRY);
            str13 = k60Var.f39306e;
            mVar5.e(h16, str13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38685h;
            um.c h17 = cVar.h("extra_street");
            str12 = k60Var.f39307f;
            mVar6.e(h17, str12);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38680c == null) {
                this.f38680c = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f38680c;
            um.c h18 = cVar.h("hours");
            list3 = k60Var.f39308g;
            mVar7.e(h18, list3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38684g == null) {
                this.f38684g = a.cb.q(oVar, s60.class);
            }
            nm.m mVar8 = this.f38684g;
            um.c h19 = cVar.h("image");
            s60Var = k60Var.f39309h;
            mVar8.e(h19, s60Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38681d == null) {
                this.f38681d = oVar.g(new TypeToken<List<s60>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f38681d;
            um.c h23 = cVar.h("images");
            list2 = k60Var.f39310i;
            mVar9.e(h23, list2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38679b == null) {
                this.f38679b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f38679b;
            um.c h24 = cVar.h("latitude");
            d13 = k60Var.f39311j;
            mVar10.e(h24, d13);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f38685h;
            um.c h25 = cVar.h("locality");
            str11 = k60Var.f39312k;
            mVar11.e(h25, str11);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38679b == null) {
                this.f38679b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar12 = this.f38679b;
            um.c h26 = cVar.h("longitude");
            d2 = k60Var.f39313l;
            mVar12.e(h26, d2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f38685h;
            um.c h27 = cVar.h("name");
            str10 = k60Var.f39314m;
            mVar13.e(h27, str10);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f38685h;
            um.c h28 = cVar.h("phone");
            str9 = k60Var.f39315n;
            mVar14.e(h28, str9);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f38685h;
            um.c h29 = cVar.h("postal_code");
            str8 = k60Var.f39316o;
            mVar15.e(h29, str8);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f38685h;
            um.c h33 = cVar.h("region");
            str7 = k60Var.f39317p;
            mVar16.e(h33, str7);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f38682e == null) {
                this.f38682e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Place$PlaceTypeAdapter$3
                }).b();
            }
            nm.m mVar17 = this.f38682e;
            um.c h34 = cVar.h("simple_tips");
            list = k60Var.f39318q;
            mVar17.e(h34, list);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f38685h;
            um.c h35 = cVar.h("source_icon");
            str6 = k60Var.f39319r;
            mVar18.e(h35, str6);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f38685h;
            um.c h36 = cVar.h("source_id");
            str5 = k60Var.f39320s;
            mVar19.e(h36, str5);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar20 = this.f38685h;
            um.c h37 = cVar.h("source_name");
            str4 = k60Var.f39321t;
            mVar20.e(h37, str4);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar21 = this.f38685h;
            um.c h38 = cVar.h("source_url");
            str3 = k60Var.f39322u;
            mVar21.e(h38, str3);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar22 = this.f38685h;
            um.c h39 = cVar.h("street");
            str2 = k60Var.f39323v;
            mVar22.e(h39, str2);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f38685h == null) {
                this.f38685h = a.cb.q(oVar, String.class);
            }
            nm.m mVar23 = this.f38685h;
            um.c h43 = cVar.h("url");
            str = k60Var.f39324w;
            mVar23.e(h43, str);
        }
        cVar.g();
    }
}
