package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wp extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43322a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43323b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43324c;

    public wp(nm.o oVar) {
        this.f43322a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vp vpVar = new vp(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1284002641:
                    if (k03.equals("royalty_free_state")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43322a;
            if (c13 == 0) {
                if (this.f43324c == null) {
                    this.f43324c = a.cb.q(oVar, String.class);
                }
                vpVar.f42944a = (String) this.f43324c.c(aVar);
                boolean[] zArr = vpVar.f42950g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f43324c == null) {
                    this.f43324c = a.cb.q(oVar, String.class);
                }
                vpVar.f42946c = (String) this.f43324c.c(aVar);
                boolean[] zArr2 = vpVar.f42950g;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f43324c == null) {
                    this.f43324c = a.cb.q(oVar, String.class);
                }
                vpVar.f42949f = (String) this.f43324c.c(aVar);
                boolean[] zArr3 = vpVar.f42950g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f43324c == null) {
                    this.f43324c = a.cb.q(oVar, String.class);
                }
                vpVar.f42948e = (String) this.f43324c.c(aVar);
                boolean[] zArr4 = vpVar.f42950g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f43323b == null) {
                    this.f43323b = a.cb.q(oVar, Double.class);
                }
                vpVar.f42947d = (Double) this.f43323b.c(aVar);
                boolean[] zArr5 = vpVar.f42950g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43324c == null) {
                    this.f43324c = a.cb.q(oVar, String.class);
                }
                vpVar.f42945b = (String) this.f43324c.c(aVar);
                boolean[] zArr6 = vpVar.f42950g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new yp(vpVar.f42944a, vpVar.f42945b, vpVar.f42946c, vpVar.f42947d, vpVar.f42948e, vpVar.f42949f, vpVar.f42950g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Double d2;
        String str3;
        String str4;
        String str5;
        yp ypVar = (yp) obj;
        if (ypVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ypVar.f44099g;
        int length = zArr.length;
        nm.o oVar = this.f43322a;
        if (length > 0 && zArr[0]) {
            if (this.f43324c == null) {
                this.f43324c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43324c;
            um.c h10 = cVar.h("id");
            str5 = ypVar.f44093a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43324c == null) {
                this.f43324c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43324c;
            um.c h13 = cVar.h("node_id");
            str4 = ypVar.f44094b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43324c == null) {
                this.f43324c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43324c;
            um.c h14 = cVar.h("name");
            str3 = ypVar.f44095c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43323b == null) {
                this.f43323b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f43323b;
            um.c h15 = cVar.h("royalty_free_state");
            d2 = ypVar.f44096d;
            mVar4.e(h15, d2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43324c == null) {
                this.f43324c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43324c;
            um.c h16 = cVar.h("thumbnail_image_url");
            str2 = ypVar.f44097e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43324c == null) {
                this.f43324c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f43324c;
            um.c h17 = cVar.h("type");
            str = ypVar.f44098f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
