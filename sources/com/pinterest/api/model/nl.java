package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class nl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40432a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40433b;

    public nl(nm.o oVar) {
        this.f40432a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ml mlVar = new ml(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("id");
            nm.o oVar = this.f40432a;
            if (equals) {
                if (this.f40433b == null) {
                    this.f40433b = a.cb.q(oVar, String.class);
                }
                mlVar.f40157a = (String) this.f40433b.c(aVar);
                boolean[] zArr = mlVar.f40159c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("node_id")) {
                if (this.f40433b == null) {
                    this.f40433b = a.cb.q(oVar, String.class);
                }
                mlVar.f40158b = (String) this.f40433b.c(aVar);
                boolean[] zArr2 = mlVar.f40159c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new pl(mlVar.f40157a, mlVar.f40158b, mlVar.f40159c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        pl plVar = (pl) obj;
        if (plVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = plVar.f41018c;
        int length = zArr.length;
        nm.o oVar = this.f40432a;
        if (length > 0 && zArr[0]) {
            if (this.f40433b == null) {
                this.f40433b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40433b;
            um.c h10 = cVar.h("id");
            str2 = plVar.f41016a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40433b == null) {
                this.f40433b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40433b;
            um.c h13 = cVar.h("node_id");
            str = plVar.f41017b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
