package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class hs extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38526a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38527b;

    public hs(nm.o oVar) {
        this.f38526a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gs gsVar = new gs(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1724546052) {
                if (hashCode != 3355) {
                    if (hashCode == 102727412 && k03.equals("label")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("description")) {
                c13 = 0;
            }
            nm.o oVar = this.f38526a;
            if (c13 == 0) {
                if (this.f38527b == null) {
                    this.f38527b = a.cb.q(oVar, String.class);
                }
                gsVar.f38124a = (String) this.f38527b.c(aVar);
                boolean[] zArr = gsVar.f38127d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f38527b == null) {
                    this.f38527b = a.cb.q(oVar, String.class);
                }
                gsVar.f38125b = (String) this.f38527b.c(aVar);
                boolean[] zArr2 = gsVar.f38127d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f38527b == null) {
                    this.f38527b = a.cb.q(oVar, String.class);
                }
                gsVar.f38126c = (String) this.f38527b.c(aVar);
                boolean[] zArr3 = gsVar.f38127d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return new js(gsVar.f38124a, gsVar.f38125b, gsVar.f38126c, gsVar.f38127d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        js jsVar = (js) obj;
        if (jsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jsVar.f39137d;
        int length = zArr.length;
        nm.o oVar = this.f38526a;
        if (length > 0 && zArr[0]) {
            if (this.f38527b == null) {
                this.f38527b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38527b;
            um.c h10 = cVar.h("description");
            str3 = jsVar.f39134a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38527b == null) {
                this.f38527b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38527b;
            um.c h13 = cVar.h("id");
            str2 = jsVar.f39135b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38527b == null) {
                this.f38527b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38527b;
            um.c h14 = cVar.h("label");
            str = jsVar.f39136c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
