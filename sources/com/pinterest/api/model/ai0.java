package com.pinterest.api.model;

import com.pinterest.api.model.zh0;

/* loaded from: classes3.dex */
public final class ai0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35762a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35763b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35764c;

    public ai0(nm.o oVar) {
        this.f35762a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yh0 yh0Var = new yh0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -776882287) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("click_type")) {
                c13 = 0;
            }
            nm.o oVar = this.f35762a;
            if (c13 == 0) {
                if (this.f35763b == null) {
                    this.f35763b = a.cb.q(oVar, zh0.a.class);
                }
                yh0Var.f44053c = (zh0.a) this.f35763b.c(aVar);
                boolean[] zArr = yh0Var.f44054d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f35764c == null) {
                    this.f35764c = a.cb.q(oVar, String.class);
                }
                yh0Var.f44051a = (String) this.f35764c.c(aVar);
                boolean[] zArr2 = yh0Var.f44054d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f35764c == null) {
                    this.f35764c = a.cb.q(oVar, String.class);
                }
                yh0Var.f44052b = (String) this.f35764c.c(aVar);
                boolean[] zArr3 = yh0Var.f44054d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new zh0(yh0Var.f44051a, yh0Var.f44052b, yh0Var.f44053c, yh0Var.f44054d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        zh0.a aVar;
        String str;
        String str2;
        zh0 zh0Var = (zh0) obj;
        if (zh0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zh0Var.f44332d;
        int length = zArr.length;
        nm.o oVar = this.f35762a;
        if (length > 0 && zArr[0]) {
            if (this.f35764c == null) {
                this.f35764c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35764c;
            um.c h10 = cVar.h("id");
            str2 = zh0Var.f44329a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35764c == null) {
                this.f35764c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35764c;
            um.c h13 = cVar.h("node_id");
            str = zh0Var.f44330b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35763b == null) {
                this.f35763b = a.cb.q(oVar, zh0.a.class);
            }
            nm.m mVar3 = this.f35763b;
            um.c h14 = cVar.h("click_type");
            aVar = zh0Var.f44331c;
            mVar3.e(h14, aVar);
        }
        cVar.g();
    }
}
