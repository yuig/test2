package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class k50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39293a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39294b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39295c;

    public k50(nm.o oVar) {
        this.f39293a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j50 j50Var = new j50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -925138779) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("rounds")) {
                c13 = 0;
            }
            nm.o oVar = this.f39293a;
            if (c13 == 0) {
                if (this.f39294b == null) {
                    this.f39294b = oVar.g(new TypeToken<List<e50>>(this) { // from class: com.pinterest.api.model.PinOrSpinQuizPath$PinOrSpinQuizPathTypeAdapter$2
                    }).b();
                }
                j50Var.f38984c = (List) this.f39294b.c(aVar);
                boolean[] zArr = j50Var.f38985d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f39295c == null) {
                    this.f39295c = a.cb.q(oVar, String.class);
                }
                j50Var.f38982a = (String) this.f39295c.c(aVar);
                boolean[] zArr2 = j50Var.f38985d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f39295c == null) {
                    this.f39295c = a.cb.q(oVar, String.class);
                }
                j50Var.f38983b = (String) this.f39295c.c(aVar);
                boolean[] zArr3 = j50Var.f38985d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new m50(j50Var.f38982a, j50Var.f38983b, j50Var.f38984c, j50Var.f38985d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        m50 m50Var = (m50) obj;
        if (m50Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m50Var.f40008d;
        int length = zArr.length;
        nm.o oVar = this.f39293a;
        if (length > 0 && zArr[0]) {
            if (this.f39295c == null) {
                this.f39295c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39295c;
            um.c h10 = cVar.h("id");
            str2 = m50Var.f40005a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39295c == null) {
                this.f39295c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39295c;
            um.c h13 = cVar.h("node_id");
            str = m50Var.f40006b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39294b == null) {
                this.f39294b = oVar.g(new TypeToken<List<e50>>(this) { // from class: com.pinterest.api.model.PinOrSpinQuizPath$PinOrSpinQuizPathTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f39294b;
            um.c h14 = cVar.h("rounds");
            list = m50Var.f40007c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
