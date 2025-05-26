package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ju0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39153a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39154b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39155c;

    public ju0(nm.o oVar) {
        this.f39153a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        iu0 iu0Var = new iu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 118314:
                    if (k03.equals("x_1")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 118315:
                    if (k03.equals("x_2")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 119275:
                    if (k03.equals("y_1")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 119276:
                    if (k03.equals("y_2")) {
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
            nm.o oVar = this.f39153a;
            if (c13 == 0) {
                if (this.f39155c == null) {
                    this.f39155c = a.cb.q(oVar, String.class);
                }
                iu0Var.f38864a = (String) this.f39155c.c(aVar);
                boolean[] zArr = iu0Var.f38870g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39154b == null) {
                    this.f39154b = a.cb.q(oVar, Double.class);
                }
                iu0Var.f38866c = (Double) this.f39154b.c(aVar);
                boolean[] zArr2 = iu0Var.f38870g;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f39154b == null) {
                    this.f39154b = a.cb.q(oVar, Double.class);
                }
                iu0Var.f38867d = (Double) this.f39154b.c(aVar);
                boolean[] zArr3 = iu0Var.f38870g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f39154b == null) {
                    this.f39154b = a.cb.q(oVar, Double.class);
                }
                iu0Var.f38868e = (Double) this.f39154b.c(aVar);
                boolean[] zArr4 = iu0Var.f38870g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f39154b == null) {
                    this.f39154b = a.cb.q(oVar, Double.class);
                }
                iu0Var.f38869f = (Double) this.f39154b.c(aVar);
                boolean[] zArr5 = iu0Var.f38870g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39155c == null) {
                    this.f39155c = a.cb.q(oVar, String.class);
                }
                iu0Var.f38865b = (String) this.f39155c.c(aVar);
                boolean[] zArr6 = iu0Var.f38870g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new lu0(iu0Var.f38864a, iu0Var.f38865b, iu0Var.f38866c, iu0Var.f38867d, iu0Var.f38868e, iu0Var.f38869f, iu0Var.f38870g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        String str;
        String str2;
        lu0 lu0Var = (lu0) obj;
        if (lu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lu0Var.f39905g;
        int length = zArr.length;
        nm.o oVar = this.f39153a;
        if (length > 0 && zArr[0]) {
            if (this.f39155c == null) {
                this.f39155c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39155c;
            um.c h10 = cVar.h("id");
            str2 = lu0Var.f39899a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39155c == null) {
                this.f39155c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39155c;
            um.c h13 = cVar.h("node_id");
            str = lu0Var.f39900b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39154b == null) {
                this.f39154b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f39154b;
            um.c h14 = cVar.h("x_1");
            d15 = lu0Var.f39901c;
            mVar3.e(h14, d15);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39154b == null) {
                this.f39154b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f39154b;
            um.c h15 = cVar.h("x_2");
            d14 = lu0Var.f39902d;
            mVar4.e(h15, d14);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39154b == null) {
                this.f39154b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f39154b;
            um.c h16 = cVar.h("y_1");
            d13 = lu0Var.f39903e;
            mVar5.e(h16, d13);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39154b == null) {
                this.f39154b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f39154b;
            um.c h17 = cVar.h("y_2");
            d2 = lu0Var.f39904f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
