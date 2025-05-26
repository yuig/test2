package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40343a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40344b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40345c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40346d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40347e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40348f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40349g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f40350h;

    public n80(nm.o oVar) {
        this.f40343a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        m80 m80Var = new m80(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2001707632:
                    if (k03.equals("additional_images")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -395888444:
                    if (k03.equals("item_set_id")) {
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
                case 102977465:
                    if (k03.equals("links")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 204595792:
                    if (k03.equals("merchant_item_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 304936141:
                    if (k03.equals("merchant_item_set_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 414334925:
                    if (k03.equals("dimensions")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 543071391:
                    if (k03.equals("shipping_info")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1409305795:
                    if (k03.equals("offer_summary")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1451773609:
                    if (k03.equals("is_preselected")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1523899840:
                    if (k03.equals("checkout_token")) {
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
                case 2116204999:
                    if (k03.equals("item_id")) {
                        c13 = 14;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40343a;
            switch (c13) {
                case 0:
                    z13 = false;
                    if (this.f40345c == null) {
                        this.f40345c = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$4
                        }).b();
                    }
                    m80Var.f40023c = (List) this.f40345c.c(aVar);
                    boolean[] zArr = m80Var.f40036p;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40033m = (String) this.f40350h.c(aVar);
                    boolean[] zArr2 = m80Var.f40036p;
                    if (zArr2.length > 12) {
                        zArr2[12] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40028h = (String) this.f40350h.c(aVar);
                    boolean[] zArr3 = m80Var.f40036p;
                    if (zArr3.length > 7) {
                        zArr3[7] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40021a = (String) this.f40350h.c(aVar);
                    boolean[] zArr4 = m80Var.f40036p;
                    if (zArr4.length > 0) {
                        z13 = false;
                        zArr4[0] = true;
                        break;
                    }
                    break;
                case 4:
                    if (this.f40346d == null) {
                        this.f40346d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$6
                        }).b();
                    }
                    m80Var.f40029i = (List) this.f40346d.c(aVar);
                    boolean[] zArr5 = m80Var.f40036p;
                    if (zArr5.length > 8) {
                        zArr5[8] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40035o = (String) this.f40350h.c(aVar);
                    boolean[] zArr6 = m80Var.f40036p;
                    if (zArr6.length > 14) {
                        zArr6[14] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40030j = (String) this.f40350h.c(aVar);
                    boolean[] zArr7 = m80Var.f40036p;
                    if (zArr7.length > 9) {
                        zArr7[9] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40031k = (String) this.f40350h.c(aVar);
                    boolean[] zArr8 = m80Var.f40036p;
                    if (zArr8.length > 10) {
                        zArr8[10] = true;
                        break;
                    }
                    break;
                case '\b':
                    if (this.f40347e == null) {
                        this.f40347e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$5
                        }).b();
                    }
                    m80Var.f40025e = (Map) this.f40347e.c(aVar);
                    boolean[] zArr9 = m80Var.f40036p;
                    if (zArr9.length > 4) {
                        zArr9[4] = true;
                        break;
                    }
                    break;
                case '\t':
                    if (this.f40349g == null) {
                        this.f40349g = a.cb.q(oVar, xh0.class);
                    }
                    m80Var.f40034n = (xh0) this.f40349g.c(aVar);
                    boolean[] zArr10 = m80Var.f40036p;
                    if (zArr10.length > 13) {
                        zArr10[13] = true;
                        break;
                    }
                    break;
                case '\n':
                    if (this.f40348f == null) {
                        this.f40348f = a.cb.q(oVar, wz.class);
                    }
                    m80Var.f40032l = (wz) this.f40348f.c(aVar);
                    boolean[] zArr11 = m80Var.f40036p;
                    if (zArr11.length > 11) {
                        zArr11[11] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f40344b == null) {
                        this.f40344b = a.cb.q(oVar, Boolean.class);
                    }
                    m80Var.f40026f = (Boolean) this.f40344b.c(aVar);
                    boolean[] zArr12 = m80Var.f40036p;
                    if (zArr12.length > 5) {
                        zArr12[5] = true;
                        break;
                    }
                    break;
                case '\f':
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40024d = (String) this.f40350h.c(aVar);
                    boolean[] zArr13 = m80Var.f40036p;
                    if (zArr13.length > 3) {
                        zArr13[3] = true;
                        break;
                    }
                    break;
                case '\r':
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40022b = (String) this.f40350h.c(aVar);
                    boolean[] zArr14 = m80Var.f40036p;
                    if (zArr14.length > 1) {
                        zArr14[1] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f40350h == null) {
                        this.f40350h = a.cb.q(oVar, String.class);
                    }
                    m80Var.f40027g = (String) this.f40350h.c(aVar);
                    boolean[] zArr15 = m80Var.f40036p;
                    if (zArr15.length > 6) {
                        zArr15[6] = true;
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
        return new p80(m80Var.f40021a, m80Var.f40022b, m80Var.f40023c, m80Var.f40024d, m80Var.f40025e, m80Var.f40026f, m80Var.f40027g, m80Var.f40028h, m80Var.f40029i, m80Var.f40030j, m80Var.f40031k, m80Var.f40032l, m80Var.f40033m, m80Var.f40034n, m80Var.f40035o, m80Var.f40036p, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        xh0 xh0Var;
        String str2;
        wz wzVar;
        String str3;
        String str4;
        List list;
        String str5;
        String str6;
        Boolean bool;
        Map map;
        String str7;
        List list2;
        String str8;
        String str9;
        p80 p80Var = (p80) obj;
        if (p80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = p80Var.f40916p;
        int length = zArr.length;
        nm.o oVar = this.f40343a;
        if (length > 0 && zArr[0]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40350h;
            um.c h10 = cVar.h("id");
            str9 = p80Var.f40901a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40350h;
            um.c h13 = cVar.h("node_id");
            str8 = p80Var.f40902b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40345c == null) {
                this.f40345c = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f40345c;
            um.c h14 = cVar.h("additional_images");
            list2 = p80Var.f40903c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40350h;
            um.c h15 = cVar.h("checkout_token");
            str7 = p80Var.f40904d;
            mVar4.e(h15, str7);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40347e == null) {
                this.f40347e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f40347e;
            um.c h16 = cVar.h("dimensions");
            map = p80Var.f40905e;
            mVar5.e(h16, map);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40344b == null) {
                this.f40344b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f40344b;
            um.c h17 = cVar.h("is_preselected");
            bool = p80Var.f40906f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40350h;
            um.c h18 = cVar.h("item_id");
            str6 = p80Var.f40907g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f40350h;
            um.c h19 = cVar.h("item_set_id");
            str5 = p80Var.f40908h;
            mVar8.e(h19, str5);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40346d == null) {
                this.f40346d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ProductVariant$ProductVariantTypeAdapter$3
                }).b();
            }
            nm.m mVar9 = this.f40346d;
            um.c h23 = cVar.h("links");
            list = p80Var.f40909i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f40350h;
            um.c h24 = cVar.h("merchant_item_id");
            str4 = p80Var.f40910j;
            mVar10.e(h24, str4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f40350h;
            um.c h25 = cVar.h("merchant_item_set_id");
            str3 = p80Var.f40911k;
            mVar11.e(h25, str3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40348f == null) {
                this.f40348f = a.cb.q(oVar, wz.class);
            }
            nm.m mVar12 = this.f40348f;
            um.c h26 = cVar.h("offer_summary");
            wzVar = p80Var.f40912l;
            mVar12.e(h26, wzVar);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f40350h;
            um.c h27 = cVar.h("pin_id");
            str2 = p80Var.f40913m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f40349g == null) {
                this.f40349g = a.cb.q(oVar, xh0.class);
            }
            nm.m mVar14 = this.f40349g;
            um.c h28 = cVar.h("shipping_info");
            xh0Var = p80Var.f40914n;
            mVar14.e(h28, xh0Var);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f40350h == null) {
                this.f40350h = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f40350h;
            um.c h29 = cVar.h("title");
            str = p80Var.f40915o;
            mVar15.e(h29, str);
        }
        cVar.g();
    }
}
