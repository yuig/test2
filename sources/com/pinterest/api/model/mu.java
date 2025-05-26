package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class mu extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40211a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40212b;

    public mu(nm.o oVar) {
        this.f40211a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lu luVar = new lu(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1501013829:
                    if (k03.equals("author_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1406328437:
                    if (k03.equals("author")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -96125927:
                    if (k03.equals("provider_name")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40211a;
            if (c13 == 0) {
                if (this.f40212b == null) {
                    this.f40212b = a.cb.q(oVar, String.class);
                }
                luVar.f39895b = (String) this.f40212b.c(aVar);
                boolean[] zArr = luVar.f39898e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f40212b == null) {
                    this.f40212b = a.cb.q(oVar, String.class);
                }
                luVar.f39894a = (String) this.f40212b.c(aVar);
                boolean[] zArr2 = luVar.f39898e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f40212b == null) {
                    this.f40212b = a.cb.q(oVar, String.class);
                }
                luVar.f39897d = (String) this.f40212b.c(aVar);
                boolean[] zArr3 = luVar.f39898e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40212b == null) {
                    this.f40212b = a.cb.q(oVar, String.class);
                }
                luVar.f39896c = (String) this.f40212b.c(aVar);
                boolean[] zArr4 = luVar.f39898e;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            }
        }
        aVar.g();
        return new ou(luVar.f39894a, luVar.f39895b, luVar.f39896c, luVar.f39897d, luVar.f39898e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ou ouVar = (ou) obj;
        if (ouVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ouVar.f40817e;
        int length = zArr.length;
        nm.o oVar = this.f40211a;
        if (length > 0 && zArr[0]) {
            if (this.f40212b == null) {
                this.f40212b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40212b;
            um.c h10 = cVar.h("author");
            str4 = ouVar.f40813a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40212b == null) {
                this.f40212b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40212b;
            um.c h13 = cVar.h("author_url");
            str3 = ouVar.f40814b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40212b == null) {
                this.f40212b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40212b;
            um.c h14 = cVar.h("link");
            str2 = ouVar.f40815c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40212b == null) {
                this.f40212b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40212b;
            um.c h15 = cVar.h("provider_name");
            str = ouVar.f40816d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
