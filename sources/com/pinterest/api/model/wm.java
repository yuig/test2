package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class wm extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43289a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43290b;

    public wm(nm.o oVar) {
        this.f43289a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vm vmVar = new vm(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("interest_id_str");
            nm.o oVar = this.f43289a;
            if (equals) {
                if (this.f43290b == null) {
                    this.f43290b = a.cb.q(oVar, String.class);
                }
                vmVar.f42923a = (String) this.f43290b.c(aVar);
                boolean[] zArr = vmVar.f42925c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("name")) {
                if (this.f43290b == null) {
                    this.f43290b = a.cb.q(oVar, String.class);
                }
                vmVar.f42924b = (String) this.f43290b.c(aVar);
                boolean[] zArr2 = vmVar.f42925c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ym(vmVar.f42923a, vmVar.f42924b, vmVar.f42925c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        ym ymVar = (ym) obj;
        if (ymVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ymVar.f44080c;
        int length = zArr.length;
        nm.o oVar = this.f43289a;
        if (length > 0 && zArr[0]) {
            if (this.f43290b == null) {
                this.f43290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43290b;
            um.c h10 = cVar.h("interest_id_str");
            str2 = ymVar.f44078a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43290b == null) {
                this.f43290b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43290b;
            um.c h13 = cVar.h("name");
            str = ymVar.f44079b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
