package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class r3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41476a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41477b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41478c;

    public r3(nm.o oVar) {
        this.f41476a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t3 t3Var = new t3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1900332747:
                    if (k03.equals("overall_data_status")) {
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
                case 3076014:
                    if (k03.equals("date")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 955826371:
                    if (k03.equals("metrics")) {
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
            nm.o oVar = this.f41476a;
            if (c13 == 0) {
                if (this.f41478c == null) {
                    this.f41478c = a.cb.q(oVar, String.class);
                }
                t3Var.f42064e = (String) this.f41478c.c(aVar);
                boolean[] zArr = t3Var.f42065f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f41478c == null) {
                    this.f41478c = a.cb.q(oVar, String.class);
                }
                t3Var.f42060a = (String) this.f41478c.c(aVar);
                boolean[] zArr2 = t3Var.f42065f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f41478c == null) {
                    this.f41478c = a.cb.q(oVar, String.class);
                }
                t3Var.f42062c = (String) this.f41478c.c(aVar);
                boolean[] zArr3 = t3Var.f42065f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f41477b == null) {
                    this.f41477b = a.cb.q(oVar, y3.class);
                }
                t3Var.f42063d = (y3) this.f41477b.c(aVar);
                boolean[] zArr4 = t3Var.f42065f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41478c == null) {
                    this.f41478c = a.cb.q(oVar, String.class);
                }
                t3Var.f42061b = (String) this.f41478c.c(aVar);
                boolean[] zArr5 = t3Var.f42065f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new u3(t3Var.f42060a, t3Var.f42061b, t3Var.f42062c, t3Var.f42063d, t3Var.f42064e, t3Var.f42065f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        y3 y3Var;
        String str2;
        String str3;
        String str4;
        u3 u3Var = (u3) obj;
        if (u3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = u3Var.f42402f;
        int length = zArr.length;
        nm.o oVar = this.f41476a;
        if (length > 0 && zArr[0]) {
            if (this.f41478c == null) {
                this.f41478c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41478c;
            um.c h10 = cVar.h("id");
            str4 = u3Var.f42397a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41478c == null) {
                this.f41478c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41478c;
            um.c h13 = cVar.h("node_id");
            str3 = u3Var.f42398b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41478c == null) {
                this.f41478c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41478c;
            um.c h14 = cVar.h("date");
            str2 = u3Var.f42399c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41477b == null) {
                this.f41477b = a.cb.q(oVar, y3.class);
            }
            nm.m mVar4 = this.f41477b;
            um.c h15 = cVar.h("metrics");
            y3Var = u3Var.f42400d;
            mVar4.e(h15, y3Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41478c == null) {
                this.f41478c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41478c;
            um.c h16 = cVar.h("overall_data_status");
            str = u3Var.f42401e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
