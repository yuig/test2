package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ht0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38528a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38529b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38530c;

    public ht0(nm.o oVar) {
        this.f38528a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gt0 gt0Var = new gt0(0);
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
            nm.o oVar = this.f38528a;
            if (c13 == 0) {
                if (this.f38529b == null) {
                    this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$6
                    }).b();
                }
                gt0Var.f38141e = (List) this.f38529b.c(aVar);
                boolean[] zArr = gt0Var.f38142f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f38529b == null) {
                    this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$4
                    }).b();
                }
                gt0Var.f38139c = (List) this.f38529b.c(aVar);
                boolean[] zArr2 = gt0Var.f38142f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f38530c == null) {
                    this.f38530c = a.cb.q(oVar, String.class);
                }
                gt0Var.f38137a = (String) this.f38530c.c(aVar);
                boolean[] zArr3 = gt0Var.f38142f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38529b == null) {
                    this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$5
                    }).b();
                }
                gt0Var.f38140d = (List) this.f38529b.c(aVar);
                boolean[] zArr4 = gt0Var.f38142f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38530c == null) {
                    this.f38530c = a.cb.q(oVar, String.class);
                }
                gt0Var.f38138b = (String) this.f38530c.c(aVar);
                boolean[] zArr5 = gt0Var.f38142f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new jt0(gt0Var.f38137a, gt0Var.f38138b, gt0Var.f38139c, gt0Var.f38140d, gt0Var.f38141e, gt0Var.f38142f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        List list3;
        String str;
        String str2;
        jt0 jt0Var = (jt0) obj;
        if (jt0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jt0Var.f39152f;
        int length = zArr.length;
        nm.o oVar = this.f38528a;
        if (length > 0 && zArr[0]) {
            if (this.f38530c == null) {
                this.f38530c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38530c;
            um.c h10 = cVar.h("id");
            str2 = jt0Var.f39147a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38530c == null) {
                this.f38530c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38530c;
            um.c h13 = cVar.h("node_id");
            str = jt0Var.f39148b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38529b == null) {
                this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f38529b;
            um.c h14 = cVar.h("homefeed");
            list3 = jt0Var.f39149c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38529b == null) {
                this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f38529b;
            um.c h15 = cVar.h("related_pins");
            list2 = jt0Var.f39150d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38529b == null) {
                this.f38529b = oVar.g(new TypeToken<List<ft0>>(this) { // from class: com.pinterest.api.model.ThirdPartyAdConfigSurfaceAdUnitConfig$ThirdPartyAdConfigSurfaceAdUnitConfigTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f38529b;
            um.c h16 = cVar.h("search");
            list = jt0Var.f39151e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
