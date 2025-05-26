package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class jp extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39114a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39115b;

    public jp(nm.o oVar) {
        this.f39114a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ip ipVar = new ip(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("question_text");
            nm.o oVar = this.f39114a;
            if (equals) {
                if (this.f39115b == null) {
                    this.f39115b = a.cb.q(oVar, String.class);
                }
                ipVar.f38833b = (String) this.f39115b.c(aVar);
                boolean[] zArr = ipVar.f38834c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("question_comment_id")) {
                if (this.f39115b == null) {
                    this.f39115b = a.cb.q(oVar, String.class);
                }
                ipVar.f38832a = (String) this.f39115b.c(aVar);
                boolean[] zArr2 = ipVar.f38834c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new lp(ipVar.f38832a, ipVar.f38833b, ipVar.f38834c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        lp lpVar = (lp) obj;
        if (lpVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lpVar.f39852c;
        int length = zArr.length;
        nm.o oVar = this.f39114a;
        if (length > 0 && zArr[0]) {
            if (this.f39115b == null) {
                this.f39115b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39115b;
            um.c h10 = cVar.h("question_comment_id");
            str2 = lpVar.f39850a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39115b == null) {
                this.f39115b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39115b;
            um.c h13 = cVar.h("question_text");
            str = lpVar.f39851b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
