package com.pinterest.api.model;

import com.pinterest.api.model.vz0;

/* loaded from: classes3.dex */
public final class wz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43515a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43516b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43517c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43518d;

    public wz0(nm.o oVar) {
        this.f43515a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        uz0 uz0Var = new uz0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -892481550:
                    if (k03.equals("status")) {
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
                case 574223090:
                    if (k03.equals("merchant_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1149871506:
                    if (k03.equals("inspirational_signal")) {
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
            nm.o oVar = this.f43515a;
            if (c13 == 0) {
                if (this.f43518d == null) {
                    this.f43518d = a.cb.q(oVar, vz0.a.class);
                }
                uz0Var.f42689e = (vz0.a) this.f43518d.c(aVar);
                boolean[] zArr = uz0Var.f42690f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f43517c == null) {
                    this.f43517c = a.cb.q(oVar, String.class);
                }
                uz0Var.f42685a = (String) this.f43517c.c(aVar);
                boolean[] zArr2 = uz0Var.f42690f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43517c == null) {
                    this.f43517c = a.cb.q(oVar, String.class);
                }
                uz0Var.f42688d = (String) this.f43517c.c(aVar);
                boolean[] zArr3 = uz0Var.f42690f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f43516b == null) {
                    this.f43516b = a.cb.q(oVar, rs.class);
                }
                uz0Var.f42687c = (rs) this.f43516b.c(aVar);
                boolean[] zArr4 = uz0Var.f42690f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43517c == null) {
                    this.f43517c = a.cb.q(oVar, String.class);
                }
                uz0Var.f42686b = (String) this.f43517c.c(aVar);
                boolean[] zArr5 = uz0Var.f42690f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new vz0(uz0Var.f42685a, uz0Var.f42686b, uz0Var.f42687c, uz0Var.f42688d, uz0Var.f42689e, uz0Var.f42690f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        vz0.a aVar;
        String str;
        rs rsVar;
        String str2;
        String str3;
        vz0 vz0Var = (vz0) obj;
        if (vz0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vz0Var.f43119f;
        int length = zArr.length;
        nm.o oVar = this.f43515a;
        if (length > 0 && zArr[0]) {
            if (this.f43517c == null) {
                this.f43517c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43517c;
            um.c h10 = cVar.h("id");
            str3 = vz0Var.f43114a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43517c == null) {
                this.f43517c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43517c;
            um.c h13 = cVar.h("node_id");
            str2 = vz0Var.f43115b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43516b == null) {
                this.f43516b = a.cb.q(oVar, rs.class);
            }
            nm.m mVar3 = this.f43516b;
            um.c h14 = cVar.h("inspirational_signal");
            rsVar = vz0Var.f43116c;
            mVar3.e(h14, rsVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43517c == null) {
                this.f43517c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43517c;
            um.c h15 = cVar.h("merchant_id");
            str = vz0Var.f43117d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43518d == null) {
                this.f43518d = a.cb.q(oVar, vz0.a.class);
            }
            nm.m mVar5 = this.f43518d;
            um.c h16 = cVar.h("status");
            aVar = vz0Var.f43118e;
            mVar5.e(h16, aVar);
        }
        cVar.g();
    }
}
