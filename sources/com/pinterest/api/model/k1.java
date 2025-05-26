package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class k1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39244a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39245b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39246c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39247d;

    public k1(nm.o oVar) {
        this.f39244a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        m1 m1Var = new m1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1938933922) {
                if (hashCode != -1935090265) {
                    if (hashCode == 822467211 && k03.equals("temporary_token")) {
                        c13 = 2;
                    }
                } else if (k03.equals("expires_in_timestamp")) {
                    c13 = 1;
                }
            } else if (k03.equals("access_token")) {
                c13 = 0;
            }
            nm.o oVar = this.f39244a;
            if (c13 == 0) {
                if (this.f39247d == null) {
                    this.f39247d = a.cb.q(oVar, String.class);
                }
                m1Var.f39960a = (String) this.f39247d.c(aVar);
                boolean[] zArr = m1Var.f39963d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39246c == null) {
                    this.f39246c = a.cb.q(oVar, Integer.class);
                }
                m1Var.f39961b = (Integer) this.f39246c.c(aVar);
                boolean[] zArr2 = m1Var.f39963d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f39245b == null) {
                    this.f39245b = a.cb.q(oVar, Boolean.class);
                }
                m1Var.f39962c = (Boolean) this.f39245b.c(aVar);
                boolean[] zArr3 = m1Var.f39963d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new n1(m1Var.f39960a, m1Var.f39961b, m1Var.f39962c, m1Var.f39963d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        Integer num;
        String str;
        n1 n1Var = (n1) obj;
        if (n1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = n1Var.f40281d;
        int length = zArr.length;
        nm.o oVar = this.f39244a;
        if (length > 0 && zArr[0]) {
            if (this.f39247d == null) {
                this.f39247d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39247d;
            um.c h10 = cVar.h("access_token");
            str = n1Var.f40278a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39246c == null) {
                this.f39246c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f39246c;
            um.c h13 = cVar.h("expires_in_timestamp");
            num = n1Var.f40279b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39245b == null) {
                this.f39245b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f39245b;
            um.c h14 = cVar.h("temporary_token");
            bool = n1Var.f40280c;
            mVar3.e(h14, bool);
        }
        cVar.g();
    }
}
