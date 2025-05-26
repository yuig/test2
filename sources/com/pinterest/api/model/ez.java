package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ez extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37396a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37397b;

    public ez(nm.o oVar) {
        this.f37396a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dz dzVar = new dz(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("link");
            nm.o oVar = this.f37396a;
            if (equals) {
                if (this.f37397b == null) {
                    this.f37397b = a.cb.q(oVar, String.class);
                }
                dzVar.f36997a = (String) this.f37397b.c(aVar);
                boolean[] zArr = dzVar.f36999c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("text")) {
                if (this.f37397b == null) {
                    this.f37397b = a.cb.q(oVar, String.class);
                }
                dzVar.f36998b = (String) this.f37397b.c(aVar);
                boolean[] zArr2 = dzVar.f36999c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new gz(dzVar.f36997a, dzVar.f36998b, dzVar.f36999c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        gz gzVar = (gz) obj;
        if (gzVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gzVar.f38187c;
        int length = zArr.length;
        nm.o oVar = this.f37396a;
        if (length > 0 && zArr[0]) {
            if (this.f37397b == null) {
                this.f37397b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37397b;
            um.c h10 = cVar.h("link");
            str2 = gzVar.f38185a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37397b == null) {
                this.f37397b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37397b;
            um.c h13 = cVar.h("text");
            str = gzVar.f38186b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
