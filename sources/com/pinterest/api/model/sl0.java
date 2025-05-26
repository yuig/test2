package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class sl0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41934a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41935b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41936c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41937d;

    public sl0(nm.o oVar) {
        this.f41934a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        rl0 rl0Var = new rl0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -908062580) {
                if (hashCode != -309448897) {
                    if (hashCode == -191501435 && k03.equals("feedback")) {
                        c13 = 2;
                    }
                } else if (k03.equals("feedback_types")) {
                    c13 = 1;
                }
            } else if (k03.equals("satisfaction")) {
                c13 = 0;
            }
            nm.o oVar = this.f41934a;
            if (c13 == 0) {
                if (this.f41935b == null) {
                    this.f41935b = a.cb.q(oVar, Integer.class);
                }
                rl0Var.f41623c = (Integer) this.f41935b.c(aVar);
                boolean[] zArr = rl0Var.f41624d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41936c == null) {
                    this.f41936c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.StoryPinFeedback$StoryPinFeedbackTypeAdapter$2
                    }).b();
                }
                rl0Var.f41622b = (List) this.f41936c.c(aVar);
                boolean[] zArr2 = rl0Var.f41624d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41937d == null) {
                    this.f41937d = a.cb.q(oVar, String.class);
                }
                rl0Var.f41621a = (String) this.f41937d.c(aVar);
                boolean[] zArr3 = rl0Var.f41624d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new ul0(rl0Var.f41621a, rl0Var.f41622b, rl0Var.f41623c, rl0Var.f41624d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        List list;
        String str;
        ul0 ul0Var = (ul0) obj;
        if (ul0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ul0Var.f42583d;
        int length = zArr.length;
        nm.o oVar = this.f41934a;
        if (length > 0 && zArr[0]) {
            if (this.f41937d == null) {
                this.f41937d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41937d;
            um.c h10 = cVar.h("feedback");
            str = ul0Var.f42580a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41936c == null) {
                this.f41936c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.StoryPinFeedback$StoryPinFeedbackTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f41936c;
            um.c h13 = cVar.h("feedback_types");
            list = ul0Var.f42581b;
            mVar2.e(h13, list);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41935b == null) {
                this.f41935b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41935b;
            um.c h14 = cVar.h("satisfaction");
            num = ul0Var.f42582c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
