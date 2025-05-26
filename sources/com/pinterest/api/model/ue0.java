package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class ue0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42541a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42542b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42543c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42544d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42545e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f42546f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f42547g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f42548h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f42549i;

    public ue0(nm.o oVar) {
        this.f42541a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        te0 te0Var = new te0(0);
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
                case -1843818191:
                    if (k03.equals("purchase_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1649813735:
                    if (k03.equals("label_info")) {
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
                case -395888444:
                    if (k03.equals("item_set_id")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 93997959:
                    if (k03.equals("brand")) {
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
                case 804481475:
                    if (k03.equals("has_multi_images")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1409305795:
                    if (k03.equals("offer_summary")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2116204999:
                    if (k03.equals("item_id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
            }
            boolean[] zArr = te0Var.f42190n;
            nm.o oVar = this.f42541a;
            switch (c13) {
                case 0:
                    if (this.f42546f == null) {
                        this.f42546f = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.RichSummaryProduct$RichSummaryProductTypeAdapter$3
                        }).b();
                    }
                    te0Var.f42177a = (List) this.f42546f.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 1:
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.c((String) this.f42549i.c(aVar));
                    break;
                case 2:
                    if (this.f42544d == null) {
                        this.f42544d = a.cb.q(oVar, wt.class);
                    }
                    te0Var.f42183g = (wt) this.f42544d.c(aVar);
                    if (zArr.length > 6) {
                        zArr[6] = true;
                    }
                    break;
                case 3:
                    if (this.f42545e == null) {
                        this.f42545e = oVar.g(new TypeToken<List<wz>>(this) { // from class: com.pinterest.api.model.RichSummaryProduct$RichSummaryProductTypeAdapter$4
                        }).b();
                    }
                    te0Var.f42186j = (List) this.f42545e.c(aVar);
                    if (zArr.length > 9) {
                        zArr[9] = true;
                    }
                    break;
                case 4:
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.f42182f = (String) this.f42549i.c(aVar);
                    if (zArr.length > 5) {
                        zArr[5] = true;
                    }
                    break;
                case 5:
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.f42180d = (String) this.f42549i.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                    }
                    break;
                case 6:
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.f42184h = (String) this.f42549i.c(aVar);
                    if (zArr.length > 7) {
                        zArr[7] = true;
                    }
                    break;
                case 7:
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.f42189m = (String) this.f42549i.c(aVar);
                    if (zArr.length > 12) {
                        zArr[12] = true;
                    }
                    break;
                case '\b':
                    if (this.f42543c == null) {
                        this.f42543c = a.cb.q(oVar, cb.class);
                    }
                    te0Var.b((cb) this.f42543c.c(aVar));
                    break;
                case '\t':
                    if (this.f42548h == null) {
                        this.f42548h = a.cb.q(oVar, xh0.class);
                    }
                    te0Var.f42188l = (xh0) this.f42548h.c(aVar);
                    if (zArr.length > 11) {
                        zArr[11] = true;
                    }
                    break;
                case '\n':
                    if (this.f42542b == null) {
                        this.f42542b = a.cb.q(oVar, Boolean.class);
                    }
                    te0Var.f42179c = (Boolean) this.f42542b.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                    }
                    break;
                case 11:
                    if (this.f42547g == null) {
                        this.f42547g = a.cb.q(oVar, wz.class);
                    }
                    te0Var.f42185i = (wz) this.f42547g.c(aVar);
                    if (zArr.length > 8) {
                        zArr[8] = true;
                    }
                    break;
                case '\f':
                    if (this.f42549i == null) {
                        this.f42549i = a.cb.q(oVar, String.class);
                    }
                    te0Var.f42181e = (String) this.f42549i.c(aVar);
                    boolean[] zArr2 = te0Var.f42190n;
                    if (zArr2.length > 4) {
                        zArr2[4] = true;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return te0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        xh0 xh0Var;
        String str2;
        List list;
        wz wzVar;
        String str3;
        wt wtVar;
        String str4;
        String str5;
        String str6;
        Boolean bool;
        cb cbVar;
        List list2;
        we0 we0Var = (we0) obj;
        if (we0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = we0Var.f43248n;
        int length = zArr.length;
        nm.o oVar = this.f42541a;
        if (length > 0 && zArr[0]) {
            if (this.f42546f == null) {
                this.f42546f = oVar.g(new TypeToken<List<i40>>(this) { // from class: com.pinterest.api.model.RichSummaryProduct$RichSummaryProductTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42546f;
            um.c h10 = cVar.h("additional_images");
            list2 = we0Var.f43235a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42543c == null) {
                this.f42543c = a.cb.q(oVar, cb.class);
            }
            nm.m mVar2 = this.f42543c;
            um.c h13 = cVar.h("brand");
            cbVar = we0Var.f43236b;
            mVar2.e(h13, cbVar);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42542b == null) {
                this.f42542b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f42542b;
            um.c h14 = cVar.h("has_multi_images");
            bool = we0Var.f43237c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42549i;
            um.c h15 = cVar.h("id");
            str6 = we0Var.f43238d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42549i;
            um.c h16 = cVar.h("item_id");
            str5 = we0Var.f43239e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42549i;
            um.c h17 = cVar.h("item_set_id");
            str4 = we0Var.f43240f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42544d == null) {
                this.f42544d = a.cb.q(oVar, wt.class);
            }
            nm.m mVar7 = this.f42544d;
            um.c h18 = cVar.h("label_info");
            wtVar = we0Var.f43241g;
            mVar7.e(h18, wtVar);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f42549i;
            um.c h19 = cVar.h("name");
            str3 = we0Var.f43242h;
            mVar8.e(h19, str3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42547g == null) {
                this.f42547g = a.cb.q(oVar, wz.class);
            }
            nm.m mVar9 = this.f42547g;
            um.c h23 = cVar.h("offer_summary");
            wzVar = we0Var.f43243i;
            mVar9.e(h23, wzVar);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42545e == null) {
                this.f42545e = oVar.g(new TypeToken<List<wz>>(this) { // from class: com.pinterest.api.model.RichSummaryProduct$RichSummaryProductTypeAdapter$2
                }).b();
            }
            nm.m mVar10 = this.f42545e;
            um.c h24 = cVar.h("offers");
            list = we0Var.f43244j;
            mVar10.e(h24, list);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f42549i;
            um.c h25 = cVar.h("purchase_url");
            str2 = we0Var.f43245k;
            mVar11.e(h25, str2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f42548h == null) {
                this.f42548h = a.cb.q(oVar, xh0.class);
            }
            nm.m mVar12 = this.f42548h;
            um.c h26 = cVar.h("shipping_info");
            xh0Var = we0Var.f43246l;
            mVar12.e(h26, xh0Var);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f42549i == null) {
                this.f42549i = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f42549i;
            um.c h27 = cVar.h("type");
            str = we0Var.f43247m;
            mVar13.e(h27, str);
        }
        cVar.g();
    }
}
