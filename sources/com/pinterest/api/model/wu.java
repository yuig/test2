package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wu extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43376a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43377b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43378c;

    public wu(nm.o oVar) {
        this.f43376a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vu vuVar = new vu(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -837465425:
                    if (k03.equals("expiration")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -243895754:
                    if (k03.equals("access_key_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 201381648:
                    if (k03.equals("session_token")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 578497011:
                    if (k03.equals("secret_access_key")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43376a;
            if (c13 == 0) {
                if (this.f43377b == null) {
                    this.f43377b = a.cb.q(oVar, Integer.class);
                }
                vuVar.f42985b = (Integer) this.f43377b.c(aVar);
                boolean[] zArr = vuVar.f42988e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f43378c == null) {
                    this.f43378c = a.cb.q(oVar, String.class);
                }
                vuVar.f42984a = (String) this.f43378c.c(aVar);
                boolean[] zArr2 = vuVar.f42988e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43378c == null) {
                    this.f43378c = a.cb.q(oVar, String.class);
                }
                vuVar.f42987d = (String) this.f43378c.c(aVar);
                boolean[] zArr3 = vuVar.f42988e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f43378c == null) {
                    this.f43378c = a.cb.q(oVar, String.class);
                }
                vuVar.f42986c = (String) this.f43378c.c(aVar);
                boolean[] zArr4 = vuVar.f42988e;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            }
        }
        aVar.g();
        return new yu(vuVar.f42984a, vuVar.f42985b, vuVar.f42986c, vuVar.f42987d, vuVar.f42988e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        yu yuVar = (yu) obj;
        if (yuVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yuVar.f44126e;
        int length = zArr.length;
        nm.o oVar = this.f43376a;
        if (length > 0 && zArr[0]) {
            if (this.f43378c == null) {
                this.f43378c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43378c;
            um.c h10 = cVar.h("access_key_id");
            str3 = yuVar.f44122a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43377b == null) {
                this.f43377b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f43377b;
            um.c h13 = cVar.h("expiration");
            num = yuVar.f44123b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43378c == null) {
                this.f43378c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43378c;
            um.c h14 = cVar.h("secret_access_key");
            str2 = yuVar.f44124c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43378c == null) {
                this.f43378c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43378c;
            um.c h15 = cVar.h("session_token");
            str = yuVar.f44125d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
