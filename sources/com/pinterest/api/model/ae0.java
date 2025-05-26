package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ae0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35710a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35711b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35712c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35713d;

    public ae0(nm.o oVar) {
        this.f35710a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zd0 zd0Var = new zd0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1539906063:
                    if (k03.equals("font_size")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1420614337:
                    if (k03.equals("hex_color")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1179531240:
                    if (k03.equals("highlight_color")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -680931573:
                    if (k03.equals("font_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 94842723:
                    if (k03.equals("color")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1152559194:
                    if (k03.equals("vertical_alignment")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1767875043:
                    if (k03.equals("alignment")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35710a;
            switch (c13) {
                case 0:
                    if (this.f35711b == null) {
                        this.f35711b = a.cb.q(oVar, Double.class);
                    }
                    zd0Var.f44307d = (Double) this.f35711b.c(aVar);
                    boolean[] zArr = zd0Var.f44311h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f35713d == null) {
                        this.f35713d = a.cb.q(oVar, String.class);
                    }
                    zd0Var.f44308e = (String) this.f35713d.c(aVar);
                    boolean[] zArr2 = zd0Var.f44311h;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f35713d == null) {
                        this.f35713d = a.cb.q(oVar, String.class);
                    }
                    zd0Var.f44309f = (String) this.f35713d.c(aVar);
                    boolean[] zArr3 = zd0Var.f44311h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f35712c == null) {
                        this.f35712c = a.cb.q(oVar, Integer.class);
                    }
                    zd0Var.f44306c = (Integer) this.f35712c.c(aVar);
                    boolean[] zArr4 = zd0Var.f44311h;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f35713d == null) {
                        this.f35713d = a.cb.q(oVar, String.class);
                    }
                    zd0Var.f44305b = (String) this.f35713d.c(aVar);
                    boolean[] zArr5 = zd0Var.f44311h;
                    if (zArr5.length <= 1) {
                        break;
                    } else {
                        zArr5[1] = true;
                        break;
                    }
                case 5:
                    if (this.f35712c == null) {
                        this.f35712c = a.cb.q(oVar, Integer.class);
                    }
                    zd0Var.f44310g = (Integer) this.f35712c.c(aVar);
                    boolean[] zArr6 = zd0Var.f44311h;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f35712c == null) {
                        this.f35712c = a.cb.q(oVar, Integer.class);
                    }
                    zd0Var.f44304a = (Integer) this.f35712c.c(aVar);
                    boolean[] zArr7 = zd0Var.f44311h;
                    if (zArr7.length <= 0) {
                        break;
                    } else {
                        zArr7[0] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ce0(zd0Var.f44304a, zd0Var.f44305b, zd0Var.f44306c, zd0Var.f44307d, zd0Var.f44308e, zd0Var.f44309f, zd0Var.f44310g, zd0Var.f44311h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        Double d2;
        Integer num2;
        String str3;
        Integer num3;
        ce0 ce0Var = (ce0) obj;
        if (ce0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ce0Var.f36401h;
        int length = zArr.length;
        nm.o oVar = this.f35710a;
        if (length > 0 && zArr[0]) {
            if (this.f35712c == null) {
                this.f35712c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f35712c;
            um.c h10 = cVar.h("alignment");
            num3 = ce0Var.f36394a;
            mVar.e(h10, num3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35713d == null) {
                this.f35713d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35713d;
            um.c h13 = cVar.h("color");
            str3 = ce0Var.f36395b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35712c == null) {
                this.f35712c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f35712c;
            um.c h14 = cVar.h("font_id");
            num2 = ce0Var.f36396c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35711b == null) {
                this.f35711b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f35711b;
            um.c h15 = cVar.h("font_size");
            d2 = ce0Var.f36397d;
            mVar4.e(h15, d2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35713d == null) {
                this.f35713d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35713d;
            um.c h16 = cVar.h("hex_color");
            str2 = ce0Var.f36398e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35713d == null) {
                this.f35713d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35713d;
            um.c h17 = cVar.h("highlight_color");
            str = ce0Var.f36399f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35712c == null) {
                this.f35712c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f35712c;
            um.c h18 = cVar.h("vertical_alignment");
            num = ce0Var.f36400g;
            mVar7.e(h18, num);
        }
        cVar.g();
    }
}
