package com.pinterest.api.model;

/* renamed from: com.pinterest.api.model.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38755a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38756b;

    public Cif(nm.o oVar) {
        this.f38755a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hf hfVar = new hf(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3059528) {
                if (hashCode != 3449389) {
                    if (hashCode == 110549828 && k03.equals("total")) {
                        c13 = 2;
                    }
                } else if (k03.equals("prep")) {
                    c13 = 1;
                }
            } else if (k03.equals("cook")) {
                c13 = 0;
            }
            nm.o oVar = this.f38755a;
            if (c13 == 0) {
                if (this.f38756b == null) {
                    this.f38756b = a.cb.q(oVar, gf.class);
                }
                hfVar.f38407a = (gf) this.f38756b.c(aVar);
                boolean[] zArr = hfVar.f38410d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f38756b == null) {
                    this.f38756b = a.cb.q(oVar, gf.class);
                }
                hfVar.f38408b = (gf) this.f38756b.c(aVar);
                boolean[] zArr2 = hfVar.f38410d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f38756b == null) {
                    this.f38756b = a.cb.q(oVar, gf.class);
                }
                hfVar.f38409c = (gf) this.f38756b.c(aVar);
                boolean[] zArr3 = hfVar.f38410d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new kf(hfVar.f38407a, hfVar.f38408b, hfVar.f38409c, hfVar.f38410d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        gf gfVar;
        gf gfVar2;
        gf gfVar3;
        kf kfVar = (kf) obj;
        if (kfVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kfVar.f39426d;
        int length = zArr.length;
        nm.o oVar = this.f38755a;
        if (length > 0 && zArr[0]) {
            if (this.f38756b == null) {
                this.f38756b = a.cb.q(oVar, gf.class);
            }
            nm.m mVar = this.f38756b;
            um.c h10 = cVar.h("cook");
            gfVar3 = kfVar.f39423a;
            mVar.e(h10, gfVar3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38756b == null) {
                this.f38756b = a.cb.q(oVar, gf.class);
            }
            nm.m mVar2 = this.f38756b;
            um.c h13 = cVar.h("prep");
            gfVar2 = kfVar.f39424b;
            mVar2.e(h13, gfVar2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38756b == null) {
                this.f38756b = a.cb.q(oVar, gf.class);
            }
            nm.m mVar3 = this.f38756b;
            um.c h14 = cVar.h("total");
            gfVar = kfVar.f39425c;
            mVar3.e(h14, gfVar);
        }
        cVar.g();
    }
}
