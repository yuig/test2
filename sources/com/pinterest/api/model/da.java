package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class da extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36694a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36695b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36696c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36697d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36698e;

    public da(nm.o oVar) {
        this.f36694a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        fa faVar = new fa(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1185250696:
                    if (k03.equals("images")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1053220864:
                    if (k03.equals("cover_images")) {
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
            nm.o oVar = this.f36694a;
            if (c13 == 0) {
                if (this.f36697d == null) {
                    this.f36697d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$5
                    }).b();
                }
                faVar.f37628d = (Map) this.f36697d.c(aVar);
                boolean[] zArr = faVar.f37631g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f36698e == null) {
                    this.f36698e = a.cb.q(oVar, String.class);
                }
                faVar.f37625a = (String) this.f36698e.c(aVar);
                boolean[] zArr2 = faVar.f37631g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f36698e == null) {
                    this.f36698e = a.cb.q(oVar, String.class);
                }
                faVar.f37629e = (String) this.f36698e.c(aVar);
                boolean[] zArr3 = faVar.f37631g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f36696c == null) {
                    this.f36696c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$6
                    }).b();
                }
                faVar.f37630f = (List) this.f36696c.c(aVar);
                boolean[] zArr4 = faVar.f37631g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f36695b == null) {
                    this.f36695b = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$4
                    }).b();
                }
                faVar.f37627c = (List) this.f36695b.c(aVar);
                boolean[] zArr5 = faVar.f37631g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36698e == null) {
                    this.f36698e = a.cb.q(oVar, String.class);
                }
                faVar.f37626b = (String) this.f36698e.c(aVar);
                boolean[] zArr6 = faVar.f37631g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new ga(faVar.f37625a, faVar.f37626b, faVar.f37627c, faVar.f37628d, faVar.f37629e, faVar.f37630f, faVar.f37631g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        Map map;
        List list2;
        String str2;
        String str3;
        ga gaVar = (ga) obj;
        if (gaVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = gaVar.f38008g;
        int length = zArr.length;
        nm.o oVar = this.f36694a;
        if (length > 0 && zArr[0]) {
            if (this.f36698e == null) {
                this.f36698e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36698e;
            um.c h10 = cVar.h("id");
            str3 = gaVar.f38002a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36698e == null) {
                this.f36698e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36698e;
            um.c h13 = cVar.h("node_id");
            str2 = gaVar.f38003b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36695b == null) {
                this.f36695b = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f36695b;
            um.c h14 = cVar.h("cover_images");
            list2 = gaVar.f38004c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36697d == null) {
                this.f36697d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f36697d;
            um.c h15 = cVar.h("images");
            map = gaVar.f38005d;
            mVar4.e(h15, map);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36698e == null) {
                this.f36698e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36698e;
            um.c h16 = cVar.h("name");
            str = gaVar.f38006e;
            mVar5.e(h16, str);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36696c == null) {
                this.f36696c = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.BoardSectionNameRecommendation$BoardSectionNameRecommendationTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f36696c;
            um.c h17 = cVar.h("pins");
            list = gaVar.f38007f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}
