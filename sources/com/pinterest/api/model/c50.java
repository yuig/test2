package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class c50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36293a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36294b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36295c;

    public c50(nm.o oVar) {
        this.f36293a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        b50 b50Var = new b50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1249474914) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("options")) {
                c13 = 0;
            }
            nm.o oVar = this.f36293a;
            if (c13 == 0) {
                if (this.f36294b == null) {
                    this.f36294b = oVar.g(new TypeToken<List<i50>>(this) { // from class: com.pinterest.api.model.PinOrSpinDecisionPool$PinOrSpinDecisionPoolTypeAdapter$2
                    }).b();
                }
                b50Var.f35977c = (List) this.f36294b.c(aVar);
                boolean[] zArr = b50Var.f35978d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f36295c == null) {
                    this.f36295c = a.cb.q(oVar, String.class);
                }
                b50Var.f35975a = (String) this.f36295c.c(aVar);
                boolean[] zArr2 = b50Var.f35978d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f36295c == null) {
                    this.f36295c = a.cb.q(oVar, String.class);
                }
                b50Var.f35976b = (String) this.f36295c.c(aVar);
                boolean[] zArr3 = b50Var.f35978d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new e50(b50Var.f35975a, b50Var.f35976b, b50Var.f35977c, b50Var.f35978d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        e50 e50Var = (e50) obj;
        if (e50Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e50Var.f37185d;
        int length = zArr.length;
        nm.o oVar = this.f36293a;
        if (length > 0 && zArr[0]) {
            if (this.f36295c == null) {
                this.f36295c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36295c;
            um.c h10 = cVar.h("id");
            str2 = e50Var.f37182a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36295c == null) {
                this.f36295c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36295c;
            um.c h13 = cVar.h("node_id");
            str = e50Var.f37183b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36294b == null) {
                this.f36294b = oVar.g(new TypeToken<List<i50>>(this) { // from class: com.pinterest.api.model.PinOrSpinDecisionPool$PinOrSpinDecisionPoolTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f36294b;
            um.c h14 = cVar.h("options");
            list = e50Var.f37184c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
