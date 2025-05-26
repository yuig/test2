package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class g40 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37962a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37963b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37964c;

    public g40(nm.o oVar) {
        this.f37962a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f40 f40Var = new f40(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("canonical_images");
            nm.o oVar = this.f37962a;
            if (equals) {
                if (this.f37963b == null) {
                    this.f37963b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PinImageDetails$PinImageDetailsTypeAdapter$2
                    }).b();
                }
                f40Var.b((Map) this.f37963b.c(aVar));
            } else if (k03.equals("image_signature")) {
                if (this.f37964c == null) {
                    this.f37964c = a.cb.q(oVar, String.class);
                }
                f40Var.c((String) this.f37964c.c(aVar));
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return f40Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        i40 i40Var = (i40) obj;
        if (i40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i40Var.f38646c;
        int length = zArr.length;
        nm.o oVar = this.f37962a;
        if (length > 0 && zArr[0]) {
            if (this.f37963b == null) {
                this.f37963b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PinImageDetails$PinImageDetailsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f37963b;
            um.c h10 = cVar.h("canonical_images");
            map = i40Var.f38644a;
            mVar.e(h10, map);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37964c == null) {
                this.f37964c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37964c;
            um.c h13 = cVar.h("image_signature");
            str = i40Var.f38645b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
