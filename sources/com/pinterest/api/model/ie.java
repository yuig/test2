package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ie extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38750a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38751b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38752c;

    public ie(nm.o oVar) {
        this.f38750a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        he heVar = new he(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("sender");
            nm.o oVar = this.f38750a;
            if (equals) {
                if (this.f38752c == null) {
                    this.f38752c = a.cb.q(oVar, wy0.class);
                }
                heVar.f38403b = (wy0) this.f38752c.c(aVar);
                boolean[] zArr = heVar.f38404c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("id")) {
                if (this.f38751b == null) {
                    this.f38751b = a.cb.q(oVar, String.class);
                }
                heVar.f38402a = (String) this.f38751b.c(aVar);
                boolean[] zArr2 = heVar.f38404c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ke(heVar.f38402a, heVar.f38403b, heVar.f38404c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        String str;
        ke keVar = (ke) obj;
        if (keVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = keVar.f39420c;
        int length = zArr.length;
        nm.o oVar = this.f38750a;
        if (length > 0 && zArr[0]) {
            if (this.f38751b == null) {
                this.f38751b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38751b;
            um.c h10 = cVar.h("id");
            str = keVar.f39418a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38752c == null) {
                this.f38752c = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar2 = this.f38752c;
            um.c h13 = cVar.h("sender");
            wy0Var = keVar.f39419b;
            mVar2.e(h13, wy0Var);
        }
        cVar.g();
    }
}
