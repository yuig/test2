package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class j30 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38938a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38939b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38940c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38941d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38942e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38943f;

    public j30(nm.o oVar) {
        this.f38938a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        i30 i30Var = new i30(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1326197564:
                    if (k03.equals("domain")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -816678056:
                    if (k03.equals("videos")) {
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
                case 3321850:
                    if (k03.equals("link")) {
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
                case 414896541:
                    if (k03.equals("android_deep_link")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 453999410:
                    if (k03.equals("rich_metadata")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1236876706:
                    if (k03.equals("ad_destination_url")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1358109507:
                    if (k03.equals("rich_summary")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1557721666:
                    if (k03.equals("details")) {
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
            nm.o oVar = this.f38938a;
            switch (c13) {
                case 0:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38633d = (String) this.f38942e.c(aVar);
                    boolean[] zArr = i30Var.f38643n;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f38939b == null) {
                        this.f38939b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PinCarouselSlot$PinCarouselSlotTypeAdapter$2
                        }).b();
                    }
                    i30Var.f38636g = (Map) this.f38939b.c(aVar);
                    boolean[] zArr2 = i30Var.f38643n;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f38943f == null) {
                        this.f38943f = a.cb.q(oVar, b01.class);
                    }
                    i30Var.c((b01) this.f38943f.c(aVar));
                    break;
                case 3:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38634e = (String) this.f38942e.c(aVar);
                    boolean[] zArr3 = i30Var.f38643n;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 4:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38638i = (String) this.f38942e.c(aVar);
                    boolean[] zArr4 = i30Var.f38643n;
                    if (zArr4.length <= 8) {
                        break;
                    } else {
                        zArr4[8] = true;
                        break;
                    }
                case 5:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38641l = (String) this.f38942e.c(aVar);
                    boolean[] zArr5 = i30Var.f38643n;
                    if (zArr5.length <= 11) {
                        break;
                    } else {
                        zArr5[11] = true;
                        break;
                    }
                case 6:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38631b = (String) this.f38942e.c(aVar);
                    boolean[] zArr6 = i30Var.f38643n;
                    if (zArr6.length <= 1) {
                        break;
                    } else {
                        zArr6[1] = true;
                        break;
                    }
                case 7:
                    if (this.f38940c == null) {
                        this.f38940c = a.cb.q(oVar, oe0.class);
                    }
                    i30Var.f38639j = (oe0) this.f38940c.c(aVar);
                    boolean[] zArr7 = i30Var.f38643n;
                    if (zArr7.length <= 9) {
                        break;
                    } else {
                        zArr7[9] = true;
                        break;
                    }
                case '\b':
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.b((String) this.f38942e.c(aVar));
                    break;
                case '\t':
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38630a = (String) this.f38942e.c(aVar);
                    boolean[] zArr8 = i30Var.f38643n;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                case '\n':
                    if (this.f38941d == null) {
                        this.f38941d = a.cb.q(oVar, se0.class);
                    }
                    i30Var.f38640k = (se0) this.f38941d.c(aVar);
                    boolean[] zArr9 = i30Var.f38643n;
                    if (zArr9.length <= 10) {
                        break;
                    } else {
                        zArr9[10] = true;
                        break;
                    }
                case 11:
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38632c = (String) this.f38942e.c(aVar);
                    boolean[] zArr10 = i30Var.f38643n;
                    if (zArr10.length <= 2) {
                        break;
                    } else {
                        zArr10[2] = true;
                        break;
                    }
                case '\f':
                    if (this.f38942e == null) {
                        this.f38942e = a.cb.q(oVar, String.class);
                    }
                    i30Var.f38637h = (String) this.f38942e.c(aVar);
                    boolean[] zArr11 = i30Var.f38643n;
                    if (zArr11.length <= 7) {
                        break;
                    } else {
                        zArr11[7] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return i30Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        b01 b01Var;
        String str;
        se0 se0Var;
        oe0 oe0Var;
        String str2;
        String str3;
        Map map;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        l30 l30Var = (l30) obj;
        if (l30Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = l30Var.f39650n;
        int length = zArr.length;
        nm.o oVar = this.f38938a;
        if (length > 0 && zArr[0]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38942e;
            um.c h10 = cVar.h("ad_destination_url");
            str9 = l30Var.f39637a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38942e;
            um.c h13 = cVar.h("android_deep_link");
            str8 = l30Var.f39638b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38942e;
            um.c h14 = cVar.h("details");
            str7 = l30Var.f39639c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38942e;
            um.c h15 = cVar.h("domain");
            str6 = l30Var.f39640d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38942e;
            um.c h16 = cVar.h("id");
            str5 = l30Var.f39641e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38942e;
            um.c h17 = cVar.h("image_signature");
            str4 = l30Var.f39642f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38939b == null) {
                this.f38939b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PinCarouselSlot$PinCarouselSlotTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f38939b;
            um.c h18 = cVar.h("images");
            map = l30Var.f39643g;
            mVar7.e(h18, map);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f38942e;
            um.c h19 = cVar.h("item_id");
            str3 = l30Var.f39644h;
            mVar8.e(h19, str3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f38942e;
            um.c h23 = cVar.h("link");
            str2 = l30Var.f39645i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38940c == null) {
                this.f38940c = a.cb.q(oVar, oe0.class);
            }
            nm.m mVar10 = this.f38940c;
            um.c h24 = cVar.h("rich_metadata");
            oe0Var = l30Var.f39646j;
            mVar10.e(h24, oe0Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38941d == null) {
                this.f38941d = a.cb.q(oVar, se0.class);
            }
            nm.m mVar11 = this.f38941d;
            um.c h25 = cVar.h("rich_summary");
            se0Var = l30Var.f39647k;
            mVar11.e(h25, se0Var);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38942e == null) {
                this.f38942e = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f38942e;
            um.c h26 = cVar.h("title");
            str = l30Var.f39648l;
            mVar12.e(h26, str);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38943f == null) {
                this.f38943f = a.cb.q(oVar, b01.class);
            }
            nm.m mVar13 = this.f38943f;
            um.c h27 = cVar.h("videos");
            b01Var = l30Var.f39649m;
            mVar13.e(h27, b01Var);
        }
        cVar.g();
    }
}
