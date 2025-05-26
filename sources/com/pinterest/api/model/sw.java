package com.pinterest.api.model;

import com.appsflyer.AdRevenueScheme;

/* loaded from: classes3.dex */
public final class sw extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42010a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42011b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42012c;

    public sw(nm.o oVar) {
        this.f42010a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v17 */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    /* JADX WARN: Type inference failed for: r20v22 */
    /* JADX WARN: Type inference failed for: r20v23 */
    /* JADX WARN: Type inference failed for: r20v24 */
    /* JADX WARN: Type inference failed for: r20v25 */
    /* JADX WARN: Type inference failed for: r20v26 */
    /* JADX WARN: Type inference failed for: r20v27 */
    /* JADX WARN: Type inference failed for: r20v28 */
    /* JADX WARN: Type inference failed for: r20v29 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v30 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        boolean z13;
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        boolean z14 = false;
        rw rwVar = new rw(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            ?? r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            r202 = -1;
            switch (k03.hashCode()) {
                case -2076992270:
                    if (k03.equals("glitterSize")) {
                        r202 = z14;
                        break;
                    }
                    break;
                case -1983029672:
                    if (k03.equals("shadeName")) {
                        r202 = 1;
                        break;
                    }
                    break;
                case -1508338367:
                    if (k03.equals("glitterSizeVariation")) {
                        r202 = 2;
                        break;
                    }
                    break;
                case -1267206133:
                    if (k03.equals("opacity")) {
                        r202 = 3;
                        break;
                    }
                    break;
                case -646612462:
                    if (k03.equals("envMappingIntensity")) {
                        r202 = 4;
                        break;
                    }
                    break;
                case -628847432:
                    if (k03.equals("colorHex")) {
                        r202 = 5;
                        break;
                    }
                    break;
                case 98450442:
                    if (k03.equals("gloss")) {
                        r202 = 6;
                        break;
                    }
                    break;
                case 116087121:
                    if (k03.equals("glitter")) {
                        r202 = 7;
                        break;
                    }
                    break;
                case 672043259:
                    if (k03.equals("glossDetail")) {
                        r202 = 8;
                        break;
                    }
                    break;
                case 902820874:
                    if (k03.equals("glitterHex")) {
                        r202 = 9;
                        break;
                    }
                    break;
                case 1240806077:
                    if (k03.equals("wetness")) {
                        r202 = 10;
                        break;
                    }
                    break;
                case 1364387415:
                    if (k03.equals("glitterDensity")) {
                        r202 = 11;
                        break;
                    }
                    break;
                case 1464022433:
                    if (k03.equals("glitterColorVariation")) {
                        r202 = 12;
                        break;
                    }
                    break;
                case 1792938725:
                    if (k03.equals(AdRevenueScheme.PLACEMENT)) {
                        r202 = 13;
                        break;
                    }
                    break;
                case 2097036454:
                    if (k03.equals("glitterBaseReflectivity")) {
                        r202 = 14;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42010a;
            switch (r202) {
                case 0:
                    z13 = false;
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41697h = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr = rwVar.f41705p;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        continue;
                    }
                case 1:
                    z13 = false;
                    if (this.f42012c == null) {
                        this.f42012c = a.cb.q(oVar, String.class);
                    }
                    rwVar.f41703n = (String) this.f42012c.c(aVar);
                    boolean[] zArr2 = rwVar.f41705p;
                    if (zArr2.length > 13) {
                        zArr2[13] = true;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    z13 = false;
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41698i = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr3 = rwVar.f41705p;
                    if (zArr3.length > 8) {
                        zArr3[8] = true;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    z13 = false;
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41701l = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr4 = rwVar.f41705p;
                    if (zArr4.length > 11) {
                        zArr4[11] = true;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    z13 = false;
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41691b = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr5 = rwVar.f41705p;
                    if (zArr5.length > 1) {
                        zArr5[1] = true;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (this.f42012c == null) {
                        this.f42012c = a.cb.q(oVar, String.class);
                    }
                    rwVar.f41690a = (String) this.f42012c.c(aVar);
                    boolean[] zArr6 = rwVar.f41705p;
                    if (zArr6.length > 0) {
                        z13 = false;
                        zArr6[0] = true;
                        break;
                    }
                    break;
                case 6:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41699j = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr7 = rwVar.f41705p;
                    if (zArr7.length > 9) {
                        zArr7[9] = true;
                        break;
                    }
                    break;
                case 7:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41692c = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr8 = rwVar.f41705p;
                    if (zArr8.length > 2) {
                        zArr8[2] = true;
                        break;
                    }
                    break;
                case 8:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41700k = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr9 = rwVar.f41705p;
                    if (zArr9.length > 10) {
                        zArr9[10] = true;
                        break;
                    }
                    break;
                case 9:
                    if (this.f42012c == null) {
                        this.f42012c = a.cb.q(oVar, String.class);
                    }
                    rwVar.f41696g = (String) this.f42012c.c(aVar);
                    boolean[] zArr10 = rwVar.f41705p;
                    if (zArr10.length > 6) {
                        zArr10[6] = true;
                        break;
                    }
                    break;
                case 10:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41704o = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr11 = rwVar.f41705p;
                    if (zArr11.length > 14) {
                        zArr11[14] = true;
                        break;
                    }
                    break;
                case 11:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41695f = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr12 = rwVar.f41705p;
                    if (zArr12.length > 5) {
                        zArr12[5] = true;
                        break;
                    }
                    break;
                case 12:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41694e = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr13 = rwVar.f41705p;
                    if (zArr13.length > 4) {
                        zArr13[4] = true;
                        break;
                    }
                    break;
                case 13:
                    if (this.f42012c == null) {
                        this.f42012c = a.cb.q(oVar, String.class);
                    }
                    rwVar.f41702m = (String) this.f42012c.c(aVar);
                    boolean[] zArr14 = rwVar.f41705p;
                    if (zArr14.length > 12) {
                        zArr14[12] = true;
                        break;
                    }
                    break;
                case 14:
                    if (this.f42011b == null) {
                        this.f42011b = a.cb.q(oVar, Integer.class);
                    }
                    rwVar.f41693d = (Integer) this.f42011b.c(aVar);
                    boolean[] zArr15 = rwVar.f41705p;
                    if (zArr15.length > 3) {
                        zArr15[3] = true;
                        break;
                    }
                    break;
                default:
                    aVar.E();
                    break;
            }
            z13 = false;
            z14 = z13;
        }
        aVar.g();
        return new uw(rwVar.f41690a, rwVar.f41691b, rwVar.f41692c, rwVar.f41693d, rwVar.f41694e, rwVar.f41695f, rwVar.f41696g, rwVar.f41697h, rwVar.f41698i, rwVar.f41699j, rwVar.f41700k, rwVar.f41701l, rwVar.f41702m, rwVar.f41703n, rwVar.f41704o, rwVar.f41705p, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        String str3;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        String str4;
        uw uwVar = (uw) obj;
        if (uwVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = uwVar.f42666p;
        int length = zArr.length;
        nm.o oVar = this.f42010a;
        if (length > 0 && zArr[0]) {
            if (this.f42012c == null) {
                this.f42012c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42012c;
            um.c h10 = cVar.h("colorHex");
            str4 = uwVar.f42651a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f42011b;
            um.c h13 = cVar.h("envMappingIntensity");
            num11 = uwVar.f42652b;
            mVar2.e(h13, num11);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f42011b;
            um.c h14 = cVar.h("glitter");
            num10 = uwVar.f42653c;
            mVar3.e(h14, num10);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f42011b;
            um.c h15 = cVar.h("glitterBaseReflectivity");
            num9 = uwVar.f42654d;
            mVar4.e(h15, num9);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f42011b;
            um.c h16 = cVar.h("glitterColorVariation");
            num8 = uwVar.f42655e;
            mVar5.e(h16, num8);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f42011b;
            um.c h17 = cVar.h("glitterDensity");
            num7 = uwVar.f42656f;
            mVar6.e(h17, num7);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42012c == null) {
                this.f42012c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42012c;
            um.c h18 = cVar.h("glitterHex");
            str3 = uwVar.f42657g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f42011b;
            um.c h19 = cVar.h("glitterSize");
            num6 = uwVar.f42658h;
            mVar8.e(h19, num6);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f42011b;
            um.c h23 = cVar.h("glitterSizeVariation");
            num5 = uwVar.f42659i;
            mVar9.e(h23, num5);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f42011b;
            um.c h24 = cVar.h("gloss");
            num4 = uwVar.f42660j;
            mVar10.e(h24, num4);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar11 = this.f42011b;
            um.c h25 = cVar.h("glossDetail");
            num3 = uwVar.f42661k;
            mVar11.e(h25, num3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar12 = this.f42011b;
            um.c h26 = cVar.h("opacity");
            num2 = uwVar.f42662l;
            mVar12.e(h26, num2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f42012c == null) {
                this.f42012c = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f42012c;
            um.c h27 = cVar.h(AdRevenueScheme.PLACEMENT);
            str2 = uwVar.f42663m;
            mVar13.e(h27, str2);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f42012c == null) {
                this.f42012c = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f42012c;
            um.c h28 = cVar.h("shadeName");
            str = uwVar.f42664n;
            mVar14.e(h28, str);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f42011b == null) {
                this.f42011b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar15 = this.f42011b;
            um.c h29 = cVar.h("wetness");
            num = uwVar.f42665o;
            mVar15.e(h29, num);
        }
        cVar.g();
    }
}
