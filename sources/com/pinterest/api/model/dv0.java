package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class dv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36970a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36971b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36972c;

    public dv0(nm.o oVar) {
        this.f36970a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cv0 cv0Var = new cv0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1897185317:
                    if (k03.equals("start_x")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1897185316:
                    if (k03.equals("start_y")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 96651796:
                    if (k03.equals("end_x")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 96651797:
                    if (k03.equals("end_y")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36970a;
            if (c13 == 0) {
                if (this.f36971b == null) {
                    this.f36971b = a.cb.q(oVar, Double.class);
                }
                cv0Var.f36541e = (Double) this.f36971b.c(aVar);
                boolean[] zArr = cv0Var.f36543g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f36971b == null) {
                    this.f36971b = a.cb.q(oVar, Double.class);
                }
                cv0Var.f36542f = (Double) this.f36971b.c(aVar);
                boolean[] zArr2 = cv0Var.f36543g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f36972c == null) {
                    this.f36972c = a.cb.q(oVar, String.class);
                }
                cv0Var.f36537a = (String) this.f36972c.c(aVar);
                boolean[] zArr3 = cv0Var.f36543g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f36971b == null) {
                    this.f36971b = a.cb.q(oVar, Double.class);
                }
                cv0Var.f36539c = (Double) this.f36971b.c(aVar);
                boolean[] zArr4 = cv0Var.f36543g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f36971b == null) {
                    this.f36971b = a.cb.q(oVar, Double.class);
                }
                cv0Var.f36540d = (Double) this.f36971b.c(aVar);
                boolean[] zArr5 = cv0Var.f36543g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36972c == null) {
                    this.f36972c = a.cb.q(oVar, String.class);
                }
                cv0Var.f36538b = (String) this.f36972c.c(aVar);
                boolean[] zArr6 = cv0Var.f36543g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new fv0(cv0Var.f36537a, cv0Var.f36538b, cv0Var.f36539c, cv0Var.f36540d, cv0Var.f36541e, cv0Var.f36542f, cv0Var.f36543g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        String str;
        String str2;
        fv0 fv0Var = (fv0) obj;
        if (fv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fv0Var.f37820g;
        int length = zArr.length;
        nm.o oVar = this.f36970a;
        if (length > 0 && zArr[0]) {
            if (this.f36972c == null) {
                this.f36972c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36972c;
            um.c h10 = cVar.h("id");
            str2 = fv0Var.f37814a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36972c == null) {
                this.f36972c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36972c;
            um.c h13 = cVar.h("node_id");
            str = fv0Var.f37815b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36971b == null) {
                this.f36971b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f36971b;
            um.c h14 = cVar.h("end_x");
            d15 = fv0Var.f37816c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36971b == null) {
                this.f36971b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f36971b;
            um.c h15 = cVar.h("end_y");
            d14 = fv0Var.f37817d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36971b == null) {
                this.f36971b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f36971b;
            um.c h16 = cVar.h("start_x");
            d13 = fv0Var.f37818e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36971b == null) {
                this.f36971b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f36971b;
            um.c h17 = cVar.h("start_y");
            d2 = fv0Var.f37819f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
