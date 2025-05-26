package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class fl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37718a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37719b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37720c;

    public fl(nm.o oVar) {
        this.f37718a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        el elVar = new el(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1783100079:
                    if (k03.equals("text_alignment")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1645641945:
                    if (k03.equals("top_padding")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1539906063:
                    if (k03.equals("font_size")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -571372583:
                    if (k03.equals("left_padding")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
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
                case 261212398:
                    if (k03.equals("right_padding")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1062347261:
                    if (k03.equals("bottom_padding")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2024311912:
                    if (k03.equals("font_weight")) {
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
            nm.o oVar = this.f37718a;
            switch (c13) {
                case 0:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37297h = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr = elVar.f37300k;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37299j = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr2 = elVar.f37300k;
                    if (zArr2.length <= 9) {
                        break;
                    } else {
                        zArr2[9] = true;
                        break;
                    }
                case 2:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37293d = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr3 = elVar.f37300k;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37295f = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr4 = elVar.f37300k;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f37720c == null) {
                        this.f37720c = a.cb.q(oVar, String.class);
                    }
                    elVar.f37290a = (String) this.f37720c.c(aVar);
                    boolean[] zArr5 = elVar.f37300k;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f37720c == null) {
                        this.f37720c = a.cb.q(oVar, String.class);
                    }
                    elVar.f37298i = (String) this.f37720c.c(aVar);
                    boolean[] zArr6 = elVar.f37300k;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case 6:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37296g = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr7 = elVar.f37300k;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37292c = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr8 = elVar.f37300k;
                    if (zArr8.length <= 2) {
                        break;
                    } else {
                        zArr8[2] = true;
                        break;
                    }
                case '\b':
                    if (this.f37719b == null) {
                        this.f37719b = a.cb.q(oVar, Integer.class);
                    }
                    elVar.f37294e = (Integer) this.f37719b.c(aVar);
                    boolean[] zArr9 = elVar.f37300k;
                    if (zArr9.length <= 4) {
                        break;
                    } else {
                        zArr9[4] = true;
                        break;
                    }
                case '\t':
                    if (this.f37720c == null) {
                        this.f37720c = a.cb.q(oVar, String.class);
                    }
                    elVar.f37291b = (String) this.f37720c.c(aVar);
                    boolean[] zArr10 = elVar.f37300k;
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
        return new hl(elVar.f37290a, elVar.f37291b, elVar.f37292c, elVar.f37293d, elVar.f37294e, elVar.f37295f, elVar.f37296g, elVar.f37297h, elVar.f37298i, elVar.f37299j, elVar.f37300k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        String str2;
        String str3;
        hl hlVar = (hl) obj;
        if (hlVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hlVar.f38483k;
        int length = zArr.length;
        nm.o oVar = this.f37718a;
        if (length > 0 && zArr[0]) {
            if (this.f37720c == null) {
                this.f37720c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37720c;
            um.c h10 = cVar.h("id");
            str3 = hlVar.f38473a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37720c == null) {
                this.f37720c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37720c;
            um.c h13 = cVar.h("node_id");
            str2 = hlVar.f38474b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f37719b;
            um.c h14 = cVar.h("bottom_padding");
            num7 = hlVar.f38475c;
            mVar3.e(h14, num7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f37719b;
            um.c h15 = cVar.h("font_size");
            num6 = hlVar.f38476d;
            mVar4.e(h15, num6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f37719b;
            um.c h16 = cVar.h("font_weight");
            num5 = hlVar.f38477e;
            mVar5.e(h16, num5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f37719b;
            um.c h17 = cVar.h("left_padding");
            num4 = hlVar.f38478f;
            mVar6.e(h17, num4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f37719b;
            um.c h18 = cVar.h("right_padding");
            num3 = hlVar.f38479g;
            mVar7.e(h18, num3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f37719b;
            um.c h19 = cVar.h("text_alignment");
            num2 = hlVar.f38480h;
            mVar8.e(h19, num2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37720c == null) {
                this.f37720c = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37720c;
            um.c h23 = cVar.h("title");
            str = hlVar.f38481i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37719b == null) {
                this.f37719b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f37719b;
            um.c h24 = cVar.h("top_padding");
            num = hlVar.f38482j;
            mVar10.e(h24, num);
        }
        cVar.g();
    }
}
