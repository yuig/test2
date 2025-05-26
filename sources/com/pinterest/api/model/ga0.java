package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ga0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38009a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38010b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38011c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38012d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38013e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38014f;

    public ga0(nm.o oVar) {
        this.f38009a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        fa0 fa0Var = new fa0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1782234803:
                    if (k03.equals("questions")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1535092497:
                    if (k03.equals("dimensional_output")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 414334925:
                    if (k03.equals("dimensions")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1256809885:
                    if (k03.equals("intro_data")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
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
            nm.o oVar = this.f38009a;
            switch (c13) {
                case 0:
                    if (this.f38011c == null) {
                        this.f38011c = oVar.g(new TypeToken<List<cc0>>(this) { // from class: com.pinterest.api.model.Quiz$QuizTypeAdapter$4
                        }).b();
                    }
                    fa0Var.f37638g = (List) this.f38011c.c(aVar);
                    boolean[] zArr = fa0Var.f37640i;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f38013e == null) {
                        this.f38013e = a.cb.q(oVar, cb0.class);
                    }
                    fa0Var.f37635d = (cb0) this.f38013e.c(aVar);
                    boolean[] zArr2 = fa0Var.f37640i;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f38014f == null) {
                        this.f38014f = a.cb.q(oVar, String.class);
                    }
                    fa0Var.f37632a = (String) this.f38014f.c(aVar);
                    boolean[] zArr3 = fa0Var.f37640i;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f38014f == null) {
                        this.f38014f = a.cb.q(oVar, String.class);
                    }
                    fa0Var.f37639h = (String) this.f38014f.c(aVar);
                    boolean[] zArr4 = fa0Var.f37640i;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f38010b == null) {
                        this.f38010b = oVar.g(new TypeToken<List<qa0>>(this) { // from class: com.pinterest.api.model.Quiz$QuizTypeAdapter$3
                        }).b();
                    }
                    fa0Var.f37636e = (List) this.f38010b.c(aVar);
                    boolean[] zArr5 = fa0Var.f37640i;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f38012d == null) {
                        this.f38012d = a.cb.q(oVar, ya0.class);
                    }
                    fa0Var.f37637f = (ya0) this.f38012d.c(aVar);
                    boolean[] zArr6 = fa0Var.f37640i;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f38014f == null) {
                        this.f38014f = a.cb.q(oVar, String.class);
                    }
                    fa0Var.f37634c = (String) this.f38014f.c(aVar);
                    boolean[] zArr7 = fa0Var.f37640i;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                case 7:
                    if (this.f38014f == null) {
                        this.f38014f = a.cb.q(oVar, String.class);
                    }
                    fa0Var.f37633b = (String) this.f38014f.c(aVar);
                    boolean[] zArr8 = fa0Var.f37640i;
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
        return new ia0(fa0Var.f37632a, fa0Var.f37633b, fa0Var.f37634c, fa0Var.f37635d, fa0Var.f37636e, fa0Var.f37637f, fa0Var.f37638g, fa0Var.f37639h, fa0Var.f37640i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        ya0 ya0Var;
        List list2;
        cb0 cb0Var;
        String str2;
        String str3;
        String str4;
        ia0 ia0Var = (ia0) obj;
        if (ia0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ia0Var.f38718i;
        int length = zArr.length;
        nm.o oVar = this.f38009a;
        if (length > 0 && zArr[0]) {
            if (this.f38014f == null) {
                this.f38014f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38014f;
            um.c h10 = cVar.h("id");
            str4 = ia0Var.f38710a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38014f == null) {
                this.f38014f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38014f;
            um.c h13 = cVar.h("node_id");
            str3 = ia0Var.f38711b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38014f == null) {
                this.f38014f = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38014f;
            um.c h14 = cVar.h("background_color");
            str2 = ia0Var.f38712c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38013e == null) {
                this.f38013e = a.cb.q(oVar, cb0.class);
            }
            nm.m mVar4 = this.f38013e;
            um.c h15 = cVar.h("dimensional_output");
            cb0Var = ia0Var.f38713d;
            mVar4.e(h15, cb0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38010b == null) {
                this.f38010b = oVar.g(new TypeToken<List<qa0>>(this) { // from class: com.pinterest.api.model.Quiz$QuizTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f38010b;
            um.c h16 = cVar.h("dimensions");
            list2 = ia0Var.f38714e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38012d == null) {
                this.f38012d = a.cb.q(oVar, ya0.class);
            }
            nm.m mVar6 = this.f38012d;
            um.c h17 = cVar.h("intro_data");
            ya0Var = ia0Var.f38715f;
            mVar6.e(h17, ya0Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38011c == null) {
                this.f38011c = oVar.g(new TypeToken<List<cc0>>(this) { // from class: com.pinterest.api.model.Quiz$QuizTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f38011c;
            um.c h18 = cVar.h("questions");
            list = ia0Var.f38716g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38014f == null) {
                this.f38014f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f38014f;
            um.c h19 = cVar.h("title");
            str = ia0Var.f38717h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
