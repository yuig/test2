package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class bw0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36223a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36224b;

    public bw0(nm.o oVar) {
        this.f36223a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        aw0 aw0Var = new aw0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1221270899) {
                if (hashCode != 3355) {
                    if (hashCode != 3556653) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("text")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("header")) {
                c13 = 0;
            }
            nm.o oVar = this.f36223a;
            if (c13 == 0) {
                if (this.f36224b == null) {
                    this.f36224b = a.cb.q(oVar, String.class);
                }
                aw0Var.f35880c = (String) this.f36224b.c(aVar);
                boolean[] zArr = aw0Var.f35882e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f36224b == null) {
                    this.f36224b = a.cb.q(oVar, String.class);
                }
                aw0Var.f35878a = (String) this.f36224b.c(aVar);
                boolean[] zArr2 = aw0Var.f35882e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f36224b == null) {
                    this.f36224b = a.cb.q(oVar, String.class);
                }
                aw0Var.f35881d = (String) this.f36224b.c(aVar);
                boolean[] zArr3 = aw0Var.f35882e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f36224b == null) {
                    this.f36224b = a.cb.q(oVar, String.class);
                }
                aw0Var.f35879b = (String) this.f36224b.c(aVar);
                boolean[] zArr4 = aw0Var.f35882e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new dw0(aw0Var.f35878a, aw0Var.f35879b, aw0Var.f35880c, aw0Var.f35881d, aw0Var.f35882e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        dw0 dw0Var = (dw0) obj;
        if (dw0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dw0Var.f36982e;
        int length = zArr.length;
        nm.o oVar = this.f36223a;
        if (length > 0 && zArr[0]) {
            if (this.f36224b == null) {
                this.f36224b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36224b;
            um.c h10 = cVar.h("id");
            str4 = dw0Var.f36978a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36224b == null) {
                this.f36224b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36224b;
            um.c h13 = cVar.h("node_id");
            str3 = dw0Var.f36979b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36224b == null) {
                this.f36224b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36224b;
            um.c h14 = cVar.h("header");
            str2 = dw0Var.f36980c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36224b == null) {
                this.f36224b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36224b;
            um.c h15 = cVar.h("text");
            str = dw0Var.f36981d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
