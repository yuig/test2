package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class nx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40528a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40529b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40530c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40531d;

    public nx0(nm.o oVar) {
        this.f40528a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mx0 mx0Var = new mx0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1524000241:
                    if (k03.equals("error_state_label")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1329621799:
                    if (k03.equals("applied_filter_options")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1116724143:
                    if (k03.equals("product_filter_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -865991453:
                    if (k03.equals("filter_component_type")) {
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
                case 102727412:
                    if (k03.equals("label")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 842531031:
                    if (k03.equals("filter_options")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            boolean[] zArr = mx0Var.f40257j;
            nm.o oVar = this.f40528a;
            switch (c13) {
                case 0:
                    if (this.f40531d == null) {
                        this.f40531d = a.cb.q(oVar, String.class);
                    }
                    mx0Var.f40251d = (String) this.f40531d.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f40530c == null) {
                        this.f40530c = oVar.g(new TypeToken<List<tx0>>(this) { // from class: com.pinterest.api.model.UnifiedFilterData$UnifiedFilterDataTypeAdapter$3
                        }).b();
                    }
                    mx0Var.b((List) this.f40530c.c(aVar));
                    break;
                case 2:
                    if (this.f40529b == null) {
                        this.f40529b = a.cb.q(oVar, Integer.class);
                    }
                    mx0Var.f40255h = (Integer) this.f40529b.c(aVar);
                    boolean[] zArr2 = mx0Var.f40257j;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 3:
                    if (this.f40529b == null) {
                        this.f40529b = a.cb.q(oVar, Integer.class);
                    }
                    mx0Var.f40252e = (Integer) this.f40529b.c(aVar);
                    boolean[] zArr3 = mx0Var.f40257j;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 4:
                    if (this.f40531d == null) {
                        this.f40531d = a.cb.q(oVar, String.class);
                    }
                    mx0Var.f40248a = (String) this.f40531d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 5:
                    if (this.f40531d == null) {
                        this.f40531d = a.cb.q(oVar, String.class);
                    }
                    mx0Var.f40254g = (String) this.f40531d.c(aVar);
                    boolean[] zArr4 = mx0Var.f40257j;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 6:
                    if (this.f40531d == null) {
                        this.f40531d = a.cb.q(oVar, String.class);
                    }
                    mx0Var.f40256i = (String) this.f40531d.c(aVar);
                    boolean[] zArr5 = mx0Var.f40257j;
                    if (zArr5.length <= 8) {
                        break;
                    } else {
                        zArr5[8] = true;
                        break;
                    }
                case 7:
                    if (this.f40530c == null) {
                        this.f40530c = oVar.g(new TypeToken<List<tx0>>(this) { // from class: com.pinterest.api.model.UnifiedFilterData$UnifiedFilterDataTypeAdapter$4
                        }).b();
                    }
                    mx0Var.c((List) this.f40530c.c(aVar));
                    break;
                case '\b':
                    if (this.f40531d == null) {
                        this.f40531d = a.cb.q(oVar, String.class);
                    }
                    mx0Var.f40249b = (String) this.f40531d.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return mx0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        List list;
        Integer num2;
        String str3;
        List list2;
        String str4;
        String str5;
        px0 px0Var = (px0) obj;
        if (px0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = px0Var.f41141j;
        int length = zArr.length;
        nm.o oVar = this.f40528a;
        if (length > 0 && zArr[0]) {
            if (this.f40531d == null) {
                this.f40531d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40531d;
            um.c h10 = cVar.h("id");
            str5 = px0Var.f41132a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40531d == null) {
                this.f40531d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40531d;
            um.c h13 = cVar.h("node_id");
            str4 = px0Var.f41133b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40530c == null) {
                this.f40530c = oVar.g(new TypeToken<List<tx0>>(this) { // from class: com.pinterest.api.model.UnifiedFilterData$UnifiedFilterDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f40530c;
            um.c h14 = cVar.h("applied_filter_options");
            list2 = px0Var.f41134c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40531d == null) {
                this.f40531d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40531d;
            um.c h15 = cVar.h("error_state_label");
            str3 = px0Var.f41135d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40529b == null) {
                this.f40529b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40529b;
            um.c h16 = cVar.h("filter_component_type");
            num2 = px0Var.f41136e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40530c == null) {
                this.f40530c = oVar.g(new TypeToken<List<tx0>>(this) { // from class: com.pinterest.api.model.UnifiedFilterData$UnifiedFilterDataTypeAdapter$2
                }).b();
            }
            nm.m mVar6 = this.f40530c;
            um.c h17 = cVar.h("filter_options");
            list = px0Var.f41137f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40531d == null) {
                this.f40531d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40531d;
            um.c h18 = cVar.h("label");
            str2 = px0Var.f41138g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40529b == null) {
                this.f40529b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f40529b;
            um.c h19 = cVar.h("product_filter_type");
            num = px0Var.f41139h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40531d == null) {
                this.f40531d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f40531d;
            um.c h23 = cVar.h("title");
            str = px0Var.f41140i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
