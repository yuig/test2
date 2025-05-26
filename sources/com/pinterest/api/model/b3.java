package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class b3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35954a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35955b;

    public b3(nm.o oVar) {
        this.f35954a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        d3 d3Var = new d3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -13480600:
                    if (k03.equals("videos_count")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 726082274:
                    if (k03.equals("responses_count")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 731937928:
                    if (k03.equals("images_count")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1919900571:
                    if (k03.equals("user_count")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35954a;
            if (c13 == 0) {
                if (this.f35955b == null) {
                    this.f35955b = a.cb.q(oVar, Integer.class);
                }
                d3Var.f36645d = (Integer) this.f35955b.c(aVar);
                boolean[] zArr = d3Var.f36646e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f35955b == null) {
                    this.f35955b = a.cb.q(oVar, Integer.class);
                }
                d3Var.f36643b = (Integer) this.f35955b.c(aVar);
                boolean[] zArr2 = d3Var.f36646e;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f35955b == null) {
                    this.f35955b = a.cb.q(oVar, Integer.class);
                }
                d3Var.f36642a = (Integer) this.f35955b.c(aVar);
                boolean[] zArr3 = d3Var.f36646e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f35955b == null) {
                    this.f35955b = a.cb.q(oVar, Integer.class);
                }
                d3Var.f36644c = (Integer) this.f35955b.c(aVar);
                boolean[] zArr4 = d3Var.f36646e;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            }
        }
        aVar.g();
        return new e3(d3Var.f36642a, d3Var.f36643b, d3Var.f36644c, d3Var.f36645d, d3Var.f36646e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        e3 e3Var = (e3) obj;
        if (e3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e3Var.f37061e;
        int length = zArr.length;
        nm.o oVar = this.f35954a;
        if (length > 0 && zArr[0]) {
            if (this.f35955b == null) {
                this.f35955b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f35955b;
            um.c h10 = cVar.h("images_count");
            num4 = e3Var.f37057a;
            mVar.e(h10, num4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35955b == null) {
                this.f35955b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f35955b;
            um.c h13 = cVar.h("responses_count");
            num3 = e3Var.f37058b;
            mVar2.e(h13, num3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35955b == null) {
                this.f35955b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f35955b;
            um.c h14 = cVar.h("user_count");
            num2 = e3Var.f37059c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35955b == null) {
                this.f35955b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f35955b;
            um.c h15 = cVar.h("videos_count");
            num = e3Var.f37060d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
