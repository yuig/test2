package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class me0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40078a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40079b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40080c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40081d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40082e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40083f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40084g;

    public me0(nm.o oVar) {
        this.f40078a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        le0 le0Var = new le0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2120607484:
                    if (k03.equals("mobile_app")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1107912085:
                    if (k03.equals("is_product_pin_v2")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1097462182:
                    if (k03.equals("locale")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1033514171:
                    if (k03.equals("favicon_link")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1003761308:
                    if (k03.equals("products")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -934914674:
                    if (k03.equals("recipe")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -732377866:
                    if (k03.equals("article")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -533477245:
                    if (k03.equals("site_name")) {
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
                case 116079:
                    if (k03.equals("url")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 7343131:
                    if (k03.equals("apple_touch_icon_link")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
            }
            boolean[] zArr = le0Var.f39735n;
            nm.o oVar = this.f40078a;
            switch (c13) {
                case 0:
                    if (this.f40082e == null) {
                        this.f40082e = a.cb.q(oVar, zv.class);
                    }
                    le0Var.f39729h = (zv) this.f40082e.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f40080c == null) {
                        this.f40080c = a.cb.q(oVar, Boolean.class);
                    }
                    le0Var.b((Boolean) this.f40080c.c(aVar));
                    break;
                case 2:
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39728g = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 3:
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39726e = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 4:
                    if (this.f40081d == null) {
                        this.f40081d = oVar.g(new TypeToken<List<h80>>(this) { // from class: com.pinterest.api.model.RichMetadata$RichMetadataTypeAdapter$2
                        }).b();
                    }
                    le0Var.d((List) this.f40081d.c(aVar));
                    break;
                case 5:
                    if (this.f40083f == null) {
                        this.f40083f = a.cb.q(oVar, kc0.class);
                    }
                    le0Var.e((kc0) this.f40083f.c(aVar));
                    break;
                case 6:
                    if (this.f40079b == null) {
                        this.f40079b = a.cb.q(oVar, t6.class);
                    }
                    le0Var.f39725d = (t6) this.f40079b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 7:
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39732k = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case '\b':
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39722a = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case '\t':
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39734m = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case '\n':
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39724c = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 11:
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.f39733l = (String) this.f40084g.c(aVar);
                    if (zArr.length <= 11) {
                        break;
                    } else {
                        zArr[11] = true;
                        break;
                    }
                case '\f':
                    if (this.f40084g == null) {
                        this.f40084g = a.cb.q(oVar, String.class);
                    }
                    le0Var.c((String) this.f40084g.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return le0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        kc0 kc0Var;
        List list;
        zv zvVar;
        String str4;
        Boolean bool;
        String str5;
        t6 t6Var;
        String str6;
        String str7;
        String str8;
        oe0 oe0Var = (oe0) obj;
        if (oe0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = oe0Var.f40697n;
        int length = zArr.length;
        nm.o oVar = this.f40078a;
        if (length > 0 && zArr[0]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40084g;
            um.c h10 = cVar.h("id");
            str8 = oe0Var.f40684a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40084g;
            um.c h13 = cVar.h("node_id");
            str7 = oe0Var.f40685b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40084g;
            um.c h14 = cVar.h("apple_touch_icon_link");
            str6 = oe0Var.f40686c;
            mVar3.e(h14, str6);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40079b == null) {
                this.f40079b = a.cb.q(oVar, t6.class);
            }
            nm.m mVar4 = this.f40079b;
            um.c h15 = cVar.h("article");
            t6Var = oe0Var.f40687d;
            mVar4.e(h15, t6Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40084g;
            um.c h16 = cVar.h("favicon_link");
            str5 = oe0Var.f40688e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40080c == null) {
                this.f40080c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f40080c;
            um.c h17 = cVar.h("is_product_pin_v2");
            bool = oe0Var.f40689f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40084g;
            um.c h18 = cVar.h("locale");
            str4 = oe0Var.f40690g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40082e == null) {
                this.f40082e = a.cb.q(oVar, zv.class);
            }
            nm.m mVar8 = this.f40082e;
            um.c h19 = cVar.h("mobile_app");
            zvVar = oe0Var.f40691h;
            mVar8.e(h19, zvVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40081d == null) {
                this.f40081d = oVar.g(new TypeToken<List<h80>>(this) { // from class: com.pinterest.api.model.RichMetadata$RichMetadataTypeAdapter$1
                }).b();
            }
            nm.m mVar9 = this.f40081d;
            um.c h23 = cVar.h("products");
            list = oe0Var.f40692i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40083f == null) {
                this.f40083f = a.cb.q(oVar, kc0.class);
            }
            nm.m mVar10 = this.f40083f;
            um.c h24 = cVar.h("recipe");
            kc0Var = oe0Var.f40693j;
            mVar10.e(h24, kc0Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f40084g;
            um.c h25 = cVar.h("site_name");
            str3 = oe0Var.f40694k;
            mVar11.e(h25, str3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f40084g;
            um.c h26 = cVar.h("title");
            str2 = oe0Var.f40695l;
            mVar12.e(h26, str2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40084g == null) {
                this.f40084g = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f40084g;
            um.c h27 = cVar.h("url");
            str = oe0Var.f40696m;
            mVar13.e(h27, str);
        }
        cVar.g();
    }
}
