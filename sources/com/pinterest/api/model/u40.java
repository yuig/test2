package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes3.dex */
public final class u40 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42405a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42406b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42407c;

    public u40(nm.o oVar) {
        this.f42405a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t40 t40Var = new t40(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -295464393:
                    if (k03.equals("updated_at")) {
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
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42405a;
            if (c13 == 0) {
                if (this.f42406b == null) {
                    this.f42406b = a.cb.q(oVar, Date.class);
                }
                t40Var.f42088e = (Date) this.f42406b.c(aVar);
                boolean[] zArr = t40Var.f42089f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f42407c == null) {
                    this.f42407c = a.cb.q(oVar, String.class);
                }
                t40Var.f42084a = (String) this.f42407c.c(aVar);
                boolean[] zArr2 = t40Var.f42089f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f42407c == null) {
                    this.f42407c = a.cb.q(oVar, String.class);
                }
                t40Var.f42087d = (String) this.f42407c.c(aVar);
                boolean[] zArr3 = t40Var.f42089f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f42406b == null) {
                    this.f42406b = a.cb.q(oVar, Date.class);
                }
                t40Var.f42086c = (Date) this.f42406b.c(aVar);
                boolean[] zArr4 = t40Var.f42089f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f42407c == null) {
                    this.f42407c = a.cb.q(oVar, String.class);
                }
                t40Var.f42085b = (String) this.f42407c.c(aVar);
                boolean[] zArr5 = t40Var.f42089f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new w40(t40Var.f42084a, t40Var.f42085b, t40Var.f42086c, t40Var.f42087d, t40Var.f42088e, t40Var.f42089f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date;
        String str;
        Date date2;
        String str2;
        String str3;
        w40 w40Var = (w40) obj;
        if (w40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w40Var.f43175f;
        int length = zArr.length;
        nm.o oVar = this.f42405a;
        if (length > 0 && zArr[0]) {
            if (this.f42407c == null) {
                this.f42407c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42407c;
            um.c h10 = cVar.h("id");
            str3 = w40Var.f43170a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42407c == null) {
                this.f42407c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42407c;
            um.c h13 = cVar.h("node_id");
            str2 = w40Var.f43171b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42406b == null) {
                this.f42406b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar3 = this.f42406b;
            um.c h14 = cVar.h("created_at");
            date2 = w40Var.f43172c;
            mVar3.e(h14, date2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42407c == null) {
                this.f42407c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42407c;
            um.c h15 = cVar.h("text");
            str = w40Var.f43173d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42406b == null) {
                this.f42406b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar5 = this.f42406b;
            um.c h16 = cVar.h("updated_at");
            date = w40Var.f43174e;
            mVar5.e(h16, date);
        }
        cVar.g();
    }
}
