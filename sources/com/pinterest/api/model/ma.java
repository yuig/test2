package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ma extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40037a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40038b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40039c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40040d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40041e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40042f;

    public ma(nm.o oVar) {
        this.f40037a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        oa oaVar = new oa(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1392996747:
                    if (k03.equals("is_pins_edited")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -243671674:
                    if (k03.equals("creation_board")) {
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
                case 794362489:
                    if (k03.equals("is_template_edited")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1376764862:
                    if (k03.equals("video_template")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1586350133:
                    if (k03.equals("creation_pin")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40037a;
            switch (c13) {
                case 0:
                    if (this.f40040d == null) {
                        this.f40040d = a.cb.q(oVar, Boolean.class);
                    }
                    oaVar.f40658e = (Boolean) this.f40040d.c(aVar);
                    boolean[] zArr = oaVar.f40661h;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f40038b == null) {
                        this.f40038b = a.cb.q(oVar, v7.class);
                    }
                    oaVar.f40656c = (v7) this.f40038b.c(aVar);
                    boolean[] zArr2 = oaVar.f40661h;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f40042f == null) {
                        this.f40042f = a.cb.q(oVar, String.class);
                    }
                    oaVar.f40654a = (String) this.f40042f.c(aVar);
                    boolean[] zArr3 = oaVar.f40661h;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f40040d == null) {
                        this.f40040d = a.cb.q(oVar, Boolean.class);
                    }
                    oaVar.f40659f = (Boolean) this.f40040d.c(aVar);
                    boolean[] zArr4 = oaVar.f40661h;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f40039c == null) {
                        this.f40039c = a.cb.q(oVar, ta.class);
                    }
                    oaVar.f40660g = (ta) this.f40039c.c(aVar);
                    boolean[] zArr5 = oaVar.f40661h;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f40041e == null) {
                        this.f40041e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardVideo$BoardVideoTypeAdapter$2
                        }).b();
                    }
                    oaVar.f40657d = (List) this.f40041e.c(aVar);
                    boolean[] zArr6 = oaVar.f40661h;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f40042f == null) {
                        this.f40042f = a.cb.q(oVar, String.class);
                    }
                    oaVar.f40655b = (String) this.f40042f.c(aVar);
                    boolean[] zArr7 = oaVar.f40661h;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new pa(oaVar.f40654a, oaVar.f40655b, oaVar.f40656c, oaVar.f40657d, oaVar.f40658e, oaVar.f40659f, oaVar.f40660g, oaVar.f40661h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        ta taVar;
        Boolean bool;
        Boolean bool2;
        List list;
        v7 v7Var;
        String str;
        String str2;
        pa paVar = (pa) obj;
        if (paVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = paVar.f40930h;
        int length = zArr.length;
        nm.o oVar = this.f40037a;
        if (length > 0 && zArr[0]) {
            if (this.f40042f == null) {
                this.f40042f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40042f;
            um.c h10 = cVar.h("id");
            str2 = paVar.f40923a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40042f == null) {
                this.f40042f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40042f;
            um.c h13 = cVar.h("node_id");
            str = paVar.f40924b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40038b == null) {
                this.f40038b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f40038b;
            um.c h14 = cVar.h("creation_board");
            v7Var = paVar.f40925c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40041e == null) {
                this.f40041e = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardVideo$BoardVideoTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f40041e;
            um.c h15 = cVar.h("creation_pin");
            list = paVar.f40926d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40040d == null) {
                this.f40040d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f40040d;
            um.c h16 = cVar.h("is_pins_edited");
            bool2 = paVar.f40927e;
            mVar5.e(h16, bool2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40040d == null) {
                this.f40040d = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f40040d;
            um.c h17 = cVar.h("is_template_edited");
            bool = paVar.f40928f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40039c == null) {
                this.f40039c = a.cb.q(oVar, ta.class);
            }
            nm.m mVar7 = this.f40039c;
            um.c h18 = cVar.h("video_template");
            taVar = paVar.f40929g;
            mVar7.e(h18, taVar);
        }
        cVar.g();
    }
}
