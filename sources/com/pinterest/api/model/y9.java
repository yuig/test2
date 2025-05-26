package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class y9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43978a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43979b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43980c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43981d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43982e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43983f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f43984g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f43985h;

    public y9(nm.o oVar) {
        this.f43978a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        aa aaVar = new aa(0);
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
                case -1362791531:
                    if (k03.equals("preview_pins")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -853875768:
                    if (k03.equals("eligible_pin_type_filters")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
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
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 564403871:
                    if (k03.equals("sensitivity")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            boolean[] zArr = aaVar.f35681k;
            nm.o oVar = this.f43978a;
            switch (c13) {
                case 0:
                    if (this.f43984g == null) {
                        this.f43984g = a.cb.q(oVar, String.class);
                    }
                    aaVar.f35674d = (String) this.f43984g.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f43981d == null) {
                        this.f43981d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardSection$BoardSectionTypeAdapter$4
                        }).b();
                    }
                    aaVar.c((List) this.f43981d.c(aVar));
                    break;
                case 2:
                    if (this.f43982e == null) {
                        this.f43982e = oVar.g(new TypeToken<List<b60>>(this) { // from class: com.pinterest.api.model.BoardSection$BoardSectionTypeAdapter$3
                        }).b();
                    }
                    aaVar.f35675e = (List) this.f43982e.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 3:
                    if (this.f43980c == null) {
                        this.f43980c = a.cb.q(oVar, Integer.class);
                    }
                    aaVar.f35676f = (Integer) this.f43980c.c(aVar);
                    boolean[] zArr2 = aaVar.f35681k;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 4:
                    if (this.f43984g == null) {
                        this.f43984g = a.cb.q(oVar, String.class);
                    }
                    aaVar.f35671a = (String) this.f43984g.c(aVar);
                    boolean[] zArr3 = aaVar.f35681k;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 5:
                    if (this.f43985h == null) {
                        this.f43985h = a.cb.q(oVar, wy0.class);
                    }
                    aaVar.f35680j = (wy0) this.f43985h.c(aVar);
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 6:
                    if (this.f43979b == null) {
                        this.f43979b = a.cb.q(oVar, v7.class);
                    }
                    aaVar.f35673c = (v7) this.f43979b.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 7:
                    if (this.f43984g == null) {
                        this.f43984g = a.cb.q(oVar, String.class);
                    }
                    aaVar.d((String) this.f43984g.c(aVar));
                    break;
                case '\b':
                    if (this.f43983f == null) {
                        this.f43983f = a.cb.q(oVar, lh0.class);
                    }
                    aaVar.f35678h = (lh0) this.f43983f.c(aVar);
                    boolean[] zArr4 = aaVar.f35681k;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case '\t':
                    if (this.f43984g == null) {
                        this.f43984g = a.cb.q(oVar, String.class);
                    }
                    aaVar.f35672b = (String) this.f43984g.c(aVar);
                    boolean[] zArr5 = aaVar.f35681k;
                    if (zArr5.length <= 1) {
                        break;
                    } else {
                        zArr5[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return aaVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        String str;
        lh0 lh0Var;
        List list;
        Integer num;
        List list2;
        String str2;
        v7 v7Var;
        String str3;
        String str4;
        ba baVar = (ba) obj;
        if (baVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = baVar.f36034k;
        int length = zArr.length;
        nm.o oVar = this.f43978a;
        if (length > 0 && zArr[0]) {
            if (this.f43984g == null) {
                this.f43984g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43984g;
            um.c h10 = cVar.h("id");
            str4 = baVar.f36024a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43984g == null) {
                this.f43984g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43984g;
            um.c h13 = cVar.h("node_id");
            str3 = baVar.f36025b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43979b == null) {
                this.f43979b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f43979b;
            um.c h14 = cVar.h("board");
            v7Var = baVar.f36026c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43984g == null) {
                this.f43984g = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43984g;
            um.c h15 = cVar.h("description");
            str2 = baVar.f36027d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43982e == null) {
                this.f43982e = oVar.g(new TypeToken<List<b60>>(this) { // from class: com.pinterest.api.model.BoardSection$BoardSectionTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f43982e;
            um.c h16 = cVar.h("eligible_pin_type_filters");
            list2 = baVar.f36028e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43980c == null) {
                this.f43980c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f43980c;
            um.c h17 = cVar.h("pin_count");
            num = baVar.f36029f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43981d == null) {
                this.f43981d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardSection$BoardSectionTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f43981d;
            um.c h18 = cVar.h("preview_pins");
            list = baVar.f36030g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43983f == null) {
                this.f43983f = a.cb.q(oVar, lh0.class);
            }
            nm.m mVar8 = this.f43983f;
            um.c h19 = cVar.h("sensitivity");
            lh0Var = baVar.f36031h;
            mVar8.e(h19, lh0Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43984g == null) {
                this.f43984g = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f43984g;
            um.c h23 = cVar.h("title");
            str = baVar.f36032i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43985h == null) {
                this.f43985h = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar10 = this.f43985h;
            um.c h24 = cVar.h("user");
            wy0Var = baVar.f36033j;
            mVar10.e(h24, wy0Var);
        }
        cVar.g();
    }
}
