package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class y01 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43867a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43868b;

    public y01(nm.o oVar) {
        this.f43867a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x01 x01Var = new x01(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1811484894:
                    if (k03.equals("user_country")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1613589672:
                    if (k03.equals("language")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -901870406:
                    if (k03.equals("app_version")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1167850136:
                    if (k03.equals("app_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43867a;
            if (c13 == 0) {
                if (this.f43868b == null) {
                    this.f43868b = a.cb.q(oVar, String.class);
                }
                x01Var.f43536e = (String) this.f43868b.c(aVar);
                boolean[] zArr = x01Var.f43537f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f43868b == null) {
                    this.f43868b = a.cb.q(oVar, String.class);
                }
                x01Var.f43534c = (String) this.f43868b.c(aVar);
                boolean[] zArr2 = x01Var.f43537f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f43868b == null) {
                    this.f43868b = a.cb.q(oVar, String.class);
                }
                x01Var.f43535d = (String) this.f43868b.c(aVar);
                boolean[] zArr3 = x01Var.f43537f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f43868b == null) {
                    this.f43868b = a.cb.q(oVar, String.class);
                }
                x01Var.f43533b = (String) this.f43868b.c(aVar);
                boolean[] zArr4 = x01Var.f43537f;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43868b == null) {
                    this.f43868b = a.cb.q(oVar, String.class);
                }
                x01Var.f43532a = (String) this.f43868b.c(aVar);
                boolean[] zArr5 = x01Var.f43537f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new a11(x01Var.f43532a, x01Var.f43533b, x01Var.f43534c, x01Var.f43535d, x01Var.f43536e, x01Var.f43537f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        a11 a11Var = (a11) obj;
        if (a11Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = a11Var.f35625f;
        int length = zArr.length;
        nm.o oVar = this.f43867a;
        if (length > 0 && zArr[0]) {
            if (this.f43868b == null) {
                this.f43868b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43868b;
            um.c h10 = cVar.h("app_type");
            str5 = a11Var.f35620a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43868b == null) {
                this.f43868b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43868b;
            um.c h13 = cVar.h("app_version");
            str4 = a11Var.f35621b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43868b == null) {
                this.f43868b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43868b;
            um.c h14 = cVar.h("language");
            str3 = a11Var.f35622c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43868b == null) {
                this.f43868b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43868b;
            um.c h15 = cVar.h("pin_id");
            str2 = a11Var.f35623d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43868b == null) {
                this.f43868b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43868b;
            um.c h16 = cVar.h("user_country");
            str = a11Var.f35624e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
