package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class li0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39774a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39775b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39776c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39777d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39778e;

    public li0(nm.o oVar) {
        this.f39774a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ki0 ki0Var = new ki0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 951530617:
                    if (k03.equals("content")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 2072332025:
                    if (k03.equals("shuffle")) {
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
            nm.o oVar = this.f39774a;
            if (c13 == 0) {
                if (this.f39777d == null) {
                    this.f39777d = a.cb.q(oVar, String.class);
                }
                ki0Var.f39473a = (String) this.f39777d.c(aVar);
                boolean[] zArr = ki0Var.f39478f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39778e == null) {
                    this.f39778e = a.cb.q(oVar, wy0.class);
                }
                ki0Var.f39477e = (wy0) this.f39778e.c(aVar);
                boolean[] zArr2 = ki0Var.f39478f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f39775b == null) {
                    this.f39775b = a.cb.q(oVar, ee.class);
                }
                ki0Var.f39475c = (ee) this.f39775b.c(aVar);
                boolean[] zArr3 = ki0Var.f39478f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f39776c == null) {
                    this.f39776c = a.cb.q(oVar, fi0.class);
                }
                ki0Var.f39476d = (fi0) this.f39776c.c(aVar);
                boolean[] zArr4 = ki0Var.f39478f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f39777d == null) {
                    this.f39777d = a.cb.q(oVar, String.class);
                }
                ki0Var.f39474b = (String) this.f39777d.c(aVar);
                boolean[] zArr5 = ki0Var.f39478f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new ni0(ki0Var.f39473a, ki0Var.f39474b, ki0Var.f39475c, ki0Var.f39476d, ki0Var.f39477e, ki0Var.f39478f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        fi0 fi0Var;
        ee eeVar;
        String str;
        String str2;
        ni0 ni0Var = (ni0) obj;
        if (ni0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ni0Var.f40410f;
        int length = zArr.length;
        nm.o oVar = this.f39774a;
        if (length > 0 && zArr[0]) {
            if (this.f39777d == null) {
                this.f39777d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39777d;
            um.c h10 = cVar.h("id");
            str2 = ni0Var.f40405a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39777d == null) {
                this.f39777d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39777d;
            um.c h13 = cVar.h("node_id");
            str = ni0Var.f40406b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39775b == null) {
                this.f39775b = a.cb.q(oVar, ee.class);
            }
            nm.m mVar3 = this.f39775b;
            um.c h14 = cVar.h("content");
            eeVar = ni0Var.f40407c;
            mVar3.e(h14, eeVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39776c == null) {
                this.f39776c = a.cb.q(oVar, fi0.class);
            }
            nm.m mVar4 = this.f39776c;
            um.c h15 = cVar.h("shuffle");
            fi0Var = ni0Var.f40408d;
            mVar4.e(h15, fi0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39778e == null) {
                this.f39778e = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar5 = this.f39778e;
            um.c h16 = cVar.h("user");
            wy0Var = ni0Var.f40409e;
            mVar5.e(h16, wy0Var);
        }
        cVar.g();
    }
}
