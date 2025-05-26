package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class ut extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42640a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42641b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42642c;

    public ut(nm.o oVar) {
        this.f42640a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tt ttVar = new tt(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1110417409) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("labels")) {
                c13 = 0;
            }
            nm.o oVar = this.f42640a;
            if (c13 == 0) {
                if (this.f42641b == null) {
                    this.f42641b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.LabelInfo$LabelInfoTypeAdapter$2
                    }).b();
                }
                ttVar.a((List) this.f42641b.c(aVar));
            } else if (c13 == 1) {
                if (this.f42642c == null) {
                    this.f42642c = a.cb.q(oVar, String.class);
                }
                ttVar.c((String) this.f42642c.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42642c == null) {
                    this.f42642c = a.cb.q(oVar, String.class);
                }
                ttVar.b((String) this.f42642c.c(aVar));
            }
        }
        aVar.g();
        return new wt(ttVar.f42292a, ttVar.f42293b, ttVar.f42294c, ttVar.f42295d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        wt wtVar = (wt) obj;
        if (wtVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wtVar.f43372d;
        int length = zArr.length;
        nm.o oVar = this.f42640a;
        if (length > 0 && zArr[0]) {
            if (this.f42642c == null) {
                this.f42642c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42642c;
            um.c h10 = cVar.h("id");
            str2 = wtVar.f43369a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42642c == null) {
                this.f42642c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42642c;
            um.c h13 = cVar.h("node_id");
            str = wtVar.f43370b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42641b == null) {
                this.f42641b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.LabelInfo$LabelInfoTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42641b;
            um.c h14 = cVar.h("labels");
            list = wtVar.f43371c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
