package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class pt0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41097a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41098b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41099c;

    public pt0(nm.o oVar) {
        this.f41097a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ot0 ot0Var = new ot0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -906336856:
                    if (k03.equals("search")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -485666051:
                    if (k03.equals("homefeed")) {
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
                case 154239250:
                    if (k03.equals("related_pins")) {
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
            nm.o oVar = this.f41097a;
            if (c13 == 0) {
                if (this.f41098b == null) {
                    this.f41098b = a.cb.q(oVar, Integer.class);
                }
                ot0Var.f40811e = (Integer) this.f41098b.c(aVar);
                boolean[] zArr = ot0Var.f40812f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f41098b == null) {
                    this.f41098b = a.cb.q(oVar, Integer.class);
                }
                ot0Var.f40809c = (Integer) this.f41098b.c(aVar);
                boolean[] zArr2 = ot0Var.f40812f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f41099c == null) {
                    this.f41099c = a.cb.q(oVar, String.class);
                }
                ot0Var.f40807a = (String) this.f41099c.c(aVar);
                boolean[] zArr3 = ot0Var.f40812f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f41098b == null) {
                    this.f41098b = a.cb.q(oVar, Integer.class);
                }
                ot0Var.f40810d = (Integer) this.f41098b.c(aVar);
                boolean[] zArr4 = ot0Var.f40812f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41099c == null) {
                    this.f41099c = a.cb.q(oVar, String.class);
                }
                ot0Var.f40808b = (String) this.f41099c.c(aVar);
                boolean[] zArr5 = ot0Var.f40812f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new rt0(ot0Var.f40807a, ot0Var.f40808b, ot0Var.f40809c, ot0Var.f40810d, ot0Var.f40811e, ot0Var.f40812f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        rt0 rt0Var = (rt0) obj;
        if (rt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rt0Var.f41669f;
        int length = zArr.length;
        nm.o oVar = this.f41097a;
        if (length > 0 && zArr[0]) {
            if (this.f41099c == null) {
                this.f41099c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41099c;
            um.c h10 = cVar.h("id");
            str2 = rt0Var.f41664a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41099c == null) {
                this.f41099c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41099c;
            um.c h13 = cVar.h("node_id");
            str = rt0Var.f41665b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41098b == null) {
                this.f41098b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41098b;
            um.c h14 = cVar.h("homefeed");
            num3 = rt0Var.f41666c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41098b == null) {
                this.f41098b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f41098b;
            um.c h15 = cVar.h("related_pins");
            num2 = rt0Var.f41667d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41098b == null) {
                this.f41098b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41098b;
            um.c h16 = cVar.h("search");
            num = rt0Var.f41668e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
