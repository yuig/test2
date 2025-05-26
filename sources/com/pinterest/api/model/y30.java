package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class y30 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43935a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43936b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43937c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43938d;

    public y30(nm.o oVar) {
        this.f43935a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x30 x30Var = new x30(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1594228512) {
                if (hashCode != 3355) {
                    if (hashCode != 2114448504) {
                        if (hashCode == 2116721256 && k03.equals("latest_available_timestamp")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("is_realtime")) {
                c13 = 0;
            }
            nm.o oVar = this.f43935a;
            if (c13 == 0) {
                if (this.f43936b == null) {
                    this.f43936b = a.cb.q(oVar, Boolean.class);
                }
                x30Var.f43572c = (Boolean) this.f43936b.c(aVar);
                boolean[] zArr = x30Var.f43574e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43938d == null) {
                    this.f43938d = a.cb.q(oVar, String.class);
                }
                x30Var.f43570a = (String) this.f43938d.c(aVar);
                boolean[] zArr2 = x30Var.f43574e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43938d == null) {
                    this.f43938d = a.cb.q(oVar, String.class);
                }
                x30Var.f43571b = (String) this.f43938d.c(aVar);
                boolean[] zArr3 = x30Var.f43574e;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f43937c == null) {
                    this.f43937c = a.cb.q(oVar, Double.class);
                }
                x30Var.f43573d = (Double) this.f43937c.c(aVar);
                boolean[] zArr4 = x30Var.f43574e;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            }
        }
        aVar.g();
        return new a40(x30Var.f43570a, x30Var.f43571b, x30Var.f43572c, x30Var.f43573d, x30Var.f43574e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Boolean bool;
        String str;
        String str2;
        a40 a40Var = (a40) obj;
        if (a40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = a40Var.f35650e;
        int length = zArr.length;
        nm.o oVar = this.f43935a;
        if (length > 0 && zArr[0]) {
            if (this.f43938d == null) {
                this.f43938d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43938d;
            um.c h10 = cVar.h("id");
            str2 = a40Var.f35646a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43938d == null) {
                this.f43938d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43938d;
            um.c h13 = cVar.h("node_id");
            str = a40Var.f35647b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43936b == null) {
                this.f43936b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f43936b;
            um.c h14 = cVar.h("is_realtime");
            bool = a40Var.f35648c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43937c == null) {
                this.f43937c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f43937c;
            um.c h15 = cVar.h("latest_available_timestamp");
            d2 = a40Var.f35649d;
            mVar4.e(h15, d2);
        }
        cVar.g();
    }
}
