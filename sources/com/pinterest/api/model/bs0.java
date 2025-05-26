package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bs0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36178a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36179b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36180c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36181d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36182e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36183f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f36184g;

    public bs0(nm.o oVar) {
        this.f36178a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        as0 as0Var = new as0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1697435039:
                    if (k03.equals("max_num_answers")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1202638163:
                    if (k03.equals("conditionals")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1109722326:
                    if (k03.equals("layout")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -847398795:
                    if (k03.equals("answers")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -393139297:
                    if (k03.equals("required")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 109770997:
                    if (k03.equals("story")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 380272446:
                    if (k03.equals("end_survey")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1487093327:
                    if (k03.equals("min_num_answers")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2147428667:
                    if (k03.equals("skip_to")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36178a;
            switch (c13) {
                case 0:
                    if (this.f36180c == null) {
                        this.f36180c = a.cb.q(oVar, Double.class);
                    }
                    as0Var.f35846g = (Double) this.f36180c.c(aVar);
                    boolean[] zArr = as0Var.f35852m;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f36182e == null) {
                        this.f36182e = oVar.g(new TypeToken<List<sr0>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$5
                        }).b();
                    }
                    as0Var.f35842c = (List) this.f36182e.c(aVar);
                    boolean[] zArr2 = as0Var.f35852m;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f36184g == null) {
                        this.f36184g = a.cb.q(oVar, String.class);
                    }
                    as0Var.f35845f = (String) this.f36184g.c(aVar);
                    boolean[] zArr3 = as0Var.f35852m;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f36181d == null) {
                        this.f36181d = oVar.g(new TypeToken<List<jr0>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$4
                        }).b();
                    }
                    as0Var.f35840a = (List) this.f36181d.c(aVar);
                    boolean[] zArr4 = as0Var.f35852m;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f36179b == null) {
                        this.f36179b = a.cb.q(oVar, Boolean.class);
                    }
                    as0Var.f35848i = (Boolean) this.f36179b.c(aVar);
                    boolean[] zArr5 = as0Var.f35852m;
                    if (zArr5.length <= 8) {
                        break;
                    } else {
                        zArr5[8] = true;
                        break;
                    }
                case 5:
                    if (this.f36184g == null) {
                        this.f36184g = a.cb.q(oVar, String.class);
                    }
                    as0Var.f35844e = (String) this.f36184g.c(aVar);
                    boolean[] zArr6 = as0Var.f35852m;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f36184g == null) {
                        this.f36184g = a.cb.q(oVar, String.class);
                    }
                    as0Var.f35851l = (String) this.f36184g.c(aVar);
                    boolean[] zArr7 = as0Var.f35852m;
                    if (zArr7.length <= 11) {
                        break;
                    } else {
                        zArr7[11] = true;
                        break;
                    }
                case 7:
                    if (this.f36183f == null) {
                        this.f36183f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$6
                        }).b();
                    }
                    as0Var.f35850k = (Map) this.f36183f.c(aVar);
                    boolean[] zArr8 = as0Var.f35852m;
                    if (zArr8.length <= 10) {
                        break;
                    } else {
                        zArr8[10] = true;
                        break;
                    }
                case '\b':
                    if (this.f36179b == null) {
                        this.f36179b = a.cb.q(oVar, Boolean.class);
                    }
                    as0Var.f35843d = (Boolean) this.f36179b.c(aVar);
                    boolean[] zArr9 = as0Var.f35852m;
                    if (zArr9.length <= 3) {
                        break;
                    } else {
                        zArr9[3] = true;
                        break;
                    }
                case '\t':
                    if (this.f36180c == null) {
                        this.f36180c = a.cb.q(oVar, Double.class);
                    }
                    as0Var.f35847h = (Double) this.f36180c.c(aVar);
                    boolean[] zArr10 = as0Var.f35852m;
                    if (zArr10.length <= 7) {
                        break;
                    } else {
                        zArr10[7] = true;
                        break;
                    }
                case '\n':
                    if (this.f36184g == null) {
                        this.f36184g = a.cb.q(oVar, String.class);
                    }
                    as0Var.f35841b = (String) this.f36184g.c(aVar);
                    boolean[] zArr11 = as0Var.f35852m;
                    if (zArr11.length <= 1) {
                        break;
                    } else {
                        zArr11[1] = true;
                        break;
                    }
                case 11:
                    if (this.f36184g == null) {
                        this.f36184g = a.cb.q(oVar, String.class);
                    }
                    as0Var.f35849j = (String) this.f36184g.c(aVar);
                    boolean[] zArr12 = as0Var.f35852m;
                    if (zArr12.length <= 9) {
                        break;
                    } else {
                        zArr12[9] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ds0(as0Var.f35840a, as0Var.f35841b, as0Var.f35842c, as0Var.f35843d, as0Var.f35844e, as0Var.f35845f, as0Var.f35846g, as0Var.f35847h, as0Var.f35848i, as0Var.f35849j, as0Var.f35850k, as0Var.f35851l, as0Var.f35852m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        String str2;
        Boolean bool;
        Double d2;
        Double d13;
        String str3;
        String str4;
        Boolean bool2;
        List list;
        String str5;
        List list2;
        ds0 ds0Var = (ds0) obj;
        if (ds0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ds0Var.f36949m;
        int length = zArr.length;
        nm.o oVar = this.f36178a;
        if (length > 0 && zArr[0]) {
            if (this.f36181d == null) {
                this.f36181d = oVar.g(new TypeToken<List<jr0>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36181d;
            um.c h10 = cVar.h("answers");
            list2 = ds0Var.f36937a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36184g == null) {
                this.f36184g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36184g;
            um.c h13 = cVar.h("background_color");
            str5 = ds0Var.f36938b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36182e == null) {
                this.f36182e = oVar.g(new TypeToken<List<sr0>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$2
                }).b();
            }
            nm.m mVar3 = this.f36182e;
            um.c h14 = cVar.h("conditionals");
            list = ds0Var.f36939c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36179b == null) {
                this.f36179b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f36179b;
            um.c h15 = cVar.h("end_survey");
            bool2 = ds0Var.f36940d;
            mVar4.e(h15, bool2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36184g == null) {
                this.f36184g = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36184g;
            um.c h16 = cVar.h("id");
            str4 = ds0Var.f36941e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36184g == null) {
                this.f36184g = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36184g;
            um.c h17 = cVar.h("layout");
            str3 = ds0Var.f36942f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36180c == null) {
                this.f36180c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar7 = this.f36180c;
            um.c h18 = cVar.h("max_num_answers");
            d13 = ds0Var.f36943g;
            mVar7.e(h18, d13);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36180c == null) {
                this.f36180c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar8 = this.f36180c;
            um.c h19 = cVar.h("min_num_answers");
            d2 = ds0Var.f36944h;
            mVar8.e(h19, d2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36179b == null) {
                this.f36179b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f36179b;
            um.c h23 = cVar.h("required");
            bool = ds0Var.f36945i;
            mVar9.e(h23, bool);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36184g == null) {
                this.f36184g = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f36184g;
            um.c h24 = cVar.h("skip_to");
            str2 = ds0Var.f36946j;
            mVar10.e(h24, str2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36183f == null) {
                this.f36183f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.SurveyQuestion$SurveyQuestionTypeAdapter$3
                }).b();
            }
            nm.m mVar11 = this.f36183f;
            um.c h25 = cVar.h("story");
            map = ds0Var.f36947k;
            mVar11.e(h25, map);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36184g == null) {
                this.f36184g = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f36184g;
            um.c h26 = cVar.h("text");
            str = ds0Var.f36948l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
