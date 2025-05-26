package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class h9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38346a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38347b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38348c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38349d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38350e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38351f;

    public h9(nm.o oVar) {
        this.f38346a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j9 j9Var = new j9(0);
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
                case 100526016:
                    if (k03.equals("items")) {
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
            nm.o oVar = this.f38346a;
            switch (c13) {
                case 0:
                    if (this.f38348c == null) {
                        this.f38348c = a.cb.q(oVar, Date.class);
                    }
                    j9Var.f39010g = (Date) this.f38348c.c(aVar);
                    boolean[] zArr = j9Var.f39011h;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f38350e == null) {
                        this.f38350e = a.cb.q(oVar, String.class);
                    }
                    j9Var.f39004a = (String) this.f38350e.c(aVar);
                    boolean[] zArr2 = j9Var.f39011h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f38349d == null) {
                        this.f38349d = oVar.g(new TypeToken<List<o9>>(this) { // from class: com.pinterest.api.model.BoardNoteList$BoardNoteListTypeAdapter$2
                        }).b();
                    }
                    j9Var.f39009f = (List) this.f38349d.c(aVar);
                    boolean[] zArr3 = j9Var.f39011h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f38351f == null) {
                        this.f38351f = a.cb.q(oVar, wy0.class);
                    }
                    j9Var.f39008e = (wy0) this.f38351f.c(aVar);
                    boolean[] zArr4 = j9Var.f39011h;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f38348c == null) {
                        this.f38348c = a.cb.q(oVar, Date.class);
                    }
                    j9Var.f39007d = (Date) this.f38348c.c(aVar);
                    boolean[] zArr5 = j9Var.f39011h;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f38347b == null) {
                        this.f38347b = a.cb.q(oVar, g9.class);
                    }
                    j9Var.f39006c = (g9) this.f38347b.c(aVar);
                    boolean[] zArr6 = j9Var.f39011h;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f38350e == null) {
                        this.f38350e = a.cb.q(oVar, String.class);
                    }
                    j9Var.f39005b = (String) this.f38350e.c(aVar);
                    boolean[] zArr7 = j9Var.f39011h;
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
        return new k9(j9Var.f39004a, j9Var.f39005b, j9Var.f39006c, j9Var.f39007d, j9Var.f39008e, j9Var.f39009f, j9Var.f39010g, j9Var.f39011h, 0);
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
        k9 k9Var = (k9) obj;
        if (k9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = k9Var.f39345h;
        int length = zArr.length;
        nm.o oVar = this.f38346a;
        if (length > 0 && zArr[0]) {
            if (this.f38350e == null) {
                this.f38350e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38350e;
            um.c h10 = cVar.h("id");
            str2 = k9Var.f39338a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38350e == null) {
                this.f38350e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38350e;
            um.c h13 = cVar.h("node_id");
            str = k9Var.f39339b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38347b == null) {
                this.f38347b = a.cb.q(oVar, g9.class);
            }
            nm.m mVar3 = this.f38347b;
            um.c h14 = cVar.h("board_note");
            g9Var = k9Var.f39340c;
            mVar3.e(h14, g9Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38348c == null) {
                this.f38348c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f38348c;
            um.c h15 = cVar.h("created_at");
            date2 = k9Var.f39341d;
            mVar4.e(h15, date2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38351f == null) {
                this.f38351f = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar5 = this.f38351f;
            um.c h16 = cVar.h("creator");
            wy0Var = k9Var.f39342e;
            mVar5.e(h16, wy0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38349d == null) {
                this.f38349d = oVar.g(new TypeToken<List<o9>>(this) { // from class: com.pinterest.api.model.BoardNoteList$BoardNoteListTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f38349d;
            um.c h17 = cVar.h("items");
            list = k9Var.f39343f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38348c == null) {
                this.f38348c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar7 = this.f38348c;
            um.c h18 = cVar.h("updated_at");
            date = k9Var.f39344g;
            mVar7.e(h18, date);
        }
        cVar.g();
    }
}
