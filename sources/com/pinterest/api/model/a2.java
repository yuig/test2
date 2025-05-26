package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class a2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35626a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35627b;

    public a2(nm.o oVar) {
        this.f35626a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        c2 c2Var = new c2(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -892481550:
                    if (k03.equals("status")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -85224585:
                    if (k03.equals("ad_group_id")) {
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
                case 1082154667:
                    if (k03.equals("summary_status")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1206018745:
                    if (k03.equals("review_status")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2083788458:
                    if (k03.equals("campaign_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35626a;
            switch (c13) {
                case 0:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36281d = (String) this.f35627b.c(aVar);
                    boolean[] zArr = c2Var.f36285h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36283f = (String) this.f35627b.c(aVar);
                    boolean[] zArr2 = c2Var.f36285h;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36278a = (String) this.f35627b.c(aVar);
                    boolean[] zArr3 = c2Var.f36285h;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36280c = (String) this.f35627b.c(aVar);
                    boolean[] zArr4 = c2Var.f36285h;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36284g = (String) this.f35627b.c(aVar);
                    boolean[] zArr5 = c2Var.f36285h;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36282e = (String) this.f35627b.c(aVar);
                    boolean[] zArr6 = c2Var.f36285h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f35627b == null) {
                        this.f35627b = a.cb.q(oVar, String.class);
                    }
                    c2Var.f36279b = (String) this.f35627b.c(aVar);
                    boolean[] zArr7 = c2Var.f36285h;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new d2(c2Var.f36278a, c2Var.f36279b, c2Var.f36280c, c2Var.f36281d, c2Var.f36282e, c2Var.f36283f, c2Var.f36284g, c2Var.f36285h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        d2 d2Var = (d2) obj;
        if (d2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = d2Var.f36623h;
        int length = zArr.length;
        nm.o oVar = this.f35626a;
        if (length > 0 && zArr[0]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35627b;
            um.c h10 = cVar.h("ad_group_id");
            str7 = d2Var.f36616a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35627b;
            um.c h13 = cVar.h("campaign_id");
            str6 = d2Var.f36617b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35627b;
            um.c h14 = cVar.h("id");
            str5 = d2Var.f36618c;
            mVar3.e(h14, str5);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35627b;
            um.c h15 = cVar.h("pin_id");
            str4 = d2Var.f36619d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35627b;
            um.c h16 = cVar.h("review_status");
            str3 = d2Var.f36620e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35627b;
            um.c h17 = cVar.h("status");
            str2 = d2Var.f36621f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35627b == null) {
                this.f35627b = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f35627b;
            um.c h18 = cVar.h("summary_status");
            str = d2Var.f36622g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
