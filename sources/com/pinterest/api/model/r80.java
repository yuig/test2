package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41509a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41510b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41511c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41512d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41513e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41514f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41515g;

    public r80(nm.o oVar) {
        this.f41509a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        q80 q80Var = new q80(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1891535471:
                    if (k03.equals("has_checkout_variant")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1249574770:
                    if (k03.equals("variants")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -802245823:
                    if (k03.equals("primary_dimension_thumbnail_images")) {
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
                case 681898472:
                    if (k03.equals("dimension_metadata")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1451842409:
                    if (k03.equals("primary_dimension")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1911656176:
                    if (k03.equals("variant_reps")) {
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
            nm.o oVar = this.f41509a;
            switch (c13) {
                case 0:
                    if (this.f41510b == null) {
                        this.f41510b = a.cb.q(oVar, Boolean.class);
                    }
                    q80Var.f41234d = (Boolean) this.f41510b.c(aVar);
                    boolean[] zArr = q80Var.f41239i;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f41513e == null) {
                        this.f41513e = oVar.g(new TypeToken<List<p80>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$8
                        }).b();
                    }
                    q80Var.f41238h = (List) this.f41513e.c(aVar);
                    boolean[] zArr2 = q80Var.f41239i;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 2:
                    if (this.f41514f == null) {
                        this.f41514f = oVar.g(new TypeToken<Map<String, i40>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$6
                        }).b();
                    }
                    q80Var.f41236f = (Map) this.f41514f.c(aVar);
                    boolean[] zArr3 = q80Var.f41239i;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f41515g == null) {
                        this.f41515g = a.cb.q(oVar, String.class);
                    }
                    q80Var.f41231a = (String) this.f41515g.c(aVar);
                    boolean[] zArr4 = q80Var.f41239i;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f41511c == null) {
                        this.f41511c = oVar.g(new TypeToken<List<ah>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$5
                        }).b();
                    }
                    q80Var.f41233c = (List) this.f41511c.c(aVar);
                    boolean[] zArr5 = q80Var.f41239i;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f41515g == null) {
                        this.f41515g = a.cb.q(oVar, String.class);
                    }
                    q80Var.f41235e = (String) this.f41515g.c(aVar);
                    boolean[] zArr6 = q80Var.f41239i;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f41512d == null) {
                        this.f41512d = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$7
                        }).b();
                    }
                    q80Var.f41237g = (List) this.f41512d.c(aVar);
                    boolean[] zArr7 = q80Var.f41239i;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f41515g == null) {
                        this.f41515g = a.cb.q(oVar, String.class);
                    }
                    q80Var.f41232b = (String) this.f41515g.c(aVar);
                    boolean[] zArr8 = q80Var.f41239i;
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
        return new t80(q80Var.f41231a, q80Var.f41232b, q80Var.f41233c, q80Var.f41234d, q80Var.f41235e, q80Var.f41236f, q80Var.f41237g, q80Var.f41238h, q80Var.f41239i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Map map;
        String str;
        Boolean bool;
        List list3;
        String str2;
        String str3;
        t80 t80Var = (t80) obj;
        if (t80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = t80Var.f42130i;
        int length = zArr.length;
        nm.o oVar = this.f41509a;
        if (length > 0 && zArr[0]) {
            if (this.f41515g == null) {
                this.f41515g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41515g;
            um.c h10 = cVar.h("id");
            str3 = t80Var.f42122a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41515g == null) {
                this.f41515g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41515g;
            um.c h13 = cVar.h("node_id");
            str2 = t80Var.f42123b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41511c == null) {
                this.f41511c = oVar.g(new TypeToken<List<ah>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41511c;
            um.c h14 = cVar.h("dimension_metadata");
            list3 = t80Var.f42124c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41510b == null) {
                this.f41510b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f41510b;
            um.c h15 = cVar.h("has_checkout_variant");
            bool = t80Var.f42125d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41515g == null) {
                this.f41515g = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41515g;
            um.c h16 = cVar.h("primary_dimension");
            str = t80Var.f42126e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41514f == null) {
                this.f41514f = oVar.g(new TypeToken<Map<String, i40>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$2
                }).b();
            }
            nm.m mVar6 = this.f41514f;
            um.c h17 = cVar.h("primary_dimension_thumbnail_images");
            map = t80Var.f42127f;
            mVar6.e(h17, map);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41512d == null) {
                this.f41512d = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$3
                }).b();
            }
            nm.m mVar7 = this.f41512d;
            um.c h18 = cVar.h("variant_reps");
            list2 = t80Var.f42128g;
            mVar7.e(h18, list2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41513e == null) {
                this.f41513e = oVar.g(new TypeToken<List<p80>>(this) { // from class: com.pinterest.api.model.ProductVariantSet$ProductVariantSetTypeAdapter$4
                }).b();
            }
            nm.m mVar8 = this.f41513e;
            um.c h19 = cVar.h("variants");
            list = t80Var.f42129h;
            mVar8.e(h19, list);
        }
        cVar.g();
    }
}
