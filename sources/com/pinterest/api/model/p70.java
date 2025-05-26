package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class p70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40899a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40900b;

    public p70(nm.o oVar) {
        this.f40899a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o70 o70Var = new o70(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1983029672:
                    if (k03.equals("shadeName")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1491869309:
                    if (k03.equals("productLine")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1491615543:
                    if (k03.equals("productType")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1274442605:
                    if (k03.equals("finish")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -787472718:
                    if (k03.equals("brandName")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 113949:
                    if (k03.equals("sku")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3183314:
                    if (k03.equals("gtin")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40899a;
            switch (c13) {
                case 0:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40642f = (String) this.f40900b.c(aVar);
                    boolean[] zArr = o70Var.f40644h;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40640d = (String) this.f40900b.c(aVar);
                    boolean[] zArr2 = o70Var.f40644h;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40641e = (String) this.f40900b.c(aVar);
                    boolean[] zArr3 = o70Var.f40644h;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40638b = (String) this.f40900b.c(aVar);
                    boolean[] zArr4 = o70Var.f40644h;
                    if (zArr4.length <= 1) {
                        break;
                    } else {
                        zArr4[1] = true;
                        break;
                    }
                case 4:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40637a = (String) this.f40900b.c(aVar);
                    boolean[] zArr5 = o70Var.f40644h;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40643g = (String) this.f40900b.c(aVar);
                    boolean[] zArr6 = o70Var.f40644h;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f40900b == null) {
                        this.f40900b = a.cb.q(oVar, String.class);
                    }
                    o70Var.f40639c = (String) this.f40900b.c(aVar);
                    boolean[] zArr7 = o70Var.f40644h;
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
        return new r70(o70Var.f40637a, o70Var.f40638b, o70Var.f40639c, o70Var.f40640d, o70Var.f40641e, o70Var.f40642f, o70Var.f40643g, o70Var.f40644h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        r70 r70Var = (r70) obj;
        if (r70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = r70Var.f41503h;
        int length = zArr.length;
        nm.o oVar = this.f40899a;
        if (length > 0 && zArr[0]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40900b;
            um.c h10 = cVar.h("brandName");
            str7 = r70Var.f41496a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40900b;
            um.c h13 = cVar.h("finish");
            str6 = r70Var.f41497b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40900b;
            um.c h14 = cVar.h("gtin");
            str5 = r70Var.f41498c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40900b;
            um.c h15 = cVar.h("productLine");
            str4 = r70Var.f41499d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40900b;
            um.c h16 = cVar.h("productType");
            str3 = r70Var.f41500e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40900b;
            um.c h17 = cVar.h("shadeName");
            str2 = r70Var.f41501f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40900b == null) {
                this.f40900b = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40900b;
            um.c h18 = cVar.h("sku");
            str = r70Var.f41502g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
