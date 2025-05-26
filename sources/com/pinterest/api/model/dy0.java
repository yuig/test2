package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class dy0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36993a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36994b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36995c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36996d;

    public dy0(nm.o oVar) {
        this.f36993a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cy0 cy0Var = new cy0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1146830912:
                    if (k03.equals("business")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -801404500:
                    if (k03.equals("is_link_valid")) {
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
                case 106164915:
                    if (k03.equals("owner")) {
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
            nm.o oVar = this.f36993a;
            if (c13 == 0) {
                if (this.f36994b == null) {
                    this.f36994b = a.cb.q(oVar, d.class);
                }
                cy0Var.f36569c = (d) this.f36994b.c(aVar);
                boolean[] zArr = cy0Var.f36572f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f36995c == null) {
                    this.f36995c = a.cb.q(oVar, Boolean.class);
                }
                cy0Var.f36570d = (Boolean) this.f36995c.c(aVar);
                boolean[] zArr2 = cy0Var.f36572f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f36996d == null) {
                    this.f36996d = a.cb.q(oVar, String.class);
                }
                cy0Var.f36567a = (String) this.f36996d.c(aVar);
                boolean[] zArr3 = cy0Var.f36572f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f36994b == null) {
                    this.f36994b = a.cb.q(oVar, d.class);
                }
                cy0Var.f36571e = (d) this.f36994b.c(aVar);
                boolean[] zArr4 = cy0Var.f36572f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f36996d == null) {
                    this.f36996d = a.cb.q(oVar, String.class);
                }
                cy0Var.f36568b = (String) this.f36996d.c(aVar);
                boolean[] zArr5 = cy0Var.f36572f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new fy0(cy0Var.f36567a, cy0Var.f36568b, cy0Var.f36569c, cy0Var.f36570d, cy0Var.f36571e, cy0Var.f36572f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        d dVar;
        Boolean bool;
        d dVar2;
        String str;
        String str2;
        fy0 fy0Var = (fy0) obj;
        if (fy0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fy0Var.f37859f;
        int length = zArr.length;
        nm.o oVar = this.f36993a;
        if (length > 0 && zArr[0]) {
            if (this.f36996d == null) {
                this.f36996d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36996d;
            um.c h10 = cVar.h("id");
            str2 = fy0Var.f37854a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36996d == null) {
                this.f36996d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36996d;
            um.c h13 = cVar.h("node_id");
            str = fy0Var.f37855b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36994b == null) {
                this.f36994b = a.cb.q(oVar, d.class);
            }
            nm.m mVar3 = this.f36994b;
            um.c h14 = cVar.h("business");
            dVar2 = fy0Var.f37856c;
            mVar3.e(h14, dVar2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36995c == null) {
                this.f36995c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f36995c;
            um.c h15 = cVar.h("is_link_valid");
            bool = fy0Var.f37857d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36994b == null) {
                this.f36994b = a.cb.q(oVar, d.class);
            }
            nm.m mVar5 = this.f36994b;
            um.c h16 = cVar.h("owner");
            dVar = fy0Var.f37858e;
            mVar5.e(h16, dVar);
        }
        cVar.g();
    }
}
