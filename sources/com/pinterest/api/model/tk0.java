package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class tk0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42229a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42230b;

    public tk0(nm.o oVar) {
        this.f42229a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        sk0 sk0Var = new sk0(0);
        aVar.c();
        while (aVar.hasNext()) {
            if (a.cb.z(aVar, "block_type")) {
                if (this.f42230b == null) {
                    this.f42230b = a.cb.q(this.f42229a, Integer.class);
                }
                sk0Var.f41932a = (Integer) this.f42230b.c(aVar);
                boolean[] zArr = sk0Var.f41933b;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new vk0(sk0Var.f41932a, sk0Var.f41933b, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        vk0 vk0Var = (vk0) obj;
        if (vk0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = vk0Var.f42911b;
        if (zArr.length > 0 && zArr[0]) {
            if (this.f42230b == null) {
                this.f42230b = a.cb.q(this.f42229a, Integer.class);
            }
            nm.m mVar = this.f42230b;
            um.c h10 = cVar.h("block_type");
            num = vk0Var.f42910a;
            mVar.e(h10, num);
        }
        cVar.g();
    }
}
