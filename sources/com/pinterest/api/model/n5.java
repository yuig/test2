package com.pinterest.api.model;

import android.util.Log;

/* loaded from: classes3.dex */
public final class n5 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40333a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40334b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40335c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40336d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40337e;

    public n5(nm.o oVar) {
        this.f40333a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        p5 p5Var = new p5(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1594228512:
                    if (k03.equals("is_realtime")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -254536186:
                    if (k03.equals("num_of_days")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 95468472:
                    if (k03.equals("delta")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 111972721:
                    if (k03.equals("value")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2116721256:
                    if (k03.equals("latest_available_timestamp")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40333a;
            if (c13 == 0) {
                if (this.f40334b == null) {
                    this.f40334b = a.cb.q(oVar, Boolean.class);
                }
                p5Var.f40877c = (Boolean) this.f40334b.c(aVar);
                boolean[] zArr = p5Var.f40881g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f40336d == null) {
                    this.f40336d = a.cb.q(oVar, Integer.class);
                }
                p5Var.f40879e = (Integer) this.f40336d.c(aVar);
                boolean[] zArr2 = p5Var.f40881g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f40337e == null) {
                    this.f40337e = a.cb.q(oVar, String.class);
                }
                p5Var.f40875a = (String) this.f40337e.c(aVar);
                boolean[] zArr3 = p5Var.f40881g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f40335c == null) {
                    this.f40335c = a.cb.q(oVar, Double.class);
                }
                p5Var.f40876b = (Double) this.f40335c.c(aVar);
                boolean[] zArr4 = p5Var.f40881g;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            } else if (c13 == 4) {
                if (this.f40336d == null) {
                    this.f40336d = a.cb.q(oVar, Integer.class);
                }
                p5Var.f40880f = (Integer) this.f40336d.c(aVar);
                boolean[] zArr5 = p5Var.f40881g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                Log.d("Plank", "Unmapped property for AnalyticsSummaryMetrics: ".concat(k03));
                aVar.E();
            } else {
                if (this.f40337e == null) {
                    this.f40337e = a.cb.q(oVar, String.class);
                }
                p5Var.f40878d = (String) this.f40337e.c(aVar);
                boolean[] zArr6 = p5Var.f40881g;
                if (zArr6.length > 3) {
                    zArr6[3] = true;
                }
            }
        }
        aVar.g();
        return new q5(p5Var.f40875a, p5Var.f40876b, p5Var.f40877c, p5Var.f40878d, p5Var.f40879e, p5Var.f40880f, p5Var.f40881g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        String str;
        Boolean bool;
        Double d2;
        String str2;
        q5 q5Var = (q5) obj;
        if (q5Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = q5Var.f41216g;
        int length = zArr.length;
        nm.o oVar = this.f40333a;
        if (length > 0 && zArr[0]) {
            if (this.f40337e == null) {
                this.f40337e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40337e;
            um.c h10 = cVar.h("id");
            str2 = q5Var.f41210a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40335c == null) {
                this.f40335c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f40335c;
            um.c h13 = cVar.h("delta");
            d2 = q5Var.f41211b;
            mVar2.e(h13, d2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40334b == null) {
                this.f40334b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f40334b;
            um.c h14 = cVar.h("is_realtime");
            bool = q5Var.f41212c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40337e == null) {
                this.f40337e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f40337e;
            um.c h15 = cVar.h("latest_available_timestamp");
            str = q5Var.f41213d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40336d == null) {
                this.f40336d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40336d;
            um.c h16 = cVar.h("num_of_days");
            num2 = q5Var.f41214e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40336d == null) {
                this.f40336d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f40336d;
            um.c h17 = cVar.h("value");
            num = q5Var.f41215f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
