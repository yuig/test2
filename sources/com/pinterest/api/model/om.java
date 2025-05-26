package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class om extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40753a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40754b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40755c;

    public om(nm.o oVar) {
        this.f40753a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        nm nmVar = new nm(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("type");
            nm.o oVar = this.f40753a;
            if (equals) {
                if (this.f40755c == null) {
                    this.f40755c = a.cb.q(oVar, String.class);
                }
                nmVar.f40437b = (String) this.f40755c.c(aVar);
                boolean[] zArr = nmVar.f40438c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("content")) {
                if (this.f40754b == null) {
                    this.f40754b = oVar.g(new TypeToken<List<List<String>>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionTableComponent$FormattedDescriptionTableComponentTypeAdapter$2
                    }).b();
                }
                nmVar.f40436a = (List) this.f40754b.c(aVar);
                boolean[] zArr2 = nmVar.f40438c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new pm(nmVar.f40436a, nmVar.f40437b, nmVar.f40438c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        pm pmVar = (pm) obj;
        if (pmVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pmVar.f41021c;
        int length = zArr.length;
        nm.o oVar = this.f40753a;
        if (length > 0 && zArr[0]) {
            if (this.f40754b == null) {
                this.f40754b = oVar.g(new TypeToken<List<List<String>>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionTableComponent$FormattedDescriptionTableComponentTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40754b;
            um.c h10 = cVar.h("content");
            list = pmVar.f41019a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40755c == null) {
                this.f40755c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40755c;
            um.c h13 = cVar.h("type");
            str = pmVar.f41020b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
