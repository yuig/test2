package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qn extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41340a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41341b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41342c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41343d;

    public qn(nm.o oVar) {
        this.f41340a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pn pnVar = new pn(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 398301669) {
                if (hashCode != 1044669940) {
                    if (hashCode == 1714148973 && k03.equals("displayName")) {
                        c13 = 2;
                    }
                } else if (k03.equals("interestData")) {
                    c13 = 1;
                }
            } else if (k03.equals("isSelected")) {
                c13 = 0;
            }
            nm.o oVar = this.f41340a;
            if (c13 == 0) {
                if (this.f41341b == null) {
                    this.f41341b = a.cb.q(oVar, Boolean.class);
                }
                pnVar.f41030c = (Boolean) this.f41341b.c(aVar);
                boolean[] zArr = pnVar.f41031d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41342c == null) {
                    this.f41342c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.HideInterest$HideInterestTypeAdapter$2
                    }).b();
                }
                pnVar.f41029b = (Map) this.f41342c.c(aVar);
                boolean[] zArr2 = pnVar.f41031d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41343d == null) {
                    this.f41343d = a.cb.q(oVar, String.class);
                }
                pnVar.f41028a = (String) this.f41343d.c(aVar);
                boolean[] zArr3 = pnVar.f41031d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new sn(pnVar.f41028a, pnVar.f41029b, pnVar.f41030c, pnVar.f41031d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        Map map;
        String str;
        sn snVar = (sn) obj;
        if (snVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = snVar.f41947d;
        int length = zArr.length;
        nm.o oVar = this.f41340a;
        if (length > 0 && zArr[0]) {
            if (this.f41343d == null) {
                this.f41343d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41343d;
            um.c h10 = cVar.h("displayName");
            str = snVar.f41944a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41342c == null) {
                this.f41342c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.HideInterest$HideInterestTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f41342c;
            um.c h13 = cVar.h("interestData");
            map = snVar.f41945b;
            mVar2.e(h13, map);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41341b == null) {
                this.f41341b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f41341b;
            um.c h14 = cVar.h("isSelected");
            bool = snVar.f41946c;
            mVar3.e(h14, bool);
        }
        cVar.g();
    }
}
