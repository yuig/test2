package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class cn0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36476a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36477b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36478c;

    public cn0(nm.o oVar) {
        this.f36476a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bn0 bn0Var = new bn0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("blocks");
            nm.o oVar = this.f36476a;
            if (equals) {
                if (this.f36477b == null) {
                    this.f36477b = oVar.g(new TypeToken<List<eq0>>(this) { // from class: com.pinterest.api.model.StoryPinListBlock$StoryPinListBlockTypeAdapter$2
                    }).b();
                }
                bn0Var.f36132a = (List) this.f36477b.c(aVar);
                boolean[] zArr = bn0Var.f36134c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("heading")) {
                if (this.f36478c == null) {
                    this.f36478c = a.cb.q(oVar, String.class);
                }
                bn0Var.f36133b = (String) this.f36478c.c(aVar);
                boolean[] zArr2 = bn0Var.f36134c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new en0(bn0Var.f36132a, bn0Var.f36133b, bn0Var.f36134c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        en0 en0Var = (en0) obj;
        if (en0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = en0Var.f37314c;
        int length = zArr.length;
        nm.o oVar = this.f36476a;
        if (length > 0 && zArr[0]) {
            if (this.f36477b == null) {
                this.f36477b = oVar.g(new TypeToken<List<eq0>>(this) { // from class: com.pinterest.api.model.StoryPinListBlock$StoryPinListBlockTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36477b;
            um.c h10 = cVar.h("blocks");
            list = en0Var.f37312a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36478c == null) {
                this.f36478c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36478c;
            um.c h13 = cVar.h("heading");
            str = en0Var.f37313b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
