package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class ne extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40392a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40393b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40394c;

    public ne(nm.o oVar) {
        this.f40392a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        me meVar = new me(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3556653) {
                    if (hashCode != 747804969) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("position")) {
                        c13 = 2;
                    }
                } else if (k03.equals("text")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f40392a;
            if (c13 == 0) {
                if (this.f40394c == null) {
                    this.f40394c = a.cb.q(oVar, String.class);
                }
                meVar.e((String) this.f40394c.c(aVar));
            } else if (c13 == 1) {
                if (this.f40394c == null) {
                    this.f40394c = a.cb.q(oVar, String.class);
                }
                meVar.d((String) this.f40394c.c(aVar));
            } else if (c13 == 2) {
                if (this.f40393b == null) {
                    this.f40393b = a.cb.q(oVar, Integer.class);
                }
                meVar.c((Integer) this.f40393b.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40394c == null) {
                    this.f40394c = a.cb.q(oVar, String.class);
                }
                meVar.b((String) this.f40394c.c(aVar));
            }
        }
        aVar.g();
        return meVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        String str3;
        pe peVar = (pe) obj;
        if (peVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = peVar.f40944e;
        int length = zArr.length;
        nm.o oVar = this.f40392a;
        if (length > 0 && zArr[0]) {
            if (this.f40394c == null) {
                this.f40394c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40394c;
            um.c h10 = cVar.h("id");
            str3 = peVar.f40940a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40394c == null) {
                this.f40394c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40394c;
            um.c h13 = cVar.h("node_id");
            str2 = peVar.f40941b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40393b == null) {
                this.f40393b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40393b;
            um.c h14 = cVar.h("position");
            num = peVar.f40942c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40394c == null) {
                this.f40394c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40394c;
            um.c h15 = cVar.h("text");
            str = peVar.f40943d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
