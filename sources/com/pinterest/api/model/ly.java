package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ly extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39943a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39944b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39945c;

    public ly(nm.o oVar) {
        this.f39943a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ky kyVar = new ky(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 1307086383) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("safety_root")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f39943a;
            if (c13 == 0) {
                if (this.f39945c == null) {
                    this.f39945c = a.cb.q(oVar, String.class);
                }
                kyVar.f39563a = (String) this.f39945c.c(aVar);
                boolean[] zArr = kyVar.f39566d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39944b == null) {
                    this.f39944b = a.cb.q(oVar, yy.class);
                }
                kyVar.f39565c = (yy) this.f39944b.c(aVar);
                boolean[] zArr2 = kyVar.f39566d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f39945c == null) {
                    this.f39945c = a.cb.q(oVar, String.class);
                }
                kyVar.f39564b = (String) this.f39945c.c(aVar);
                boolean[] zArr3 = kyVar.f39566d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new ny(kyVar.f39563a, kyVar.f39564b, kyVar.f39565c, kyVar.f39566d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        yy yyVar;
        String str;
        String str2;
        ny nyVar = (ny) obj;
        if (nyVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nyVar.f40535d;
        int length = zArr.length;
        nm.o oVar = this.f39943a;
        if (length > 0 && zArr[0]) {
            if (this.f39945c == null) {
                this.f39945c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39945c;
            um.c h10 = cVar.h("id");
            str2 = nyVar.f40532a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39945c == null) {
                this.f39945c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39945c;
            um.c h13 = cVar.h("node_id");
            str = nyVar.f40533b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39944b == null) {
                this.f39944b = a.cb.q(oVar, yy.class);
            }
            nm.m mVar3 = this.f39944b;
            um.c h14 = cVar.h("safety_root");
            yyVar = nyVar.f40534c;
            mVar3.e(h14, yyVar);
        }
        cVar.g();
    }
}
