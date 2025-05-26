package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;

/* loaded from: classes3.dex */
public final class qf extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41289a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41290b;

    public qf(nm.o oVar) {
        this.f41289a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pf pfVar = new pf(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1824432610:
                    if (k03.equals("phone_code")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1015434861:
                    if (k03.equals("phone_code_label")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3059181:
                    if (k03.equals("code")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 957831062:
                    if (k03.equals(AdRevenueScheme.COUNTRY)) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1978360032:
                    if (k03.equals("country_native")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41289a;
            if (c13 == 0) {
                if (this.f41290b == null) {
                    this.f41290b = a.cb.q(oVar, String.class);
                }
                pfVar.f40967d = (String) this.f41290b.c(aVar);
                boolean[] zArr = pfVar.f40969f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f41290b == null) {
                    this.f41290b = a.cb.q(oVar, String.class);
                }
                pfVar.f40968e = (String) this.f41290b.c(aVar);
                boolean[] zArr2 = pfVar.f40969f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f41290b == null) {
                    this.f41290b = a.cb.q(oVar, String.class);
                }
                pfVar.f40964a = (String) this.f41290b.c(aVar);
                boolean[] zArr3 = pfVar.f40969f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f41290b == null) {
                    this.f41290b = a.cb.q(oVar, String.class);
                }
                pfVar.f40965b = (String) this.f41290b.c(aVar);
                boolean[] zArr4 = pfVar.f40969f;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41290b == null) {
                    this.f41290b = a.cb.q(oVar, String.class);
                }
                pfVar.f40966c = (String) this.f41290b.c(aVar);
                boolean[] zArr5 = pfVar.f40969f;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            }
        }
        aVar.g();
        return new sf(pfVar.f40964a, pfVar.f40965b, pfVar.f40966c, pfVar.f40967d, pfVar.f40968e, pfVar.f40969f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        sf sfVar = (sf) obj;
        if (sfVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sfVar.f41893f;
        int length = zArr.length;
        nm.o oVar = this.f41289a;
        if (length > 0 && zArr[0]) {
            if (this.f41290b == null) {
                this.f41290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41290b;
            um.c h10 = cVar.h("code");
            str5 = sfVar.f41888a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41290b == null) {
                this.f41290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41290b;
            um.c h13 = cVar.h(AdRevenueScheme.COUNTRY);
            str4 = sfVar.f41889b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41290b == null) {
                this.f41290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41290b;
            um.c h14 = cVar.h("country_native");
            str3 = sfVar.f41890c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41290b == null) {
                this.f41290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41290b;
            um.c h15 = cVar.h("phone_code");
            str2 = sfVar.f41891d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41290b == null) {
                this.f41290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41290b;
            um.c h16 = cVar.h("phone_code_label");
            str = sfVar.f41892e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
