package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class di0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36842a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36843b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36844c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36845d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36846e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36847f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f36848g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f36849h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f36850i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f36851j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f36852k;

    public di0(nm.o oVar) {
        this.f36842a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ci0 ci0Var = new ci0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1880722099:
                    if (k03.equals("is_auto_created")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1730642919:
                    if (k03.equals("is_promoted")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1530233576:
                    if (k03.equals("is_animated")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -995424086:
                    if (k03.equals("parent")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -295464393:
                    if (k03.equals("updated_at")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -198775986:
                    if (k03.equals("is_remixable")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -94753778:
                    if (k03.equals("tracking_params")) {
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
                case 3506402:
                    if (k03.equals("root")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 31758163:
                    if (k03.equals("source_app_type_detailed")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 53627652:
                    if (k03.equals("comments_count")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 100526016:
                    if (k03.equals("items")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 110813772:
                    if (k03.equals("is_draft")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 198196280:
                    if (k03.equals("is_local_draft")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 329079509:
                    if (k03.equals("is_pinterest_source")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 1660764568:
                    if (k03.equals("effect_data")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case 2008020787:
                    if (k03.equals("posted_at")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case 2122902474:
                    if (k03.equals("canonical_pin")) {
                        c13 = 21;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36842a;
            switch (c13) {
                case 0:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.h((Boolean) this.f36843b.c(aVar));
                    break;
                case 1:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.l((Boolean) this.f36843b.c(aVar));
                    break;
                case 2:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.g((Boolean) this.f36843b.c(aVar));
                    break;
                case 3:
                    if (this.f36847f == null) {
                        this.f36847f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$5
                        }).b();
                    }
                    ci0Var.f((Map) this.f36847f.c(aVar));
                    break;
                case 4:
                    if (this.f36850i == null) {
                        this.f36850i = a.cb.q(oVar, fi0.class);
                    }
                    ci0Var.p((fi0) this.f36850i.c(aVar));
                    break;
                case 5:
                    if (this.f36844c == null) {
                        this.f36844c = a.cb.q(oVar, Date.class);
                    }
                    ci0Var.v((Date) this.f36844c.c(aVar));
                    break;
                case 6:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.m((Boolean) this.f36843b.c(aVar));
                    break;
                case 7:
                    if (this.f36851j == null) {
                        this.f36851j = a.cb.q(oVar, String.class);
                    }
                    ci0Var.t((String) this.f36851j.c(aVar));
                    break;
                case '\b':
                    if (this.f36851j == null) {
                        this.f36851j = a.cb.q(oVar, String.class);
                    }
                    ci0Var.u((String) this.f36851j.c(aVar));
                    break;
                case '\t':
                    if (this.f36850i == null) {
                        this.f36850i = a.cb.q(oVar, fi0.class);
                    }
                    ci0Var.r((fi0) this.f36850i.c(aVar));
                    break;
                case '\n':
                    if (this.f36852k == null) {
                        this.f36852k = a.cb.q(oVar, wy0.class);
                    }
                    ci0Var.w((wy0) this.f36852k.c(aVar));
                    break;
                case 11:
                    if (this.f36845d == null) {
                        this.f36845d = a.cb.q(oVar, Integer.class);
                    }
                    ci0Var.s((Integer) this.f36845d.c(aVar));
                    break;
                case '\f':
                    if (this.f36845d == null) {
                        this.f36845d = a.cb.q(oVar, Integer.class);
                    }
                    ci0Var.c((Integer) this.f36845d.c(aVar));
                    break;
                case '\r':
                    if (this.f36846e == null) {
                        this.f36846e = oVar.g(new TypeToken<List<pi0>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$6
                        }).b();
                    }
                    ci0Var.n((List) this.f36846e.c(aVar));
                    break;
                case 14:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.i((Boolean) this.f36843b.c(aVar));
                    break;
                case 15:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.j((Boolean) this.f36843b.c(aVar));
                    break;
                case 16:
                    if (this.f36843b == null) {
                        this.f36843b = a.cb.q(oVar, Boolean.class);
                    }
                    ci0Var.k((Boolean) this.f36843b.c(aVar));
                    break;
                case 17:
                    if (this.f36844c == null) {
                        this.f36844c = a.cb.q(oVar, Date.class);
                    }
                    ci0Var.d((Date) this.f36844c.c(aVar));
                    break;
                case 18:
                    if (this.f36848g == null) {
                        this.f36848g = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$4
                        }).b();
                    }
                    ci0Var.e((Map) this.f36848g.c(aVar));
                    break;
                case 19:
                    if (this.f36844c == null) {
                        this.f36844c = a.cb.q(oVar, Date.class);
                    }
                    ci0Var.q((Date) this.f36844c.c(aVar));
                    break;
                case 20:
                    if (this.f36851j == null) {
                        this.f36851j = a.cb.q(oVar, String.class);
                    }
                    ci0Var.o((String) this.f36851j.c(aVar));
                    break;
                case 21:
                    if (this.f36849h == null) {
                        this.f36849h = a.cb.q(oVar, f30.class);
                    }
                    ci0Var.b((f30) this.f36849h.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return ci0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        Date date;
        String str;
        Integer num;
        fi0 fi0Var;
        Date date2;
        fi0 fi0Var2;
        List list;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Map map;
        Map map2;
        Date date3;
        Integer num2;
        f30 f30Var;
        String str2;
        String str3;
        fi0 fi0Var3 = (fi0) obj;
        if (fi0Var3 == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fi0Var3.f37696w;
        int length = zArr.length;
        nm.o oVar = this.f36842a;
        if (length > 0 && zArr[0]) {
            if (this.f36851j == null) {
                this.f36851j = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36851j;
            um.c h10 = cVar.h("id");
            str3 = fi0Var3.f37674a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36851j == null) {
                this.f36851j = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36851j;
            um.c h13 = cVar.h("node_id");
            str2 = fi0Var3.f37675b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36849h == null) {
                this.f36849h = a.cb.q(oVar, f30.class);
            }
            nm.m mVar3 = this.f36849h;
            um.c h14 = cVar.h("canonical_pin");
            f30Var = fi0Var3.f37676c;
            mVar3.e(h14, f30Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36845d == null) {
                this.f36845d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36845d;
            um.c h15 = cVar.h("comments_count");
            num2 = fi0Var3.f37677d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36844c == null) {
                this.f36844c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar5 = this.f36844c;
            um.c h16 = cVar.h("created_at");
            date3 = fi0Var3.f37678e;
            mVar5.e(h16, date3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36848g == null) {
                this.f36848g = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f36848g;
            um.c h17 = cVar.h("effect_data");
            map2 = fi0Var3.f37679f;
            mVar6.e(h17, map2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36847f == null) {
                this.f36847f = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f36847f;
            um.c h18 = cVar.h("images");
            map = fi0Var3.f37680g;
            mVar7.e(h18, map);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f36843b;
            um.c h19 = cVar.h("is_animated");
            bool7 = fi0Var3.f37681h;
            mVar8.e(h19, bool7);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f36843b;
            um.c h23 = cVar.h("is_auto_created");
            bool6 = fi0Var3.f37682i;
            mVar9.e(h23, bool6);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f36843b;
            um.c h24 = cVar.h("is_draft");
            bool5 = fi0Var3.f37683j;
            mVar10.e(h24, bool5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f36843b;
            um.c h25 = cVar.h("is_local_draft");
            bool4 = fi0Var3.f37684k;
            mVar11.e(h25, bool4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f36843b;
            um.c h26 = cVar.h("is_pinterest_source");
            bool3 = fi0Var3.f37685l;
            mVar12.e(h26, bool3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f36843b;
            um.c h27 = cVar.h("is_promoted");
            bool2 = fi0Var3.f37686m;
            mVar13.e(h27, bool2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f36843b == null) {
                this.f36843b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar14 = this.f36843b;
            um.c h28 = cVar.h("is_remixable");
            bool = fi0Var3.f37687n;
            mVar14.e(h28, bool);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f36846e == null) {
                this.f36846e = oVar.g(new TypeToken<List<pi0>>(this) { // from class: com.pinterest.api.model.Shuffle$ShuffleTypeAdapter$3
                }).b();
            }
            nm.m mVar15 = this.f36846e;
            um.c h29 = cVar.h("items");
            list = fi0Var3.f37688o;
            mVar15.e(h29, list);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f36850i == null) {
                this.f36850i = a.cb.q(oVar, fi0.class);
            }
            nm.m mVar16 = this.f36850i;
            um.c h33 = cVar.h("parent");
            fi0Var2 = fi0Var3.f37689p;
            mVar16.e(h33, fi0Var2);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f36844c == null) {
                this.f36844c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar17 = this.f36844c;
            um.c h34 = cVar.h("posted_at");
            date2 = fi0Var3.f37690q;
            mVar17.e(h34, date2);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f36850i == null) {
                this.f36850i = a.cb.q(oVar, fi0.class);
            }
            nm.m mVar18 = this.f36850i;
            um.c h35 = cVar.h("root");
            fi0Var = fi0Var3.f37691r;
            mVar18.e(h35, fi0Var);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f36845d == null) {
                this.f36845d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar19 = this.f36845d;
            um.c h36 = cVar.h("source_app_type_detailed");
            num = fi0Var3.f37692s;
            mVar19.e(h36, num);
        }
        if (zArr.length > 19 && zArr[19]) {
            if (this.f36851j == null) {
                this.f36851j = a.cb.q(oVar, String.class);
            }
            nm.m mVar20 = this.f36851j;
            um.c h37 = cVar.h("tracking_params");
            str = fi0Var3.f37693t;
            mVar20.e(h37, str);
        }
        if (zArr.length > 20 && zArr[20]) {
            if (this.f36844c == null) {
                this.f36844c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar21 = this.f36844c;
            um.c h38 = cVar.h("updated_at");
            date = fi0Var3.f37694u;
            mVar21.e(h38, date);
        }
        if (zArr.length > 21 && zArr[21]) {
            if (this.f36852k == null) {
                this.f36852k = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar22 = this.f36852k;
            um.c h39 = cVar.h("user");
            wy0Var = fi0Var3.f37695v;
            mVar22.e(h39, wy0Var);
        }
        cVar.g();
    }
}
