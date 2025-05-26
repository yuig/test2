package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ab0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35685a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35686b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35687c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35688d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f35689e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f35690f;

    public ab0(nm.o oVar) {
        this.f35685a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        za0 za0Var = new za0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1273528799:
                    if (k03.equals("output_key")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1268861541:
                    if (k03.equals("footer")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -891050150:
                    if (k03.equals("survey")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 947936814:
                    if (k03.equals("sections")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1491282739:
                    if (k03.equals("header_section")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1766182403:
                    if (k03.equals("cover_image_url")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\n';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35685a;
            switch (c13) {
                case 0:
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44262e = (String) this.f35690f.c(aVar);
                    boolean[] zArr = za0Var.f44269l;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44265h = (String) this.f35690f.c(aVar);
                    boolean[] zArr2 = za0Var.f44269l;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 2:
                    if (this.f35687c == null) {
                        this.f35687c = a.cb.q(oVar, ua0.class);
                    }
                    za0Var.f44263f = (ua0) this.f35687c.c(aVar);
                    boolean[] zArr3 = za0Var.f44269l;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f35689e == null) {
                        this.f35689e = a.cb.q(oVar, gc0.class);
                    }
                    za0Var.f44267j = (gc0) this.f35689e.c(aVar);
                    boolean[] zArr4 = za0Var.f44269l;
                    if (zArr4.length <= 9) {
                        break;
                    } else {
                        zArr4[9] = true;
                        break;
                    }
                case 4:
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44258a = (String) this.f35690f.c(aVar);
                    boolean[] zArr5 = za0Var.f44269l;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44268k = (String) this.f35690f.c(aVar);
                    boolean[] zArr6 = za0Var.f44269l;
                    if (zArr6.length <= 10) {
                        break;
                    } else {
                        zArr6[10] = true;
                        break;
                    }
                case 6:
                    if (this.f35686b == null) {
                        this.f35686b = oVar.g(new TypeToken<List<kb0>>(this) { // from class: com.pinterest.api.model.QuizOutput$QuizOutputTypeAdapter$2
                        }).b();
                    }
                    za0Var.f44266i = (List) this.f35686b.c(aVar);
                    boolean[] zArr7 = za0Var.f44269l;
                    if (zArr7.length <= 8) {
                        break;
                    } else {
                        zArr7[8] = true;
                        break;
                    }
                case 7:
                    if (this.f35688d == null) {
                        this.f35688d = a.cb.q(oVar, gb0.class);
                    }
                    za0Var.f44264g = (gb0) this.f35688d.c(aVar);
                    boolean[] zArr8 = za0Var.f44269l;
                    if (zArr8.length <= 6) {
                        break;
                    } else {
                        zArr8[6] = true;
                        break;
                    }
                case '\b':
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44261d = (String) this.f35690f.c(aVar);
                    boolean[] zArr9 = za0Var.f44269l;
                    if (zArr9.length <= 3) {
                        break;
                    } else {
                        zArr9[3] = true;
                        break;
                    }
                case '\t':
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44260c = (String) this.f35690f.c(aVar);
                    boolean[] zArr10 = za0Var.f44269l;
                    if (zArr10.length <= 2) {
                        break;
                    } else {
                        zArr10[2] = true;
                        break;
                    }
                case '\n':
                    if (this.f35690f == null) {
                        this.f35690f = a.cb.q(oVar, String.class);
                    }
                    za0Var.f44259b = (String) this.f35690f.c(aVar);
                    boolean[] zArr11 = za0Var.f44269l;
                    if (zArr11.length <= 1) {
                        break;
                    } else {
                        zArr11[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new cb0(za0Var.f44258a, za0Var.f44259b, za0Var.f44260c, za0Var.f44261d, za0Var.f44262e, za0Var.f44263f, za0Var.f44264g, za0Var.f44265h, za0Var.f44266i, za0Var.f44267j, za0Var.f44268k, za0Var.f44269l, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        gc0 gc0Var;
        List list;
        String str2;
        gb0 gb0Var;
        ua0 ua0Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        cb0 cb0Var = (cb0) obj;
        if (cb0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cb0Var.f36355l;
        int length = zArr.length;
        nm.o oVar = this.f35685a;
        if (length > 0 && zArr[0]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35690f;
            um.c h10 = cVar.h("id");
            str7 = cb0Var.f36344a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35690f;
            um.c h13 = cVar.h("node_id");
            str6 = cb0Var.f36345b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35690f;
            um.c h14 = cVar.h("background_color");
            str5 = cb0Var.f36346c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35690f;
            um.c h15 = cVar.h("cover_image_url");
            str4 = cb0Var.f36347d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35690f;
            um.c h16 = cVar.h("description");
            str3 = cb0Var.f36348e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35687c == null) {
                this.f35687c = a.cb.q(oVar, ua0.class);
            }
            nm.m mVar6 = this.f35687c;
            um.c h17 = cVar.h("footer");
            ua0Var = cb0Var.f36349f;
            mVar6.e(h17, ua0Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35688d == null) {
                this.f35688d = a.cb.q(oVar, gb0.class);
            }
            nm.m mVar7 = this.f35688d;
            um.c h18 = cVar.h("header_section");
            gb0Var = cb0Var.f36350g;
            mVar7.e(h18, gb0Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f35690f;
            um.c h19 = cVar.h("output_key");
            str2 = cb0Var.f36351h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f35686b == null) {
                this.f35686b = oVar.g(new TypeToken<List<kb0>>(this) { // from class: com.pinterest.api.model.QuizOutput$QuizOutputTypeAdapter$1
                }).b();
            }
            nm.m mVar9 = this.f35686b;
            um.c h23 = cVar.h("sections");
            list = cb0Var.f36352i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f35689e == null) {
                this.f35689e = a.cb.q(oVar, gc0.class);
            }
            nm.m mVar10 = this.f35689e;
            um.c h24 = cVar.h("survey");
            gc0Var = cb0Var.f36353j;
            mVar10.e(h24, gc0Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f35690f == null) {
                this.f35690f = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f35690f;
            um.c h25 = cVar.h("title");
            str = cb0Var.f36354k;
            mVar11.e(h25, str);
        }
        cVar.g();
    }
}
