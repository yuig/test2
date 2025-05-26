package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class fj0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37713a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37714b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37715c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37716d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37717e;

    public fj0(nm.o oVar) {
        this.f37713a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ej0 ej0Var = new ej0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1442803611:
                    if (k03.equals("image_size")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3017257:
                    if (k03.equals("bbox")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 245875891:
                    if (k03.equals("image_base64")) {
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
            nm.o oVar = this.f37713a;
            if (c13 == 0) {
                if (this.f37716d == null) {
                    this.f37716d = a.cb.q(oVar, pj0.class);
                }
                ej0Var.f37280e = (pj0) this.f37716d.c(aVar);
                boolean[] zArr = ej0Var.f37282g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f37717e == null) {
                    this.f37717e = a.cb.q(oVar, String.class);
                }
                ej0Var.f37276a = (String) this.f37717e.c(aVar);
                boolean[] zArr2 = ej0Var.f37282g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f37714b == null) {
                    this.f37714b = a.cb.q(oVar, f30.class);
                }
                ej0Var.f37281f = (f30) this.f37714b.c(aVar);
                boolean[] zArr3 = ej0Var.f37282g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f37715c == null) {
                    this.f37715c = a.cb.q(oVar, lj0.class);
                }
                ej0Var.f37278c = (lj0) this.f37715c.c(aVar);
                boolean[] zArr4 = ej0Var.f37282g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f37717e == null) {
                    this.f37717e = a.cb.q(oVar, String.class);
                }
                ej0Var.f37279d = (String) this.f37717e.c(aVar);
                boolean[] zArr5 = ej0Var.f37282g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f37717e == null) {
                    this.f37717e = a.cb.q(oVar, String.class);
                }
                ej0Var.f37277b = (String) this.f37717e.c(aVar);
                boolean[] zArr6 = ej0Var.f37282g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new hj0(ej0Var.f37276a, ej0Var.f37277b, ej0Var.f37278c, ej0Var.f37279d, ej0Var.f37280e, ej0Var.f37281f, ej0Var.f37282g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        pj0 pj0Var;
        String str;
        lj0 lj0Var;
        String str2;
        String str3;
        hj0 hj0Var = (hj0) obj;
        if (hj0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hj0Var.f38470g;
        int length = zArr.length;
        nm.o oVar = this.f37713a;
        if (length > 0 && zArr[0]) {
            if (this.f37717e == null) {
                this.f37717e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37717e;
            um.c h10 = cVar.h("id");
            str3 = hj0Var.f38464a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37717e == null) {
                this.f37717e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37717e;
            um.c h13 = cVar.h("node_id");
            str2 = hj0Var.f38465b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37715c == null) {
                this.f37715c = a.cb.q(oVar, lj0.class);
            }
            nm.m mVar3 = this.f37715c;
            um.c h14 = cVar.h("bbox");
            lj0Var = hj0Var.f38466c;
            mVar3.e(h14, lj0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37717e == null) {
                this.f37717e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37717e;
            um.c h15 = cVar.h("image_base64");
            str = hj0Var.f38467d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37716d == null) {
                this.f37716d = a.cb.q(oVar, pj0.class);
            }
            nm.m mVar5 = this.f37716d;
            um.c h16 = cVar.h("image_size");
            pj0Var = hj0Var.f38468e;
            mVar5.e(h16, pj0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37714b == null) {
                this.f37714b = a.cb.q(oVar, f30.class);
            }
            nm.m mVar6 = this.f37714b;
            um.c h17 = cVar.h("pin");
            f30Var = hj0Var.f38469f;
            mVar6.e(h17, f30Var);
        }
        cVar.g();
    }
}
