package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ls extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39871a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39872b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39873c;

    public ls(nm.o oVar) {
        this.f39871a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ks ksVar = new ks(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("badgeOptOut");
            nm.o oVar = this.f39871a;
            if (equals) {
                if (this.f39872b == null) {
                    this.f39872b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalBadgeSelection$InspirationalBadgeSelectionTypeAdapter$2
                    }).b();
                }
                ksVar.f39522b = (List) this.f39872b.c(aVar);
                boolean[] zArr = ksVar.f39523c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("badgeColor")) {
                if (this.f39873c == null) {
                    this.f39873c = a.cb.q(oVar, String.class);
                }
                ksVar.f39521a = (String) this.f39873c.c(aVar);
                boolean[] zArr2 = ksVar.f39523c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ns(ksVar.f39521a, ksVar.f39522b, ksVar.f39523c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        ns nsVar = (ns) obj;
        if (nsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nsVar.f40474c;
        int length = zArr.length;
        nm.o oVar = this.f39871a;
        if (length > 0 && zArr[0]) {
            if (this.f39873c == null) {
                this.f39873c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39873c;
            um.c h10 = cVar.h("badgeColor");
            str = nsVar.f40472a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39872b == null) {
                this.f39872b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalBadgeSelection$InspirationalBadgeSelectionTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f39872b;
            um.c h13 = cVar.h("badgeOptOut");
            list = nsVar.f40473b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
