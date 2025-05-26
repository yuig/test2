package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class q50 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41217a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41218b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41219c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41220d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41221e;

    public q50(nm.o oVar) {
        this.f41217a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p50 p50Var = new p50(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -977758160:
                    if (k03.equals("bbox_width")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -678726659:
                    if (k03.equals("bbox_height")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -466873474:
                    if (k03.equals("x_percent")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -377902253:
                    if (k03.equals("visible_in_grid")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3441022:
                    if (k03.equals("pins")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1003889552:
                    if (k03.equals("pin_tag_key")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2020639359:
                    if (k03.equals("y_percent")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41217a;
            switch (c13) {
                case 0:
                    if (this.f41219c == null) {
                        this.f41219c = a.cb.q(oVar, Double.class);
                    }
                    p50Var.f40883b = (Double) this.f41219c.c(aVar);
                    boolean[] zArr = p50Var.f40889h;
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 1:
                    if (this.f41219c == null) {
                        this.f41219c = a.cb.q(oVar, Double.class);
                    }
                    p50Var.f40882a = (Double) this.f41219c.c(aVar);
                    boolean[] zArr2 = p50Var.f40889h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f41219c == null) {
                        this.f41219c = a.cb.q(oVar, Double.class);
                    }
                    p50Var.f40887f = (Double) this.f41219c.c(aVar);
                    boolean[] zArr3 = p50Var.f40889h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 3:
                    if (this.f41218b == null) {
                        this.f41218b = a.cb.q(oVar, Boolean.class);
                    }
                    p50Var.f40886e = (Boolean) this.f41218b.c(aVar);
                    boolean[] zArr4 = p50Var.f40889h;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f41220d == null) {
                        this.f41220d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PinTag$PinTagTypeAdapter$2
                        }).b();
                    }
                    p50Var.f40885d = (List) this.f41220d.c(aVar);
                    boolean[] zArr5 = p50Var.f40889h;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 5:
                    if (this.f41221e == null) {
                        this.f41221e = a.cb.q(oVar, String.class);
                    }
                    p50Var.f40884c = (String) this.f41221e.c(aVar);
                    boolean[] zArr6 = p50Var.f40889h;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f41219c == null) {
                        this.f41219c = a.cb.q(oVar, Double.class);
                    }
                    p50Var.f40888g = (Double) this.f41219c.c(aVar);
                    boolean[] zArr7 = p50Var.f40889h;
                    if (zArr7.length <= 6) {
                        break;
                    } else {
                        zArr7[6] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new s50(p50Var.f40882a, p50Var.f40883b, p50Var.f40884c, p50Var.f40885d, p50Var.f40886e, p50Var.f40887f, p50Var.f40888g, p50Var.f40889h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        Double d13;
        Boolean bool;
        List list;
        String str;
        Double d14;
        Double d15;
        s50 s50Var = (s50) obj;
        if (s50Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s50Var.f41790h;
        int length = zArr.length;
        nm.o oVar = this.f41217a;
        if (length > 0 && zArr[0]) {
            if (this.f41219c == null) {
                this.f41219c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f41219c;
            um.c h10 = cVar.h("bbox_height");
            d15 = s50Var.f41783a;
            mVar.e(h10, d15);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41219c == null) {
                this.f41219c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f41219c;
            um.c h13 = cVar.h("bbox_width");
            d14 = s50Var.f41784b;
            mVar2.e(h13, d14);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41221e == null) {
                this.f41221e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41221e;
            um.c h14 = cVar.h("pin_tag_key");
            str = s50Var.f41785c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41220d == null) {
                this.f41220d = oVar.g(new TypeToken<List<f30>>(this) { // from class: com.pinterest.api.model.PinTag$PinTagTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f41220d;
            um.c h15 = cVar.h("pins");
            list = s50Var.f41786d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41218b == null) {
                this.f41218b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f41218b;
            um.c h16 = cVar.h("visible_in_grid");
            bool = s50Var.f41787e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41219c == null) {
                this.f41219c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f41219c;
            um.c h17 = cVar.h("x_percent");
            d13 = s50Var.f41788f;
            mVar6.e(h17, d13);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41219c == null) {
                this.f41219c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar7 = this.f41219c;
            um.c h18 = cVar.h("y_percent");
            d2 = s50Var.f41789g;
            mVar7.e(h18, d2);
        }
        cVar.g();
    }
}
