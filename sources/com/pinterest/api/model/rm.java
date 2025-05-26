package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class rm extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41625a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41626b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41627c;

    public rm(nm.o oVar) {
        this.f41625a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qm qmVar = new qm(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("text_tags");
            nm.o oVar = this.f41625a;
            if (equals) {
                if (this.f41626b == null) {
                    this.f41626b = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.FormattedText$FormattedTextTypeAdapter$2
                    }).b();
                }
                qmVar.f41335b = (List) this.f41626b.c(aVar);
                boolean[] zArr = qmVar.f41336c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("text")) {
                if (this.f41627c == null) {
                    this.f41627c = a.cb.q(oVar, String.class);
                }
                qmVar.b((String) this.f41627c.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return qmVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        tm tmVar = (tm) obj;
        if (tmVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tmVar.f42238c;
        int length = zArr.length;
        nm.o oVar = this.f41625a;
        if (length > 0 && zArr[0]) {
            if (this.f41627c == null) {
                this.f41627c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41627c;
            um.c h10 = cVar.h("text");
            str = tmVar.f42236a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41626b == null) {
                this.f41626b = oVar.g(new TypeToken<List<ts0>>(this) { // from class: com.pinterest.api.model.FormattedText$FormattedTextTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f41626b;
            um.c h13 = cVar.h("text_tags");
            list = tmVar.f42237b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
