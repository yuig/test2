package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class r5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41482a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41483b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41484c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41485d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41486e;

    public r5(nm.o oVar) {
        this.f41482a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t5 t5Var = new t5(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1664948687:
                    if (k03.equals("paid_list")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1575211972:
                    if (k03.equals("pin_format_list")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1277550002:
                    if (k03.equals("in_profile_list")) {
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
                case 3433164:
                    if (k03.equals("paid")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1638221967:
                    if (k03.equals("in_profile")) {
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
                case 2123209860:
                    if (k03.equals("canonicalized")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41482a;
            switch (c13) {
                case 0:
                    if (this.f41484c == null) {
                        this.f41484c = oVar.g(new TypeToken<List<Boolean>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$5
                        }).b();
                    }
                    t5Var.f42096g = (List) this.f41484c.c(aVar);
                    boolean[] zArr = t5Var.f42098i;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f41485d == null) {
                        this.f41485d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$6
                        }).b();
                    }
                    t5Var.f42097h = (List) this.f41485d.c(aVar);
                    boolean[] zArr2 = t5Var.f42098i;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 2:
                    if (this.f41484c == null) {
                        this.f41484c = oVar.g(new TypeToken<List<Boolean>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$4
                        }).b();
                    }
                    t5Var.f42094e = (List) this.f41484c.c(aVar);
                    boolean[] zArr3 = t5Var.f42098i;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f41486e == null) {
                        this.f41486e = a.cb.q(oVar, String.class);
                    }
                    t5Var.f42090a = (String) this.f41486e.c(aVar);
                    boolean[] zArr4 = t5Var.f42098i;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f41483b == null) {
                        this.f41483b = a.cb.q(oVar, Boolean.class);
                    }
                    t5Var.f42095f = (Boolean) this.f41483b.c(aVar);
                    boolean[] zArr5 = t5Var.f42098i;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f41483b == null) {
                        this.f41483b = a.cb.q(oVar, Boolean.class);
                    }
                    t5Var.f42093d = (Boolean) this.f41483b.c(aVar);
                    boolean[] zArr6 = t5Var.f42098i;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f41486e == null) {
                        this.f41486e = a.cb.q(oVar, String.class);
                    }
                    t5Var.f42091b = (String) this.f41486e.c(aVar);
                    boolean[] zArr7 = t5Var.f42098i;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                case 7:
                    if (this.f41483b == null) {
                        this.f41483b = a.cb.q(oVar, Boolean.class);
                    }
                    t5Var.f42092c = (Boolean) this.f41483b.c(aVar);
                    boolean[] zArr8 = t5Var.f42098i;
                    if (zArr8.length <= 2) {
                        break;
                    } else {
                        zArr8[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new u5(t5Var.f42090a, t5Var.f42091b, t5Var.f42092c, t5Var.f42093d, t5Var.f42094e, t5Var.f42095f, t5Var.f42096g, t5Var.f42097h, t5Var.f42098i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Boolean bool;
        List list3;
        Boolean bool2;
        Boolean bool3;
        String str;
        String str2;
        u5 u5Var = (u5) obj;
        if (u5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = u5Var.f42416i;
        int length = zArr.length;
        nm.o oVar = this.f41482a;
        if (length > 0 && zArr[0]) {
            if (this.f41486e == null) {
                this.f41486e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41486e;
            um.c h10 = cVar.h("id");
            str2 = u5Var.f42408a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41486e == null) {
                this.f41486e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41486e;
            um.c h13 = cVar.h("node_id");
            str = u5Var.f42409b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41483b == null) {
                this.f41483b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f41483b;
            um.c h14 = cVar.h("canonicalized");
            bool3 = u5Var.f42410c;
            mVar3.e(h14, bool3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41483b == null) {
                this.f41483b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f41483b;
            um.c h15 = cVar.h("in_profile");
            bool2 = u5Var.f42411d;
            mVar4.e(h15, bool2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41484c == null) {
                this.f41484c = oVar.g(new TypeToken<List<Boolean>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f41484c;
            um.c h16 = cVar.h("in_profile_list");
            list3 = u5Var.f42412e;
            mVar5.e(h16, list3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41483b == null) {
                this.f41483b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f41483b;
            um.c h17 = cVar.h("paid");
            bool = u5Var.f42413f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41484c == null) {
                this.f41484c = oVar.g(new TypeToken<List<Boolean>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$2
                }).b();
            }
            nm.m mVar7 = this.f41484c;
            um.c h18 = cVar.h("paid_list");
            list2 = u5Var.f42414g;
            mVar7.e(h18, list2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41485d == null) {
                this.f41485d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.AnalyticsTopPinMetadata$AnalyticsTopPinMetadataTypeAdapter$3
                }).b();
            }
            nm.m mVar8 = this.f41485d;
            um.c h19 = cVar.h("pin_format_list");
            list = u5Var.f42415h;
            mVar8.e(h19, list);
        }
        cVar.g();
    }
}
