package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class sz extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42024a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42025b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42026c;

    public sz(nm.o oVar) {
        this.f42024a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        rz rzVar = new rz(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 3441022) {
                    if (hashCode != 1615086568) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("display_name")) {
                        c13 = 2;
                    }
                } else if (k03.equals("pins")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f42024a;
            if (c13 == 0) {
                if (this.f42026c == null) {
                    this.f42026c = a.cb.q(oVar, String.class);
                }
                rzVar.f41727a = (String) this.f42026c.c(aVar);
                boolean[] zArr = rzVar.f41731e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42025b == null) {
                    this.f42025b = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.NuxUseCaseFeed$NuxUseCaseFeedTypeAdapter$2
                    }).b();
                }
                rzVar.f41730d = (List) this.f42025b.c(aVar);
                boolean[] zArr2 = rzVar.f41731e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f42026c == null) {
                    this.f42026c = a.cb.q(oVar, String.class);
                }
                rzVar.f41729c = (String) this.f42026c.c(aVar);
                boolean[] zArr3 = rzVar.f41731e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42026c == null) {
                    this.f42026c = a.cb.q(oVar, String.class);
                }
                rzVar.f41728b = (String) this.f42026c.c(aVar);
                boolean[] zArr4 = rzVar.f41731e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new uz(rzVar.f41727a, rzVar.f41728b, rzVar.f41729c, rzVar.f41730d, rzVar.f41731e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        String str3;
        uz uzVar = (uz) obj;
        if (uzVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = uzVar.f42684e;
        int length = zArr.length;
        nm.o oVar = this.f42024a;
        if (length > 0 && zArr[0]) {
            if (this.f42026c == null) {
                this.f42026c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42026c;
            um.c h10 = cVar.h("id");
            str3 = uzVar.f42680a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42026c == null) {
                this.f42026c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42026c;
            um.c h13 = cVar.h("node_id");
            str2 = uzVar.f42681b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42026c == null) {
                this.f42026c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42026c;
            um.c h14 = cVar.h("display_name");
            str = uzVar.f42682c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42025b == null) {
                this.f42025b = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.NuxUseCaseFeed$NuxUseCaseFeedTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f42025b;
            um.c h15 = cVar.h("pins");
            list = uzVar.f42683d;
            mVar4.e(h15, list);
        }
        cVar.g();
    }
}
