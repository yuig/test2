package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class eb0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37229a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37230b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37231c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37232d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37233e;

    public eb0(nm.o oVar) {
        this.f37229a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        db0 db0Var = new db0(0);
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
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1184798265:
                    if (k03.equals("share_cta_subtitle")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1082920240:
                    if (k03.equals("cover_image_urls")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -384537387:
                    if (k03.equals("share_option")) {
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 298177568:
                    if (k03.equals("custom_background_color")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 478775356:
                    if (k03.equals("nav_title")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1252696326:
                    if (k03.equals("cover_pins")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1301084037:
                    if (k03.equals("cover_image_urls_dark")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1850964745:
                    if (k03.equals("share_cta_title")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2011608879:
                    if (k03.equals("layout_type")) {
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
            nm.o oVar = this.f37229a;
            switch (c13) {
                case 0:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36714m = (String) this.f37233e.c(aVar);
                    boolean[] zArr = db0Var.f36716o;
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case 1:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36708g = (String) this.f37233e.c(aVar);
                    boolean[] zArr2 = db0Var.f36716o;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36711j = (String) this.f37233e.c(aVar);
                    boolean[] zArr3 = db0Var.f36716o;
                    if (zArr3.length <= 9) {
                        break;
                    } else {
                        zArr3[9] = true;
                        break;
                    }
                case 3:
                    if (this.f37232d == null) {
                        this.f37232d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$4
                        }).b();
                    }
                    db0Var.f36704c = (List) this.f37232d.c(aVar);
                    boolean[] zArr4 = db0Var.f36716o;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f37230b == null) {
                        this.f37230b = a.cb.q(oVar, Integer.class);
                    }
                    db0Var.f36713l = (Integer) this.f37230b.c(aVar);
                    boolean[] zArr5 = db0Var.f36716o;
                    if (zArr5.length <= 11) {
                        break;
                    } else {
                        zArr5[11] = true;
                        break;
                    }
                case 5:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36702a = (String) this.f37233e.c(aVar);
                    boolean[] zArr6 = db0Var.f36716o;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36715n = (String) this.f37233e.c(aVar);
                    boolean[] zArr7 = db0Var.f36716o;
                    if (zArr7.length <= 13) {
                        break;
                    } else {
                        zArr7[13] = true;
                        break;
                    }
                case 7:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36707f = (String) this.f37233e.c(aVar);
                    boolean[] zArr8 = db0Var.f36716o;
                    if (zArr8.length <= 5) {
                        break;
                    } else {
                        zArr8[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36710i = (String) this.f37233e.c(aVar);
                    boolean[] zArr9 = db0Var.f36716o;
                    if (zArr9.length <= 8) {
                        break;
                    } else {
                        zArr9[8] = true;
                        break;
                    }
                case '\t':
                    if (this.f37231c == null) {
                        this.f37231c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$6
                        }).b();
                    }
                    db0Var.f36706e = (List) this.f37231c.c(aVar);
                    boolean[] zArr10 = db0Var.f36716o;
                    if (zArr10.length <= 4) {
                        break;
                    } else {
                        zArr10[4] = true;
                        break;
                    }
                case '\n':
                    if (this.f37232d == null) {
                        this.f37232d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$5
                        }).b();
                    }
                    db0Var.f36705d = (List) this.f37232d.c(aVar);
                    boolean[] zArr11 = db0Var.f36716o;
                    if (zArr11.length <= 3) {
                        break;
                    } else {
                        zArr11[3] = true;
                        break;
                    }
                case 11:
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36712k = (String) this.f37233e.c(aVar);
                    boolean[] zArr12 = db0Var.f36716o;
                    if (zArr12.length <= 10) {
                        break;
                    } else {
                        zArr12[10] = true;
                        break;
                    }
                case '\f':
                    if (this.f37230b == null) {
                        this.f37230b = a.cb.q(oVar, Integer.class);
                    }
                    db0Var.f36709h = (Integer) this.f37230b.c(aVar);
                    boolean[] zArr13 = db0Var.f36716o;
                    if (zArr13.length <= 7) {
                        break;
                    } else {
                        zArr13[7] = true;
                        break;
                    }
                case '\r':
                    if (this.f37233e == null) {
                        this.f37233e = a.cb.q(oVar, String.class);
                    }
                    db0Var.f36703b = (String) this.f37233e.c(aVar);
                    boolean[] zArr14 = db0Var.f36716o;
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
        return new gb0(db0Var.f36702a, db0Var.f36703b, db0Var.f36704c, db0Var.f36705d, db0Var.f36706e, db0Var.f36707f, db0Var.f36708g, db0Var.f36709h, db0Var.f36710i, db0Var.f36711j, db0Var.f36712k, db0Var.f36713l, db0Var.f36714m, db0Var.f36715n, db0Var.f36716o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        Integer num2;
        String str6;
        String str7;
        List list;
        List list2;
        List list3;
        String str8;
        String str9;
        gb0 gb0Var = (gb0) obj;
        if (gb0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gb0Var.f38033o;
        int length = zArr.length;
        nm.o oVar = this.f37229a;
        if (length > 0 && zArr[0]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37233e;
            um.c h10 = cVar.h("id");
            str9 = gb0Var.f38019a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37233e;
            um.c h13 = cVar.h("node_id");
            str8 = gb0Var.f38020b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37232d == null) {
                this.f37232d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f37232d;
            um.c h14 = cVar.h("cover_image_urls");
            list3 = gb0Var.f38021c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37232d == null) {
                this.f37232d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f37232d;
            um.c h15 = cVar.h("cover_image_urls_dark");
            list2 = gb0Var.f38022d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37231c == null) {
                this.f37231c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.QuizOutputHeader$QuizOutputHeaderTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f37231c;
            um.c h16 = cVar.h("cover_pins");
            list = gb0Var.f38023e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37233e;
            um.c h17 = cVar.h("custom_background_color");
            str7 = gb0Var.f38024f;
            mVar6.e(h17, str7);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f37233e;
            um.c h18 = cVar.h("description");
            str6 = gb0Var.f38025g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37230b == null) {
                this.f37230b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f37230b;
            um.c h19 = cVar.h("layout_type");
            num2 = gb0Var.f38026h;
            mVar8.e(h19, num2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37233e;
            um.c h23 = cVar.h("nav_title");
            str5 = gb0Var.f38027i;
            mVar9.e(h23, str5);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f37233e;
            um.c h24 = cVar.h("share_cta_subtitle");
            str4 = gb0Var.f38028j;
            mVar10.e(h24, str4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f37233e;
            um.c h25 = cVar.h("share_cta_title");
            str3 = gb0Var.f38029k;
            mVar11.e(h25, str3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37230b == null) {
                this.f37230b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f37230b;
            um.c h26 = cVar.h("share_option");
            num = gb0Var.f38030l;
            mVar12.e(h26, num);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f37233e;
            um.c h27 = cVar.h("subtitle");
            str2 = gb0Var.f38031m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37233e == null) {
                this.f37233e = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f37233e;
            um.c h28 = cVar.h("title");
            str = gb0Var.f38032n;
            mVar14.e(h28, str);
        }
        cVar.g();
    }
}
