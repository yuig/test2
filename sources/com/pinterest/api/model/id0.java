package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class id0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38746a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38747b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38748c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38749d;

    public id0(nm.o oVar) {
        this.f38746a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hd0 hd0Var = new hd0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1962773286:
                    if (k03.equals("sensitivity_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1768037347:
                    if (k03.equals("detail_page_header_text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1377264343:
                    if (k03.equals("detail_page_non_removal_example_header")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1356282498:
                    if (k03.equals("detail_page_removal_examples")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1170385640:
                    if (k03.equals("secondary_text")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1114218166:
                    if (k03.equals("primary_text")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -573167971:
                    if (k03.equals("element_type")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 106079:
                    if (k03.equals("key")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 206233520:
                    if (k03.equals("detail_page_non_removal_examples")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 949276611:
                    if (k03.equals("detail_page_additional_text")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1710676239:
                    if (k03.equals("open_web_url")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2068476023:
                    if (k03.equals("detail_page_removal_example_header")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38746a;
            switch (c13) {
                case 0:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38400n = (String) this.f38749d.c(aVar);
                    boolean[] zArr = hd0Var.f38401o;
                    if (zArr.length <= 13) {
                        break;
                    } else {
                        zArr[13] = true;
                        break;
                    }
                case 1:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38390d = (String) this.f38749d.c(aVar);
                    boolean[] zArr2 = hd0Var.f38401o;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38391e = (String) this.f38749d.c(aVar);
                    boolean[] zArr3 = hd0Var.f38401o;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f38748c == null) {
                        this.f38748c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportSecondaryReason$ReportSecondaryReasonTypeAdapter$4
                        }).b();
                    }
                    hd0Var.f38394h = (List) this.f38748c.c(aVar);
                    boolean[] zArr4 = hd0Var.f38401o;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38399m = (String) this.f38749d.c(aVar);
                    boolean[] zArr5 = hd0Var.f38401o;
                    if (zArr5.length <= 12) {
                        break;
                    } else {
                        zArr5[12] = true;
                        break;
                    }
                case 5:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38398l = (String) this.f38749d.c(aVar);
                    boolean[] zArr6 = hd0Var.f38401o;
                    if (zArr6.length <= 11) {
                        break;
                    } else {
                        zArr6[11] = true;
                        break;
                    }
                case 6:
                    if (this.f38747b == null) {
                        this.f38747b = a.cb.q(oVar, Integer.class);
                    }
                    hd0Var.f38395i = (Integer) this.f38747b.c(aVar);
                    boolean[] zArr7 = hd0Var.f38401o;
                    if (zArr7.length <= 8) {
                        break;
                    } else {
                        zArr7[8] = true;
                        break;
                    }
                case 7:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38387a = (String) this.f38749d.c(aVar);
                    boolean[] zArr8 = hd0Var.f38401o;
                    if (zArr8.length <= 0) {
                        break;
                    } else {
                        zArr8[0] = true;
                        break;
                    }
                case '\b':
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38396j = (String) this.f38749d.c(aVar);
                    boolean[] zArr9 = hd0Var.f38401o;
                    if (zArr9.length <= 9) {
                        break;
                    } else {
                        zArr9[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f38748c == null) {
                        this.f38748c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportSecondaryReason$ReportSecondaryReasonTypeAdapter$3
                        }).b();
                    }
                    hd0Var.f38392f = (List) this.f38748c.c(aVar);
                    boolean[] zArr10 = hd0Var.f38401o;
                    if (zArr10.length <= 5) {
                        break;
                    } else {
                        zArr10[5] = true;
                        break;
                    }
                case '\n':
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38389c = (String) this.f38749d.c(aVar);
                    boolean[] zArr11 = hd0Var.f38401o;
                    if (zArr11.length <= 2) {
                        break;
                    } else {
                        zArr11[2] = true;
                        break;
                    }
                case 11:
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38397k = (String) this.f38749d.c(aVar);
                    boolean[] zArr12 = hd0Var.f38401o;
                    if (zArr12.length <= 10) {
                        break;
                    } else {
                        zArr12[10] = true;
                        break;
                    }
                case '\f':
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38393g = (String) this.f38749d.c(aVar);
                    boolean[] zArr13 = hd0Var.f38401o;
                    if (zArr13.length <= 6) {
                        break;
                    } else {
                        zArr13[6] = true;
                        break;
                    }
                case '\r':
                    if (this.f38749d == null) {
                        this.f38749d = a.cb.q(oVar, String.class);
                    }
                    hd0Var.f38388b = (String) this.f38749d.c(aVar);
                    boolean[] zArr14 = hd0Var.f38401o;
                    if (zArr14.length <= 1) {
                        break;
                    } else {
                        zArr14[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new kd0(hd0Var.f38387a, hd0Var.f38388b, hd0Var.f38389c, hd0Var.f38390d, hd0Var.f38391e, hd0Var.f38392f, hd0Var.f38393g, hd0Var.f38394h, hd0Var.f38395i, hd0Var.f38396j, hd0Var.f38397k, hd0Var.f38398l, hd0Var.f38399m, hd0Var.f38400n, hd0Var.f38401o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        List list;
        String str6;
        List list2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        kd0 kd0Var = (kd0) obj;
        if (kd0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kd0Var.f39417o;
        int length = zArr.length;
        nm.o oVar = this.f38746a;
        if (length > 0 && zArr[0]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38749d;
            um.c h10 = cVar.h("id");
            str11 = kd0Var.f39403a;
            mVar.e(h10, str11);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38749d;
            um.c h13 = cVar.h("node_id");
            str10 = kd0Var.f39404b;
            mVar2.e(h13, str10);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38749d;
            um.c h14 = cVar.h("detail_page_additional_text");
            str9 = kd0Var.f39405c;
            mVar3.e(h14, str9);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38749d;
            um.c h15 = cVar.h("detail_page_header_text");
            str8 = kd0Var.f39406d;
            mVar4.e(h15, str8);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38749d;
            um.c h16 = cVar.h("detail_page_non_removal_example_header");
            str7 = kd0Var.f39407e;
            mVar5.e(h16, str7);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38748c == null) {
                this.f38748c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportSecondaryReason$ReportSecondaryReasonTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f38748c;
            um.c h17 = cVar.h("detail_page_non_removal_examples");
            list2 = kd0Var.f39408f;
            mVar6.e(h17, list2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f38749d;
            um.c h18 = cVar.h("detail_page_removal_example_header");
            str6 = kd0Var.f39409g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38748c == null) {
                this.f38748c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportSecondaryReason$ReportSecondaryReasonTypeAdapter$2
                }).b();
            }
            nm.m mVar8 = this.f38748c;
            um.c h19 = cVar.h("detail_page_removal_examples");
            list = kd0Var.f39410h;
            mVar8.e(h19, list);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38747b == null) {
                this.f38747b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f38747b;
            um.c h23 = cVar.h("element_type");
            num = kd0Var.f39411i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f38749d;
            um.c h24 = cVar.h("key");
            str5 = kd0Var.f39412j;
            mVar10.e(h24, str5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f38749d;
            um.c h25 = cVar.h("open_web_url");
            str4 = kd0Var.f39413k;
            mVar11.e(h25, str4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f38749d;
            um.c h26 = cVar.h("primary_text");
            str3 = kd0Var.f39414l;
            mVar12.e(h26, str3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f38749d;
            um.c h27 = cVar.h("secondary_text");
            str2 = kd0Var.f39415m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f38749d == null) {
                this.f38749d = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f38749d;
            um.c h28 = cVar.h("sensitivity_type");
            str = kd0Var.f39416n;
            mVar14.e(h28, str);
        }
        cVar.g();
    }
}
