package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zo extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44395a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44396b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44397c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44398d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44399e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44400f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f44401g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f44402h;

    public zo(nm.o oVar) {
        this.f44395a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vo voVar = new vo(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2031493780:
                    if (k03.equals("sticker_data")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2030994180:
                    if (k03.equals("sticker_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1938755376:
                    if (k03.equals("error_message")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1573145462:
                    if (k03.equals("start_time")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -437201095:
                    if (k03.equals("interactive_sticker_type")) {
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
                case 126941351:
                    if (k03.equals("is_valid")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1227548543:
                    if (k03.equals("block_style")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1725551537:
                    if (k03.equals("end_time")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44395a;
            switch (c13) {
                case 0:
                    if (this.f44398d == null) {
                        this.f44398d = a.cb.q(oVar, yo.class);
                    }
                    voVar.f42939h = (yo) this.f44398d.c(aVar);
                    boolean[] zArr = voVar.f42942k;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f44400f == null) {
                        this.f44400f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.IdeaPinGenericInteractiveStickerBlock$IdeaPinGenericInteractiveStickerBlockTypeAdapter$2
                        }).b();
                    }
                    voVar.f42940i = (Map) this.f44400f.c(aVar);
                    boolean[] zArr2 = voVar.f42942k;
                    if (zArr2.length <= 8) {
                        break;
                    } else {
                        zArr2[8] = true;
                        break;
                    }
                case 2:
                    if (this.f44402h == null) {
                        this.f44402h = a.cb.q(oVar, String.class);
                    }
                    voVar.f42935d = (String) this.f44402h.c(aVar);
                    boolean[] zArr3 = voVar.f42942k;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f44397c == null) {
                        this.f44397c = a.cb.q(oVar, Double.class);
                    }
                    voVar.f42938g = (Double) this.f44397c.c(aVar);
                    boolean[] zArr4 = voVar.f42942k;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f44399e == null) {
                        this.f44399e = a.cb.q(oVar, Integer.class);
                    }
                    voVar.f42936e = (Integer) this.f44399e.c(aVar);
                    boolean[] zArr5 = voVar.f42942k;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f44402h == null) {
                        this.f44402h = a.cb.q(oVar, String.class);
                    }
                    voVar.f42941j = (String) this.f44402h.c(aVar);
                    boolean[] zArr6 = voVar.f42942k;
                    if (zArr6.length <= 9) {
                        break;
                    } else {
                        zArr6[9] = true;
                        break;
                    }
                case 6:
                    if (this.f44396b == null) {
                        this.f44396b = a.cb.q(oVar, Boolean.class);
                    }
                    voVar.f42937f = (Boolean) this.f44396b.c(aVar);
                    boolean[] zArr7 = voVar.f42942k;
                    if (zArr7.length <= 5) {
                        break;
                    } else {
                        zArr7[5] = true;
                        break;
                    }
                case 7:
                    if (this.f44401g == null) {
                        this.f44401g = a.cb.q(oVar, zk0.class);
                    }
                    voVar.f42933b = (zk0) this.f44401g.c(aVar);
                    boolean[] zArr8 = voVar.f42942k;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                case '\b':
                    if (this.f44399e == null) {
                        this.f44399e = a.cb.q(oVar, Integer.class);
                    }
                    voVar.f42932a = (Integer) this.f44399e.c(aVar);
                    boolean[] zArr9 = voVar.f42942k;
                    if (zArr9.length <= 0) {
                        break;
                    } else {
                        zArr9[0] = true;
                        break;
                    }
                case '\t':
                    if (this.f44397c == null) {
                        this.f44397c = a.cb.q(oVar, Double.class);
                    }
                    voVar.f42934c = (Double) this.f44397c.c(aVar);
                    boolean[] zArr10 = voVar.f42942k;
                    if (zArr10.length <= 2) {
                        break;
                    } else {
                        zArr10[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new bp(voVar.f42932a, voVar.f42933b, voVar.f42934c, voVar.f42935d, voVar.f42936e, voVar.f42937f, voVar.f42938g, voVar.f42939h, voVar.f42940i, voVar.f42941j, voVar.f42942k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        yo yoVar;
        Double d2;
        Boolean bool;
        Integer num;
        String str2;
        Double d13;
        zk0 zk0Var;
        Integer num2;
        bp bpVar = (bp) obj;
        if (bpVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bpVar.f36154k;
        int length = zArr.length;
        nm.o oVar = this.f44395a;
        if (length > 0 && zArr[0]) {
            if (this.f44399e == null) {
                this.f44399e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f44399e;
            um.c h10 = cVar.h("block_type");
            num2 = bpVar.f36144a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44401g == null) {
                this.f44401g = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f44401g;
            um.c h13 = cVar.h("block_style");
            zk0Var = bpVar.f36145b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44397c == null) {
                this.f44397c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f44397c;
            um.c h14 = cVar.h("end_time");
            d13 = bpVar.f36146c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44402h == null) {
                this.f44402h = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44402h;
            um.c h15 = cVar.h("error_message");
            str2 = bpVar.f36147d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44399e == null) {
                this.f44399e = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f44399e;
            um.c h16 = cVar.h("interactive_sticker_type");
            num = bpVar.f36148e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44396b == null) {
                this.f44396b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f44396b;
            um.c h17 = cVar.h("is_valid");
            bool = bpVar.f36149f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44397c == null) {
                this.f44397c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar7 = this.f44397c;
            um.c h18 = cVar.h("start_time");
            d2 = bpVar.f36150g;
            mVar7.e(h18, d2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44398d == null) {
                this.f44398d = a.cb.q(oVar, yo.class);
            }
            nm.m mVar8 = this.f44398d;
            um.c h19 = cVar.h("sticker_data");
            yoVar = bpVar.f36151h;
            mVar8.e(h19, yoVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44400f == null) {
                this.f44400f = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.IdeaPinGenericInteractiveStickerBlock$IdeaPinGenericInteractiveStickerBlockTypeAdapter$1
                }).b();
            }
            nm.m mVar9 = this.f44400f;
            um.c h23 = cVar.h("sticker_type");
            map = bpVar.f36152i;
            mVar9.e(h23, map);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f44402h == null) {
                this.f44402h = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f44402h;
            um.c h24 = cVar.h("type");
            str = bpVar.f36153j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
