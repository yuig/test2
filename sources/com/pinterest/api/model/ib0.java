package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ib0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38726a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38727b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38728c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38729d;

    public ib0(nm.o oVar) {
        this.f38726a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        hb0 hb0Var = new hb0(0);
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
                case -868034268:
                    if (k03.equals("topics")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -824899544:
                    if (k03.equals("output_data")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 650530900:
                    if (k03.equals("section_type")) {
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
            nm.o oVar = this.f38726a;
            switch (c13) {
                case 0:
                    if (this.f38729d == null) {
                        this.f38729d = a.cb.q(oVar, String.class);
                    }
                    hb0Var.f38358c = (String) this.f38729d.c(aVar);
                    boolean[] zArr = hb0Var.f38363h;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f38727b == null) {
                        this.f38727b = oVar.g(new TypeToken<List<t20>>(this) { // from class: com.pinterest.api.model.QuizOutputSection$QuizOutputSectionTypeAdapter$2
                        }).b();
                    }
                    hb0Var.f38362g = (List) this.f38727b.c(aVar);
                    boolean[] zArr2 = hb0Var.f38363h;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f38728c == null) {
                        this.f38728c = a.cb.q(oVar, rb0.class);
                    }
                    hb0Var.f38359d = (rb0) this.f38728c.c(aVar);
                    boolean[] zArr3 = hb0Var.f38363h;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f38729d == null) {
                        this.f38729d = a.cb.q(oVar, String.class);
                    }
                    hb0Var.f38356a = (String) this.f38729d.c(aVar);
                    boolean[] zArr4 = hb0Var.f38363h;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f38729d == null) {
                        this.f38729d = a.cb.q(oVar, String.class);
                    }
                    hb0Var.f38361f = (String) this.f38729d.c(aVar);
                    boolean[] zArr5 = hb0Var.f38363h;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f38729d == null) {
                        this.f38729d = a.cb.q(oVar, String.class);
                    }
                    hb0Var.f38360e = (String) this.f38729d.c(aVar);
                    boolean[] zArr6 = hb0Var.f38363h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f38729d == null) {
                        this.f38729d = a.cb.q(oVar, String.class);
                    }
                    hb0Var.f38357b = (String) this.f38729d.c(aVar);
                    boolean[] zArr7 = hb0Var.f38363h;
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
        return new kb0(hb0Var.f38356a, hb0Var.f38357b, hb0Var.f38358c, hb0Var.f38359d, hb0Var.f38360e, hb0Var.f38361f, hb0Var.f38362g, hb0Var.f38363h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        rb0 rb0Var;
        String str3;
        String str4;
        String str5;
        kb0 kb0Var = (kb0) obj;
        if (kb0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kb0Var.f39379h;
        int length = zArr.length;
        nm.o oVar = this.f38726a;
        if (length > 0 && zArr[0]) {
            if (this.f38729d == null) {
                this.f38729d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38729d;
            um.c h10 = cVar.h("id");
            str5 = kb0Var.f39372a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38729d == null) {
                this.f38729d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38729d;
            um.c h13 = cVar.h("node_id");
            str4 = kb0Var.f39373b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38729d == null) {
                this.f38729d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38729d;
            um.c h14 = cVar.h("description");
            str3 = kb0Var.f39374c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38728c == null) {
                this.f38728c = a.cb.q(oVar, rb0.class);
            }
            nm.m mVar4 = this.f38728c;
            um.c h15 = cVar.h("output_data");
            rb0Var = kb0Var.f39375d;
            mVar4.e(h15, rb0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38729d == null) {
                this.f38729d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38729d;
            um.c h16 = cVar.h("section_type");
            str2 = kb0Var.f39376e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38729d == null) {
                this.f38729d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38729d;
            um.c h17 = cVar.h("title");
            str = kb0Var.f39377f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38727b == null) {
                this.f38727b = oVar.g(new TypeToken<List<t20>>(this) { // from class: com.pinterest.api.model.QuizOutputSection$QuizOutputSectionTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f38727b;
            um.c h18 = cVar.h("topics");
            list = kb0Var.f39378g;
            mVar7.e(h18, list);
        }
        cVar.g();
    }
}
