package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class jw0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39160a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39161b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39162c;

    public jw0(nm.o oVar) {
        this.f39160a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        iw0 iw0Var = new iw0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("unread");
            nm.o oVar = this.f39160a;
            if (equals) {
                if (this.f39161b == null) {
                    this.f39161b = a.cb.q(oVar, Integer.class);
                }
                iw0Var.f38877b = (Integer) this.f39161b.c(aVar);
                boolean[] zArr = iw0Var.f38878c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("results")) {
                if (this.f39162c == null) {
                    this.f39162c = oVar.g(new TypeToken<List<fw0>>(this) { // from class: com.pinterest.api.model.TrackedComments$TrackedCommentsTypeAdapter$2
                    }).b();
                }
                iw0Var.f38876a = (List) this.f39162c.c(aVar);
                boolean[] zArr2 = iw0Var.f38878c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new lw0(iw0Var.f38876a, iw0Var.f38877b, iw0Var.f38878c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        List list;
        lw0 lw0Var = (lw0) obj;
        if (lw0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lw0Var.f39933c;
        int length = zArr.length;
        nm.o oVar = this.f39160a;
        if (length > 0 && zArr[0]) {
            if (this.f39162c == null) {
                this.f39162c = oVar.g(new TypeToken<List<fw0>>(this) { // from class: com.pinterest.api.model.TrackedComments$TrackedCommentsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f39162c;
            um.c h10 = cVar.h("results");
            list = lw0Var.f39931a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39161b == null) {
                this.f39161b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f39161b;
            um.c h13 = cVar.h("unread");
            num = lw0Var.f39932b;
            mVar2.e(h13, num);
        }
        cVar.g();
    }
}
