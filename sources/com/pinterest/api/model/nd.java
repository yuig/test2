package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.md;
import java.util.List;

/* loaded from: classes.dex */
public final class nd extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40381a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40382b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40383c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40384d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40385e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40386f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f40387g;

    public nd(nm.o oVar) {
        this.f40381a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ld ldVar = new ld(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2141642410:
                    if (k03.equals("item_data")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1957859307:
                    if (k03.equals("catalog_collection_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1842055179:
                    if (k03.equals("collections_header_text")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1747001600:
                    if (k03.equals("is_dynamic_collections")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1657388219:
                    if (k03.equals("dpa_layout_type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -68291070:
                    if (k03.equals("root_pin_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 545689279:
                    if (k03.equals("slideshow_collections_aspect_ratio")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            boolean[] zArr = ldVar.f39720j;
            nm.o oVar = this.f40381a;
            switch (c13) {
                case 0:
                    if (this.f40386f == null) {
                        this.f40386f = oVar.g(new TypeToken<List<st>>(this) { // from class: com.pinterest.api.model.CollectionPin$CollectionPinTypeAdapter$2
                        }).b();
                    }
                    ldVar.f39717g = (List) this.f40386f.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f40385e == null) {
                        this.f40385e = a.cb.q(oVar, Integer.class);
                    }
                    ldVar.a((Integer) this.f40385e.c(aVar));
                    break;
                case 2:
                    if (this.f40387g == null) {
                        this.f40387g = a.cb.q(oVar, String.class);
                    }
                    ldVar.b((String) this.f40387g.c(aVar));
                    break;
                case 3:
                    if (this.f40382b == null) {
                        this.f40382b = a.cb.q(oVar, Boolean.class);
                    }
                    ldVar.c((Boolean) this.f40382b.c(aVar));
                    break;
                case 4:
                    if (this.f40383c == null) {
                        this.f40383c = a.cb.q(oVar, md.a.class);
                    }
                    ldVar.f39715e = (md.a) this.f40383c.c(aVar);
                    boolean[] zArr2 = ldVar.f39720j;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 5:
                    if (this.f40387g == null) {
                        this.f40387g = a.cb.q(oVar, String.class);
                    }
                    ldVar.f39718h = (String) this.f40387g.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 6:
                    if (this.f40387g == null) {
                        this.f40387g = a.cb.q(oVar, String.class);
                    }
                    ldVar.f((String) this.f40387g.c(aVar));
                    break;
                case 7:
                    if (this.f40384d == null) {
                        this.f40384d = a.cb.q(oVar, Double.class);
                    }
                    ldVar.e((Double) this.f40384d.c(aVar));
                    break;
                case '\b':
                    if (this.f40387g == null) {
                        this.f40387g = a.cb.q(oVar, String.class);
                    }
                    ldVar.d((String) this.f40387g.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new md(ldVar.f39711a, ldVar.f39712b, ldVar.f39713c, ldVar.f39714d, ldVar.f39715e, ldVar.f39716f, ldVar.f39717g, ldVar.f39718h, ldVar.f39719i, ldVar.f39720j, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        List list;
        Boolean bool;
        md.a aVar;
        String str2;
        Integer num;
        String str3;
        String str4;
        md mdVar = (md) obj;
        if (mdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mdVar.f40072j;
        int length = zArr.length;
        nm.o oVar = this.f40381a;
        if (length > 0 && zArr[0]) {
            if (this.f40387g == null) {
                this.f40387g = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40387g;
            um.c h10 = cVar.h("id");
            str4 = mdVar.f40063a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40387g == null) {
                this.f40387g = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40387g;
            um.c h13 = cVar.h("node_id");
            str3 = mdVar.f40064b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40385e == null) {
                this.f40385e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f40385e;
            um.c h14 = cVar.h("catalog_collection_type");
            num = mdVar.f40065c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40387g == null) {
                this.f40387g = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40387g;
            um.c h15 = cVar.h("collections_header_text");
            str2 = mdVar.f40066d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40383c == null) {
                this.f40383c = a.cb.q(oVar, md.a.class);
            }
            nm.m mVar5 = this.f40383c;
            um.c h16 = cVar.h("dpa_layout_type");
            aVar = mdVar.f40067e;
            mVar5.e(h16, aVar);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40382b == null) {
                this.f40382b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f40382b;
            um.c h17 = cVar.h("is_dynamic_collections");
            bool = mdVar.f40068f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40386f == null) {
                this.f40386f = oVar.g(new TypeToken<List<st>>(this) { // from class: com.pinterest.api.model.CollectionPin$CollectionPinTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f40386f;
            um.c h18 = cVar.h("item_data");
            list = mdVar.f40069g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40387g == null) {
                this.f40387g = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f40387g;
            um.c h19 = cVar.h("root_pin_id");
            str = mdVar.f40070h;
            mVar8.e(h19, str);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40384d == null) {
                this.f40384d = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f40384d;
            um.c h23 = cVar.h("slideshow_collections_aspect_ratio");
            d2 = mdVar.f40071i;
            mVar9.e(h23, d2);
        }
        cVar.g();
    }
}
