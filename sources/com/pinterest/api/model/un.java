package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class un extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42595a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42596b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42597c;

    public un(nm.o oVar) {
        this.f42595a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tn tnVar = new tn(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 502611593) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("interests")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f42595a;
            if (c13 == 0) {
                if (this.f42597c == null) {
                    this.f42597c = a.cb.q(oVar, String.class);
                }
                tnVar.f42243a = (String) this.f42597c.c(aVar);
                boolean[] zArr = tnVar.f42246d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f42596b == null) {
                    this.f42596b = oVar.g(new TypeToken<List<sn>>(this) { // from class: com.pinterest.api.model.HideInterests$HideInterestsTypeAdapter$2
                    }).b();
                }
                tnVar.f42245c = (List) this.f42596b.c(aVar);
                boolean[] zArr2 = tnVar.f42246d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42597c == null) {
                    this.f42597c = a.cb.q(oVar, String.class);
                }
                tnVar.f42244b = (String) this.f42597c.c(aVar);
                boolean[] zArr3 = tnVar.f42246d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new wn(tnVar.f42243a, tnVar.f42244b, tnVar.f42245c, tnVar.f42246d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        wn wnVar = (wn) obj;
        if (wnVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wnVar.f43298d;
        int length = zArr.length;
        nm.o oVar = this.f42595a;
        if (length > 0 && zArr[0]) {
            if (this.f42597c == null) {
                this.f42597c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42597c;
            um.c h10 = cVar.h("id");
            str2 = wnVar.f43295a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42597c == null) {
                this.f42597c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42597c;
            um.c h13 = cVar.h("node_id");
            str = wnVar.f43296b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42596b == null) {
                this.f42596b = oVar.g(new TypeToken<List<sn>>(this) { // from class: com.pinterest.api.model.HideInterests$HideInterestsTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42596b;
            um.c h14 = cVar.h("interests");
            list = wnVar.f43297c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
