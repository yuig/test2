package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class qd extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41271a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41272b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41273c;

    public qd(nm.o oVar) {
        this.f41271a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pd pdVar = new pd(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("sticker");
            nm.o oVar = this.f41271a;
            if (equals) {
                if (this.f41272b == null) {
                    this.f41272b = a.cb.q(oVar, wd.class);
                }
                pdVar.f40938b = (wd) this.f41272b.c(aVar);
                boolean[] zArr = pdVar.f40939c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("media_type")) {
                if (this.f41273c == null) {
                    this.f41273c = a.cb.q(oVar, Integer.class);
                }
                pdVar.f40937a = (Integer) this.f41273c.c(aVar);
                boolean[] zArr2 = pdVar.f40939c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new sd(pdVar.f40937a, pdVar.f40938b, pdVar.f40939c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wd wdVar;
        Integer num;
        sd sdVar = (sd) obj;
        if (sdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sdVar.f41856c;
        int length = zArr.length;
        nm.o oVar = this.f41271a;
        if (length > 0 && zArr[0]) {
            if (this.f41273c == null) {
                this.f41273c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f41273c;
            um.c h10 = cVar.h("media_type");
            num = sdVar.f41854a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41272b == null) {
                this.f41272b = a.cb.q(oVar, wd.class);
            }
            nm.m mVar2 = this.f41272b;
            um.c h13 = cVar.h("sticker");
            wdVar = sdVar.f41855b;
            mVar2.e(h13, wdVar);
        }
        cVar.g();
    }
}
