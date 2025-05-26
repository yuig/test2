package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class i0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38577a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38578b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38579c;

    public i0(nm.o oVar) {
        this.f38577a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        boolean z13 = false;
        k0 k0Var = new k0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            ?? r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            r15 = -1;
            switch (k03.hashCode()) {
                case -1784531377:
                    if (k03.equals("is_age_matched")) {
                        r15 = z13;
                        break;
                    }
                    break;
                case -1270649405:
                    if (k03.equals("is_geo_postal_code_matched")) {
                        r15 = 1;
                        break;
                    }
                    break;
                case -832939632:
                    if (k03.equals("is_third_party_ad_personalization_enabled")) {
                        r15 = 2;
                        break;
                    }
                    break;
                case -789640418:
                    if (k03.equals("is_behavior_targeting_matched")) {
                        r15 = 3;
                        break;
                    }
                    break;
                case -767441789:
                    if (k03.equals("is_pl_persona_matched")) {
                        r15 = 4;
                        break;
                    }
                    break;
                case -743007556:
                    if (k03.equals("is_geo_region_matched")) {
                        r15 = 5;
                        break;
                    }
                    break;
                case -654774491:
                    if (k03.equals("matched_age_bucket")) {
                        r15 = 6;
                        break;
                    }
                    break;
                case -561276569:
                    if (k03.equals("is_first_party_ad_personalization_enabled")) {
                        r15 = 7;
                        break;
                    }
                    break;
                case -463937695:
                    if (k03.equals("is_shopping_retargeting_matched")) {
                        r15 = 8;
                        break;
                    }
                    break;
                case -129089882:
                    if (k03.equals("is_expand_targeting_matched")) {
                        r15 = 9;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        r15 = 10;
                        break;
                    }
                    break;
                case 35436106:
                    if (k03.equals("is_from_gps_location")) {
                        r15 = 11;
                        break;
                    }
                    break;
                case 153741774:
                    if (k03.equals("matched_keyword")) {
                        r15 = 12;
                        break;
                    }
                    break;
                case 253897971:
                    if (k03.equals("geo_postal_code")) {
                        r15 = 13;
                        break;
                    }
                    break;
                case 364504382:
                    if (k03.equals("is_visitor_matched")) {
                        r15 = 14;
                        break;
                    }
                    break;
                case 518281189:
                    if (k03.equals("matched_interest")) {
                        r15 = 15;
                        break;
                    }
                    break;
                case 819421824:
                    if (k03.equals("is_actalike_matched")) {
                        r15 = 16;
                        break;
                    }
                    break;
                case 954492505:
                    if (k03.equals("is_shopping_prospecting_matched")) {
                        r15 = 17;
                        break;
                    }
                    break;
                case 1021765538:
                    if (k03.equals("geo_region")) {
                        r15 = 18;
                        break;
                    }
                    break;
                case 1051378129:
                    if (k03.equals("matched_device")) {
                        r15 = 19;
                        break;
                    }
                    break;
                case 1137022524:
                    if (k03.equals("matched_gender")) {
                        r15 = 20;
                        break;
                    }
                    break;
                case 1289073109:
                    if (k03.equals("matched_locale")) {
                        r15 = 21;
                        break;
                    }
                    break;
                case 1500657647:
                    if (k03.equals("is_customer_list_matched")) {
                        r15 = 22;
                        break;
                    }
                    break;
                case 1930698329:
                    if (k03.equals("is_engagement_matched")) {
                        r15 = 23;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        r15 = 24;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38577a;
            switch (r15) {
                case 0:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.c((Boolean) this.f38578b.c(aVar));
                    break;
                case 1:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.h((Boolean) this.f38578b.c(aVar));
                    break;
                case 2:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.f39215r = (Boolean) this.f38578b.c(aVar);
                    boolean[] zArr = k0Var.f39223z;
                    if (zArr.length <= 17) {
                        break;
                    } else {
                        zArr[17] = true;
                        break;
                    }
                case 3:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.d((Boolean) this.f38578b.c(aVar));
                    break;
                case 4:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.j((Boolean) this.f38578b.c(aVar));
                    break;
                case 5:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.i((Boolean) this.f38578b.c(aVar));
                    break;
                case 6:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.f39217t = (String) this.f38579c.c(aVar);
                    boolean[] zArr2 = k0Var.f39223z;
                    if (zArr2.length <= 19) {
                        break;
                    } else {
                        zArr2[19] = true;
                        break;
                    }
                case 7:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.f39208k = (Boolean) this.f38578b.c(aVar);
                    boolean[] zArr3 = k0Var.f39223z;
                    if (zArr3.length <= 10) {
                        break;
                    } else {
                        zArr3[10] = true;
                        break;
                    }
                case 8:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.f39214q = (Boolean) this.f38578b.c(aVar);
                    boolean[] zArr4 = k0Var.f39223z;
                    if (zArr4.length <= 16) {
                        break;
                    } else {
                        zArr4[16] = true;
                        break;
                    }
                case 9:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.f39207j = (Boolean) this.f38578b.c(aVar);
                    boolean[] zArr5 = k0Var.f39223z;
                    if (zArr5.length <= 9) {
                        break;
                    } else {
                        zArr5[9] = true;
                        break;
                    }
                case 10:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.q((String) this.f38579c.c(aVar));
                    break;
                case 11:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.g((Boolean) this.f38578b.c(aVar));
                    break;
                case 12:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.o((String) this.f38579c.c(aVar));
                    break;
                case 13:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.a((String) this.f38579c.c(aVar));
                    break;
                case 14:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.l((Boolean) this.f38578b.c(aVar));
                    break;
                case 15:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.f39220w = (String) this.f38579c.c(aVar);
                    boolean[] zArr6 = k0Var.f39223z;
                    if (zArr6.length <= 22) {
                        break;
                    } else {
                        zArr6[22] = true;
                        break;
                    }
                case 16:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.b((Boolean) this.f38578b.c(aVar));
                    break;
                case 17:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.k((Boolean) this.f38578b.c(aVar));
                    break;
                case 18:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.f39201d = (String) this.f38579c.c(aVar);
                    boolean[] zArr7 = k0Var.f39223z;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case 19:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.m((String) this.f38579c.c(aVar));
                    break;
                case 20:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.n((String) this.f38579c.c(aVar));
                    break;
                case 21:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.f39222y = (String) this.f38579c.c(aVar);
                    boolean[] zArr8 = k0Var.f39223z;
                    if (zArr8.length <= 24) {
                        break;
                    } else {
                        zArr8[24] = true;
                        break;
                    }
                case 22:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.e((Boolean) this.f38578b.c(aVar));
                    break;
                case 23:
                    if (this.f38578b == null) {
                        this.f38578b = a.cb.q(oVar, Boolean.class);
                    }
                    k0Var.f((Boolean) this.f38578b.c(aVar));
                    break;
                case 24:
                    if (this.f38579c == null) {
                        this.f38579c = a.cb.q(oVar, String.class);
                    }
                    k0Var.p((String) this.f38579c.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
            z13 = false;
        }
        aVar.g();
        return new l0(k0Var.f39198a, k0Var.f39199b, k0Var.f39200c, k0Var.f39201d, k0Var.f39202e, k0Var.f39203f, k0Var.f39204g, k0Var.f39205h, k0Var.f39206i, k0Var.f39207j, k0Var.f39208k, k0Var.f39209l, k0Var.f39210m, k0Var.f39211n, k0Var.f39212o, k0Var.f39213p, k0Var.f39214q, k0Var.f39215r, k0Var.f39216s, k0Var.f39217t, k0Var.f39218u, k0Var.f39219v, k0Var.f39220w, k0Var.f39221x, k0Var.f39222y, k0Var.f39223z, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        String str7;
        String str8;
        String str9;
        String str10;
        l0 l0Var = (l0) obj;
        if (l0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = l0Var.f39602z;
        int length = zArr.length;
        nm.o oVar = this.f38577a;
        if (length > 0 && zArr[0]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38579c;
            um.c h10 = cVar.h("id");
            str10 = l0Var.f39577a;
            mVar.e(h10, str10);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38579c;
            um.c h13 = cVar.h("node_id");
            str9 = l0Var.f39578b;
            mVar2.e(h13, str9);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38579c;
            um.c h14 = cVar.h("geo_postal_code");
            str8 = l0Var.f39579c;
            mVar3.e(h14, str8);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38579c;
            um.c h15 = cVar.h("geo_region");
            str7 = l0Var.f39580d;
            mVar4.e(h15, str7);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f38578b;
            um.c h16 = cVar.h("is_actalike_matched");
            bool15 = l0Var.f39581e;
            mVar5.e(h16, bool15);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f38578b;
            um.c h17 = cVar.h("is_age_matched");
            bool14 = l0Var.f39582f;
            mVar6.e(h17, bool14);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f38578b;
            um.c h18 = cVar.h("is_behavior_targeting_matched");
            bool13 = l0Var.f39583g;
            mVar7.e(h18, bool13);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f38578b;
            um.c h19 = cVar.h("is_customer_list_matched");
            bool12 = l0Var.f39584h;
            mVar8.e(h19, bool12);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f38578b;
            um.c h23 = cVar.h("is_engagement_matched");
            bool11 = l0Var.f39585i;
            mVar9.e(h23, bool11);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f38578b;
            um.c h24 = cVar.h("is_expand_targeting_matched");
            bool10 = l0Var.f39586j;
            mVar10.e(h24, bool10);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f38578b;
            um.c h25 = cVar.h("is_first_party_ad_personalization_enabled");
            bool9 = l0Var.f39587k;
            mVar11.e(h25, bool9);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f38578b;
            um.c h26 = cVar.h("is_from_gps_location");
            bool8 = l0Var.f39588l;
            mVar12.e(h26, bool8);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f38578b;
            um.c h27 = cVar.h("is_geo_postal_code_matched");
            bool7 = l0Var.f39589m;
            mVar13.e(h27, bool7);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar14 = this.f38578b;
            um.c h28 = cVar.h("is_geo_region_matched");
            bool6 = l0Var.f39590n;
            mVar14.e(h28, bool6);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar15 = this.f38578b;
            um.c h29 = cVar.h("is_pl_persona_matched");
            bool5 = l0Var.f39591o;
            mVar15.e(h29, bool5);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar16 = this.f38578b;
            um.c h33 = cVar.h("is_shopping_prospecting_matched");
            bool4 = l0Var.f39592p;
            mVar16.e(h33, bool4);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar17 = this.f38578b;
            um.c h34 = cVar.h("is_shopping_retargeting_matched");
            bool3 = l0Var.f39593q;
            mVar17.e(h34, bool3);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar18 = this.f38578b;
            um.c h35 = cVar.h("is_third_party_ad_personalization_enabled");
            bool2 = l0Var.f39594r;
            mVar18.e(h35, bool2);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f38578b == null) {
                this.f38578b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar19 = this.f38578b;
            um.c h36 = cVar.h("is_visitor_matched");
            bool = l0Var.f39595s;
            mVar19.e(h36, bool);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar20 = this.f38579c;
            um.c h37 = cVar.h("matched_age_bucket");
            str6 = l0Var.f39596t;
            mVar20.e(h37, str6);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar21 = this.f38579c;
            um.c h38 = cVar.h("matched_device");
            str5 = l0Var.f39597u;
            mVar21.e(h38, str5);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar22 = this.f38579c;
            um.c h39 = cVar.h("matched_gender");
            str4 = l0Var.f39598v;
            mVar22.e(h39, str4);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar23 = this.f38579c;
            um.c h43 = cVar.h("matched_interest");
            str3 = l0Var.f39599w;
            mVar23.e(h43, str3);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar24 = this.f38579c;
            um.c h44 = cVar.h("matched_keyword");
            str2 = l0Var.f39600x;
            mVar24.e(h44, str2);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f38579c == null) {
                this.f38579c = a.cb.q(oVar, String.class);
            }
            nm.m mVar25 = this.f38579c;
            um.c h45 = cVar.h("matched_locale");
            str = l0Var.f39601y;
            mVar25.e(h45, str);
        }
        cVar.g();
    }
}
