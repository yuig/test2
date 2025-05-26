package com.pinterest.api.model;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class e2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37035a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37036b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37037c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37038d;

    public e2(nm.o oVar) {
        this.f37035a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        g2 g2Var = new g2(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2113249540:
                    if (k03.equals("slot_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                    if (k03.equals("h")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL /* 119 */:
                    if (k03.equals("w")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_GRID_CELL /* 120 */:
                    if (k03.equals("x")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL /* 121 */:
                    if (k03.equals("y")) {
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
                case 102727412:
                    if (k03.equals("label")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1537780732:
                    if (k03.equals("category_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1825632156:
                    if (k03.equals("thumbnail_url")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
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
            boolean[] zArr = g2Var.f37916l;
            nm.o oVar = this.f37035a;
            switch (c13) {
                case 0:
                    if (this.f37037c == null) {
                        this.f37037c = a.cb.q(oVar, Integer.class);
                    }
                    g2Var.f37911g = (Integer) this.f37037c.c(aVar);
                    boolean[] zArr2 = g2Var.f37916l;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 1:
                    if (this.f37036b == null) {
                        this.f37036b = a.cb.q(oVar, Double.class);
                    }
                    g2Var.f37909e = (Double) this.f37036b.c(aVar);
                    boolean[] zArr3 = g2Var.f37916l;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 2:
                    if (this.f37036b == null) {
                        this.f37036b = a.cb.q(oVar, Double.class);
                    }
                    g2Var.f37913i = (Double) this.f37036b.c(aVar);
                    boolean[] zArr4 = g2Var.f37916l;
                    if (zArr4.length <= 8) {
                        break;
                    } else {
                        zArr4[8] = true;
                        break;
                    }
                case 3:
                    if (this.f37036b == null) {
                        this.f37036b = a.cb.q(oVar, Double.class);
                    }
                    g2Var.f37914j = (Double) this.f37036b.c(aVar);
                    boolean[] zArr5 = g2Var.f37916l;
                    if (zArr5.length <= 9) {
                        break;
                    } else {
                        zArr5[9] = true;
                        break;
                    }
                case 4:
                    if (this.f37036b == null) {
                        this.f37036b = a.cb.q(oVar, Double.class);
                    }
                    g2Var.f37915k = (Double) this.f37036b.c(aVar);
                    boolean[] zArr6 = g2Var.f37916l;
                    if (zArr6.length <= 10) {
                        break;
                    } else {
                        zArr6[10] = true;
                        break;
                    }
                case 5:
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37905a = (String) this.f37038d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 6:
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37910f = (String) this.f37038d.c(aVar);
                    boolean[] zArr7 = g2Var.f37916l;
                    if (zArr7.length <= 5) {
                        break;
                    } else {
                        zArr7[5] = true;
                        break;
                    }
                case 7:
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37908d = (String) this.f37038d.c(aVar);
                    boolean[] zArr8 = g2Var.f37916l;
                    if (zArr8.length <= 3) {
                        break;
                    } else {
                        zArr8[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37912h = (String) this.f37038d.c(aVar);
                    boolean[] zArr9 = g2Var.f37916l;
                    if (zArr9.length <= 7) {
                        break;
                    } else {
                        zArr9[7] = true;
                        break;
                    }
                case '\t':
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37907c = (String) this.f37038d.c(aVar);
                    boolean[] zArr10 = g2Var.f37916l;
                    if (zArr10.length <= 2) {
                        break;
                    } else {
                        zArr10[2] = true;
                        break;
                    }
                case '\n':
                    if (this.f37038d == null) {
                        this.f37038d = a.cb.q(oVar, String.class);
                    }
                    g2Var.f37906b = (String) this.f37038d.c(aVar);
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
        return g2Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        String str;
        Integer num;
        String str2;
        Double d15;
        String str3;
        String str4;
        String str5;
        String str6;
        h2 h2Var = (h2) obj;
        if (h2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = h2Var.f38247l;
        int length = zArr.length;
        nm.o oVar = this.f37035a;
        if (length > 0 && zArr[0]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37038d;
            um.c h10 = cVar.h("id");
            str6 = h2Var.f38236a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37038d;
            um.c h13 = cVar.h("node_id");
            str5 = h2Var.f38237b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37038d;
            um.c h14 = cVar.h("background_color");
            str4 = h2Var.f38238c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37038d;
            um.c h15 = cVar.h("category_id");
            str3 = h2Var.f38239d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37036b == null) {
                this.f37036b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f37036b;
            um.c h16 = cVar.h("h");
            d15 = h2Var.f38240e;
            mVar5.e(h16, d15);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37038d;
            um.c h17 = cVar.h("label");
            str2 = h2Var.f38241f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37037c == null) {
                this.f37037c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f37037c;
            um.c h18 = cVar.h("slot_id");
            num = h2Var.f38242g;
            mVar7.e(h18, num);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37038d == null) {
                this.f37038d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f37038d;
            um.c h19 = cVar.h("thumbnail_url");
            str = h2Var.f38243h;
            mVar8.e(h19, str);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37036b == null) {
                this.f37036b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f37036b;
            um.c h23 = cVar.h("w");
            d14 = h2Var.f38244i;
            mVar9.e(h23, d14);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37036b == null) {
                this.f37036b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f37036b;
            um.c h24 = cVar.h("x");
            d13 = h2Var.f38245j;
            mVar10.e(h24, d13);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37036b == null) {
                this.f37036b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar11 = this.f37036b;
            um.c h25 = cVar.h("y");
            d2 = h2Var.f38246k;
            mVar11.e(h25, d2);
        }
        cVar.g();
    }
}
