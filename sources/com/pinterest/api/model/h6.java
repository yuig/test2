package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class h6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38294a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38295b;

    public h6(nm.o oVar) {
        this.f38294a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j6 j6Var = new j6(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -847398795:
                    if (k03.equals("answers")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -394174336:
                    if (k03.equals("extra_context")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 952189583:
                    if (k03.equals("cookies")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1661853540:
                    if (k03.equals("session_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38294a;
            if (c13 == 0) {
                if (this.f38295b == null) {
                    this.f38295b = a.cb.q(oVar, String.class);
                }
                j6Var.e((String) this.f38295b.c(aVar));
            } else if (c13 == 1) {
                if (this.f38295b == null) {
                    this.f38295b = a.cb.q(oVar, String.class);
                }
                j6Var.b((String) this.f38295b.c(aVar));
            } else if (c13 == 2) {
                if (this.f38295b == null) {
                    this.f38295b = a.cb.q(oVar, String.class);
                }
                j6Var.d((String) this.f38295b.c(aVar));
            } else if (c13 == 3) {
                if (this.f38295b == null) {
                    this.f38295b = a.cb.q(oVar, String.class);
                }
                j6Var.c((String) this.f38295b.c(aVar));
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38295b == null) {
                    this.f38295b = a.cb.q(oVar, String.class);
                }
                j6Var.f((String) this.f38295b.c(aVar));
            }
        }
        aVar.g();
        return j6Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        k6 k6Var = (k6) obj;
        if (k6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = k6Var.f39301f;
        int length = zArr.length;
        nm.o oVar = this.f38294a;
        if (length > 0 && zArr[0]) {
            if (this.f38295b == null) {
                this.f38295b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38295b;
            um.c h10 = cVar.h("answers");
            str5 = k6Var.f39296a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38295b == null) {
                this.f38295b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38295b;
            um.c h13 = cVar.h("cookies");
            str4 = k6Var.f39297b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38295b == null) {
                this.f38295b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38295b;
            um.c h14 = cVar.h("extra_context");
            str3 = k6Var.f39298c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38295b == null) {
                this.f38295b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38295b;
            um.c h15 = cVar.h("pin_id");
            str2 = k6Var.f39299d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38295b == null) {
                this.f38295b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38295b;
            um.c h16 = cVar.h("session_id");
            str = k6Var.f39300e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
