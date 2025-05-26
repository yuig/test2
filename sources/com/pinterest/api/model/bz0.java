package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.az0;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36230a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36231b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36232c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36233d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36234e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36235f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f36236g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f36237h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f36238i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f36239j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f36240k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f36241l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f36242m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f36243n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f36244o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f36245p;

    public bz0(nm.o oVar) {
        this.f36230a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zy0 zy0Var = new zy0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1881328305:
                    if (k03.equals("recommend_score")) {
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
                case -1127621238:
                    if (k03.equals("recommendation_reason")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1120985297:
                    if (k03.equals("comment_count")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1037575189:
                    if (k03.equals("text_tags")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -816678056:
                    if (k03.equals("videos")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -604765110:
                    if (k03.equals("marked_helpful_by_me")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -314498168:
                    if (k03.equals("privacy")) {
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 113125751:
                    if (k03.equals("paragraph_blocks")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 467184874:
                    if (k03.equals("reaction_by_me")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 620771756:
                    if (k03.equals("helpful_count")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 951621133:
                    if (k03.equals("highlighted_by_pin_owner")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1351744014:
                    if (k03.equals("did_it_type")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1554732063:
                    if (k03.equals("image_signatures")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 1557721666:
                    if (k03.equals("details")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 1617880090:
                    if (k03.equals("reaction_counts")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 1714924804:
                    if (k03.equals("dominant_color")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 1838581264:
                    if (k03.equals("done_at")) {
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
            nm.o oVar = this.f36230a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f36233d == null) {
                        this.f36233d = a.cb.q(oVar, Double.class);
                    }
                    zy0Var.f44526r = (Double) this.f36233d.c(aVar);
                    boolean[] zArr = zy0Var.f44532x;
                    if (zArr.length <= 17) {
                        break;
                    } else {
                        zArr[17] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f36235f == null) {
                        this.f36235f = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$9
                        }).b();
                    }
                    zy0Var.f44519k = (List) this.f36235f.c(aVar);
                    boolean[] zArr2 = zy0Var.f44532x;
                    if (zArr2.length > 10) {
                        zArr2[10] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f36240k == null) {
                        this.f36240k = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$12
                        }).b();
                    }
                    zy0Var.f44527s = (Map) this.f36240k.c(aVar);
                    boolean[] zArr3 = zy0Var.f44532x;
                    if (zArr3.length > 18) {
                        zArr3[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f36234e == null) {
                        this.f36234e = a.cb.q(oVar, Integer.class);
                    }
                    zy0Var.b((Integer) this.f36234e.c(aVar));
                    continue;
                case 4:
                    z13 = false;
                    if (this.f36238i == null) {
                        this.f36238i = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$13
                        }).b();
                    }
                    zy0Var.f44528t = (List) this.f36238i.c(aVar);
                    boolean[] zArr4 = zy0Var.f44532x;
                    if (zArr4.length > 19) {
                        zArr4[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f36239j == null) {
                        this.f36239j = oVar.g(new TypeToken<List<b01>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$14
                        }).b();
                    }
                    zy0Var.f44531w = (List) this.f36239j.c(aVar);
                    boolean[] zArr5 = zy0Var.f44532x;
                    if (zArr5.length > 22) {
                        zArr5[22] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f36231b == null) {
                        this.f36231b = a.cb.q(oVar, Boolean.class);
                    }
                    zy0Var.f44520l = (Boolean) this.f36231b.c(aVar);
                    boolean[] zArr6 = zy0Var.f44532x;
                    if (zArr6.length > 11) {
                        zArr6[11] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f36245p == null) {
                        this.f36245p = a.cb.q(oVar, az0.b.class);
                    }
                    zy0Var.f44523o = (az0.b) this.f36245p.c(aVar);
                    boolean[] zArr7 = zy0Var.f44532x;
                    if (zArr7.length > 14) {
                        zArr7[14] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    if (this.f36242m == null) {
                        this.f36242m = a.cb.q(oVar, String.class);
                    }
                    zy0Var.f44509a = (String) this.f36242m.c(aVar);
                    boolean[] zArr8 = zy0Var.f44532x;
                    if (zArr8.length > 0) {
                        z13 = false;
                        zArr8[0] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f36241l == null) {
                        this.f36241l = a.cb.q(oVar, f30.class);
                    }
                    zy0Var.f44522n = (f30) this.f36241l.c(aVar);
                    boolean[] zArr9 = zy0Var.f44532x;
                    if (zArr9.length > 13) {
                        zArr9[13] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f36242m == null) {
                        this.f36242m = a.cb.q(oVar, String.class);
                    }
                    zy0Var.f44529u = (String) this.f36242m.c(aVar);
                    boolean[] zArr10 = zy0Var.f44532x;
                    if (zArr10.length > 20) {
                        zArr10[20] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f36243n == null) {
                        this.f36243n = a.cb.q(oVar, wy0.class);
                    }
                    zy0Var.f44530v = (wy0) this.f36243n.c(aVar);
                    boolean[] zArr11 = zy0Var.f44532x;
                    if (zArr11.length > 21) {
                        zArr11[21] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f36236g == null) {
                        this.f36236g = oVar.g(new TypeToken<List<kp0>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$10
                        }).b();
                    }
                    zy0Var.f44521m = (List) this.f36236g.c(aVar);
                    boolean[] zArr12 = zy0Var.f44532x;
                    if (zArr12.length > 12) {
                        zArr12[12] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f36234e == null) {
                        this.f36234e = a.cb.q(oVar, Integer.class);
                    }
                    zy0Var.f44524p = (Integer) this.f36234e.c(aVar);
                    boolean[] zArr13 = zy0Var.f44532x;
                    if (zArr13.length > 15) {
                        zArr13[15] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f36234e == null) {
                        this.f36234e = a.cb.q(oVar, Integer.class);
                    }
                    zy0Var.f44516h = (Integer) this.f36234e.c(aVar);
                    boolean[] zArr14 = zy0Var.f44532x;
                    if (zArr14.length > 7) {
                        zArr14[7] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f36231b == null) {
                        this.f36231b = a.cb.q(oVar, Boolean.class);
                    }
                    zy0Var.f44517i = (Boolean) this.f36231b.c(aVar);
                    boolean[] zArr15 = zy0Var.f44532x;
                    if (zArr15.length > 8) {
                        zArr15[8] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f36244o == null) {
                        this.f36244o = a.cb.q(oVar, az0.a.class);
                    }
                    zy0Var.f44513e = (az0.a) this.f36244o.c(aVar);
                    boolean[] zArr16 = zy0Var.f44532x;
                    if (zArr16.length > 4) {
                        zArr16[4] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f36237h == null) {
                        this.f36237h = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$8
                        }).b();
                    }
                    zy0Var.f44518j = (List) this.f36237h.c(aVar);
                    boolean[] zArr17 = zy0Var.f44532x;
                    if (zArr17.length > 9) {
                        zArr17[9] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f36242m == null) {
                        this.f36242m = a.cb.q(oVar, String.class);
                    }
                    zy0Var.f44512d = (String) this.f36242m.c(aVar);
                    boolean[] zArr18 = zy0Var.f44532x;
                    if (zArr18.length > 3) {
                        zArr18[3] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f36240k == null) {
                        this.f36240k = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$11
                        }).b();
                    }
                    zy0Var.f44525q = (Map) this.f36240k.c(aVar);
                    boolean[] zArr19 = zy0Var.f44532x;
                    if (zArr19.length > 16) {
                        zArr19[16] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f36242m == null) {
                        this.f36242m = a.cb.q(oVar, String.class);
                    }
                    zy0Var.f44514f = (String) this.f36242m.c(aVar);
                    boolean[] zArr20 = zy0Var.f44532x;
                    if (zArr20.length > 5) {
                        zArr20[5] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f36232c == null) {
                        this.f36232c = a.cb.q(oVar, Date.class);
                    }
                    zy0Var.f44515g = (Date) this.f36232c.c(aVar);
                    boolean[] zArr21 = zy0Var.f44532x;
                    if (zArr21.length > 6) {
                        zArr21[6] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f36242m == null) {
                        this.f36242m = a.cb.q(oVar, String.class);
                    }
                    zy0Var.f44510b = (String) this.f36242m.c(aVar);
                    boolean[] zArr22 = zy0Var.f44532x;
                    if (zArr22.length > 1) {
                        zArr22[1] = true;
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
        return zy0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        wy0 wy0Var;
        String str;
        List list2;
        Map map;
        Double d2;
        Map map2;
        Integer num;
        az0.b bVar;
        f30 f30Var;
        List list3;
        Boolean bool;
        List list4;
        List list5;
        Boolean bool2;
        Integer num2;
        Date date;
        String str2;
        az0.a aVar;
        String str3;
        Integer num3;
        String str4;
        String str5;
        az0 az0Var = (az0) obj;
        if (az0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = az0Var.f35930x;
        int length = zArr.length;
        nm.o oVar = this.f36230a;
        if (length > 0 && zArr[0]) {
            if (this.f36242m == null) {
                this.f36242m = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36242m;
            um.c h10 = cVar.h("id");
            str5 = az0Var.f35907a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36242m == null) {
                this.f36242m = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36242m;
            um.c h13 = cVar.h("node_id");
            str4 = az0Var.f35908b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36234e == null) {
                this.f36234e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f36234e;
            um.c h14 = cVar.h("comment_count");
            num3 = az0Var.f35909c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36242m == null) {
                this.f36242m = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36242m;
            um.c h15 = cVar.h("details");
            str3 = az0Var.f35910d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36244o == null) {
                this.f36244o = a.cb.q(oVar, az0.a.class);
            }
            nm.m mVar5 = this.f36244o;
            um.c h16 = cVar.h("did_it_type");
            aVar = az0Var.f35911e;
            mVar5.e(h16, aVar);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36242m == null) {
                this.f36242m = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36242m;
            um.c h17 = cVar.h("dominant_color");
            str2 = az0Var.f35912f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36232c == null) {
                this.f36232c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar7 = this.f36232c;
            um.c h18 = cVar.h("done_at");
            date = az0Var.f35913g;
            mVar7.e(h18, date);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36234e == null) {
                this.f36234e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f36234e;
            um.c h19 = cVar.h("helpful_count");
            num2 = az0Var.f35914h;
            mVar8.e(h19, num2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36231b == null) {
                this.f36231b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f36231b;
            um.c h23 = cVar.h("highlighted_by_pin_owner");
            bool2 = az0Var.f35915i;
            mVar9.e(h23, bool2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36237h == null) {
                this.f36237h = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$1
                }).b();
            }
            nm.m mVar10 = this.f36237h;
            um.c h24 = cVar.h("image_signatures");
            list5 = az0Var.f35916j;
            mVar10.e(h24, list5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36235f == null) {
                this.f36235f = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$2
                }).b();
            }
            nm.m mVar11 = this.f36235f;
            um.c h25 = cVar.h("images");
            list4 = az0Var.f35917k;
            mVar11.e(h25, list4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36231b == null) {
                this.f36231b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f36231b;
            um.c h26 = cVar.h("marked_helpful_by_me");
            bool = az0Var.f35918l;
            mVar12.e(h26, bool);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f36236g == null) {
                this.f36236g = oVar.g(new TypeToken<List<kp0>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$3
                }).b();
            }
            nm.m mVar13 = this.f36236g;
            um.c h27 = cVar.h("paragraph_blocks");
            list3 = az0Var.f35919m;
            mVar13.e(h27, list3);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f36241l == null) {
                this.f36241l = a.cb.q(oVar, f30.class);
            }
            nm.m mVar14 = this.f36241l;
            um.c h28 = cVar.h("pin");
            f30Var = az0Var.f35920n;
            mVar14.e(h28, f30Var);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f36245p == null) {
                this.f36245p = a.cb.q(oVar, az0.b.class);
            }
            nm.m mVar15 = this.f36245p;
            um.c h29 = cVar.h("privacy");
            bVar = az0Var.f35921o;
            mVar15.e(h29, bVar);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f36234e == null) {
                this.f36234e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar16 = this.f36234e;
            um.c h33 = cVar.h("reaction_by_me");
            num = az0Var.f35922p;
            mVar16.e(h33, num);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f36240k == null) {
                this.f36240k = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$4
                }).b();
            }
            nm.m mVar17 = this.f36240k;
            um.c h34 = cVar.h("reaction_counts");
            map2 = az0Var.f35923q;
            mVar17.e(h34, map2);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f36233d == null) {
                this.f36233d = a.cb.q(oVar, Double.class);
            }
            nm.m mVar18 = this.f36233d;
            um.c h35 = cVar.h("recommend_score");
            d2 = az0Var.f35924r;
            mVar18.e(h35, d2);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f36240k == null) {
                this.f36240k = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$5
                }).b();
            }
            nm.m mVar19 = this.f36240k;
            um.c h36 = cVar.h("recommendation_reason");
            map = az0Var.f35925s;
            mVar19.e(h36, map);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f36238i == null) {
                this.f36238i = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$6
                }).b();
            }
            nm.m mVar20 = this.f36238i;
            um.c h37 = cVar.h("text_tags");
            list2 = az0Var.f35926t;
            mVar20.e(h37, list2);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f36242m == null) {
                this.f36242m = a.cb.q(oVar, String.class);
            }
            nm.m mVar21 = this.f36242m;
            um.c h38 = cVar.h("type");
            str = az0Var.f35927u;
            mVar21.e(h38, str);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f36243n == null) {
                this.f36243n = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar22 = this.f36243n;
            um.c h39 = cVar.h("user");
            wy0Var = az0Var.f35928v;
            mVar22.e(h39, wy0Var);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f36239j == null) {
                this.f36239j = oVar.g(new TypeToken<List<b01>>(this) { // from class: com.pinterest.api.model.UserDidItData$UserDidItDataTypeAdapter$7
                }).b();
            }
            nm.m mVar23 = this.f36239j;
            um.c h43 = cVar.h("videos");
            list = az0Var.f35929w;
            mVar23.e(h43, list);
        }
        cVar.g();
    }
}
