package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class vg0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42840a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42841b;

    public vg0(nm.o oVar) {
        this.f42840a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ug0 ug0Var = new ug0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -906953308) {
                if (hashCode != 3355) {
                    if (hashCode == 3373707 && k03.equals("name")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("tab_type")) {
                c13 = 0;
            }
            nm.o oVar = this.f42840a;
            if (c13 == 0) {
                if (this.f42841b == null) {
                    this.f42841b = a.cb.q(oVar, String.class);
                }
                ug0Var.f42557c = (String) this.f42841b.c(aVar);
                boolean[] zArr = ug0Var.f42558d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f42841b == null) {
                    this.f42841b = a.cb.q(oVar, String.class);
                }
                ug0Var.f42555a = (String) this.f42841b.c(aVar);
                boolean[] zArr2 = ug0Var.f42558d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42841b == null) {
                    this.f42841b = a.cb.q(oVar, String.class);
                }
                ug0Var.f42556b = (String) this.f42841b.c(aVar);
                boolean[] zArr3 = ug0Var.f42558d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new xg0(ug0Var.f42555a, ug0Var.f42556b, ug0Var.f42557c, ug0Var.f42558d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        xg0 xg0Var = (xg0) obj;
        if (xg0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xg0Var.f43685d;
        int length = zArr.length;
        nm.o oVar = this.f42840a;
        if (length > 0 && zArr[0]) {
            if (this.f42841b == null) {
                this.f42841b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42841b;
            um.c h10 = cVar.h("id");
            str3 = xg0Var.f43682a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42841b == null) {
                this.f42841b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42841b;
            um.c h13 = cVar.h("name");
            str2 = xg0Var.f43683b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42841b == null) {
                this.f42841b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42841b;
            um.c h14 = cVar.h("tab_type");
            str = xg0Var.f43684c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
