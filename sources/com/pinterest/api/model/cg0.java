package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class cg0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36415a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36416b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36417c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36418d;

    public cg0(nm.o oVar) {
        this.f36415a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bg0 bg0Var = new bg0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1684815471:
                    if (k03.equals("action_button_text")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1684796514:
                    if (k03.equals("action_button_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1318083737:
                    if (k03.equals("text_content")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1216770979:
                    if (k03.equals("action_title_text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1216752022:
                    if (k03.equals("action_title_type")) {
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
                case 106079:
                    if (k03.equals("key")) {
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
            boolean[] zArr = bg0Var.f36102i;
            nm.o oVar = this.f36415a;
            switch (c13) {
                case 0:
                    if (this.f36418d == null) {
                        this.f36418d = a.cb.q(oVar, String.class);
                    }
                    bg0Var.f36096c = (String) this.f36418d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f36416b == null) {
                        this.f36416b = a.cb.q(oVar, Integer.class);
                    }
                    bg0Var.f36097d = (Integer) this.f36416b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 2:
                    if (this.f36417c == null) {
                        this.f36417c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentTextStep$SafetyTreatmentTextStepTypeAdapter$2
                        }).b();
                    }
                    bg0Var.f36101h = (List) this.f36417c.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 3:
                    if (this.f36418d == null) {
                        this.f36418d = a.cb.q(oVar, String.class);
                    }
                    bg0Var.f36098e = (String) this.f36418d.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 4:
                    if (this.f36416b == null) {
                        this.f36416b = a.cb.q(oVar, Integer.class);
                    }
                    bg0Var.f36099f = (Integer) this.f36416b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 5:
                    if (this.f36418d == null) {
                        this.f36418d = a.cb.q(oVar, String.class);
                    }
                    bg0Var.f36094a = (String) this.f36418d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 6:
                    if (this.f36418d == null) {
                        this.f36418d = a.cb.q(oVar, String.class);
                    }
                    bg0Var.f36100g = (String) this.f36418d.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 7:
                    if (this.f36418d == null) {
                        this.f36418d = a.cb.q(oVar, String.class);
                    }
                    bg0Var.f36095b = (String) this.f36418d.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new eg0(bg0Var.f36094a, bg0Var.f36095b, bg0Var.f36096c, bg0Var.f36097d, bg0Var.f36098e, bg0Var.f36099f, bg0Var.f36100g, bg0Var.f36101h, bg0Var.f36102i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        String str4;
        String str5;
        eg0 eg0Var = (eg0) obj;
        if (eg0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = eg0Var.f37271i;
        int length = zArr.length;
        nm.o oVar = this.f36415a;
        if (length > 0 && zArr[0]) {
            if (this.f36418d == null) {
                this.f36418d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36418d;
            um.c h10 = cVar.h("id");
            str5 = eg0Var.f37263a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36418d == null) {
                this.f36418d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36418d;
            um.c h13 = cVar.h("node_id");
            str4 = eg0Var.f37264b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36418d == null) {
                this.f36418d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36418d;
            um.c h14 = cVar.h("action_button_text");
            str3 = eg0Var.f37265c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36416b == null) {
                this.f36416b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36416b;
            um.c h15 = cVar.h("action_button_type");
            num2 = eg0Var.f37266d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36418d == null) {
                this.f36418d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36418d;
            um.c h16 = cVar.h("action_title_text");
            str2 = eg0Var.f37267e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36416b == null) {
                this.f36416b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f36416b;
            um.c h17 = cVar.h("action_title_type");
            num = eg0Var.f37268f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36418d == null) {
                this.f36418d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36418d;
            um.c h18 = cVar.h("key");
            str = eg0Var.f37269g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36417c == null) {
                this.f36417c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentTextStep$SafetyTreatmentTextStepTypeAdapter$1
                }).b();
            }
            nm.m mVar8 = this.f36417c;
            um.c h19 = cVar.h("text_content");
            list = eg0Var.f37270h;
            mVar8.e(h19, list);
        }
        cVar.g();
    }
}
