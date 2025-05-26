package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class yf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44043a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44044b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44045c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44046d;

    public yf0(nm.o oVar) {
        this.f44043a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xf0 xf0Var = new xf0(0);
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
                case 107953788:
                    if (k03.equals("quote")) {
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
            boolean[] zArr = xf0Var.f43675j;
            nm.o oVar = this.f44043a;
            switch (c13) {
                case 0:
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43668c = (String) this.f44046d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f44044b == null) {
                        this.f44044b = a.cb.q(oVar, Integer.class);
                    }
                    xf0Var.f43669d = (Integer) this.f44044b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 2:
                    if (this.f44045c == null) {
                        this.f44045c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentQuoteStep$SafetyTreatmentQuoteStepTypeAdapter$2
                        }).b();
                    }
                    xf0Var.f43673h = (List) this.f44045c.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 3:
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43670e = (String) this.f44046d.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 4:
                    if (this.f44044b == null) {
                        this.f44044b = a.cb.q(oVar, Integer.class);
                    }
                    xf0Var.f43671f = (Integer) this.f44044b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 5:
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43666a = (String) this.f44046d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 6:
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43672g = (String) this.f44046d.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 7:
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43674i = (String) this.f44046d.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f44046d == null) {
                        this.f44046d = a.cb.q(oVar, String.class);
                    }
                    xf0Var.f43667b = (String) this.f44046d.c(aVar);
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
        return new ag0(xf0Var.f43666a, xf0Var.f43667b, xf0Var.f43668c, xf0Var.f43669d, xf0Var.f43670e, xf0Var.f43671f, xf0Var.f43672g, xf0Var.f43673h, xf0Var.f43674i, xf0Var.f43675j, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        String str2;
        Integer num;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        ag0 ag0Var = (ag0) obj;
        if (ag0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ag0Var.f35735j;
        int length = zArr.length;
        nm.o oVar = this.f44043a;
        if (length > 0 && zArr[0]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44046d;
            um.c h10 = cVar.h("id");
            str6 = ag0Var.f35726a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44046d;
            um.c h13 = cVar.h("node_id");
            str5 = ag0Var.f35727b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44046d;
            um.c h14 = cVar.h("action_button_text");
            str4 = ag0Var.f35728c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44044b == null) {
                this.f44044b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f44044b;
            um.c h15 = cVar.h("action_button_type");
            num2 = ag0Var.f35729d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44046d;
            um.c h16 = cVar.h("action_title_text");
            str3 = ag0Var.f35730e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44044b == null) {
                this.f44044b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f44044b;
            um.c h17 = cVar.h("action_title_type");
            num = ag0Var.f35731f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f44046d;
            um.c h18 = cVar.h("key");
            str2 = ag0Var.f35732g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44045c == null) {
                this.f44045c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentQuoteStep$SafetyTreatmentQuoteStepTypeAdapter$1
                }).b();
            }
            nm.m mVar8 = this.f44045c;
            um.c h19 = cVar.h("text_content");
            list = ag0Var.f35733h;
            mVar8.e(h19, list);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44046d == null) {
                this.f44046d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f44046d;
            um.c h23 = cVar.h("quote");
            str = ag0Var.f35734i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
