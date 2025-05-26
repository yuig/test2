package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class uf0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42550a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42551b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42552c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42553d;

    public uf0(nm.o oVar) {
        this.f42550a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tf0 tf0Var = new tf0(0);
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
                case 188528006:
                    if (k03.equals("audio_url")) {
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
            boolean[] zArr = tf0Var.f42205j;
            nm.o oVar = this.f42550a;
            switch (c13) {
                case 0:
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42198c = (String) this.f42553d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f42551b == null) {
                        this.f42551b = a.cb.q(oVar, Integer.class);
                    }
                    tf0Var.f42199d = (Integer) this.f42551b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 2:
                    if (this.f42552c == null) {
                        this.f42552c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentAudioStep$SafetyTreatmentAudioStepTypeAdapter$2
                        }).b();
                    }
                    tf0Var.f42203h = (List) this.f42552c.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 3:
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42200e = (String) this.f42553d.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 4:
                    if (this.f42551b == null) {
                        this.f42551b = a.cb.q(oVar, Integer.class);
                    }
                    tf0Var.f42201f = (Integer) this.f42551b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 5:
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42196a = (String) this.f42553d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 6:
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42202g = (String) this.f42553d.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 7:
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42204i = (String) this.f42553d.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f42553d == null) {
                        this.f42553d = a.cb.q(oVar, String.class);
                    }
                    tf0Var.f42197b = (String) this.f42553d.c(aVar);
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
        return new wf0(tf0Var.f42196a, tf0Var.f42197b, tf0Var.f42198c, tf0Var.f42199d, tf0Var.f42200e, tf0Var.f42201f, tf0Var.f42202g, tf0Var.f42203h, tf0Var.f42204i, tf0Var.f42205j, 0);
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
        wf0 wf0Var = (wf0) obj;
        if (wf0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wf0Var.f43258j;
        int length = zArr.length;
        nm.o oVar = this.f42550a;
        if (length > 0 && zArr[0]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42553d;
            um.c h10 = cVar.h("id");
            str6 = wf0Var.f43249a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42553d;
            um.c h13 = cVar.h("node_id");
            str5 = wf0Var.f43250b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42553d;
            um.c h14 = cVar.h("action_button_text");
            str4 = wf0Var.f43251c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42551b == null) {
                this.f42551b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f42551b;
            um.c h15 = cVar.h("action_button_type");
            num2 = wf0Var.f43252d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42553d;
            um.c h16 = cVar.h("action_title_text");
            str3 = wf0Var.f43253e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42551b == null) {
                this.f42551b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f42551b;
            um.c h17 = cVar.h("action_title_type");
            num = wf0Var.f43254f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42553d;
            um.c h18 = cVar.h("key");
            str2 = wf0Var.f43255g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42552c == null) {
                this.f42552c = oVar.g(new TypeToken<List<lf0>>(this) { // from class: com.pinterest.api.model.SafetyTreatmentAudioStep$SafetyTreatmentAudioStepTypeAdapter$1
                }).b();
            }
            nm.m mVar8 = this.f42552c;
            um.c h19 = cVar.h("text_content");
            list = wf0Var.f43256h;
            mVar8.e(h19, list);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42553d == null) {
                this.f42553d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f42553d;
            um.c h23 = cVar.h("audio_url");
            str = wf0Var.f43257i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
