package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class n20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40299a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40300b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40301c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40302d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40303e;

    public n20(nm.o oVar) {
        this.f40299a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        m20 m20Var = new m20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2003565706:
                    if (k03.equals("related_styles")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1984141450:
                    if (k03.equals("vertical")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
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
                case -235369287:
                    if (k03.equals("short_description")) {
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
                case 50511102:
                    if (k03.equals("category")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 107944136:
                    if (k03.equals("query")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
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
            nm.o oVar = this.f40299a;
            switch (c13) {
                case 0:
                    if (this.f40301c == null) {
                        this.f40301c = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.PearStyle$PearStyleTypeAdapter$4
                        }).b();
                    }
                    m20Var.f39983g = (List) this.f40301c.c(aVar);
                    boolean[] zArr = m20Var.f39987k;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f40300b == null) {
                        this.f40300b = a.cb.q(oVar, Integer.class);
                    }
                    m20Var.f39986j = (Integer) this.f40300b.c(aVar);
                    boolean[] zArr2 = m20Var.f39987k;
                    if (zArr2.length <= 9) {
                        break;
                    } else {
                        zArr2[9] = true;
                        break;
                    }
                case 2:
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39981e = (String) this.f40303e.c(aVar);
                    boolean[] zArr3 = m20Var.f39987k;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f40302d == null) {
                        this.f40302d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearStyle$PearStyleTypeAdapter$3
                        }).b();
                    }
                    m20Var.f39980d = (List) this.f40302d.c(aVar);
                    boolean[] zArr4 = m20Var.f39987k;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case 4:
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39984h = (String) this.f40303e.c(aVar);
                    boolean[] zArr5 = m20Var.f39987k;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39977a = (String) this.f40303e.c(aVar);
                    boolean[] zArr6 = m20Var.f39987k;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39979c = (String) this.f40303e.c(aVar);
                    boolean[] zArr7 = m20Var.f39987k;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                case 7:
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39982f = (String) this.f40303e.c(aVar);
                    boolean[] zArr8 = m20Var.f39987k;
                    if (zArr8.length <= 5) {
                        break;
                    } else {
                        zArr8[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39985i = (String) this.f40303e.c(aVar);
                    boolean[] zArr9 = m20Var.f39987k;
                    if (zArr9.length <= 8) {
                        break;
                    } else {
                        zArr9[8] = true;
                        break;
                    }
                case '\t':
                    if (this.f40303e == null) {
                        this.f40303e = a.cb.q(oVar, String.class);
                    }
                    m20Var.f39978b = (String) this.f40303e.c(aVar);
                    boolean[] zArr10 = m20Var.f39987k;
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
        return m20Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        List list2;
        String str5;
        String str6;
        String str7;
        p20 p20Var = (p20) obj;
        if (p20Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = p20Var.f40867k;
        int length = zArr.length;
        nm.o oVar = this.f40299a;
        if (length > 0 && zArr[0]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40303e;
            um.c h10 = cVar.h("id");
            str7 = p20Var.f40857a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40303e;
            um.c h13 = cVar.h("node_id");
            str6 = p20Var.f40858b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40303e;
            um.c h14 = cVar.h("category");
            str5 = p20Var.f40859c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40302d == null) {
                this.f40302d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearStyle$PearStyleTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f40302d;
            um.c h15 = cVar.h("cover_image_urls");
            list2 = p20Var.f40860d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f40303e;
            um.c h16 = cVar.h("description");
            str4 = p20Var.f40861e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40303e;
            um.c h17 = cVar.h("query");
            str3 = p20Var.f40862f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40301c == null) {
                this.f40301c = oVar.g(new TypeToken<List<p20>>(this) { // from class: com.pinterest.api.model.PearStyle$PearStyleTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f40301c;
            um.c h18 = cVar.h("related_styles");
            list = p20Var.f40863g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f40303e;
            um.c h19 = cVar.h("short_description");
            str2 = p20Var.f40864h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40303e == null) {
                this.f40303e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f40303e;
            um.c h23 = cVar.h("title");
            str = p20Var.f40865i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40300b == null) {
                this.f40300b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f40300b;
            um.c h24 = cVar.h("vertical");
            num = p20Var.f40866j;
            mVar10.e(h24, num);
        }
        cVar.g();
    }
}
