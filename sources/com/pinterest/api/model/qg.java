package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class qg extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41295a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41296b;

    public qg(nm.o oVar) {
        this.f41295a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pg pgVar = new pg(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1566099448:
                    if (k03.equals("more_info_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -737588055:
                    if (k03.equals("icon_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 1061875056:
                    if (k03.equals("signal_message")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1073324562:
                    if (k03.equals("signal_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1663147559:
                    if (k03.equals("owner_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41295a;
            if (c13 == 0) {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40975c = (String) this.f41296b.c(aVar);
                boolean[] zArr = pgVar.f40979g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40974b = (String) this.f41296b.c(aVar);
                boolean[] zArr2 = pgVar.f40979g;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40978f = (String) this.f41296b.c(aVar);
                boolean[] zArr3 = pgVar.f40979g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40977e = (String) this.f41296b.c(aVar);
                boolean[] zArr4 = pgVar.f40979g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40976d = (String) this.f41296b.c(aVar);
                boolean[] zArr5 = pgVar.f40979g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41296b == null) {
                    this.f41296b = a.cb.q(oVar, String.class);
                }
                pgVar.f40973a = (String) this.f41296b.c(aVar);
                boolean[] zArr6 = pgVar.f40979g;
                if (zArr6.length > 0) {
                    zArr6[0] = true;
                }
            }
        }
        aVar.g();
        return new sg(pgVar.f40973a, pgVar.f40974b, pgVar.f40975c, pgVar.f40976d, pgVar.f40977e, pgVar.f40978f, pgVar.f40979g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        sg sgVar = (sg) obj;
        if (sgVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sgVar.f41917g;
        int length = zArr.length;
        nm.o oVar = this.f41295a;
        if (length > 0 && zArr[0]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41296b;
            um.c h10 = cVar.h("background_color");
            str6 = sgVar.f41911a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41296b;
            um.c h13 = cVar.h("icon_url");
            str5 = sgVar.f41912b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41296b;
            um.c h14 = cVar.h("more_info_url");
            str4 = sgVar.f41913c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41296b;
            um.c h15 = cVar.h("owner_id");
            str3 = sgVar.f41914d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41296b;
            um.c h16 = cVar.h("signal_id");
            str2 = sgVar.f41915e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41296b == null) {
                this.f41296b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41296b;
            um.c h17 = cVar.h("signal_message");
            str = sgVar.f41916f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
