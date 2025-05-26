package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class q0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41156a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41157b;

    public q0(nm.o oVar) {
        this.f41156a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        s0 s0Var = new s0(0);
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 96619420:
                    if (k03.equals("email")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1113912547:
                    if (k03.equals("name_initials")) {
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
            nm.o oVar = this.f41156a;
            if (c13 == 0) {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41737a = (String) this.f41157b.c(aVar);
                boolean[] zArr = s0Var.f41743g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41740d = (String) this.f41157b.c(aVar);
                boolean[] zArr2 = s0Var.f41743g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41742f = (String) this.f41157b.c(aVar);
                boolean[] zArr3 = s0Var.f41743g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41739c = (String) this.f41157b.c(aVar);
                boolean[] zArr4 = s0Var.f41743g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41741e = (String) this.f41157b.c(aVar);
                boolean[] zArr5 = s0Var.f41743g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41157b == null) {
                    this.f41157b = a.cb.q(oVar, String.class);
                }
                s0Var.f41738b = (String) this.f41157b.c(aVar);
                boolean[] zArr6 = s0Var.f41743g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new t0(s0Var.f41737a, s0Var.f41738b, s0Var.f41739c, s0Var.f41740d, s0Var.f41741e, s0Var.f41742f, s0Var.f41743g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        t0 t0Var = (t0) obj;
        if (t0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = t0Var.f42033g;
        int length = zArr.length;
        nm.o oVar = this.f41156a;
        if (length > 0 && zArr[0]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41157b;
            um.c h10 = cVar.h("id");
            str6 = t0Var.f42027a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41157b;
            um.c h13 = cVar.h("node_id");
            str5 = t0Var.f42028b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41157b;
            um.c h14 = cVar.h("email");
            str4 = t0Var.f42029c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41157b;
            um.c h15 = cVar.h("name");
            str3 = t0Var.f42030d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41157b;
            um.c h16 = cVar.h("name_initials");
            str2 = t0Var.f42031e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41157b == null) {
                this.f41157b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41157b;
            um.c h17 = cVar.h("type");
            str = t0Var.f42032f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
