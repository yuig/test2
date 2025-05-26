package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class t90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42137a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42138b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42139c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42140d;

    public t90(nm.o oVar) {
        this.f42137a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        s90 s90Var = new s90(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1883301541:
                    if (k03.equals("question_label")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1030321165:
                    if (k03.equals("question_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 1043726680:
                    if (k03.equals("question_field_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1437147973:
                    if (k03.equals("question_options")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42137a;
            if (c13 == 0) {
                if (this.f42140d == null) {
                    this.f42140d = a.cb.q(oVar, String.class);
                }
                s90Var.f41833b = (String) this.f42140d.c(aVar);
                boolean[] zArr = s90Var.f41836e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f42138b == null) {
                    this.f42138b = a.cb.q(oVar, Integer.class);
                }
                s90Var.f41835d = (Integer) this.f42138b.c(aVar);
                boolean[] zArr2 = s90Var.f41836e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f42138b == null) {
                    this.f42138b = a.cb.q(oVar, Integer.class);
                }
                s90Var.f41832a = (Integer) this.f42138b.c(aVar);
                boolean[] zArr3 = s90Var.f41836e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42139c == null) {
                    this.f42139c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PromotedLeadFormQuestion$PromotedLeadFormQuestionTypeAdapter$2
                    }).b();
                }
                s90Var.f41834c = (List) this.f42139c.c(aVar);
                boolean[] zArr4 = s90Var.f41836e;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            }
        }
        aVar.g();
        return new v90(s90Var.f41832a, s90Var.f41833b, s90Var.f41834c, s90Var.f41835d, s90Var.f41836e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        List list;
        String str;
        Integer num2;
        v90 v90Var = (v90) obj;
        if (v90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = v90Var.f42799e;
        int length = zArr.length;
        nm.o oVar = this.f42137a;
        if (length > 0 && zArr[0]) {
            if (this.f42138b == null) {
                this.f42138b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f42138b;
            um.c h10 = cVar.h("question_field_type");
            num2 = v90Var.f42795a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42140d == null) {
                this.f42140d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42140d;
            um.c h13 = cVar.h("question_label");
            str = v90Var.f42796b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42139c == null) {
                this.f42139c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PromotedLeadFormQuestion$PromotedLeadFormQuestionTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42139c;
            um.c h14 = cVar.h("question_options");
            list = v90Var.f42797c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42138b == null) {
                this.f42138b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f42138b;
            um.c h15 = cVar.h("question_type");
            num = v90Var.f42798d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
