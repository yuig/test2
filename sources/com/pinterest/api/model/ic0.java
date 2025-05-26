package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ic0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38733a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38734b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38735c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38736d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38737e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38738f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38739g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38740h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f38741i;

    public ic0(nm.o oVar) {
        this.f38733a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hc0 hc0Var = new hc0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1851751537:
                    if (k03.equals("cook_times")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1525552786:
                    if (k03.equals("categorized_ingredients")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -881947619:
                    if (k03.equals("aggregate_rating")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -118443838:
                    if (k03.equals("additional_data")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 95580927:
                    if (k03.equals("diets")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1340379791:
                    if (k03.equals("from_aggregated_data")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1904390478:
                    if (k03.equals("servings_summary")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38733a;
            switch (c13) {
                case 0:
                    if (this.f38737e == null) {
                        this.f38737e = a.cb.q(oVar, kf.class);
                    }
                    hc0Var.f38374f = (kf) this.f38737e.c(aVar);
                    boolean[] zArr = hc0Var.f38379k;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f38738f == null) {
                        this.f38738f = oVar.g(new TypeToken<List<kc>>(this) { // from class: com.pinterest.api.model.RecipeRichData$RecipeRichDataTypeAdapter$3
                        }).b();
                    }
                    hc0Var.f38373e = (List) this.f38738f.c(aVar);
                    boolean[] zArr2 = hc0Var.f38379k;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f38735c == null) {
                        this.f38735c = a.cb.q(oVar, v2.class);
                    }
                    hc0Var.f38372d = (v2) this.f38735c.c(aVar);
                    boolean[] zArr3 = hc0Var.f38379k;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f38734b == null) {
                        this.f38734b = a.cb.q(oVar, p0.class);
                    }
                    hc0Var.f38371c = (p0) this.f38734b.c(aVar);
                    boolean[] zArr4 = hc0Var.f38379k;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f38741i == null) {
                        this.f38741i = a.cb.q(oVar, String.class);
                    }
                    hc0Var.f38369a = (String) this.f38741i.c(aVar);
                    boolean[] zArr5 = hc0Var.f38379k;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f38741i == null) {
                        this.f38741i = a.cb.q(oVar, String.class);
                    }
                    hc0Var.f38377i = (String) this.f38741i.c(aVar);
                    boolean[] zArr6 = hc0Var.f38379k;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case 6:
                    if (this.f38739g == null) {
                        this.f38739g = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.RecipeRichData$RecipeRichDataTypeAdapter$4
                        }).b();
                    }
                    hc0Var.f38375g = (List) this.f38739g.c(aVar);
                    boolean[] zArr7 = hc0Var.f38379k;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f38736d == null) {
                        this.f38736d = a.cb.q(oVar, Boolean.class);
                    }
                    hc0Var.f38376h = (Boolean) this.f38736d.c(aVar);
                    boolean[] zArr8 = hc0Var.f38379k;
                    if (zArr8.length <= 7) {
                        break;
                    } else {
                        zArr8[7] = true;
                        break;
                    }
                case '\b':
                    if (this.f38740h == null) {
                        this.f38740h = a.cb.q(oVar, th0.class);
                    }
                    hc0Var.f38378j = (th0) this.f38740h.c(aVar);
                    boolean[] zArr9 = hc0Var.f38379k;
                    if (zArr9.length <= 9) {
                        break;
                    } else {
                        zArr9[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f38741i == null) {
                        this.f38741i = a.cb.q(oVar, String.class);
                    }
                    hc0Var.f38370b = (String) this.f38741i.c(aVar);
                    boolean[] zArr10 = hc0Var.f38379k;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new kc0(hc0Var.f38369a, hc0Var.f38370b, hc0Var.f38371c, hc0Var.f38372d, hc0Var.f38373e, hc0Var.f38374f, hc0Var.f38375g, hc0Var.f38376h, hc0Var.f38377i, hc0Var.f38378j, hc0Var.f38379k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        th0 th0Var;
        String str;
        Boolean bool;
        List list;
        kf kfVar;
        List list2;
        v2 v2Var;
        p0 p0Var;
        String str2;
        String str3;
        kc0 kc0Var = (kc0) obj;
        if (kc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kc0Var.f39395k;
        int length = zArr.length;
        nm.o oVar = this.f38733a;
        if (length > 0 && zArr[0]) {
            if (this.f38741i == null) {
                this.f38741i = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38741i;
            um.c h10 = cVar.h("id");
            str3 = kc0Var.f39385a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38741i == null) {
                this.f38741i = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38741i;
            um.c h13 = cVar.h("node_id");
            str2 = kc0Var.f39386b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38734b == null) {
                this.f38734b = a.cb.q(oVar, p0.class);
            }
            nm.m mVar3 = this.f38734b;
            um.c h14 = cVar.h("additional_data");
            p0Var = kc0Var.f39387c;
            mVar3.e(h14, p0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38735c == null) {
                this.f38735c = a.cb.q(oVar, v2.class);
            }
            nm.m mVar4 = this.f38735c;
            um.c h15 = cVar.h("aggregate_rating");
            v2Var = kc0Var.f39388d;
            mVar4.e(h15, v2Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38738f == null) {
                this.f38738f = oVar.g(new TypeToken<List<kc>>(this) { // from class: com.pinterest.api.model.RecipeRichData$RecipeRichDataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f38738f;
            um.c h16 = cVar.h("categorized_ingredients");
            list2 = kc0Var.f39389e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38737e == null) {
                this.f38737e = a.cb.q(oVar, kf.class);
            }
            nm.m mVar6 = this.f38737e;
            um.c h17 = cVar.h("cook_times");
            kfVar = kc0Var.f39390f;
            mVar6.e(h17, kfVar);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38739g == null) {
                this.f38739g = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.RecipeRichData$RecipeRichDataTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f38739g;
            um.c h18 = cVar.h("diets");
            list = kc0Var.f39391g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38736d == null) {
                this.f38736d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f38736d;
            um.c h19 = cVar.h("from_aggregated_data");
            bool = kc0Var.f39392h;
            mVar8.e(h19, bool);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38741i == null) {
                this.f38741i = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f38741i;
            um.c h23 = cVar.h("name");
            str = kc0Var.f39393i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38740h == null) {
                this.f38740h = a.cb.q(oVar, th0.class);
            }
            nm.m mVar10 = this.f38740h;
            um.c h24 = cVar.h("servings_summary");
            th0Var = kc0Var.f39394j;
            mVar10.e(h24, th0Var);
        }
        cVar.g();
    }
}
