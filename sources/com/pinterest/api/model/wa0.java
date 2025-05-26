package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class wa0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43205a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43206b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43207c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43208d;

    public wa0(nm.o oVar) {
        this.f43205a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        va0 va0Var = new va0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1114727767:
                    if (k03.equals("background_images")) {
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
                case 100029210:
                    if (k03.equals("icons")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 757376421:
                    if (k03.equals("instructions")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1292959499:
                    if (k03.equals("button_title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43205a;
            if (c13 == 0) {
                if (this.f43207c == null) {
                    this.f43207c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$4
                    }).b();
                }
                va0Var.f42804c = (List) this.f43207c.c(aVar);
                boolean[] zArr = va0Var.f42808g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43208d == null) {
                    this.f43208d = a.cb.q(oVar, String.class);
                }
                va0Var.f42802a = (String) this.f43208d.c(aVar);
                boolean[] zArr2 = va0Var.f42808g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43206b == null) {
                    this.f43206b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$5
                    }).b();
                }
                va0Var.f42806e = (List) this.f43206b.c(aVar);
                boolean[] zArr3 = va0Var.f42808g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f43207c == null) {
                    this.f43207c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$6
                    }).b();
                }
                va0Var.f42807f = (List) this.f43207c.c(aVar);
                boolean[] zArr4 = va0Var.f42808g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f43208d == null) {
                    this.f43208d = a.cb.q(oVar, String.class);
                }
                va0Var.f42805d = (String) this.f43208d.c(aVar);
                boolean[] zArr5 = va0Var.f42808g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43208d == null) {
                    this.f43208d = a.cb.q(oVar, String.class);
                }
                va0Var.f42803b = (String) this.f43208d.c(aVar);
                boolean[] zArr6 = va0Var.f42808g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new ya0(va0Var.f42802a, va0Var.f42803b, va0Var.f42804c, va0Var.f42805d, va0Var.f42806e, va0Var.f42807f, va0Var.f42808g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        String str;
        List list3;
        String str2;
        String str3;
        ya0 ya0Var = (ya0) obj;
        if (ya0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ya0Var.f43994g;
        int length = zArr.length;
        nm.o oVar = this.f43205a;
        if (length > 0 && zArr[0]) {
            if (this.f43208d == null) {
                this.f43208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43208d;
            um.c h10 = cVar.h("id");
            str3 = ya0Var.f43988a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43208d == null) {
                this.f43208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43208d;
            um.c h13 = cVar.h("node_id");
            str2 = ya0Var.f43989b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43207c == null) {
                this.f43207c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43207c;
            um.c h14 = cVar.h("background_images");
            list3 = ya0Var.f43990c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43208d == null) {
                this.f43208d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43208d;
            um.c h15 = cVar.h("button_title");
            str = ya0Var.f43991d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43206b == null) {
                this.f43206b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f43206b;
            um.c h16 = cVar.h("icons");
            list2 = ya0Var.f43992e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43207c == null) {
                this.f43207c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizIntroData$QuizIntroDataTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f43207c;
            um.c h17 = cVar.h("instructions");
            list = ya0Var.f43993f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}
