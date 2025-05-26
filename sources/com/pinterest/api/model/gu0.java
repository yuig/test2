package com.pinterest.api.model;

import com.pinterest.api.model.fu0;

/* loaded from: classes3.dex */
public final class gu0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38151a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38152b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38153c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38154d;

    public gu0(nm.o oVar) {
        this.f38151a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        eu0 eu0Var = new eu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -629573119) {
                if (hashCode != -437119911) {
                    if (hashCode != 3355) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("dsp_source")) {
                    c13 = 1;
                }
            } else if (k03.equals("privacy_data")) {
                c13 = 0;
            }
            nm.o oVar = this.f38151a;
            if (c13 == 0) {
                if (this.f38152b == null) {
                    this.f38152b = a.cb.q(oVar, e70.class);
                }
                eu0Var.f37352d = (e70) this.f38152b.c(aVar);
                boolean[] zArr = eu0Var.f37353e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38154d == null) {
                    this.f38154d = a.cb.q(oVar, fu0.a.class);
                }
                eu0Var.f37351c = (fu0.a) this.f38154d.c(aVar);
                boolean[] zArr2 = eu0Var.f37353e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f38153c == null) {
                    this.f38153c = a.cb.q(oVar, String.class);
                }
                eu0Var.f37349a = (String) this.f38153c.c(aVar);
                boolean[] zArr3 = eu0Var.f37353e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f38153c == null) {
                    this.f38153c = a.cb.q(oVar, String.class);
                }
                eu0Var.f37350b = (String) this.f38153c.c(aVar);
                boolean[] zArr4 = eu0Var.f37353e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new fu0(eu0Var.f37349a, eu0Var.f37350b, eu0Var.f37351c, eu0Var.f37352d, eu0Var.f37353e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        e70 e70Var;
        fu0.a aVar;
        String str;
        String str2;
        fu0 fu0Var = (fu0) obj;
        if (fu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fu0Var.f37813e;
        int length = zArr.length;
        nm.o oVar = this.f38151a;
        if (length > 0 && zArr[0]) {
            if (this.f38153c == null) {
                this.f38153c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38153c;
            um.c h10 = cVar.h("id");
            str2 = fu0Var.f37809a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38153c == null) {
                this.f38153c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38153c;
            um.c h13 = cVar.h("node_id");
            str = fu0Var.f37810b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38154d == null) {
                this.f38154d = a.cb.q(oVar, fu0.a.class);
            }
            nm.m mVar3 = this.f38154d;
            um.c h14 = cVar.h("dsp_source");
            aVar = fu0Var.f37811c;
            mVar3.e(h14, aVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38152b == null) {
                this.f38152b = a.cb.q(oVar, e70.class);
            }
            nm.m mVar4 = this.f38152b;
            um.c h15 = cVar.h("privacy_data");
            e70Var = fu0Var.f37812d;
            mVar4.e(h15, e70Var);
        }
        cVar.g();
    }
}
