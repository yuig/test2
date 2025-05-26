package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class a0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35597a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35598b;

    public a0(nm.o oVar) {
        this.f35597a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        c0 c0Var = new c0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1677176261:
                    if (k03.equals("full_name")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -612351174:
                    if (k03.equals("phone_number")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -129639349:
                    if (k03.equals("zip_code")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -127926097:
                    if (k03.equals("advertiser_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 50349278:
                    if (k03.equals("lead_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 96619420:
                    if (k03.equals("email")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35597a;
            if (c13 == 0) {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36258c = (String) this.f35598b.c(aVar);
                boolean[] zArr = c0Var.f36262g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36260e = (String) this.f35598b.c(aVar);
                boolean[] zArr2 = c0Var.f36262g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36261f = (String) this.f35598b.c(aVar);
                boolean[] zArr3 = c0Var.f36262g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36256a = (String) this.f35598b.c(aVar);
                boolean[] zArr4 = c0Var.f36262g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36259d = (String) this.f35598b.c(aVar);
                boolean[] zArr5 = c0Var.f36262g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f35598b == null) {
                    this.f35598b = a.cb.q(oVar, String.class);
                }
                c0Var.f36257b = (String) this.f35598b.c(aVar);
                boolean[] zArr6 = c0Var.f36262g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new d0(c0Var.f36256a, c0Var.f36257b, c0Var.f36258c, c0Var.f36259d, c0Var.f36260e, c0Var.f36261f, c0Var.f36262g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        d0 d0Var = (d0) obj;
        if (d0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = d0Var.f36595g;
        int length = zArr.length;
        nm.o oVar = this.f35597a;
        if (length > 0 && zArr[0]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35598b;
            um.c h10 = cVar.h("advertiser_id");
            str6 = d0Var.f36589a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35598b;
            um.c h13 = cVar.h("email");
            str5 = d0Var.f36590b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35598b;
            um.c h14 = cVar.h("full_name");
            str4 = d0Var.f36591c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35598b;
            um.c h15 = cVar.h("lead_id");
            str3 = d0Var.f36592d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35598b;
            um.c h16 = cVar.h("phone_number");
            str2 = d0Var.f36593e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35598b == null) {
                this.f35598b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35598b;
            um.c h17 = cVar.h("zip_code");
            str = d0Var.f36594f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
