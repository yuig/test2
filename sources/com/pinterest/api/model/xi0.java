package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class xi0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43704a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43705b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43706c;

    public xi0(nm.o oVar) {
        this.f43704a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wi0 wi0Var = new wi0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1110417409) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("labels")) {
                c13 = 0;
            }
            nm.o oVar = this.f43704a;
            if (c13 == 0) {
                if (this.f43705b == null) {
                    this.f43705b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ShuffleItemTemplateConfig$ShuffleItemTemplateConfigTypeAdapter$2
                    }).b();
                }
                wi0Var.f43261c = (List) this.f43705b.c(aVar);
                boolean[] zArr = wi0Var.f43262d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43706c == null) {
                    this.f43706c = a.cb.q(oVar, String.class);
                }
                wi0Var.f43259a = (String) this.f43706c.c(aVar);
                boolean[] zArr2 = wi0Var.f43262d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f43706c == null) {
                    this.f43706c = a.cb.q(oVar, String.class);
                }
                wi0Var.f43260b = (String) this.f43706c.c(aVar);
                boolean[] zArr3 = wi0Var.f43262d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new zi0(wi0Var.f43259a, wi0Var.f43260b, wi0Var.f43261c, wi0Var.f43262d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        zi0 zi0Var = (zi0) obj;
        if (zi0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zi0Var.f44340d;
        int length = zArr.length;
        nm.o oVar = this.f43704a;
        if (length > 0 && zArr[0]) {
            if (this.f43706c == null) {
                this.f43706c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43706c;
            um.c h10 = cVar.h("id");
            str2 = zi0Var.f44337a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43706c == null) {
                this.f43706c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43706c;
            um.c h13 = cVar.h("node_id");
            str = zi0Var.f44338b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43705b == null) {
                this.f43705b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ShuffleItemTemplateConfig$ShuffleItemTemplateConfigTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43705b;
            um.c h14 = cVar.h("labels");
            list = zi0Var.f44339c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
