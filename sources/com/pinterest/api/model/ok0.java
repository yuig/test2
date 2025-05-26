package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class ok0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40748a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40749b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40750c;

    public ok0(nm.o oVar) {
        this.f40748a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        nk0 nk0Var = new nk0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("list_blocks");
            nm.o oVar = this.f40748a;
            if (equals) {
                if (this.f40750c == null) {
                    this.f40750c = oVar.g(new TypeToken<List<en0>>(this) { // from class: com.pinterest.api.model.StoryPinBasics$StoryPinBasicsTypeAdapter$4
                    }).b();
                }
                nk0Var.c((List) this.f40750c.c(aVar));
            } else if (k03.equals("key_value_blocks")) {
                if (this.f40749b == null) {
                    this.f40749b = oVar.g(new TypeToken<List<wm0>>(this) { // from class: com.pinterest.api.model.StoryPinBasics$StoryPinBasicsTypeAdapter$3
                    }).b();
                }
                nk0Var.b((List) this.f40749b.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return nk0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        qk0 qk0Var = (qk0) obj;
        if (qk0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qk0Var.f41326c;
        int length = zArr.length;
        nm.o oVar = this.f40748a;
        if (length > 0 && zArr[0]) {
            if (this.f40749b == null) {
                this.f40749b = oVar.g(new TypeToken<List<wm0>>(this) { // from class: com.pinterest.api.model.StoryPinBasics$StoryPinBasicsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f40749b;
            um.c h10 = cVar.h("key_value_blocks");
            list2 = qk0Var.f41324a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40750c == null) {
                this.f40750c = oVar.g(new TypeToken<List<en0>>(this) { // from class: com.pinterest.api.model.StoryPinBasics$StoryPinBasicsTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f40750c;
            um.c h13 = cVar.h("list_blocks");
            list = qk0Var.f41325b;
            mVar2.e(h13, list);
        }
        cVar.g();
    }
}
