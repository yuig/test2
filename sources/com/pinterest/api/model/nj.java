package com.pinterest.api.model;

import com.pinterest.api.model.mj;

/* loaded from: classes3.dex */
public final class nj extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40411a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40412b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40413c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40414d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40415e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40416f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40417g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f40418h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f40419i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f40420j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f40421k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f40422l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f40423m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f40424n;

    public nj(nm.o oVar) {
        this.f40411a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lj ljVar = new lj(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1728437623:
                    if (k03.equals("date_of_enforcement")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1600247710:
                    if (k03.equals("show_preview_image")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1489595877:
                    if (k03.equals("object_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1332008725:
                    if (k03.equals("did_it")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1022299522:
                    if (k03.equals("appeal_status_enum")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -934964668:
                    if (k03.equals("reason")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -660286695:
                    if (k03.equals("shuffle_comment")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -576697598:
                    if (k03.equals("appeal_attachments_enabled")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
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
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 189271526:
                    if (k03.equals("object_type_enum")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 198295492:
                    if (k03.equals("action_id")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 283661376:
                    if (k03.equals("enforcement")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 611139227:
                    if (k03.equals("legal_takedown_request_id")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 937002524:
                    if (k03.equals("reason_enum")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 991427237:
                    if (k03.equals("aggregated_comment")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 1015433990:
                    if (k03.equals("is_blocked_from_appealing")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 1144831840:
                    if (k03.equals("sor_available")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 1206018745:
                    if (k03.equals("review_status")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 1593880802:
                    if (k03.equals("policy_url")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case 1812737688:
                    if (k03.equals("content_visibility")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 24;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40411a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f40415e == null) {
                        this.f40415e = a.cb.q(oVar, Double.class);
                    }
                    ljVar.f39787i = (Double) this.f40415e.c(aVar);
                    boolean[] zArr = ljVar.f39804z;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f40414d == null) {
                        this.f40414d = a.cb.q(oVar, Boolean.class);
                    }
                    ljVar.f39800v = (Boolean) this.f40414d.c(aVar);
                    boolean[] zArr2 = ljVar.f39804z;
                    if (zArr2.length > 21) {
                        zArr2[21] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39793o = (String) this.f40422l.c(aVar);
                    boolean[] zArr3 = ljVar.f39804z;
                    if (zArr3.length > 14) {
                        zArr3[14] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f40424n == null) {
                        this.f40424n = a.cb.q(oVar, az0.class);
                    }
                    ljVar.f39788j = (az0) this.f40424n.c(aVar);
                    boolean[] zArr4 = ljVar.f39804z;
                    if (zArr4.length > 9) {
                        zArr4[9] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f40416f == null) {
                        this.f40416f = a.cb.q(oVar, mj.a.class);
                    }
                    ljVar.f39784f = (mj.a) this.f40416f.c(aVar);
                    boolean[] zArr5 = ljVar.f39804z;
                    if (zArr5.length > 5) {
                        zArr5[5] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39797s = (String) this.f40422l.c(aVar);
                    boolean[] zArr6 = ljVar.f39804z;
                    if (zArr6.length > 18) {
                        zArr6[18] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39790l = (String) this.f40422l.c(aVar);
                    boolean[] zArr7 = ljVar.f39804z;
                    if (zArr7.length > 11) {
                        zArr7[11] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f40421k == null) {
                        this.f40421k = a.cb.q(oVar, ni0.class);
                    }
                    ljVar.f39801w = (ni0) this.f40421k.c(aVar);
                    boolean[] zArr8 = ljVar.f39804z;
                    if (zArr8.length > 22) {
                        zArr8[22] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    z13 = false;
                    if (this.f40414d == null) {
                        this.f40414d = a.cb.q(oVar, Boolean.class);
                    }
                    ljVar.f39783e = (Boolean) this.f40414d.c(aVar);
                    boolean[] zArr9 = ljVar.f39804z;
                    if (zArr9.length > 4) {
                        zArr9[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\t':
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39779a = (String) this.f40422l.c(aVar);
                    boolean[] zArr10 = ljVar.f39804z;
                    if (zArr10.length > 0) {
                        z13 = false;
                        zArr10[0] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f40420j == null) {
                        this.f40420j = a.cb.q(oVar, f30.class);
                    }
                    ljVar.f39795q = (f30) this.f40420j.c(aVar);
                    boolean[] zArr11 = ljVar.f39804z;
                    if (zArr11.length > 16) {
                        zArr11[16] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f40423m == null) {
                        this.f40423m = a.cb.q(oVar, wy0.class);
                    }
                    ljVar.f39803y = (wy0) this.f40423m.c(aVar);
                    boolean[] zArr12 = ljVar.f39804z;
                    if (zArr12.length > 24) {
                        zArr12[24] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f40413c == null) {
                        this.f40413c = a.cb.q(oVar, v7.class);
                    }
                    ljVar.f39785g = (v7) this.f40413c.c(aVar);
                    boolean[] zArr13 = ljVar.f39804z;
                    if (zArr13.length > 6) {
                        zArr13[6] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f40418h == null) {
                        this.f40418h = a.cb.q(oVar, mj.c.class);
                    }
                    ljVar.f39794p = (mj.c) this.f40418h.c(aVar);
                    boolean[] zArr14 = ljVar.f39804z;
                    if (zArr14.length > 15) {
                        zArr14[15] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39781c = (String) this.f40422l.c(aVar);
                    boolean[] zArr15 = ljVar.f39804z;
                    if (zArr15.length > 2) {
                        zArr15[2] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39789k = (String) this.f40422l.c(aVar);
                    boolean[] zArr16 = ljVar.f39804z;
                    if (zArr16.length > 10) {
                        zArr16[10] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39792n = (String) this.f40422l.c(aVar);
                    boolean[] zArr17 = ljVar.f39804z;
                    if (zArr17.length > 13) {
                        zArr17[13] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f40419i == null) {
                        this.f40419i = a.cb.q(oVar, mj.d.class);
                    }
                    ljVar.f39798t = (mj.d) this.f40419i.c(aVar);
                    boolean[] zArr18 = ljVar.f39804z;
                    if (zArr18.length > 19) {
                        zArr18[19] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f40412b == null) {
                        this.f40412b = a.cb.q(oVar, z2.class);
                    }
                    ljVar.f39782d = (z2) this.f40412b.c(aVar);
                    boolean[] zArr19 = ljVar.f39804z;
                    if (zArr19.length > 3) {
                        zArr19[3] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f40414d == null) {
                        this.f40414d = a.cb.q(oVar, Boolean.class);
                    }
                    ljVar.f39791m = (Boolean) this.f40414d.c(aVar);
                    boolean[] zArr20 = ljVar.f39804z;
                    if (zArr20.length > 12) {
                        zArr20[12] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f40414d == null) {
                        this.f40414d = a.cb.q(oVar, Boolean.class);
                    }
                    ljVar.f39802x = (Boolean) this.f40414d.c(aVar);
                    boolean[] zArr21 = ljVar.f39804z;
                    if (zArr21.length > 23) {
                        zArr21[23] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39799u = (String) this.f40422l.c(aVar);
                    boolean[] zArr22 = ljVar.f39804z;
                    if (zArr22.length > 20) {
                        zArr22[20] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39796r = (String) this.f40422l.c(aVar);
                    boolean[] zArr23 = ljVar.f39804z;
                    if (zArr23.length > 17) {
                        zArr23[17] = true;
                        break;
                    }
                    break;
                case 23:
                    if (this.f40417g == null) {
                        this.f40417g = a.cb.q(oVar, mj.b.class);
                    }
                    ljVar.f39786h = (mj.b) this.f40417g.c(aVar);
                    boolean[] zArr24 = ljVar.f39804z;
                    if (zArr24.length > 7) {
                        zArr24[7] = true;
                        break;
                    }
                    break;
                case 24:
                    if (this.f40422l == null) {
                        this.f40422l = a.cb.q(oVar, String.class);
                    }
                    ljVar.f39780b = (String) this.f40422l.c(aVar);
                    boolean[] zArr25 = ljVar.f39804z;
                    if (zArr25.length > 1) {
                        zArr25[1] = true;
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
        return new mj(ljVar.f39779a, ljVar.f39780b, ljVar.f39781c, ljVar.f39782d, ljVar.f39783e, ljVar.f39784f, ljVar.f39785g, ljVar.f39786h, ljVar.f39787i, ljVar.f39788j, ljVar.f39789k, ljVar.f39790l, ljVar.f39791m, ljVar.f39792n, ljVar.f39793o, ljVar.f39794p, ljVar.f39795q, ljVar.f39796r, ljVar.f39797s, ljVar.f39798t, ljVar.f39799u, ljVar.f39800v, ljVar.f39801w, ljVar.f39802x, ljVar.f39803y, ljVar.f39804z, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        Boolean bool;
        ni0 ni0Var;
        Boolean bool2;
        String str;
        mj.d dVar;
        String str2;
        String str3;
        f30 f30Var;
        mj.c cVar2;
        String str4;
        String str5;
        Boolean bool3;
        String str6;
        String str7;
        az0 az0Var;
        Double d2;
        mj.b bVar;
        v7 v7Var;
        mj.a aVar;
        Boolean bool4;
        z2 z2Var;
        String str8;
        String str9;
        String str10;
        mj mjVar = (mj) obj;
        if (mjVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mjVar.f40138z;
        int length = zArr.length;
        nm.o oVar = this.f40411a;
        if (length > 0 && zArr[0]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40422l;
            um.c h10 = cVar.h("id");
            str10 = mjVar.f40113a;
            mVar.e(h10, str10);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40422l;
            um.c h13 = cVar.h("node_id");
            str9 = mjVar.f40114b;
            mVar2.e(h13, str9);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40422l;
            um.c h14 = cVar.h("action_id");
            str8 = mjVar.f40115c;
            mVar3.e(h14, str8);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40412b == null) {
                this.f40412b = a.cb.q(oVar, z2.class);
            }
            nm.m mVar4 = this.f40412b;
            um.c h15 = cVar.h("aggregated_comment");
            z2Var = mjVar.f40116d;
            mVar4.e(h15, z2Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40414d == null) {
                this.f40414d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f40414d;
            um.c h16 = cVar.h("appeal_attachments_enabled");
            bool4 = mjVar.f40117e;
            mVar5.e(h16, bool4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40416f == null) {
                this.f40416f = a.cb.q(oVar, mj.a.class);
            }
            nm.m mVar6 = this.f40416f;
            um.c h17 = cVar.h("appeal_status_enum");
            aVar = mjVar.f40118f;
            mVar6.e(h17, aVar);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40413c == null) {
                this.f40413c = a.cb.q(oVar, v7.class);
            }
            nm.m mVar7 = this.f40413c;
            um.c h18 = cVar.h("board");
            v7Var = mjVar.f40119g;
            mVar7.e(h18, v7Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40417g == null) {
                this.f40417g = a.cb.q(oVar, mj.b.class);
            }
            nm.m mVar8 = this.f40417g;
            um.c h19 = cVar.h("content_visibility");
            bVar = mjVar.f40120h;
            mVar8.e(h19, bVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40415e == null) {
                this.f40415e = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f40415e;
            um.c h23 = cVar.h("date_of_enforcement");
            d2 = mjVar.f40121i;
            mVar9.e(h23, d2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40424n == null) {
                this.f40424n = a.cb.q(oVar, az0.class);
            }
            nm.m mVar10 = this.f40424n;
            um.c h24 = cVar.h("did_it");
            az0Var = mjVar.f40122j;
            mVar10.e(h24, az0Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f40422l;
            um.c h25 = cVar.h("enforcement");
            str7 = mjVar.f40123k;
            mVar11.e(h25, str7);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f40422l;
            um.c h26 = cVar.h("image_url");
            str6 = mjVar.f40124l;
            mVar12.e(h26, str6);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40414d == null) {
                this.f40414d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f40414d;
            um.c h27 = cVar.h("is_blocked_from_appealing");
            bool3 = mjVar.f40125m;
            mVar13.e(h27, bool3);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f40422l;
            um.c h28 = cVar.h("legal_takedown_request_id");
            str5 = mjVar.f40126n;
            mVar14.e(h28, str5);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f40422l;
            um.c h29 = cVar.h("object_id");
            str4 = mjVar.f40127o;
            mVar15.e(h29, str4);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f40418h == null) {
                this.f40418h = a.cb.q(oVar, mj.c.class);
            }
            nm.m mVar16 = this.f40418h;
            um.c h33 = cVar.h("object_type_enum");
            cVar2 = mjVar.f40128p;
            mVar16.e(h33, cVar2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f40420j == null) {
                this.f40420j = a.cb.q(oVar, f30.class);
            }
            nm.m mVar17 = this.f40420j;
            um.c h34 = cVar.h("pin");
            f30Var = mjVar.f40129q;
            mVar17.e(h34, f30Var);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f40422l;
            um.c h35 = cVar.h("policy_url");
            str3 = mjVar.f40130r;
            mVar18.e(h35, str3);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f40422l;
            um.c h36 = cVar.h("reason");
            str2 = mjVar.f40131s;
            mVar19.e(h36, str2);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f40419i == null) {
                this.f40419i = a.cb.q(oVar, mj.d.class);
            }
            nm.m mVar20 = this.f40419i;
            um.c h37 = cVar.h("reason_enum");
            dVar = mjVar.f40132t;
            mVar20.e(h37, dVar);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f40422l == null) {
                this.f40422l = a.cb.q(oVar, String.class);
            }
            nm.m mVar21 = this.f40422l;
            um.c h38 = cVar.h("review_status");
            str = mjVar.f40133u;
            mVar21.e(h38, str);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f40414d == null) {
                this.f40414d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar22 = this.f40414d;
            um.c h39 = cVar.h("show_preview_image");
            bool2 = mjVar.f40134v;
            mVar22.e(h39, bool2);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f40421k == null) {
                this.f40421k = a.cb.q(oVar, ni0.class);
            }
            nm.m mVar23 = this.f40421k;
            um.c h43 = cVar.h("shuffle_comment");
            ni0Var = mjVar.f40135w;
            mVar23.e(h43, ni0Var);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f40414d == null) {
                this.f40414d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar24 = this.f40414d;
            um.c h44 = cVar.h("sor_available");
            bool = mjVar.f40136x;
            mVar24.e(h44, bool);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f40423m == null) {
                this.f40423m = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar25 = this.f40423m;
            um.c h45 = cVar.h("user");
            wy0Var = mjVar.f40137y;
            mVar25.e(h45, wy0Var);
        }
        cVar.g();
    }
}
