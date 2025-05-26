package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36682a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36683b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36684c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36685d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36686e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36687f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f36688g;

    public d9(nm.o oVar) {
        this.f36682a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f9 f9Var = new f9(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2060497896:
                    if (k03.equals("subtitle")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1759101279:
                    if (k03.equals("subtitle_preview")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -295464393:
                    if (k03.equals("updated_at")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -108721372:
                    if (k03.equals("list_item_count")) {
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
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 722485772:
                    if (k03.equals("title_placeholder")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1028554796:
                    if (k03.equals("creator")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1053220864:
                    if (k03.equals("cover_images")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1705405530:
                    if (k03.equals("checklist_placeholder")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2004536268:
                    if (k03.equals("subtitle_placeholder")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36682a;
            switch (c13) {
                case 0:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37609i = (String) this.f36687f.c(aVar);
                    boolean[] zArr = f9Var.f37615o;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 1:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37611k = (String) this.f36687f.c(aVar);
                    boolean[] zArr2 = f9Var.f37615o;
                    if (zArr2.length <= 10) {
                        break;
                    } else {
                        zArr2[10] = true;
                        break;
                    }
                case 2:
                    if (this.f36684c == null) {
                        this.f36684c = a.cb.q(oVar, Date.class);
                    }
                    f9Var.f37614n = (Date) this.f36684c.c(aVar);
                    boolean[] zArr3 = f9Var.f37615o;
                    if (zArr3.length <= 13) {
                        break;
                    } else {
                        zArr3[13] = true;
                        break;
                    }
                case 3:
                    if (this.f36685d == null) {
                        this.f36685d = a.cb.q(oVar, Integer.class);
                    }
                    f9Var.f37608h = (Integer) this.f36685d.c(aVar);
                    boolean[] zArr4 = f9Var.f37615o;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37601a = (String) this.f36687f.c(aVar);
                    boolean[] zArr5 = f9Var.f37615o;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f36683b == null) {
                        this.f36683b = a.cb.q(oVar, v7.class);
                    }
                    f9Var.f37603c = (v7) this.f36683b.c(aVar);
                    boolean[] zArr6 = f9Var.f37615o;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37612l = (String) this.f36687f.c(aVar);
                    boolean[] zArr7 = f9Var.f37615o;
                    if (zArr7.length <= 11) {
                        break;
                    } else {
                        zArr7[11] = true;
                        break;
                    }
                case 7:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37613m = (String) this.f36687f.c(aVar);
                    boolean[] zArr8 = f9Var.f37615o;
                    if (zArr8.length <= 12) {
                        break;
                    } else {
                        zArr8[12] = true;
                        break;
                    }
                case '\b':
                    if (this.f36688g == null) {
                        this.f36688g = a.cb.q(oVar, wy0.class);
                    }
                    f9Var.f37607g = (wy0) this.f36688g.c(aVar);
                    boolean[] zArr9 = f9Var.f37615o;
                    if (zArr9.length <= 6) {
                        break;
                    } else {
                        zArr9[6] = true;
                        break;
                    }
                case '\t':
                    if (this.f36686e == null) {
                        this.f36686e = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.BoardNote$BoardNoteTypeAdapter$2
                        }).b();
                    }
                    f9Var.f37605e = (List) this.f36686e.c(aVar);
                    boolean[] zArr10 = f9Var.f37615o;
                    if (zArr10.length <= 4) {
                        break;
                    } else {
                        zArr10[4] = true;
                        break;
                    }
                case '\n':
                    if (this.f36684c == null) {
                        this.f36684c = a.cb.q(oVar, Date.class);
                    }
                    f9Var.f37606f = (Date) this.f36684c.c(aVar);
                    boolean[] zArr11 = f9Var.f37615o;
                    if (zArr11.length <= 5) {
                        break;
                    } else {
                        zArr11[5] = true;
                        break;
                    }
                case 11:
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37604d = (String) this.f36687f.c(aVar);
                    boolean[] zArr12 = f9Var.f37615o;
                    if (zArr12.length <= 3) {
                        break;
                    } else {
                        zArr12[3] = true;
                        break;
                    }
                case '\f':
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37610j = (String) this.f36687f.c(aVar);
                    boolean[] zArr13 = f9Var.f37615o;
                    if (zArr13.length <= 9) {
                        break;
                    } else {
                        zArr13[9] = true;
                        break;
                    }
                case '\r':
                    if (this.f36687f == null) {
                        this.f36687f = a.cb.q(oVar, String.class);
                    }
                    f9Var.f37602b = (String) this.f36687f.c(aVar);
                    boolean[] zArr14 = f9Var.f37615o;
                    if (zArr14.length <= 1) {
                        break;
                    } else {
                        zArr14[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new g9(f9Var.f37601a, f9Var.f37602b, f9Var.f37603c, f9Var.f37604d, f9Var.f37605e, f9Var.f37606f, f9Var.f37607g, f9Var.f37608h, f9Var.f37609i, f9Var.f37610j, f9Var.f37611k, f9Var.f37612l, f9Var.f37613m, f9Var.f37614n, f9Var.f37615o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Integer num;
        wy0 wy0Var;
        Date date2;
        List list;
        String str6;
        v7 v7Var;
        String str7;
        String str8;
        g9 g9Var = (g9) obj;
        if (g9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = g9Var.f37995o;
        int length = zArr.length;
        nm.o oVar = this.f36682a;
        if (length > 0 && zArr[0]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36687f;
            um.c h10 = cVar.h("id");
            str8 = g9Var.f37981a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36687f;
            um.c h13 = cVar.h("node_id");
            str7 = g9Var.f37982b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36683b == null) {
                this.f36683b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f36683b;
            um.c h14 = cVar.h("board");
            v7Var = g9Var.f37983c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36687f;
            um.c h15 = cVar.h("checklist_placeholder");
            str6 = g9Var.f37984d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36686e == null) {
                this.f36686e = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.BoardNote$BoardNoteTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f36686e;
            um.c h16 = cVar.h("cover_images");
            list = g9Var.f37985e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36684c == null) {
                this.f36684c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar6 = this.f36684c;
            um.c h17 = cVar.h("created_at");
            date2 = g9Var.f37986f;
            mVar6.e(h17, date2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36688g == null) {
                this.f36688g = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar7 = this.f36688g;
            um.c h18 = cVar.h("creator");
            wy0Var = g9Var.f37987g;
            mVar7.e(h18, wy0Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36685d == null) {
                this.f36685d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f36685d;
            um.c h19 = cVar.h("list_item_count");
            num = g9Var.f37988h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f36687f;
            um.c h23 = cVar.h("subtitle");
            str5 = g9Var.f37989i;
            mVar9.e(h23, str5);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f36687f;
            um.c h24 = cVar.h("subtitle_placeholder");
            str4 = g9Var.f37990j;
            mVar10.e(h24, str4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f36687f;
            um.c h25 = cVar.h("subtitle_preview");
            str3 = g9Var.f37991k;
            mVar11.e(h25, str3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f36687f;
            um.c h26 = cVar.h("title");
            str2 = g9Var.f37992l;
            mVar12.e(h26, str2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f36687f == null) {
                this.f36687f = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f36687f;
            um.c h27 = cVar.h("title_placeholder");
            str = g9Var.f37993m;
            mVar13.e(h27, str);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f36684c == null) {
                this.f36684c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar14 = this.f36684c;
            um.c h28 = cVar.h("updated_at");
            date = g9Var.f37994n;
            mVar14.e(h28, date);
        }
        cVar.g();
    }
}
