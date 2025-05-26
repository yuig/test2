package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class qr extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41356a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41357b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41358c;

    public qr(nm.o oVar) {
        this.f41356a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pr f13 = sr.f();
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
                case 116079:
                    if (k03.equals("url")) {
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
            nm.o oVar = this.f41356a;
            if (c13 == 0) {
                if (this.f41357b == null) {
                    this.f41357b = a.cb.q(oVar, Double.class);
                }
                f13.c((Double) this.f41357b.c(aVar));
            } else if (c13 == 1) {
                if (this.f41358c == null) {
                    this.f41358c = a.cb.q(oVar, String.class);
                }
                f13.e((String) this.f41358c.c(aVar));
            } else if (c13 == 2) {
                if (this.f41358c == null) {
                    this.f41358c = a.cb.q(oVar, String.class);
                }
                f13.d((String) this.f41358c.c(aVar));
            } else if (c13 == 3) {
                if (this.f41357b == null) {
                    this.f41357b = a.cb.q(oVar, Double.class);
                }
                f13.f((Double) this.f41357b.c(aVar));
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41358c == null) {
                    this.f41358c = a.cb.q(oVar, String.class);
                }
                f13.b((String) this.f41358c.c(aVar));
            }
        }
        aVar.g();
        return f13.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        String str2;
        Double d13;
        String str3;
        sr srVar = (sr) obj;
        if (srVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = srVar.f41975f;
        int length = zArr.length;
        nm.o oVar = this.f41356a;
        if (length > 0 && zArr[0]) {
            if (this.f41358c == null) {
                this.f41358c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41358c;
            um.c h10 = cVar.h("dominant_color");
            str3 = srVar.f41970a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41357b == null) {
                this.f41357b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f41357b;
            um.c h13 = cVar.h("height");
            d13 = srVar.f41971b;
            mVar2.e(h13, d13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41358c == null) {
                this.f41358c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41358c;
            um.c h14 = cVar.h("type");
            str2 = srVar.f41972c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41358c == null) {
                this.f41358c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41358c;
            um.c h15 = cVar.h("url");
            str = srVar.f41973d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41357b == null) {
                this.f41357b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f41357b;
            um.c h16 = cVar.h("width");
            d2 = srVar.f41974e;
            mVar5.e(h16, d2);
        }
        cVar.g();
    }
}
