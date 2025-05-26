package com.pinterest.api.model;

import com.pinterest.api.model.mp0;

/* loaded from: classes3.dex */
public final class np0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40454a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40455b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40456c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40457d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40458e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40459f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40460g;

    public np0(nm.o oVar) {
        this.f40454a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lp0 lp0Var = new lp0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1702821301:
                    if (k03.equals("is_removed")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1573145462:
                    if (k03.equals("start_time")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
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
                case 1462626351:
                    if (k03.equals("sticker_style")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1725551537:
                    if (k03.equals("end_time")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            boolean[] zArr = lp0Var.f39861i;
            nm.o oVar = this.f40454a;
            switch (c13) {
                case 0:
                    if (this.f40455b == null) {
                        this.f40455b = a.cb.q(oVar, Boolean.class);
                    }
                    lp0Var.f39856d = (Boolean) this.f40455b.c(aVar);
                    boolean[] zArr2 = lp0Var.f39861i;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 1:
                    if (this.f40456c == null) {
                        this.f40456c = a.cb.q(oVar, Double.class);
                    }
                    lp0Var.f39858f = (Double) this.f40456c.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 2:
                    if (this.f40460g == null) {
                        this.f40460g = a.cb.q(oVar, String.class);
                    }
                    lp0Var.f39857e = (String) this.f40460g.c(aVar);
                    boolean[] zArr3 = lp0Var.f39861i;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f40460g == null) {
                        this.f40460g = a.cb.q(oVar, String.class);
                    }
                    lp0Var.f39860h = (String) this.f40460g.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 4:
                    if (this.f40458e == null) {
                        this.f40458e = a.cb.q(oVar, zk0.class);
                    }
                    lp0Var.f39854b = (zk0) this.f40458e.c(aVar);
                    boolean[] zArr4 = lp0Var.f39861i;
                    if (zArr4.length <= 1) {
                        break;
                    } else {
                        zArr4[1] = true;
                        break;
                    }
                case 5:
                    if (this.f40457d == null) {
                        this.f40457d = a.cb.q(oVar, Integer.class);
                    }
                    lp0Var.f39853a = (Integer) this.f40457d.c(aVar);
                    boolean[] zArr5 = lp0Var.f39861i;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 6:
                    if (this.f40459f == null) {
                        this.f40459f = a.cb.q(oVar, mp0.a.class);
                    }
                    lp0Var.f39859g = (mp0.a) this.f40459f.c(aVar);
                    boolean[] zArr6 = lp0Var.f39861i;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 7:
                    if (this.f40456c == null) {
                        this.f40456c = a.cb.q(oVar, Double.class);
                    }
                    lp0Var.f39855c = (Double) this.f40456c.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return lp0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        mp0.a aVar;
        Double d2;
        String str2;
        Boolean bool;
        Double d13;
        zk0 zk0Var;
        Integer num;
        mp0 mp0Var = (mp0) obj;
        if (mp0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mp0Var.f40183i;
        int length = zArr.length;
        nm.o oVar = this.f40454a;
        if (length > 0 && zArr[0]) {
            if (this.f40457d == null) {
                this.f40457d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f40457d;
            um.c h10 = cVar.h("block_type");
            num = mp0Var.f40175a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40458e == null) {
                this.f40458e = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f40458e;
            um.c h13 = cVar.h("block_style");
            zk0Var = mp0Var.f40176b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40456c == null) {
                this.f40456c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f40456c;
            um.c h14 = cVar.h("end_time");
            d13 = mp0Var.f40177c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40455b == null) {
                this.f40455b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f40455b;
            um.c h15 = cVar.h("is_removed");
            bool = mp0Var.f40178d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40460g == null) {
                this.f40460g = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40460g;
            um.c h16 = cVar.h("pin_id");
            str2 = mp0Var.f40179e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40456c == null) {
                this.f40456c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f40456c;
            um.c h17 = cVar.h("start_time");
            d2 = mp0Var.f40180f;
            mVar6.e(h17, d2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40459f == null) {
                this.f40459f = a.cb.q(oVar, mp0.a.class);
            }
            nm.m mVar7 = this.f40459f;
            um.c h18 = cVar.h("sticker_style");
            aVar = mp0Var.f40181g;
            mVar7.e(h18, aVar);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40460g == null) {
                this.f40460g = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f40460g;
            um.c h19 = cVar.h("type");
            str = mp0Var.f40182h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
