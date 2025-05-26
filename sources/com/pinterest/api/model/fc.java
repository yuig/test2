package com.pinterest.api.model;

import com.pinterest.api.model.ec;

/* loaded from: classes3.dex */
public final class fc extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37652a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37653b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37654c;

    public fc(nm.o oVar) {
        this.f37652a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dc dcVar = new dc(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3556653) {
                    if (hashCode != 3575610) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("type")) {
                        c13 = 2;
                    }
                } else if (k03.equals("text")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f37652a;
            if (c13 == 0) {
                if (this.f37654c == null) {
                    this.f37654c = a.cb.q(oVar, String.class);
                }
                dcVar.f36717a = (String) this.f37654c.c(aVar);
                boolean[] zArr = dcVar.f36721e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f37654c == null) {
                    this.f37654c = a.cb.q(oVar, String.class);
                }
                dcVar.f36719c = (String) this.f37654c.c(aVar);
                boolean[] zArr2 = dcVar.f36721e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f37653b == null) {
                    this.f37653b = a.cb.q(oVar, ec.a.class);
                }
                dcVar.f36720d = (ec.a) this.f37653b.c(aVar);
                boolean[] zArr3 = dcVar.f36721e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f37654c == null) {
                    this.f37654c = a.cb.q(oVar, String.class);
                }
                dcVar.f36718b = (String) this.f37654c.c(aVar);
                boolean[] zArr4 = dcVar.f36721e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ec(dcVar.f36717a, dcVar.f36718b, dcVar.f36719c, dcVar.f36720d, dcVar.f36721e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ec.a aVar;
        String str;
        String str2;
        String str3;
        ec ecVar = (ec) obj;
        if (ecVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ecVar.f37238e;
        int length = zArr.length;
        nm.o oVar = this.f37652a;
        if (length > 0 && zArr[0]) {
            if (this.f37654c == null) {
                this.f37654c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37654c;
            um.c h10 = cVar.h("id");
            str3 = ecVar.f37234a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37654c == null) {
                this.f37654c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37654c;
            um.c h13 = cVar.h("node_id");
            str2 = ecVar.f37235b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37654c == null) {
                this.f37654c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37654c;
            um.c h14 = cVar.h("text");
            str = ecVar.f37236c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37653b == null) {
                this.f37653b = a.cb.q(oVar, ec.a.class);
            }
            nm.m mVar4 = this.f37653b;
            um.c h15 = cVar.h("type");
            aVar = ecVar.f37237d;
            mVar4.e(h15, aVar);
        }
        cVar.g();
    }
}
