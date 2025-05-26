package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class z6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44229a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44230b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44231c;

    public z6(nm.o oVar) {
        this.f44229a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b7 b7Var = new b7(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -352592199:
                    if (k03.equals("is_viewed")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 519365394:
                    if (k03.equals("type_text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 607153585:
                    if (k03.equals("covers_background")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1215622123:
                    if (k03.equals("upcoming_update_date_text")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44229a;
            if (c13 == 0) {
                if (this.f44230b == null) {
                    this.f44230b = a.cb.q(oVar, Boolean.class);
                }
                b7Var.c((Boolean) this.f44230b.c(aVar));
            } else if (c13 == 1) {
                if (this.f44231c == null) {
                    this.f44231c = a.cb.q(oVar, String.class);
                }
                b7Var.d((String) this.f44231c.c(aVar));
            } else if (c13 == 2) {
                if (this.f44231c == null) {
                    this.f44231c = a.cb.q(oVar, String.class);
                }
                b7Var.b((String) this.f44231c.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f44231c == null) {
                    this.f44231c = a.cb.q(oVar, String.class);
                }
                b7Var.e((String) this.f44231c.c(aVar));
            }
        }
        aVar.g();
        return b7Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        c7 c7Var = (c7) obj;
        if (c7Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = c7Var.f36318e;
        int length = zArr.length;
        nm.o oVar = this.f44229a;
        if (length > 0 && zArr[0]) {
            if (this.f44231c == null) {
                this.f44231c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44231c;
            um.c h10 = cVar.h("covers_background");
            str3 = c7Var.f36314a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44230b == null) {
                this.f44230b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f44230b;
            um.c h13 = cVar.h("is_viewed");
            bool = c7Var.f36315b;
            mVar2.e(h13, bool);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44231c == null) {
                this.f44231c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44231c;
            um.c h14 = cVar.h("type_text");
            str2 = c7Var.f36316c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44231c == null) {
                this.f44231c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44231c;
            um.c h15 = cVar.h("upcoming_update_date_text");
            str = c7Var.f36317d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
