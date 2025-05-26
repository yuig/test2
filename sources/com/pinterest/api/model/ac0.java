package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ac0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35695a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35696b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35697c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35698d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f35699e;

    public ac0(nm.o oVar) {
        this.f35695a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zb0 zb0Var = new zb0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1082920240:
                    if (k03.equals("cover_image_urls")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -847398795:
                    if (k03.equals("answers")) {
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
                case 1458614914:
                    if (k03.equals("format_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1965625994:
                    if (k03.equals("question_string")) {
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
            nm.o oVar = this.f35695a;
            if (c13 == 0) {
                if (this.f35698d == null) {
                    this.f35698d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizQuestion$QuizQuestionTypeAdapter$4
                    }).b();
                }
                zb0Var.f44277d = (List) this.f35698d.c(aVar);
                boolean[] zArr = zb0Var.f44280g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f35697c == null) {
                    this.f35697c = oVar.g(new TypeToken<List<ma0>>(this) { // from class: com.pinterest.api.model.QuizQuestion$QuizQuestionTypeAdapter$3
                    }).b();
                }
                zb0Var.f44276c = (List) this.f35697c.c(aVar);
                boolean[] zArr2 = zb0Var.f44280g;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f35699e == null) {
                    this.f35699e = a.cb.q(oVar, String.class);
                }
                zb0Var.f44274a = (String) this.f35699e.c(aVar);
                boolean[] zArr3 = zb0Var.f44280g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f35696b == null) {
                    this.f35696b = a.cb.q(oVar, Integer.class);
                }
                zb0Var.f44278e = (Integer) this.f35696b.c(aVar);
                boolean[] zArr4 = zb0Var.f44280g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f35699e == null) {
                    this.f35699e = a.cb.q(oVar, String.class);
                }
                zb0Var.f44279f = (String) this.f35699e.c(aVar);
                boolean[] zArr5 = zb0Var.f44280g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f35699e == null) {
                    this.f35699e = a.cb.q(oVar, String.class);
                }
                zb0Var.f44275b = (String) this.f35699e.c(aVar);
                boolean[] zArr6 = zb0Var.f44280g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new cc0(zb0Var.f44274a, zb0Var.f44275b, zb0Var.f44276c, zb0Var.f44277d, zb0Var.f44278e, zb0Var.f44279f, zb0Var.f44280g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        List list;
        List list2;
        String str2;
        String str3;
        cc0 cc0Var = (cc0) obj;
        if (cc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cc0Var.f36366g;
        int length = zArr.length;
        nm.o oVar = this.f35695a;
        if (length > 0 && zArr[0]) {
            if (this.f35699e == null) {
                this.f35699e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35699e;
            um.c h10 = cVar.h("id");
            str3 = cc0Var.f36360a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35699e == null) {
                this.f35699e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35699e;
            um.c h13 = cVar.h("node_id");
            str2 = cc0Var.f36361b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35697c == null) {
                this.f35697c = oVar.g(new TypeToken<List<ma0>>(this) { // from class: com.pinterest.api.model.QuizQuestion$QuizQuestionTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f35697c;
            um.c h14 = cVar.h("answers");
            list2 = cc0Var.f36362c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35698d == null) {
                this.f35698d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizQuestion$QuizQuestionTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f35698d;
            um.c h15 = cVar.h("cover_image_urls");
            list = cc0Var.f36363d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35696b == null) {
                this.f35696b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f35696b;
            um.c h16 = cVar.h("format_type");
            num = cc0Var.f36364e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35699e == null) {
                this.f35699e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35699e;
            um.c h17 = cVar.h("question_string");
            str = cc0Var.f36365f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
