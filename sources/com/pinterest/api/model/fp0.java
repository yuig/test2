package com.pinterest.api.model;

import com.pinterest.api.model.ep0;

/* loaded from: classes.dex */
public final class fp0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37736a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37737b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37738c;

    public fp0(nm.o oVar) {
        this.f37736a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        dp0 dp0Var = new dp0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("background_color");
            nm.o oVar = this.f37736a;
            if (equals) {
                if (this.f37738c == null) {
                    this.f37738c = a.cb.q(oVar, String.class);
                }
                dp0Var.f36912a = (String) this.f37738c.c(aVar);
                boolean[] zArr = dp0Var.f36914c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("media_fit")) {
                if (this.f37737b == null) {
                    this.f37737b = a.cb.q(oVar, ep0.a.class);
                }
                dp0Var.f36913b = (ep0.a) this.f37737b.c(aVar);
                boolean[] zArr2 = dp0Var.f36914c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new ep0(dp0Var.f36912a, dp0Var.f36913b, dp0Var.f36914c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ep0.a aVar;
        String str;
        ep0 ep0Var = (ep0) obj;
        if (ep0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ep0Var.f37319c;
        int length = zArr.length;
        nm.o oVar = this.f37736a;
        if (length > 0 && zArr[0]) {
            if (this.f37738c == null) {
                this.f37738c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37738c;
            um.c h10 = cVar.h("background_color");
            str = ep0Var.f37317a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37737b == null) {
                this.f37737b = a.cb.q(oVar, ep0.a.class);
            }
            nm.m mVar2 = this.f37737b;
            um.c h13 = cVar.h("media_fit");
            aVar = ep0Var.f37318b;
            mVar2.e(h13, aVar);
        }
        cVar.g();
    }
}
