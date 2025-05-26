package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes.dex */
public final class ie0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38753a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38754b;

    public ie0(nm.o oVar) {
        this.f38753a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        he0 he0Var = new he0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "resurrection_dt")) {
                if (this.f38754b == null) {
                    this.f38754b = a.cb.q(this.f38753a, Date.class);
                }
                he0Var.b((Date) this.f38754b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return he0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date;
        ke0 ke0Var = (ke0) obj;
        if (ke0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ke0Var.f39422b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f38754b == null) {
                this.f38754b = a.cb.q(this.f38753a, Date.class);
            }
            nm.m mVar = this.f38754b;
            um.c h10 = cVar.h("resurrection_dt");
            date = ke0Var.f39421a;
            mVar.e(h10, date);
        }
        cVar.g();
    }
}
