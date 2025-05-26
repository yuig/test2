package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class pg0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40980a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40981b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40982c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40983d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40984e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40985f;

    public pg0(nm.o oVar) {
        this.f40980a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        og0 og0Var = new og0(0);
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
                case -1626319393:
                    if (k03.equals("video_tracking_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1549143432:
                    if (k03.equals("invisible_product_stickers")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1178105356:
                    if (k03.equals("video_signature")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1137566124:
                    if (k03.equals("is_call_to_create")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1080544588:
                    if (k03.equals("interest_labels")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -984413585:
                    if (k03.equals("allow_shopping_rec")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -690608145:
                    if (k03.equals("freeform_tags_language")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -631912481:
                    if (k03.equals("is_sponsorable")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -451048365:
                    if (k03.equals("has_product_pins")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -359020464:
                    if (k03.equals("idea_pin_details")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -180013089:
                    if (k03.equals("template_type")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -126246874:
                    if (k03.equals("product_stickers")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 6462920:
                    if (k03.equals("freeform_tags")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 668360914:
                    if (k03.equals("is_comments_allowed")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 722276448:
                    if (k03.equals("sponsor_id")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 822085168:
                    if (k03.equals("idea_pin_details_template_type")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 887173442:
                    if (k03.equals("user_mention_tags")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 1045481507:
                    if (k03.equals("interest_ids")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 1404400393:
                    if (k03.equals("call_to_create_source_pin_id")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case 1799260438:
                    if (k03.equals("has_not_royalty_free_music")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case 2027300355:
                    if (k03.equals("alt_text")) {
                        c13 = 24;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40980a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40705d = (String) this.f40985f.c(aVar);
                    boolean[] zArr = og0Var.f40727z;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40726y = (String) this.f40985f.c(aVar);
                    boolean[] zArr2 = og0Var.f40727z;
                    if (zArr2.length > 24) {
                        zArr2[24] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40715n = (String) this.f40985f.c(aVar);
                    boolean[] zArr3 = og0Var.f40727z;
                    if (zArr3.length > 13) {
                        zArr3[13] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40725x = (String) this.f40985f.c(aVar);
                    boolean[] zArr4 = og0Var.f40727z;
                    if (zArr4.length > 23) {
                        zArr4[23] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40716o = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr5 = og0Var.f40727z;
                    if (zArr5.length > 14) {
                        zArr5[14] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    z13 = false;
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40714m = (String) this.f40985f.c(aVar);
                    boolean[] zArr6 = og0Var.f40727z;
                    if (zArr6.length > 12) {
                        zArr6[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40702a = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr7 = og0Var.f40727z;
                    if (zArr7.length > 0) {
                        z13 = false;
                        zArr7[0] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40707f = (String) this.f40985f.c(aVar);
                    boolean[] zArr8 = og0Var.f40727z;
                    if (zArr8.length > 5) {
                        zArr8[5] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40718q = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr9 = og0Var.f40727z;
                    if (zArr9.length > 16) {
                        zArr9[16] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40709h = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr10 = og0Var.f40727z;
                    if (zArr10.length > 7) {
                        zArr10[7] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f40984e == null) {
                        this.f40984e = a.cb.q(oVar, qk0.class);
                    }
                    og0Var.f40710i = (qk0) this.f40984e.c(aVar);
                    boolean[] zArr11 = og0Var.f40727z;
                    if (zArr11.length > 8) {
                        zArr11[8] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f40982c == null) {
                        this.f40982c = a.cb.q(oVar, Integer.class);
                    }
                    og0Var.f40722u = (Integer) this.f40982c.c(aVar);
                    boolean[] zArr12 = og0Var.f40727z;
                    if (zArr12.length > 20) {
                        zArr12[20] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40720s = (String) this.f40985f.c(aVar);
                    boolean[] zArr13 = og0Var.f40727z;
                    if (zArr13.length > 18) {
                        zArr13[18] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40719r = (String) this.f40985f.c(aVar);
                    boolean[] zArr14 = og0Var.f40727z;
                    if (zArr14.length > 17) {
                        zArr14[17] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40706e = (String) this.f40985f.c(aVar);
                    boolean[] zArr15 = og0Var.f40727z;
                    if (zArr15.length > 4) {
                        zArr15[4] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40723v = (String) this.f40985f.c(aVar);
                    boolean[] zArr16 = og0Var.f40727z;
                    if (zArr16.length > 21) {
                        zArr16[21] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40712k = (String) this.f40985f.c(aVar);
                    boolean[] zArr17 = og0Var.f40727z;
                    if (zArr17.length > 10) {
                        zArr17[10] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40717p = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr18 = og0Var.f40727z;
                    if (zArr18.length > 15) {
                        zArr18[15] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40721t = (String) this.f40985f.c(aVar);
                    boolean[] zArr19 = og0Var.f40727z;
                    if (zArr19.length > 19) {
                        zArr19[19] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f40982c == null) {
                        this.f40982c = a.cb.q(oVar, Integer.class);
                    }
                    og0Var.f40711j = (Integer) this.f40982c.c(aVar);
                    boolean[] zArr20 = og0Var.f40727z;
                    if (zArr20.length > 9) {
                        zArr20[9] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f40983d == null) {
                        this.f40983d = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.ScheduledPinMetadataAttributes$ScheduledPinMetadataAttributesTypeAdapter$2
                        }).b();
                    }
                    og0Var.f40724w = (List) this.f40983d.c(aVar);
                    boolean[] zArr21 = og0Var.f40727z;
                    if (zArr21.length > 22) {
                        zArr21[22] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40713l = (String) this.f40985f.c(aVar);
                    boolean[] zArr22 = og0Var.f40727z;
                    if (zArr22.length > 11) {
                        zArr22[11] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40704c = (String) this.f40985f.c(aVar);
                    boolean[] zArr23 = og0Var.f40727z;
                    if (zArr23.length > 2) {
                        zArr23[2] = true;
                        break;
                    }
                    break;
                case 23:
                    if (this.f40981b == null) {
                        this.f40981b = a.cb.q(oVar, Boolean.class);
                    }
                    og0Var.f40708g = (Boolean) this.f40981b.c(aVar);
                    boolean[] zArr24 = og0Var.f40727z;
                    if (zArr24.length > 6) {
                        zArr24[6] = true;
                        break;
                    }
                    break;
                case 24:
                    if (this.f40985f == null) {
                        this.f40985f = a.cb.q(oVar, String.class);
                    }
                    og0Var.f40703b = (String) this.f40985f.c(aVar);
                    boolean[] zArr25 = og0Var.f40727z;
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
        return new rg0(og0Var.f40702a, og0Var.f40703b, og0Var.f40704c, og0Var.f40705d, og0Var.f40706e, og0Var.f40707f, og0Var.f40708g, og0Var.f40709h, og0Var.f40710i, og0Var.f40711j, og0Var.f40712k, og0Var.f40713l, og0Var.f40714m, og0Var.f40715n, og0Var.f40716o, og0Var.f40717p, og0Var.f40718q, og0Var.f40719r, og0Var.f40720s, og0Var.f40721t, og0Var.f40722u, og0Var.f40723v, og0Var.f40724w, og0Var.f40725x, og0Var.f40726y, og0Var.f40727z, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        String str3;
        Integer num;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num2;
        qk0 qk0Var;
        Boolean bool4;
        Boolean bool5;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Boolean bool6;
        rg0 rg0Var = (rg0) obj;
        if (rg0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rg0Var.f41599z;
        int length = zArr.length;
        nm.o oVar = this.f40980a;
        if (length > 0 && zArr[0]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f40981b;
            um.c h10 = cVar.h("allow_shopping_rec");
            bool6 = rg0Var.f41574a;
            mVar.e(h10, bool6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40985f;
            um.c h13 = cVar.h("alt_text");
            str15 = rg0Var.f41575b;
            mVar2.e(h13, str15);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40985f;
            um.c h14 = cVar.h("call_to_create_source_pin_id");
            str14 = rg0Var.f41576c;
            mVar3.e(h14, str14);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40985f;
            um.c h15 = cVar.h("description");
            str13 = rg0Var.f41577d;
            mVar4.e(h15, str13);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40985f;
            um.c h16 = cVar.h("freeform_tags");
            str12 = rg0Var.f41578e;
            mVar5.e(h16, str12);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40985f;
            um.c h17 = cVar.h("freeform_tags_language");
            str11 = rg0Var.f41579f;
            mVar6.e(h17, str11);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f40981b;
            um.c h18 = cVar.h("has_not_royalty_free_music");
            bool5 = rg0Var.f41580g;
            mVar7.e(h18, bool5);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f40981b;
            um.c h19 = cVar.h("has_product_pins");
            bool4 = rg0Var.f41581h;
            mVar8.e(h19, bool4);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40984e == null) {
                this.f40984e = a.cb.q(oVar, qk0.class);
            }
            nm.m mVar9 = this.f40984e;
            um.c h23 = cVar.h("idea_pin_details");
            qk0Var = rg0Var.f41582i;
            mVar9.e(h23, qk0Var);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40982c == null) {
                this.f40982c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f40982c;
            um.c h24 = cVar.h("idea_pin_details_template_type");
            num2 = rg0Var.f41583j;
            mVar10.e(h24, num2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f40985f;
            um.c h25 = cVar.h("image_signature");
            str10 = rg0Var.f41584k;
            mVar11.e(h25, str10);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f40985f;
            um.c h26 = cVar.h("interest_ids");
            str9 = rg0Var.f41585l;
            mVar12.e(h26, str9);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f40985f;
            um.c h27 = cVar.h("interest_labels");
            str8 = rg0Var.f41586m;
            mVar13.e(h27, str8);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f40985f;
            um.c h28 = cVar.h("invisible_product_stickers");
            str7 = rg0Var.f41587n;
            mVar14.e(h28, str7);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar15 = this.f40981b;
            um.c h29 = cVar.h("is_call_to_create");
            bool3 = rg0Var.f41588o;
            mVar15.e(h29, bool3);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar16 = this.f40981b;
            um.c h33 = cVar.h("is_comments_allowed");
            bool2 = rg0Var.f41589p;
            mVar16.e(h33, bool2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f40981b == null) {
                this.f40981b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar17 = this.f40981b;
            um.c h34 = cVar.h("is_sponsorable");
            bool = rg0Var.f41590q;
            mVar17.e(h34, bool);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar18 = this.f40985f;
            um.c h35 = cVar.h("link");
            str6 = rg0Var.f41591r;
            mVar18.e(h35, str6);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar19 = this.f40985f;
            um.c h36 = cVar.h("product_stickers");
            str5 = rg0Var.f41592s;
            mVar19.e(h36, str5);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar20 = this.f40985f;
            um.c h37 = cVar.h("sponsor_id");
            str4 = rg0Var.f41593t;
            mVar20.e(h37, str4);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f40982c == null) {
                this.f40982c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar21 = this.f40982c;
            um.c h38 = cVar.h("template_type");
            num = rg0Var.f41594u;
            mVar21.e(h38, num);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar22 = this.f40985f;
            um.c h39 = cVar.h("title");
            str3 = rg0Var.f41595v;
            mVar22.e(h39, str3);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f40983d == null) {
                this.f40983d = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.ScheduledPinMetadataAttributes$ScheduledPinMetadataAttributesTypeAdapter$1
                }).b();
            }
            nm.m mVar23 = this.f40983d;
            um.c h43 = cVar.h("user_mention_tags");
            list = rg0Var.f41596w;
            mVar23.e(h43, list);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar24 = this.f40985f;
            um.c h44 = cVar.h("video_signature");
            str2 = rg0Var.f41597x;
            mVar24.e(h44, str2);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f40985f == null) {
                this.f40985f = a.cb.q(oVar, String.class);
            }
            nm.m mVar25 = this.f40985f;
            um.c h45 = cVar.h("video_tracking_id");
            str = rg0Var.f41598y;
            mVar25.e(h45, str);
        }
        cVar.g();
    }
}
