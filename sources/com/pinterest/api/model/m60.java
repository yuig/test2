package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class m60 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40009a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40010b;

    public m60(nm.o oVar) {
        this.f40009a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        l60 l60Var = new l60(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -737588055:
                    if (k03.equals("icon_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1107732402:
                    if (k03.equals("l1_category_name")) {
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
            nm.o oVar = this.f40009a;
            if (c13 == 0) {
                if (this.f40010b == null) {
                    this.f40010b = a.cb.q(oVar, String.class);
                }
                l60Var.f39663c = (String) this.f40010b.c(aVar);
                boolean[] zArr = l60Var.f39666f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f40010b == null) {
                    this.f40010b = a.cb.q(oVar, String.class);
                }
                l60Var.f39661a = (String) this.f40010b.c(aVar);
                boolean[] zArr2 = l60Var.f39666f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f40010b == null) {
                    this.f40010b = a.cb.q(oVar, String.class);
                }
                l60Var.f39665e = (String) this.f40010b.c(aVar);
                boolean[] zArr3 = l60Var.f39666f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f40010b == null) {
                    this.f40010b = a.cb.q(oVar, String.class);
                }
                l60Var.f39664d = (String) this.f40010b.c(aVar);
                boolean[] zArr4 = l60Var.f39666f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f40010b == null) {
                    this.f40010b = a.cb.q(oVar, String.class);
                }
                l60Var.f39662b = (String) this.f40010b.c(aVar);
                boolean[] zArr5 = l60Var.f39666f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new o60(l60Var.f39661a, l60Var.f39662b, l60Var.f39663c, l60Var.f39664d, l60Var.f39665e, l60Var.f39666f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        o60 o60Var = (o60) obj;
        if (o60Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o60Var.f40632f;
        int length = zArr.length;
        nm.o oVar = this.f40009a;
        if (length > 0 && zArr[0]) {
            if (this.f40010b == null) {
                this.f40010b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40010b;
            um.c h10 = cVar.h("id");
            str5 = o60Var.f40627a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40010b == null) {
                this.f40010b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40010b;
            um.c h13 = cVar.h("node_id");
            str4 = o60Var.f40628b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40010b == null) {
                this.f40010b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40010b;
            um.c h14 = cVar.h("icon_url");
            str3 = o60Var.f40629c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40010b == null) {
                this.f40010b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40010b;
            um.c h15 = cVar.h("l1_category_name");
            str2 = o60Var.f40630d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40010b == null) {
                this.f40010b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40010b;
            um.c h16 = cVar.h("name");
            str = o60Var.f40631e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
