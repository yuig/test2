package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class v20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42722a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42723b;

    public v20(nm.o oVar) {
        this.f42722a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u20 u20Var = new u20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3373707) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("name")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f42722a;
            if (c13 == 0) {
                if (this.f42723b == null) {
                    this.f42723b = a.cb.q(oVar, String.class);
                }
                u20Var.f42393a = (String) this.f42723b.c(aVar);
                boolean[] zArr = u20Var.f42396d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42723b == null) {
                    this.f42723b = a.cb.q(oVar, String.class);
                }
                u20Var.f42395c = (String) this.f42723b.c(aVar);
                boolean[] zArr2 = u20Var.f42396d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42723b == null) {
                    this.f42723b = a.cb.q(oVar, String.class);
                }
                u20Var.a((String) this.f42723b.c(aVar));
            }
        }
        aVar.g();
        return new x20(u20Var.f42393a, u20Var.f42394b, u20Var.f42395c, u20Var.f42396d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        x20 x20Var = (x20) obj;
        if (x20Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = x20Var.f43543d;
        int length = zArr.length;
        nm.o oVar = this.f42722a;
        if (length > 0 && zArr[0]) {
            if (this.f42723b == null) {
                this.f42723b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42723b;
            um.c h10 = cVar.h("id");
            str3 = x20Var.f43540a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42723b == null) {
                this.f42723b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42723b;
            um.c h13 = cVar.h("node_id");
            str2 = x20Var.f43541b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42723b == null) {
                this.f42723b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42723b;
            um.c h14 = cVar.h("name");
            str = x20Var.f43542c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
