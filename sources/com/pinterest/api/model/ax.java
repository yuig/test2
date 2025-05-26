package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ax extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35883a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35884b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35885c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35886d;

    public ax(nm.o oVar) {
        this.f35883a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zw zwVar = new zw(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1865302637:
                    if (k03.equals("eligible_filters")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -615513385:
                    if (k03.equals("modifier")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -476880422:
                    if (k03.equals("base_query")) {
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
                case 842531031:
                    if (k03.equals("filter_options")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1927914714:
                    if (k03.equals("original_query")) {
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
            nm.o oVar = this.f35883a;
            switch (c13) {
                case 0:
                    if (this.f35885c == null) {
                        this.f35885c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ModifiedSearchFilter$ModifiedSearchFilterTypeAdapter$3
                        }).b();
                    }
                    zwVar.f44496d = (List) this.f35885c.c(aVar);
                    boolean[] zArr = zwVar.f44500h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f35886d == null) {
                        this.f35886d = a.cb.q(oVar, String.class);
                    }
                    zwVar.f44498f = (String) this.f35886d.c(aVar);
                    boolean[] zArr2 = zwVar.f44500h;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f35886d == null) {
                        this.f35886d = a.cb.q(oVar, String.class);
                    }
                    zwVar.f44495c = (String) this.f35886d.c(aVar);
                    boolean[] zArr3 = zwVar.f44500h;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f35886d == null) {
                        this.f35886d = a.cb.q(oVar, String.class);
                    }
                    zwVar.f44493a = (String) this.f35886d.c(aVar);
                    boolean[] zArr4 = zwVar.f44500h;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f35884b == null) {
                        this.f35884b = oVar.g(new TypeToken<List<dh0>>(this) { // from class: com.pinterest.api.model.ModifiedSearchFilter$ModifiedSearchFilterTypeAdapter$4
                        }).b();
                    }
                    zwVar.f44497e = (List) this.f35884b.c(aVar);
                    boolean[] zArr5 = zwVar.f44500h;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f35886d == null) {
                        this.f35886d = a.cb.q(oVar, String.class);
                    }
                    zwVar.f44499g = (String) this.f35886d.c(aVar);
                    boolean[] zArr6 = zwVar.f44500h;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f35886d == null) {
                        this.f35886d = a.cb.q(oVar, String.class);
                    }
                    zwVar.f44494b = (String) this.f35886d.c(aVar);
                    boolean[] zArr7 = zwVar.f44500h;
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
        return new cx(zwVar.f44493a, zwVar.f44494b, zwVar.f44495c, zwVar.f44496d, zwVar.f44497e, zwVar.f44498f, zwVar.f44499g, zwVar.f44500h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        List list2;
        String str3;
        String str4;
        String str5;
        cx cxVar = (cx) obj;
        if (cxVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cxVar.f36551h;
        int length = zArr.length;
        nm.o oVar = this.f35883a;
        if (length > 0 && zArr[0]) {
            if (this.f35886d == null) {
                this.f35886d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35886d;
            um.c h10 = cVar.h("id");
            str5 = cxVar.f36544a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35886d == null) {
                this.f35886d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35886d;
            um.c h13 = cVar.h("node_id");
            str4 = cxVar.f36545b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35886d == null) {
                this.f35886d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35886d;
            um.c h14 = cVar.h("base_query");
            str3 = cxVar.f36546c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35885c == null) {
                this.f35885c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ModifiedSearchFilter$ModifiedSearchFilterTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f35885c;
            um.c h15 = cVar.h("eligible_filters");
            list2 = cxVar.f36547d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35884b == null) {
                this.f35884b = oVar.g(new TypeToken<List<dh0>>(this) { // from class: com.pinterest.api.model.ModifiedSearchFilter$ModifiedSearchFilterTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f35884b;
            um.c h16 = cVar.h("filter_options");
            list = cxVar.f36548e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35886d == null) {
                this.f35886d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35886d;
            um.c h17 = cVar.h("modifier");
            str2 = cxVar.f36549f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35886d == null) {
                this.f35886d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f35886d;
            um.c h18 = cVar.h("original_query");
            str = cxVar.f36550g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
