package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ee0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37255a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37256b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37257c;

    public ee0(nm.o oVar) {
        this.f37255a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        de0 de0Var = new de0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1819551619:
                    if (k03.equals("result_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1762229826:
                    if (k03.equals("destination_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1427488325:
                    if (k03.equals("iOS_deep_link")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 48425945:
                    if (k03.equals("organic_pin_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 414896541:
                    if (k03.equals("android_deep_link")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37255a;
            if (c13 == 0) {
                if (this.f37256b == null) {
                    this.f37256b = a.cb.q(oVar, Integer.class);
                }
                de0Var.f36740e = (Integer) this.f37256b.c(aVar);
                boolean[] zArr = de0Var.f36741f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f37257c == null) {
                    this.f37257c = a.cb.q(oVar, String.class);
                }
                de0Var.f36737b = (String) this.f37257c.c(aVar);
                boolean[] zArr2 = de0Var.f36741f;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f37257c == null) {
                    this.f37257c = a.cb.q(oVar, String.class);
                }
                de0Var.f36738c = (String) this.f37257c.c(aVar);
                boolean[] zArr3 = de0Var.f36741f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f37257c == null) {
                    this.f37257c = a.cb.q(oVar, String.class);
                }
                de0Var.f36739d = (String) this.f37257c.c(aVar);
                boolean[] zArr4 = de0Var.f36741f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f37257c == null) {
                    this.f37257c = a.cb.q(oVar, String.class);
                }
                de0Var.f36736a = (String) this.f37257c.c(aVar);
                boolean[] zArr5 = de0Var.f36741f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new ge0(de0Var.f36736a, de0Var.f36737b, de0Var.f36738c, de0Var.f36739d, de0Var.f36740e, de0Var.f36741f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        ge0 ge0Var = (ge0) obj;
        if (ge0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ge0Var.f38055f;
        int length = zArr.length;
        nm.o oVar = this.f37255a;
        if (length > 0 && zArr[0]) {
            if (this.f37257c == null) {
                this.f37257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37257c;
            um.c h10 = cVar.h("android_deep_link");
            str4 = ge0Var.f38050a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37257c == null) {
                this.f37257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37257c;
            um.c h13 = cVar.h("destination_url");
            str3 = ge0Var.f38051b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37257c == null) {
                this.f37257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37257c;
            um.c h14 = cVar.h("iOS_deep_link");
            str2 = ge0Var.f38052c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37257c == null) {
                this.f37257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37257c;
            um.c h15 = cVar.h("organic_pin_id");
            str = ge0Var.f38053d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37256b == null) {
                this.f37256b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f37256b;
            um.c h16 = cVar.h("result_id");
            num = ge0Var.f38054e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
