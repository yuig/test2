package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class m7 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40011a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40012b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40013c;

    public m7(nm.o oVar) {
        this.f40011a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        o7 o7Var = new o7(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3076010) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("data")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f40011a;
            if (c13 == 0) {
                if (this.f40013c == null) {
                    this.f40013c = a.cb.q(oVar, String.class);
                }
                o7Var.f40633a = (String) this.f40013c.c(aVar);
                boolean[] zArr = o7Var.f40636d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f40012b == null) {
                    this.f40012b = oVar.g(new TypeToken<List<og>>(this) { // from class: com.pinterest.api.model.BeautyModel$BeautyModelTypeAdapter$2
                    }).b();
                }
                o7Var.f40635c = (List) this.f40012b.c(aVar);
                boolean[] zArr2 = o7Var.f40636d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f40013c == null) {
                    this.f40013c = a.cb.q(oVar, String.class);
                }
                o7Var.f40634b = (String) this.f40013c.c(aVar);
                boolean[] zArr3 = o7Var.f40636d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new p7(o7Var.f40633a, o7Var.f40634b, o7Var.f40635c, o7Var.f40636d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        p7 p7Var = (p7) obj;
        if (p7Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = p7Var.f40898d;
        int length = zArr.length;
        nm.o oVar = this.f40011a;
        if (length > 0 && zArr[0]) {
            if (this.f40013c == null) {
                this.f40013c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40013c;
            um.c h10 = cVar.h("id");
            str2 = p7Var.f40895a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40013c == null) {
                this.f40013c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40013c;
            um.c h13 = cVar.h("node_id");
            str = p7Var.f40896b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40012b == null) {
                this.f40012b = oVar.g(new TypeToken<List<og>>(this) { // from class: com.pinterest.api.model.BeautyModel$BeautyModelTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f40012b;
            um.c h14 = cVar.h("data");
            list = p7Var.f40897c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
