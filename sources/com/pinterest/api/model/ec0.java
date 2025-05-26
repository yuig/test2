package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ec0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37239a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37240b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37241c;

    public ec0(nm.o oVar) {
        this.f37239a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dc0 dc0Var = new dc0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 470228904:
                    if (k03.equals("neutral_survey_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1189252481:
                    if (k03.equals("happy_survey_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1377023735:
                    if (k03.equals("sad_survey_id")) {
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
            nm.o oVar = this.f37239a;
            if (c13 == 0) {
                if (this.f37241c == null) {
                    this.f37241c = a.cb.q(oVar, String.class);
                }
                dc0Var.f36722a = (String) this.f37241c.c(aVar);
                boolean[] zArr = dc0Var.f36728g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f37241c == null) {
                    this.f37241c = a.cb.q(oVar, String.class);
                }
                dc0Var.f36727f = (String) this.f37241c.c(aVar);
                boolean[] zArr2 = dc0Var.f36728g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f37240b == null) {
                    this.f37240b = a.cb.q(oVar, Integer.class);
                }
                dc0Var.f36725d = (Integer) this.f37240b.c(aVar);
                boolean[] zArr3 = dc0Var.f36728g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f37240b == null) {
                    this.f37240b = a.cb.q(oVar, Integer.class);
                }
                dc0Var.f36724c = (Integer) this.f37240b.c(aVar);
                boolean[] zArr4 = dc0Var.f36728g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f37240b == null) {
                    this.f37240b = a.cb.q(oVar, Integer.class);
                }
                dc0Var.f36726e = (Integer) this.f37240b.c(aVar);
                boolean[] zArr5 = dc0Var.f36728g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f37241c == null) {
                    this.f37241c = a.cb.q(oVar, String.class);
                }
                dc0Var.f36723b = (String) this.f37241c.c(aVar);
                boolean[] zArr6 = dc0Var.f36728g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new gc0(dc0Var.f36722a, dc0Var.f36723b, dc0Var.f36724c, dc0Var.f36725d, dc0Var.f36726e, dc0Var.f36727f, dc0Var.f36728g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        String str2;
        String str3;
        gc0 gc0Var = (gc0) obj;
        if (gc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gc0Var.f38040g;
        int length = zArr.length;
        nm.o oVar = this.f37239a;
        if (length > 0 && zArr[0]) {
            if (this.f37241c == null) {
                this.f37241c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37241c;
            um.c h10 = cVar.h("id");
            str3 = gc0Var.f38034a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37241c == null) {
                this.f37241c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37241c;
            um.c h13 = cVar.h("node_id");
            str2 = gc0Var.f38035b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37240b == null) {
                this.f37240b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f37240b;
            um.c h14 = cVar.h("happy_survey_id");
            num3 = gc0Var.f38036c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37240b == null) {
                this.f37240b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f37240b;
            um.c h15 = cVar.h("neutral_survey_id");
            num2 = gc0Var.f38037d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37240b == null) {
                this.f37240b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f37240b;
            um.c h16 = cVar.h("sad_survey_id");
            num = gc0Var.f38038e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37241c == null) {
                this.f37241c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37241c;
            um.c h17 = cVar.h("title");
            str = gc0Var.f38039f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
