package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ca0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36334a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36335b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36336c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36337d;

    public ca0(nm.o oVar) {
        this.f36334a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ba0 ba0Var = new ba0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1249474914) {
                if (hashCode != -1030340122) {
                    if (hashCode == 964289556 && k03.equals("question_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("question_text")) {
                    c13 = 1;
                }
            } else if (k03.equals("options")) {
                c13 = 0;
            }
            nm.o oVar = this.f36334a;
            if (c13 == 0) {
                if (this.f36336c == null) {
                    this.f36336c = oVar.g(new TypeToken<List<s00>>(this) { // from class: com.pinterest.api.model.Questions$QuestionsTypeAdapter$2
                    }).b();
                }
                ba0Var.f36035a = (List) this.f36336c.c(aVar);
                boolean[] zArr = ba0Var.f36038d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f36337d == null) {
                    this.f36337d = a.cb.q(oVar, String.class);
                }
                ba0Var.f36037c = (String) this.f36337d.c(aVar);
                boolean[] zArr2 = ba0Var.f36038d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f36335b == null) {
                    this.f36335b = a.cb.q(oVar, Integer.class);
                }
                ba0Var.f36036b = (Integer) this.f36335b.c(aVar);
                boolean[] zArr3 = ba0Var.f36038d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new ea0(ba0Var.f36035a, ba0Var.f36036b, ba0Var.f36037c, ba0Var.f36038d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        List list;
        ea0 ea0Var = (ea0) obj;
        if (ea0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ea0Var.f37221d;
        int length = zArr.length;
        nm.o oVar = this.f36334a;
        if (length > 0 && zArr[0]) {
            if (this.f36336c == null) {
                this.f36336c = oVar.g(new TypeToken<List<s00>>(this) { // from class: com.pinterest.api.model.Questions$QuestionsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36336c;
            um.c h10 = cVar.h("options");
            list = ea0Var.f37218a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36335b == null) {
                this.f36335b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f36335b;
            um.c h13 = cVar.h("question_id");
            num = ea0Var.f37219b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36337d == null) {
                this.f36337d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36337d;
            um.c h14 = cVar.h("question_text");
            str = ea0Var.f37220c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
