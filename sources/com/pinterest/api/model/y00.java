package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class y00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43863a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43864b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43865c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43866d;

    public y00(nm.o oVar) {
        this.f43863a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x00 x00Var = new x00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -485470925:
                    if (k03.equals("order_status_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -338069640:
                    if (k03.equals("shipping_price")) {
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
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 103354097:
                    if (k03.equals("customer_service_email")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 106934601:
                    if (k03.equals("price")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 172872907:
                    if (k03.equals("discount_price")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2072950754:
                    if (k03.equals("merchant_user")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43863a;
            switch (c13) {
                case 0:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43527g = (String) this.f43865c.c(aVar);
                    boolean[] zArr = x00Var.f43531k;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43529i = (String) this.f43865c.c(aVar);
                    boolean[] zArr2 = x00Var.f43531k;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 2:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43521a = (String) this.f43865c.c(aVar);
                    boolean[] zArr3 = x00Var.f43531k;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f43864b == null) {
                        this.f43864b = a.cb.q(oVar, e10.class);
                    }
                    x00Var.f43525e = (e10) this.f43864b.c(aVar);
                    boolean[] zArr4 = x00Var.f43531k;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43523c = (String) this.f43865c.c(aVar);
                    boolean[] zArr5 = x00Var.f43531k;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43528h = (String) this.f43865c.c(aVar);
                    boolean[] zArr6 = x00Var.f43531k;
                    if (zArr6.length <= 7) {
                        break;
                    } else {
                        zArr6[7] = true;
                        break;
                    }
                case 6:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43530j = (String) this.f43865c.c(aVar);
                    boolean[] zArr7 = x00Var.f43531k;
                    if (zArr7.length <= 9) {
                        break;
                    } else {
                        zArr7[9] = true;
                        break;
                    }
                case 7:
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43524d = (String) this.f43865c.c(aVar);
                    boolean[] zArr8 = x00Var.f43531k;
                    if (zArr8.length <= 3) {
                        break;
                    } else {
                        zArr8[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f43866d == null) {
                        this.f43866d = a.cb.q(oVar, wy0.class);
                    }
                    x00Var.f43526f = (wy0) this.f43866d.c(aVar);
                    boolean[] zArr9 = x00Var.f43531k;
                    if (zArr9.length <= 5) {
                        break;
                    } else {
                        zArr9[5] = true;
                        break;
                    }
                case '\t':
                    if (this.f43865c == null) {
                        this.f43865c = a.cb.q(oVar, String.class);
                    }
                    x00Var.f43522b = (String) this.f43865c.c(aVar);
                    boolean[] zArr10 = x00Var.f43531k;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new a10(x00Var.f43521a, x00Var.f43522b, x00Var.f43523c, x00Var.f43524d, x00Var.f43525e, x00Var.f43526f, x00Var.f43527g, x00Var.f43528h, x00Var.f43529i, x00Var.f43530j, x00Var.f43531k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        wy0 wy0Var;
        e10 e10Var;
        String str5;
        String str6;
        String str7;
        String str8;
        a10 a10Var = (a10) obj;
        if (a10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = a10Var.f35619k;
        int length = zArr.length;
        nm.o oVar = this.f43863a;
        if (length > 0 && zArr[0]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43865c;
            um.c h10 = cVar.h("id");
            str8 = a10Var.f35609a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43865c;
            um.c h13 = cVar.h("node_id");
            str7 = a10Var.f35610b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43865c;
            um.c h14 = cVar.h("customer_service_email");
            str6 = a10Var.f35611c;
            mVar3.e(h14, str6);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43865c;
            um.c h15 = cVar.h("discount_price");
            str5 = a10Var.f35612d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43864b == null) {
                this.f43864b = a.cb.q(oVar, e10.class);
            }
            nm.m mVar5 = this.f43864b;
            um.c h16 = cVar.h("image");
            e10Var = a10Var.f35613e;
            mVar5.e(h16, e10Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43866d == null) {
                this.f43866d = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar6 = this.f43866d;
            um.c h17 = cVar.h("merchant_user");
            wy0Var = a10Var.f35614f;
            mVar6.e(h17, wy0Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f43865c;
            um.c h18 = cVar.h("order_status_url");
            str4 = a10Var.f35615g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f43865c;
            um.c h19 = cVar.h("price");
            str3 = a10Var.f35616h;
            mVar8.e(h19, str3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f43865c;
            um.c h23 = cVar.h("shipping_price");
            str2 = a10Var.f35617i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43865c == null) {
                this.f43865c = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f43865c;
            um.c h24 = cVar.h("title");
            str = a10Var.f35618j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
