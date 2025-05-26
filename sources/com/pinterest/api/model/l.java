package com.pinterest.api.model;

import com.pinterest.api.model.k;

/* loaded from: classes.dex */
public final class l extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39571a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39572b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39573c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39574d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39575e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f39576f;

    public l(nm.o oVar) {
        this.f39571a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n nVar = new n(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1883717471:
                    if (k03.equals("pin_promotion_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -702722614:
                    if (k03.equals("creative_type")) {
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
                case 1046748518:
                    if (k03.equals("closeup_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1205427403:
                    if (k03.equals("destination_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1939875509:
                    if (k03.equals("media_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39571a;
            switch (c13) {
                case 0:
                    if (this.f39576f == null) {
                        this.f39576f = a.cb.q(oVar, String.class);
                    }
                    nVar.f40276g = (String) this.f39576f.c(aVar);
                    boolean[] zArr = nVar.f40277h;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f39573c == null) {
                        this.f39573c = a.cb.q(oVar, k.b.class);
                    }
                    nVar.f40273d = (k.b) this.f39573c.c(aVar);
                    boolean[] zArr2 = nVar.f40277h;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f39576f == null) {
                        this.f39576f = a.cb.q(oVar, String.class);
                    }
                    nVar.b((String) this.f39576f.c(aVar));
                    break;
                case 3:
                    if (this.f39572b == null) {
                        this.f39572b = a.cb.q(oVar, k.a.class);
                    }
                    nVar.f40272c = (k.a) this.f39572b.c(aVar);
                    boolean[] zArr3 = nVar.f40277h;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 4:
                    if (this.f39574d == null) {
                        this.f39574d = a.cb.q(oVar, k.c.class);
                    }
                    nVar.f40274e = (k.c) this.f39574d.c(aVar);
                    boolean[] zArr4 = nVar.f40277h;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 5:
                    if (this.f39575e == null) {
                        this.f39575e = a.cb.q(oVar, k.d.class);
                    }
                    nVar.f40275f = (k.d) this.f39575e.c(aVar);
                    boolean[] zArr5 = nVar.f40277h;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 6:
                    if (this.f39576f == null) {
                        this.f39576f = a.cb.q(oVar, String.class);
                    }
                    nVar.a((String) this.f39576f.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new k(nVar.f40270a, nVar.f40271b, nVar.f40272c, nVar.f40273d, nVar.f40274e, nVar.f40275f, nVar.f40276g, nVar.f40277h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        k.d dVar;
        k.c cVar2;
        k.b bVar;
        k.a aVar;
        String str2;
        String str3;
        k kVar = (k) obj;
        if (kVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kVar.f39197h;
        int length = zArr.length;
        nm.o oVar = this.f39571a;
        if (length > 0 && zArr[0]) {
            if (this.f39576f == null) {
                this.f39576f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39576f;
            um.c h10 = cVar.h("id");
            str3 = kVar.f39190a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39576f == null) {
                this.f39576f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39576f;
            um.c h13 = cVar.h("node_id");
            str2 = kVar.f39191b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39572b == null) {
                this.f39572b = a.cb.q(oVar, k.a.class);
            }
            nm.m mVar3 = this.f39572b;
            um.c h14 = cVar.h("closeup_type");
            aVar = kVar.f39192c;
            mVar3.e(h14, aVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39573c == null) {
                this.f39573c = a.cb.q(oVar, k.b.class);
            }
            nm.m mVar4 = this.f39573c;
            um.c h15 = cVar.h("creative_type");
            bVar = kVar.f39193d;
            mVar4.e(h15, bVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39574d == null) {
                this.f39574d = a.cb.q(oVar, k.c.class);
            }
            nm.m mVar5 = this.f39574d;
            um.c h16 = cVar.h("destination_type");
            cVar2 = kVar.f39194e;
            mVar5.e(h16, cVar2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39575e == null) {
                this.f39575e = a.cb.q(oVar, k.d.class);
            }
            nm.m mVar6 = this.f39575e;
            um.c h17 = cVar.h("media_type");
            dVar = kVar.f39195f;
            mVar6.e(h17, dVar);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39576f == null) {
                this.f39576f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39576f;
            um.c h18 = cVar.h("pin_promotion_id");
            str = kVar.f39196g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
