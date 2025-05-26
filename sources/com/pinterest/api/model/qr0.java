package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class qr0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41359a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41360b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41361c;

    public qr0(nm.o oVar) {
        this.f41359a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        pr0 pr0Var = new pr0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            boolean equals = k03.equals("conditions");
            nm.o oVar = this.f41359a;
            if (equals) {
                if (this.f41360b == null) {
                    this.f41360b = oVar.g(new TypeToken<List<nr0>>(this) { // from class: com.pinterest.api.model.SurveyConditional$SurveyConditionalTypeAdapter$2
                    }).b();
                }
                pr0Var.f41070a = (List) this.f41360b.c(aVar);
                boolean[] zArr = pr0Var.f41072c;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (k03.equals("go_to")) {
                if (this.f41361c == null) {
                    this.f41361c = a.cb.q(oVar, String.class);
                }
                pr0Var.f41071b = (String) this.f41361c.c(aVar);
                boolean[] zArr2 = pr0Var.f41072c;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else {
                aVar.E();
            }
        }
        aVar.g();
        return new sr0(pr0Var.f41070a, pr0Var.f41071b, pr0Var.f41072c, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        sr0 sr0Var = (sr0) obj;
        if (sr0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = sr0Var.f41978c;
        int length = zArr.length;
        nm.o oVar = this.f41359a;
        if (length > 0 && zArr[0]) {
            if (this.f41360b == null) {
                this.f41360b = oVar.g(new TypeToken<List<nr0>>(this) { // from class: com.pinterest.api.model.SurveyConditional$SurveyConditionalTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f41360b;
            um.c h10 = cVar.h("conditions");
            list = sr0Var.f41976a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41361c == null) {
                this.f41361c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41361c;
            um.c h13 = cVar.h("go_to");
            str = sr0Var.f41977b;
            mVar2.e(h13, str);
        }
        cVar.g();
    }
}
