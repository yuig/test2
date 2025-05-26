package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class nh0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40399a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40400b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40401c;

    public nh0(nm.o oVar) {
        this.f40399a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mh0 mh0Var = new mh0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1728912294) {
                if (hashCode != -934964668) {
                    if (hashCode != 3355) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("reason")) {
                    c13 = 1;
                }
            } else if (k03.equals("show_warning")) {
                c13 = 0;
            }
            nm.o oVar = this.f40399a;
            if (c13 == 0) {
                if (this.f40400b == null) {
                    this.f40400b = a.cb.q(oVar, Boolean.class);
                }
                mh0Var.f40111d = (Boolean) this.f40400b.c(aVar);
                boolean[] zArr = mh0Var.f40112e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f40401c == null) {
                    this.f40401c = a.cb.q(oVar, String.class);
                }
                mh0Var.f40110c = (String) this.f40401c.c(aVar);
                boolean[] zArr2 = mh0Var.f40112e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f40401c == null) {
                    this.f40401c = a.cb.q(oVar, String.class);
                }
                mh0Var.f40108a = (String) this.f40401c.c(aVar);
                boolean[] zArr3 = mh0Var.f40112e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40401c == null) {
                    this.f40401c = a.cb.q(oVar, String.class);
                }
                mh0Var.f40109b = (String) this.f40401c.c(aVar);
                boolean[] zArr4 = mh0Var.f40112e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ph0(mh0Var.f40108a, mh0Var.f40109b, mh0Var.f40110c, mh0Var.f40111d, mh0Var.f40112e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        String str;
        String str2;
        String str3;
        ph0 ph0Var = (ph0) obj;
        if (ph0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ph0Var.f40990e;
        int length = zArr.length;
        nm.o oVar = this.f40399a;
        if (length > 0 && zArr[0]) {
            if (this.f40401c == null) {
                this.f40401c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40401c;
            um.c h10 = cVar.h("id");
            str3 = ph0Var.f40986a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40401c == null) {
                this.f40401c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40401c;
            um.c h13 = cVar.h("node_id");
            str2 = ph0Var.f40987b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40401c == null) {
                this.f40401c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40401c;
            um.c h14 = cVar.h("reason");
            str = ph0Var.f40988c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40400b == null) {
                this.f40400b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f40400b;
            um.c h15 = cVar.h("show_warning");
            bool = ph0Var.f40989d;
            mVar4.e(h15, bool);
        }
        cVar.g();
    }
}
