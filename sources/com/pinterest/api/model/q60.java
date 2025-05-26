package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class q60 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41226a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41227b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41228c;

    public q60(nm.o oVar) {
        this.f41226a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p60 p60Var = new p60(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1703162617) {
                if (hashCode != 3355) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("thumbnails")) {
                c13 = 0;
            }
            nm.o oVar = this.f41226a;
            if (c13 == 0) {
                if (this.f41227b == null) {
                    this.f41227b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PlaceImage$PlaceImageTypeAdapter$2
                    }).b();
                }
                p60Var.f40893c = (Map) this.f41227b.c(aVar);
                boolean[] zArr = p60Var.f40894d;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41228c == null) {
                    this.f41228c = a.cb.q(oVar, String.class);
                }
                p60Var.f40891a = (String) this.f41228c.c(aVar);
                boolean[] zArr2 = p60Var.f40894d;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41228c == null) {
                    this.f41228c = a.cb.q(oVar, String.class);
                }
                p60Var.f40892b = (String) this.f41228c.c(aVar);
                boolean[] zArr3 = p60Var.f40894d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new s60(p60Var.f40891a, p60Var.f40892b, p60Var.f40893c, p60Var.f40894d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        String str;
        String str2;
        s60 s60Var = (s60) obj;
        if (s60Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s60Var.f41801d;
        int length = zArr.length;
        nm.o oVar = this.f41226a;
        if (length > 0 && zArr[0]) {
            if (this.f41228c == null) {
                this.f41228c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41228c;
            um.c h10 = cVar.h("id");
            str2 = s60Var.f41798a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41228c == null) {
                this.f41228c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41228c;
            um.c h13 = cVar.h("node_id");
            str = s60Var.f41799b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41227b == null) {
                this.f41227b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.PlaceImage$PlaceImageTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41227b;
            um.c h14 = cVar.h("thumbnails");
            map = s60Var.f41800c;
            mVar3.e(h14, map);
        }
        cVar.g();
    }
}
