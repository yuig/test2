package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ru0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41673a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41674b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41675c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41676d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41677e;

    public ru0(nm.o oVar) {
        this.f41673a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qu0 qu0Var = new qu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -993141291:
                    if (k03.equals("property")) {
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
                case 95027439:
                    if (k03.equals("curve")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 105292375:
                    if (k03.equals("begin_frame")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1187565784:
                    if (k03.equals("custom_timing")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1939817737:
                    if (k03.equals("end_frame")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41673a;
            switch (c13) {
                case 0:
                    if (this.f41677e == null) {
                        this.f41677e = a.cb.q(oVar, xu0.class);
                    }
                    qu0Var.f41385g = (xu0) this.f41677e.c(aVar);
                    boolean[] zArr = qu0Var.f41386h;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f41675c == null) {
                        this.f41675c = a.cb.q(oVar, String.class);
                    }
                    qu0Var.f41379a = (String) this.f41675c.c(aVar);
                    boolean[] zArr2 = qu0Var.f41386h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f41674b == null) {
                        this.f41674b = a.cb.q(oVar, Integer.class);
                    }
                    qu0Var.f41382d = (Integer) this.f41674b.c(aVar);
                    boolean[] zArr3 = qu0Var.f41386h;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f41674b == null) {
                        this.f41674b = a.cb.q(oVar, Integer.class);
                    }
                    qu0Var.f41381c = (Integer) this.f41674b.c(aVar);
                    boolean[] zArr4 = qu0Var.f41386h;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f41676d == null) {
                        this.f41676d = a.cb.q(oVar, lu0.class);
                    }
                    qu0Var.f41383e = (lu0) this.f41676d.c(aVar);
                    boolean[] zArr5 = qu0Var.f41386h;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f41674b == null) {
                        this.f41674b = a.cb.q(oVar, Integer.class);
                    }
                    qu0Var.f41384f = (Integer) this.f41674b.c(aVar);
                    boolean[] zArr6 = qu0Var.f41386h;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f41675c == null) {
                        this.f41675c = a.cb.q(oVar, String.class);
                    }
                    qu0Var.f41380b = (String) this.f41675c.c(aVar);
                    boolean[] zArr7 = qu0Var.f41386h;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new tu0(qu0Var.f41379a, qu0Var.f41380b, qu0Var.f41381c, qu0Var.f41382d, qu0Var.f41383e, qu0Var.f41384f, qu0Var.f41385g, qu0Var.f41386h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        xu0 xu0Var;
        Integer num;
        lu0 lu0Var;
        Integer num2;
        Integer num3;
        String str;
        String str2;
        tu0 tu0Var = (tu0) obj;
        if (tu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tu0Var.f42310h;
        int length = zArr.length;
        nm.o oVar = this.f41673a;
        if (length > 0 && zArr[0]) {
            if (this.f41675c == null) {
                this.f41675c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41675c;
            um.c h10 = cVar.h("id");
            str2 = tu0Var.f42303a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41675c == null) {
                this.f41675c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41675c;
            um.c h13 = cVar.h("node_id");
            str = tu0Var.f42304b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41674b == null) {
                this.f41674b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41674b;
            um.c h14 = cVar.h("begin_frame");
            num3 = tu0Var.f42305c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41674b == null) {
                this.f41674b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f41674b;
            um.c h15 = cVar.h("curve");
            num2 = tu0Var.f42306d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41676d == null) {
                this.f41676d = a.cb.q(oVar, lu0.class);
            }
            nm.m mVar5 = this.f41676d;
            um.c h16 = cVar.h("custom_timing");
            lu0Var = tu0Var.f42307e;
            mVar5.e(h16, lu0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41674b == null) {
                this.f41674b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f41674b;
            um.c h17 = cVar.h("end_frame");
            num = tu0Var.f42308f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41677e == null) {
                this.f41677e = a.cb.q(oVar, xu0.class);
            }
            nm.m mVar7 = this.f41677e;
            um.c h18 = cVar.h("property");
            xu0Var = tu0Var.f42309g;
            mVar7.e(h18, xu0Var);
        }
        cVar.g();
    }
}
