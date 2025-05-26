package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class f80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37591a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37592b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37593c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37594d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37595e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37596f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f37597g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f37598h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f37599i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f37600j;

    public f80(nm.o oVar) {
        this.f37591a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        e80 e80Var = new e80(0);
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
                case -1600900696:
                    if (k03.equals("variant_set")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1116727452:
                    if (k03.equals("merchant_id_str")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1019793001:
                    if (k03.equals("offers")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -816678056:
                    if (k03.equals("videos")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 93997959:
                    if (k03.equals("brand")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 543071391:
                    if (k03.equals("shipping_info")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 766686014:
                    if (k03.equals("expiration_date")) {
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
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            boolean[] zArr = e80Var.f37217m;
            nm.o oVar = this.f37591a;
            switch (c13) {
                case 0:
                    if (this.f37595e == null) {
                        this.f37595e = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$4
                        }).b();
                    }
                    e80Var.f37207c = (List) this.f37595e.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f37598h == null) {
                        this.f37598h = a.cb.q(oVar, t80.class);
                    }
                    e80Var.f37215k = (t80) this.f37598h.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case 2:
                    if (this.f37600j == null) {
                        this.f37600j = a.cb.q(oVar, String.class);
                    }
                    e80Var.f37210f = (String) this.f37600j.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 3:
                    if (this.f37594d == null) {
                        this.f37594d = oVar.g(new TypeToken<List<wz>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$5
                        }).b();
                    }
                    e80Var.f37213i = (List) this.f37594d.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 4:
                    if (this.f37596f == null) {
                        this.f37596f = oVar.g(new TypeToken<List<b01>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$6
                        }).b();
                    }
                    e80Var.f37216l = (List) this.f37596f.c(aVar);
                    if (zArr.length <= 11) {
                        break;
                    } else {
                        zArr[11] = true;
                        break;
                    }
                case 5:
                    if (this.f37600j == null) {
                        this.f37600j = a.cb.q(oVar, String.class);
                    }
                    e80Var.f37205a = (String) this.f37600j.c(aVar);
                    boolean[] zArr2 = e80Var.f37217m;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 6:
                    if (this.f37600j == null) {
                        this.f37600j = a.cb.q(oVar, String.class);
                    }
                    e80Var.f37211g = (String) this.f37600j.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 7:
                    if (this.f37592b == null) {
                        this.f37592b = a.cb.q(oVar, cb.class);
                    }
                    e80Var.f37208d = (cb) this.f37592b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f37599i == null) {
                        this.f37599i = a.cb.q(oVar, xh0.class);
                    }
                    e80Var.f37214j = (xh0) this.f37599i.c(aVar);
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f37593c == null) {
                        this.f37593c = a.cb.q(oVar, Date.class);
                    }
                    e80Var.f37209e = (Date) this.f37593c.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case '\n':
                    if (this.f37597g == null) {
                        this.f37597g = a.cb.q(oVar, wz.class);
                    }
                    e80Var.f37212h = (wz) this.f37597g.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 11:
                    if (this.f37600j == null) {
                        this.f37600j = a.cb.q(oVar, String.class);
                    }
                    e80Var.f37206b = (String) this.f37600j.c(aVar);
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
        return e80Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        t80 t80Var;
        xh0 xh0Var;
        List list2;
        wz wzVar;
        String str;
        String str2;
        Date date;
        cb cbVar;
        List list3;
        String str3;
        String str4;
        h80 h80Var = (h80) obj;
        if (h80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = h80Var.f38345m;
        int length = zArr.length;
        nm.o oVar = this.f37591a;
        if (length > 0 && zArr[0]) {
            if (this.f37600j == null) {
                this.f37600j = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37600j;
            um.c h10 = cVar.h("id");
            str4 = h80Var.f38333a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37600j == null) {
                this.f37600j = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37600j;
            um.c h13 = cVar.h("node_id");
            str3 = h80Var.f38334b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37595e == null) {
                this.f37595e = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f37595e;
            um.c h14 = cVar.h("additional_images");
            list3 = h80Var.f38335c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37592b == null) {
                this.f37592b = a.cb.q(oVar, cb.class);
            }
            nm.m mVar4 = this.f37592b;
            um.c h15 = cVar.h("brand");
            cbVar = h80Var.f38336d;
            mVar4.e(h15, cbVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37593c == null) {
                this.f37593c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar5 = this.f37593c;
            um.c h16 = cVar.h("expiration_date");
            date = h80Var.f38337e;
            mVar5.e(h16, date);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37600j == null) {
                this.f37600j = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37600j;
            um.c h17 = cVar.h("merchant_id_str");
            str2 = h80Var.f38338f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37600j == null) {
                this.f37600j = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f37600j;
            um.c h18 = cVar.h("name");
            str = h80Var.f38339g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37597g == null) {
                this.f37597g = a.cb.q(oVar, wz.class);
            }
            nm.m mVar8 = this.f37597g;
            um.c h19 = cVar.h("offer_summary");
            wzVar = h80Var.f38340h;
            mVar8.e(h19, wzVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37594d == null) {
                this.f37594d = oVar.g(new TypeToken<List<wz>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f37594d;
            um.c h23 = cVar.h("offers");
            list2 = h80Var.f38341i;
            mVar9.e(h23, list2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37599i == null) {
                this.f37599i = a.cb.q(oVar, xh0.class);
            }
            nm.m mVar10 = this.f37599i;
            um.c h24 = cVar.h("shipping_info");
            xh0Var = h80Var.f38342j;
            mVar10.e(h24, xh0Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37598h == null) {
                this.f37598h = a.cb.q(oVar, t80.class);
            }
            nm.m mVar11 = this.f37598h;
            um.c h25 = cVar.h("variant_set");
            t80Var = h80Var.f38343k;
            mVar11.e(h25, t80Var);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37596f == null) {
                this.f37596f = oVar.g(new TypeToken<List<b01>>(this) { // from class: com.pinterest.api.model.ProductRichData$ProductRichDataTypeAdapter$3
                }).b();
            }
            nm.m mVar12 = this.f37596f;
            um.c h26 = cVar.h("videos");
            list = h80Var.f38344l;
            mVar12.e(h26, list);
        }
        cVar.g();
    }
}
