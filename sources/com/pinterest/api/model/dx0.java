package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class dx0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36985a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36986b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36987c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36988d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36989e;

    public dx0(nm.o oVar) {
        this.f36985a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cx0 cx0Var = new cx0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1365325801:
                    if (k03.equals("is_viewing_user_subscribed")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -40525689:
                    if (k03.equals("large_image_url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 951760167:
                    if (k03.equals("recent_subscribers")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1615086568:
                    if (k03.equals("display_name")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1795205971:
                    if (k03.equals("small_image_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1871614584:
                    if (k03.equals("subscriber_count")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2036780306:
                    if (k03.equals("background_color")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36985a;
            switch (c13) {
                case 0:
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36555d = (String) this.f36989e.c(aVar);
                    boolean[] zArr = cx0Var.f36562k;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f36986b == null) {
                        this.f36986b = a.cb.q(oVar, Boolean.class);
                    }
                    cx0Var.f36557f = (Boolean) this.f36986b.c(aVar);
                    boolean[] zArr2 = cx0Var.f36562k;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36558g = (String) this.f36989e.c(aVar);
                    boolean[] zArr3 = cx0Var.f36562k;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36552a = (String) this.f36989e.c(aVar);
                    boolean[] zArr4 = cx0Var.f36562k;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f36988d == null) {
                        this.f36988d = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.TvInterest$TvInterestTypeAdapter$2
                        }).b();
                    }
                    cx0Var.f36559h = (List) this.f36988d.c(aVar);
                    boolean[] zArr5 = cx0Var.f36562k;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36556e = (String) this.f36989e.c(aVar);
                    boolean[] zArr6 = cx0Var.f36562k;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36560i = (String) this.f36989e.c(aVar);
                    boolean[] zArr7 = cx0Var.f36562k;
                    if (zArr7.length <= 8) {
                        break;
                    } else {
                        zArr7[8] = true;
                        break;
                    }
                case 7:
                    if (this.f36987c == null) {
                        this.f36987c = a.cb.q(oVar, Integer.class);
                    }
                    cx0Var.f36561j = (Integer) this.f36987c.c(aVar);
                    boolean[] zArr8 = cx0Var.f36562k;
                    if (zArr8.length <= 9) {
                        break;
                    } else {
                        zArr8[9] = true;
                        break;
                    }
                case '\b':
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36554c = (String) this.f36989e.c(aVar);
                    boolean[] zArr9 = cx0Var.f36562k;
                    if (zArr9.length <= 2) {
                        break;
                    } else {
                        zArr9[2] = true;
                        break;
                    }
                case '\t':
                    if (this.f36989e == null) {
                        this.f36989e = a.cb.q(oVar, String.class);
                    }
                    cx0Var.f36553b = (String) this.f36989e.c(aVar);
                    boolean[] zArr10 = cx0Var.f36562k;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new fx0(cx0Var.f36552a, cx0Var.f36553b, cx0Var.f36554c, cx0Var.f36555d, cx0Var.f36556e, cx0Var.f36557f, cx0Var.f36558g, cx0Var.f36559h, cx0Var.f36560i, cx0Var.f36561j, cx0Var.f36562k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        List list;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        fx0 fx0Var = (fx0) obj;
        if (fx0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fx0Var.f37849k;
        int length = zArr.length;
        nm.o oVar = this.f36985a;
        if (length > 0 && zArr[0]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36989e;
            um.c h10 = cVar.h("id");
            str7 = fx0Var.f37839a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36989e;
            um.c h13 = cVar.h("node_id");
            str6 = fx0Var.f37840b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36989e;
            um.c h14 = cVar.h("background_color");
            str5 = fx0Var.f37841c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36989e;
            um.c h15 = cVar.h("description");
            str4 = fx0Var.f37842d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36989e;
            um.c h16 = cVar.h("display_name");
            str3 = fx0Var.f37843e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36986b == null) {
                this.f36986b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f36986b;
            um.c h17 = cVar.h("is_viewing_user_subscribed");
            bool = fx0Var.f37844f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36989e;
            um.c h18 = cVar.h("large_image_url");
            str2 = fx0Var.f37845g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36988d == null) {
                this.f36988d = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.TvInterest$TvInterestTypeAdapter$1
                }).b();
            }
            nm.m mVar8 = this.f36988d;
            um.c h19 = cVar.h("recent_subscribers");
            list = fx0Var.f37846h;
            mVar8.e(h19, list);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36989e == null) {
                this.f36989e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f36989e;
            um.c h23 = cVar.h("small_image_url");
            str = fx0Var.f37847i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36987c == null) {
                this.f36987c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f36987c;
            um.c h24 = cVar.h("subscriber_count");
            num = fx0Var.f37848j;
            mVar10.e(h24, num);
        }
        cVar.g();
    }
}
