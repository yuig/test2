package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wd0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43230a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43231b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43232c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43233d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43234e;

    public wd0(nm.o oVar) {
        this.f43230a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vd0 vd0Var = new vd0(0);
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
            }
            nm.o oVar = this.f43230a;
            if (c13 == 0) {
                if (this.f43234e == null) {
                    this.f43234e = a.cb.q(oVar, String.class);
                }
                vd0Var.f42829c = (String) this.f43234e.c(aVar);
                boolean[] zArr = vd0Var.f42831e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43231b == null) {
                    this.f43231b = a.cb.q(oVar, Integer.class);
                }
                vd0Var.f42830d = (Integer) this.f43231b.c(aVar);
                boolean[] zArr2 = vd0Var.f42831e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f43233d == null) {
                    this.f43233d = a.cb.q(oVar, ce0.class);
                }
                vd0Var.f42828b = (ce0) this.f43233d.c(aVar);
                boolean[] zArr3 = vd0Var.f42831e;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f43232c == null) {
                    this.f43232c = a.cb.q(oVar, ud0.class);
                }
                vd0Var.f42827a = (ud0) this.f43232c.c(aVar);
                boolean[] zArr4 = vd0Var.f42831e;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new yd0(vd0Var.f42827a, vd0Var.f42828b, vd0Var.f42829c, vd0Var.f42830d, vd0Var.f42831e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        ce0 ce0Var;
        ud0 ud0Var;
        yd0 yd0Var = (yd0) obj;
        if (yd0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yd0Var.f44017e;
        int length = zArr.length;
        nm.o oVar = this.f43230a;
        if (length > 0 && zArr[0]) {
            if (this.f43232c == null) {
                this.f43232c = a.cb.q(oVar, ud0.class);
            }
            nm.m mVar = this.f43232c;
            um.c h10 = cVar.h("block_style");
            ud0Var = yd0Var.f44013a;
            mVar.e(h10, ud0Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43233d == null) {
                this.f43233d = a.cb.q(oVar, ce0.class);
            }
            nm.m mVar2 = this.f43233d;
            um.c h13 = cVar.h("style");
            ce0Var = yd0Var.f44014b;
            mVar2.e(h13, ce0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43234e == null) {
                this.f43234e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43234e;
            um.c h14 = cVar.h("text");
            str = yd0Var.f44015c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43231b == null) {
                this.f43231b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f43231b;
            um.c h15 = cVar.h("type");
            num = yd0Var.f44016d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
