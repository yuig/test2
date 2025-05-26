package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class z3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44205a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44206b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44207c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44208d;

    public z3(nm.o oVar) {
        this.f44205a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b4 b4Var = new b4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1900332747:
                    if (k03.equals("overall_data_status")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 55126294:
                    if (k03.equals("timestamp")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 955826371:
                    if (k03.equals("metrics")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44205a;
            if (c13 == 0) {
                if (this.f44208d == null) {
                    this.f44208d = a.cb.q(oVar, String.class);
                }
                b4Var.f35964d = (String) this.f44208d.c(aVar);
                boolean[] zArr = b4Var.f35966f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f44208d == null) {
                    this.f44208d = a.cb.q(oVar, String.class);
                }
                b4Var.f35961a = (String) this.f44208d.c(aVar);
                boolean[] zArr2 = b4Var.f35966f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f44207c == null) {
                    this.f44207c = a.cb.q(oVar, Double.class);
                }
                b4Var.f35965e = (Double) this.f44207c.c(aVar);
                boolean[] zArr3 = b4Var.f35966f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f44206b == null) {
                    this.f44206b = a.cb.q(oVar, y3.class);
                }
                b4Var.f35963c = (y3) this.f44206b.c(aVar);
                boolean[] zArr4 = b4Var.f35966f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f44208d == null) {
                    this.f44208d = a.cb.q(oVar, String.class);
                }
                b4Var.f35962b = (String) this.f44208d.c(aVar);
                boolean[] zArr5 = b4Var.f35966f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new c4(b4Var.f35961a, b4Var.f35962b, b4Var.f35963c, b4Var.f35964d, b4Var.f35965e, b4Var.f35966f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        y3 y3Var;
        String str2;
        String str3;
        c4 c4Var = (c4) obj;
        if (c4Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = c4Var.f36292f;
        int length = zArr.length;
        nm.o oVar = this.f44205a;
        if (length > 0 && zArr[0]) {
            if (this.f44208d == null) {
                this.f44208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44208d;
            um.c h10 = cVar.h("id");
            str3 = c4Var.f36287a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44208d == null) {
                this.f44208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44208d;
            um.c h13 = cVar.h("node_id");
            str2 = c4Var.f36288b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44206b == null) {
                this.f44206b = a.cb.q(oVar, y3.class);
            }
            nm.m mVar3 = this.f44206b;
            um.c h14 = cVar.h("metrics");
            y3Var = c4Var.f36289c;
            mVar3.e(h14, y3Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44208d == null) {
                this.f44208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44208d;
            um.c h15 = cVar.h("overall_data_status");
            str = c4Var.f36290d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44207c == null) {
                this.f44207c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f44207c;
            um.c h16 = cVar.h("timestamp");
            d2 = c4Var.f36291e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
