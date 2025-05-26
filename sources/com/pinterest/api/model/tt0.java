package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class tt0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42296a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42297b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42298c;

    public tt0(nm.o oVar) {
        this.f42296a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        st0 st0Var = new st0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -995427962:
                    if (k03.equals("params")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -841521157:
                    if (k03.equals("script_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -820075192:
                    if (k03.equals("vendor")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 546173438:
                    if (k03.equals("framework")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 700737660:
                    if (k03.equals("failure_tracking_url")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42296a;
            if (c13 == 0) {
                if (this.f42298c == null) {
                    this.f42298c = a.cb.q(oVar, String.class);
                }
                st0Var.f41999c = (String) this.f42298c.c(aVar);
                boolean[] zArr = st0Var.f42002f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f42298c == null) {
                    this.f42298c = a.cb.q(oVar, String.class);
                }
                st0Var.f42000d = (String) this.f42298c.c(aVar);
                boolean[] zArr2 = st0Var.f42002f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f42298c == null) {
                    this.f42298c = a.cb.q(oVar, String.class);
                }
                st0Var.f42001e = (String) this.f42298c.c(aVar);
                boolean[] zArr3 = st0Var.f42002f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f42297b == null) {
                    this.f42297b = a.cb.q(oVar, Integer.class);
                }
                st0Var.f41998b = (Integer) this.f42297b.c(aVar);
                boolean[] zArr4 = st0Var.f42002f;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f42298c == null) {
                    this.f42298c = a.cb.q(oVar, String.class);
                }
                st0Var.f41997a = (String) this.f42298c.c(aVar);
                boolean[] zArr5 = st0Var.f42002f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new vt0(st0Var.f41997a, st0Var.f41998b, st0Var.f41999c, st0Var.f42000d, st0Var.f42001e, st0Var.f42002f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        vt0 vt0Var = (vt0) obj;
        if (vt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vt0Var.f42983f;
        int length = zArr.length;
        nm.o oVar = this.f42296a;
        if (length > 0 && zArr[0]) {
            if (this.f42298c == null) {
                this.f42298c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42298c;
            um.c h10 = cVar.h("failure_tracking_url");
            str4 = vt0Var.f42978a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42297b == null) {
                this.f42297b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f42297b;
            um.c h13 = cVar.h("framework");
            num = vt0Var.f42979b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42298c == null) {
                this.f42298c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42298c;
            um.c h14 = cVar.h("params");
            str3 = vt0Var.f42980c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42298c == null) {
                this.f42298c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42298c;
            um.c h15 = cVar.h("script_url");
            str2 = vt0Var.f42981d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42298c == null) {
                this.f42298c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42298c;
            um.c h16 = cVar.h("vendor");
            str = vt0Var.f42982e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
