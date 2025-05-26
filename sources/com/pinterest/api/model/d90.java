package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes3.dex */
public final class d90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36689a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36690b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36691c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36692d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36693e;

    public d90(nm.o oVar) {
        this.f36689a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        c90 c90Var = new c90(0);
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 172522195:
                    if (k03.equals("cover_image")) {
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
                case 1651828046:
                    if (k03.equals("highlight_item_count")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1714924804:
                    if (k03.equals("dominant_color")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36689a;
            switch (c13) {
                case 0:
                    if (this.f36690b == null) {
                        this.f36690b = a.cb.q(oVar, Date.class);
                    }
                    c90Var.f36332h = (Date) this.f36690b.c(aVar);
                    boolean[] zArr = c90Var.f36333i;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f36693e == null) {
                        this.f36693e = a.cb.q(oVar, String.class);
                    }
                    c90Var.f36325a = (String) this.f36693e.c(aVar);
                    boolean[] zArr2 = c90Var.f36333i;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f36693e == null) {
                        this.f36693e = a.cb.q(oVar, String.class);
                    }
                    c90Var.f36331g = (String) this.f36693e.c(aVar);
                    boolean[] zArr3 = c90Var.f36333i;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f36693e == null) {
                        this.f36693e = a.cb.q(oVar, String.class);
                    }
                    c90Var.f36327c = (String) this.f36693e.c(aVar);
                    boolean[] zArr4 = c90Var.f36333i;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f36690b == null) {
                        this.f36690b = a.cb.q(oVar, Date.class);
                    }
                    c90Var.f36328d = (Date) this.f36690b.c(aVar);
                    boolean[] zArr5 = c90Var.f36333i;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f36691c == null) {
                        this.f36691c = a.cb.q(oVar, Integer.class);
                    }
                    c90Var.f36330f = (Integer) this.f36691c.c(aVar);
                    boolean[] zArr6 = c90Var.f36333i;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f36692d == null) {
                        this.f36692d = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProfileHighlight$ProfileHighlightTypeAdapter$2
                        }).b();
                    }
                    c90Var.f36329e = (List) this.f36692d.c(aVar);
                    boolean[] zArr7 = c90Var.f36333i;
                    if (zArr7.length <= 4) {
                        break;
                    } else {
                        zArr7[4] = true;
                        break;
                    }
                case 7:
                    if (this.f36693e == null) {
                        this.f36693e = a.cb.q(oVar, String.class);
                    }
                    c90Var.f36326b = (String) this.f36693e.c(aVar);
                    boolean[] zArr8 = c90Var.f36333i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new f90(c90Var.f36325a, c90Var.f36326b, c90Var.f36327c, c90Var.f36328d, c90Var.f36329e, c90Var.f36330f, c90Var.f36331g, c90Var.f36332h, c90Var.f36333i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Date date;
        String str;
        Integer num;
        List list;
        Date date2;
        String str2;
        String str3;
        String str4;
        f90 f90Var = (f90) obj;
        if (f90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = f90Var.f37624i;
        int length = zArr.length;
        nm.o oVar = this.f36689a;
        if (length > 0 && zArr[0]) {
            if (this.f36693e == null) {
                this.f36693e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36693e;
            um.c h10 = cVar.h("id");
            str4 = f90Var.f37616a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36693e == null) {
                this.f36693e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36693e;
            um.c h13 = cVar.h("node_id");
            str3 = f90Var.f37617b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36693e == null) {
                this.f36693e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36693e;
            um.c h14 = cVar.h("cover_image");
            str2 = f90Var.f37618c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36690b == null) {
                this.f36690b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f36690b;
            um.c h15 = cVar.h("created_at");
            date2 = f90Var.f37619d;
            mVar4.e(h15, date2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36692d == null) {
                this.f36692d = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProfileHighlight$ProfileHighlightTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f36692d;
            um.c h16 = cVar.h("dominant_color");
            list = f90Var.f37620e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36691c == null) {
                this.f36691c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f36691c;
            um.c h17 = cVar.h("highlight_item_count");
            num = f90Var.f37621f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36693e == null) {
                this.f36693e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36693e;
            um.c h18 = cVar.h("title");
            str = f90Var.f37622g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36690b == null) {
                this.f36690b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar8 = this.f36690b;
            um.c h19 = cVar.h("updated_at");
            date = f90Var.f37623h;
            mVar8.e(h19, date);
        }
        cVar.g();
    }
}
