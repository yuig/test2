package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class xr0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43774a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43775b;

    public xr0(nm.o oVar) {
        this.f43774a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wr0 wr0Var = new wr0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2060497896:
                    if (k03.equals("subtitle")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1423461112:
                    if (k03.equals("accept")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1542349558:
                    if (k03.equals("decline")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43774a;
            if (c13 == 0) {
                if (this.f43775b == null) {
                    this.f43775b = a.cb.q(oVar, String.class);
                }
                wr0Var.f43350c = (String) this.f43775b.c(aVar);
                boolean[] zArr = wr0Var.f43352e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43775b == null) {
                    this.f43775b = a.cb.q(oVar, String.class);
                }
                wr0Var.f43348a = (String) this.f43775b.c(aVar);
                boolean[] zArr2 = wr0Var.f43352e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43775b == null) {
                    this.f43775b = a.cb.q(oVar, String.class);
                }
                wr0Var.f43351d = (String) this.f43775b.c(aVar);
                boolean[] zArr3 = wr0Var.f43352e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f43775b == null) {
                    this.f43775b = a.cb.q(oVar, String.class);
                }
                wr0Var.f43349b = (String) this.f43775b.c(aVar);
                boolean[] zArr4 = wr0Var.f43352e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new zr0(wr0Var.f43348a, wr0Var.f43349b, wr0Var.f43350c, wr0Var.f43351d, wr0Var.f43352e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        zr0 zr0Var = (zr0) obj;
        if (zr0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zr0Var.f44428e;
        int length = zArr.length;
        nm.o oVar = this.f43774a;
        if (length > 0 && zArr[0]) {
            if (this.f43775b == null) {
                this.f43775b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43775b;
            um.c h10 = cVar.h("accept");
            str4 = zr0Var.f44424a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43775b == null) {
                this.f43775b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43775b;
            um.c h13 = cVar.h("decline");
            str3 = zr0Var.f44425b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43775b == null) {
                this.f43775b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43775b;
            um.c h14 = cVar.h("subtitle");
            str2 = zr0Var.f44426c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43775b == null) {
                this.f43775b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43775b;
            um.c h15 = cVar.h("title");
            str = zr0Var.f44427d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
