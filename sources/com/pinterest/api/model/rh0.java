package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class rh0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41607a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41608b;

    public rh0(nm.o oVar) {
        this.f41607a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qh0 qh0Var = new qh0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1857640538:
                    if (k03.equals("summary")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -905826492:
                    if (k03.equals("serves")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -730754426:
                    if (k03.equals("yields")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
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
            nm.o oVar = this.f41607a;
            if (c13 == 0) {
                if (this.f41608b == null) {
                    this.f41608b = a.cb.q(oVar, String.class);
                }
                qh0Var.f41301d = (String) this.f41608b.c(aVar);
                boolean[] zArr = qh0Var.f41303f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f41608b == null) {
                    this.f41608b = a.cb.q(oVar, String.class);
                }
                qh0Var.f41300c = (String) this.f41608b.c(aVar);
                boolean[] zArr2 = qh0Var.f41303f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f41608b == null) {
                    this.f41608b = a.cb.q(oVar, String.class);
                }
                qh0Var.f41302e = (String) this.f41608b.c(aVar);
                boolean[] zArr3 = qh0Var.f41303f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f41608b == null) {
                    this.f41608b = a.cb.q(oVar, String.class);
                }
                qh0Var.f41298a = (String) this.f41608b.c(aVar);
                boolean[] zArr4 = qh0Var.f41303f;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41608b == null) {
                    this.f41608b = a.cb.q(oVar, String.class);
                }
                qh0Var.f41299b = (String) this.f41608b.c(aVar);
                boolean[] zArr5 = qh0Var.f41303f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new th0(qh0Var.f41298a, qh0Var.f41299b, qh0Var.f41300c, qh0Var.f41301d, qh0Var.f41302e, qh0Var.f41303f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        th0 th0Var = (th0) obj;
        if (th0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = th0Var.f42217f;
        int length = zArr.length;
        nm.o oVar = this.f41607a;
        if (length > 0 && zArr[0]) {
            if (this.f41608b == null) {
                this.f41608b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41608b;
            um.c h10 = cVar.h("id");
            str5 = th0Var.f42212a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41608b == null) {
                this.f41608b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41608b;
            um.c h13 = cVar.h("node_id");
            str4 = th0Var.f42213b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41608b == null) {
                this.f41608b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41608b;
            um.c h14 = cVar.h("serves");
            str3 = th0Var.f42214c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41608b == null) {
                this.f41608b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41608b;
            um.c h15 = cVar.h("summary");
            str2 = th0Var.f42215d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41608b == null) {
                this.f41608b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41608b;
            um.c h16 = cVar.h("yields");
            str = th0Var.f42216e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
