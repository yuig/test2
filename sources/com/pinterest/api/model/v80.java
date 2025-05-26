package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class v80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42781a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42782b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42783c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42784d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42785e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f42786f;

    public v80(nm.o oVar) {
        this.f42781a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u80 u80Var = new u80(0);
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
                case -1362791531:
                    if (k03.equals("preview_pins")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 106164915:
                    if (k03.equals("owner")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1053220864:
                    if (k03.equals("cover_images")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1282509050:
                    if (k03.equals("group_type")) {
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
            nm.o oVar = this.f42781a;
            switch (c13) {
                case 0:
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42477d = (String) this.f42785e.c(aVar);
                    boolean[] zArr = u80Var.f42484k;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f42784d == null) {
                        this.f42784d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.Productgroup$ProductgroupTypeAdapter$4
                        }).b();
                    }
                    u80Var.f42482i = (List) this.f42784d.c(aVar);
                    boolean[] zArr2 = u80Var.f42484k;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 2:
                    if (this.f42782b == null) {
                        this.f42782b = a.cb.q(oVar, Integer.class);
                    }
                    u80Var.f42481h = (Integer) this.f42782b.c(aVar);
                    boolean[] zArr3 = u80Var.f42484k;
                    if (zArr3.length <= 7) {
                        break;
                    } else {
                        zArr3[7] = true;
                        break;
                    }
                case 3:
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42474a = (String) this.f42785e.c(aVar);
                    boolean[] zArr4 = u80Var.f42484k;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42479f = (String) this.f42785e.c(aVar);
                    boolean[] zArr5 = u80Var.f42484k;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42483j = (String) this.f42785e.c(aVar);
                    boolean[] zArr6 = u80Var.f42484k;
                    if (zArr6.length <= 9) {
                        break;
                    } else {
                        zArr6[9] = true;
                        break;
                    }
                case 6:
                    if (this.f42786f == null) {
                        this.f42786f = a.cb.q(oVar, wy0.class);
                    }
                    u80Var.f42480g = (wy0) this.f42786f.c(aVar);
                    boolean[] zArr7 = u80Var.f42484k;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                case 7:
                    if (this.f42783c == null) {
                        this.f42783c = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.Productgroup$ProductgroupTypeAdapter$3
                        }).b();
                    }
                    u80Var.f42476c = (List) this.f42783c.c(aVar);
                    boolean[] zArr8 = u80Var.f42484k;
                    if (zArr8.length <= 2) {
                        break;
                    } else {
                        zArr8[2] = true;
                        break;
                    }
                case '\b':
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42478e = (String) this.f42785e.c(aVar);
                    boolean[] zArr9 = u80Var.f42484k;
                    if (zArr9.length <= 4) {
                        break;
                    } else {
                        zArr9[4] = true;
                        break;
                    }
                case '\t':
                    if (this.f42785e == null) {
                        this.f42785e = a.cb.q(oVar, String.class);
                    }
                    u80Var.f42475b = (String) this.f42785e.c(aVar);
                    boolean[] zArr10 = u80Var.f42484k;
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
        return new x80(u80Var.f42474a, u80Var.f42475b, u80Var.f42476c, u80Var.f42477d, u80Var.f42478e, u80Var.f42479f, u80Var.f42480g, u80Var.f42481h, u80Var.f42482i, u80Var.f42483j, u80Var.f42484k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        Integer num;
        wy0 wy0Var;
        String str2;
        String str3;
        String str4;
        List list2;
        String str5;
        String str6;
        x80 x80Var = (x80) obj;
        if (x80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = x80Var.f43628k;
        int length = zArr.length;
        nm.o oVar = this.f42781a;
        if (length > 0 && zArr[0]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42785e;
            um.c h10 = cVar.h("id");
            str6 = x80Var.f43618a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42785e;
            um.c h13 = cVar.h("node_id");
            str5 = x80Var.f43619b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42783c == null) {
                this.f42783c = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.Productgroup$ProductgroupTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f42783c;
            um.c h14 = cVar.h("cover_images");
            list2 = x80Var.f43620c;
            mVar3.e(h14, list2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42785e;
            um.c h15 = cVar.h("description");
            str4 = x80Var.f43621d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42785e;
            um.c h16 = cVar.h("group_type");
            str3 = x80Var.f43622e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42785e;
            um.c h17 = cVar.h("name");
            str2 = x80Var.f43623f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42786f == null) {
                this.f42786f = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar7 = this.f42786f;
            um.c h18 = cVar.h("owner");
            wy0Var = x80Var.f43624g;
            mVar7.e(h18, wy0Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42782b == null) {
                this.f42782b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f42782b;
            um.c h19 = cVar.h("pin_count");
            num = x80Var.f43625h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42784d == null) {
                this.f42784d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.Productgroup$ProductgroupTypeAdapter$2
                }).b();
            }
            nm.m mVar9 = this.f42784d;
            um.c h23 = cVar.h("preview_pins");
            list = x80Var.f43626i;
            mVar9.e(h23, list);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42785e == null) {
                this.f42785e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f42785e;
            um.c h24 = cVar.h("type");
            str = x80Var.f43627j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
