package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class im0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38816a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38817b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38818c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38819d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38820e;

    public im0(nm.o oVar) {
        this.f38816a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hm0 hm0Var = new hm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1227548543:
                    if (k03.equals("block_style")) {
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
            boolean[] zArr = hm0Var.f38493f;
            nm.o oVar = this.f38816a;
            if (c13 == 0) {
                if (this.f38820e == null) {
                    this.f38820e = a.cb.q(oVar, String.class);
                }
                hm0Var.f38492e = (String) this.f38820e.c(aVar);
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f38819d == null) {
                    this.f38819d = a.cb.q(oVar, om0.class);
                }
                hm0Var.f38490c = (om0) this.f38819d.c(aVar);
                boolean[] zArr2 = hm0Var.f38493f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f38820e == null) {
                    this.f38820e = a.cb.q(oVar, String.class);
                }
                hm0Var.f38491d = (String) this.f38820e.c(aVar);
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f38818c == null) {
                    this.f38818c = a.cb.q(oVar, zk0.class);
                }
                hm0Var.f38489b = (zk0) this.f38818c.c(aVar);
                boolean[] zArr3 = hm0Var.f38493f;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38817b == null) {
                    this.f38817b = a.cb.q(oVar, Integer.class);
                }
                hm0Var.f38488a = (Integer) this.f38817b.c(aVar);
                boolean[] zArr4 = hm0Var.f38493f;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new km0(hm0Var.f38488a, hm0Var.f38489b, hm0Var.f38490c, hm0Var.f38491d, hm0Var.f38492e, hm0Var.f38493f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        om0 om0Var;
        zk0 zk0Var;
        Integer num;
        km0 km0Var = (km0) obj;
        if (km0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = km0Var.f39497f;
        int length = zArr.length;
        nm.o oVar = this.f38816a;
        if (length > 0 && zArr[0]) {
            if (this.f38817b == null) {
                this.f38817b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f38817b;
            um.c h10 = cVar.h("block_type");
            num = km0Var.f39492a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38818c == null) {
                this.f38818c = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f38818c;
            um.c h13 = cVar.h("block_style");
            zk0Var = km0Var.f39493b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38819d == null) {
                this.f38819d = a.cb.q(oVar, om0.class);
            }
            nm.m mVar3 = this.f38819d;
            um.c h14 = cVar.h("image");
            om0Var = km0Var.f39494c;
            mVar3.e(h14, om0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38820e == null) {
                this.f38820e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38820e;
            um.c h15 = cVar.h("image_signature");
            str2 = km0Var.f39495d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38820e == null) {
                this.f38820e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38820e;
            um.c h16 = cVar.h("type");
            str = km0Var.f39496e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
