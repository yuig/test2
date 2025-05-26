package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class w2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43139a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43140b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43141c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43142d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43143e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43144f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43145g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43146h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f43147i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f43148j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f43149k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f43150l;

    public w2(nm.o oVar) {
        this.f43139a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y2 y2Var = new y2(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1959780154:
                    if (k03.equals("is_translatable")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1767376265:
                    if (k03.equals("comment_response_pin")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1664488326:
                    if (k03.equals("attached_pin")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1428014907:
                    if (k03.equals("reacted_by_creator")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1120985297:
                    if (k03.equals("comment_count")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -844503060:
                    if (k03.equals("reply_preview_ids")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -843789090:
                    if (k03.equals("is_edited")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -604765110:
                    if (k03.equals("marked_helpful_by_me")) {
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
                case 3552281:
                    if (k03.equals("tags")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 103772132:
                    if (k03.equals("media")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 467184874:
                    if (k03.equals("reaction_by_me")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 576767044:
                    if (k03.equals("is_tried_it_proxy_comment")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 620771756:
                    if (k03.equals("helpful_count")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 650420597:
                    if (k03.equals("tagged_users")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 951621133:
                    if (k03.equals("highlighted_by_pin_owner")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case 1617880090:
                    if (k03.equals("reaction_counts")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case 2103875002:
                    if (k03.equals("comment_tag")) {
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
            nm.o oVar = this.f43139a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43888k = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr = y2Var.f43903z;
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f43148j == null) {
                        this.f43148j = a.cb.q(oVar, f30.class);
                    }
                    y2Var.f43882e = (f30) this.f43148j.c(aVar);
                    boolean[] zArr2 = y2Var.f43903z;
                    if (zArr2.length > 4) {
                        zArr2[4] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f43148j == null) {
                        this.f43148j = a.cb.q(oVar, f30.class);
                    }
                    y2Var.f43880c = (f30) this.f43148j.c(aVar);
                    boolean[] zArr3 = y2Var.f43903z;
                    if (zArr3.length > 2) {
                        zArr3[2] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43894q = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr4 = y2Var.f43903z;
                    if (zArr4.length > 16) {
                        zArr4[16] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f43143e == null) {
                        this.f43143e = a.cb.q(oVar, Integer.class);
                    }
                    y2Var.b((Integer) this.f43143e.c(aVar));
                    continue;
                case 5:
                    z13 = false;
                    if (this.f43149k == null) {
                        this.f43149k = a.cb.q(oVar, String.class);
                    }
                    y2Var.f43893p = (String) this.f43149k.c(aVar);
                    boolean[] zArr5 = y2Var.f43903z;
                    if (zArr5.length > 15) {
                        zArr5[15] = true;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    z13 = false;
                    if (this.f43144f == null) {
                        this.f43144f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$6
                        }).b();
                    }
                    y2Var.f43897t = (List) this.f43144f.c(aVar);
                    boolean[] zArr6 = y2Var.f43903z;
                    if (zArr6.length > 19) {
                        zArr6[19] = true;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    z13 = false;
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43887j = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr7 = y2Var.f43903z;
                    if (zArr7.length > 9) {
                        zArr7[9] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\b':
                    z13 = false;
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43890m = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr8 = y2Var.f43903z;
                    if (zArr8.length > 12) {
                        zArr8[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case '\t':
                    if (this.f43149k == null) {
                        this.f43149k = a.cb.q(oVar, String.class);
                    }
                    y2Var.f43878a = (String) this.f43149k.c(aVar);
                    boolean[] zArr9 = y2Var.f43903z;
                    if (zArr9.length > 0) {
                        z13 = false;
                        zArr9[0] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f43148j == null) {
                        this.f43148j = a.cb.q(oVar, f30.class);
                    }
                    y2Var.f43892o = (f30) this.f43148j.c(aVar);
                    boolean[] zArr10 = y2Var.f43903z;
                    if (zArr10.length > 14) {
                        zArr10[14] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f43145g == null) {
                        this.f43145g = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$8
                        }).b();
                    }
                    y2Var.f43899v = (List) this.f43145g.c(aVar);
                    boolean[] zArr11 = y2Var.f43903z;
                    if (zArr11.length > 21) {
                        zArr11[21] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f43149k == null) {
                        this.f43149k = a.cb.q(oVar, String.class);
                    }
                    y2Var.f43900w = (String) this.f43149k.c(aVar);
                    boolean[] zArr12 = y2Var.f43903z;
                    if (zArr12.length > 22) {
                        zArr12[22] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f43149k == null) {
                        this.f43149k = a.cb.q(oVar, String.class);
                    }
                    y2Var.f43901x = (String) this.f43149k.c(aVar);
                    boolean[] zArr13 = y2Var.f43903z;
                    if (zArr13.length > 23) {
                        zArr13[23] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f43150l == null) {
                        this.f43150l = a.cb.q(oVar, wy0.class);
                    }
                    y2Var.f43902y = (wy0) this.f43150l.c(aVar);
                    boolean[] zArr14 = y2Var.f43903z;
                    if (zArr14.length > 24) {
                        zArr14[24] = true;
                        break;
                    }
                    break;
                case 15:
                    if (this.f43141c == null) {
                        this.f43141c = a.cb.q(oVar, sd.class);
                    }
                    y2Var.f43891n = (sd) this.f43141c.c(aVar);
                    boolean[] zArr15 = y2Var.f43903z;
                    if (zArr15.length > 13) {
                        zArr15[13] = true;
                        break;
                    }
                    break;
                case 16:
                    if (this.f43143e == null) {
                        this.f43143e = a.cb.q(oVar, Integer.class);
                    }
                    y2Var.f43895r = (Integer) this.f43143e.c(aVar);
                    boolean[] zArr16 = y2Var.f43903z;
                    if (zArr16.length > 17) {
                        zArr16[17] = true;
                        break;
                    }
                    break;
                case 17:
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43889l = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr17 = y2Var.f43903z;
                    if (zArr17.length > 11) {
                        zArr17[11] = true;
                        break;
                    }
                    break;
                case 18:
                    if (this.f43143e == null) {
                        this.f43143e = a.cb.q(oVar, Integer.class);
                    }
                    y2Var.f43885h = (Integer) this.f43143e.c(aVar);
                    boolean[] zArr18 = y2Var.f43903z;
                    if (zArr18.length > 7) {
                        zArr18[7] = true;
                        break;
                    }
                    break;
                case 19:
                    if (this.f43146h == null) {
                        this.f43146h = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$7
                        }).b();
                    }
                    y2Var.f43898u = (List) this.f43146h.c(aVar);
                    boolean[] zArr19 = y2Var.f43903z;
                    if (zArr19.length > 20) {
                        zArr19[20] = true;
                        break;
                    }
                    break;
                case 20:
                    if (this.f43140b == null) {
                        this.f43140b = a.cb.q(oVar, Boolean.class);
                    }
                    y2Var.f43886i = (Boolean) this.f43140b.c(aVar);
                    boolean[] zArr20 = y2Var.f43903z;
                    if (zArr20.length > 8) {
                        zArr20[8] = true;
                        break;
                    }
                    break;
                case 21:
                    if (this.f43142d == null) {
                        this.f43142d = a.cb.q(oVar, Date.class);
                    }
                    y2Var.f43884g = (Date) this.f43142d.c(aVar);
                    boolean[] zArr21 = y2Var.f43903z;
                    if (zArr21.length > 6) {
                        zArr21[6] = true;
                        break;
                    }
                    break;
                case 22:
                    if (this.f43147i == null) {
                        this.f43147i = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$5
                        }).b();
                    }
                    y2Var.f43896s = (Map) this.f43147i.c(aVar);
                    boolean[] zArr22 = y2Var.f43903z;
                    if (zArr22.length > 18) {
                        zArr22[18] = true;
                        break;
                    }
                    break;
                case 23:
                    if (this.f43143e == null) {
                        this.f43143e = a.cb.q(oVar, Integer.class);
                    }
                    y2Var.f43883f = (Integer) this.f43143e.c(aVar);
                    boolean[] zArr23 = y2Var.f43903z;
                    if (zArr23.length > 5) {
                        zArr23[5] = true;
                        break;
                    }
                    break;
                case 24:
                    if (this.f43149k == null) {
                        this.f43149k = a.cb.q(oVar, String.class);
                    }
                    y2Var.f43879b = (String) this.f43149k.c(aVar);
                    boolean[] zArr24 = y2Var.f43903z;
                    if (zArr24.length > 1) {
                        zArr24[1] = true;
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
        return y2Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        String str;
        String str2;
        List list;
        List list2;
        List list3;
        Map map;
        Integer num;
        Boolean bool;
        String str3;
        f30 f30Var;
        sd sdVar;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Integer num2;
        Date date;
        Integer num3;
        f30 f30Var2;
        Integer num4;
        f30 f30Var3;
        String str4;
        String str5;
        z2 z2Var = (z2) obj;
        if (z2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z2Var.f44202z;
        int length = zArr.length;
        nm.o oVar = this.f43139a;
        if (length > 0 && zArr[0]) {
            if (this.f43149k == null) {
                this.f43149k = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43149k;
            um.c h10 = cVar.h("id");
            str5 = z2Var.f44177a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43149k == null) {
                this.f43149k = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43149k;
            um.c h13 = cVar.h("node_id");
            str4 = z2Var.f44178b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43148j == null) {
                this.f43148j = a.cb.q(oVar, f30.class);
            }
            nm.m mVar3 = this.f43148j;
            um.c h14 = cVar.h("attached_pin");
            f30Var3 = z2Var.f44179c;
            mVar3.e(h14, f30Var3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43143e == null) {
                this.f43143e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f43143e;
            um.c h15 = cVar.h("comment_count");
            num4 = z2Var.f44180d;
            mVar4.e(h15, num4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43148j == null) {
                this.f43148j = a.cb.q(oVar, f30.class);
            }
            nm.m mVar5 = this.f43148j;
            um.c h16 = cVar.h("comment_response_pin");
            f30Var2 = z2Var.f44181e;
            mVar5.e(h16, f30Var2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43143e == null) {
                this.f43143e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f43143e;
            um.c h17 = cVar.h("comment_tag");
            num3 = z2Var.f44182f;
            mVar6.e(h17, num3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43142d == null) {
                this.f43142d = a.cb.q(oVar, Date.class);
            }
            nm.m mVar7 = this.f43142d;
            um.c h18 = cVar.h("created_at");
            date = z2Var.f44183g;
            mVar7.e(h18, date);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43143e == null) {
                this.f43143e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f43143e;
            um.c h19 = cVar.h("helpful_count");
            num2 = z2Var.f44184h;
            mVar8.e(h19, num2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f43140b;
            um.c h23 = cVar.h("highlighted_by_pin_owner");
            bool6 = z2Var.f44185i;
            mVar9.e(h23, bool6);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f43140b;
            um.c h24 = cVar.h("is_edited");
            bool5 = z2Var.f44186j;
            mVar10.e(h24, bool5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f43140b;
            um.c h25 = cVar.h("is_translatable");
            bool4 = z2Var.f44187k;
            mVar11.e(h25, bool4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f43140b;
            um.c h26 = cVar.h("is_tried_it_proxy_comment");
            bool3 = z2Var.f44188l;
            mVar12.e(h26, bool3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f43140b;
            um.c h27 = cVar.h("marked_helpful_by_me");
            bool2 = z2Var.f44189m;
            mVar13.e(h27, bool2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f43141c == null) {
                this.f43141c = a.cb.q(oVar, sd.class);
            }
            nm.m mVar14 = this.f43141c;
            um.c h28 = cVar.h("media");
            sdVar = z2Var.f44190n;
            mVar14.e(h28, sdVar);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f43148j == null) {
                this.f43148j = a.cb.q(oVar, f30.class);
            }
            nm.m mVar15 = this.f43148j;
            um.c h29 = cVar.h("pin");
            f30Var = z2Var.f44191o;
            mVar15.e(h29, f30Var);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f43149k == null) {
                this.f43149k = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f43149k;
            um.c h33 = cVar.h("pin_id");
            str3 = z2Var.f44192p;
            mVar16.e(h33, str3);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f43140b == null) {
                this.f43140b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar17 = this.f43140b;
            um.c h34 = cVar.h("reacted_by_creator");
            bool = z2Var.f44193q;
            mVar17.e(h34, bool);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f43143e == null) {
                this.f43143e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar18 = this.f43143e;
            um.c h35 = cVar.h("reaction_by_me");
            num = z2Var.f44194r;
            mVar18.e(h35, num);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f43147i == null) {
                this.f43147i = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$1
                }).b();
            }
            nm.m mVar19 = this.f43147i;
            um.c h36 = cVar.h("reaction_counts");
            map = z2Var.f44195s;
            mVar19.e(h36, map);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f43144f == null) {
                this.f43144f = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$2
                }).b();
            }
            nm.m mVar20 = this.f43144f;
            um.c h37 = cVar.h("reply_preview_ids");
            list3 = z2Var.f44196t;
            mVar20.e(h37, list3);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f43146h == null) {
                this.f43146h = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$3
                }).b();
            }
            nm.m mVar21 = this.f43146h;
            um.c h38 = cVar.h("tagged_users");
            list2 = z2Var.f44197u;
            mVar21.e(h38, list2);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f43145g == null) {
                this.f43145g = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.AggregatedComment$AggregatedCommentTypeAdapter$4
                }).b();
            }
            nm.m mVar22 = this.f43145g;
            um.c h39 = cVar.h("tags");
            list = z2Var.f44198v;
            mVar22.e(h39, list);
        }
        if (zArr.length > 22 && zArr[22]) {
            if (this.f43149k == null) {
                this.f43149k = a.cb.q(oVar, String.class);
            }
            nm.m mVar23 = this.f43149k;
            um.c h43 = cVar.h("text");
            str2 = z2Var.f44199w;
            mVar23.e(h43, str2);
        }
        if (zArr.length > 23 && zArr[23]) {
            if (this.f43149k == null) {
                this.f43149k = a.cb.q(oVar, String.class);
            }
            nm.m mVar24 = this.f43149k;
            um.c h44 = cVar.h("type");
            str = z2Var.f44200x;
            mVar24.e(h44, str);
        }
        if (zArr.length > 24 && zArr[24]) {
            if (this.f43150l == null) {
                this.f43150l = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar25 = this.f43150l;
            um.c h45 = cVar.h("user");
            wy0Var = z2Var.f44201y;
            mVar25.e(h45, wy0Var);
        }
        cVar.g();
    }
}
