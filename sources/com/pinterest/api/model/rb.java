package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class rb extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41529a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41530b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41531c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41532d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41533e;

    public rb(nm.o oVar) {
        this.f41529a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qb qbVar = new qb(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -450004177:
                    if (k03.equals("metadata")) {
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 955826371:
                    if (k03.equals("metrics")) {
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
            nm.o oVar = this.f41529a;
            if (c13 == 0) {
                if (this.f41531c == null) {
                    this.f41531c = a.cb.q(oVar, u5.class);
                }
                qbVar.f41254c = (u5) this.f41531c.c(aVar);
                boolean[] zArr = qbVar.f41257f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41533e == null) {
                    this.f41533e = a.cb.q(oVar, String.class);
                }
                qbVar.f41252a = (String) this.f41533e.c(aVar);
                boolean[] zArr2 = qbVar.f41257f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f41532d == null) {
                    this.f41532d = a.cb.q(oVar, f30.class);
                }
                qbVar.f41256e = (f30) this.f41532d.c(aVar);
                boolean[] zArr3 = qbVar.f41257f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f41530b == null) {
                    this.f41530b = a.cb.q(oVar, k4.class);
                }
                qbVar.f41255d = (k4) this.f41530b.c(aVar);
                boolean[] zArr4 = qbVar.f41257f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41533e == null) {
                    this.f41533e = a.cb.q(oVar, String.class);
                }
                qbVar.f41253b = (String) this.f41533e.c(aVar);
                boolean[] zArr5 = qbVar.f41257f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new tb(qbVar.f41252a, qbVar.f41253b, qbVar.f41254c, qbVar.f41255d, qbVar.f41256e, qbVar.f41257f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        k4 k4Var;
        u5 u5Var;
        String str;
        String str2;
        tb tbVar = (tb) obj;
        if (tbVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tbVar.f42156f;
        int length = zArr.length;
        nm.o oVar = this.f41529a;
        if (length > 0 && zArr[0]) {
            if (this.f41533e == null) {
                this.f41533e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41533e;
            um.c h10 = cVar.h("id");
            str2 = tbVar.f42151a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41533e == null) {
                this.f41533e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41533e;
            um.c h13 = cVar.h("node_id");
            str = tbVar.f42152b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41531c == null) {
                this.f41531c = a.cb.q(oVar, u5.class);
            }
            nm.m mVar3 = this.f41531c;
            um.c h14 = cVar.h("metadata");
            u5Var = tbVar.f42153c;
            mVar3.e(h14, u5Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41530b == null) {
                this.f41530b = a.cb.q(oVar, k4.class);
            }
            nm.m mVar4 = this.f41530b;
            um.c h15 = cVar.h("metrics");
            k4Var = tbVar.f42154d;
            mVar4.e(h15, k4Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41532d == null) {
                this.f41532d = a.cb.q(oVar, f30.class);
            }
            nm.m mVar5 = this.f41532d;
            um.c h16 = cVar.h("pin");
            f30Var = tbVar.f42155e;
            mVar5.e(h16, f30Var);
        }
        cVar.g();
    }
}
