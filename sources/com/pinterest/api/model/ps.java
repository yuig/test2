package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ps extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41073a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41074b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41075c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41076d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41077e;

    public ps(nm.o oVar) {
        this.f41073a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        os osVar = new os(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2111507904:
                    if (k03.equals("is_inspirational")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1181954938:
                    if (k03.equals("profile_badges")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -351401914:
                    if (k03.equals("inspirational_badge_selection")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 210899012:
                    if (k03.equals("business_diversity_labels")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 331538854:
                    if (k03.equals("badge_details")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 988082886:
                    if (k03.equals("review_labels")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1718344382:
                    if (k03.equals("is_eligible_for_storefront_badges")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41073a;
            switch (c13) {
                case 0:
                    if (this.f41074b == null) {
                        this.f41074b = a.cb.q(oVar, Boolean.class);
                    }
                    osVar.f40791e = (Boolean) this.f41074b.c(aVar);
                    boolean[] zArr = osVar.f40794h;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f41077e == null) {
                        this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$7
                        }).b();
                    }
                    osVar.f40792f = (List) this.f41077e.c(aVar);
                    boolean[] zArr2 = osVar.f40794h;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f41075c == null) {
                        this.f41075c = a.cb.q(oVar, ns.class);
                    }
                    osVar.f40789c = (ns) this.f41075c.c(aVar);
                    boolean[] zArr3 = osVar.f40794h;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f41077e == null) {
                        this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$6
                        }).b();
                    }
                    osVar.f40788b = (List) this.f41077e.c(aVar);
                    boolean[] zArr4 = osVar.f40794h;
                    if (zArr4.length <= 1) {
                        break;
                    } else {
                        zArr4[1] = true;
                        break;
                    }
                case 4:
                    if (this.f41076d == null) {
                        this.f41076d = oVar.g(new TypeToken<List<js>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$5
                        }).b();
                    }
                    osVar.f40787a = (List) this.f41076d.c(aVar);
                    boolean[] zArr5 = osVar.f40794h;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f41077e == null) {
                        this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$8
                        }).b();
                    }
                    osVar.f40793g = (List) this.f41077e.c(aVar);
                    boolean[] zArr6 = osVar.f40794h;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f41074b == null) {
                        this.f41074b = a.cb.q(oVar, Boolean.class);
                    }
                    osVar.f40790d = (Boolean) this.f41074b.c(aVar);
                    boolean[] zArr7 = osVar.f40794h;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new rs(osVar.f40787a, osVar.f40788b, osVar.f40789c, osVar.f40790d, osVar.f40791e, osVar.f40792f, osVar.f40793g, osVar.f40794h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Boolean bool;
        Boolean bool2;
        ns nsVar;
        List list3;
        List list4;
        rs rsVar = (rs) obj;
        if (rsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rsVar.f41660h;
        int length = zArr.length;
        nm.o oVar = this.f41073a;
        if (length > 0 && zArr[0]) {
            if (this.f41076d == null) {
                this.f41076d = oVar.g(new TypeToken<List<js>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f41076d;
            um.c h10 = cVar.h("badge_details");
            list4 = rsVar.f41653a;
            mVar.e(h10, list4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41077e == null) {
                this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f41077e;
            um.c h13 = cVar.h("business_diversity_labels");
            list3 = rsVar.f41654b;
            mVar2.e(h13, list3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41075c == null) {
                this.f41075c = a.cb.q(oVar, ns.class);
            }
            nm.m mVar3 = this.f41075c;
            um.c h14 = cVar.h("inspirational_badge_selection");
            nsVar = rsVar.f41655c;
            mVar3.e(h14, nsVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41074b == null) {
                this.f41074b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f41074b;
            um.c h15 = cVar.h("is_eligible_for_storefront_badges");
            bool2 = rsVar.f41656d;
            mVar4.e(h15, bool2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41074b == null) {
                this.f41074b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f41074b;
            um.c h16 = cVar.h("is_inspirational");
            bool = rsVar.f41657e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41077e == null) {
                this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f41077e;
            um.c h17 = cVar.h("profile_badges");
            list2 = rsVar.f41658f;
            mVar6.e(h17, list2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41077e == null) {
                this.f41077e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.InspirationalMerchantData$InspirationalMerchantDataTypeAdapter$4
                }).b();
            }
            nm.m mVar7 = this.f41077e;
            um.c h18 = cVar.h("review_labels");
            list = rsVar.f41659g;
            mVar7.e(h18, list);
        }
        cVar.g();
    }
}
