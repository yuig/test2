package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class j3 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38936a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38937b;

    public j3(nm.o oVar) {
        this.f38936a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        l3 l3Var = new l3(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("done");
            nm.o oVar = this.f38936a;
            if (equals) {
                if (this.f38937b == null) {
                    this.f38937b = a.cb.q(oVar, Integer.class);
                }
                l3Var.f39634a = (Integer) this.f38937b.c(aVar);
                boolean[] zArr = l3Var.f39636c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("saves")) {
                if (this.f38937b == null) {
                    this.f38937b = a.cb.q(oVar, Integer.class);
                }
                l3Var.f39635b = (Integer) this.f38937b.c(aVar);
                boolean[] zArr2 = l3Var.f39636c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new m3(l3Var.f39634a, l3Var.f39635b, l3Var.f39636c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        m3 m3Var = (m3) obj;
        if (m3Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m3Var.f39990c;
        int length = zArr.length;
        nm.o oVar = this.f38936a;
        if (length > 0 && zArr[0]) {
            if (this.f38937b == null) {
                this.f38937b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f38937b;
            um.c h10 = cVar.h("done");
            num2 = m3Var.f39988a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38937b == null) {
                this.f38937b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f38937b;
            um.c h13 = cVar.h("saves");
            num = m3Var.f39989b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
