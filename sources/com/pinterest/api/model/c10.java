package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class c10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36273a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36274b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36275c;

    public c10(nm.o oVar) {
        this.f36273a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b10 b10Var = new b10(0);
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
                case 3355:
                    if (k03.equals("id")) {
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
                case 113126854:
                    if (k03.equals("width")) {
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
            nm.o oVar = this.f36273a;
            if (c13 == 0) {
                if (this.f36274b == null) {
                    this.f36274b = a.cb.q(oVar, Double.class);
                }
                b10Var.f35944c = (Double) this.f36274b.c(aVar);
                boolean[] zArr = b10Var.f35947f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f36275c == null) {
                    this.f36275c = a.cb.q(oVar, String.class);
                }
                b10Var.f35942a = (String) this.f36275c.c(aVar);
                boolean[] zArr2 = b10Var.f35947f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f36275c == null) {
                    this.f36275c = a.cb.q(oVar, String.class);
                }
                b10Var.f35945d = (String) this.f36275c.c(aVar);
                boolean[] zArr3 = b10Var.f35947f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f36274b == null) {
                    this.f36274b = a.cb.q(oVar, Double.class);
                }
                b10Var.f35946e = (Double) this.f36274b.c(aVar);
                boolean[] zArr4 = b10Var.f35947f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f36275c == null) {
                    this.f36275c = a.cb.q(oVar, String.class);
                }
                b10Var.f35943b = (String) this.f36275c.c(aVar);
                boolean[] zArr5 = b10Var.f35947f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new e10(b10Var.f35942a, b10Var.f35943b, b10Var.f35944c, b10Var.f35945d, b10Var.f35946e, b10Var.f35947f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        Double d13;
        String str2;
        String str3;
        e10 e10Var = (e10) obj;
        if (e10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e10Var.f37032f;
        int length = zArr.length;
        nm.o oVar = this.f36273a;
        if (length > 0 && zArr[0]) {
            if (this.f36275c == null) {
                this.f36275c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36275c;
            um.c h10 = cVar.h("id");
            str3 = e10Var.f37027a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36275c == null) {
                this.f36275c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36275c;
            um.c h13 = cVar.h("node_id");
            str2 = e10Var.f37028b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36274b == null) {
                this.f36274b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f36274b;
            um.c h14 = cVar.h("height");
            d13 = e10Var.f37029c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36275c == null) {
                this.f36275c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36275c;
            um.c h15 = cVar.h("url");
            str = e10Var.f37030d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36274b == null) {
                this.f36274b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f36274b;
            um.c h16 = cVar.h("width");
            d2 = e10Var.f37031e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
