package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class jf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39028a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39029b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39030c;

    public jf0(nm.o oVar) {
        this.f39028a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        if0 if0Var = new if0(0);
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
                case -927281440:
                    if (k03.equals("spacing_after")) {
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
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1346344699:
                    if (k03.equals("spacing_before")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2024311912:
                    if (k03.equals("font_weight")) {
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
            nm.o oVar = this.f39028a;
            switch (c13) {
                case 0:
                    if (this.f39029b == null) {
                        this.f39029b = a.cb.q(oVar, Integer.class);
                    }
                    if0Var.f38759c = (Integer) this.f39029b.c(aVar);
                    boolean[] zArr = if0Var.f38764h;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f39029b == null) {
                        this.f39029b = a.cb.q(oVar, Integer.class);
                    }
                    if0Var.f38761e = (Integer) this.f39029b.c(aVar);
                    boolean[] zArr2 = if0Var.f38764h;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f39030c == null) {
                        this.f39030c = a.cb.q(oVar, String.class);
                    }
                    if0Var.f38757a = (String) this.f39030c.c(aVar);
                    boolean[] zArr3 = if0Var.f38764h;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f39030c == null) {
                        this.f39030c = a.cb.q(oVar, String.class);
                    }
                    if0Var.f38763g = (String) this.f39030c.c(aVar);
                    boolean[] zArr4 = if0Var.f38764h;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f39029b == null) {
                        this.f39029b = a.cb.q(oVar, Integer.class);
                    }
                    if0Var.f38762f = (Integer) this.f39029b.c(aVar);
                    boolean[] zArr5 = if0Var.f38764h;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f39029b == null) {
                        this.f39029b = a.cb.q(oVar, Integer.class);
                    }
                    if0Var.f38760d = (Integer) this.f39029b.c(aVar);
                    boolean[] zArr6 = if0Var.f38764h;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f39030c == null) {
                        this.f39030c = a.cb.q(oVar, String.class);
                    }
                    if0Var.f38758b = (String) this.f39030c.c(aVar);
                    boolean[] zArr7 = if0Var.f38764h;
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
        return new lf0(if0Var.f38757a, if0Var.f38758b, if0Var.f38759c, if0Var.f38760d, if0Var.f38761e, if0Var.f38762f, if0Var.f38763g, if0Var.f38764h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        String str2;
        String str3;
        lf0 lf0Var = (lf0) obj;
        if (lf0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lf0Var.f39745h;
        int length = zArr.length;
        nm.o oVar = this.f39028a;
        if (length > 0 && zArr[0]) {
            if (this.f39030c == null) {
                this.f39030c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39030c;
            um.c h10 = cVar.h("id");
            str3 = lf0Var.f39738a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39030c == null) {
                this.f39030c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39030c;
            um.c h13 = cVar.h("node_id");
            str2 = lf0Var.f39739b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39029b == null) {
                this.f39029b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f39029b;
            um.c h14 = cVar.h("font_size");
            num4 = lf0Var.f39740c;
            mVar3.e(h14, num4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39029b == null) {
                this.f39029b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39029b;
            um.c h15 = cVar.h("font_weight");
            num3 = lf0Var.f39741d;
            mVar4.e(h15, num3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39029b == null) {
                this.f39029b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f39029b;
            um.c h16 = cVar.h("spacing_after");
            num2 = lf0Var.f39742e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39029b == null) {
                this.f39029b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f39029b;
            um.c h17 = cVar.h("spacing_before");
            num = lf0Var.f39743f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39030c == null) {
                this.f39030c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39030c;
            um.c h18 = cVar.h("text");
            str = lf0Var.f39744g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
