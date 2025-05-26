package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41712a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41713b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41714c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41715d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41716e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41717f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41718g;

    public rx0(nm.o oVar) {
        this.f41712a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qx0 qx0Var = new qx0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2038574657:
                    if (k03.equals("numeric_value")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -539219087:
                    if (k03.equals("search_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3594628:
                    if (k03.equals("unit")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 102727412:
                    if (k03.equals("label")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 108873975:
                    if (k03.equals("rules")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 425739203:
                    if (k03.equals("string_value")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 456541712:
                    if (k03.equals("is_selected")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1538934853:
                    if (k03.equals("aux_data")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1565553213:
                    if (k03.equals("is_verified")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            boolean[] zArr = qx0Var.f41430m;
            nm.o oVar = this.f41712a;
            switch (c13) {
                case 0:
                    if (this.f41714c == null) {
                        this.f41714c = a.cb.q(oVar, Double.class);
                    }
                    qx0Var.e((Double) this.f41714c.c(aVar));
                    break;
                case 1:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.b((String) this.f41718g.c(aVar));
                    break;
                case 2:
                    if (this.f41715d == null) {
                        this.f41715d = a.cb.q(oVar, Integer.class);
                    }
                    qx0Var.f41427j = (Integer) this.f41715d.c(aVar);
                    boolean[] zArr2 = qx0Var.f41430m;
                    if (zArr2.length <= 9) {
                        break;
                    } else {
                        zArr2[9] = true;
                        break;
                    }
                case 3:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.g((String) this.f41718g.c(aVar));
                    break;
                case 4:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.h((String) this.f41718g.c(aVar));
                    break;
                case 5:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.d((String) this.f41718g.c(aVar));
                    break;
                case 6:
                    if (this.f41716e == null) {
                        this.f41716e = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.UnifiedFilterOption$UnifiedFilterOptionTypeAdapter$4
                        }).b();
                    }
                    qx0Var.f41426i = (List) this.f41716e.c(aVar);
                    boolean[] zArr3 = qx0Var.f41430m;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 7:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.f((String) this.f41718g.c(aVar));
                    break;
                case '\b':
                    if (this.f41713b == null) {
                        this.f41713b = a.cb.q(oVar, Boolean.class);
                    }
                    qx0Var.c((Boolean) this.f41713b.c(aVar));
                    break;
                case '\t':
                    if (this.f41717f == null) {
                        this.f41717f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UnifiedFilterOption$UnifiedFilterOptionTypeAdapter$3
                        }).b();
                    }
                    qx0Var.f41420c = (Map) this.f41717f.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case '\n':
                    if (this.f41713b == null) {
                        this.f41713b = a.cb.q(oVar, Boolean.class);
                    }
                    qx0Var.f41423f = (Boolean) this.f41713b.c(aVar);
                    boolean[] zArr4 = qx0Var.f41430m;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 11:
                    if (this.f41718g == null) {
                        this.f41718g = a.cb.q(oVar, String.class);
                    }
                    qx0Var.f41419b = (String) this.f41718g.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return qx0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        List list;
        Double d2;
        String str3;
        Boolean bool;
        Boolean bool2;
        String str4;
        Map map;
        String str5;
        String str6;
        tx0 tx0Var = (tx0) obj;
        if (tx0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tx0Var.f42361m;
        int length = zArr.length;
        nm.o oVar = this.f41712a;
        if (length > 0 && zArr[0]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41718g;
            um.c h10 = cVar.h("id");
            str6 = tx0Var.f42349a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41718g;
            um.c h13 = cVar.h("node_id");
            str5 = tx0Var.f42350b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41717f == null) {
                this.f41717f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.UnifiedFilterOption$UnifiedFilterOptionTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41717f;
            um.c h14 = cVar.h("aux_data");
            map = tx0Var.f42351c;
            mVar3.e(h14, map);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41718g;
            um.c h15 = cVar.h("image_url");
            str4 = tx0Var.f42352d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41713b == null) {
                this.f41713b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f41713b;
            um.c h16 = cVar.h("is_selected");
            bool2 = tx0Var.f42353e;
            mVar5.e(h16, bool2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41713b == null) {
                this.f41713b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f41713b;
            um.c h17 = cVar.h("is_verified");
            bool = tx0Var.f42354f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41718g;
            um.c h18 = cVar.h("label");
            str3 = tx0Var.f42355g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41714c == null) {
                this.f41714c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar8 = this.f41714c;
            um.c h19 = cVar.h("numeric_value");
            d2 = tx0Var.f42356h;
            mVar8.e(h19, d2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41716e == null) {
                this.f41716e = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.UnifiedFilterOption$UnifiedFilterOptionTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f41716e;
            um.c h23 = cVar.h("rules");
            list = tx0Var.f42357i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41715d == null) {
                this.f41715d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f41715d;
            um.c h24 = cVar.h("search_type");
            num = tx0Var.f42358j;
            mVar10.e(h24, num);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f41718g;
            um.c h25 = cVar.h("string_value");
            str2 = tx0Var.f42359k;
            mVar11.e(h25, str2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41718g == null) {
                this.f41718g = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f41718g;
            um.c h26 = cVar.h("unit");
            str = tx0Var.f42360l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
