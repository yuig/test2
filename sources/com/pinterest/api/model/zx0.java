package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class zx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44501a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44502b;

    public zx0(nm.o oVar) {
        this.f44501a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yx0 yx0Var = new yx0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -384257410) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("owner_account_email")) {
                c13 = 0;
            }
            nm.o oVar = this.f44501a;
            if (c13 == 0) {
                if (this.f44502b == null) {
                    this.f44502b = a.cb.q(oVar, String.class);
                }
                yx0Var.f44150c = (String) this.f44502b.c(aVar);
                boolean[] zArr = yx0Var.f44151d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f44502b == null) {
                    this.f44502b = a.cb.q(oVar, String.class);
                }
                yx0Var.f44148a = (String) this.f44502b.c(aVar);
                boolean[] zArr2 = yx0Var.f44151d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f44502b == null) {
                    this.f44502b = a.cb.q(oVar, String.class);
                }
                yx0Var.f44149b = (String) this.f44502b.c(aVar);
                boolean[] zArr3 = yx0Var.f44151d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new by0(yx0Var.f44148a, yx0Var.f44149b, yx0Var.f44150c, yx0Var.f44151d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        by0 by0Var = (by0) obj;
        if (by0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = by0Var.f36229d;
        int length = zArr.length;
        nm.o oVar = this.f44501a;
        if (length > 0 && zArr[0]) {
            if (this.f44502b == null) {
                this.f44502b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44502b;
            um.c h10 = cVar.h("id");
            str3 = by0Var.f36226a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44502b == null) {
                this.f44502b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44502b;
            um.c h13 = cVar.h("node_id");
            str2 = by0Var.f36227b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44502b == null) {
                this.f44502b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44502b;
            um.c h14 = cVar.h("owner_account_email");
            str = by0Var.f36228c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
