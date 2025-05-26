package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class jx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39163a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39164b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39165c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39166d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39167e;

    public jx0(nm.o oVar) {
        this.f39163a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ix0 ix0Var = new ix0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1539124629:
                    if (k03.equals("display_did_its")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -208974838:
                    if (k03.equals("user_did_it_data")) {
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
                case 991427237:
                    if (k03.equals("aggregated_comment")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1754473751:
                    if (k03.equals("creator_reply")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39163a;
            if (c13 == 0) {
                if (this.f39165c == null) {
                    this.f39165c = oVar.g(new TypeToken<List<az0>>(this) { // from class: com.pinterest.api.model.UnifiedCommentsPreview$UnifiedCommentsPreviewTypeAdapter$2
                    }).b();
                }
                ix0Var.f38883e = (List) this.f39165c.c(aVar);
                boolean[] zArr = ix0Var.f38885g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f39167e == null) {
                    this.f39167e = a.cb.q(oVar, az0.class);
                }
                ix0Var.f38884f = (az0) this.f39167e.c(aVar);
                boolean[] zArr2 = ix0Var.f38885g;
                if (zArr2.length > 5) {
                    zArr2[5] = true;
                }
            } else if (c13 == 2) {
                if (this.f39166d == null) {
                    this.f39166d = a.cb.q(oVar, String.class);
                }
                ix0Var.f38879a = (String) this.f39166d.c(aVar);
                boolean[] zArr3 = ix0Var.f38885g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f39164b == null) {
                    this.f39164b = a.cb.q(oVar, z2.class);
                }
                ix0Var.f38881c = (z2) this.f39164b.c(aVar);
                boolean[] zArr4 = ix0Var.f38885g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f39164b == null) {
                    this.f39164b = a.cb.q(oVar, z2.class);
                }
                ix0Var.f38882d = (z2) this.f39164b.c(aVar);
                boolean[] zArr5 = ix0Var.f38885g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39166d == null) {
                    this.f39166d = a.cb.q(oVar, String.class);
                }
                ix0Var.f38880b = (String) this.f39166d.c(aVar);
                boolean[] zArr6 = ix0Var.f38885g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new lx0(ix0Var.f38879a, ix0Var.f38880b, ix0Var.f38881c, ix0Var.f38882d, ix0Var.f38883e, ix0Var.f38884f, ix0Var.f38885g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        az0 az0Var;
        List list;
        z2 z2Var;
        z2 z2Var2;
        String str;
        String str2;
        lx0 lx0Var = (lx0) obj;
        if (lx0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lx0Var.f39942g;
        int length = zArr.length;
        nm.o oVar = this.f39163a;
        if (length > 0 && zArr[0]) {
            if (this.f39166d == null) {
                this.f39166d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39166d;
            um.c h10 = cVar.h("id");
            str2 = lx0Var.f39936a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39166d == null) {
                this.f39166d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39166d;
            um.c h13 = cVar.h("node_id");
            str = lx0Var.f39937b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39164b == null) {
                this.f39164b = a.cb.q(oVar, z2.class);
            }
            nm.m mVar3 = this.f39164b;
            um.c h14 = cVar.h("aggregated_comment");
            z2Var2 = lx0Var.f39938c;
            mVar3.e(h14, z2Var2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39164b == null) {
                this.f39164b = a.cb.q(oVar, z2.class);
            }
            nm.m mVar4 = this.f39164b;
            um.c h15 = cVar.h("creator_reply");
            z2Var = lx0Var.f39939d;
            mVar4.e(h15, z2Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39165c == null) {
                this.f39165c = oVar.g(new TypeToken<List<az0>>(this) { // from class: com.pinterest.api.model.UnifiedCommentsPreview$UnifiedCommentsPreviewTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f39165c;
            um.c h16 = cVar.h("display_did_its");
            list = lx0Var.f39940e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39167e == null) {
                this.f39167e = a.cb.q(oVar, az0.class);
            }
            nm.m mVar6 = this.f39167e;
            um.c h17 = cVar.h("user_did_it_data");
            az0Var = lx0Var.f39941f;
            mVar6.e(h17, az0Var);
        }
        cVar.g();
    }
}
