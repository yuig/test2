package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class au extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35859a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35860b;

    public au(nm.o oVar) {
        this.f35859a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zt ztVar = new zt(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 96619420:
                    if (k03.equals("email")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 156698094:
                    if (k03.equals("line_token")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 176901446:
                    if (k03.equals("line_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35859a;
            if (c13 == 0) {
                if (this.f35860b == null) {
                    this.f35860b = a.cb.q(oVar, String.class);
                }
                ztVar.f44453a = (String) this.f35860b.c(aVar);
                boolean[] zArr = ztVar.f44458f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f35860b == null) {
                    this.f35860b = a.cb.q(oVar, String.class);
                }
                ztVar.f44455c = (String) this.f35860b.c(aVar);
                boolean[] zArr2 = ztVar.f44458f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f35860b == null) {
                    this.f35860b = a.cb.q(oVar, String.class);
                }
                ztVar.f44457e = (String) this.f35860b.c(aVar);
                boolean[] zArr3 = ztVar.f44458f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f35860b == null) {
                    this.f35860b = a.cb.q(oVar, String.class);
                }
                ztVar.f44456d = (String) this.f35860b.c(aVar);
                boolean[] zArr4 = ztVar.f44458f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f35860b == null) {
                    this.f35860b = a.cb.q(oVar, String.class);
                }
                ztVar.f44454b = (String) this.f35860b.c(aVar);
                boolean[] zArr5 = ztVar.f44458f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new cu(ztVar.f44453a, ztVar.f44454b, ztVar.f44455c, ztVar.f44456d, ztVar.f44457e, ztVar.f44458f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cu cuVar = (cu) obj;
        if (cuVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cuVar.f36530f;
        int length = zArr.length;
        nm.o oVar = this.f35859a;
        if (length > 0 && zArr[0]) {
            if (this.f35860b == null) {
                this.f35860b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35860b;
            um.c h10 = cVar.h("id");
            str5 = cuVar.f36525a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35860b == null) {
                this.f35860b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35860b;
            um.c h13 = cVar.h("node_id");
            str4 = cuVar.f36526b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35860b == null) {
                this.f35860b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35860b;
            um.c h14 = cVar.h("email");
            str3 = cuVar.f36527c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35860b == null) {
                this.f35860b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35860b;
            um.c h15 = cVar.h("line_id");
            str2 = cuVar.f36528d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35860b == null) {
                this.f35860b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35860b;
            um.c h16 = cVar.h("line_token");
            str = cuVar.f36529e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
