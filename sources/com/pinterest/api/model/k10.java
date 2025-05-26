package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class k10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39248a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39249b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39250c;

    public k10(nm.o oVar) {
        this.f39248a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j10 j10Var = new j10(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 886864475) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("generations")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f39248a;
            if (c13 == 0) {
                if (this.f39250c == null) {
                    this.f39250c = a.cb.q(oVar, String.class);
                }
                j10Var.f38922a = (String) this.f39250c.c(aVar);
                boolean[] zArr = j10Var.f38925d;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f39249b == null) {
                    this.f39249b = oVar.g(new TypeToken<List<cn>>(this) { // from class: com.pinterest.api.model.OutpaintingResponse$OutpaintingResponseTypeAdapter$2
                    }).b();
                }
                j10Var.f38924c = (List) this.f39249b.c(aVar);
                boolean[] zArr2 = j10Var.f38925d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f39250c == null) {
                    this.f39250c = a.cb.q(oVar, String.class);
                }
                j10Var.f38923b = (String) this.f39250c.c(aVar);
                boolean[] zArr3 = j10Var.f38925d;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            }
        }
        aVar.g();
        return new m10(j10Var.f38922a, j10Var.f38923b, j10Var.f38924c, j10Var.f38925d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        String str2;
        m10 m10Var = (m10) obj;
        if (m10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m10Var.f39967d;
        int length = zArr.length;
        nm.o oVar = this.f39248a;
        if (length > 0 && zArr[0]) {
            if (this.f39250c == null) {
                this.f39250c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39250c;
            um.c h10 = cVar.h("id");
            str2 = m10Var.f39964a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39250c == null) {
                this.f39250c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39250c;
            um.c h13 = cVar.h("node_id");
            str = m10Var.f39965b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39249b == null) {
                this.f39249b = oVar.g(new TypeToken<List<cn>>(this) { // from class: com.pinterest.api.model.OutpaintingResponse$OutpaintingResponseTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f39249b;
            um.c h14 = cVar.h("generations");
            list = m10Var.f39966c;
            mVar3.e(h14, list);
        }
        cVar.g();
    }
}
