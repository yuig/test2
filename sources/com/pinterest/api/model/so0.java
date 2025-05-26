package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class so0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41952a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41953b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41954c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41955d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41956e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41957f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41958g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41959h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41960i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f41961j;

    public so0(nm.o oVar) {
        this.f41952a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        oo0 oo0Var = new oo0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1386164858:
                    if (k03.equals("blocks")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1178105356:
                    if (k03.equals("video_signature")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1109722326:
                    if (k03.equals("layout")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -446984923:
                    if (k03.equals("should_mute")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3107:
                    if (k03.equals("ad")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 100313435:
                    if (k03.equals("image")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 109780401:
                    if (k03.equals("style")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 112202875:
                    if (k03.equals("video")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 382842233:
                    if (k03.equals("image_signature_adjusted")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 742226642:
                    if (k03.equals("image_adjusted")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1578360750:
                    if (k03.equals("music_attributions")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            boolean[] zArr = oo0Var.f40774o;
            nm.o oVar = this.f41952a;
            switch (c13) {
                case 0:
                    if (this.f41956e == null) {
                        this.f41956e = oVar.g(new TypeToken<List<ro0>>(this) { // from class: com.pinterest.api.model.StoryPinPage$StoryPinPageTypeAdapter$3
                        }).b();
                    }
                    oo0Var.c((List) this.f41956e.c(aVar));
                    break;
                case 1:
                    if (this.f41961j == null) {
                        this.f41961j = a.cb.q(oVar, String.class);
                    }
                    oo0Var.f40773n = (String) this.f41961j.c(aVar);
                    if (zArr.length <= 13) {
                        break;
                    } else {
                        zArr[13] = true;
                        break;
                    }
                case 2:
                    if (this.f41954c == null) {
                        this.f41954c = a.cb.q(oVar, Integer.class);
                    }
                    oo0Var.f40767h = (Integer) this.f41954c.c(aVar);
                    boolean[] zArr2 = oo0Var.f40774o;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 3:
                    if (this.f41953b == null) {
                        this.f41953b = a.cb.q(oVar, Boolean.class);
                    }
                    oo0Var.f40769j = (Boolean) this.f41953b.c(aVar);
                    boolean[] zArr3 = oo0Var.f40774o;
                    if (zArr3.length <= 9) {
                        break;
                    } else {
                        zArr3[9] = true;
                        break;
                    }
                case 4:
                    if (this.f41957f == null) {
                        this.f41957f = a.cb.q(oVar, f30.class);
                    }
                    oo0Var.b((f30) this.f41957f.c(aVar));
                    break;
                case 5:
                    if (this.f41961j == null) {
                        this.f41961j = a.cb.q(oVar, String.class);
                    }
                    oo0Var.f40762c = (String) this.f41961j.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 6:
                    if (this.f41961j == null) {
                        this.f41961j = a.cb.q(oVar, String.class);
                    }
                    oo0Var.f40771l = (String) this.f41961j.c(aVar);
                    if (zArr.length <= 11) {
                        break;
                    } else {
                        zArr[11] = true;
                        break;
                    }
                case 7:
                    if (this.f41958g == null) {
                        this.f41958g = a.cb.q(oVar, om0.class);
                    }
                    oo0Var.f40763d = (om0) this.f41958g.c(aVar);
                    boolean[] zArr4 = oo0Var.f40774o;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f41959h == null) {
                        this.f41959h = a.cb.q(oVar, ep0.class);
                    }
                    oo0Var.f40770k = (ep0) this.f41959h.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case '\t':
                    if (this.f41960i == null) {
                        this.f41960i = a.cb.q(oVar, vq0.class);
                    }
                    oo0Var.f40772m = (vq0) this.f41960i.c(aVar);
                    boolean[] zArr5 = oo0Var.f40774o;
                    if (zArr5.length <= 12) {
                        break;
                    } else {
                        zArr5[12] = true;
                        break;
                    }
                case '\n':
                    if (this.f41961j == null) {
                        this.f41961j = a.cb.q(oVar, String.class);
                    }
                    oo0Var.f40766g = (String) this.f41961j.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 11:
                    if (this.f41961j == null) {
                        this.f41961j = a.cb.q(oVar, String.class);
                    }
                    oo0Var.f40765f = (String) this.f41961j.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case '\f':
                    if (this.f41958g == null) {
                        this.f41958g = a.cb.q(oVar, om0.class);
                    }
                    oo0Var.f40764e = (om0) this.f41958g.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case '\r':
                    if (this.f41955d == null) {
                        this.f41955d = oVar.g(new TypeToken<List<hx>>(this) { // from class: com.pinterest.api.model.StoryPinPage$StoryPinPageTypeAdapter$4
                        }).b();
                    }
                    oo0Var.f40768i = (List) this.f41955d.c(aVar);
                    boolean[] zArr6 = oo0Var.f40774o;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return oo0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        vq0 vq0Var;
        String str2;
        ep0 ep0Var;
        Boolean bool;
        List list;
        Integer num;
        String str3;
        String str4;
        om0 om0Var;
        om0 om0Var2;
        String str5;
        List list2;
        f30 f30Var;
        uo0 uo0Var = (uo0) obj;
        if (uo0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = uo0Var.f42620o;
        int length = zArr.length;
        nm.o oVar = this.f41952a;
        if (length > 0 && zArr[0]) {
            if (this.f41957f == null) {
                this.f41957f = a.cb.q(oVar, f30.class);
            }
            nm.m mVar = this.f41957f;
            um.c h10 = cVar.h("ad");
            f30Var = uo0Var.f42606a;
            mVar.e(h10, f30Var);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41956e == null) {
                this.f41956e = oVar.g(new TypeToken<List<ro0>>(this) { // from class: com.pinterest.api.model.StoryPinPage$StoryPinPageTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f41956e;
            um.c h13 = cVar.h("blocks");
            list2 = uo0Var.f42607b;
            mVar2.e(h13, list2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41961j == null) {
                this.f41961j = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41961j;
            um.c h14 = cVar.h("id");
            str5 = uo0Var.f42608c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41958g == null) {
                this.f41958g = a.cb.q(oVar, om0.class);
            }
            nm.m mVar4 = this.f41958g;
            um.c h15 = cVar.h("image");
            om0Var2 = uo0Var.f42609d;
            mVar4.e(h15, om0Var2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41958g == null) {
                this.f41958g = a.cb.q(oVar, om0.class);
            }
            nm.m mVar5 = this.f41958g;
            um.c h16 = cVar.h("image_adjusted");
            om0Var = uo0Var.f42610e;
            mVar5.e(h16, om0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41961j == null) {
                this.f41961j = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41961j;
            um.c h17 = cVar.h("image_signature");
            str4 = uo0Var.f42611f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41961j == null) {
                this.f41961j = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41961j;
            um.c h18 = cVar.h("image_signature_adjusted");
            str3 = uo0Var.f42612g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41954c == null) {
                this.f41954c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f41954c;
            um.c h19 = cVar.h("layout");
            num = uo0Var.f42613h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41955d == null) {
                this.f41955d = oVar.g(new TypeToken<List<hx>>(this) { // from class: com.pinterest.api.model.StoryPinPage$StoryPinPageTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f41955d;
            um.c h23 = cVar.h("music_attributions");
            list = uo0Var.f42614i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41953b == null) {
                this.f41953b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f41953b;
            um.c h24 = cVar.h("should_mute");
            bool = uo0Var.f42615j;
            mVar10.e(h24, bool);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41959h == null) {
                this.f41959h = a.cb.q(oVar, ep0.class);
            }
            nm.m mVar11 = this.f41959h;
            um.c h25 = cVar.h("style");
            ep0Var = uo0Var.f42616k;
            mVar11.e(h25, ep0Var);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41961j == null) {
                this.f41961j = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f41961j;
            um.c h26 = cVar.h("type");
            str2 = uo0Var.f42617l;
            mVar12.e(h26, str2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f41960i == null) {
                this.f41960i = a.cb.q(oVar, vq0.class);
            }
            nm.m mVar13 = this.f41960i;
            um.c h27 = cVar.h("video");
            vq0Var = uo0Var.f42618m;
            mVar13.e(h27, vq0Var);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f41961j == null) {
                this.f41961j = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f41961j;
            um.c h28 = cVar.h("video_signature");
            str = uo0Var.f42619n;
            mVar14.e(h28, str);
        }
        cVar.g();
    }
}
