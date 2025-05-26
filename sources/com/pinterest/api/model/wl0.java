package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wl0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43286a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43287b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43288c;

    public wl0(nm.o oVar) {
        this.f43286a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vl0 vl0Var = new vl0(0);
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
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 209830866:
                    if (k03.equals("line_height")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43286a;
            if (c13 == 0) {
                if (this.f43288c == null) {
                    this.f43288c = a.cb.q(oVar, String.class);
                }
                vl0Var.f42917a = (String) this.f43288c.c(aVar);
                boolean[] zArr = vl0Var.f42922f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f43288c == null) {
                    this.f43288c = a.cb.q(oVar, String.class);
                }
                vl0Var.f42918b = (String) this.f43288c.c(aVar);
                boolean[] zArr2 = vl0Var.f42922f;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f43288c == null) {
                    this.f43288c = a.cb.q(oVar, String.class);
                }
                vl0Var.f42921e = (String) this.f43288c.c(aVar);
                boolean[] zArr3 = vl0Var.f42922f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f43288c == null) {
                    this.f43288c = a.cb.q(oVar, String.class);
                }
                vl0Var.f42920d = (String) this.f43288c.c(aVar);
                boolean[] zArr4 = vl0Var.f42922f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43287b == null) {
                    this.f43287b = a.cb.q(oVar, Double.class);
                }
                vl0Var.f42919c = (Double) this.f43287b.c(aVar);
                boolean[] zArr5 = vl0Var.f42922f;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            }
        }
        aVar.g();
        return new yl0(vl0Var.f42917a, vl0Var.f42918b, vl0Var.f42919c, vl0Var.f42920d, vl0Var.f42921e, vl0Var.f42922f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Double d2;
        String str3;
        String str4;
        yl0 yl0Var = (yl0) obj;
        if (yl0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yl0Var.f44077f;
        int length = zArr.length;
        nm.o oVar = this.f43286a;
        if (length > 0 && zArr[0]) {
            if (this.f43288c == null) {
                this.f43288c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43288c;
            um.c h10 = cVar.h("id");
            str4 = yl0Var.f44072a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43288c == null) {
                this.f43288c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43288c;
            um.c h13 = cVar.h("key");
            str3 = yl0Var.f44073b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43287b == null) {
                this.f43287b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f43287b;
            um.c h14 = cVar.h("line_height");
            d2 = yl0Var.f44074c;
            mVar3.e(h14, d2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43288c == null) {
                this.f43288c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43288c;
            um.c h15 = cVar.h("name");
            str2 = yl0Var.f44075d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43288c == null) {
                this.f43288c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43288c;
            um.c h16 = cVar.h("url");
            str = yl0Var.f44076e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
