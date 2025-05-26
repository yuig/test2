package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r8 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41504a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41505b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41506c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41507d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41508e;

    public r8(nm.o oVar) {
        this.f41504a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        t8 t8Var = new t8(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1422950858:
                    if (k03.equals("action")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1408588682:
                    if (k03.equals("image_dominant_color_rgb")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
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
                case 1184148383:
                    if (k03.equals("header_text")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1610764564:
                    if (k03.equals("board_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1756668996:
                    if (k03.equals("board_name")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41504a;
            switch (c13) {
                case 0:
                    if (this.f41507d == null) {
                        this.f41507d = a.cb.q(oVar, dk0.class);
                    }
                    t8Var.f42115c = (dk0) this.f41507d.c(aVar);
                    boolean[] zArr = t8Var.f42121i;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f41505b == null) {
                        this.f41505b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.BoardMoreIdeasFeedUpsell$BoardMoreIdeasFeedUpsellTypeAdapter$3
                        }).b();
                    }
                    t8Var.f42119g = (List) this.f41505b.c(aVar);
                    boolean[] zArr2 = t8Var.f42121i;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f41506c == null) {
                        this.f41506c = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.BoardMoreIdeasFeedUpsell$BoardMoreIdeasFeedUpsellTypeAdapter$4
                        }).b();
                    }
                    t8Var.f42120h = (Map) this.f41506c.c(aVar);
                    boolean[] zArr3 = t8Var.f42121i;
                    if (zArr3.length <= 7) {
                        break;
                    } else {
                        zArr3[7] = true;
                        break;
                    }
                case 3:
                    if (this.f41508e == null) {
                        this.f41508e = a.cb.q(oVar, String.class);
                    }
                    t8Var.f42113a = (String) this.f41508e.c(aVar);
                    boolean[] zArr4 = t8Var.f42121i;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f41508e == null) {
                        this.f41508e = a.cb.q(oVar, String.class);
                    }
                    t8Var.f42118f = (String) this.f41508e.c(aVar);
                    boolean[] zArr5 = t8Var.f42121i;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f41508e == null) {
                        this.f41508e = a.cb.q(oVar, String.class);
                    }
                    t8Var.f42116d = (String) this.f41508e.c(aVar);
                    boolean[] zArr6 = t8Var.f42121i;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f41508e == null) {
                        this.f41508e = a.cb.q(oVar, String.class);
                    }
                    t8Var.f42117e = (String) this.f41508e.c(aVar);
                    boolean[] zArr7 = t8Var.f42121i;
                    if (zArr7.length <= 4) {
                        break;
                    } else {
                        zArr7[4] = true;
                        break;
                    }
                case 7:
                    if (this.f41508e == null) {
                        this.f41508e = a.cb.q(oVar, String.class);
                    }
                    t8Var.f42114b = (String) this.f41508e.c(aVar);
                    boolean[] zArr8 = t8Var.f42121i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new u8(t8Var.f42113a, t8Var.f42114b, t8Var.f42115c, t8Var.f42116d, t8Var.f42117e, t8Var.f42118f, t8Var.f42119g, t8Var.f42120h, t8Var.f42121i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        List list;
        String str;
        String str2;
        String str3;
        dk0 dk0Var;
        String str4;
        String str5;
        u8 u8Var = (u8) obj;
        if (u8Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = u8Var.f42473i;
        int length = zArr.length;
        nm.o oVar = this.f41504a;
        if (length > 0 && zArr[0]) {
            if (this.f41508e == null) {
                this.f41508e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41508e;
            um.c h10 = cVar.h("id");
            str5 = u8Var.f42465a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41508e == null) {
                this.f41508e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41508e;
            um.c h13 = cVar.h("node_id");
            str4 = u8Var.f42466b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41507d == null) {
                this.f41507d = a.cb.q(oVar, dk0.class);
            }
            nm.m mVar3 = this.f41507d;
            um.c h14 = cVar.h("action");
            dk0Var = u8Var.f42467c;
            mVar3.e(h14, dk0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41508e == null) {
                this.f41508e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41508e;
            um.c h15 = cVar.h("board_id");
            str3 = u8Var.f42468d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41508e == null) {
                this.f41508e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41508e;
            um.c h16 = cVar.h("board_name");
            str2 = u8Var.f42469e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41508e == null) {
                this.f41508e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41508e;
            um.c h17 = cVar.h("header_text");
            str = u8Var.f42470f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41505b == null) {
                this.f41505b = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.BoardMoreIdeasFeedUpsell$BoardMoreIdeasFeedUpsellTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f41505b;
            um.c h18 = cVar.h("image_dominant_color_rgb");
            list = u8Var.f42471g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41506c == null) {
                this.f41506c = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.BoardMoreIdeasFeedUpsell$BoardMoreIdeasFeedUpsellTypeAdapter$2
                }).b();
            }
            nm.m mVar8 = this.f41506c;
            um.c h19 = cVar.h("images");
            map = u8Var.f42472h;
            mVar8.e(h19, map);
        }
        cVar.g();
    }
}
