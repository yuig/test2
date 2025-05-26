package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class t9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42131a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42132b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42133c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42134d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42135e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f42136f;

    public t9(nm.o oVar) {
        this.f42131a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        v9 v9Var = new v9(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -295464393:
                    if (k03.equals("updated_at")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1028554796:
                    if (k03.equals("creator")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1756682667:
                    if (k03.equals("board_note")) {
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
            nm.o oVar = this.f42131a;
            switch (c13) {
                case 0:
                    if (this.f42133c == null) {
                        this.f42133c = a.cb.q(oVar, Date.class);
                    }
                    v9Var.f42793g = (Date) this.f42133c.c(aVar);
                    boolean[] zArr = v9Var.f42794h;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f42135e == null) {
                        this.f42135e = a.cb.q(oVar, String.class);
                    }
                    v9Var.f42787a = (String) this.f42135e.c(aVar);
                    boolean[] zArr2 = v9Var.f42794h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f42134d == null) {
                        this.f42134d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardNotePinCollection$BoardNotePinCollectionTypeAdapter$2
                        }).b();
                    }
                    v9Var.f42792f = (List) this.f42134d.c(aVar);
                    boolean[] zArr3 = v9Var.f42794h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f42136f == null) {
                        this.f42136f = a.cb.q(oVar, wy0.class);
                    }
                    v9Var.f42791e = (wy0) this.f42136f.c(aVar);
                    boolean[] zArr4 = v9Var.f42794h;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f42133c == null) {
                        this.f42133c = a.cb.q(oVar, Date.class);
                    }
                    v9Var.f42790d = (Date) this.f42133c.c(aVar);
                    boolean[] zArr5 = v9Var.f42794h;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f42132b == null) {
                        this.f42132b = a.cb.q(oVar, g9.class);
                    }
                    v9Var.f42789c = (g9) this.f42132b.c(aVar);
                    boolean[] zArr6 = v9Var.f42794h;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f42135e == null) {
                        this.f42135e = a.cb.q(oVar, String.class);
                    }
                    v9Var.f42788b = (String) this.f42135e.c(aVar);
                    boolean[] zArr7 = v9Var.f42794h;
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
        return new w9(v9Var.f42787a, v9Var.f42788b, v9Var.f42789c, v9Var.f42790d, v9Var.f42791e, v9Var.f42792f, v9Var.f42793g, v9Var.f42794h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date;
        List list;
        wy0 wy0Var;
        Date date2;
        g9 g9Var;
        String str;
        String str2;
        w9 w9Var = (w9) obj;
        if (w9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w9Var.f43198h;
        int length = zArr.length;
        nm.o oVar = this.f42131a;
        if (length > 0 && zArr[0]) {
            if (this.f42135e == null) {
                this.f42135e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42135e;
            um.c h10 = cVar.h("id");
            str2 = w9Var.f43191a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42135e == null) {
                this.f42135e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42135e;
            um.c h13 = cVar.h("node_id");
            str = w9Var.f43192b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42132b == null) {
                this.f42132b = a.cb.q(oVar, g9.class);
            }
            nm.m mVar3 = this.f42132b;
            um.c h14 = cVar.h("board_note");
            g9Var = w9Var.f43193c;
            mVar3.e(h14, g9Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42133c == null) {
                this.f42133c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f42133c;
            um.c h15 = cVar.h("created_at");
            date2 = w9Var.f43194d;
            mVar4.e(h15, date2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42136f == null) {
                this.f42136f = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar5 = this.f42136f;
            um.c h16 = cVar.h("creator");
            wy0Var = w9Var.f43195e;
            mVar5.e(h16, wy0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42134d == null) {
                this.f42134d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardNotePinCollection$BoardNotePinCollectionTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f42134d;
            um.c h17 = cVar.h("pins");
            list = w9Var.f43196f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42133c == null) {
                this.f42133c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar7 = this.f42133c;
            um.c h18 = cVar.h("updated_at");
            date = w9Var.f43197g;
            mVar7.e(h18, date);
        }
        cVar.g();
    }
}
