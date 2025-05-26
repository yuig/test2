package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class f01 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37399a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37400b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37401c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37402d;

    public f01(nm.o oVar) {
        this.f37399a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        e01 e01Var = new e01(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1992012396:
                    if (k03.equals("duration")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1620853513:
                    if (k03.equals("transcoded_height")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -102270099:
                    if (k03.equals("bitrate")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 113126854:
                    if (k03.equals("width")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 130625071:
                    if (k03.equals("manifest")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1330532588:
                    if (k03.equals("thumbnail")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1537279638:
                    if (k03.equals("captions_urls")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2039891958:
                    if (k03.equals("transcoded_width")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37399a;
            switch (c13) {
                case 0:
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.f37010c = (Double) this.f37400b.c(aVar);
                    boolean[] zArr = e01Var.f37018k;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.b((Double) this.f37400b.c(aVar));
                    break;
                case 2:
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.f37011d = (Double) this.f37400b.c(aVar);
                    boolean[] zArr2 = e01Var.f37018k;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 3:
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.a((Double) this.f37400b.c(aVar));
                    break;
                case 4:
                    if (this.f37402d == null) {
                        this.f37402d = a.cb.q(oVar, String.class);
                    }
                    e01Var.f37016i = (String) this.f37402d.c(aVar);
                    boolean[] zArr3 = e01Var.f37018k;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 5:
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.f37017j = (Double) this.f37400b.c(aVar);
                    boolean[] zArr4 = e01Var.f37018k;
                    if (zArr4.length <= 9) {
                        break;
                    } else {
                        zArr4[9] = true;
                        break;
                    }
                case 6:
                    if (this.f37402d == null) {
                        this.f37402d = a.cb.q(oVar, String.class);
                    }
                    e01Var.f37012e = (String) this.f37402d.c(aVar);
                    boolean[] zArr5 = e01Var.f37018k;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 7:
                    if (this.f37402d == null) {
                        this.f37402d = a.cb.q(oVar, String.class);
                    }
                    e01Var.f37013f = (String) this.f37402d.c(aVar);
                    boolean[] zArr6 = e01Var.f37018k;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f37401c == null) {
                        this.f37401c = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.VideoDetails$VideoDetailsTypeAdapter$2
                        }).b();
                    }
                    e01Var.f37009b = (Map) this.f37401c.c(aVar);
                    boolean[] zArr7 = e01Var.f37018k;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                case '\t':
                    if (this.f37400b == null) {
                        this.f37400b = a.cb.q(oVar, Double.class);
                    }
                    e01Var.c((Double) this.f37400b.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new h01(e01Var.f37008a, e01Var.f37009b, e01Var.f37010c, e01Var.f37011d, e01Var.f37012e, e01Var.f37013f, e01Var.f37014g, e01Var.f37015h, e01Var.f37016i, e01Var.f37017j, e01Var.f37018k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        Double d13;
        Double d14;
        String str2;
        String str3;
        Double d15;
        Double d16;
        Map map;
        Double d17;
        h01 h01Var = (h01) obj;
        if (h01Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = h01Var.f38235k;
        int length = zArr.length;
        nm.o oVar = this.f37399a;
        if (length > 0 && zArr[0]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar = this.f37400b;
            um.c h10 = cVar.h("bitrate");
            d17 = h01Var.f38225a;
            mVar.e(h10, d17);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37401c == null) {
                this.f37401c = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.VideoDetails$VideoDetailsTypeAdapter$1
                }).b();
            }
            nm.m mVar2 = this.f37401c;
            um.c h13 = cVar.h("captions_urls");
            map = h01Var.f38226b;
            mVar2.e(h13, map);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f37400b;
            um.c h14 = cVar.h("duration");
            d16 = h01Var.f38227c;
            mVar3.e(h14, d16);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f37400b;
            um.c h15 = cVar.h("height");
            d15 = h01Var.f38228d;
            mVar4.e(h15, d15);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37402d == null) {
                this.f37402d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f37402d;
            um.c h16 = cVar.h("manifest");
            str3 = h01Var.f38229e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37402d == null) {
                this.f37402d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37402d;
            um.c h17 = cVar.h("thumbnail");
            str2 = h01Var.f38230f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar7 = this.f37400b;
            um.c h18 = cVar.h("transcoded_height");
            d14 = h01Var.f38231g;
            mVar7.e(h18, d14);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar8 = this.f37400b;
            um.c h19 = cVar.h("transcoded_width");
            d13 = h01Var.f38232h;
            mVar8.e(h19, d13);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37402d == null) {
                this.f37402d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37402d;
            um.c h23 = cVar.h("url");
            str = h01Var.f38233i;
            mVar9.e(h23, str);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37400b == null) {
                this.f37400b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar10 = this.f37400b;
            um.c h24 = cVar.h("width");
            d2 = h01Var.f38234j;
            mVar10.e(h24, d2);
        }
        cVar.g();
    }
}
