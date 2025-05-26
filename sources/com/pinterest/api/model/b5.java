package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class b5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35972a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35973b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35974c;

    public b5(nm.o oVar) {
        this.f35972a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        d5 d5Var = new d5(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -604268962) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("pin_click")) {
                c13 = 0;
            }
            nm.o oVar = this.f35972a;
            if (c13 == 0) {
                if (this.f35973b == null) {
                    this.f35973b = a.cb.q(oVar, q3.class);
                }
                d5Var.f36655c = (q3) this.f35973b.c(aVar);
                boolean[] zArr = d5Var.f36656d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f35974c == null) {
                    this.f35974c = a.cb.q(oVar, String.class);
                }
                d5Var.f36653a = (String) this.f35974c.c(aVar);
                boolean[] zArr2 = d5Var.f36656d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f35974c == null) {
                    this.f35974c = a.cb.q(oVar, String.class);
                }
                d5Var.f36654b = (String) this.f35974c.c(aVar);
                boolean[] zArr3 = d5Var.f36656d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new e5(d5Var.f36653a, d5Var.f36654b, d5Var.f36655c, d5Var.f36656d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        q3 q3Var;
        String str;
        String str2;
        e5 e5Var = (e5) obj;
        if (e5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e5Var.f37181d;
        int length = zArr.length;
        nm.o oVar = this.f35972a;
        if (length > 0 && zArr[0]) {
            if (this.f35974c == null) {
                this.f35974c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35974c;
            um.c h10 = cVar.h("id");
            str2 = e5Var.f37178a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35974c == null) {
                this.f35974c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35974c;
            um.c h13 = cVar.h("node_id");
            str = e5Var.f37179b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35973b == null) {
                this.f35973b = a.cb.q(oVar, q3.class);
            }
            nm.m mVar3 = this.f35973b;
            um.c h14 = cVar.h("pin_click");
            q3Var = e5Var.f37180c;
            mVar3.e(h14, q3Var);
        }
        cVar.g();
    }
}
