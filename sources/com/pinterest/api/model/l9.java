package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class l9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39671a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39672b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39673c;

    public l9(nm.o oVar) {
        this.f39671a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n9 n9Var = new n9(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2141142810:
                    if (k03.equals("item_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -892481550:
                    if (k03.equals("status")) {
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
                case 951530617:
                    if (k03.equals("content")) {
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
            nm.o oVar = this.f39671a;
            if (c13 == 0) {
                if (this.f39672b == null) {
                    this.f39672b = a.cb.q(oVar, Integer.class);
                }
                n9Var.f40354d = (Integer) this.f39672b.c(aVar);
                boolean[] zArr = n9Var.f40356f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f39672b == null) {
                    this.f39672b = a.cb.q(oVar, Integer.class);
                }
                n9Var.f40355e = (Integer) this.f39672b.c(aVar);
                boolean[] zArr2 = n9Var.f40356f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f39673c == null) {
                    this.f39673c = a.cb.q(oVar, String.class);
                }
                n9Var.f40351a = (String) this.f39673c.c(aVar);
                boolean[] zArr3 = n9Var.f40356f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f39673c == null) {
                    this.f39673c = a.cb.q(oVar, String.class);
                }
                n9Var.f40353c = (String) this.f39673c.c(aVar);
                boolean[] zArr4 = n9Var.f40356f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f39673c == null) {
                    this.f39673c = a.cb.q(oVar, String.class);
                }
                n9Var.f40352b = (String) this.f39673c.c(aVar);
                boolean[] zArr5 = n9Var.f40356f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new o9(n9Var.f40351a, n9Var.f40352b, n9Var.f40353c, n9Var.f40354d, n9Var.f40355e, n9Var.f40356f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        String str;
        String str2;
        String str3;
        o9 o9Var = (o9) obj;
        if (o9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = o9Var.f40650f;
        int length = zArr.length;
        nm.o oVar = this.f39671a;
        if (length > 0 && zArr[0]) {
            if (this.f39673c == null) {
                this.f39673c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39673c;
            um.c h10 = cVar.h("id");
            str3 = o9Var.f40645a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39673c == null) {
                this.f39673c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39673c;
            um.c h13 = cVar.h("node_id");
            str2 = o9Var.f40646b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39673c == null) {
                this.f39673c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39673c;
            um.c h14 = cVar.h("content");
            str = o9Var.f40647c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39672b == null) {
                this.f39672b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39672b;
            um.c h15 = cVar.h("item_type");
            num2 = o9Var.f40648d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39672b == null) {
                this.f39672b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f39672b;
            um.c h16 = cVar.h("status");
            num = o9Var.f40649e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
