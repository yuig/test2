package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class bl0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36120a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36121b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36122c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36123d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36124e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36125f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f36126g;

    public bl0(nm.o oVar) {
        this.f36120a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        al0 al0Var = new al0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1594460595:
                    if (k03.equals("pages_preview")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1244194300:
                    if (k03.equals("is_deleted")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -804090405:
                    if (k03.equals("has_affiliate_products")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -451048365:
                    if (k03.equals("has_product_pins")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -450004177:
                    if (k03.equals("metadata")) {
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
                case 106426308:
                    if (k03.equals("pages")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 754277179:
                    if (k03.equals("eligible_for_stela")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1167754704:
                    if (k03.equals("static_page_count")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1498308178:
                    if (k03.equals("mentioned_users")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1614917471:
                    if (k03.equals("page_count")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1891395379:
                    if (k03.equals("total_video_duration")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            boolean[] zArr = al0Var.f35803m;
            nm.o oVar = this.f36120a;
            switch (c13) {
                case 0:
                    if (this.f36123d == null) {
                        this.f36123d = oVar.g(new TypeToken<List<uo0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$6
                        }).b();
                    }
                    al0Var.f35799i = (List) this.f36123d.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 1:
                    if (this.f36121b == null) {
                        this.f36121b = a.cb.q(oVar, Boolean.class);
                    }
                    al0Var.d((Boolean) this.f36121b.c(aVar));
                    break;
                case 2:
                    if (this.f36121b == null) {
                        this.f36121b = a.cb.q(oVar, Boolean.class);
                    }
                    al0Var.f35792b = (Boolean) this.f36121b.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 3:
                    if (this.f36121b == null) {
                        this.f36121b = a.cb.q(oVar, Boolean.class);
                    }
                    al0Var.f35793c = (Boolean) this.f36121b.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 4:
                    if (this.f36125f == null) {
                        this.f36125f = a.cb.q(oVar, jo0.class);
                    }
                    al0Var.f((jo0) this.f36125f.c(aVar));
                    break;
                case 5:
                    if (this.f36126g == null) {
                        this.f36126g = a.cb.q(oVar, String.class);
                    }
                    al0Var.h((String) this.f36126g.c(aVar));
                    break;
                case 6:
                    if (this.f36123d == null) {
                        this.f36123d = oVar.g(new TypeToken<List<uo0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$5
                        }).b();
                    }
                    al0Var.g((List) this.f36123d.c(aVar));
                    break;
                case 7:
                    if (this.f36121b == null) {
                        this.f36121b = a.cb.q(oVar, Boolean.class);
                    }
                    al0Var.c((Boolean) this.f36121b.c(aVar));
                    break;
                case '\b':
                    if (this.f36122c == null) {
                        this.f36122c = a.cb.q(oVar, Integer.class);
                    }
                    al0Var.f35800j = (Integer) this.f36122c.c(aVar);
                    boolean[] zArr2 = al0Var.f35803m;
                    if (zArr2.length <= 9) {
                        break;
                    } else {
                        zArr2[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f36124e == null) {
                        this.f36124e = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$4
                        }).b();
                    }
                    al0Var.e((List) this.f36124e.c(aVar));
                    break;
                case '\n':
                    if (this.f36122c == null) {
                        this.f36122c = a.cb.q(oVar, Integer.class);
                    }
                    al0Var.f35797g = (Integer) this.f36122c.c(aVar);
                    boolean[] zArr3 = al0Var.f35803m;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 11:
                    if (this.f36126g == null) {
                        this.f36126g = a.cb.q(oVar, String.class);
                    }
                    al0Var.f35801k = (String) this.f36126g.c(aVar);
                    boolean[] zArr4 = al0Var.f35803m;
                    if (zArr4.length <= 10) {
                        break;
                    } else {
                        zArr4[10] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return al0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        List list;
        List list2;
        Integer num2;
        jo0 jo0Var;
        List list3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        dl0 dl0Var = (dl0) obj;
        if (dl0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dl0Var.f36889m;
        int length = zArr.length;
        nm.o oVar = this.f36120a;
        if (length > 0 && zArr[0]) {
            if (this.f36121b == null) {
                this.f36121b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f36121b;
            um.c h10 = cVar.h("eligible_for_stela");
            bool4 = dl0Var.f36877a;
            mVar.e(h10, bool4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36121b == null) {
                this.f36121b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f36121b;
            um.c h13 = cVar.h("has_affiliate_products");
            bool3 = dl0Var.f36878b;
            mVar2.e(h13, bool3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36121b == null) {
                this.f36121b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f36121b;
            um.c h14 = cVar.h("has_product_pins");
            bool2 = dl0Var.f36879c;
            mVar3.e(h14, bool2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36121b == null) {
                this.f36121b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f36121b;
            um.c h15 = cVar.h("is_deleted");
            bool = dl0Var.f36880d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36124e == null) {
                this.f36124e = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f36124e;
            um.c h16 = cVar.h("mentioned_users");
            list3 = dl0Var.f36881e;
            mVar5.e(h16, list3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36125f == null) {
                this.f36125f = a.cb.q(oVar, jo0.class);
            }
            nm.m mVar6 = this.f36125f;
            um.c h17 = cVar.h("metadata");
            jo0Var = dl0Var.f36882f;
            mVar6.e(h17, jo0Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36122c == null) {
                this.f36122c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f36122c;
            um.c h18 = cVar.h("page_count");
            num2 = dl0Var.f36883g;
            mVar7.e(h18, num2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36123d == null) {
                this.f36123d = oVar.g(new TypeToken<List<uo0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$2
                }).b();
            }
            nm.m mVar8 = this.f36123d;
            um.c h19 = cVar.h("pages");
            list2 = dl0Var.f36884h;
            mVar8.e(h19, list2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36123d == null) {
                this.f36123d = oVar.g(new TypeToken<List<uo0>>(this) { // from class: com.pinterest.api.model.StoryPinData$StoryPinDataTypeAdapter$3
                }).b();
            }
            nm.m mVar9 = this.f36123d;
            um.c h23 = cVar.h("pages_preview");
            list = dl0Var.f36885i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36122c == null) {
                this.f36122c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f36122c;
            um.c h24 = cVar.h("static_page_count");
            num = dl0Var.f36886j;
            mVar10.e(h24, num);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36126g == null) {
                this.f36126g = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f36126g;
            um.c h25 = cVar.h("total_video_duration");
            str2 = dl0Var.f36887k;
            mVar11.e(h25, str2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36126g == null) {
                this.f36126g = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f36126g;
            um.c h26 = cVar.h("type");
            str = dl0Var.f36888l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
