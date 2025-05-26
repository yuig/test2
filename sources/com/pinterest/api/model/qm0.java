package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class qm0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41337a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41338b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41339c;

    public qm0(nm.o oVar) {
        this.f41337a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pm0 pm0Var = new pm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 96712:
                    if (k03.equals("amt")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3594628:
                    if (k03.equals("unit")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41337a;
            if (c13 == 0) {
                if (this.f41339c == null) {
                    this.f41339c = a.cb.q(oVar, String.class);
                }
                pm0Var.f41023b = (String) this.f41339c.c(aVar);
                boolean[] zArr = pm0Var.f41027f;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f41339c == null) {
                    this.f41339c = a.cb.q(oVar, String.class);
                }
                pm0Var.f41024c = (String) this.f41339c.c(aVar);
                boolean[] zArr2 = pm0Var.f41027f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f41339c == null) {
                    this.f41339c = a.cb.q(oVar, String.class);
                }
                pm0Var.f41025d = (String) this.f41339c.c(aVar);
                boolean[] zArr3 = pm0Var.f41027f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f41339c == null) {
                    this.f41339c = a.cb.q(oVar, String.class);
                }
                pm0Var.f41026e = (String) this.f41339c.c(aVar);
                boolean[] zArr4 = pm0Var.f41027f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41338b == null) {
                    this.f41338b = a.cb.q(oVar, Integer.class);
                }
                pm0Var.f41022a = (Integer) this.f41338b.c(aVar);
                boolean[] zArr5 = pm0Var.f41027f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new sm0(pm0Var.f41022a, pm0Var.f41023b, pm0Var.f41024c, pm0Var.f41025d, pm0Var.f41026e, pm0Var.f41027f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        sm0 sm0Var = (sm0) obj;
        if (sm0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sm0Var.f41943f;
        int length = zArr.length;
        nm.o oVar = this.f41337a;
        if (length > 0 && zArr[0]) {
            if (this.f41338b == null) {
                this.f41338b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f41338b;
            um.c h10 = cVar.h("block_type");
            num = sm0Var.f41938a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41339c == null) {
                this.f41339c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41339c;
            um.c h13 = cVar.h("amt");
            str4 = sm0Var.f41939b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41339c == null) {
                this.f41339c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41339c;
            um.c h14 = cVar.h("name");
            str3 = sm0Var.f41940c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41339c == null) {
                this.f41339c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41339c;
            um.c h15 = cVar.h("type");
            str2 = sm0Var.f41941d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41339c == null) {
                this.f41339c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41339c;
            um.c h16 = cVar.h("unit");
            str = sm0Var.f41942e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
