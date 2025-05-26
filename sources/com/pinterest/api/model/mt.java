package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes3.dex */
public final class mt extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40205a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40206b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40207c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40208d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40209e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40210f;

    public mt(nm.o oVar) {
        this.f40205a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lt ltVar = new lt(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1495909939:
                    if (k03.equals("invite_channel")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -905962955:
                    if (k03.equals("sender")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -769510831:
                    if (k03.equals("email_address")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -510682764:
                    if (k03.equals("invite_category")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -278568326:
                    if (k03.equals("from_user_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1413411612:
                    if (k03.equals("is_accepted")) {
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
            }
            nm.o oVar = this.f40205a;
            switch (c13) {
                case 0:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39887i = (String) this.f40209e.c(aVar);
                    boolean[] zArr = ltVar.f39890l;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 1:
                    if (this.f40210f == null) {
                        this.f40210f = a.cb.q(oVar, wy0.class);
                    }
                    ltVar.f39889k = (wy0) this.f40210f.c(aVar);
                    boolean[] zArr2 = ltVar.f39890l;
                    if (zArr2.length <= 10) {
                        break;
                    } else {
                        zArr2[10] = true;
                        break;
                    }
                case 2:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39885g = (String) this.f40209e.c(aVar);
                    boolean[] zArr3 = ltVar.f39890l;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39883e = (String) this.f40209e.c(aVar);
                    boolean[] zArr4 = ltVar.f39890l;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39886h = (String) this.f40209e.c(aVar);
                    boolean[] zArr5 = ltVar.f39890l;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39884f = (String) this.f40209e.c(aVar);
                    boolean[] zArr6 = ltVar.f39890l;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39879a = (String) this.f40209e.c(aVar);
                    boolean[] zArr7 = ltVar.f39890l;
                    if (zArr7.length <= 0) {
                        break;
                    } else {
                        zArr7[0] = true;
                        break;
                    }
                case 7:
                    if (this.f40206b == null) {
                        this.f40206b = a.cb.q(oVar, v7.class);
                    }
                    ltVar.f39881c = (v7) this.f40206b.c(aVar);
                    boolean[] zArr8 = ltVar.f39890l;
                    if (zArr8.length <= 2) {
                        break;
                    } else {
                        zArr8[2] = true;
                        break;
                    }
                case '\b':
                    if (this.f40208d == null) {
                        this.f40208d = a.cb.q(oVar, Date.class);
                    }
                    ltVar.f39882d = (Date) this.f40208d.c(aVar);
                    boolean[] zArr9 = ltVar.f39890l;
                    if (zArr9.length <= 3) {
                        break;
                    } else {
                        zArr9[3] = true;
                        break;
                    }
                case '\t':
                    if (this.f40207c == null) {
                        this.f40207c = a.cb.q(oVar, Boolean.class);
                    }
                    ltVar.f39888j = (Boolean) this.f40207c.c(aVar);
                    boolean[] zArr10 = ltVar.f39890l;
                    if (zArr10.length <= 9) {
                        break;
                    } else {
                        zArr10[9] = true;
                        break;
                    }
                case '\n':
                    if (this.f40209e == null) {
                        this.f40209e = a.cb.q(oVar, String.class);
                    }
                    ltVar.f39880b = (String) this.f40209e.c(aVar);
                    boolean[] zArr11 = ltVar.f39890l;
                    if (zArr11.length <= 1) {
                        break;
                    } else {
                        zArr11[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ot(ltVar.f39879a, ltVar.f39880b, ltVar.f39881c, ltVar.f39882d, ltVar.f39883e, ltVar.f39884f, ltVar.f39885g, ltVar.f39886h, ltVar.f39887i, ltVar.f39888j, ltVar.f39889k, ltVar.f39890l, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        Boolean bool;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Date date;
        v7 v7Var;
        String str6;
        String str7;
        ot otVar = (ot) obj;
        if (otVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = otVar.f40806l;
        int length = zArr.length;
        nm.o oVar = this.f40205a;
        if (length > 0 && zArr[0]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40209e;
            um.c h10 = cVar.h("id");
            str7 = otVar.f40795a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40209e;
            um.c h13 = cVar.h("node_id");
            str6 = otVar.f40796b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40206b == null) {
                this.f40206b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f40206b;
            um.c h14 = cVar.h("board");
            v7Var = otVar.f40797c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40208d == null) {
                this.f40208d = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f40208d;
            um.c h15 = cVar.h("created_at");
            date = otVar.f40798d;
            mVar4.e(h15, date);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40209e;
            um.c h16 = cVar.h("email_address");
            str5 = otVar.f40799e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40209e;
            um.c h17 = cVar.h("from_user_id");
            str4 = otVar.f40800f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40209e;
            um.c h18 = cVar.h("image_url");
            str3 = otVar.f40801g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f40209e;
            um.c h19 = cVar.h("invite_category");
            str2 = otVar.f40802h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40209e == null) {
                this.f40209e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f40209e;
            um.c h23 = cVar.h("invite_channel");
            str = otVar.f40803i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40207c == null) {
                this.f40207c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f40207c;
            um.c h24 = cVar.h("is_accepted");
            bool = otVar.f40804j;
            mVar10.e(h24, bool);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40210f == null) {
                this.f40210f = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar11 = this.f40210f;
            um.c h25 = cVar.h("sender");
            wy0Var = otVar.f40805k;
            mVar11.e(h25, wy0Var);
        }
        cVar.g();
    }
}
