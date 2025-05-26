package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class q01 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41161a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41162b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41163c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41164d;

    public q01(nm.o oVar) {
        this.f41161a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p01 p01Var = new p01(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -2107966337) {
                if (hashCode != -831333293) {
                    if (hashCode == 696987355 && k03.equals("makeup_eyeshadow")) {
                        c13 = 2;
                    }
                } else if (k03.equals("makeup_lipstick")) {
                    c13 = 1;
                }
            } else if (k03.equals("product_metadata")) {
                c13 = 0;
            }
            nm.o oVar = this.f41161a;
            if (c13 == 0) {
                if (this.f41164d == null) {
                    this.f41164d = a.cb.q(oVar, r70.class);
                }
                p01Var.f40851c = (r70) this.f41164d.c(aVar);
                boolean[] zArr = p01Var.f40852d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41163c == null) {
                    this.f41163c = a.cb.q(oVar, uw.class);
                }
                p01Var.f40850b = (uw) this.f41163c.c(aVar);
                boolean[] zArr2 = p01Var.f40852d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41162b == null) {
                    this.f41162b = oVar.g(new TypeToken<List<uw>>(this) { // from class: com.pinterest.api.model.VirtualTryOnData$VirtualTryOnDataTypeAdapter$2
                    }).b();
                }
                p01Var.f40849a = (List) this.f41162b.c(aVar);
                boolean[] zArr3 = p01Var.f40852d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new s01(p01Var.f40849a, p01Var.f40850b, p01Var.f40851c, p01Var.f40852d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        r70 r70Var;
        uw uwVar;
        List list;
        s01 s01Var = (s01) obj;
        if (s01Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s01Var.f41750d;
        int length = zArr.length;
        nm.o oVar = this.f41161a;
        if (length > 0 && zArr[0]) {
            if (this.f41162b == null) {
                this.f41162b = oVar.g(new TypeToken<List<uw>>(this) { // from class: com.pinterest.api.model.VirtualTryOnData$VirtualTryOnDataTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f41162b;
            um.c h10 = cVar.h("makeup_eyeshadow");
            list = s01Var.f41747a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41163c == null) {
                this.f41163c = a.cb.q(oVar, uw.class);
            }
            nm.m mVar2 = this.f41163c;
            um.c h13 = cVar.h("makeup_lipstick");
            uwVar = s01Var.f41748b;
            mVar2.e(h13, uwVar);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41164d == null) {
                this.f41164d = a.cb.q(oVar, r70.class);
            }
            nm.m mVar3 = this.f41164d;
            um.c h14 = cVar.h("product_metadata");
            r70Var = s01Var.f41749c;
            mVar3.e(h14, r70Var);
        }
        cVar.g();
    }
}
