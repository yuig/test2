package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class oa0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40662a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40663b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40664c;

    public oa0(nm.o oVar) {
        this.f40662a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        na0 na0Var = new na0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -907766818:
                    if (k03.equals("score0")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -907766817:
                    if (k03.equals("score1")) {
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
                case 106848120:
                    if (k03.equals("pole0")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 106848121:
                    if (k03.equals("pole1")) {
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
            nm.o oVar = this.f40662a;
            if (c13 == 0) {
                if (this.f40663b == null) {
                    this.f40663b = a.cb.q(oVar, Integer.class);
                }
                na0Var.f40376e = (Integer) this.f40663b.c(aVar);
                boolean[] zArr = na0Var.f40378g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f40663b == null) {
                    this.f40663b = a.cb.q(oVar, Integer.class);
                }
                na0Var.f40377f = (Integer) this.f40663b.c(aVar);
                boolean[] zArr2 = na0Var.f40378g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f40664c == null) {
                    this.f40664c = a.cb.q(oVar, String.class);
                }
                na0Var.f40372a = (String) this.f40664c.c(aVar);
                boolean[] zArr3 = na0Var.f40378g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f40664c == null) {
                    this.f40664c = a.cb.q(oVar, String.class);
                }
                na0Var.f40374c = (String) this.f40664c.c(aVar);
                boolean[] zArr4 = na0Var.f40378g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f40664c == null) {
                    this.f40664c = a.cb.q(oVar, String.class);
                }
                na0Var.f40375d = (String) this.f40664c.c(aVar);
                boolean[] zArr5 = na0Var.f40378g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f40664c == null) {
                    this.f40664c = a.cb.q(oVar, String.class);
                }
                na0Var.f40373b = (String) this.f40664c.c(aVar);
                boolean[] zArr6 = na0Var.f40378g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new qa0(na0Var.f40372a, na0Var.f40373b, na0Var.f40374c, na0Var.f40375d, na0Var.f40376e, na0Var.f40377f, na0Var.f40378g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        String str4;
        qa0 qa0Var = (qa0) obj;
        if (qa0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qa0Var.f41251g;
        int length = zArr.length;
        nm.o oVar = this.f40662a;
        if (length > 0 && zArr[0]) {
            if (this.f40664c == null) {
                this.f40664c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40664c;
            um.c h10 = cVar.h("id");
            str4 = qa0Var.f41245a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40664c == null) {
                this.f40664c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40664c;
            um.c h13 = cVar.h("node_id");
            str3 = qa0Var.f41246b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40664c == null) {
                this.f40664c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40664c;
            um.c h14 = cVar.h("pole0");
            str2 = qa0Var.f41247c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40664c == null) {
                this.f40664c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40664c;
            um.c h15 = cVar.h("pole1");
            str = qa0Var.f41248d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40663b == null) {
                this.f40663b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40663b;
            um.c h16 = cVar.h("score0");
            num2 = qa0Var.f41249e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40663b == null) {
                this.f40663b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f40663b;
            um.c h17 = cVar.h("score1");
            num = qa0Var.f41250f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
