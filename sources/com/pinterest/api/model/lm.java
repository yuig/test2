package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class lm extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39818a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39819b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39820c;

    public lm(nm.o oVar) {
        this.f39818a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        km kmVar = new km(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("type");
            nm.o oVar = this.f39818a;
            if (equals) {
                if (this.f39820c == null) {
                    this.f39820c = a.cb.q(oVar, String.class);
                }
                kmVar.f39490b = (String) this.f39820c.c(aVar);
                boolean[] zArr = kmVar.f39491c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("content")) {
                if (this.f39819b == null) {
                    this.f39819b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionSpecsComponent$FormattedDescriptionSpecsComponentTypeAdapter$2
                    }).b();
                }
                kmVar.f39489a = (Map) this.f39819b.c(aVar);
                boolean[] zArr2 = kmVar.f39491c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new mm(kmVar.f39489a, kmVar.f39490b, kmVar.f39491c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        mm mmVar = (mm) obj;
        if (mmVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mmVar.f40163c;
        int length = zArr.length;
        nm.o oVar = this.f39818a;
        if (length > 0 && zArr[0]) {
            if (this.f39819b == null) {
                this.f39819b = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.FormattedDescriptionSpecsComponent$FormattedDescriptionSpecsComponentTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f39819b;
            um.c h10 = cVar.h("content");
            map = mmVar.f40161a;
            mVar.e(h10, map);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39820c == null) {
                this.f39820c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39820c;
            um.c h13 = cVar.h("type");
            str = mmVar.f40162b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
