package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class jb extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39023a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39024b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39025c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39026d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39027e;

    public jb(nm.o oVar) {
        this.f39023a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ib ibVar = new ib(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1001078227:
                    if (k03.equals("progress")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -544580645:
                    if (k03.equals("is_origin")) {
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
                case 434195637:
                    if (k03.equals("section_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1583758243:
                    if (k03.equals("action_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1610764564:
                    if (k03.equals("board_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39023a;
            if (c13 == 0) {
                if (this.f39025c == null) {
                    this.f39025c = a.cb.q(oVar, Double.class);
                }
                ibVar.f38723e = (Double) this.f39025c.c(aVar);
                boolean[] zArr = ibVar.f38725g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f39024b == null) {
                    this.f39024b = a.cb.q(oVar, Boolean.class);
                }
                ibVar.f38722d = (Boolean) this.f39024b.c(aVar);
                boolean[] zArr2 = ibVar.f38725g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f39027e == null) {
                    this.f39027e = a.cb.q(oVar, String.class);
                }
                ibVar.f38721c = (String) this.f39027e.c(aVar);
                boolean[] zArr3 = ibVar.f38725g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f39027e == null) {
                    this.f39027e = a.cb.q(oVar, String.class);
                }
                ibVar.f38724f = (String) this.f39027e.c(aVar);
                boolean[] zArr4 = ibVar.f38725g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f39026d == null) {
                    this.f39026d = a.cb.q(oVar, Integer.class);
                }
                ibVar.f38719a = (Integer) this.f39026d.c(aVar);
                boolean[] zArr5 = ibVar.f38725g;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39027e == null) {
                    this.f39027e = a.cb.q(oVar, String.class);
                }
                ibVar.f38720b = (String) this.f39027e.c(aVar);
                boolean[] zArr6 = ibVar.f38725g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new lb(ibVar.f38719a, ibVar.f38720b, ibVar.f38721c, ibVar.f38722d, ibVar.f38723e, ibVar.f38724f, ibVar.f38725g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Double d2;
        Boolean bool;
        String str2;
        String str3;
        Integer num;
        lb lbVar = (lb) obj;
        if (lbVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lbVar.f39692g;
        int length = zArr.length;
        nm.o oVar = this.f39023a;
        if (length > 0 && zArr[0]) {
            if (this.f39026d == null) {
                this.f39026d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f39026d;
            um.c h10 = cVar.h("action_type");
            num = lbVar.f39686a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39027e == null) {
                this.f39027e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39027e;
            um.c h13 = cVar.h("board_id");
            str3 = lbVar.f39687b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39027e == null) {
                this.f39027e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39027e;
            um.c h14 = cVar.h("id");
            str2 = lbVar.f39688c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39024b == null) {
                this.f39024b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f39024b;
            um.c h15 = cVar.h("is_origin");
            bool = lbVar.f39689d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39025c == null) {
                this.f39025c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f39025c;
            um.c h16 = cVar.h("progress");
            d2 = lbVar.f39690e;
            mVar5.e(h16, d2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39027e == null) {
                this.f39027e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39027e;
            um.c h17 = cVar.h("section_id");
            str = lbVar.f39691f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
