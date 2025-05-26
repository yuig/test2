package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class lv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39926a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39927b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39928c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39929d;

    public lv0(nm.o oVar) {
        this.f39926a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        kv0 kv0Var = new kv0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2002423353:
                    if (k03.equals("scale_policy")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 192046711:
                    if (k03.equals("prefilled_value")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 609670568:
                    if (k03.equals("supported_types")) {
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
            nm.o oVar = this.f39926a;
            if (c13 == 0) {
                if (this.f39927b == null) {
                    this.f39927b = a.cb.q(oVar, Integer.class);
                }
                kv0Var.f39554d = (Integer) this.f39927b.c(aVar);
                boolean[] zArr = kv0Var.f39556f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f39929d == null) {
                    this.f39929d = a.cb.q(oVar, String.class);
                }
                kv0Var.f39551a = (String) this.f39929d.c(aVar);
                boolean[] zArr2 = kv0Var.f39556f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f39929d == null) {
                    this.f39929d = a.cb.q(oVar, String.class);
                }
                kv0Var.f39553c = (String) this.f39929d.c(aVar);
                boolean[] zArr3 = kv0Var.f39556f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f39928c == null) {
                    this.f39928c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.TimelineObjectGraphic$TimelineObjectGraphicTypeAdapter$2
                    }).b();
                }
                kv0Var.f39555e = (List) this.f39928c.c(aVar);
                boolean[] zArr4 = kv0Var.f39556f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f39929d == null) {
                    this.f39929d = a.cb.q(oVar, String.class);
                }
                kv0Var.f39552b = (String) this.f39929d.c(aVar);
                boolean[] zArr5 = kv0Var.f39556f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new nv0(kv0Var.f39551a, kv0Var.f39552b, kv0Var.f39553c, kv0Var.f39554d, kv0Var.f39555e, kv0Var.f39556f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Integer num;
        String str;
        String str2;
        String str3;
        nv0 nv0Var = (nv0) obj;
        if (nv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = nv0Var.f40513f;
        int length = zArr.length;
        nm.o oVar = this.f39926a;
        if (length > 0 && zArr[0]) {
            if (this.f39929d == null) {
                this.f39929d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39929d;
            um.c h10 = cVar.h("id");
            str3 = nv0Var.f40508a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39929d == null) {
                this.f39929d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39929d;
            um.c h13 = cVar.h("node_id");
            str2 = nv0Var.f40509b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39929d == null) {
                this.f39929d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39929d;
            um.c h14 = cVar.h("prefilled_value");
            str = nv0Var.f40510c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39927b == null) {
                this.f39927b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39927b;
            um.c h15 = cVar.h("scale_policy");
            num = nv0Var.f40511d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39928c == null) {
                this.f39928c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.TimelineObjectGraphic$TimelineObjectGraphicTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f39928c;
            um.c h16 = cVar.h("supported_types");
            list = nv0Var.f40512e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
