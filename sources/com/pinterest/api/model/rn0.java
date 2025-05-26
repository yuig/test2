package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class rn0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41628a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41629b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41630c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41631d;

    public rn0(nm.o oVar) {
        this.f41628a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qn0 qn0Var = new qn0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1386164858) {
                if (hashCode != 3575610) {
                    if (hashCode == 795311618 && k03.equals("heading")) {
                        c13 = 2;
                    }
                } else if (k03.equals("type")) {
                    c13 = 1;
                }
            } else if (k03.equals("blocks")) {
                c13 = 0;
            }
            nm.o oVar = this.f41628a;
            if (c13 == 0) {
                if (this.f41630c == null) {
                    this.f41630c = oVar.g(new TypeToken<List<ao0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalListBlock$StoryPinLocalListBlockTypeAdapter$2
                    }).b();
                }
                qn0Var.f41344a = (List) this.f41630c.c(aVar);
                boolean[] zArr = qn0Var.f41347d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f41629b == null) {
                    this.f41629b = a.cb.q(oVar, Integer.class);
                }
                qn0Var.f41346c = (Integer) this.f41629b.c(aVar);
                boolean[] zArr2 = qn0Var.f41347d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f41631d == null) {
                    this.f41631d = a.cb.q(oVar, String.class);
                }
                qn0Var.f41345b = (String) this.f41631d.c(aVar);
                boolean[] zArr3 = qn0Var.f41347d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new tn0(qn0Var.f41344a, qn0Var.f41345b, qn0Var.f41346c, qn0Var.f41347d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        List list;
        tn0 tn0Var = (tn0) obj;
        if (tn0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tn0Var.f42250d;
        int length = zArr.length;
        nm.o oVar = this.f41628a;
        if (length > 0 && zArr[0]) {
            if (this.f41630c == null) {
                this.f41630c = oVar.g(new TypeToken<List<ao0>>(this) { // from class: com.pinterest.api.model.StoryPinLocalListBlock$StoryPinLocalListBlockTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f41630c;
            um.c h10 = cVar.h("blocks");
            list = tn0Var.f42247a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41631d == null) {
                this.f41631d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41631d;
            um.c h13 = cVar.h("heading");
            str = tn0Var.f42248b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41629b == null) {
                this.f41629b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f41629b;
            um.c h14 = cVar.h("type");
            num = tn0Var.f42249c;
            mVar3.e(h14, num);
        }
        cVar.g();
    }
}
