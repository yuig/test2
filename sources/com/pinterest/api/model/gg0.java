package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class gg0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38068a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38069b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38070c;

    public gg0(nm.o oVar) {
        this.f38068a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        fg0 fg0Var = new fg0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -318184504:
                    if (k03.equals("preview")) {
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
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 113126854:
                    if (k03.equals("width")) {
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
            nm.o oVar = this.f38068a;
            if (c13 == 0) {
                if (this.f38069b == null) {
                    this.f38069b = a.cb.q(oVar, Integer.class);
                }
                fg0Var.f37664c = (Integer) this.f38069b.c(aVar);
                boolean[] zArr = fg0Var.f37668g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f38070c == null) {
                    this.f38070c = a.cb.q(oVar, String.class);
                }
                fg0Var.f37665d = (String) this.f38070c.c(aVar);
                boolean[] zArr2 = fg0Var.f37668g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f38070c == null) {
                    this.f38070c = a.cb.q(oVar, String.class);
                }
                fg0Var.f37662a = (String) this.f38070c.c(aVar);
                boolean[] zArr3 = fg0Var.f37668g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38070c == null) {
                    this.f38070c = a.cb.q(oVar, String.class);
                }
                fg0Var.f37666e = (String) this.f38070c.c(aVar);
                boolean[] zArr4 = fg0Var.f37668g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f38069b == null) {
                    this.f38069b = a.cb.q(oVar, Integer.class);
                }
                fg0Var.f37667f = (Integer) this.f38069b.c(aVar);
                boolean[] zArr5 = fg0Var.f37668g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38070c == null) {
                    this.f38070c = a.cb.q(oVar, String.class);
                }
                fg0Var.f37663b = (String) this.f38070c.c(aVar);
                boolean[] zArr6 = fg0Var.f37668g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new ig0(fg0Var.f37662a, fg0Var.f37663b, fg0Var.f37664c, fg0Var.f37665d, fg0Var.f37666e, fg0Var.f37667f, fg0Var.f37668g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        Integer num2;
        String str3;
        String str4;
        ig0 ig0Var = (ig0) obj;
        if (ig0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ig0Var.f38771g;
        int length = zArr.length;
        nm.o oVar = this.f38068a;
        if (length > 0 && zArr[0]) {
            if (this.f38070c == null) {
                this.f38070c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38070c;
            um.c h10 = cVar.h("id");
            str4 = ig0Var.f38765a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38070c == null) {
                this.f38070c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38070c;
            um.c h13 = cVar.h("node_id");
            str3 = ig0Var.f38766b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38069b == null) {
                this.f38069b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f38069b;
            um.c h14 = cVar.h("height");
            num2 = ig0Var.f38767c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38070c == null) {
                this.f38070c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38070c;
            um.c h15 = cVar.h("preview");
            str2 = ig0Var.f38768d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38070c == null) {
                this.f38070c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38070c;
            um.c h16 = cVar.h("url");
            str = ig0Var.f38769e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38069b == null) {
                this.f38069b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f38069b;
            um.c h17 = cVar.h("width");
            num = ig0Var.f38770f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
