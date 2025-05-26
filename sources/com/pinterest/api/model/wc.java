package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wc extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43214a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43215b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43216c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43217d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43218e;

    public wc(nm.o oVar) {
        this.f43214a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vc vcVar = new vc(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1442803611:
                    if (k03.equals("image_size")) {
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3017257:
                    if (k03.equals("bbox")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 245875891:
                    if (k03.equals("image_base64")) {
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
            nm.o oVar = this.f43214a;
            if (c13 == 0) {
                if (this.f43216c == null) {
                    this.f43216c = a.cb.q(oVar, gd.class);
                }
                vcVar.f42822e = (gd) this.f43216c.c(aVar);
                boolean[] zArr = vcVar.f42824g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f43218e == null) {
                    this.f43218e = a.cb.q(oVar, String.class);
                }
                vcVar.f42818a = (String) this.f43218e.c(aVar);
                boolean[] zArr2 = vcVar.f42824g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43217d == null) {
                    this.f43217d = a.cb.q(oVar, f30.class);
                }
                vcVar.f42823f = (f30) this.f43217d.c(aVar);
                boolean[] zArr3 = vcVar.f42824g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f43215b == null) {
                    this.f43215b = a.cb.q(oVar, cd.class);
                }
                vcVar.f42820c = (cd) this.f43215b.c(aVar);
                boolean[] zArr4 = vcVar.f42824g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f43218e == null) {
                    this.f43218e = a.cb.q(oVar, String.class);
                }
                vcVar.f42821d = (String) this.f43218e.c(aVar);
                boolean[] zArr5 = vcVar.f42824g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43218e == null) {
                    this.f43218e = a.cb.q(oVar, String.class);
                }
                vcVar.f42819b = (String) this.f43218e.c(aVar);
                boolean[] zArr6 = vcVar.f42824g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new yc(vcVar.f42818a, vcVar.f42819b, vcVar.f42820c, vcVar.f42821d, vcVar.f42822e, vcVar.f42823f, vcVar.f42824g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        gd gdVar;
        String str;
        cd cdVar;
        String str2;
        String str3;
        yc ycVar = (yc) obj;
        if (ycVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ycVar.f44007g;
        int length = zArr.length;
        nm.o oVar = this.f43214a;
        if (length > 0 && zArr[0]) {
            if (this.f43218e == null) {
                this.f43218e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43218e;
            um.c h10 = cVar.h("id");
            str3 = ycVar.f44001a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43218e == null) {
                this.f43218e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43218e;
            um.c h13 = cVar.h("node_id");
            str2 = ycVar.f44002b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43215b == null) {
                this.f43215b = a.cb.q(oVar, cd.class);
            }
            nm.m mVar3 = this.f43215b;
            um.c h14 = cVar.h("bbox");
            cdVar = ycVar.f44003c;
            mVar3.e(h14, cdVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43218e == null) {
                this.f43218e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43218e;
            um.c h15 = cVar.h("image_base64");
            str = ycVar.f44004d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43216c == null) {
                this.f43216c = a.cb.q(oVar, gd.class);
            }
            nm.m mVar5 = this.f43216c;
            um.c h16 = cVar.h("image_size");
            gdVar = ycVar.f44005e;
            mVar5.e(h16, gdVar);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43217d == null) {
                this.f43217d = a.cb.q(oVar, f30.class);
            }
            nm.m mVar6 = this.f43217d;
            um.c h17 = cVar.h("pin");
            f30Var = ycVar.f44006f;
            mVar6.e(h17, f30Var);
        }
        cVar.g();
    }
}
