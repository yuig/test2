package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class c1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36269a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36270b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36271c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36272d;

    public c1(nm.o oVar) {
        this.f36269a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        e1 e1Var = new e1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1153075697:
                    if (k03.equals("external_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1082560159:
                    if (k03.equals("product_currency")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -508378819:
                    if (k03.equals("fulfillment_options")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1383215609:
                    if (k03.equals("product_price")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2027875547:
                    if (k03.equals("logo_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36269a;
            switch (c13) {
                case 0:
                    if (this.f36272d == null) {
                        this.f36272d = a.cb.q(oVar, String.class);
                    }
                    e1Var.f37019a = (String) this.f36272d.c(aVar);
                    boolean[] zArr = e1Var.f37026h;
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 1:
                    if (this.f36272d == null) {
                        this.f36272d = a.cb.q(oVar, String.class);
                    }
                    e1Var.f37023e = (String) this.f36272d.c(aVar);
                    boolean[] zArr2 = e1Var.f37026h;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f36271c == null) {
                        this.f36271c = oVar.g(new TypeToken<List<ec>>(this) { // from class: com.pinterest.api.model.AdsCartingRetailer$AdsCartingRetailerTypeAdapter$2
                        }).b();
                    }
                    e1Var.f37020b = (List) this.f36271c.c(aVar);
                    boolean[] zArr3 = e1Var.f37026h;
                    if (zArr3.length <= 1) {
                        break;
                    } else {
                        zArr3[1] = true;
                        break;
                    }
                case 3:
                    if (this.f36272d == null) {
                        this.f36272d = a.cb.q(oVar, String.class);
                    }
                    e1Var.f37025g = (String) this.f36272d.c(aVar);
                    boolean[] zArr4 = e1Var.f37026h;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f36272d == null) {
                        this.f36272d = a.cb.q(oVar, String.class);
                    }
                    e1Var.f37022d = (String) this.f36272d.c(aVar);
                    boolean[] zArr5 = e1Var.f37026h;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f36270b == null) {
                        this.f36270b = a.cb.q(oVar, Double.class);
                    }
                    e1Var.f37024f = (Double) this.f36270b.c(aVar);
                    boolean[] zArr6 = e1Var.f37026h;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f36272d == null) {
                        this.f36272d = a.cb.q(oVar, String.class);
                    }
                    e1Var.f37021c = (String) this.f36272d.c(aVar);
                    boolean[] zArr7 = e1Var.f37026h;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new f1(e1Var.f37019a, e1Var.f37020b, e1Var.f37021c, e1Var.f37022d, e1Var.f37023e, e1Var.f37024f, e1Var.f37025g, e1Var.f37026h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Double d2;
        String str2;
        String str3;
        String str4;
        List list;
        String str5;
        f1 f1Var = (f1) obj;
        if (f1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = f1Var.f37410h;
        int length = zArr.length;
        nm.o oVar = this.f36269a;
        if (length > 0 && zArr[0]) {
            if (this.f36272d == null) {
                this.f36272d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36272d;
            um.c h10 = cVar.h("external_id");
            str5 = f1Var.f37403a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36271c == null) {
                this.f36271c = oVar.g(new TypeToken<List<ec>>(this) { // from class: com.pinterest.api.model.AdsCartingRetailer$AdsCartingRetailerTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f36271c;
            um.c h13 = cVar.h("fulfillment_options");
            list = f1Var.f37404b;
            mVar2.e(h13, list);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36272d == null) {
                this.f36272d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36272d;
            um.c h14 = cVar.h("logo_url");
            str4 = f1Var.f37405c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36272d == null) {
                this.f36272d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36272d;
            um.c h15 = cVar.h("name");
            str3 = f1Var.f37406d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36272d == null) {
                this.f36272d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36272d;
            um.c h16 = cVar.h("product_currency");
            str2 = f1Var.f37407e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36270b == null) {
                this.f36270b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f36270b;
            um.c h17 = cVar.h("product_price");
            d2 = f1Var.f37408f;
            mVar6.e(h17, d2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36272d == null) {
                this.f36272d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36272d;
            um.c h18 = cVar.h("url");
            str = f1Var.f37409g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
