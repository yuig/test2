package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.kg0;
import java.util.Date;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lg0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39748a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39749b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39750c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39751d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39752e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f39753f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f39754g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f39755h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f39756i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f39757j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f39758k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f39759l;

    public lg0(nm.o oVar) {
        this.f39748a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        jg0 jg0Var = new jg0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1178105356:
                    if (k03.equals("video_signature")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -892481550:
                    if (k03.equals("status")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 112202875:
                    if (k03.equals("video")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 596896652:
                    if (k03.equals("scheduled_type")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 701562983:
                    if (k03.equals("metadata_attributes")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1162630993:
                    if (k03.equals("scheduled_ts")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1970241253:
                    if (k03.equals("section")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 2105073296:
                    if (k03.equals("model_type")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 18;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39748a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39044e = (String) this.f39757j.c(aVar);
                    boolean[] zArr = jg0Var.f39059t;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39058s = (String) this.f39757j.c(aVar);
                    boolean[] zArr2 = jg0Var.f39059t;
                    if (zArr2.length > 18) {
                        zArr2[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f39756i == null) {
                        this.f39756i = a.cb.q(oVar, kg0.b.class);
                    }
                    jg0Var.f39053n = (kg0.b) this.f39756i.c(aVar);
                    boolean[] zArr3 = jg0Var.f39059t;
                    if (zArr3.length > 13) {
                        zArr3[13] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39040a = (String) this.f39757j.c(aVar);
                    boolean[] zArr4 = jg0Var.f39059t;
                    if (zArr4.length > 0) {
                        z13 = false;
                        zArr4[0] = true;
                        break;
                    }
                    break;
                case 4:
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39047h = (String) this.f39757j.c(aVar);
                    boolean[] zArr5 = jg0Var.f39059t;
                    if (zArr5.length > 7) {
                        zArr5[7] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39055p = (String) this.f39757j.c(aVar);
                    boolean[] zArr6 = jg0Var.f39059t;
                    if (zArr6.length > 15) {
                        zArr6[15] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f39758k == null) {
                        this.f39758k = a.cb.q(oVar, wy0.class);
                    }
                    jg0Var.f39056q = (wy0) this.f39758k.c(aVar);
                    boolean[] zArr7 = jg0Var.f39059t;
                    if (zArr7.length > 16) {
                        zArr7[16] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f39749b == null) {
                        this.f39749b = a.cb.q(oVar, v7.class);
                    }
                    jg0Var.f39042c = (v7) this.f39749b.c(aVar);
                    boolean[] zArr8 = jg0Var.f39059t;
                    if (zArr8.length > 2) {
                        zArr8[2] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f39753f == null) {
                        this.f39753f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ScheduledPin$ScheduledPinTypeAdapter$2
                        }).b();
                    }
                    jg0Var.f39045f = (Map) this.f39753f.c(aVar);
                    boolean[] zArr9 = jg0Var.f39059t;
                    if (zArr9.length > 5) {
                        zArr9[5] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39054o = (String) this.f39757j.c(aVar);
                    boolean[] zArr10 = jg0Var.f39059t;
                    if (zArr10.length > 14) {
                        zArr10[14] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f39759l == null) {
                        this.f39759l = a.cb.q(oVar, b01.class);
                    }
                    jg0Var.f39057r = (b01) this.f39759l.c(aVar);
                    boolean[] zArr11 = jg0Var.f39059t;
                    if (zArr11.length > 17) {
                        zArr11[17] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f39752e == null) {
                        this.f39752e = a.cb.q(oVar, Integer.class);
                    }
                    jg0Var.f39051l = (Integer) this.f39752e.c(aVar);
                    boolean[] zArr12 = jg0Var.f39059t;
                    if (zArr12.length > 11) {
                        zArr12[11] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39046g = (String) this.f39757j.c(aVar);
                    boolean[] zArr13 = jg0Var.f39059t;
                    if (zArr13.length > 6) {
                        zArr13[6] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f39754g == null) {
                        this.f39754g = a.cb.q(oVar, rg0.class);
                    }
                    jg0Var.f39048i = (rg0) this.f39754g.c(aVar);
                    boolean[] zArr14 = jg0Var.f39059t;
                    if (zArr14.length > 8) {
                        zArr14[8] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f39752e == null) {
                        this.f39752e = a.cb.q(oVar, Integer.class);
                    }
                    jg0Var.f39050k = (Integer) this.f39752e.c(aVar);
                    boolean[] zArr15 = jg0Var.f39059t;
                    if (zArr15.length > 10) {
                        zArr15[10] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f39751d == null) {
                        this.f39751d = a.cb.q(oVar, Date.class);
                    }
                    jg0Var.f39043d = (Date) this.f39751d.c(aVar);
                    boolean[] zArr16 = jg0Var.f39059t;
                    if (zArr16.length > 3) {
                        zArr16[3] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f39750c == null) {
                        this.f39750c = a.cb.q(oVar, ba.class);
                    }
                    jg0Var.f39052m = (ba) this.f39750c.c(aVar);
                    boolean[] zArr17 = jg0Var.f39059t;
                    if (zArr17.length > 12) {
                        zArr17[12] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f39755h == null) {
                        this.f39755h = a.cb.q(oVar, kg0.a.class);
                    }
                    jg0Var.f39049j = (kg0.a) this.f39755h.c(aVar);
                    boolean[] zArr18 = jg0Var.f39059t;
                    if (zArr18.length > 9) {
                        zArr18[9] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f39757j == null) {
                        this.f39757j = a.cb.q(oVar, String.class);
                    }
                    jg0Var.f39041b = (String) this.f39757j.c(aVar);
                    boolean[] zArr19 = jg0Var.f39059t;
                    if (zArr19.length > 1) {
                        zArr19[1] = true;
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
        return jg0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        b01 b01Var;
        wy0 wy0Var;
        String str2;
        String str3;
        kg0.b bVar;
        ba baVar;
        Integer num;
        Integer num2;
        kg0.a aVar;
        rg0 rg0Var;
        String str4;
        String str5;
        Map map;
        String str6;
        Date date;
        v7 v7Var;
        String str7;
        String str8;
        kg0 kg0Var = (kg0) obj;
        if (kg0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kg0Var.f39446t;
        int length = zArr.length;
        nm.o oVar = this.f39748a;
        if (length > 0 && zArr[0]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39757j;
            um.c h10 = cVar.h("id");
            str8 = kg0Var.f39427a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39757j;
            um.c h13 = cVar.h("node_id");
            str7 = kg0Var.f39428b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39749b == null) {
                this.f39749b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f39749b;
            um.c h14 = cVar.h("board");
            v7Var = kg0Var.f39429c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39751d == null) {
                this.f39751d = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f39751d;
            um.c h15 = cVar.h("created_at");
            date = kg0Var.f39430d;
            mVar4.e(h15, date);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39757j;
            um.c h16 = cVar.h("description");
            str6 = kg0Var.f39431e;
            mVar5.e(h16, str6);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39753f == null) {
                this.f39753f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ScheduledPin$ScheduledPinTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f39753f;
            um.c h17 = cVar.h("image");
            map = kg0Var.f39432f;
            mVar6.e(h17, map);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39757j;
            um.c h18 = cVar.h("image_signature");
            str5 = kg0Var.f39433g;
            mVar7.e(h18, str5);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f39757j;
            um.c h19 = cVar.h("link");
            str4 = kg0Var.f39434h;
            mVar8.e(h19, str4);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f39754g == null) {
                this.f39754g = a.cb.q(oVar, rg0.class);
            }
            nm.m mVar9 = this.f39754g;
            um.c h23 = cVar.h("metadata_attributes");
            rg0Var = kg0Var.f39435i;
            mVar9.e(h23, rg0Var);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f39755h == null) {
                this.f39755h = a.cb.q(oVar, kg0.a.class);
            }
            nm.m mVar10 = this.f39755h;
            um.c h24 = cVar.h("model_type");
            aVar = kg0Var.f39436j;
            mVar10.e(h24, aVar);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f39752e == null) {
                this.f39752e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f39752e;
            um.c h25 = cVar.h("scheduled_ts");
            num2 = kg0Var.f39437k;
            mVar11.e(h25, num2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f39752e == null) {
                this.f39752e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f39752e;
            um.c h26 = cVar.h("scheduled_type");
            num = kg0Var.f39438l;
            mVar12.e(h26, num);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f39750c == null) {
                this.f39750c = a.cb.q(oVar, ba.class);
            }
            nm.m mVar13 = this.f39750c;
            um.c h27 = cVar.h("section");
            baVar = kg0Var.f39439m;
            mVar13.e(h27, baVar);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f39756i == null) {
                this.f39756i = a.cb.q(oVar, kg0.b.class);
            }
            nm.m mVar14 = this.f39756i;
            um.c h28 = cVar.h("status");
            bVar = kg0Var.f39440n;
            mVar14.e(h28, bVar);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f39757j;
            um.c h29 = cVar.h("title");
            str3 = kg0Var.f39441o;
            mVar15.e(h29, str3);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f39757j;
            um.c h33 = cVar.h("type");
            str2 = kg0Var.f39442p;
            mVar16.e(h33, str2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f39758k == null) {
                this.f39758k = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar17 = this.f39758k;
            um.c h34 = cVar.h("user");
            wy0Var = kg0Var.f39443q;
            mVar17.e(h34, wy0Var);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f39759l == null) {
                this.f39759l = a.cb.q(oVar, b01.class);
            }
            nm.m mVar18 = this.f39759l;
            um.c h35 = cVar.h("video");
            b01Var = kg0Var.f39444r;
            mVar18.e(h35, b01Var);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f39757j == null) {
                this.f39757j = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f39757j;
            um.c h36 = cVar.h("video_signature");
            str = kg0Var.f39445s;
            mVar19.e(h36, str);
        }
        cVar.g();
    }
}
