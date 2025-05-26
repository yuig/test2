package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class k70 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39327a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39328b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39329c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39330d;

    public k70(nm.o oVar) {
        this.f39327a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j70 j70Var = new j70(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1818175791:
                    if (k03.equals("filter_title")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -881372350:
                    if (k03.equals("filter_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -255142567:
                    if (k03.equals("color_swatch_items")) {
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
                case 1135287201:
                    if (k03.equals("standard_list_items")) {
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
            nm.o oVar = this.f39327a;
            if (c13 == 0) {
                if (this.f39330d == null) {
                    this.f39330d = a.cb.q(oVar, String.class);
                }
                j70Var.f38997e = (String) this.f39330d.c(aVar);
                boolean[] zArr = j70Var.f38999g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f39330d == null) {
                    this.f39330d = a.cb.q(oVar, String.class);
                }
                j70Var.f38996d = (String) this.f39330d.c(aVar);
                boolean[] zArr2 = j70Var.f38999g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f39328b == null) {
                    this.f39328b = oVar.g(new TypeToken<List<ll>>(this) { // from class: com.pinterest.api.model.ProductFilterItem$ProductFilterItemTypeAdapter$3
                    }).b();
                }
                j70Var.f38995c = (List) this.f39328b.c(aVar);
                boolean[] zArr3 = j70Var.f38999g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f39330d == null) {
                    this.f39330d = a.cb.q(oVar, String.class);
                }
                j70Var.f38993a = (String) this.f39330d.c(aVar);
                boolean[] zArr4 = j70Var.f38999g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f39329c == null) {
                    this.f39329c = oVar.g(new TypeToken<List<tl>>(this) { // from class: com.pinterest.api.model.ProductFilterItem$ProductFilterItemTypeAdapter$4
                    }).b();
                }
                j70Var.f38998f = (List) this.f39329c.c(aVar);
                boolean[] zArr5 = j70Var.f38999g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39330d == null) {
                    this.f39330d = a.cb.q(oVar, String.class);
                }
                j70Var.f38994b = (String) this.f39330d.c(aVar);
                boolean[] zArr6 = j70Var.f38999g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new m70(j70Var.f38993a, j70Var.f38994b, j70Var.f38995c, j70Var.f38996d, j70Var.f38997e, j70Var.f38998f, j70Var.f38999g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        List list2;
        String str3;
        String str4;
        m70 m70Var = (m70) obj;
        if (m70Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m70Var.f40020g;
        int length = zArr.length;
        nm.o oVar = this.f39327a;
        if (length > 0 && zArr[0]) {
            if (this.f39330d == null) {
                this.f39330d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39330d;
            um.c h10 = cVar.h("id");
            str4 = m70Var.f40014a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39330d == null) {
                this.f39330d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39330d;
            um.c h13 = cVar.h("node_id");
            str3 = m70Var.f40015b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39328b == null) {
                this.f39328b = oVar.g(new TypeToken<List<ll>>(this) { // from class: com.pinterest.api.model.ProductFilterItem$ProductFilterItemTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f39328b;
            um.c h14 = cVar.h("color_swatch_items");
            list2 = m70Var.f40016c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39330d == null) {
                this.f39330d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f39330d;
            um.c h15 = cVar.h("filter_id");
            str2 = m70Var.f40017d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39330d == null) {
                this.f39330d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39330d;
            um.c h16 = cVar.h("filter_title");
            str = m70Var.f40018e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39329c == null) {
                this.f39329c = oVar.g(new TypeToken<List<tl>>(this) { // from class: com.pinterest.api.model.ProductFilterItem$ProductFilterItemTypeAdapter$2
                }).b();
            }
            nm.m mVar6 = this.f39329c;
            um.c h17 = cVar.h("standard_list_items");
            list = m70Var.f40019f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}
