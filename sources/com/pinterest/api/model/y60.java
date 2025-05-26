package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class y60 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43959a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43960b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43961c;

    public y60(nm.o oVar) {
        this.f43959a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x60 x60Var = new x60(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1192642534:
                    if (k03.equals("typical_price")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 140163106:
                    if (k03.equals("duration_days")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 575402001:
                    if (k03.equals("currency")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 640990332:
                    if (k03.equals("lowest_price")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1055461756:
                    if (k03.equals("typical_price_val")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1282872542:
                    if (k03.equals("lowest_price_val")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43959a;
            if (c13 == 0) {
                if (this.f43961c == null) {
                    this.f43961c = a.cb.q(oVar, String.class);
                }
                x60Var.f43610e = (String) this.f43961c.c(aVar);
                boolean[] zArr = x60Var.f43612g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f43960b == null) {
                    this.f43960b = a.cb.q(oVar, Integer.class);
                }
                x60Var.f43607b = (Integer) this.f43960b.c(aVar);
                boolean[] zArr2 = x60Var.f43612g;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f43961c == null) {
                    this.f43961c = a.cb.q(oVar, String.class);
                }
                x60Var.f43606a = (String) this.f43961c.c(aVar);
                boolean[] zArr3 = x60Var.f43612g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f43961c == null) {
                    this.f43961c = a.cb.q(oVar, String.class);
                }
                x60Var.f43608c = (String) this.f43961c.c(aVar);
                boolean[] zArr4 = x60Var.f43612g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f43960b == null) {
                    this.f43960b = a.cb.q(oVar, Integer.class);
                }
                x60Var.f43611f = (Integer) this.f43960b.c(aVar);
                boolean[] zArr5 = x60Var.f43612g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43960b == null) {
                    this.f43960b = a.cb.q(oVar, Integer.class);
                }
                x60Var.f43609d = (Integer) this.f43960b.c(aVar);
                boolean[] zArr6 = x60Var.f43612g;
                if (zArr6.length > 3) {
                    zArr6[3] = true;
                }
            }
        }
        aVar.g();
        return new a70(x60Var.f43606a, x60Var.f43607b, x60Var.f43608c, x60Var.f43609d, x60Var.f43610e, x60Var.f43611f, x60Var.f43612g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        Integer num3;
        String str3;
        a70 a70Var = (a70) obj;
        if (a70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = a70Var.f35663g;
        int length = zArr.length;
        nm.o oVar = this.f43959a;
        if (length > 0 && zArr[0]) {
            if (this.f43961c == null) {
                this.f43961c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43961c;
            um.c h10 = cVar.h("currency");
            str3 = a70Var.f35657a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43960b == null) {
                this.f43960b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f43960b;
            um.c h13 = cVar.h("duration_days");
            num3 = a70Var.f35658b;
            mVar2.e(h13, num3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43961c == null) {
                this.f43961c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43961c;
            um.c h14 = cVar.h("lowest_price");
            str2 = a70Var.f35659c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43960b == null) {
                this.f43960b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f43960b;
            um.c h15 = cVar.h("lowest_price_val");
            num2 = a70Var.f35660d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43961c == null) {
                this.f43961c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43961c;
            um.c h16 = cVar.h("typical_price");
            str = a70Var.f35661e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43960b == null) {
                this.f43960b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f43960b;
            um.c h17 = cVar.h("typical_price_val");
            num = a70Var.f35662f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
