package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.pi0;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qi0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41304a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41305b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41306c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41307d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41308e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41309f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41310g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41311h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41312i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f41313j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f41314k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f41315l;

    public qi0(nm.o oVar) {
        this.f41304a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        oi0 oi0Var = new oi0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2141142810:
                    if (k03.equals("item_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1689872729:
                    if (k03.equals("template_config")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1019779949:
                    if (k03.equals("offset")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -40300674:
                    if (k03.equals("rotation")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3344108:
                    if (k03.equals("mask")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 109250890:
                    if (k03.equals("scale")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 328316458:
                    if (k03.equals("shuffle_asset")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1660764568:
                    if (k03.equals("effect_data")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1783748149:
                    if (k03.equals("shuffle_item_image")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41304a;
            switch (c13) {
                case 0:
                    if (this.f41312i == null) {
                        this.f41312i = a.cb.q(oVar, pi0.a.class);
                    }
                    oi0Var.f40735e = (pi0.a) this.f41312i.c(aVar);
                    boolean[] zArr = oi0Var.f40745o;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f41313j == null) {
                        this.f41313j = a.cb.q(oVar, zi0.class);
                    }
                    oi0Var.f40743m = (zi0) this.f41313j.c(aVar);
                    boolean[] zArr2 = oi0Var.f40745o;
                    if (zArr2.length <= 12) {
                        break;
                    } else {
                        zArr2[12] = true;
                        break;
                    }
                case 2:
                    if (this.f41307d == null) {
                        this.f41307d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$5
                        }).b();
                    }
                    oi0Var.f40734d = (Map) this.f41307d.c(aVar);
                    boolean[] zArr3 = oi0Var.f40745o;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f41306c == null) {
                        this.f41306c = oVar.g(new TypeToken<List<Object>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$6
                        }).b();
                    }
                    oi0Var.f40737g = (List) this.f41306c.c(aVar);
                    boolean[] zArr4 = oi0Var.f40745o;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f41305b == null) {
                        this.f41305b = a.cb.q(oVar, Double.class);
                    }
                    oi0Var.f40739i = (Double) this.f41305b.c(aVar);
                    boolean[] zArr5 = oi0Var.f40745o;
                    if (zArr5.length <= 8) {
                        break;
                    } else {
                        zArr5[8] = true;
                        break;
                    }
                case 5:
                    if (this.f41315l == null) {
                        this.f41315l = a.cb.q(oVar, String.class);
                    }
                    oi0Var.f40731a = (String) this.f41315l.c(aVar);
                    boolean[] zArr6 = oi0Var.f40745o;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f41309f == null) {
                        this.f41309f = a.cb.q(oVar, f30.class);
                    }
                    oi0Var.f40738h = (f30) this.f41309f.c(aVar);
                    boolean[] zArr7 = oi0Var.f40745o;
                    if (zArr7.length <= 7) {
                        break;
                    } else {
                        zArr7[7] = true;
                        break;
                    }
                case 7:
                    if (this.f41315l == null) {
                        this.f41315l = a.cb.q(oVar, String.class);
                    }
                    oi0Var.f40736f = (String) this.f41315l.c(aVar);
                    boolean[] zArr8 = oi0Var.f40745o;
                    if (zArr8.length <= 5) {
                        break;
                    } else {
                        zArr8[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f41314k == null) {
                        this.f41314k = a.cb.q(oVar, dj0.class);
                    }
                    oi0Var.f40744n = (dj0) this.f41314k.c(aVar);
                    boolean[] zArr9 = oi0Var.f40745o;
                    if (zArr9.length <= 13) {
                        break;
                    } else {
                        zArr9[13] = true;
                        break;
                    }
                case '\t':
                    if (this.f41305b == null) {
                        this.f41305b = a.cb.q(oVar, Double.class);
                    }
                    oi0Var.f40740j = (Double) this.f41305b.c(aVar);
                    boolean[] zArr10 = oi0Var.f40745o;
                    if (zArr10.length <= 9) {
                        break;
                    } else {
                        zArr10[9] = true;
                        break;
                    }
                case '\n':
                    if (this.f41310g == null) {
                        this.f41310g = a.cb.q(oVar, hi0.class);
                    }
                    oi0Var.f40741k = (hi0) this.f41310g.c(aVar);
                    boolean[] zArr11 = oi0Var.f40745o;
                    if (zArr11.length <= 10) {
                        break;
                    } else {
                        zArr11[10] = true;
                        break;
                    }
                case 11:
                    if (this.f41308e == null) {
                        this.f41308e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$4
                        }).b();
                    }
                    oi0Var.f40733c = (Map) this.f41308e.c(aVar);
                    boolean[] zArr12 = oi0Var.f40745o;
                    if (zArr12.length <= 2) {
                        break;
                    } else {
                        zArr12[2] = true;
                        break;
                    }
                case '\f':
                    if (this.f41311h == null) {
                        this.f41311h = a.cb.q(oVar, vi0.class);
                    }
                    oi0Var.f40742l = (vi0) this.f41311h.c(aVar);
                    boolean[] zArr13 = oi0Var.f40745o;
                    if (zArr13.length <= 11) {
                        break;
                    } else {
                        zArr13[11] = true;
                        break;
                    }
                case '\r':
                    if (this.f41315l == null) {
                        this.f41315l = a.cb.q(oVar, String.class);
                    }
                    oi0Var.f40732b = (String) this.f41315l.c(aVar);
                    boolean[] zArr14 = oi0Var.f40745o;
                    if (zArr14.length <= 1) {
                        break;
                    } else {
                        zArr14[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new pi0(oi0Var.f40731a, oi0Var.f40732b, oi0Var.f40733c, oi0Var.f40734d, oi0Var.f40735e, oi0Var.f40736f, oi0Var.f40737g, oi0Var.f40738h, oi0Var.f40739i, oi0Var.f40740j, oi0Var.f40741k, oi0Var.f40742l, oi0Var.f40743m, oi0Var.f40744n, oi0Var.f40745o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        dj0 dj0Var;
        zi0 zi0Var;
        vi0 vi0Var;
        hi0 hi0Var;
        Double d2;
        Double d13;
        f30 f30Var;
        List list;
        String str;
        pi0.a aVar;
        Map map;
        Map map2;
        String str2;
        String str3;
        pi0 pi0Var = (pi0) obj;
        if (pi0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pi0Var.f41008o;
        int length = zArr.length;
        nm.o oVar = this.f41304a;
        if (length > 0 && zArr[0]) {
            if (this.f41315l == null) {
                this.f41315l = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41315l;
            um.c h10 = cVar.h("id");
            str3 = pi0Var.f40994a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41315l == null) {
                this.f41315l = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41315l;
            um.c h13 = cVar.h("node_id");
            str2 = pi0Var.f40995b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41308e == null) {
                this.f41308e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41308e;
            um.c h14 = cVar.h("effect_data");
            map2 = pi0Var.f40996c;
            mVar3.e(h14, map2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41307d == null) {
                this.f41307d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f41307d;
            um.c h15 = cVar.h("images");
            map = pi0Var.f40997d;
            mVar4.e(h15, map);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41312i == null) {
                this.f41312i = a.cb.q(oVar, pi0.a.class);
            }
            nm.m mVar5 = this.f41312i;
            um.c h16 = cVar.h("item_type");
            aVar = pi0Var.f40998e;
            mVar5.e(h16, aVar);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41315l == null) {
                this.f41315l = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41315l;
            um.c h17 = cVar.h("mask");
            str = pi0Var.f40999f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41306c == null) {
                this.f41306c = oVar.g(new TypeToken<List<Object>>(this) { // from class: com.pinterest.api.model.ShuffleItem$ShuffleItemTypeAdapter$3
                }).b();
            }
            nm.m mVar7 = this.f41306c;
            um.c h18 = cVar.h("offset");
            list = pi0Var.f41000g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41309f == null) {
                this.f41309f = a.cb.q(oVar, f30.class);
            }
            nm.m mVar8 = this.f41309f;
            um.c h19 = cVar.h("pin");
            f30Var = pi0Var.f41001h;
            mVar8.e(h19, f30Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41305b == null) {
                this.f41305b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f41305b;
            um.c h23 = cVar.h("rotation");
            d13 = pi0Var.f41002i;
            mVar9.e(h23, d13);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41305b == null) {
                this.f41305b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f41305b;
            um.c h24 = cVar.h("scale");
            d2 = pi0Var.f41003j;
            mVar10.e(h24, d2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41310g == null) {
                this.f41310g = a.cb.q(oVar, hi0.class);
            }
            nm.m mVar11 = this.f41310g;
            um.c h25 = cVar.h("shuffle_asset");
            hi0Var = pi0Var.f41004k;
            mVar11.e(h25, hi0Var);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41311h == null) {
                this.f41311h = a.cb.q(oVar, vi0.class);
            }
            nm.m mVar12 = this.f41311h;
            um.c h26 = cVar.h("shuffle_item_image");
            vi0Var = pi0Var.f41005l;
            mVar12.e(h26, vi0Var);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f41313j == null) {
                this.f41313j = a.cb.q(oVar, zi0.class);
            }
            nm.m mVar13 = this.f41313j;
            um.c h27 = cVar.h("template_config");
            zi0Var = pi0Var.f41006m;
            mVar13.e(h27, zi0Var);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f41314k == null) {
                this.f41314k = a.cb.q(oVar, dj0.class);
            }
            nm.m mVar14 = this.f41314k;
            um.c h28 = cVar.h("text");
            dj0Var = pi0Var.f41007n;
            mVar14.e(h28, dj0Var);
        }
        cVar.g();
    }
}
