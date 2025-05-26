package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class s1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41751a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41752b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41753c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41754d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41755e;

    public s1(nm.o oVar) {
        this.f41751a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u1 u1Var = new u1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 161931578:
                    if (k03.equals("relatedPinPromotions")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 955826371:
                    if (k03.equals("metrics")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1112900681:
                    if (k03.equals("relatedPins")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41751a;
            if (c13 == 0) {
                if (this.f41755e == null) {
                    this.f41755e = a.cb.q(oVar, String.class);
                }
                u1Var.f42380a = (String) this.f41755e.c(aVar);
                boolean[] zArr = u1Var.f42385f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f41754d == null) {
                    this.f41754d = oVar.g(new TypeToken<Map<String, d2>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$5
                    }).b();
                }
                u1Var.f42383d = (Map) this.f41754d.c(aVar);
                boolean[] zArr2 = u1Var.f42385f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f41752b == null) {
                    this.f41752b = oVar.g(new TypeToken<List<r1>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$4
                    }).b();
                }
                u1Var.f42382c = (List) this.f41752b.c(aVar);
                boolean[] zArr3 = u1Var.f42385f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f41753c == null) {
                    this.f41753c = oVar.g(new TypeToken<Map<String, z1>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$6
                    }).b();
                }
                u1Var.f42384e = (Map) this.f41753c.c(aVar);
                boolean[] zArr4 = u1Var.f42385f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41755e == null) {
                    this.f41755e = a.cb.q(oVar, String.class);
                }
                u1Var.f42381b = (String) this.f41755e.c(aVar);
                boolean[] zArr5 = u1Var.f42385f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new v1(u1Var.f42380a, u1Var.f42381b, u1Var.f42382c, u1Var.f42383d, u1Var.f42384e, u1Var.f42385f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        Map map2;
        List list;
        String str;
        String str2;
        v1 v1Var = (v1) obj;
        if (v1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = v1Var.f42698f;
        int length = zArr.length;
        nm.o oVar = this.f41751a;
        if (length > 0 && zArr[0]) {
            if (this.f41755e == null) {
                this.f41755e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41755e;
            um.c h10 = cVar.h("id");
            str2 = v1Var.f42693a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41755e == null) {
                this.f41755e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41755e;
            um.c h13 = cVar.h("node_id");
            str = v1Var.f42694b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41752b == null) {
                this.f41752b = oVar.g(new TypeToken<List<r1>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41752b;
            um.c h14 = cVar.h("metrics");
            list = v1Var.f42695c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41754d == null) {
                this.f41754d = oVar.g(new TypeToken<Map<String, d2>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f41754d;
            um.c h15 = cVar.h("relatedPinPromotions");
            map2 = v1Var.f42696d;
            mVar4.e(h15, map2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41753c == null) {
                this.f41753c = oVar.g(new TypeToken<Map<String, z1>>(this) { // from class: com.pinterest.api.model.AdsPromotions$AdsPromotionsTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f41753c;
            um.c h16 = cVar.h("relatedPins");
            map = v1Var.f42697e;
            mVar5.e(h16, map);
        }
        cVar.g();
    }
}
