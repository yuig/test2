package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class lx extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39934a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39935b;

    public lx(nm.o oVar) {
        this.f39934a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        kx kxVar = new kx(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1532452647:
                    if (k03.equals("num_closeups")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 507289681:
                    if (k03.equals("num_impressions")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 725182173:
                    if (k03.equals("num_clickthroughs")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1601285386:
                    if (k03.equals("num_repins")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39934a;
            if (c13 == 0) {
                if (this.f39935b == null) {
                    this.f39935b = a.cb.q(oVar, Integer.class);
                }
                kxVar.f39559b = (Integer) this.f39935b.c(aVar);
                boolean[] zArr = kxVar.f39562e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f39935b == null) {
                    this.f39935b = a.cb.q(oVar, Integer.class);
                }
                kxVar.f39560c = (Integer) this.f39935b.c(aVar);
                boolean[] zArr2 = kxVar.f39562e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f39935b == null) {
                    this.f39935b = a.cb.q(oVar, Integer.class);
                }
                kxVar.f39558a = (Integer) this.f39935b.c(aVar);
                boolean[] zArr3 = kxVar.f39562e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39935b == null) {
                    this.f39935b = a.cb.q(oVar, Integer.class);
                }
                kxVar.f39561d = (Integer) this.f39935b.c(aVar);
                boolean[] zArr4 = kxVar.f39562e;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            }
        }
        aVar.g();
        return new nx(kxVar.f39558a, kxVar.f39559b, kxVar.f39560c, kxVar.f39561d, kxVar.f39562e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        nx nxVar = (nx) obj;
        if (nxVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nxVar.f40527e;
        int length = zArr.length;
        nm.o oVar = this.f39934a;
        if (length > 0 && zArr[0]) {
            if (this.f39935b == null) {
                this.f39935b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f39935b;
            um.c h10 = cVar.h("num_clickthroughs");
            num4 = nxVar.f40523a;
            mVar.e(h10, num4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39935b == null) {
                this.f39935b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f39935b;
            um.c h13 = cVar.h("num_closeups");
            num3 = nxVar.f40524b;
            mVar2.e(h13, num3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39935b == null) {
                this.f39935b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f39935b;
            um.c h14 = cVar.h("num_impressions");
            num2 = nxVar.f40525c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39935b == null) {
                this.f39935b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39935b;
            um.c h15 = cVar.h("num_repins");
            num = nxVar.f40526d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
