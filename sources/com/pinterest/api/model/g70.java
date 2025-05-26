package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class g70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37977a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37978b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37979c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37980d;

    public g70(nm.o oVar) {
        this.f37977a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f70 f70Var = new f70(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1842455553:
                    if (k03.equals("brand_name_filters")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1828021191:
                    if (k03.equals("filter_items")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1394873252:
                    if (k03.equals("price_bucket_filters")) {
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
                case 945327956:
                    if (k03.equals("color_swatch_filters")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37977a;
            if (c13 == 0) {
                if (this.f37978b == null) {
                    this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$5
                    }).b();
                }
                f70Var.f37583c = (List) this.f37978b.c(aVar);
                boolean[] zArr = f70Var.f37587g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f37979c == null) {
                    this.f37979c = oVar.g(new TypeToken<List<m70>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$7
                    }).b();
                }
                f70Var.f37585e = (List) this.f37979c.c(aVar);
                boolean[] zArr2 = f70Var.f37587g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f37978b == null) {
                    this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$8
                    }).b();
                }
                f70Var.f37586f = (List) this.f37978b.c(aVar);
                boolean[] zArr3 = f70Var.f37587g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f37980d == null) {
                    this.f37980d = a.cb.q(oVar, String.class);
                }
                f70Var.f37581a = (String) this.f37980d.c(aVar);
                boolean[] zArr4 = f70Var.f37587g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f37978b == null) {
                    this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$6
                    }).b();
                }
                f70Var.f37584d = (List) this.f37978b.c(aVar);
                boolean[] zArr5 = f70Var.f37587g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f37980d == null) {
                    this.f37980d = a.cb.q(oVar, String.class);
                }
                f70Var.f37582b = (String) this.f37980d.c(aVar);
                boolean[] zArr6 = f70Var.f37587g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new i70(f70Var.f37581a, f70Var.f37582b, f70Var.f37583c, f70Var.f37584d, f70Var.f37585e, f70Var.f37586f, f70Var.f37587g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        List list3;
        List list4;
        String str;
        String str2;
        i70 i70Var = (i70) obj;
        if (i70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = i70Var.f38694g;
        int length = zArr.length;
        nm.o oVar = this.f37977a;
        if (length > 0 && zArr[0]) {
            if (this.f37980d == null) {
                this.f37980d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37980d;
            um.c h10 = cVar.h("id");
            str2 = i70Var.f38688a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37980d == null) {
                this.f37980d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37980d;
            um.c h13 = cVar.h("node_id");
            str = i70Var.f38689b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37978b == null) {
                this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f37978b;
            um.c h14 = cVar.h("brand_name_filters");
            list4 = i70Var.f38690c;
            mVar3.e(h14, list4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37978b == null) {
                this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f37978b;
            um.c h15 = cVar.h("color_swatch_filters");
            list3 = i70Var.f38691d;
            mVar4.e(h15, list3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37979c == null) {
                this.f37979c = oVar.g(new TypeToken<List<m70>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f37979c;
            um.c h16 = cVar.h("filter_items");
            list2 = i70Var.f38692e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37978b == null) {
                this.f37978b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.ProductFilter$ProductFilterTypeAdapter$4
                }).b();
            }
            nm.m mVar6 = this.f37978b;
            um.c h17 = cVar.h("price_bucket_filters");
            list = i70Var.f38693f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}
