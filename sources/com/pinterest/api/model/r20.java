package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class r20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41473a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41474b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41475c;

    public r20(nm.o oVar) {
        this.f41473a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        q20 q20Var = new q20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1826755962:
                    if (k03.equals("cover_image_urls_prefetch")) {
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
                case -1082920240:
                    if (k03.equals("cover_image_urls")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -103846110:
                    if (k03.equals("insight_id")) {
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
                case 107944136:
                    if (k03.equals("query")) {
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
                case 171431108:
                    if (k03.equals("navigation_url")) {
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
            nm.o oVar = this.f41473a;
            switch (c13) {
                case 0:
                    if (this.f41474b == null) {
                        this.f41474b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearTopic$PearTopicTypeAdapter$4
                        }).b();
                    }
                    q20Var.f41189d = (List) this.f41474b.c(aVar);
                    boolean[] zArr = q20Var.f41195j;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41190e = (String) this.f41475c.c(aVar);
                    boolean[] zArr2 = q20Var.f41195j;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f41474b == null) {
                        this.f41474b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearTopic$PearTopicTypeAdapter$3
                        }).b();
                    }
                    q20Var.f41188c = (List) this.f41474b.c(aVar);
                    boolean[] zArr3 = q20Var.f41195j;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41191f = (String) this.f41475c.c(aVar);
                    boolean[] zArr4 = q20Var.f41195j;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41186a = (String) this.f41475c.c(aVar);
                    boolean[] zArr5 = q20Var.f41195j;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41193h = (String) this.f41475c.c(aVar);
                    boolean[] zArr6 = q20Var.f41195j;
                    if (zArr6.length <= 7) {
                        break;
                    } else {
                        zArr6[7] = true;
                        break;
                    }
                case 6:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41194i = (String) this.f41475c.c(aVar);
                    boolean[] zArr7 = q20Var.f41195j;
                    if (zArr7.length <= 8) {
                        break;
                    } else {
                        zArr7[8] = true;
                        break;
                    }
                case 7:
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41192g = (String) this.f41475c.c(aVar);
                    boolean[] zArr8 = q20Var.f41195j;
                    if (zArr8.length <= 6) {
                        break;
                    } else {
                        zArr8[6] = true;
                        break;
                    }
                case '\b':
                    if (this.f41475c == null) {
                        this.f41475c = a.cb.q(oVar, String.class);
                    }
                    q20Var.f41187b = (String) this.f41475c.c(aVar);
                    boolean[] zArr9 = q20Var.f41195j;
                    if (zArr9.length <= 1) {
                        break;
                    } else {
                        zArr9[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new t20(q20Var.f41186a, q20Var.f41187b, q20Var.f41188c, q20Var.f41189d, q20Var.f41190e, q20Var.f41191f, q20Var.f41192g, q20Var.f41193h, q20Var.f41194i, q20Var.f41195j, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        List list;
        List list2;
        String str6;
        String str7;
        t20 t20Var = (t20) obj;
        if (t20Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = t20Var.f42059j;
        int length = zArr.length;
        nm.o oVar = this.f41473a;
        if (length > 0 && zArr[0]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41475c;
            um.c h10 = cVar.h("id");
            str7 = t20Var.f42050a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41475c;
            um.c h13 = cVar.h("node_id");
            str6 = t20Var.f42051b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41474b == null) {
                this.f41474b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearTopic$PearTopicTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41474b;
            um.c h14 = cVar.h("cover_image_urls");
            list2 = t20Var.f42052c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41474b == null) {
                this.f41474b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearTopic$PearTopicTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f41474b;
            um.c h15 = cVar.h("cover_image_urls_prefetch");
            list = t20Var.f42053d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41475c;
            um.c h16 = cVar.h("description");
            str5 = t20Var.f42054e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41475c;
            um.c h17 = cVar.h("insight_id");
            str4 = t20Var.f42055f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41475c;
            um.c h18 = cVar.h("navigation_url");
            str3 = t20Var.f42056g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f41475c;
            um.c h19 = cVar.h("query");
            str2 = t20Var.f42057h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41475c == null) {
                this.f41475c = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f41475c;
            um.c h23 = cVar.h("title");
            str = t20Var.f42058i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
