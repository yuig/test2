package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class bh0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36106a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36107b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36108c;

    public bh0(nm.o oVar) {
        this.f36106a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ah0 ah0Var = new ah0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1442735800:
                    if (k03.equals("image_urls")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -662305033:
                    if (k03.equals("swatch_hex_colors")) {
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
                case 3556460:
                    if (k03.equals("term")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1671764162:
                    if (k03.equals("display")) {
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
            nm.o oVar = this.f36106a;
            if (c13 == 0) {
                if (this.f36107b == null) {
                    this.f36107b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.SearchFilterOption$SearchFilterOptionTypeAdapter$3
                    }).b();
                }
                ah0Var.f35745d = (List) this.f36107b.c(aVar);
                boolean[] zArr = ah0Var.f35748g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f36107b == null) {
                    this.f36107b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.SearchFilterOption$SearchFilterOptionTypeAdapter$4
                    }).b();
                }
                ah0Var.f35746e = (List) this.f36107b.c(aVar);
                boolean[] zArr2 = ah0Var.f35748g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f36108c == null) {
                    this.f36108c = a.cb.q(oVar, String.class);
                }
                ah0Var.f35742a = (String) this.f36108c.c(aVar);
                boolean[] zArr3 = ah0Var.f35748g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f36108c == null) {
                    this.f36108c = a.cb.q(oVar, String.class);
                }
                ah0Var.f35747f = (String) this.f36108c.c(aVar);
                boolean[] zArr4 = ah0Var.f35748g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f36108c == null) {
                    this.f36108c = a.cb.q(oVar, String.class);
                }
                ah0Var.f35744c = (String) this.f36108c.c(aVar);
                boolean[] zArr5 = ah0Var.f35748g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36108c == null) {
                    this.f36108c = a.cb.q(oVar, String.class);
                }
                ah0Var.f35743b = (String) this.f36108c.c(aVar);
                boolean[] zArr6 = ah0Var.f35748g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new dh0(ah0Var.f35742a, ah0Var.f35743b, ah0Var.f35744c, ah0Var.f35745d, ah0Var.f35746e, ah0Var.f35747f, ah0Var.f35748g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        List list2;
        String str2;
        String str3;
        String str4;
        dh0 dh0Var = (dh0) obj;
        if (dh0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dh0Var.f36828g;
        int length = zArr.length;
        nm.o oVar = this.f36106a;
        if (length > 0 && zArr[0]) {
            if (this.f36108c == null) {
                this.f36108c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36108c;
            um.c h10 = cVar.h("id");
            str4 = dh0Var.f36822a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36108c == null) {
                this.f36108c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36108c;
            um.c h13 = cVar.h("node_id");
            str3 = dh0Var.f36823b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36108c == null) {
                this.f36108c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36108c;
            um.c h14 = cVar.h("display");
            str2 = dh0Var.f36824c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36107b == null) {
                this.f36107b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.SearchFilterOption$SearchFilterOptionTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f36107b;
            um.c h15 = cVar.h("image_urls");
            list2 = dh0Var.f36825d;
            mVar4.e(h15, list2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36107b == null) {
                this.f36107b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.SearchFilterOption$SearchFilterOptionTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f36107b;
            um.c h16 = cVar.h("swatch_hex_colors");
            list = dh0Var.f36826e;
            mVar5.e(h16, list);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36108c == null) {
                this.f36108c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36108c;
            um.c h17 = cVar.h("term");
            str = dh0Var.f36827f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
