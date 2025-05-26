package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ka0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39369a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39370b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39371c;

    public ka0(nm.o oVar) {
        this.f39369a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ja0 ja0Var = new ja0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1082920240) {
                if (hashCode != 3355) {
                    if (hashCode != 1281723314) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("answer_string")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("cover_image_urls")) {
                c13 = 0;
            }
            nm.o oVar = this.f39369a;
            if (c13 == 0) {
                if (this.f39370b == null) {
                    this.f39370b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizAnswer$QuizAnswerTypeAdapter$2
                    }).b();
                }
                ja0Var.f39021d = (List) this.f39370b.c(aVar);
                boolean[] zArr = ja0Var.f39022e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f39371c == null) {
                    this.f39371c = a.cb.q(oVar, String.class);
                }
                ja0Var.f39018a = (String) this.f39371c.c(aVar);
                boolean[] zArr2 = ja0Var.f39022e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f39371c == null) {
                    this.f39371c = a.cb.q(oVar, String.class);
                }
                ja0Var.f39020c = (String) this.f39371c.c(aVar);
                boolean[] zArr3 = ja0Var.f39022e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39371c == null) {
                    this.f39371c = a.cb.q(oVar, String.class);
                }
                ja0Var.f39019b = (String) this.f39371c.c(aVar);
                boolean[] zArr4 = ja0Var.f39022e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new ma0(ja0Var.f39018a, ja0Var.f39019b, ja0Var.f39020c, ja0Var.f39021d, ja0Var.f39022e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        String str3;
        ma0 ma0Var = (ma0) obj;
        if (ma0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ma0Var.f40047e;
        int length = zArr.length;
        nm.o oVar = this.f39369a;
        if (length > 0 && zArr[0]) {
            if (this.f39371c == null) {
                this.f39371c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39371c;
            um.c h10 = cVar.h("id");
            str3 = ma0Var.f40043a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39371c == null) {
                this.f39371c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39371c;
            um.c h13 = cVar.h("node_id");
            str2 = ma0Var.f40044b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39371c == null) {
                this.f39371c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39371c;
            um.c h14 = cVar.h("answer_string");
            str = ma0Var.f40045c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39370b == null) {
                this.f39370b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.QuizAnswer$QuizAnswerTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f39370b;
            um.c h15 = cVar.h("cover_image_urls");
            list = ma0Var.f40046d;
            mVar4.e(h15, list);
        }
        cVar.g();
    }
}
