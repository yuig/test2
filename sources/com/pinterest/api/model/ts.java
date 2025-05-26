package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class ts extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42281a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42282b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42283c;

    public ts(nm.o oVar) {
        this.f42281a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ss ssVar = new ss(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1509557086:
                    if (k03.equals("has_invalid_instagram_auth")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -949130010:
                    if (k03.equals("is_new_api")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -265713450:
                    if (k03.equals("username")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42281a;
            if (c13 == 0) {
                if (this.f42282b == null) {
                    this.f42282b = a.cb.q(oVar, Boolean.class);
                }
                ssVar.b((Boolean) this.f42282b.c(aVar));
            } else if (c13 == 1) {
                if (this.f42282b == null) {
                    this.f42282b = a.cb.q(oVar, Boolean.class);
                }
                ssVar.c((Boolean) this.f42282b.c(aVar));
            } else if (c13 == 2) {
                if (this.f42283c == null) {
                    this.f42283c = a.cb.q(oVar, String.class);
                }
                ssVar.e((String) this.f42283c.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42283c == null) {
                    this.f42283c = a.cb.q(oVar, String.class);
                }
                ssVar.d((String) this.f42283c.c(aVar));
            }
        }
        aVar.g();
        return ssVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        vs vsVar = (vs) obj;
        if (vsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vsVar.f42974e;
        int length = zArr.length;
        nm.o oVar = this.f42281a;
        if (length > 0 && zArr[0]) {
            if (this.f42282b == null) {
                this.f42282b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f42282b;
            um.c h10 = cVar.h("has_invalid_instagram_auth");
            bool2 = vsVar.f42970a;
            mVar.e(h10, bool2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42282b == null) {
                this.f42282b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f42282b;
            um.c h13 = cVar.h("is_new_api");
            bool = vsVar.f42971b;
            mVar2.e(h13, bool);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42283c == null) {
                this.f42283c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42283c;
            um.c h14 = cVar.h("url");
            str2 = vsVar.f42972c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42283c == null) {
                this.f42283c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42283c;
            um.c h15 = cVar.h("username");
            str = vsVar.f42973d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
