package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class xq0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43766a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43767b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43768c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43769d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43770e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43771f;

    public xq0(nm.o oVar) {
        this.f43766a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wq0 wq0Var = new wq0(0);
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
                case 1725551537:
                    if (k03.equals("end_time")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43766a;
            switch (c13) {
                case 0:
                    if (this.f43767b == null) {
                        this.f43767b = a.cb.q(oVar, Boolean.class);
                    }
                    wq0Var.f43343d = (Boolean) this.f43767b.c(aVar);
                    boolean[] zArr = wq0Var.f43347h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f43768c == null) {
                        this.f43768c = a.cb.q(oVar, Double.class);
                    }
                    wq0Var.f43345f = (Double) this.f43768c.c(aVar);
                    boolean[] zArr2 = wq0Var.f43347h;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f43771f == null) {
                        this.f43771f = a.cb.q(oVar, String.class);
                    }
                    wq0Var.f43344e = (String) this.f43771f.c(aVar);
                    boolean[] zArr3 = wq0Var.f43347h;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f43771f == null) {
                        this.f43771f = a.cb.q(oVar, String.class);
                    }
                    wq0Var.f43346g = (String) this.f43771f.c(aVar);
                    boolean[] zArr4 = wq0Var.f43347h;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f43770e == null) {
                        this.f43770e = a.cb.q(oVar, zk0.class);
                    }
                    wq0Var.f43341b = (zk0) this.f43770e.c(aVar);
                    boolean[] zArr5 = wq0Var.f43347h;
                    if (zArr5.length <= 1) {
                        break;
                    } else {
                        zArr5[1] = true;
                        break;
                    }
                case 5:
                    if (this.f43769d == null) {
                        this.f43769d = a.cb.q(oVar, Integer.class);
                    }
                    wq0Var.f43340a = (Integer) this.f43769d.c(aVar);
                    boolean[] zArr6 = wq0Var.f43347h;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f43768c == null) {
                        this.f43768c = a.cb.q(oVar, Double.class);
                    }
                    wq0Var.f43342c = (Double) this.f43768c.c(aVar);
                    boolean[] zArr7 = wq0Var.f43347h;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new zq0(wq0Var.f43340a, wq0Var.f43341b, wq0Var.f43342c, wq0Var.f43343d, wq0Var.f43344e, wq0Var.f43345f, wq0Var.f43346g, wq0Var.f43347h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Double d2;
        String str2;
        Boolean bool;
        Double d13;
        zk0 zk0Var;
        Integer num;
        zq0 zq0Var = (zq0) obj;
        if (zq0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zq0Var.f44420h;
        int length = zArr.length;
        nm.o oVar = this.f43766a;
        if (length > 0 && zArr[0]) {
            if (this.f43769d == null) {
                this.f43769d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f43769d;
            um.c h10 = cVar.h("block_type");
            num = zq0Var.f44413a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43770e == null) {
                this.f43770e = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f43770e;
            um.c h13 = cVar.h("block_style");
            zk0Var = zq0Var.f44414b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43768c == null) {
                this.f43768c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f43768c;
            um.c h14 = cVar.h("end_time");
            d13 = zq0Var.f44415c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43767b == null) {
                this.f43767b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f43767b;
            um.c h15 = cVar.h("is_removed");
            bool = zq0Var.f44416d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43771f == null) {
                this.f43771f = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43771f;
            um.c h16 = cVar.h("pin_id");
            str2 = zq0Var.f44417e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43768c == null) {
                this.f43768c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f43768c;
            um.c h17 = cVar.h("start_time");
            d2 = zq0Var.f44418f;
            mVar6.e(h17, d2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43771f == null) {
                this.f43771f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f43771f;
            um.c h18 = cVar.h("type");
            str = zq0Var.f44419g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
