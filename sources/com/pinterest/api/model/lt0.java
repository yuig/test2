package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class lt0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39891a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39892b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39893c;

    public lt0(nm.o oVar) {
        this.f39891a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        kt0 kt0Var = new kt0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -906336856:
                    if (k03.equals("search")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -485666051:
                    if (k03.equals("homefeed")) {
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
                case 154239250:
                    if (k03.equals("related_pins")) {
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
            nm.o oVar = this.f39891a;
            if (c13 == 0) {
                if (this.f39892b == null) {
                    this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$6
                    }).b();
                }
                kt0Var.f39528e = (List) this.f39892b.c(aVar);
                boolean[] zArr = kt0Var.f39529f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f39892b == null) {
                    this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$4
                    }).b();
                }
                kt0Var.f39526c = (List) this.f39892b.c(aVar);
                boolean[] zArr2 = kt0Var.f39529f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f39893c == null) {
                    this.f39893c = a.cb.q(oVar, String.class);
                }
                kt0Var.f39524a = (String) this.f39893c.c(aVar);
                boolean[] zArr3 = kt0Var.f39529f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f39892b == null) {
                    this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$5
                    }).b();
                }
                kt0Var.f39527d = (List) this.f39892b.c(aVar);
                boolean[] zArr4 = kt0Var.f39529f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f39893c == null) {
                    this.f39893c = a.cb.q(oVar, String.class);
                }
                kt0Var.f39525b = (String) this.f39893c.c(aVar);
                boolean[] zArr5 = kt0Var.f39529f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new nt0(kt0Var.f39524a, kt0Var.f39525b, kt0Var.f39526c, kt0Var.f39527d, kt0Var.f39528e, kt0Var.f39529f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        List list3;
        String str;
        String str2;
        nt0 nt0Var = (nt0) obj;
        if (nt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nt0Var.f40484f;
        int length = zArr.length;
        nm.o oVar = this.f39891a;
        if (length > 0 && zArr[0]) {
            if (this.f39893c == null) {
                this.f39893c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39893c;
            um.c h10 = cVar.h("id");
            str2 = nt0Var.f40479a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39893c == null) {
                this.f39893c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39893c;
            um.c h13 = cVar.h("node_id");
            str = nt0Var.f40480b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39892b == null) {
                this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f39892b;
            um.c h14 = cVar.h("homefeed");
            list3 = nt0Var.f40481c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39892b == null) {
                this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f39892b;
            um.c h15 = cVar.h("related_pins");
            list2 = nt0Var.f40482d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39892b == null) {
                this.f39892b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnits$ThirdPartyAdConfigSurfaceAdUnitsTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f39892b;
            um.c h16 = cVar.h("search");
            list = nt0Var.f40483e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
