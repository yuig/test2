package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class k11 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39251a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39252b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39253c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39254d;

    public k11(nm.o oVar) {
        this.f39251a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j11 j11Var = new j11(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1600699883:
                    if (k03.equals("surveyId")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1406329629:
                    if (k03.equals("authId")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -265713450:
                    if (k03.equals("username")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 466759622:
                    if (k03.equals("visitId")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 607796817:
                    if (k03.equals("sessionId")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 951530927:
                    if (k03.equals("context")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39251a;
            if (c13 == 0) {
                if (this.f39252b == null) {
                    this.f39252b = a.cb.q(oVar, Integer.class);
                }
                j11Var.f38929d = (Integer) this.f39252b.c(aVar);
                boolean[] zArr = j11Var.f38932g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f39253c == null) {
                    this.f39253c = a.cb.q(oVar, String.class);
                }
                j11Var.f38926a = (String) this.f39253c.c(aVar);
                boolean[] zArr2 = j11Var.f38932g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f39253c == null) {
                    this.f39253c = a.cb.q(oVar, String.class);
                }
                j11Var.f38930e = (String) this.f39253c.c(aVar);
                boolean[] zArr3 = j11Var.f38932g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f39253c == null) {
                    this.f39253c = a.cb.q(oVar, String.class);
                }
                j11Var.f38931f = (String) this.f39253c.c(aVar);
                boolean[] zArr4 = j11Var.f38932g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f39253c == null) {
                    this.f39253c = a.cb.q(oVar, String.class);
                }
                j11Var.f38928c = (String) this.f39253c.c(aVar);
                boolean[] zArr5 = j11Var.f38932g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39254d == null) {
                    this.f39254d = a.cb.q(oVar, a11.class);
                }
                j11Var.f38927b = (a11) this.f39254d.c(aVar);
                boolean[] zArr6 = j11Var.f38932g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new m11(j11Var.f38926a, j11Var.f38927b, j11Var.f38928c, j11Var.f38929d, j11Var.f38930e, j11Var.f38931f, j11Var.f38932g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        a11 a11Var;
        String str4;
        m11 m11Var = (m11) obj;
        if (m11Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m11Var.f39974g;
        int length = zArr.length;
        nm.o oVar = this.f39251a;
        if (length > 0 && zArr[0]) {
            if (this.f39253c == null) {
                this.f39253c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39253c;
            um.c h10 = cVar.h("authId");
            str4 = m11Var.f39968a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39254d == null) {
                this.f39254d = a.cb.q(oVar, a11.class);
            }
            nm.m mVar2 = this.f39254d;
            um.c h13 = cVar.h("context");
            a11Var = m11Var.f39969b;
            mVar2.e(h13, a11Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39253c == null) {
                this.f39253c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39253c;
            um.c h14 = cVar.h("sessionId");
            str3 = m11Var.f39970c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39252b == null) {
                this.f39252b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39252b;
            um.c h15 = cVar.h("surveyId");
            num = m11Var.f39971d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39253c == null) {
                this.f39253c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39253c;
            um.c h16 = cVar.h("username");
            str2 = m11Var.f39972e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39253c == null) {
                this.f39253c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39253c;
            um.c h17 = cVar.h("visitId");
            str = m11Var.f39973f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
