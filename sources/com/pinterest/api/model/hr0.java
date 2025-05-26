package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class hr0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38522a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38523b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38524c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38525d;

    public hr0(nm.o oVar) {
        this.f38522a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gr0 gr0Var = new gr0(0);
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
                case 111972721:
                    if (k03.equals("value")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 375511497:
                    if (k03.equals("is_exclusive")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 380272446:
                    if (k03.equals("end_survey")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2129305892:
                    if (k03.equals("feed_forward")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2147428667:
                    if (k03.equals("skip_to")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38522a;
            if (c13 == 0) {
                if (this.f38525d == null) {
                    this.f38525d = a.cb.q(oVar, String.class);
                }
                gr0Var.f38121e = (String) this.f38525d.c(aVar);
                boolean[] zArr = gr0Var.f38123g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f38524c == null) {
                    this.f38524c = a.cb.q(oVar, Double.class);
                }
                gr0Var.f38122f = (Double) this.f38524c.c(aVar);
                boolean[] zArr2 = gr0Var.f38123g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f38523b == null) {
                    this.f38523b = a.cb.q(oVar, Boolean.class);
                }
                gr0Var.f38119c = (Boolean) this.f38523b.c(aVar);
                boolean[] zArr3 = gr0Var.f38123g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f38523b == null) {
                    this.f38523b = a.cb.q(oVar, Boolean.class);
                }
                gr0Var.f38117a = (Boolean) this.f38523b.c(aVar);
                boolean[] zArr4 = gr0Var.f38123g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f38525d == null) {
                    this.f38525d = a.cb.q(oVar, String.class);
                }
                gr0Var.f38118b = (String) this.f38525d.c(aVar);
                boolean[] zArr5 = gr0Var.f38123g;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38525d == null) {
                    this.f38525d = a.cb.q(oVar, String.class);
                }
                gr0Var.f38120d = (String) this.f38525d.c(aVar);
                boolean[] zArr6 = gr0Var.f38123g;
                if (zArr6.length > 3) {
                    zArr6[3] = true;
                }
            }
        }
        aVar.g();
        return new jr0(gr0Var.f38117a, gr0Var.f38118b, gr0Var.f38119c, gr0Var.f38120d, gr0Var.f38121e, gr0Var.f38122f, gr0Var.f38123g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        String str2;
        Boolean bool;
        String str3;
        Boolean bool2;
        jr0 jr0Var = (jr0) obj;
        if (jr0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jr0Var.f39133g;
        int length = zArr.length;
        nm.o oVar = this.f38522a;
        if (length > 0 && zArr[0]) {
            if (this.f38523b == null) {
                this.f38523b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar = this.f38523b;
            um.c h10 = cVar.h("end_survey");
            bool2 = jr0Var.f39127a;
            mVar.e(h10, bool2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38525d == null) {
                this.f38525d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38525d;
            um.c h13 = cVar.h("feed_forward");
            str3 = jr0Var.f39128b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38523b == null) {
                this.f38523b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f38523b;
            um.c h14 = cVar.h("is_exclusive");
            bool = jr0Var.f39129c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38525d == null) {
                this.f38525d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38525d;
            um.c h15 = cVar.h("skip_to");
            str2 = jr0Var.f39130d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38525d == null) {
                this.f38525d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38525d;
            um.c h16 = cVar.h("text");
            str = jr0Var.f39131e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38524c == null) {
                this.f38524c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f38524c;
            um.c h17 = cVar.h("value");
            d2 = jr0Var.f39132f;
            mVar6.e(h17, d2);
        }
        cVar.g();
    }
}
