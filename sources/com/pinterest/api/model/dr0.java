package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class dr0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36926a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36927b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36928c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36929d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36930e;

    public dr0(nm.o oVar) {
        this.f36926a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cr0 cr0Var = new cr0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2112215987:
                    if (k03.equals("final_prompt")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2060497896:
                    if (k03.equals("subtitle")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1782234803:
                    if (k03.equals("questions")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -979805852:
                    if (k03.equals("prompt")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1898781796:
                    if (k03.equals("is_sponsored")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36926a;
            if (c13 == 0) {
                if (this.f36930e == null) {
                    this.f36930e = a.cb.q(oVar, zr0.class);
                }
                cr0Var.f36496a = (zr0) this.f36930e.c(aVar);
                boolean[] zArr = cr0Var.f36502g;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f36929d == null) {
                    this.f36929d = a.cb.q(oVar, String.class);
                }
                cr0Var.f36500e = (String) this.f36929d.c(aVar);
                boolean[] zArr2 = cr0Var.f36502g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f36928c == null) {
                    this.f36928c = oVar.g(new TypeToken<List<ds0>>(this) { // from class: com.pinterest.api.model.Survey$SurveyTypeAdapter$2
                    }).b();
                }
                cr0Var.f36499d = (List) this.f36928c.c(aVar);
                boolean[] zArr3 = cr0Var.f36502g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f36930e == null) {
                    this.f36930e = a.cb.q(oVar, zr0.class);
                }
                cr0Var.f36498c = (zr0) this.f36930e.c(aVar);
                boolean[] zArr4 = cr0Var.f36502g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f36929d == null) {
                    this.f36929d = a.cb.q(oVar, String.class);
                }
                cr0Var.f36501f = (String) this.f36929d.c(aVar);
                boolean[] zArr5 = cr0Var.f36502g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36927b == null) {
                    this.f36927b = a.cb.q(oVar, Boolean.class);
                }
                cr0Var.f36497b = (Boolean) this.f36927b.c(aVar);
                boolean[] zArr6 = cr0Var.f36502g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new fr0(cr0Var.f36496a, cr0Var.f36497b, cr0Var.f36498c, cr0Var.f36499d, cr0Var.f36500e, cr0Var.f36501f, cr0Var.f36502g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        zr0 zr0Var;
        Boolean bool;
        zr0 zr0Var2;
        fr0 fr0Var = (fr0) obj;
        if (fr0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fr0Var.f37769g;
        int length = zArr.length;
        nm.o oVar = this.f36926a;
        if (length > 0 && zArr[0]) {
            if (this.f36930e == null) {
                this.f36930e = a.cb.q(oVar, zr0.class);
            }
            nm.m mVar = this.f36930e;
            um.c h10 = cVar.h("final_prompt");
            zr0Var2 = fr0Var.f37763a;
            mVar.e(h10, zr0Var2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36927b == null) {
                this.f36927b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f36927b;
            um.c h13 = cVar.h("is_sponsored");
            bool = fr0Var.f37764b;
            mVar2.e(h13, bool);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36930e == null) {
                this.f36930e = a.cb.q(oVar, zr0.class);
            }
            nm.m mVar3 = this.f36930e;
            um.c h14 = cVar.h("prompt");
            zr0Var = fr0Var.f37765c;
            mVar3.e(h14, zr0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36928c == null) {
                this.f36928c = oVar.g(new TypeToken<List<ds0>>(this) { // from class: com.pinterest.api.model.Survey$SurveyTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f36928c;
            um.c h15 = cVar.h("questions");
            list = fr0Var.f37766d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36929d == null) {
                this.f36929d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36929d;
            um.c h16 = cVar.h("subtitle");
            str2 = fr0Var.f37767e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36929d == null) {
                this.f36929d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36929d;
            um.c h17 = cVar.h("title");
            str = fr0Var.f37768f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
