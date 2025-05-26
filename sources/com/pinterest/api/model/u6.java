package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class u6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42421a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42422b;

    public u6(nm.o oVar) {
        this.f42421a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        w6 w6Var = new w6(0);
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
                case -96125927:
                    if (k03.equals("provider_name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 86218551:
                    if (k03.equals("provider_icon_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 712986815:
                    if (k03.equals("author_name")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42421a;
            if (c13 == 0) {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.c((String) this.f42422b.c(aVar));
            } else if (c13 == 1) {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.e((String) this.f42422b.c(aVar));
            } else if (c13 == 2) {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.g((String) this.f42422b.c(aVar));
            } else if (c13 == 3) {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.d((String) this.f42422b.c(aVar));
            } else if (c13 == 4) {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.f((String) this.f42422b.c(aVar));
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f42422b == null) {
                    this.f42422b = a.cb.q(oVar, String.class);
                }
                w6Var.b((String) this.f42422b.c(aVar));
            }
        }
        aVar.g();
        return w6Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        x6 x6Var = (x6) obj;
        if (x6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = x6Var.f43605g;
        int length = zArr.length;
        nm.o oVar = this.f42421a;
        if (length > 0 && zArr[0]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42422b;
            um.c h10 = cVar.h("author_name");
            str6 = x6Var.f43599a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42422b;
            um.c h13 = cVar.h("author_url");
            str5 = x6Var.f43600b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42422b;
            um.c h14 = cVar.h("provider_icon_url");
            str4 = x6Var.f43601c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42422b;
            um.c h15 = cVar.h("provider_name");
            str3 = x6Var.f43602d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42422b;
            um.c h16 = cVar.h("title");
            str2 = x6Var.f43603e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42422b == null) {
                this.f42422b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42422b;
            um.c h17 = cVar.h("url");
            str = x6Var.f43604f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
