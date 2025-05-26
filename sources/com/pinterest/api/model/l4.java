package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class l4 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39651a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39652b;

    public l4(nm.o oVar) {
        this.f39651a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n4 n4Var = new n4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1664701663:
                    if (k03.equals("paid_true")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1277302978:
                    if (k03.equals("in_profile_true")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1244318198:
                    if (k03.equals("from_you")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1204461845:
                    if (k03.equals("organic")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1068855134:
                    if (k03.equals("mobile")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -955130509:
                    if (k03.equals("in_profile_false")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -881377690:
                    if (k03.equals("tablet")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -309474065:
                    if (k03.equals("product")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -79587856:
                    if (k03.equals("paid_false")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 96673:
                    if (k03.equals("all")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 117588:
                    if (k03.equals("web")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 3433164:
                    if (k03.equals("paid")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 109770997:
                    if (k03.equals("story")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 112202875:
                    if (k03.equals("video")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1241528822:
                    if (k03.equals("not_from_you")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 1312628413:
                    if (k03.equals("standard")) {
                        c13 = 15;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39651a;
            switch (c13) {
                case 0:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40323j = (a5) this.f39652b.c(aVar);
                    boolean[] zArr = n4Var.f40330q;
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 1:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40317d = (a5) this.f39652b.c(aVar);
                    boolean[] zArr2 = n4Var.f40330q;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40315b = (a5) this.f39652b.c(aVar);
                    boolean[] zArr3 = n4Var.f40330q;
                    if (zArr3.length <= 1) {
                        break;
                    } else {
                        zArr3[1] = true;
                        break;
                    }
                case 3:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40320g = (a5) this.f39652b.c(aVar);
                    boolean[] zArr4 = n4Var.f40330q;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40318e = (a5) this.f39652b.c(aVar);
                    boolean[] zArr5 = n4Var.f40330q;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40316c = (a5) this.f39652b.c(aVar);
                    boolean[] zArr6 = n4Var.f40330q;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40327n = (a5) this.f39652b.c(aVar);
                    boolean[] zArr7 = n4Var.f40330q;
                    if (zArr7.length <= 13) {
                        break;
                    } else {
                        zArr7[13] = true;
                        break;
                    }
                case 7:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40324k = (a5) this.f39652b.c(aVar);
                    boolean[] zArr8 = n4Var.f40330q;
                    if (zArr8.length <= 10) {
                        break;
                    } else {
                        zArr8[10] = true;
                        break;
                    }
                case '\b':
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40322i = (a5) this.f39652b.c(aVar);
                    boolean[] zArr9 = n4Var.f40330q;
                    if (zArr9.length <= 8) {
                        break;
                    } else {
                        zArr9[8] = true;
                        break;
                    }
                case '\t':
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40314a = (a5) this.f39652b.c(aVar);
                    boolean[] zArr10 = n4Var.f40330q;
                    if (zArr10.length <= 0) {
                        break;
                    } else {
                        zArr10[0] = true;
                        break;
                    }
                case '\n':
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40329p = (a5) this.f39652b.c(aVar);
                    boolean[] zArr11 = n4Var.f40330q;
                    if (zArr11.length <= 15) {
                        break;
                    } else {
                        zArr11[15] = true;
                        break;
                    }
                case 11:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40321h = (a5) this.f39652b.c(aVar);
                    boolean[] zArr12 = n4Var.f40330q;
                    if (zArr12.length <= 7) {
                        break;
                    } else {
                        zArr12[7] = true;
                        break;
                    }
                case '\f':
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40326m = (a5) this.f39652b.c(aVar);
                    boolean[] zArr13 = n4Var.f40330q;
                    if (zArr13.length <= 12) {
                        break;
                    } else {
                        zArr13[12] = true;
                        break;
                    }
                case '\r':
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40328o = (a5) this.f39652b.c(aVar);
                    boolean[] zArr14 = n4Var.f40330q;
                    if (zArr14.length <= 14) {
                        break;
                    } else {
                        zArr14[14] = true;
                        break;
                    }
                case 14:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40319f = (a5) this.f39652b.c(aVar);
                    boolean[] zArr15 = n4Var.f40330q;
                    if (zArr15.length <= 5) {
                        break;
                    } else {
                        zArr15[5] = true;
                        break;
                    }
                case 15:
                    if (this.f39652b == null) {
                        this.f39652b = a.cb.q(oVar, a5.class);
                    }
                    n4Var.f40325l = (a5) this.f39652b.c(aVar);
                    boolean[] zArr16 = n4Var.f40330q;
                    if (zArr16.length <= 11) {
                        break;
                    } else {
                        zArr16[11] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new o4(n4Var.f40314a, n4Var.f40315b, n4Var.f40316c, n4Var.f40317d, n4Var.f40318e, n4Var.f40319f, n4Var.f40320g, n4Var.f40321h, n4Var.f40322i, n4Var.f40323j, n4Var.f40324k, n4Var.f40325l, n4Var.f40326m, n4Var.f40327n, n4Var.f40328o, n4Var.f40329p, n4Var.f40330q, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        a5 a5Var;
        a5 a5Var2;
        a5 a5Var3;
        a5 a5Var4;
        a5 a5Var5;
        a5 a5Var6;
        a5 a5Var7;
        a5 a5Var8;
        a5 a5Var9;
        a5 a5Var10;
        a5 a5Var11;
        a5 a5Var12;
        a5 a5Var13;
        a5 a5Var14;
        a5 a5Var15;
        a5 a5Var16;
        o4 o4Var = (o4) obj;
        if (o4Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o4Var.f40622q;
        int length = zArr.length;
        nm.o oVar = this.f39651a;
        if (length > 0 && zArr[0]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar = this.f39652b;
            um.c h10 = cVar.h("all");
            a5Var16 = o4Var.f40606a;
            mVar.e(h10, a5Var16);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar2 = this.f39652b;
            um.c h13 = cVar.h("from_you");
            a5Var15 = o4Var.f40607b;
            mVar2.e(h13, a5Var15);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar3 = this.f39652b;
            um.c h14 = cVar.h("in_profile_false");
            a5Var14 = o4Var.f40608c;
            mVar3.e(h14, a5Var14);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar4 = this.f39652b;
            um.c h15 = cVar.h("in_profile_true");
            a5Var13 = o4Var.f40609d;
            mVar4.e(h15, a5Var13);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar5 = this.f39652b;
            um.c h16 = cVar.h("mobile");
            a5Var12 = o4Var.f40610e;
            mVar5.e(h16, a5Var12);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar6 = this.f39652b;
            um.c h17 = cVar.h("not_from_you");
            a5Var11 = o4Var.f40611f;
            mVar6.e(h17, a5Var11);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar7 = this.f39652b;
            um.c h18 = cVar.h("organic");
            a5Var10 = o4Var.f40612g;
            mVar7.e(h18, a5Var10);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar8 = this.f39652b;
            um.c h19 = cVar.h("paid");
            a5Var9 = o4Var.f40613h;
            mVar8.e(h19, a5Var9);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar9 = this.f39652b;
            um.c h23 = cVar.h("paid_false");
            a5Var8 = o4Var.f40614i;
            mVar9.e(h23, a5Var8);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar10 = this.f39652b;
            um.c h24 = cVar.h("paid_true");
            a5Var7 = o4Var.f40615j;
            mVar10.e(h24, a5Var7);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar11 = this.f39652b;
            um.c h25 = cVar.h("product");
            a5Var6 = o4Var.f40616k;
            mVar11.e(h25, a5Var6);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar12 = this.f39652b;
            um.c h26 = cVar.h("standard");
            a5Var5 = o4Var.f40617l;
            mVar12.e(h26, a5Var5);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar13 = this.f39652b;
            um.c h27 = cVar.h("story");
            a5Var4 = o4Var.f40618m;
            mVar13.e(h27, a5Var4);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar14 = this.f39652b;
            um.c h28 = cVar.h("tablet");
            a5Var3 = o4Var.f40619n;
            mVar14.e(h28, a5Var3);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar15 = this.f39652b;
            um.c h29 = cVar.h("video");
            a5Var2 = o4Var.f40620o;
            mVar15.e(h29, a5Var2);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f39652b == null) {
                this.f39652b = a.cb.q(oVar, a5.class);
            }
            nm.m mVar16 = this.f39652b;
            um.c h33 = cVar.h("web");
            a5Var = o4Var.f40621p;
            mVar16.e(h33, a5Var);
        }
        cVar.g();
    }
}
