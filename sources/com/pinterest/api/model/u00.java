package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class u00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42374a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42375b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42376c;

    public u00(nm.o oVar) {
        this.f42374a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t00 t00Var = new t00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2007878333:
                    if (k03.equals("partner_order_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1438538376:
                    if (k03.equals("current_status")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -587135674:
                    if (k03.equals("order_line_items")) {
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
                case 1059396110:
                    if (k03.equals("formatted_create_date")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1476687906:
                    if (k03.equals("order_confirmation_number")) {
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
            nm.o oVar = this.f42374a;
            switch (c13) {
                case 0:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42040g = (String) this.f42376c.c(aVar);
                    boolean[] zArr = t00Var.f42041h;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42036c = (String) this.f42376c.c(aVar);
                    boolean[] zArr2 = t00Var.f42041h;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f42375b == null) {
                        this.f42375b = oVar.g(new TypeToken<List<a10>>(this) { // from class: com.pinterest.api.model.Order$OrderTypeAdapter$2
                        }).b();
                    }
                    t00Var.f42039f = (List) this.f42375b.c(aVar);
                    boolean[] zArr3 = t00Var.f42041h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42034a = (String) this.f42376c.c(aVar);
                    boolean[] zArr4 = t00Var.f42041h;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42037d = (String) this.f42376c.c(aVar);
                    boolean[] zArr5 = t00Var.f42041h;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42038e = (String) this.f42376c.c(aVar);
                    boolean[] zArr6 = t00Var.f42041h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f42376c == null) {
                        this.f42376c = a.cb.q(oVar, String.class);
                    }
                    t00Var.f42035b = (String) this.f42376c.c(aVar);
                    boolean[] zArr7 = t00Var.f42041h;
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
        return new w00(t00Var.f42034a, t00Var.f42035b, t00Var.f42036c, t00Var.f42037d, t00Var.f42038e, t00Var.f42039f, t00Var.f42040g, t00Var.f42041h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        w00 w00Var = (w00) obj;
        if (w00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = w00Var.f43131h;
        int length = zArr.length;
        nm.o oVar = this.f42374a;
        if (length > 0 && zArr[0]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42376c;
            um.c h10 = cVar.h("id");
            str6 = w00Var.f43124a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42376c;
            um.c h13 = cVar.h("node_id");
            str5 = w00Var.f43125b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42376c;
            um.c h14 = cVar.h("current_status");
            str4 = w00Var.f43126c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42376c;
            um.c h15 = cVar.h("formatted_create_date");
            str3 = w00Var.f43127d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42376c;
            um.c h16 = cVar.h("order_confirmation_number");
            str2 = w00Var.f43128e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42375b == null) {
                this.f42375b = oVar.g(new TypeToken<List<a10>>(this) { // from class: com.pinterest.api.model.Order$OrderTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f42375b;
            um.c h17 = cVar.h("order_line_items");
            list = w00Var.f43129f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42376c == null) {
                this.f42376c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42376c;
            um.c h18 = cVar.h("partner_order_id");
            str = w00Var.f43130g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
