package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qt extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41370a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41371b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41372c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41373d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41374e;

    public qt(nm.o oVar) {
        this.f41370a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pt ptVar = new pt(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1185250696:
                    if (k03.equals("images")) {
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
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 867385817:
                    if (k03.equals("is_editable")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1280954951:
                    if (k03.equals("price_currency")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1714924804:
                    if (k03.equals("dominant_color")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1887881979:
                    if (k03.equals("price_value")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2116204999:
                    if (k03.equals("item_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41370a;
            switch (c13) {
                case 0:
                    if (this.f41373d == null) {
                        this.f41373d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ItemData$ItemDataTypeAdapter$2
                        }).b();
                    }
                    ptVar.f41088e = (Map) this.f41373d.c(aVar);
                    boolean[] zArr = ptVar.f41096m;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41092i = (String) this.f41374e.c(aVar);
                    boolean[] zArr2 = ptVar.f41096m;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 2:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41084a = (String) this.f41374e.c(aVar);
                    boolean[] zArr3 = ptVar.f41096m;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41091h = (String) this.f41374e.c(aVar);
                    boolean[] zArr4 = ptVar.f41096m;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41095l = (String) this.f41374e.c(aVar);
                    boolean[] zArr5 = ptVar.f41096m;
                    if (zArr5.length <= 11) {
                        break;
                    } else {
                        zArr5[11] = true;
                        break;
                    }
                case 5:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41087d = (String) this.f41374e.c(aVar);
                    boolean[] zArr6 = ptVar.f41096m;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f41371b == null) {
                        this.f41371b = a.cb.q(oVar, Boolean.class);
                    }
                    ptVar.f41089f = (Boolean) this.f41371b.c(aVar);
                    boolean[] zArr7 = ptVar.f41096m;
                    if (zArr7.length <= 5) {
                        break;
                    } else {
                        zArr7[5] = true;
                        break;
                    }
                case 7:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41093j = (String) this.f41374e.c(aVar);
                    boolean[] zArr8 = ptVar.f41096m;
                    if (zArr8.length <= 9) {
                        break;
                    } else {
                        zArr8[9] = true;
                        break;
                    }
                case '\b':
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41086c = (String) this.f41374e.c(aVar);
                    boolean[] zArr9 = ptVar.f41096m;
                    if (zArr9.length <= 2) {
                        break;
                    } else {
                        zArr9[2] = true;
                        break;
                    }
                case '\t':
                    if (this.f41372c == null) {
                        this.f41372c = a.cb.q(oVar, Double.class);
                    }
                    ptVar.f41094k = (Double) this.f41372c.c(aVar);
                    boolean[] zArr10 = ptVar.f41096m;
                    if (zArr10.length <= 10) {
                        break;
                    } else {
                        zArr10[10] = true;
                        break;
                    }
                case '\n':
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41085b = (String) this.f41374e.c(aVar);
                    boolean[] zArr11 = ptVar.f41096m;
                    if (zArr11.length <= 1) {
                        break;
                    } else {
                        zArr11[1] = true;
                        break;
                    }
                case 11:
                    if (this.f41374e == null) {
                        this.f41374e = a.cb.q(oVar, String.class);
                    }
                    ptVar.f41090g = (String) this.f41374e.c(aVar);
                    boolean[] zArr12 = ptVar.f41096m;
                    if (zArr12.length <= 6) {
                        break;
                    } else {
                        zArr12[6] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new st(ptVar.f41084a, ptVar.f41085b, ptVar.f41086c, ptVar.f41087d, ptVar.f41088e, ptVar.f41089f, ptVar.f41090g, ptVar.f41091h, ptVar.f41092i, ptVar.f41093j, ptVar.f41094k, ptVar.f41095l, ptVar.f41096m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Double d2;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        Map map;
        String str6;
        String str7;
        String str8;
        String str9;
        st stVar = (st) obj;
        if (stVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = stVar.f41996m;
        int length = zArr.length;
        nm.o oVar = this.f41370a;
        if (length > 0 && zArr[0]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41374e;
            um.c h10 = cVar.h("id");
            str9 = stVar.f41984a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41374e;
            um.c h13 = cVar.h("node_id");
            str8 = stVar.f41985b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41374e;
            um.c h14 = cVar.h("dominant_color");
            str7 = stVar.f41986c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41374e;
            um.c h15 = cVar.h("image_signature");
            str6 = stVar.f41987d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41373d == null) {
                this.f41373d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ItemData$ItemDataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f41373d;
            um.c h16 = cVar.h("images");
            map = stVar.f41988e;
            mVar5.e(h16, map);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41371b == null) {
                this.f41371b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f41371b;
            um.c h17 = cVar.h("is_editable");
            bool = stVar.f41989f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41374e;
            um.c h18 = cVar.h("item_id");
            str5 = stVar.f41990g;
            mVar7.e(h18, str5);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f41374e;
            um.c h19 = cVar.h("link");
            str4 = stVar.f41991h;
            mVar8.e(h19, str4);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f41374e;
            um.c h23 = cVar.h("pin_id");
            str3 = stVar.f41992i;
            mVar9.e(h23, str3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f41374e;
            um.c h24 = cVar.h("price_currency");
            str2 = stVar.f41993j;
            mVar10.e(h24, str2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41372c == null) {
                this.f41372c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar11 = this.f41372c;
            um.c h25 = cVar.h("price_value");
            d2 = stVar.f41994k;
            mVar11.e(h25, d2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41374e == null) {
                this.f41374e = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f41374e;
            um.c h26 = cVar.h("title");
            str = stVar.f41995l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
