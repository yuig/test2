package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class x90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43629a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43630b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43631c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43632d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43633e;

    public x90(nm.o oVar) {
        this.f43629a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        w90 w90Var = new w90(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1782234803:
                    if (k03.equals("questions")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1496002765:
                    if (k03.equals("creator_analytics")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1097546742:
                    if (k03.equals("results")) {
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
            nm.o oVar = this.f43629a;
            if (c13 == 0) {
                if (this.f43630b == null) {
                    this.f43630b = oVar.g(new TypeToken<List<ea0>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$5
                    }).b();
                }
                w90Var.d((List) this.f43630b.c(aVar));
            } else if (c13 == 1) {
                if (this.f43632d == null) {
                    this.f43632d = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$4
                    }).b();
                }
                w90Var.b((Map) this.f43632d.c(aVar));
            } else if (c13 == 2) {
                if (this.f43633e == null) {
                    this.f43633e = a.cb.q(oVar, String.class);
                }
                w90Var.f((String) this.f43633e.c(aVar));
            } else if (c13 == 3) {
                if (this.f43631c == null) {
                    this.f43631c = oVar.g(new TypeToken<List<ge0>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$6
                    }).b();
                }
                w90Var.e((List) this.f43631c.c(aVar));
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43633e == null) {
                    this.f43633e = a.cb.q(oVar, String.class);
                }
                w90Var.c((String) this.f43633e.c(aVar));
            }
        }
        aVar.g();
        return w90Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Map map;
        String str;
        String str2;
        z90 z90Var = (z90) obj;
        if (z90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z90Var.f44254f;
        int length = zArr.length;
        nm.o oVar = this.f43629a;
        if (length > 0 && zArr[0]) {
            if (this.f43633e == null) {
                this.f43633e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43633e;
            um.c h10 = cVar.h("id");
            str2 = z90Var.f44249a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43633e == null) {
                this.f43633e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43633e;
            um.c h13 = cVar.h("node_id");
            str = z90Var.f44250b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43632d == null) {
                this.f43632d = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43632d;
            um.c h14 = cVar.h("creator_analytics");
            map = z90Var.f44251c;
            mVar3.e(h14, map);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43630b == null) {
                this.f43630b = oVar.g(new TypeToken<List<ea0>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f43630b;
            um.c h15 = cVar.h("questions");
            list2 = z90Var.f44252d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43631c == null) {
                this.f43631c = oVar.g(new TypeToken<List<ge0>>(this) { // from class: com.pinterest.api.model.PromotedQuizPinData$PromotedQuizPinDataTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f43631c;
            um.c h16 = cVar.h("results");
            list = z90Var.f44253e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
