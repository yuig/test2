package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class hg extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38430a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38431b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38432c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38433d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38434e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38435f;

    public hg(nm.o oVar) {
        this.f38430a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gg ggVar = new gg(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2060497896:
                    if (k03.equals("subtitle")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
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
                case 1495486486:
                    if (k03.equals("user_recommendation_reason")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38430a;
            switch (c13) {
                case 0:
                    if (this.f38433d == null) {
                        this.f38433d = a.cb.q(oVar, String.class);
                    }
                    ggVar.f38063e = (String) this.f38433d.c(aVar);
                    boolean[] zArr = ggVar.f38067i;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f38433d == null) {
                        this.f38433d = a.cb.q(oVar, String.class);
                    }
                    ggVar.f38059a = (String) this.f38433d.c(aVar);
                    boolean[] zArr2 = ggVar.f38067i;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f38432c == null) {
                        this.f38432c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.CreatorRecommendationItem$CreatorRecommendationItemTypeAdapter$2
                        }).b();
                    }
                    ggVar.f38062d = (List) this.f38432c.c(aVar);
                    boolean[] zArr3 = ggVar.f38067i;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f38434e == null) {
                        this.f38434e = a.cb.q(oVar, wy0.class);
                    }
                    ggVar.f38065g = (wy0) this.f38434e.c(aVar);
                    boolean[] zArr4 = ggVar.f38067i;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f38433d == null) {
                        this.f38433d = a.cb.q(oVar, String.class);
                    }
                    ggVar.f38064f = (String) this.f38433d.c(aVar);
                    boolean[] zArr5 = ggVar.f38067i;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f38431b == null) {
                        this.f38431b = a.cb.q(oVar, zs.class);
                    }
                    ggVar.f38061c = (zs) this.f38431b.c(aVar);
                    boolean[] zArr6 = ggVar.f38067i;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f38435f == null) {
                        this.f38435f = a.cb.q(oVar, kz0.class);
                    }
                    ggVar.f38066h = (kz0) this.f38435f.c(aVar);
                    boolean[] zArr7 = ggVar.f38067i;
                    if (zArr7.length <= 7) {
                        break;
                    } else {
                        zArr7[7] = true;
                        break;
                    }
                case 7:
                    if (this.f38433d == null) {
                        this.f38433d = a.cb.q(oVar, String.class);
                    }
                    ggVar.f38060b = (String) this.f38433d.c(aVar);
                    boolean[] zArr8 = ggVar.f38067i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new jg(ggVar.f38059a, ggVar.f38060b, ggVar.f38061c, ggVar.f38062d, ggVar.f38063e, ggVar.f38064f, ggVar.f38065g, ggVar.f38066h, ggVar.f38067i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        kz0 kz0Var;
        wy0 wy0Var;
        String str;
        String str2;
        List list;
        zs zsVar;
        String str3;
        String str4;
        jg jgVar = (jg) obj;
        if (jgVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jgVar.f39039i;
        int length = zArr.length;
        nm.o oVar = this.f38430a;
        if (length > 0 && zArr[0]) {
            if (this.f38433d == null) {
                this.f38433d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38433d;
            um.c h10 = cVar.h("id");
            str4 = jgVar.f39031a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38433d == null) {
                this.f38433d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38433d;
            um.c h13 = cVar.h("node_id");
            str3 = jgVar.f39032b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38431b == null) {
                this.f38431b = a.cb.q(oVar, zs.class);
            }
            nm.m mVar3 = this.f38431b;
            um.c h14 = cVar.h("interest");
            zsVar = jgVar.f39033c;
            mVar3.e(h14, zsVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38432c == null) {
                this.f38432c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.CreatorRecommendationItem$CreatorRecommendationItemTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f38432c;
            um.c h15 = cVar.h("pins");
            list = jgVar.f39034d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38433d == null) {
                this.f38433d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38433d;
            um.c h16 = cVar.h("subtitle");
            str2 = jgVar.f39035e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38433d == null) {
                this.f38433d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38433d;
            um.c h17 = cVar.h("title");
            str = jgVar.f39036f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38434e == null) {
                this.f38434e = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar7 = this.f38434e;
            um.c h18 = cVar.h("user");
            wy0Var = jgVar.f39037g;
            mVar7.e(h18, wy0Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38435f == null) {
                this.f38435f = a.cb.q(oVar, kz0.class);
            }
            nm.m mVar8 = this.f38435f;
            um.c h19 = cVar.h("user_recommendation_reason");
            kz0Var = jgVar.f39038h;
            mVar8.e(h19, kz0Var);
        }
        cVar.g();
    }
}
