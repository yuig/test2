package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class zs0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44445a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44446b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44447c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44448d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44449e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44450f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f44451g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f44452h;

    public zs0(nm.o oVar) {
        this.f44445a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ys0 ys0Var = new ys0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1858159042:
                    if (k03.equals("publisher_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1508641311:
                    if (k03.equals("surface_header_size")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1303620827:
                    if (k03.equals("qi_cache_size")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1211889876:
                    if (k03.equals("ttl_seconds")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -883926503:
                    if (k03.equals("ad_unit_ids")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -726342928:
                    if (k03.equals("enable_header_compression")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -726339555:
                    if (k03.equals("country_allow_list")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3327206:
                    if (k03.equals("load")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 424939397:
                    if (k03.equals("qi_ttl_seconds")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 465543560:
                    if (k03.equals("country_deny_list")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 501344787:
                    if (k03.equals("surface_ad_unit_config")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 718276999:
                    if (k03.equals("surface_ad_unit_ids")) {
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
            nm.o oVar = this.f44445a;
            switch (c13) {
                case 0:
                    if (this.f44449e == null) {
                        this.f44449e = a.cb.q(oVar, String.class);
                    }
                    ys0Var.f44112h = (String) this.f44449e.c(aVar);
                    boolean[] zArr = ys0Var.f44119o;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f44452h == null) {
                        this.f44452h = a.cb.q(oVar, rt0.class);
                    }
                    ys0Var.f44117m = (rt0) this.f44452h.c(aVar);
                    boolean[] zArr2 = ys0Var.f44119o;
                    if (zArr2.length <= 12) {
                        break;
                    } else {
                        zArr2[12] = true;
                        break;
                    }
                case 2:
                    if (this.f44447c == null) {
                        this.f44447c = a.cb.q(oVar, Integer.class);
                    }
                    ys0Var.f44113i = (Integer) this.f44447c.c(aVar);
                    boolean[] zArr3 = ys0Var.f44119o;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 3:
                    if (this.f44447c == null) {
                        this.f44447c = a.cb.q(oVar, Integer.class);
                    }
                    ys0Var.f44118n = (Integer) this.f44447c.c(aVar);
                    boolean[] zArr4 = ys0Var.f44119o;
                    if (zArr4.length <= 13) {
                        break;
                    } else {
                        zArr4[13] = true;
                        break;
                    }
                case 4:
                    if (this.f44448d == null) {
                        this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$4
                        }).b();
                    }
                    ys0Var.f44107c = (List) this.f44448d.c(aVar);
                    boolean[] zArr5 = ys0Var.f44119o;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f44446b == null) {
                        this.f44446b = a.cb.q(oVar, Boolean.class);
                    }
                    ys0Var.f44110f = (Boolean) this.f44446b.c(aVar);
                    boolean[] zArr6 = ys0Var.f44119o;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f44448d == null) {
                        this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$5
                        }).b();
                    }
                    ys0Var.f44108d = (List) this.f44448d.c(aVar);
                    boolean[] zArr7 = ys0Var.f44119o;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case 7:
                    if (this.f44449e == null) {
                        this.f44449e = a.cb.q(oVar, String.class);
                    }
                    ys0Var.f44105a = (String) this.f44449e.c(aVar);
                    boolean[] zArr8 = ys0Var.f44119o;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                case '\b':
                    if (this.f44446b == null) {
                        this.f44446b = a.cb.q(oVar, Boolean.class);
                    }
                    ys0Var.f44111g = (Boolean) this.f44446b.c(aVar);
                    boolean[] zArr9 = ys0Var.f44119o;
                    if (zArr9.length <= 6) {
                        break;
                    } else {
                        zArr9[6] = true;
                        break;
                    }
                case '\t':
                    if (this.f44447c == null) {
                        this.f44447c = a.cb.q(oVar, Integer.class);
                    }
                    ys0Var.f44114j = (Integer) this.f44447c.c(aVar);
                    boolean[] zArr10 = ys0Var.f44119o;
                    if (zArr10.length <= 9) {
                        break;
                    } else {
                        zArr10[9] = true;
                        break;
                    }
                case '\n':
                    if (this.f44448d == null) {
                        this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$6
                        }).b();
                    }
                    ys0Var.f44109e = (List) this.f44448d.c(aVar);
                    boolean[] zArr11 = ys0Var.f44119o;
                    if (zArr11.length <= 4) {
                        break;
                    } else {
                        zArr11[4] = true;
                        break;
                    }
                case 11:
                    if (this.f44450f == null) {
                        this.f44450f = a.cb.q(oVar, jt0.class);
                    }
                    ys0Var.f44115k = (jt0) this.f44450f.c(aVar);
                    boolean[] zArr12 = ys0Var.f44119o;
                    if (zArr12.length <= 10) {
                        break;
                    } else {
                        zArr12[10] = true;
                        break;
                    }
                case '\f':
                    if (this.f44451g == null) {
                        this.f44451g = a.cb.q(oVar, nt0.class);
                    }
                    ys0Var.f44116l = (nt0) this.f44451g.c(aVar);
                    boolean[] zArr13 = ys0Var.f44119o;
                    if (zArr13.length <= 11) {
                        break;
                    } else {
                        zArr13[11] = true;
                        break;
                    }
                case '\r':
                    if (this.f44449e == null) {
                        this.f44449e = a.cb.q(oVar, String.class);
                    }
                    ys0Var.f44106b = (String) this.f44449e.c(aVar);
                    boolean[] zArr14 = ys0Var.f44119o;
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
        return new bt0(ys0Var.f44105a, ys0Var.f44106b, ys0Var.f44107c, ys0Var.f44108d, ys0Var.f44109e, ys0Var.f44110f, ys0Var.f44111g, ys0Var.f44112h, ys0Var.f44113i, ys0Var.f44114j, ys0Var.f44115k, ys0Var.f44116l, ys0Var.f44117m, ys0Var.f44118n, ys0Var.f44119o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        rt0 rt0Var;
        nt0 nt0Var;
        jt0 jt0Var;
        Integer num2;
        Integer num3;
        String str;
        Boolean bool;
        Boolean bool2;
        List list;
        List list2;
        List list3;
        String str2;
        String str3;
        bt0 bt0Var = (bt0) obj;
        if (bt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bt0Var.f36203o;
        int length = zArr.length;
        nm.o oVar = this.f44445a;
        if (length > 0 && zArr[0]) {
            if (this.f44449e == null) {
                this.f44449e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44449e;
            um.c h10 = cVar.h("id");
            str3 = bt0Var.f36189a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44449e == null) {
                this.f44449e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44449e;
            um.c h13 = cVar.h("node_id");
            str2 = bt0Var.f36190b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44448d == null) {
                this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f44448d;
            um.c h14 = cVar.h("ad_unit_ids");
            list3 = bt0Var.f36191c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44448d == null) {
                this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f44448d;
            um.c h15 = cVar.h("country_allow_list");
            list2 = bt0Var.f36192d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44448d == null) {
                this.f44448d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigGma$ThirdPartyAdConfigGmaTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f44448d;
            um.c h16 = cVar.h("country_deny_list");
            list = bt0Var.f36193e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44446b == null) {
                this.f44446b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f44446b;
            um.c h17 = cVar.h("enable_header_compression");
            bool2 = bt0Var.f36194f;
            mVar6.e(h17, bool2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44446b == null) {
                this.f44446b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f44446b;
            um.c h18 = cVar.h("load");
            bool = bt0Var.f36195g;
            mVar7.e(h18, bool);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44449e == null) {
                this.f44449e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f44449e;
            um.c h19 = cVar.h("publisher_id");
            str = bt0Var.f36196h;
            mVar8.e(h19, str);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44447c == null) {
                this.f44447c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f44447c;
            um.c h23 = cVar.h("qi_cache_size");
            num3 = bt0Var.f36197i;
            mVar9.e(h23, num3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f44447c == null) {
                this.f44447c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f44447c;
            um.c h24 = cVar.h("qi_ttl_seconds");
            num2 = bt0Var.f36198j;
            mVar10.e(h24, num2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f44450f == null) {
                this.f44450f = a.cb.q(oVar, jt0.class);
            }
            nm.m mVar11 = this.f44450f;
            um.c h25 = cVar.h("surface_ad_unit_config");
            jt0Var = bt0Var.f36199k;
            mVar11.e(h25, jt0Var);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f44451g == null) {
                this.f44451g = a.cb.q(oVar, nt0.class);
            }
            nm.m mVar12 = this.f44451g;
            um.c h26 = cVar.h("surface_ad_unit_ids");
            nt0Var = bt0Var.f36200l;
            mVar12.e(h26, nt0Var);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f44452h == null) {
                this.f44452h = a.cb.q(oVar, rt0.class);
            }
            nm.m mVar13 = this.f44452h;
            um.c h27 = cVar.h("surface_header_size");
            rt0Var = bt0Var.f36201m;
            mVar13.e(h27, rt0Var);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f44447c == null) {
                this.f44447c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar14 = this.f44447c;
            um.c h28 = cVar.h("ttl_seconds");
            num = bt0Var.f36202n;
            mVar14.e(h28, num);
        }
        cVar.g();
    }
}
