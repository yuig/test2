package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class yn extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44085a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44086b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44087c;

    public yn(nm.o oVar) {
        this.f44085a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xn xnVar = new xn(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1422950858:
                    if (k03.equals("action")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -906953308:
                    if (k03.equals("tab_type")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1714924804:
                    if (k03.equals("dominant_color")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1766182403:
                    if (k03.equals("cover_image_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44085a;
            if (c13 == 0) {
                if (this.f44086b == null) {
                    this.f44086b = a.cb.q(oVar, dk0.class);
                }
                xnVar.f43752a = (dk0) this.f44086b.c(aVar);
                boolean[] zArr = xnVar.f43758g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f44087c == null) {
                    this.f44087c = a.cb.q(oVar, String.class);
                }
                xnVar.f43757f = (String) this.f44087c.c(aVar);
                boolean[] zArr2 = xnVar.f43758g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f44087c == null) {
                    this.f44087c = a.cb.q(oVar, String.class);
                }
                xnVar.f43755d = (String) this.f44087c.c(aVar);
                boolean[] zArr3 = xnVar.f43758g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f44087c == null) {
                    this.f44087c = a.cb.q(oVar, String.class);
                }
                xnVar.f43756e = (String) this.f44087c.c(aVar);
                boolean[] zArr4 = xnVar.f43758g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f44087c == null) {
                    this.f44087c = a.cb.q(oVar, String.class);
                }
                xnVar.f43754c = (String) this.f44087c.c(aVar);
                boolean[] zArr5 = xnVar.f43758g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f44087c == null) {
                    this.f44087c = a.cb.q(oVar, String.class);
                }
                xnVar.f43753b = (String) this.f44087c.c(aVar);
                boolean[] zArr6 = xnVar.f43758g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new ao(xnVar.f43752a, xnVar.f43753b, xnVar.f43754c, xnVar.f43755d, xnVar.f43756e, xnVar.f43757f, xnVar.f43758g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        dk0 dk0Var;
        ao aoVar = (ao) obj;
        if (aoVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = aoVar.f35823g;
        int length = zArr.length;
        nm.o oVar = this.f44085a;
        if (length > 0 && zArr[0]) {
            if (this.f44086b == null) {
                this.f44086b = a.cb.q(oVar, dk0.class);
            }
            nm.m mVar = this.f44086b;
            um.c h10 = cVar.h("action");
            dk0Var = aoVar.f35817a;
            mVar.e(h10, dk0Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44087c == null) {
                this.f44087c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44087c;
            um.c h13 = cVar.h("cover_image_url");
            str5 = aoVar.f35818b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44087c == null) {
                this.f44087c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44087c;
            um.c h14 = cVar.h("dominant_color");
            str4 = aoVar.f35819c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44087c == null) {
                this.f44087c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44087c;
            um.c h15 = cVar.h("id");
            str3 = aoVar.f35820d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44087c == null) {
                this.f44087c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44087c;
            um.c h16 = cVar.h("name");
            str2 = aoVar.f35821e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44087c == null) {
                this.f44087c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f44087c;
            um.c h17 = cVar.h("tab_type");
            str = aoVar.f35822f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
