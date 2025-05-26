package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class o1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40585a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40586b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40587c;

    public o1(nm.o oVar) {
        this.f40585a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        q1 q1Var = new q1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1795564715:
                    if (k03.equals("SPEND_IN_DOLLAR")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1620085369:
                    if (k03.equals("TOTAL_REPIN")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1046829704:
                    if (k03.equals("TOTAL_CLICKTHROUGH")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 408113668:
                    if (k03.equals("TOTAL_IMPRESSION")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1886775521:
                    if (k03.equals("PIN_PROMOTION_ID")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40585a;
            if (c13 == 0) {
                if (this.f40586b == null) {
                    this.f40586b = a.cb.q(oVar, Double.class);
                }
                q1Var.f41166b = (Double) this.f40586b.c(aVar);
                boolean[] zArr = q1Var.f41170f;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f40587c == null) {
                    this.f40587c = a.cb.q(oVar, Integer.class);
                }
                q1Var.f41169e = (Integer) this.f40587c.c(aVar);
                boolean[] zArr2 = q1Var.f41170f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f40587c == null) {
                    this.f40587c = a.cb.q(oVar, Integer.class);
                }
                q1Var.f41167c = (Integer) this.f40587c.c(aVar);
                boolean[] zArr3 = q1Var.f41170f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f40587c == null) {
                    this.f40587c = a.cb.q(oVar, Integer.class);
                }
                q1Var.f41168d = (Integer) this.f40587c.c(aVar);
                boolean[] zArr4 = q1Var.f41170f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f40586b == null) {
                    this.f40586b = a.cb.q(oVar, Double.class);
                }
                q1Var.f41165a = (Double) this.f40586b.c(aVar);
                boolean[] zArr5 = q1Var.f41170f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new r1(q1Var.f41165a, q1Var.f41166b, q1Var.f41167c, q1Var.f41168d, q1Var.f41169e, q1Var.f41170f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Double d2;
        Double d13;
        r1 r1Var = (r1) obj;
        if (r1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = r1Var.f41466f;
        int length = zArr.length;
        nm.o oVar = this.f40585a;
        if (length > 0 && zArr[0]) {
            if (this.f40586b == null) {
                this.f40586b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f40586b;
            um.c h10 = cVar.h("PIN_PROMOTION_ID");
            d13 = r1Var.f41461a;
            mVar.e(h10, d13);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40586b == null) {
                this.f40586b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f40586b;
            um.c h13 = cVar.h("SPEND_IN_DOLLAR");
            d2 = r1Var.f41462b;
            mVar2.e(h13, d2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40587c == null) {
                this.f40587c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40587c;
            um.c h14 = cVar.h("TOTAL_CLICKTHROUGH");
            num3 = r1Var.f41463c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40587c == null) {
                this.f40587c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40587c;
            um.c h15 = cVar.h("TOTAL_IMPRESSION");
            num2 = r1Var.f41464d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40587c == null) {
                this.f40587c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40587c;
            um.c h16 = cVar.h("TOTAL_REPIN");
            num = r1Var.f41465e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
