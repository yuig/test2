package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ip0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38835a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38836b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38837c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38838d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38839e;

    public ip0(nm.o oVar) {
        this.f38835a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hp0 hp0Var = new hp0(0);
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
                case 109780401:
                    if (k03.equals("style")) {
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
            nm.o oVar = this.f38835a;
            if (c13 == 0) {
                if (this.f38839e == null) {
                    this.f38839e = a.cb.q(oVar, String.class);
                }
                hp0Var.f38514d = (String) this.f38839e.c(aVar);
                boolean[] zArr = hp0Var.f38516f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38839e == null) {
                    this.f38839e = a.cb.q(oVar, String.class);
                }
                hp0Var.f38515e = (String) this.f38839e.c(aVar);
                boolean[] zArr2 = hp0Var.f38516f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f38838d == null) {
                    this.f38838d = a.cb.q(oVar, iq0.class);
                }
                hp0Var.f38513c = (iq0) this.f38838d.c(aVar);
                boolean[] zArr3 = hp0Var.f38516f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f38837c == null) {
                    this.f38837c = a.cb.q(oVar, zk0.class);
                }
                hp0Var.f38512b = (zk0) this.f38837c.c(aVar);
                boolean[] zArr4 = hp0Var.f38516f;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38836b == null) {
                    this.f38836b = a.cb.q(oVar, Integer.class);
                }
                hp0Var.f38511a = (Integer) this.f38836b.c(aVar);
                boolean[] zArr5 = hp0Var.f38516f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new kp0(hp0Var.f38511a, hp0Var.f38512b, hp0Var.f38513c, hp0Var.f38514d, hp0Var.f38515e, hp0Var.f38516f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        iq0 iq0Var;
        zk0 zk0Var;
        Integer num;
        kp0 kp0Var = (kp0) obj;
        if (kp0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kp0Var.f39512f;
        int length = zArr.length;
        nm.o oVar = this.f38835a;
        if (length > 0 && zArr[0]) {
            if (this.f38836b == null) {
                this.f38836b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f38836b;
            um.c h10 = cVar.h("block_type");
            num = kp0Var.f39507a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38837c == null) {
                this.f38837c = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f38837c;
            um.c h13 = cVar.h("block_style");
            zk0Var = kp0Var.f39508b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38838d == null) {
                this.f38838d = a.cb.q(oVar, iq0.class);
            }
            nm.m mVar3 = this.f38838d;
            um.c h14 = cVar.h("style");
            iq0Var = kp0Var.f39509c;
            mVar3.e(h14, iq0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38839e == null) {
                this.f38839e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38839e;
            um.c h15 = cVar.h("text");
            str2 = kp0Var.f39510d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38839e == null) {
                this.f38839e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38839e;
            um.c h16 = cVar.h("type");
            str = kp0Var.f39511e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
