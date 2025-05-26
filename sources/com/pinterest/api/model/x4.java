package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class x4 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43575a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43576b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43577c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43578d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43579e;

    public x4(nm.o oVar) {
        this.f43575a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        z4 z4Var = new z4(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1204461845:
                    if (k03.equals("organic")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -405896971:
                    if (k03.equals("hourly_metrics")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3433164:
                    if (k03.equals("paid")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 271064221:
                    if (k03.equals("daily_metrics")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2040006954:
                    if (k03.equals("summary_metrics")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43575a;
            if (c13 == 0) {
                if (this.f43576b == null) {
                    this.f43576b = a.cb.q(oVar, w4.class);
                }
                z4Var.f44211c = (w4) this.f43576b.c(aVar);
                boolean[] zArr = z4Var.f44214f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f43579e == null) {
                    this.f43579e = oVar.g(new TypeToken<List<c4>>(this) { // from class: com.pinterest.api.model.AnalyticsMultiseries$AnalyticsMultiseriesTypeAdapter$4
                    }).b();
                }
                z4Var.f44210b = (List) this.f43579e.c(aVar);
                boolean[] zArr2 = z4Var.f44214f;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f43576b == null) {
                    this.f43576b = a.cb.q(oVar, w4.class);
                }
                z4Var.f44212d = (w4) this.f43576b.c(aVar);
                boolean[] zArr3 = z4Var.f44214f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f43578d == null) {
                    this.f43578d = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMultiseries$AnalyticsMultiseriesTypeAdapter$3
                    }).b();
                }
                z4Var.f44209a = (List) this.f43578d.c(aVar);
                boolean[] zArr4 = z4Var.f44214f;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43577c == null) {
                    this.f43577c = a.cb.q(oVar, i5.class);
                }
                z4Var.f44213e = (i5) this.f43577c.c(aVar);
                boolean[] zArr5 = z4Var.f44214f;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            }
        }
        aVar.g();
        return new a5(z4Var.f44209a, z4Var.f44210b, z4Var.f44211c, z4Var.f44212d, z4Var.f44213e, z4Var.f44214f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        i5 i5Var;
        w4 w4Var;
        w4 w4Var2;
        List list;
        List list2;
        a5 a5Var = (a5) obj;
        if (a5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = a5Var.f35656f;
        int length = zArr.length;
        nm.o oVar = this.f43575a;
        if (length > 0 && zArr[0]) {
            if (this.f43578d == null) {
                this.f43578d = oVar.g(new TypeToken<List<u3>>(this) { // from class: com.pinterest.api.model.AnalyticsMultiseries$AnalyticsMultiseriesTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f43578d;
            um.c h10 = cVar.h("daily_metrics");
            list2 = a5Var.f35651a;
            mVar.e(h10, list2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43579e == null) {
                this.f43579e = oVar.g(new TypeToken<List<c4>>(this) { // from class: com.pinterest.api.model.AnalyticsMultiseries$AnalyticsMultiseriesTypeAdapter$2
                }).b();
            }
            nm.m mVar2 = this.f43579e;
            um.c h13 = cVar.h("hourly_metrics");
            list = a5Var.f35652b;
            mVar2.e(h13, list);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43576b == null) {
                this.f43576b = a.cb.q(oVar, w4.class);
            }
            nm.m mVar3 = this.f43576b;
            um.c h14 = cVar.h("organic");
            w4Var2 = a5Var.f35653c;
            mVar3.e(h14, w4Var2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43576b == null) {
                this.f43576b = a.cb.q(oVar, w4.class);
            }
            nm.m mVar4 = this.f43576b;
            um.c h15 = cVar.h("paid");
            w4Var = a5Var.f35654d;
            mVar4.e(h15, w4Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43577c == null) {
                this.f43577c = a.cb.q(oVar, i5.class);
            }
            nm.m mVar5 = this.f43577c;
            um.c h16 = cVar.h("summary_metrics");
            i5Var = a5Var.f35655e;
            mVar5.e(h16, i5Var);
        }
        cVar.g();
    }
}
