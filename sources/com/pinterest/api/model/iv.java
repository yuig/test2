package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class iv extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38871a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38872b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38873c;

    public iv(nm.o oVar) {
        this.f38871a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hv hvVar = new hv(0);
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
                case -190801022:
                    if (k03.equals("failure_code")) {
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
                case 1073584312:
                    if (k03.equals("signature")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1239095321:
                    if (k03.equals("upload_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1824287052:
                    if (k03.equals("uploaded_time")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38871a;
            if (c13 == 0) {
                if (this.f38873c == null) {
                    this.f38873c = a.cb.q(oVar, String.class);
                }
                hvVar.f38547c = (String) this.f38873c.c(aVar);
                boolean[] zArr = hvVar.f38551g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f38873c == null) {
                    this.f38873c = a.cb.q(oVar, String.class);
                }
                hvVar.f38545a = (String) this.f38873c.c(aVar);
                boolean[] zArr2 = hvVar.f38551g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f38873c == null) {
                    this.f38873c = a.cb.q(oVar, String.class);
                }
                hvVar.f38548d = (String) this.f38873c.c(aVar);
                boolean[] zArr3 = hvVar.f38551g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f38873c == null) {
                    this.f38873c = a.cb.q(oVar, String.class);
                }
                hvVar.f38546b = (String) this.f38873c.c(aVar);
                boolean[] zArr4 = hvVar.f38551g;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 == 4) {
                if (this.f38873c == null) {
                    this.f38873c = a.cb.q(oVar, String.class);
                }
                hvVar.f38549e = (String) this.f38873c.c(aVar);
                boolean[] zArr5 = hvVar.f38551g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38872b == null) {
                    this.f38872b = a.cb.q(oVar, Double.class);
                }
                hvVar.f38550f = (Double) this.f38872b.c(aVar);
                boolean[] zArr6 = hvVar.f38551g;
                if (zArr6.length > 5) {
                    zArr6[5] = true;
                }
            }
        }
        aVar.g();
        return new kv(hvVar.f38545a, hvVar.f38546b, hvVar.f38547c, hvVar.f38548d, hvVar.f38549e, hvVar.f38550f, hvVar.f38551g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        kv kvVar = (kv) obj;
        if (kvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kvVar.f39550g;
        int length = zArr.length;
        nm.o oVar = this.f38871a;
        if (length > 0 && zArr[0]) {
            if (this.f38873c == null) {
                this.f38873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38873c;
            um.c h10 = cVar.h("failure_code");
            str5 = kvVar.f39544a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38873c == null) {
                this.f38873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38873c;
            um.c h13 = cVar.h("signature");
            str4 = kvVar.f39545b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38873c == null) {
                this.f38873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38873c;
            um.c h14 = cVar.h("status");
            str3 = kvVar.f39546c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38873c == null) {
                this.f38873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38873c;
            um.c h15 = cVar.h("type");
            str2 = kvVar.f39547d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38873c == null) {
                this.f38873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38873c;
            um.c h16 = cVar.h("upload_id");
            str = kvVar.f39548e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38872b == null) {
                this.f38872b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f38872b;
            um.c h17 = cVar.h("uploaded_time");
            d2 = kvVar.f39549f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
