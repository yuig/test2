package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class mh extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40106a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40107b;

    public mh(nm.o oVar) {
        this.f40106a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lh lhVar = new lh(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("rep_style");
            nm.o oVar = this.f40106a;
            if (equals) {
                if (this.f40107b == null) {
                    this.f40107b = a.cb.q(oVar, Integer.class);
                }
                lhVar.f39761b = (Integer) this.f40107b.c(aVar);
                boolean[] zArr = lhVar.f39762c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("alignment")) {
                if (this.f40107b == null) {
                    this.f40107b = a.cb.q(oVar, Integer.class);
                }
                lhVar.f39760a = (Integer) this.f40107b.c(aVar);
                boolean[] zArr2 = lhVar.f39762c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new oh(lhVar.f39760a, lhVar.f39761b, lhVar.f39762c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        oh ohVar = (oh) obj;
        if (ohVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ohVar.f40730c;
        int length = zArr.length;
        nm.o oVar = this.f40106a;
        if (length > 0 && zArr[0]) {
            if (this.f40107b == null) {
                this.f40107b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f40107b;
            um.c h10 = cVar.h("alignment");
            num2 = ohVar.f40728a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40107b == null) {
                this.f40107b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f40107b;
            um.c h13 = cVar.h("rep_style");
            num = ohVar.f40729b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
