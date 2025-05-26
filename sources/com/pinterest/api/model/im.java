package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class im extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38813a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38814b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38815c;

    public im(nm.o oVar) {
        this.f38813a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hm hmVar = new hm(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("type");
            nm.o oVar = this.f38813a;
            if (equals) {
                if (this.f38815c == null) {
                    this.f38815c = a.cb.q(oVar, String.class);
                }
                hmVar.f38486b = (String) this.f38815c.c(aVar);
                boolean[] zArr = hmVar.f38487c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("content")) {
                if (this.f38814b == null) {
                    this.f38814b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionPointsComponent$FormattedDescriptionPointsComponentTypeAdapter$2
                    }).b();
                }
                hmVar.f38485a = (List) this.f38814b.c(aVar);
                boolean[] zArr2 = hmVar.f38487c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new jm(hmVar.f38485a, hmVar.f38486b, hmVar.f38487c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        jm jmVar = (jm) obj;
        if (jmVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jmVar.f39098c;
        int length = zArr.length;
        nm.o oVar = this.f38813a;
        if (length > 0 && zArr[0]) {
            if (this.f38814b == null) {
                this.f38814b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionPointsComponent$FormattedDescriptionPointsComponentTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f38814b;
            um.c h10 = cVar.h("content");
            list = jmVar.f39096a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38815c == null) {
                this.f38815c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38815c;
            um.c h13 = cVar.h("type");
            str = jmVar.f39097b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
