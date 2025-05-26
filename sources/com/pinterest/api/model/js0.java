package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class js0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39138a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39139b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39140c;

    public js0(nm.o oVar) {
        this.f39138a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        is0 is0Var = new is0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 740535470) {
                    if (hashCode != 1409792997) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("board_title_slots_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("username_slots_id")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f39138a;
            if (c13 == 0) {
                if (this.f39140c == null) {
                    this.f39140c = a.cb.q(oVar, String.class);
                }
                is0Var.f38856a = (String) this.f39140c.c(aVar);
                boolean[] zArr = is0Var.f38860e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39139b == null) {
                    this.f39139b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TemplateAttribution$TemplateAttributionTypeAdapter$4
                    }).b();
                }
                is0Var.f38859d = (List) this.f39139b.c(aVar);
                boolean[] zArr2 = is0Var.f38860e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f39139b == null) {
                    this.f39139b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TemplateAttribution$TemplateAttributionTypeAdapter$3
                    }).b();
                }
                is0Var.f38858c = (List) this.f39139b.c(aVar);
                boolean[] zArr3 = is0Var.f38860e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39140c == null) {
                    this.f39140c = a.cb.q(oVar, String.class);
                }
                is0Var.f38857b = (String) this.f39140c.c(aVar);
                boolean[] zArr4 = is0Var.f38860e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ls0(is0Var.f38856a, is0Var.f38857b, is0Var.f38858c, is0Var.f38859d, is0Var.f38860e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        String str;
        String str2;
        ls0 ls0Var = (ls0) obj;
        if (ls0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ls0Var.f39878e;
        int length = zArr.length;
        nm.o oVar = this.f39138a;
        if (length > 0 && zArr[0]) {
            if (this.f39140c == null) {
                this.f39140c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39140c;
            um.c h10 = cVar.h("id");
            str2 = ls0Var.f39874a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39140c == null) {
                this.f39140c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39140c;
            um.c h13 = cVar.h("node_id");
            str = ls0Var.f39875b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39139b == null) {
                this.f39139b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TemplateAttribution$TemplateAttributionTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f39139b;
            um.c h14 = cVar.h("board_title_slots_id");
            list2 = ls0Var.f39876c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39139b == null) {
                this.f39139b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.TemplateAttribution$TemplateAttributionTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f39139b;
            um.c h15 = cVar.h("username_slots_id");
            list = ls0Var.f39877d;
            mVar4.e(h15, list);
        }
        cVar.g();
    }
}
