package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ic extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38730a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38731b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38732c;

    public ic(nm.o oVar) {
        this.f38730a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hc hcVar = new hc(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -2103719742) {
                if (hashCode != 3355) {
                    if (hashCode != 50511102) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("category")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("ingredients")) {
                c13 = 0;
            }
            nm.o oVar = this.f38730a;
            if (c13 == 0) {
                if (this.f38731b == null) {
                    this.f38731b = oVar.g(new TypeToken<List<r10>>(this) { // from class: com.pinterest.api.model.CategorizedIngredientsRichData$CategorizedIngredientsRichDataTypeAdapter$2
                    }).b();
                }
                hcVar.f38367d = (List) this.f38731b.c(aVar);
                boolean[] zArr = hcVar.f38368e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38732c == null) {
                    this.f38732c = a.cb.q(oVar, String.class);
                }
                hcVar.f38364a = (String) this.f38732c.c(aVar);
                boolean[] zArr2 = hcVar.f38368e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f38732c == null) {
                    this.f38732c = a.cb.q(oVar, String.class);
                }
                hcVar.f38366c = (String) this.f38732c.c(aVar);
                boolean[] zArr3 = hcVar.f38368e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f38732c == null) {
                    this.f38732c = a.cb.q(oVar, String.class);
                }
                hcVar.f38365b = (String) this.f38732c.c(aVar);
                boolean[] zArr4 = hcVar.f38368e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new kc(hcVar.f38364a, hcVar.f38365b, hcVar.f38366c, hcVar.f38367d, hcVar.f38368e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        String str3;
        kc kcVar = (kc) obj;
        if (kcVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kcVar.f39384e;
        int length = zArr.length;
        nm.o oVar = this.f38730a;
        if (length > 0 && zArr[0]) {
            if (this.f38732c == null) {
                this.f38732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38732c;
            um.c h10 = cVar.h("id");
            str3 = kcVar.f39380a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38732c == null) {
                this.f38732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38732c;
            um.c h13 = cVar.h("node_id");
            str2 = kcVar.f39381b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38732c == null) {
                this.f38732c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38732c;
            um.c h14 = cVar.h("category");
            str = kcVar.f39382c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38731b == null) {
                this.f38731b = oVar.g(new TypeToken<List<r10>>(this) { // from class: com.pinterest.api.model.CategorizedIngredientsRichData$CategorizedIngredientsRichDataTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f38731b;
            um.c h15 = cVar.h("ingredients");
            list = kcVar.f39383d;
            mVar4.e(h15, list);
        }
        cVar.g();
    }
}
