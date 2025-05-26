package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class mc0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40057a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40058b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40059c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40060d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40061e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40062f;

    public mc0(nm.o oVar) {
        this.f40057a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lc0 lc0Var = new lc0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1692378387:
                    if (k03.equals("through_properties")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (k03.equals("reason")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -669415178:
                    if (k03.equals("reason_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 570402602:
                    if (k03.equals("interest")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40057a;
            if (c13 == 0) {
                if (this.f40060d == null) {
                    this.f40060d = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.RecommendationReason$RecommendationReasonTypeAdapter$2
                    }).b();
                }
                lc0Var.f39709f = (Map) this.f40060d.c(aVar);
                boolean[] zArr = lc0Var.f39710g;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
            } else if (c13 == 1) {
                if (this.f40062f == null) {
                    this.f40062f = a.cb.q(oVar, String.class);
                }
                lc0Var.f39707d = (String) this.f40062f.c(aVar);
                boolean[] zArr2 = lc0Var.f39710g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f40062f == null) {
                    this.f40062f = a.cb.q(oVar, String.class);
                }
                lc0Var.f39708e = (String) this.f40062f.c(aVar);
                boolean[] zArr3 = lc0Var.f39710g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f40061e == null) {
                    this.f40061e = a.cb.q(oVar, f30.class);
                }
                lc0Var.c((f30) this.f40061e.c(aVar));
            } else if (c13 == 4) {
                if (this.f40058b == null) {
                    this.f40058b = a.cb.q(oVar, v7.class);
                }
                lc0Var.a((v7) this.f40058b.c(aVar));
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f40059c == null) {
                    this.f40059c = a.cb.q(oVar, zs.class);
                }
                lc0Var.b((zs) this.f40059c.c(aVar));
            }
        }
        aVar.g();
        return new oc0(lc0Var.f39704a, lc0Var.f39705b, lc0Var.f39706c, lc0Var.f39707d, lc0Var.f39708e, lc0Var.f39709f, lc0Var.f39710g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        String str;
        String str2;
        f30 f30Var;
        zs zsVar;
        v7 v7Var;
        oc0 oc0Var = (oc0) obj;
        if (oc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = oc0Var.f40679g;
        int length = zArr.length;
        nm.o oVar = this.f40057a;
        if (length > 0 && zArr[0]) {
            if (this.f40058b == null) {
                this.f40058b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar = this.f40058b;
            um.c h10 = cVar.h("board");
            v7Var = oc0Var.f40673a;
            mVar.e(h10, v7Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40059c == null) {
                this.f40059c = a.cb.q(oVar, zs.class);
            }
            nm.m mVar2 = this.f40059c;
            um.c h13 = cVar.h("interest");
            zsVar = oc0Var.f40674b;
            mVar2.e(h13, zsVar);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40061e == null) {
                this.f40061e = a.cb.q(oVar, f30.class);
            }
            nm.m mVar3 = this.f40061e;
            um.c h14 = cVar.h("pin");
            f30Var = oc0Var.f40675c;
            mVar3.e(h14, f30Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40062f == null) {
                this.f40062f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40062f;
            um.c h15 = cVar.h("reason");
            str2 = oc0Var.f40676d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40062f == null) {
                this.f40062f = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40062f;
            um.c h16 = cVar.h("reason_id");
            str = oc0Var.f40677e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40060d == null) {
                this.f40060d = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.RecommendationReason$RecommendationReasonTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f40060d;
            um.c h17 = cVar.h("through_properties");
            map = oc0Var.f40678f;
            mVar6.e(h17, map);
        }
        cVar.g();
    }
}
