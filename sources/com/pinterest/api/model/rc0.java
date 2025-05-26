package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class rc0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41546a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41547b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41548c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41549d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41550e;

    public rc0(nm.o oVar) {
        this.f41546a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qc0 qc0Var = new qc0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -906953308:
                    if (k03.equals("tab_type")) {
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
                case 96964:
                    if (k03.equals("aux")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 196970484:
                    if (k03.equals("tab_options")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 747804969:
                    if (k03.equals("position")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1499123548:
                    if (k03.equals("query_pin_id")) {
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
            boolean[] zArr = qc0Var.f41270i;
            nm.o oVar = this.f41546a;
            switch (c13) {
                case 0:
                    if (this.f41547b == null) {
                        this.f41547b = a.cb.q(oVar, Integer.class);
                    }
                    qc0Var.f41269h = (Integer) this.f41547b.c(aVar);
                    boolean[] zArr2 = qc0Var.f41270i;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 1:
                    if (this.f41550e == null) {
                        this.f41550e = a.cb.q(oVar, String.class);
                    }
                    qc0Var.f41262a = (String) this.f41550e.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 2:
                    if (this.f41549d == null) {
                        this.f41549d = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RelatedFilterTab$RelatedFilterTabTypeAdapter$3
                        }).b();
                    }
                    qc0Var.f41264c = (Map) this.f41549d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 3:
                    if (this.f41550e == null) {
                        this.f41550e = a.cb.q(oVar, String.class);
                    }
                    qc0Var.f41265d = (String) this.f41550e.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 4:
                    if (this.f41548c == null) {
                        this.f41548c = oVar.g(new TypeToken<List<xc0>>(this) { // from class: com.pinterest.api.model.RelatedFilterTab$RelatedFilterTabTypeAdapter$4
                        }).b();
                    }
                    qc0Var.f41268g = (List) this.f41548c.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 5:
                    if (this.f41547b == null) {
                        this.f41547b = a.cb.q(oVar, Integer.class);
                    }
                    qc0Var.f41266e = (Integer) this.f41547b.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 6:
                    if (this.f41550e == null) {
                        this.f41550e = a.cb.q(oVar, String.class);
                    }
                    qc0Var.f41267f = (String) this.f41550e.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 7:
                    if (this.f41550e == null) {
                        this.f41550e = a.cb.q(oVar, String.class);
                    }
                    qc0Var.f41263b = (String) this.f41550e.c(aVar);
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
        return new tc0(qc0Var.f41262a, qc0Var.f41263b, qc0Var.f41264c, qc0Var.f41265d, qc0Var.f41266e, qc0Var.f41267f, qc0Var.f41268g, qc0Var.f41269h, qc0Var.f41270i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        List list;
        String str;
        Integer num2;
        String str2;
        Map map;
        String str3;
        String str4;
        tc0 tc0Var = (tc0) obj;
        if (tc0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tc0Var.f42165i;
        int length = zArr.length;
        nm.o oVar = this.f41546a;
        if (length > 0 && zArr[0]) {
            if (this.f41550e == null) {
                this.f41550e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41550e;
            um.c h10 = cVar.h("id");
            str4 = tc0Var.f42157a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41550e == null) {
                this.f41550e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41550e;
            um.c h13 = cVar.h("node_id");
            str3 = tc0Var.f42158b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41549d == null) {
                this.f41549d = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.RelatedFilterTab$RelatedFilterTabTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41549d;
            um.c h14 = cVar.h("aux");
            map = tc0Var.f42159c;
            mVar3.e(h14, map);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41550e == null) {
                this.f41550e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41550e;
            um.c h15 = cVar.h("name");
            str2 = tc0Var.f42160d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41547b == null) {
                this.f41547b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41547b;
            um.c h16 = cVar.h("position");
            num2 = tc0Var.f42161e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41550e == null) {
                this.f41550e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41550e;
            um.c h17 = cVar.h("query_pin_id");
            str = tc0Var.f42162f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41548c == null) {
                this.f41548c = oVar.g(new TypeToken<List<xc0>>(this) { // from class: com.pinterest.api.model.RelatedFilterTab$RelatedFilterTabTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f41548c;
            um.c h18 = cVar.h("tab_options");
            list = tc0Var.f42163g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41547b == null) {
                this.f41547b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f41547b;
            um.c h19 = cVar.h("tab_type");
            num = tc0Var.f42164h;
            mVar8.e(h19, num);
        }
        cVar.g();
    }
}
