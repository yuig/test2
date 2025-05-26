package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class oy0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40831a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40832b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40833c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40834d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40835e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40836f;

    public oy0(nm.o oVar) {
        this.f40831a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ny0 ny0Var = new ny0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2060497896:
                    if (k03.equals("subtitle")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1442735800:
                    if (k03.equals("image_urls")) {
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
                case -1127621238:
                    if (k03.equals("recommendation_reason")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 102727412:
                    if (k03.equals("label")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1615288471:
                    if (k03.equals("display_type")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40831a;
            switch (c13) {
                case 0:
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40544i = (String) this.f40835e.c(aVar);
                    boolean[] zArr = ny0Var.f40546k;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 1:
                    if (this.f40833c == null) {
                        this.f40833c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Usecase$UsecaseTypeAdapter$3
                        }).b();
                    }
                    ny0Var.f40539d = (List) this.f40833c.c(aVar);
                    boolean[] zArr2 = ny0Var.f40546k;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f40834d == null) {
                        this.f40834d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Usecase$UsecaseTypeAdapter$4
                        }).b();
                    }
                    ny0Var.f40540e = (Map) this.f40834d.c(aVar);
                    boolean[] zArr3 = ny0Var.f40546k;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f40836f == null) {
                        this.f40836f = a.cb.q(oVar, uy0.class);
                    }
                    ny0Var.f40543h = (uy0) this.f40836f.c(aVar);
                    boolean[] zArr4 = ny0Var.f40546k;
                    if (zArr4.length <= 7) {
                        break;
                    } else {
                        zArr4[7] = true;
                        break;
                    }
                case 4:
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40537b = (String) this.f40835e.c(aVar);
                    boolean[] zArr5 = ny0Var.f40546k;
                    if (zArr5.length <= 1) {
                        break;
                    } else {
                        zArr5[1] = true;
                        break;
                    }
                case 5:
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40541f = (String) this.f40835e.c(aVar);
                    boolean[] zArr6 = ny0Var.f40546k;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40542g = (String) this.f40835e.c(aVar);
                    boolean[] zArr7 = ny0Var.f40546k;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40545j = (String) this.f40835e.c(aVar);
                    boolean[] zArr8 = ny0Var.f40546k;
                    if (zArr8.length <= 9) {
                        break;
                    } else {
                        zArr8[9] = true;
                        break;
                    }
                case '\b':
                    if (this.f40835e == null) {
                        this.f40835e = a.cb.q(oVar, String.class);
                    }
                    ny0Var.f40538c = (String) this.f40835e.c(aVar);
                    boolean[] zArr9 = ny0Var.f40546k;
                    if (zArr9.length <= 2) {
                        break;
                    } else {
                        zArr9[2] = true;
                        break;
                    }
                case '\t':
                    if (this.f40832b == null) {
                        this.f40832b = a.cb.q(oVar, Integer.class);
                    }
                    ny0Var.f40536a = (Integer) this.f40832b.c(aVar);
                    boolean[] zArr10 = ny0Var.f40546k;
                    if (zArr10.length <= 0) {
                        break;
                    } else {
                        zArr10[0] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new qy0(ny0Var.f40536a, ny0Var.f40537b, ny0Var.f40538c, ny0Var.f40539d, ny0Var.f40540e, ny0Var.f40541f, ny0Var.f40542g, ny0Var.f40543h, ny0Var.f40544i, ny0Var.f40545j, ny0Var.f40546k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        uy0 uy0Var;
        String str3;
        String str4;
        Map map;
        List list;
        String str5;
        String str6;
        Integer num;
        qy0 qy0Var = (qy0) obj;
        if (qy0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = qy0Var.f41441k;
        int length = zArr.length;
        nm.o oVar = this.f40831a;
        if (length > 0 && zArr[0]) {
            if (this.f40832b == null) {
                this.f40832b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f40832b;
            um.c h10 = cVar.h("display_type");
            num = qy0Var.f41431a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40835e;
            um.c h13 = cVar.h("id");
            str6 = qy0Var.f41432b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40835e;
            um.c h14 = cVar.h("image_signature");
            str5 = qy0Var.f41433c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40833c == null) {
                this.f40833c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Usecase$UsecaseTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f40833c;
            um.c h15 = cVar.h("image_urls");
            list = qy0Var.f41434d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40834d == null) {
                this.f40834d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Usecase$UsecaseTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f40834d;
            um.c h16 = cVar.h("images");
            map = qy0Var.f41435e;
            mVar5.e(h16, map);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40835e;
            um.c h17 = cVar.h("key");
            str4 = qy0Var.f41436f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40835e;
            um.c h18 = cVar.h("label");
            str3 = qy0Var.f41437g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40836f == null) {
                this.f40836f = a.cb.q(oVar, uy0.class);
            }
            nm.m mVar8 = this.f40836f;
            um.c h19 = cVar.h("recommendation_reason");
            uy0Var = qy0Var.f41438h;
            mVar8.e(h19, uy0Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f40835e;
            um.c h23 = cVar.h("subtitle");
            str2 = qy0Var.f41439i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40835e == null) {
                this.f40835e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f40835e;
            um.c h24 = cVar.h("title");
            str = qy0Var.f41440j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
