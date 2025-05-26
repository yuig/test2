package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class o11 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40593a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40594b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40595c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40596d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40597e;

    public o11(nm.o oVar) {
        this.f40593a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n11 n11Var = new n11(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1863857531:
                    if (k03.equals("detection")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -63201811:
                    if (k03.equals("label_x")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -63201810:
                    if (k03.equals("label_y")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                    if (k03.equals("h")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                    if (k03.equals("w")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                    if (k03.equals("x")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                    if (k03.equals("y")) {
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
                case 100346066:
                    if (k03.equals("index")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 102727412:
                    if (k03.equals("label")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 109264530:
                    if (k03.equals("score")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 124730180:
                    if (k03.equals("is_stela")) {
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
            boolean[] zArr = n11Var.f40298o;
            nm.o oVar = this.f40593a;
            switch (c13) {
                case 0:
                    if (this.f40594b == null) {
                        this.f40594b = a.cb.q(oVar, Boolean.class);
                    }
                    n11Var.f40286c = (Boolean) this.f40594b.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40291h = (Double) this.f40595c.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 2:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40292i = (Double) this.f40595c.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 3:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40287d = (Double) this.f40595c.c(aVar);
                    boolean[] zArr2 = n11Var.f40298o;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 4:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40295l = (Double) this.f40595c.c(aVar);
                    boolean[] zArr3 = n11Var.f40298o;
                    if (zArr3.length <= 11) {
                        break;
                    } else {
                        zArr3[11] = true;
                        break;
                    }
                case 5:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40296m = (Double) this.f40595c.c(aVar);
                    boolean[] zArr4 = n11Var.f40298o;
                    if (zArr4.length <= 12) {
                        break;
                    } else {
                        zArr4[12] = true;
                        break;
                    }
                case 6:
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40297n = (Double) this.f40595c.c(aVar);
                    boolean[] zArr5 = n11Var.f40298o;
                    if (zArr5.length <= 13) {
                        break;
                    } else {
                        zArr5[13] = true;
                        break;
                    }
                case 7:
                    if (this.f40597e == null) {
                        this.f40597e = a.cb.q(oVar, String.class);
                    }
                    n11Var.f40284a = (String) this.f40597e.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case '\b':
                    if (this.f40596d == null) {
                        this.f40596d = a.cb.q(oVar, Integer.class);
                    }
                    n11Var.f40288e = (Integer) this.f40596d.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case '\t':
                    if (this.f40597e == null) {
                        this.f40597e = a.cb.q(oVar, String.class);
                    }
                    n11Var.f40290g = (String) this.f40597e.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case '\n':
                    if (this.f40595c == null) {
                        this.f40595c = a.cb.q(oVar, Double.class);
                    }
                    n11Var.f40293j = (Double) this.f40595c.c(aVar);
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 11:
                    if (this.f40597e == null) {
                        this.f40597e = a.cb.q(oVar, String.class);
                    }
                    n11Var.f40294k = (String) this.f40597e.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case '\f':
                    if (this.f40594b == null) {
                        this.f40594b = a.cb.q(oVar, Boolean.class);
                    }
                    n11Var.f40289f = (Boolean) this.f40594b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case '\r':
                    if (this.f40597e == null) {
                        this.f40597e = a.cb.q(oVar, String.class);
                    }
                    n11Var.f40285b = (String) this.f40597e.c(aVar);
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
        return n11Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        String str;
        Double d15;
        Double d16;
        Double d17;
        String str2;
        Boolean bool;
        Integer num;
        Double d18;
        Boolean bool2;
        String str3;
        String str4;
        q11 q11Var = (q11) obj;
        if (q11Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = q11Var.f41185o;
        int length = zArr.length;
        nm.o oVar = this.f40593a;
        if (length > 0 && zArr[0]) {
            if (this.f40597e == null) {
                this.f40597e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40597e;
            um.c h10 = cVar.h("id");
            str4 = q11Var.f41171a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40597e == null) {
                this.f40597e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40597e;
            um.c h13 = cVar.h("node_id");
            str3 = q11Var.f41172b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40594b == null) {
                this.f40594b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f40594b;
            um.c h14 = cVar.h("detection");
            bool2 = q11Var.f41173c;
            mVar3.e(h14, bool2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f40595c;
            um.c h15 = cVar.h("h");
            d18 = q11Var.f41174d;
            mVar4.e(h15, d18);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40596d == null) {
                this.f40596d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40596d;
            um.c h16 = cVar.h("index");
            num = q11Var.f41175e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40594b == null) {
                this.f40594b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f40594b;
            um.c h17 = cVar.h("is_stela");
            bool = q11Var.f41176f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40597e == null) {
                this.f40597e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40597e;
            um.c h18 = cVar.h("label");
            str2 = q11Var.f41177g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar8 = this.f40595c;
            um.c h19 = cVar.h("label_x");
            d17 = q11Var.f41178h;
            mVar8.e(h19, d17);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f40595c;
            um.c h23 = cVar.h("label_y");
            d16 = q11Var.f41179i;
            mVar9.e(h23, d16);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f40595c;
            um.c h24 = cVar.h("score");
            d15 = q11Var.f41180j;
            mVar10.e(h24, d15);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40597e == null) {
                this.f40597e = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f40597e;
            um.c h25 = cVar.h("title");
            str = q11Var.f41181k;
            mVar11.e(h25, str);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar12 = this.f40595c;
            um.c h26 = cVar.h("w");
            d14 = q11Var.f41182l;
            mVar12.e(h26, d14);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar13 = this.f40595c;
            um.c h27 = cVar.h("x");
            d13 = q11Var.f41183m;
            mVar13.e(h27, d13);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f40595c == null) {
                this.f40595c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar14 = this.f40595c;
            um.c h28 = cVar.h("y");
            d2 = q11Var.f41184n;
            mVar14.e(h28, d2);
        }
        cVar.g();
    }
}
