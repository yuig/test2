package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class en extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37309a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37310b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37311c;

    public en(nm.o oVar) {
        this.f37309a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dn dnVar = new dn(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 114148:
                    if (k03.equals("src")) {
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
                case 113126854:
                    if (k03.equals("width")) {
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
            }
            nm.o oVar = this.f37309a;
            if (c13 == 0) {
                if (this.f37310b == null) {
                    this.f37310b = a.cb.q(oVar, Double.class);
                }
                dnVar.c((Double) this.f37310b.c(aVar));
            } else if (c13 == 1) {
                if (this.f37311c == null) {
                    this.f37311c = a.cb.q(oVar, String.class);
                }
                dnVar.d((String) this.f37311c.c(aVar));
            } else if (c13 == 2) {
                if (this.f37311c == null) {
                    this.f37311c = a.cb.q(oVar, String.class);
                }
                dnVar.e((String) this.f37311c.c(aVar));
            } else if (c13 == 3) {
                if (this.f37310b == null) {
                    this.f37310b = a.cb.q(oVar, Double.class);
                }
                dnVar.f((Double) this.f37310b.c(aVar));
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f37311c == null) {
                    this.f37311c = a.cb.q(oVar, String.class);
                }
                dnVar.b((String) this.f37311c.c(aVar));
            }
        }
        aVar.g();
        return dnVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        String str2;
        Double d13;
        String str3;
        gn gnVar = (gn) obj;
        if (gnVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gnVar.f38097f;
        int length = zArr.length;
        nm.o oVar = this.f37309a;
        if (length > 0 && zArr[0]) {
            if (this.f37311c == null) {
                this.f37311c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37311c;
            um.c h10 = cVar.h("dominant_color");
            str3 = gnVar.f38092a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37310b == null) {
                this.f37310b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f37310b;
            um.c h13 = cVar.h("height");
            d13 = gnVar.f38093b;
            mVar2.e(h13, d13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37311c == null) {
                this.f37311c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37311c;
            um.c h14 = cVar.h("src");
            str2 = gnVar.f38094c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37311c == null) {
                this.f37311c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37311c;
            um.c h15 = cVar.h("type");
            str = gnVar.f38095d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37310b == null) {
                this.f37310b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f37310b;
            um.c h16 = cVar.h("width");
            d2 = gnVar.f38096e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
