package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class sh extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41918a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41919b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41920c;

    public sh(nm.o oVar) {
        this.f41918a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        rh rhVar = new rh(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1268958287:
                    if (k03.equals("follow")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -326696768:
                    if (k03.equals("long_press")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3594468:
                    if (k03.equals("undo")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 866537107:
                    if (k03.equals("closeup")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41918a;
            if (c13 == 0) {
                if (this.f41919b == null) {
                    this.f41919b = a.cb.q(oVar, Integer.class);
                }
                rhVar.f41603d = (Integer) this.f41919b.c(aVar);
                boolean[] zArr = rhVar.f41606g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f41919b == null) {
                    this.f41919b = a.cb.q(oVar, Integer.class);
                }
                rhVar.f41604e = (Integer) this.f41919b.c(aVar);
                boolean[] zArr2 = rhVar.f41606g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f41920c == null) {
                    this.f41920c = a.cb.q(oVar, String.class);
                }
                rhVar.f41600a = (String) this.f41920c.c(aVar);
                boolean[] zArr3 = rhVar.f41606g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f41919b == null) {
                    this.f41919b = a.cb.q(oVar, Integer.class);
                }
                rhVar.f41605f = (Integer) this.f41919b.c(aVar);
                boolean[] zArr4 = rhVar.f41606g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f41919b == null) {
                    this.f41919b = a.cb.q(oVar, Integer.class);
                }
                rhVar.f41602c = (Integer) this.f41919b.c(aVar);
                boolean[] zArr5 = rhVar.f41606g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41920c == null) {
                    this.f41920c = a.cb.q(oVar, String.class);
                }
                rhVar.f41601b = (String) this.f41920c.c(aVar);
                boolean[] zArr6 = rhVar.f41606g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new uh(rhVar.f41600a, rhVar.f41601b, rhVar.f41602c, rhVar.f41603d, rhVar.f41604e, rhVar.f41605f, rhVar.f41606g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str;
        String str2;
        uh uhVar = (uh) obj;
        if (uhVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = uhVar.f42565g;
        int length = zArr.length;
        nm.o oVar = this.f41918a;
        if (length > 0 && zArr[0]) {
            if (this.f41920c == null) {
                this.f41920c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41920c;
            um.c h10 = cVar.h("id");
            str2 = uhVar.f42559a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41920c == null) {
                this.f41920c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41920c;
            um.c h13 = cVar.h("node_id");
            str = uhVar.f42560b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41919b == null) {
                this.f41919b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41919b;
            um.c h14 = cVar.h("closeup");
            num4 = uhVar.f42561c;
            mVar3.e(h14, num4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41919b == null) {
                this.f41919b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f41919b;
            um.c h15 = cVar.h("follow");
            num3 = uhVar.f42562d;
            mVar4.e(h15, num3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41919b == null) {
                this.f41919b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41919b;
            um.c h16 = cVar.h("long_press");
            num2 = uhVar.f42563e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41919b == null) {
                this.f41919b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f41919b;
            um.c h17 = cVar.h("undo");
            num = uhVar.f42564f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
