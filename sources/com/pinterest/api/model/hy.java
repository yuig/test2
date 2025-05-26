package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class hy extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38564a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38565b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38566c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38567d;

    public hy(nm.o oVar) {
        this.f38564a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gy gyVar = new gy(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 1277933561:
                    if (k03.equals("contact_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1538934853:
                    if (k03.equals("aux_data")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38564a;
            if (c13 == 0) {
                if (this.f38567d == null) {
                    this.f38567d = a.cb.q(oVar, String.class);
                }
                gyVar.f38176c = (String) this.f38567d.c(aVar);
                boolean[] zArr = gyVar.f38178e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 != 1) {
                boolean[] zArr2 = gyVar.f38178e;
                if (c13 == 2) {
                    if (this.f38565b == null) {
                        this.f38565b = a.cb.q(oVar, Integer.class);
                    }
                    gyVar.f38175b = (Integer) this.f38565b.c(aVar);
                    if (zArr2.length > 1) {
                        zArr2[1] = true;
                    }
                } else if (c13 != 3) {
                    aVar.E();
                } else {
                    if (this.f38566c == null) {
                        this.f38566c = a.cb.q(oVar, ny.class);
                    }
                    gyVar.f38174a = (ny) this.f38566c.c(aVar);
                    if (zArr2.length > 0) {
                        zArr2[0] = true;
                    }
                }
            } else {
                if (this.f38567d == null) {
                    this.f38567d = a.cb.q(oVar, String.class);
                }
                gyVar.f38177d = (String) this.f38567d.c(aVar);
                boolean[] zArr3 = gyVar.f38178e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            }
        }
        aVar.g();
        return new jy(gyVar.f38174a, gyVar.f38175b, gyVar.f38176c, gyVar.f38177d, gyVar.f38178e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        ny nyVar;
        jy jyVar = (jy) obj;
        if (jyVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jyVar.f39172e;
        int length = zArr.length;
        nm.o oVar = this.f38564a;
        if (length > 0 && zArr[0]) {
            if (this.f38566c == null) {
                this.f38566c = a.cb.q(oVar, ny.class);
            }
            nm.m mVar = this.f38566c;
            um.c h10 = cVar.h("aux_data");
            nyVar = jyVar.f39168a;
            mVar.e(h10, nyVar);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38565b == null) {
                this.f38565b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f38565b;
            um.c h13 = cVar.h("contact_type");
            num = jyVar.f39169b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38567d == null) {
                this.f38567d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38567d;
            um.c h14 = cVar.h("link");
            str2 = jyVar.f39170c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38567d == null) {
                this.f38567d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38567d;
            um.c h15 = cVar.h("text");
            str = jyVar.f39171d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
