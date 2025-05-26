package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class nu0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40485a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40486b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40487c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40488d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40489e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40490f;

    public nu0(nm.o oVar) {
        this.f40485a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        mu0 mu0Var = new mu0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1855551354:
                    if (k03.equals("related_rect_origin_x")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1855551353:
                    if (k03.equals("related_rect_origin_y")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -900774058:
                    if (k03.equals("media_id")) {
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
                case 105292375:
                    if (k03.equals("begin_frame")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 270399533:
                    if (k03.equals("related_rect_frame_width")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 314070383:
                    if (k03.equals("animations")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1461338136:
                    if (k03.equals("related_rect_rame_height")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1577948778:
                    if (k03.equals("frame_corner_radius")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1939817737:
                    if (k03.equals("end_frame")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1939875509:
                    if (k03.equals("media_type")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            boolean[] zArr = mu0Var.f40225m;
            nm.o oVar = this.f40485a;
            switch (c13) {
                case 0:
                    if (this.f40486b == null) {
                        this.f40486b = a.cb.q(oVar, Double.class);
                    }
                    mu0Var.f40222j = (Double) this.f40486b.c(aVar);
                    boolean[] zArr2 = mu0Var.f40225m;
                    if (zArr2.length <= 9) {
                        break;
                    } else {
                        zArr2[9] = true;
                        break;
                    }
                case 1:
                    if (this.f40486b == null) {
                        this.f40486b = a.cb.q(oVar, Double.class);
                    }
                    mu0Var.f40223k = (Double) this.f40486b.c(aVar);
                    boolean[] zArr3 = mu0Var.f40225m;
                    if (zArr3.length <= 10) {
                        break;
                    } else {
                        zArr3[10] = true;
                        break;
                    }
                case 2:
                    if (this.f40489e == null) {
                        this.f40489e = a.cb.q(oVar, String.class);
                    }
                    mu0Var.f40219g = (String) this.f40489e.c(aVar);
                    boolean[] zArr4 = mu0Var.f40225m;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 3:
                    if (this.f40489e == null) {
                        this.f40489e = a.cb.q(oVar, String.class);
                    }
                    mu0Var.b((String) this.f40489e.c(aVar));
                    break;
                case 4:
                    if (this.f40487c == null) {
                        this.f40487c = a.cb.q(oVar, Integer.class);
                    }
                    mu0Var.f40216d = (Integer) this.f40487c.c(aVar);
                    boolean[] zArr5 = mu0Var.f40225m;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f40486b == null) {
                        this.f40486b = a.cb.q(oVar, Double.class);
                    }
                    mu0Var.f40221i = (Double) this.f40486b.c(aVar);
                    boolean[] zArr6 = mu0Var.f40225m;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case 6:
                    if (this.f40488d == null) {
                        this.f40488d = oVar.g(new TypeToken<List<tu0>>(this) { // from class: com.pinterest.api.model.TimelineObject$TimelineObjectTypeAdapter$2
                        }).b();
                    }
                    mu0Var.f40215c = (List) this.f40488d.c(aVar);
                    boolean[] zArr7 = mu0Var.f40225m;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                case 7:
                    if (this.f40486b == null) {
                        this.f40486b = a.cb.q(oVar, Double.class);
                    }
                    mu0Var.f40224l = (Double) this.f40486b.c(aVar);
                    boolean[] zArr8 = mu0Var.f40225m;
                    if (zArr8.length <= 11) {
                        break;
                    } else {
                        zArr8[11] = true;
                        break;
                    }
                case '\b':
                    if (this.f40486b == null) {
                        this.f40486b = a.cb.q(oVar, Double.class);
                    }
                    mu0Var.f40218f = (Double) this.f40486b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case '\t':
                    if (this.f40487c == null) {
                        this.f40487c = a.cb.q(oVar, Integer.class);
                    }
                    mu0Var.f40217e = (Integer) this.f40487c.c(aVar);
                    boolean[] zArr9 = mu0Var.f40225m;
                    if (zArr9.length <= 4) {
                        break;
                    } else {
                        zArr9[4] = true;
                        break;
                    }
                case '\n':
                    if (this.f40490f == null) {
                        this.f40490f = a.cb.q(oVar, rv0.class);
                    }
                    mu0Var.f40220h = (rv0) this.f40490f.c(aVar);
                    boolean[] zArr10 = mu0Var.f40225m;
                    if (zArr10.length <= 7) {
                        break;
                    } else {
                        zArr10[7] = true;
                        break;
                    }
                case 11:
                    if (this.f40489e == null) {
                        this.f40489e = a.cb.q(oVar, String.class);
                    }
                    mu0Var.f40214b = (String) this.f40489e.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return mu0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Double d14;
        Double d15;
        rv0 rv0Var;
        String str;
        Double d16;
        Integer num;
        Integer num2;
        List list;
        String str2;
        String str3;
        pu0 pu0Var = (pu0) obj;
        if (pu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = pu0Var.f41114m;
        int length = zArr.length;
        nm.o oVar = this.f40485a;
        if (length > 0 && zArr[0]) {
            if (this.f40489e == null) {
                this.f40489e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40489e;
            um.c h10 = cVar.h("id");
            str3 = pu0Var.f41102a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40489e == null) {
                this.f40489e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40489e;
            um.c h13 = cVar.h("node_id");
            str2 = pu0Var.f41103b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40488d == null) {
                this.f40488d = oVar.g(new TypeToken<List<tu0>>(this) { // from class: com.pinterest.api.model.TimelineObject$TimelineObjectTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f40488d;
            um.c h14 = cVar.h("animations");
            list = pu0Var.f41104c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40487c == null) {
                this.f40487c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40487c;
            um.c h15 = cVar.h("begin_frame");
            num2 = pu0Var.f41105d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40487c == null) {
                this.f40487c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40487c;
            um.c h16 = cVar.h("end_frame");
            num = pu0Var.f41106e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40486b == null) {
                this.f40486b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f40486b;
            um.c h17 = cVar.h("frame_corner_radius");
            d16 = pu0Var.f41107f;
            mVar6.e(h17, d16);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40489e == null) {
                this.f40489e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f40489e;
            um.c h18 = cVar.h("media_id");
            str = pu0Var.f41108g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40490f == null) {
                this.f40490f = a.cb.q(oVar, rv0.class);
            }
            nm.m mVar8 = this.f40490f;
            um.c h19 = cVar.h("media_type");
            rv0Var = pu0Var.f41109h;
            mVar8.e(h19, rv0Var);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f40486b == null) {
                this.f40486b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar9 = this.f40486b;
            um.c h23 = cVar.h("related_rect_frame_width");
            d15 = pu0Var.f41110i;
            mVar9.e(h23, d15);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f40486b == null) {
                this.f40486b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f40486b;
            um.c h24 = cVar.h("related_rect_origin_x");
            d14 = pu0Var.f41111j;
            mVar10.e(h24, d14);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f40486b == null) {
                this.f40486b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar11 = this.f40486b;
            um.c h25 = cVar.h("related_rect_origin_y");
            d13 = pu0Var.f41112k;
            mVar11.e(h25, d13);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f40486b == null) {
                this.f40486b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar12 = this.f40486b;
            um.c h26 = cVar.h("related_rect_rame_height");
            d2 = pu0Var.f41113l;
            mVar12.e(h26, d2);
        }
        cVar.g();
    }
}
