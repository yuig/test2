package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class em0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37304a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37305b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37306c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37307d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37308e;

    public em0(nm.o oVar) {
        this.f37304a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dm0 dm0Var = new dm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 102865796:
                    if (k03.equals("level")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 109780401:
                    if (k03.equals("style")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1227548543:
                    if (k03.equals("block_style")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37304a;
            if (c13 != 0) {
                boolean[] zArr = dm0Var.f36896g;
                if (c13 == 1) {
                    if (this.f37308e == null) {
                        this.f37308e = a.cb.q(oVar, String.class);
                    }
                    dm0Var.f36895f = (String) this.f37308e.c(aVar);
                    if (zArr.length > 5) {
                        zArr[5] = true;
                    }
                } else if (c13 == 2) {
                    if (this.f37305b == null) {
                        this.f37305b = a.cb.q(oVar, Integer.class);
                    }
                    dm0Var.f36892c = (Integer) this.f37305b.c(aVar);
                    if (zArr.length > 2) {
                        zArr[2] = true;
                    }
                } else if (c13 == 3) {
                    if (this.f37307d == null) {
                        this.f37307d = a.cb.q(oVar, iq0.class);
                    }
                    dm0Var.f36893d = (iq0) this.f37307d.c(aVar);
                    if (zArr.length > 3) {
                        zArr[3] = true;
                    }
                } else if (c13 == 4) {
                    if (this.f37306c == null) {
                        this.f37306c = a.cb.q(oVar, zk0.class);
                    }
                    dm0Var.f36891b = (zk0) this.f37306c.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                    }
                } else if (c13 != 5) {
                    aVar.E();
                } else {
                    if (this.f37305b == null) {
                        this.f37305b = a.cb.q(oVar, Integer.class);
                    }
                    dm0Var.f36890a = (Integer) this.f37305b.c(aVar);
                    boolean[] zArr2 = dm0Var.f36896g;
                    if (zArr2.length > 0) {
                        zArr2[0] = true;
                    }
                }
            } else {
                if (this.f37308e == null) {
                    this.f37308e = a.cb.q(oVar, String.class);
                }
                dm0Var.f36894e = (String) this.f37308e.c(aVar);
                boolean[] zArr3 = dm0Var.f36896g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            }
        }
        aVar.g();
        return new gm0(dm0Var.f36890a, dm0Var.f36891b, dm0Var.f36892c, dm0Var.f36893d, dm0Var.f36894e, dm0Var.f36895f, dm0Var.f36896g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        iq0 iq0Var;
        Integer num;
        zk0 zk0Var;
        Integer num2;
        gm0 gm0Var = (gm0) obj;
        if (gm0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gm0Var.f38091g;
        int length = zArr.length;
        nm.o oVar = this.f37304a;
        if (length > 0 && zArr[0]) {
            if (this.f37305b == null) {
                this.f37305b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f37305b;
            um.c h10 = cVar.h("block_type");
            num2 = gm0Var.f38085a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37306c == null) {
                this.f37306c = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f37306c;
            um.c h13 = cVar.h("block_style");
            zk0Var = gm0Var.f38086b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37305b == null) {
                this.f37305b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f37305b;
            um.c h14 = cVar.h("level");
            num = gm0Var.f38087c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37307d == null) {
                this.f37307d = a.cb.q(oVar, iq0.class);
            }
            nm.m mVar4 = this.f37307d;
            um.c h15 = cVar.h("style");
            iq0Var = gm0Var.f38088d;
            mVar4.e(h15, iq0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37308e == null) {
                this.f37308e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f37308e;
            um.c h16 = cVar.h("text");
            str2 = gm0Var.f38089e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37308e == null) {
                this.f37308e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37308e;
            um.c h17 = cVar.h("type");
            str = gm0Var.f38090f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
