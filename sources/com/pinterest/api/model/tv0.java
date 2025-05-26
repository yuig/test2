package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class tv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42335a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42336b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42337c;

    public tv0(nm.o oVar) {
        this.f42335a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        sv0 sv0Var = new sv0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1540063109:
                    if (k03.equals("font_name")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1539906063:
                    if (k03.equals("font_size")) {
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
                case 94842723:
                    if (k03.equals("color")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 192046711:
                    if (k03.equals("prefilled_value")) {
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
            nm.o oVar = this.f42335a;
            if (c13 == 0) {
                if (this.f42337c == null) {
                    this.f42337c = a.cb.q(oVar, String.class);
                }
                sv0Var.f42006d = (String) this.f42337c.c(aVar);
                boolean[] zArr = sv0Var.f42009g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f42336b == null) {
                    this.f42336b = a.cb.q(oVar, Integer.class);
                }
                sv0Var.f42007e = (Integer) this.f42336b.c(aVar);
                boolean[] zArr2 = sv0Var.f42009g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f42337c == null) {
                    this.f42337c = a.cb.q(oVar, String.class);
                }
                sv0Var.f42003a = (String) this.f42337c.c(aVar);
                boolean[] zArr3 = sv0Var.f42009g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f42337c == null) {
                    this.f42337c = a.cb.q(oVar, String.class);
                }
                sv0Var.f42005c = (String) this.f42337c.c(aVar);
                boolean[] zArr4 = sv0Var.f42009g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f42337c == null) {
                    this.f42337c = a.cb.q(oVar, String.class);
                }
                sv0Var.f42008f = (String) this.f42337c.c(aVar);
                boolean[] zArr5 = sv0Var.f42009g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f42337c == null) {
                    this.f42337c = a.cb.q(oVar, String.class);
                }
                sv0Var.f42004b = (String) this.f42337c.c(aVar);
                boolean[] zArr6 = sv0Var.f42009g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new vv0(sv0Var.f42003a, sv0Var.f42004b, sv0Var.f42005c, sv0Var.f42006d, sv0Var.f42007e, sv0Var.f42008f, sv0Var.f42009g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        vv0 vv0Var = (vv0) obj;
        if (vv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vv0Var.f43008g;
        int length = zArr.length;
        nm.o oVar = this.f42335a;
        if (length > 0 && zArr[0]) {
            if (this.f42337c == null) {
                this.f42337c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42337c;
            um.c h10 = cVar.h("id");
            str5 = vv0Var.f43002a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42337c == null) {
                this.f42337c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42337c;
            um.c h13 = cVar.h("node_id");
            str4 = vv0Var.f43003b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42337c == null) {
                this.f42337c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42337c;
            um.c h14 = cVar.h("color");
            str3 = vv0Var.f43004c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42337c == null) {
                this.f42337c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42337c;
            um.c h15 = cVar.h("font_name");
            str2 = vv0Var.f43005d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42336b == null) {
                this.f42336b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f42336b;
            um.c h16 = cVar.h("font_size");
            num = vv0Var.f43006e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42337c == null) {
                this.f42337c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42337c;
            um.c h17 = cVar.h("prefilled_value");
            str = vv0Var.f43007f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
