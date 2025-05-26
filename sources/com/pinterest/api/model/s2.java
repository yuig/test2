package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class s2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41772a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41773b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41774c;

    public s2(nm.o oVar) {
        this.f41772a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u2 u2Var = new u2(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -807286424:
                    if (k03.equals("review_count")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -331154451:
                    if (k03.equals("rating_count")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -314033073:
                    if (k03.equals("rating_value")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1993470040:
                    if (k03.equals("best_rating")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41772a;
            if (c13 == 0) {
                if (this.f41773b == null) {
                    this.f41773b = a.cb.q(oVar, Integer.class);
                }
                u2Var.f42391f = (Integer) this.f41773b.c(aVar);
                boolean[] zArr = u2Var.f42392g;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
            } else if (c13 == 1) {
                if (this.f41773b == null) {
                    this.f41773b = a.cb.q(oVar, Integer.class);
                }
                u2Var.f42389d = (Integer) this.f41773b.c(aVar);
                boolean[] zArr2 = u2Var.f42392g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f41774c == null) {
                    this.f41774c = a.cb.q(oVar, String.class);
                }
                u2Var.f42390e = (String) this.f41774c.c(aVar);
                boolean[] zArr3 = u2Var.f42392g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f41774c == null) {
                    this.f41774c = a.cb.q(oVar, String.class);
                }
                u2Var.f42387b = (String) this.f41774c.c(aVar);
                boolean[] zArr4 = u2Var.f42392g;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 == 4) {
                if (this.f41774c == null) {
                    this.f41774c = a.cb.q(oVar, String.class);
                }
                u2Var.f42388c = (String) this.f41774c.c(aVar);
                boolean[] zArr5 = u2Var.f42392g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41774c == null) {
                    this.f41774c = a.cb.q(oVar, String.class);
                }
                u2Var.a((String) this.f41774c.c(aVar));
            }
        }
        aVar.g();
        return new v2(u2Var.f42386a, u2Var.f42387b, u2Var.f42388c, u2Var.f42389d, u2Var.f42390e, u2Var.f42391f, u2Var.f42392g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        String str3;
        String str4;
        v2 v2Var = (v2) obj;
        if (v2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = v2Var.f42721g;
        int length = zArr.length;
        nm.o oVar = this.f41772a;
        if (length > 0 && zArr[0]) {
            if (this.f41774c == null) {
                this.f41774c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41774c;
            um.c h10 = cVar.h("best_rating");
            str4 = v2Var.f42715a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41774c == null) {
                this.f41774c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41774c;
            um.c h13 = cVar.h("id");
            str3 = v2Var.f42716b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41774c == null) {
                this.f41774c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41774c;
            um.c h14 = cVar.h("name");
            str2 = v2Var.f42717c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41773b == null) {
                this.f41773b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f41773b;
            um.c h15 = cVar.h("rating_count");
            num2 = v2Var.f42718d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41774c == null) {
                this.f41774c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41774c;
            um.c h16 = cVar.h("rating_value");
            str = v2Var.f42719e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41773b == null) {
                this.f41773b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f41773b;
            um.c h17 = cVar.h("review_count");
            num = v2Var.f42720f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
