package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class v50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42733a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42734b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42735c;

    public v50(nm.o oVar) {
        this.f42733a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u50 u50Var = new u50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1300320989) {
                if (hashCode != 453999410) {
                    if (hashCode == 1040253983 && k03.equals("grid_title")) {
                        c13 = 2;
                    }
                } else if (k03.equals("rich_metadata")) {
                    c13 = 1;
                }
            } else if (k03.equals("closeup_unified_description")) {
                c13 = 0;
            }
            nm.o oVar = this.f42733a;
            if (c13 == 0) {
                if (this.f42735c == null) {
                    this.f42735c = a.cb.q(oVar, String.class);
                }
                u50Var.f42417a = (String) this.f42735c.c(aVar);
                boolean[] zArr = u50Var.f42420d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42734b == null) {
                    this.f42734b = a.cb.q(oVar, oe0.class);
                }
                u50Var.f42419c = (oe0) this.f42734b.c(aVar);
                boolean[] zArr2 = u50Var.f42420d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42735c == null) {
                    this.f42735c = a.cb.q(oVar, String.class);
                }
                u50Var.f42418b = (String) this.f42735c.c(aVar);
                boolean[] zArr3 = u50Var.f42420d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new x50(u50Var.f42417a, u50Var.f42418b, u50Var.f42419c, u50Var.f42420d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        oe0 oe0Var;
        String str;
        String str2;
        x50 x50Var = (x50) obj;
        if (x50Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = x50Var.f43598d;
        int length = zArr.length;
        nm.o oVar = this.f42733a;
        if (length > 0 && zArr[0]) {
            if (this.f42735c == null) {
                this.f42735c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42735c;
            um.c h10 = cVar.h("closeup_unified_description");
            str2 = x50Var.f43595a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42735c == null) {
                this.f42735c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42735c;
            um.c h13 = cVar.h("grid_title");
            str = x50Var.f43596b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42734b == null) {
                this.f42734b = a.cb.q(oVar, oe0.class);
            }
            nm.m mVar3 = this.f42734b;
            um.c h14 = cVar.h("rich_metadata");
            oe0Var = x50Var.f43597c;
            mVar3.e(h14, oe0Var);
        }
        cVar.g();
    }
}
