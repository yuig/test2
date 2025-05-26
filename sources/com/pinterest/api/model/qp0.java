package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class qp0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41351a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41352b;

    public qp0(nm.o oVar) {
        this.f41351a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pp0 pp0Var = new pp0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1013203553) {
                if (hashCode != 1589901396) {
                    if (hashCode == 2026633298 && k03.equals("cooking_time")) {
                        c13 = 2;
                    }
                } else if (k03.equals("serving_size")) {
                    c13 = 1;
                }
            } else if (k03.equals("prep_time")) {
                c13 = 0;
            }
            nm.o oVar = this.f41351a;
            if (c13 == 0) {
                if (this.f41352b == null) {
                    this.f41352b = a.cb.q(oVar, Integer.class);
                }
                pp0Var.c((Integer) this.f41352b.c(aVar));
            } else if (c13 == 1) {
                if (this.f41352b == null) {
                    this.f41352b = a.cb.q(oVar, Integer.class);
                }
                pp0Var.d((Integer) this.f41352b.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41352b == null) {
                    this.f41352b = a.cb.q(oVar, Integer.class);
                }
                pp0Var.b((Integer) this.f41352b.c(aVar));
            }
        }
        aVar.g();
        return pp0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        sp0 sp0Var = (sp0) obj;
        if (sp0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sp0Var.f41966d;
        int length = zArr.length;
        nm.o oVar = this.f41351a;
        if (length > 0 && zArr[0]) {
            if (this.f41352b == null) {
                this.f41352b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f41352b;
            um.c h10 = cVar.h("cooking_time");
            num3 = sp0Var.f41963a;
            mVar.e(h10, num3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41352b == null) {
                this.f41352b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f41352b;
            um.c h13 = cVar.h("prep_time");
            num2 = sp0Var.f41964b;
            mVar2.e(h13, num2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41352b == null) {
                this.f41352b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41352b;
            um.c h14 = cVar.h("serving_size");
            num = sp0Var.f41965c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
