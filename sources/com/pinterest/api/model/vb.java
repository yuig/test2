package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class vb extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42809a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42810b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42811c;

    public vb(nm.o oVar) {
        this.f42809a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ub ubVar = new ub(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1788888058:
                    if (k03.equals("QUARTILE_95_PERCENT_VIEW")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1196508642:
                    if (k03.equals("PIN_CLICK")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1079622593:
                    if (k03.equals("ENGAGEMENT")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -985065639:
                    if (k03.equals("OUTBOUND_CLICK")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -935593396:
                    if (k03.equals("date_availability")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -653548204:
                    if (k03.equals("VIDEO_10S_VIEW")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2537853:
                    if (k03.equals("SAVE")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 552788586:
                    if (k03.equals("VIDEO_MRC_VIEW")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 605715977:
                    if (k03.equals("IMPRESSION")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1411190894:
                    if (k03.equals("VIDEO_AVG_WATCH_TIME")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1802823759:
                    if (k03.equals("VIDEO_V50_WATCH_TIME")) {
                        c13 = '\n';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42809a;
            switch (c13) {
                case 0:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$15
                        }).b();
                    }
                    ubVar.f42495e = (List) this.f42810b.c(aVar);
                    boolean[] zArr = ubVar.f42502l;
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 1:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$14
                        }).b();
                    }
                    ubVar.f42494d = (List) this.f42810b.c(aVar);
                    boolean[] zArr2 = ubVar.f42502l;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$11
                        }).b();
                    }
                    ubVar.f42491a = (List) this.f42810b.c(aVar);
                    boolean[] zArr3 = ubVar.f42502l;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$13
                        }).b();
                    }
                    ubVar.f42493c = (List) this.f42810b.c(aVar);
                    boolean[] zArr4 = ubVar.f42502l;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f42811c == null) {
                        this.f42811c = a.cb.q(oVar, w30.class);
                    }
                    ubVar.f42501k = (w30) this.f42811c.c(aVar);
                    boolean[] zArr5 = ubVar.f42502l;
                    if (zArr5.length <= 10) {
                        break;
                    } else {
                        zArr5[10] = true;
                        break;
                    }
                case 5:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$17
                        }).b();
                    }
                    ubVar.f42497g = (List) this.f42810b.c(aVar);
                    boolean[] zArr6 = ubVar.f42502l;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$16
                        }).b();
                    }
                    ubVar.f42496f = (List) this.f42810b.c(aVar);
                    boolean[] zArr7 = ubVar.f42502l;
                    if (zArr7.length <= 5) {
                        break;
                    } else {
                        zArr7[5] = true;
                        break;
                    }
                case 7:
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$19
                        }).b();
                    }
                    ubVar.f42499i = (List) this.f42810b.c(aVar);
                    boolean[] zArr8 = ubVar.f42502l;
                    if (zArr8.length <= 8) {
                        break;
                    } else {
                        zArr8[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$12
                        }).b();
                    }
                    ubVar.f42492b = (List) this.f42810b.c(aVar);
                    boolean[] zArr9 = ubVar.f42502l;
                    if (zArr9.length <= 1) {
                        break;
                    } else {
                        zArr9[1] = true;
                        break;
                    }
                case '\t':
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$18
                        }).b();
                    }
                    ubVar.f42498h = (List) this.f42810b.c(aVar);
                    boolean[] zArr10 = ubVar.f42502l;
                    if (zArr10.length <= 7) {
                        break;
                    } else {
                        zArr10[7] = true;
                        break;
                    }
                case '\n':
                    if (this.f42810b == null) {
                        this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$20
                        }).b();
                    }
                    ubVar.f42500j = (List) this.f42810b.c(aVar);
                    boolean[] zArr11 = ubVar.f42502l;
                    if (zArr11.length <= 9) {
                        break;
                    } else {
                        zArr11[9] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new xb(ubVar.f42491a, ubVar.f42492b, ubVar.f42493c, ubVar.f42494d, ubVar.f42495e, ubVar.f42496f, ubVar.f42497g, ubVar.f42498h, ubVar.f42499i, ubVar.f42500j, ubVar.f42501k, ubVar.f42502l, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        w30 w30Var;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        xb xbVar = (xb) obj;
        if (xbVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xbVar.f43647l;
        int length = zArr.length;
        nm.o oVar = this.f42809a;
        if (length > 0 && zArr[0]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f42810b;
            um.c h10 = cVar.h("ENGAGEMENT");
            list10 = xbVar.f43636a;
            mVar.e(h10, list10);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f42810b;
            um.c h13 = cVar.h("IMPRESSION");
            list9 = xbVar.f43637b;
            mVar2.e(h13, list9);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$3
                }).b();
            }
            nm.m mVar3 = this.f42810b;
            um.c h14 = cVar.h("OUTBOUND_CLICK");
            list8 = xbVar.f43638c;
            mVar3.e(h14, list8);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$4
                }).b();
            }
            nm.m mVar4 = this.f42810b;
            um.c h15 = cVar.h("PIN_CLICK");
            list7 = xbVar.f43639d;
            mVar4.e(h15, list7);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$5
                }).b();
            }
            nm.m mVar5 = this.f42810b;
            um.c h16 = cVar.h("QUARTILE_95_PERCENT_VIEW");
            list6 = xbVar.f43640e;
            mVar5.e(h16, list6);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$6
                }).b();
            }
            nm.m mVar6 = this.f42810b;
            um.c h17 = cVar.h("SAVE");
            list5 = xbVar.f43641f;
            mVar6.e(h17, list5);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$7
                }).b();
            }
            nm.m mVar7 = this.f42810b;
            um.c h18 = cVar.h("VIDEO_10S_VIEW");
            list4 = xbVar.f43642g;
            mVar7.e(h18, list4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$8
                }).b();
            }
            nm.m mVar8 = this.f42810b;
            um.c h19 = cVar.h("VIDEO_AVG_WATCH_TIME");
            list3 = xbVar.f43643h;
            mVar8.e(h19, list3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$9
                }).b();
            }
            nm.m mVar9 = this.f42810b;
            um.c h23 = cVar.h("VIDEO_MRC_VIEW");
            list2 = xbVar.f43644i;
            mVar9.e(h23, list2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42810b == null) {
                this.f42810b = oVar.g(new TypeToken<List<tb>>(this) { // from class: com.pinterest.api.model.BusinessPins$BusinessPinsTypeAdapter$10
                }).b();
            }
            nm.m mVar10 = this.f42810b;
            um.c h24 = cVar.h("VIDEO_V50_WATCH_TIME");
            list = xbVar.f43645j;
            mVar10.e(h24, list);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42811c == null) {
                this.f42811c = a.cb.q(oVar, w30.class);
            }
            nm.m mVar11 = this.f42811c;
            um.c h25 = cVar.h("date_availability");
            w30Var = xbVar.f43646k;
            mVar11.e(h25, w30Var);
        }
        cVar.g();
    }
}
