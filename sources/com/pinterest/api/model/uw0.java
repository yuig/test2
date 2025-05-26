package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class uw0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42667a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42668b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42669c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42670d;

    public uw0(nm.o oVar) {
        this.f42667a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tw0 tw0Var = new tw0(0);
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 107953788:
                    if (k03.equals("quote")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 188528006:
                    if (k03.equals("audio_url")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42667a;
            switch (c13) {
                case 0:
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42339b = (String) this.f42670d.c(aVar);
                    boolean[] zArr = tw0Var.f42348k;
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 1:
                    if (this.f42668b == null) {
                        this.f42668b = a.cb.q(oVar, Integer.class);
                    }
                    tw0Var.f42340c = (Integer) this.f42668b.c(aVar);
                    boolean[] zArr2 = tw0Var.f42348k;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f42669c == null) {
                        this.f42669c = oVar.g(new TypeToken<List<ax0>>(this) { // from class: com.pinterest.api.model.TreatmentStep$TreatmentStepTypeAdapter$2
                        }).b();
                    }
                    tw0Var.f42346i = (List) this.f42669c.c(aVar);
                    boolean[] zArr3 = tw0Var.f42348k;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 3:
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42341d = (String) this.f42670d.c(aVar);
                    boolean[] zArr4 = tw0Var.f42348k;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case 4:
                    if (this.f42668b == null) {
                        this.f42668b = a.cb.q(oVar, Integer.class);
                    }
                    tw0Var.f42342e = (Integer) this.f42668b.c(aVar);
                    boolean[] zArr5 = tw0Var.f42348k;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42338a = (String) this.f42670d.c(aVar);
                    boolean[] zArr6 = tw0Var.f42348k;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42344g = (String) this.f42670d.c(aVar);
                    boolean[] zArr7 = tw0Var.f42348k;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42347j = (String) this.f42670d.c(aVar);
                    boolean[] zArr8 = tw0Var.f42348k;
                    if (zArr8.length <= 9) {
                        break;
                    } else {
                        zArr8[9] = true;
                        break;
                    }
                case '\b':
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42345h = (String) this.f42670d.c(aVar);
                    boolean[] zArr9 = tw0Var.f42348k;
                    if (zArr9.length <= 7) {
                        break;
                    } else {
                        zArr9[7] = true;
                        break;
                    }
                case '\t':
                    if (this.f42670d == null) {
                        this.f42670d = a.cb.q(oVar, String.class);
                    }
                    tw0Var.f42343f = (String) this.f42670d.c(aVar);
                    boolean[] zArr10 = tw0Var.f42348k;
                    if (zArr10.length <= 5) {
                        break;
                    } else {
                        zArr10[5] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ww0(tw0Var.f42338a, tw0Var.f42339b, tw0Var.f42340c, tw0Var.f42341d, tw0Var.f42342e, tw0Var.f42343f, tw0Var.f42344g, tw0Var.f42345h, tw0Var.f42346i, tw0Var.f42347j, tw0Var.f42348k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        Integer num2;
        String str6;
        String str7;
        ww0 ww0Var = (ww0) obj;
        if (ww0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ww0Var.f43418k;
        int length = zArr.length;
        nm.o oVar = this.f42667a;
        if (length > 0 && zArr[0]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42670d;
            um.c h10 = cVar.h("id");
            str7 = ww0Var.f43408a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42670d;
            um.c h13 = cVar.h("action_button_text");
            str6 = ww0Var.f43409b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42668b == null) {
                this.f42668b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f42668b;
            um.c h14 = cVar.h("action_button_type");
            num2 = ww0Var.f43410c;
            mVar3.e(h14, num2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42670d;
            um.c h15 = cVar.h("action_title_text");
            str5 = ww0Var.f43411d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42668b == null) {
                this.f42668b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f42668b;
            um.c h16 = cVar.h("action_title_type");
            num = ww0Var.f43412e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42670d;
            um.c h17 = cVar.h("audio_url");
            str4 = ww0Var.f43413f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42670d;
            um.c h18 = cVar.h("key");
            str3 = ww0Var.f43414g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f42670d;
            um.c h19 = cVar.h("quote");
            str2 = ww0Var.f43415h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42669c == null) {
                this.f42669c = oVar.g(new TypeToken<List<ax0>>(this) { // from class: com.pinterest.api.model.TreatmentStep$TreatmentStepTypeAdapter$1
                }).b();
            }
            nm.m mVar9 = this.f42669c;
            um.c h23 = cVar.h("text_content");
            list = ww0Var.f43416i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42670d == null) {
                this.f42670d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f42670d;
            um.c h24 = cVar.h("type");
            str = ww0Var.f43417j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
