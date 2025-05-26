package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class vu0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42989a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42990b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42991c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42992d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42993e;

    public vu0(nm.o oVar) {
        this.f42989a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        uu0 uu0Var = new uu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1537026464:
                    if (k03.equals("property_scale")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1019361436:
                    if (k03.equals("property_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -165341369:
                    if (k03.equals("property_translation")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42989a;
            if (c13 == 0) {
                if (this.f42992d == null) {
                    this.f42992d = a.cb.q(oVar, bv0.class);
                }
                uu0Var.f42645c = (bv0) this.f42992d.c(aVar);
                boolean[] zArr = uu0Var.f42648f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f42990b == null) {
                    this.f42990b = a.cb.q(oVar, Integer.class);
                }
                uu0Var.f42647e = (Integer) this.f42990b.c(aVar);
                boolean[] zArr2 = uu0Var.f42648f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f42993e == null) {
                    this.f42993e = a.cb.q(oVar, fv0.class);
                }
                uu0Var.f42646d = (fv0) this.f42993e.c(aVar);
                boolean[] zArr3 = uu0Var.f42648f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f42991c == null) {
                    this.f42991c = a.cb.q(oVar, String.class);
                }
                uu0Var.f42643a = (String) this.f42991c.c(aVar);
                boolean[] zArr4 = uu0Var.f42648f;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f42991c == null) {
                    this.f42991c = a.cb.q(oVar, String.class);
                }
                uu0Var.f42644b = (String) this.f42991c.c(aVar);
                boolean[] zArr5 = uu0Var.f42648f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new xu0(uu0Var.f42643a, uu0Var.f42644b, uu0Var.f42645c, uu0Var.f42646d, uu0Var.f42647e, uu0Var.f42648f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        fv0 fv0Var;
        bv0 bv0Var;
        String str;
        String str2;
        xu0 xu0Var = (xu0) obj;
        if (xu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xu0Var.f43798f;
        int length = zArr.length;
        nm.o oVar = this.f42989a;
        if (length > 0 && zArr[0]) {
            if (this.f42991c == null) {
                this.f42991c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42991c;
            um.c h10 = cVar.h("id");
            str2 = xu0Var.f43793a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42991c == null) {
                this.f42991c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42991c;
            um.c h13 = cVar.h("node_id");
            str = xu0Var.f43794b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42992d == null) {
                this.f42992d = a.cb.q(oVar, bv0.class);
            }
            nm.m mVar3 = this.f42992d;
            um.c h14 = cVar.h("property_scale");
            bv0Var = xu0Var.f43795c;
            mVar3.e(h14, bv0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42993e == null) {
                this.f42993e = a.cb.q(oVar, fv0.class);
            }
            nm.m mVar4 = this.f42993e;
            um.c h15 = cVar.h("property_translation");
            fv0Var = xu0Var.f43796d;
            mVar4.e(h15, fv0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42990b == null) {
                this.f42990b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f42990b;
            um.c h16 = cVar.h("property_type");
            num = xu0Var.f43797e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
