package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes.dex */
public final class ac extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35691a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35692b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35693c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35694d;

    public ac(nm.o oVar) {
        this.f35691a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zb zbVar = new zb(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -359034218) {
                if (hashCode != 3355) {
                    if (hashCode == 100346066 && k03.equals("index")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("carousel_slots")) {
                c13 = 0;
            }
            nm.o oVar = this.f35691a;
            if (c13 == 0) {
                if (this.f35693c == null) {
                    this.f35693c = oVar.g(new TypeToken<List<l30>>(this) { // from class: com.pinterest.api.model.CarouselData$CarouselDataTypeAdapter$2
                    }).b();
                }
                zbVar.f44270a = (List) this.f35693c.c(aVar);
                boolean[] zArr = zbVar.f44273d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f35694d == null) {
                    this.f35694d = a.cb.q(oVar, String.class);
                }
                zbVar.f44271b = (String) this.f35694d.c(aVar);
                boolean[] zArr2 = zbVar.f44273d;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f35692b == null) {
                    this.f35692b = a.cb.q(oVar, Integer.class);
                }
                zbVar.f44272c = (Integer) this.f35692b.c(aVar);
                boolean[] zArr3 = zbVar.f44273d;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            }
        }
        aVar.g();
        return zbVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        List list;
        cc ccVar = (cc) obj;
        if (ccVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ccVar.f36359d;
        int length = zArr.length;
        nm.o oVar = this.f35691a;
        if (length > 0 && zArr[0]) {
            if (this.f35693c == null) {
                this.f35693c = oVar.g(new TypeToken<List<l30>>(this) { // from class: com.pinterest.api.model.CarouselData$CarouselDataTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f35693c;
            um.c h10 = cVar.h("carousel_slots");
            list = ccVar.f36356a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35694d == null) {
                this.f35694d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35694d;
            um.c h13 = cVar.h("id");
            str = ccVar.f36357b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35692b == null) {
                this.f35692b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f35692b;
            um.c h14 = cVar.h("index");
            num = ccVar.f36358c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
