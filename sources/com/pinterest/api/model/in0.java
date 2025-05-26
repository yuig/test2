package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class in0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38828a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38829b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38830c;

    public in0(nm.o oVar) {
        this.f38828a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hn0 hn0Var = new hn0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("list_blocks");
            nm.o oVar = this.f38828a;
            if (equals) {
                if (this.f38830c == null) {
                    this.f38830c = oVar.g(new TypeToken<List<tn0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalBasics$StoryPinLocalBasicsTypeAdapter$4
                    }).b();
                }
                hn0Var.f38499b = (List) this.f38830c.c(aVar);
                boolean[] zArr = hn0Var.f38500c;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (k03.equals("key_value_blocks")) {
                if (this.f38829b == null) {
                    this.f38829b = oVar.g(new TypeToken<List<pn0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalBasics$StoryPinLocalBasicsTypeAdapter$3
                    }).b();
                }
                hn0Var.f38498a = (List) this.f38829b.c(aVar);
                boolean[] zArr2 = hn0Var.f38500c;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new kn0(hn0Var.f38498a, hn0Var.f38499b, hn0Var.f38500c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        kn0 kn0Var = (kn0) obj;
        if (kn0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kn0Var.f39500c;
        int length = zArr.length;
        nm.o oVar = this.f38828a;
        if (length > 0 && zArr[0]) {
            if (this.f38829b == null) {
                this.f38829b = oVar.g(new TypeToken<List<pn0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalBasics$StoryPinLocalBasicsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f38829b;
            um.c h10 = cVar.h("key_value_blocks");
            list2 = kn0Var.f39498a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38830c == null) {
                this.f38830c = oVar.g(new TypeToken<List<tn0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalBasics$StoryPinLocalBasicsTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f38830c;
            um.c h13 = cVar.h("list_blocks");
            list = kn0Var.f39499b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
