package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.mv;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nv extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40491a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40492b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40493c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40494d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40495e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40496f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40497g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f40498h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f40499i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f40500j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f40501k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f40502l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f40503m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f40504n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f40505o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f40506p;

    /* renamed from: q, reason: collision with root package name */
    public nm.m f40507q;

    public nv(nm.o oVar) {
        this.f40491a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lv C = mv.C();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1286065038:
                    if (k03.equals("message_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1122997398:
                    if (k03.equals("reactions")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -905962955:
                    if (k03.equals("sender")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -874443254:
                    if (k03.equals("thread")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -250550921:
                    if (k03.equals("message_context")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -208974838:
                    if (k03.equals("user_did_it_data")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 93908710:
                    if (k03.equals("board")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 451643427:
                    if (k03.equals("event_users")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 740154499:
                    if (k03.equals("conversation")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 817722242:
                    if (k03.equals("is_pending")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 984376767:
                    if (k03.equals("event_type")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case 1765056061:
                    if (k03.equals("deleted_by")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 18;
                        break;
                    }
                    break;
            }
            boolean[] zArr = C.f39925t;
            nm.o oVar = this.f40491a;
            switch (c13) {
                case 0:
                    if (this.f40503m == null) {
                        this.f40503m = a.cb.q(oVar, mv.c.class);
                    }
                    C.f39916k = (mv.c) this.f40503m.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case 1:
                    if (this.f40500j == null) {
                        this.f40500j = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$6
                        }).b();
                    }
                    C.f((Map) this.f40500j.c(aVar));
                    break;
                case 2:
                    if (this.f40506p == null) {
                        this.f40506p = a.cb.q(oVar, wy0.class);
                    }
                    C.g((wy0) this.f40506p.c(aVar));
                    break;
                case 3:
                    if (this.f40495e == null) {
                        this.f40495e = a.cb.q(oVar, cf.class);
                    }
                    C.f39922q = (cf) this.f40495e.c(aVar);
                    if (zArr.length <= 16) {
                        break;
                    } else {
                        zArr[16] = true;
                        break;
                    }
                case 4:
                    if (this.f40502l == null) {
                        this.f40502l = a.cb.q(oVar, mv.b.class);
                    }
                    C.f39915j = (mv.b) this.f40502l.c(aVar);
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 5:
                    if (this.f40507q == null) {
                        this.f40507q = a.cb.q(oVar, az0.class);
                    }
                    C.f39924s = (az0) this.f40507q.c(aVar);
                    if (zArr.length <= 18) {
                        break;
                    } else {
                        zArr[18] = true;
                        break;
                    }
                case 6:
                    if (this.f40505o == null) {
                        this.f40505o = a.cb.q(oVar, String.class);
                    }
                    C.i((String) this.f40505o.c(aVar));
                    break;
                case 7:
                    if (this.f40504n == null) {
                        this.f40504n = a.cb.q(oVar, f30.class);
                    }
                    C.e((f30) this.f40504n.c(aVar));
                    break;
                case '\b':
                    if (this.f40498h == null) {
                        this.f40498h = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$5
                        }).b();
                    }
                    C.f39918m = (List) this.f40498h.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case '\t':
                    if (this.f40505o == null) {
                        this.f40505o = a.cb.q(oVar, String.class);
                    }
                    C.h((String) this.f40505o.c(aVar));
                    break;
                case '\n':
                    if (this.f40506p == null) {
                        this.f40506p = a.cb.q(oVar, wy0.class);
                    }
                    C.f39923r = (wy0) this.f40506p.c(aVar);
                    if (zArr.length <= 17) {
                        break;
                    } else {
                        zArr[17] = true;
                        break;
                    }
                case 11:
                    if (this.f40492b == null) {
                        this.f40492b = a.cb.q(oVar, v7.class);
                    }
                    C.f39908c = (v7) this.f40492b.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case '\f':
                    if (this.f40499i == null) {
                        this.f40499i = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$4
                        }).b();
                    }
                    C.f39913h = (List) this.f40499i.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case '\r':
                    if (this.f40494d == null) {
                        this.f40494d = a.cb.q(oVar, ue.class);
                    }
                    C.f39909d = (ue) this.f40494d.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 14:
                    if (this.f40493c == null) {
                        this.f40493c = a.cb.q(oVar, Boolean.class);
                    }
                    C.d((Boolean) this.f40493c.c(aVar));
                    break;
                case 15:
                    if (this.f40501k == null) {
                        this.f40501k = a.cb.q(oVar, mv.a.class);
                    }
                    C.f39912g = (mv.a) this.f40501k.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 16:
                    if (this.f40496f == null) {
                        this.f40496f = a.cb.q(oVar, Date.class);
                    }
                    C.c((Date) this.f40496f.c(aVar));
                    break;
                case 17:
                    if (this.f40497g == null) {
                        this.f40497g = a.cb.q(oVar, Integer.class);
                    }
                    C.f39911f = (Integer) this.f40497g.c(aVar);
                    boolean[] zArr2 = C.f39925t;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 18:
                    if (this.f40505o == null) {
                        this.f40505o = a.cb.q(oVar, String.class);
                    }
                    C.f39907b = (String) this.f40505o.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return C.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        az0 az0Var;
        wy0 wy0Var;
        cf cfVar;
        String str;
        wy0 wy0Var2;
        Map map;
        List list;
        f30 f30Var;
        mv.c cVar2;
        mv.b bVar;
        Boolean bool;
        List list2;
        mv.a aVar;
        Integer num;
        Date date;
        ue ueVar;
        v7 v7Var;
        String str2;
        String str3;
        mv mvVar = (mv) obj;
        if (mvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mvVar.f40245t;
        int length = zArr.length;
        nm.o oVar = this.f40491a;
        if (length > 0 && zArr[0]) {
            if (this.f40505o == null) {
                this.f40505o = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40505o;
            um.c h10 = cVar.h("id");
            str3 = mvVar.f40226a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40505o == null) {
                this.f40505o = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40505o;
            um.c h13 = cVar.h("node_id");
            str2 = mvVar.f40227b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40492b == null) {
                this.f40492b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f40492b;
            um.c h14 = cVar.h("board");
            v7Var = mvVar.f40228c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40494d == null) {
                this.f40494d = a.cb.q(oVar, ue.class);
            }
            nm.m mVar4 = this.f40494d;
            um.c h15 = cVar.h("conversation");
            ueVar = mvVar.f40229d;
            mVar4.e(h15, ueVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40496f == null) {
                this.f40496f = a.cb.q(oVar, Date.class);
            }
            nm.m mVar5 = this.f40496f;
            um.c h16 = cVar.h("created_at");
            date = mvVar.f40230e;
            mVar5.e(h16, date);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40497g == null) {
                this.f40497g = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f40497g;
            um.c h17 = cVar.h("deleted_by");
            num = mvVar.f40231f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40501k == null) {
                this.f40501k = a.cb.q(oVar, mv.a.class);
            }
            nm.m mVar7 = this.f40501k;
            um.c h18 = cVar.h("event_type");
            aVar = mvVar.f40232g;
            mVar7.e(h18, aVar);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40499i == null) {
                this.f40499i = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$1
                }).b();
            }
            nm.m mVar8 = this.f40499i;
            um.c h19 = cVar.h("event_users");
            list2 = mvVar.f40233h;
            mVar8.e(h19, list2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40493c == null) {
                this.f40493c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f40493c;
            um.c h23 = cVar.h("is_pending");
            bool = mvVar.f40234i;
            mVar9.e(h23, bool);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40502l == null) {
                this.f40502l = a.cb.q(oVar, mv.b.class);
            }
            nm.m mVar10 = this.f40502l;
            um.c h24 = cVar.h("message_context");
            bVar = mvVar.f40235j;
            mVar10.e(h24, bVar);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40503m == null) {
                this.f40503m = a.cb.q(oVar, mv.c.class);
            }
            nm.m mVar11 = this.f40503m;
            um.c h25 = cVar.h("message_type");
            cVar2 = mvVar.f40236k;
            mVar11.e(h25, cVar2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40504n == null) {
                this.f40504n = a.cb.q(oVar, f30.class);
            }
            nm.m mVar12 = this.f40504n;
            um.c h26 = cVar.h("pin");
            f30Var = mvVar.f40237l;
            mVar12.e(h26, f30Var);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f40498h == null) {
                this.f40498h = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$2
                }).b();
            }
            nm.m mVar13 = this.f40498h;
            um.c h27 = cVar.h("pins");
            list = mvVar.f40238m;
            mVar13.e(h27, list);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f40500j == null) {
                this.f40500j = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.Message$MessageTypeAdapter$3
                }).b();
            }
            nm.m mVar14 = this.f40500j;
            um.c h28 = cVar.h("reactions");
            map = mvVar.f40239n;
            mVar14.e(h28, map);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f40506p == null) {
                this.f40506p = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar15 = this.f40506p;
            um.c h29 = cVar.h("sender");
            wy0Var2 = mvVar.f40240o;
            mVar15.e(h29, wy0Var2);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f40505o == null) {
                this.f40505o = a.cb.q(oVar, String.class);
            }
            nm.m mVar16 = this.f40505o;
            um.c h33 = cVar.h("text");
            str = mvVar.f40241p;
            mVar16.e(h33, str);
        }
        if (zArr.length > 16 && zArr[16]) {
            if (this.f40495e == null) {
                this.f40495e = a.cb.q(oVar, cf.class);
            }
            nm.m mVar17 = this.f40495e;
            um.c h34 = cVar.h("thread");
            cfVar = mvVar.f40242q;
            mVar17.e(h34, cfVar);
        }
        if (zArr.length > 17 && zArr[17]) {
            if (this.f40506p == null) {
                this.f40506p = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar18 = this.f40506p;
            um.c h35 = cVar.h("user");
            wy0Var = mvVar.f40243r;
            mVar18.e(h35, wy0Var);
        }
        if (zArr.length > 18 && zArr[18]) {
            if (this.f40507q == null) {
                this.f40507q = a.cb.q(oVar, az0.class);
            }
            nm.m mVar19 = this.f40507q;
            um.c h36 = cVar.h("user_did_it_data");
            az0Var = mvVar.f40244s;
            mVar19.e(h36, az0Var);
        }
        cVar.g();
    }
}
