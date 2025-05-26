package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class j5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38978a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38979b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38980c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38981d;

    public j5(nm.o oVar) {
        this.f38978a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        l5 l5Var = new l5(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1594228512:
                    if (k03.equals("is_realtime")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -254536186:
                    if (k03.equals("num_of_days")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 95468472:
                    if (k03.equals("delta")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 111972721:
                    if (k03.equals("value")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2116721256:
                    if (k03.equals("latest_available_timestamp")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38978a;
            if (c13 == 0) {
                if (this.f38979b == null) {
                    this.f38979b = a.cb.q(oVar, Boolean.class);
                }
                l5Var.f39654b = (Boolean) this.f38979b.c(aVar);
                boolean[] zArr = l5Var.f39658f;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f38981d == null) {
                    this.f38981d = a.cb.q(oVar, Integer.class);
                }
                l5Var.f39656d = (Integer) this.f38981d.c(aVar);
                boolean[] zArr2 = l5Var.f39658f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f38980c == null) {
                    this.f38980c = a.cb.q(oVar, Double.class);
                }
                l5Var.f39653a = (Double) this.f38980c.c(aVar);
                boolean[] zArr3 = l5Var.f39658f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38980c == null) {
                    this.f38980c = a.cb.q(oVar, Double.class);
                }
                l5Var.f39657e = (Double) this.f38980c.c(aVar);
                boolean[] zArr4 = l5Var.f39658f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38980c == null) {
                    this.f38980c = a.cb.q(oVar, Double.class);
                }
                l5Var.f39655c = (Double) this.f38980c.c(aVar);
                boolean[] zArr5 = l5Var.f39658f;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            }
        }
        aVar.g();
        return new m5(l5Var.f39653a, l5Var.f39654b, l5Var.f39655c, l5Var.f39656d, l5Var.f39657e, l5Var.f39658f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Integer num;
        Double d13;
        Boolean bool;
        Double d14;
        m5 m5Var = (m5) obj;
        if (m5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m5Var.f40004f;
        int length = zArr.length;
        nm.o oVar = this.f38978a;
        if (length > 0 && zArr[0]) {
            if (this.f38980c == null) {
                this.f38980c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f38980c;
            um.c h10 = cVar.h("delta");
            d14 = m5Var.f39999a;
            mVar.e(h10, d14);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38979b == null) {
                this.f38979b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f38979b;
            um.c h13 = cVar.h("is_realtime");
            bool = m5Var.f40000b;
            mVar2.e(h13, bool);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38980c == null) {
                this.f38980c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f38980c;
            um.c h14 = cVar.h("latest_available_timestamp");
            d13 = m5Var.f40001c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38981d == null) {
                this.f38981d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f38981d;
            um.c h15 = cVar.h("num_of_days");
            num = m5Var.f40002d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38980c == null) {
                this.f38980c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f38980c;
            um.c h16 = cVar.h("value");
            d2 = m5Var.f40003e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
