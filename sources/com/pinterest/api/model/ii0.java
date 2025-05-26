package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.hi0;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ii0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38793a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38794b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38795c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38796d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38797e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38798f;

    public ii0(nm.o oVar) {
        this.f38793a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gi0 gi0Var = new gi0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2141142810:
                    if (k03.equals("item_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3344108:
                    if (k03.equals("mask")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1416541259:
                    if (k03.equals("cutout_images")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1800877052:
                    if (k03.equals("bitmap_mask")) {
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
            nm.o oVar = this.f38793a;
            switch (c13) {
                case 0:
                    if (this.f38797e == null) {
                        this.f38797e = a.cb.q(oVar, hi0.a.class);
                    }
                    gi0Var.f38075e = (hi0.a) this.f38797e.c(aVar);
                    boolean[] zArr = gi0Var.f38079i;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f38798f == null) {
                        this.f38798f = a.cb.q(oVar, String.class);
                    }
                    gi0Var.f38071a = (String) this.f38798f.c(aVar);
                    boolean[] zArr2 = gi0Var.f38079i;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f38796d == null) {
                        this.f38796d = a.cb.q(oVar, f30.class);
                    }
                    gi0Var.f38077g = (f30) this.f38796d.c(aVar);
                    boolean[] zArr3 = gi0Var.f38079i;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f38798f == null) {
                        this.f38798f = a.cb.q(oVar, String.class);
                    }
                    gi0Var.f38076f = (String) this.f38798f.c(aVar);
                    boolean[] zArr4 = gi0Var.f38079i;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f38798f == null) {
                        this.f38798f = a.cb.q(oVar, String.class);
                    }
                    gi0Var.f38078h = (String) this.f38798f.c(aVar);
                    boolean[] zArr5 = gi0Var.f38079i;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f38794b == null) {
                        this.f38794b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ShuffleAsset$ShuffleAssetTypeAdapter$4
                        }).b();
                    }
                    gi0Var.f38074d = (Map) this.f38794b.c(aVar);
                    boolean[] zArr6 = gi0Var.f38079i;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f38795c == null) {
                        this.f38795c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ShuffleAsset$ShuffleAssetTypeAdapter$3
                        }).b();
                    }
                    gi0Var.f38073c = (Map) this.f38795c.c(aVar);
                    boolean[] zArr7 = gi0Var.f38079i;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                case 7:
                    if (this.f38798f == null) {
                        this.f38798f = a.cb.q(oVar, String.class);
                    }
                    gi0Var.f38072b = (String) this.f38798f.c(aVar);
                    boolean[] zArr8 = gi0Var.f38079i;
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
        return new hi0(gi0Var.f38071a, gi0Var.f38072b, gi0Var.f38073c, gi0Var.f38074d, gi0Var.f38075e, gi0Var.f38076f, gi0Var.f38077g, gi0Var.f38078h, gi0Var.f38079i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        f30 f30Var;
        String str2;
        hi0.a aVar;
        Map map;
        Map map2;
        String str3;
        String str4;
        hi0 hi0Var = (hi0) obj;
        if (hi0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hi0Var.f38456i;
        int length = zArr.length;
        nm.o oVar = this.f38793a;
        if (length > 0 && zArr[0]) {
            if (this.f38798f == null) {
                this.f38798f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38798f;
            um.c h10 = cVar.h("id");
            str4 = hi0Var.f38448a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38798f == null) {
                this.f38798f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38798f;
            um.c h13 = cVar.h("node_id");
            str3 = hi0Var.f38449b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38795c == null) {
                this.f38795c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.ShuffleAsset$ShuffleAssetTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f38795c;
            um.c h14 = cVar.h("bitmap_mask");
            map2 = hi0Var.f38450c;
            mVar3.e(h14, map2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38794b == null) {
                this.f38794b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ShuffleAsset$ShuffleAssetTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f38794b;
            um.c h15 = cVar.h("cutout_images");
            map = hi0Var.f38451d;
            mVar4.e(h15, map);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38797e == null) {
                this.f38797e = a.cb.q(oVar, hi0.a.class);
            }
            nm.m mVar5 = this.f38797e;
            um.c h16 = cVar.h("item_type");
            aVar = hi0Var.f38452e;
            mVar5.e(h16, aVar);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38798f == null) {
                this.f38798f = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38798f;
            um.c h17 = cVar.h("mask");
            str2 = hi0Var.f38453f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38796d == null) {
                this.f38796d = a.cb.q(oVar, f30.class);
            }
            nm.m mVar7 = this.f38796d;
            um.c h18 = cVar.h("pin");
            f30Var = hi0Var.f38454g;
            mVar7.e(h18, f30Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38798f == null) {
                this.f38798f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f38798f;
            um.c h19 = cVar.h("type");
            str = hi0Var.f38455h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
