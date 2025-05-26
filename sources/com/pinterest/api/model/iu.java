package com.pinterest.api.model;

import android.util.Log;

/* loaded from: classes3.dex */
public final class iu extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38861a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38862b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38863c;

    public iu(nm.o oVar) {
        this.f38861a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        boolean z14 = false;
        hu huVar = new hu(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            ?? r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            r18 = -1;
            switch (k03.hashCode()) {
                case -2076992270:
                    if (k03.equals("glitterSize")) {
                        r18 = z14;
                        break;
                    }
                    break;
                case -1508338367:
                    if (k03.equals("glitterSizeVariation")) {
                        r18 = 1;
                        break;
                    }
                    break;
                case -1267206133:
                    if (k03.equals("opacity")) {
                        r18 = 2;
                        break;
                    }
                    break;
                case -646612462:
                    if (k03.equals("envMappingIntensity")) {
                        r18 = 3;
                        break;
                    }
                    break;
                case -628847432:
                    if (k03.equals("colorHex")) {
                        r18 = 4;
                        break;
                    }
                    break;
                case 98450442:
                    if (k03.equals("gloss")) {
                        r18 = 5;
                        break;
                    }
                    break;
                case 116087121:
                    if (k03.equals("glitter")) {
                        r18 = 6;
                        break;
                    }
                    break;
                case 672043259:
                    if (k03.equals("glossDetail")) {
                        r18 = 7;
                        break;
                    }
                    break;
                case 902820874:
                    if (k03.equals("glitterHex")) {
                        r18 = 8;
                        break;
                    }
                    break;
                case 1240806077:
                    if (k03.equals("wetness")) {
                        r18 = 9;
                        break;
                    }
                    break;
                case 1364387415:
                    if (k03.equals("glitterDensity")) {
                        r18 = 10;
                        break;
                    }
                    break;
                case 1464022433:
                    if (k03.equals("glitterColorVariation")) {
                        r18 = 11;
                        break;
                    }
                    break;
                case 2097036454:
                    if (k03.equals("glitterBaseReflectivity")) {
                        r18 = 12;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38861a;
            switch (r18) {
                case 0:
                    z13 = false;
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38538h = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr = huVar.f38544n;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38539i = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr2 = huVar.f38544n;
                    if (zArr2.length > 8) {
                        zArr2[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38542l = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr3 = huVar.f38544n;
                    if (zArr3.length > 11) {
                        zArr3[11] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38532b = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr4 = huVar.f38544n;
                    if (zArr4.length > 1) {
                        zArr4[1] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (this.f38863c == null) {
                        this.f38863c = a.cb.q(oVar, String.class);
                    }
                    huVar.f38531a = (String) this.f38863c.c(aVar);
                    boolean[] zArr5 = huVar.f38544n;
                    if (zArr5.length > 0) {
                        z13 = false;
                        zArr5[0] = true;
                        break;
                    }
                    break;
                case 5:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38540j = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr6 = huVar.f38544n;
                    if (zArr6.length > 9) {
                        zArr6[9] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38533c = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr7 = huVar.f38544n;
                    if (zArr7.length > 2) {
                        zArr7[2] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38541k = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr8 = huVar.f38544n;
                    if (zArr8.length > 10) {
                        zArr8[10] = true;
                        break;
                    }
                    break;
                case 8:
                    if (this.f38863c == null) {
                        this.f38863c = a.cb.q(oVar, String.class);
                    }
                    huVar.f38537g = (String) this.f38863c.c(aVar);
                    boolean[] zArr9 = huVar.f38544n;
                    if (zArr9.length > 6) {
                        zArr9[6] = true;
                        break;
                    }
                    break;
                case 9:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38543m = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr10 = huVar.f38544n;
                    if (zArr10.length > 12) {
                        zArr10[12] = true;
                        break;
                    }
                    break;
                case 10:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38536f = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr11 = huVar.f38544n;
                    if (zArr11.length > 5) {
                        zArr11[5] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38535e = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr12 = huVar.f38544n;
                    if (zArr12.length > 4) {
                        zArr12[4] = true;
                        break;
                    }
                    break;
                case 12:
                    if (this.f38862b == null) {
                        this.f38862b = a.cb.q(oVar, Integer.class);
                    }
                    huVar.f38534d = (Integer) this.f38862b.c(aVar);
                    boolean[] zArr13 = huVar.f38544n;
                    if (zArr13.length > 3) {
                        zArr13[3] = true;
                        break;
                    }
                    break;
                default:
                    Log.d("Plank", "Unmapped property for LipstickData: ".concat(k03));
                    aVar.E();
                    break;
            }
            z13 = false;
            z14 = z13;
        }
        aVar.g();
        return new ku(huVar.f38531a, huVar.f38532b, huVar.f38533c, huVar.f38534d, huVar.f38535e, huVar.f38536f, huVar.f38537g, huVar.f38538h, huVar.f38539i, huVar.f38540j, huVar.f38541k, huVar.f38542l, huVar.f38543m, huVar.f38544n, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        String str2;
        ku kuVar = (ku) obj;
        if (kuVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = kuVar.f39543n;
        int length = zArr.length;
        nm.o oVar = this.f38861a;
        if (length > 0 && zArr[0]) {
            if (this.f38863c == null) {
                this.f38863c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38863c;
            um.c h10 = cVar.h("colorHex");
            str2 = kuVar.f39530a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f38862b;
            um.c h13 = cVar.h("envMappingIntensity");
            num11 = kuVar.f39531b;
            mVar2.e(h13, num11);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f38862b;
            um.c h14 = cVar.h("glitter");
            num10 = kuVar.f39532c;
            mVar3.e(h14, num10);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f38862b;
            um.c h15 = cVar.h("glitterBaseReflectivity");
            num9 = kuVar.f39533d;
            mVar4.e(h15, num9);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f38862b;
            um.c h16 = cVar.h("glitterColorVariation");
            num8 = kuVar.f39534e;
            mVar5.e(h16, num8);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f38862b;
            um.c h17 = cVar.h("glitterDensity");
            num7 = kuVar.f39535f;
            mVar6.e(h17, num7);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38863c == null) {
                this.f38863c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f38863c;
            um.c h18 = cVar.h("glitterHex");
            str = kuVar.f39536g;
            mVar7.e(h18, str);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f38862b;
            um.c h19 = cVar.h("glitterSize");
            num6 = kuVar.f39537h;
            mVar8.e(h19, num6);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f38862b;
            um.c h23 = cVar.h("glitterSizeVariation");
            num5 = kuVar.f39538i;
            mVar9.e(h23, num5);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f38862b;
            um.c h24 = cVar.h("gloss");
            num4 = kuVar.f39539j;
            mVar10.e(h24, num4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f38862b;
            um.c h25 = cVar.h("glossDetail");
            num3 = kuVar.f39540k;
            mVar11.e(h25, num3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f38862b;
            um.c h26 = cVar.h("opacity");
            num2 = kuVar.f39541l;
            mVar12.e(h26, num2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38862b == null) {
                this.f38862b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar13 = this.f38862b;
            um.c h27 = cVar.h("wetness");
            num = kuVar.f39542m;
            mVar13.e(h27, num);
        }
        cVar.g();
    }
}
