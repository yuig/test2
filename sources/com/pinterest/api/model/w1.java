package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class w1 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43135a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43136b;

    public w1(nm.o oVar) {
        this.f43135a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y1 y1Var = new y1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1326197564:
                    if (k03.equals("domain")) {
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 145601667:
                    if (k03.equals("grid_description")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 289310855:
                    if (k03.equals("image_large_url")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 863147785:
                    if (k03.equals("image_medium_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1040253983:
                    if (k03.equals("grid_title")) {
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
            nm.o oVar = this.f43135a;
            switch (c13) {
                case 0:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43871c = (String) this.f43136b.c(aVar);
                    boolean[] zArr = y1Var.f43877i;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43869a = (String) this.f43136b.c(aVar);
                    boolean[] zArr2 = y1Var.f43877i;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43876h = (String) this.f43136b.c(aVar);
                    boolean[] zArr3 = y1Var.f43877i;
                    if (zArr3.length <= 7) {
                        break;
                    } else {
                        zArr3[7] = true;
                        break;
                    }
                case 3:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43872d = (String) this.f43136b.c(aVar);
                    boolean[] zArr4 = y1Var.f43877i;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case 4:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43874f = (String) this.f43136b.c(aVar);
                    boolean[] zArr5 = y1Var.f43877i;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43875g = (String) this.f43136b.c(aVar);
                    boolean[] zArr6 = y1Var.f43877i;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43873e = (String) this.f43136b.c(aVar);
                    boolean[] zArr7 = y1Var.f43877i;
                    if (zArr7.length <= 4) {
                        break;
                    } else {
                        zArr7[4] = true;
                        break;
                    }
                case 7:
                    if (this.f43136b == null) {
                        this.f43136b = a.cb.q(oVar, String.class);
                    }
                    y1Var.f43870b = (String) this.f43136b.c(aVar);
                    boolean[] zArr8 = y1Var.f43877i;
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
        return new z1(y1Var.f43869a, y1Var.f43870b, y1Var.f43871c, y1Var.f43872d, y1Var.f43873e, y1Var.f43874f, y1Var.f43875g, y1Var.f43876h, y1Var.f43877i, 0);
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
        String str8;
        z1 z1Var = (z1) obj;
        if (z1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z1Var.f44174i;
        int length = zArr.length;
        nm.o oVar = this.f43135a;
        if (length > 0 && zArr[0]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43136b;
            um.c h10 = cVar.h("id");
            str8 = z1Var.f44166a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43136b;
            um.c h13 = cVar.h("node_id");
            str7 = z1Var.f44167b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43136b;
            um.c h14 = cVar.h("domain");
            str6 = z1Var.f44168c;
            mVar3.e(h14, str6);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43136b;
            um.c h15 = cVar.h("grid_description");
            str5 = z1Var.f44169d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43136b;
            um.c h16 = cVar.h("grid_title");
            str4 = z1Var.f44170e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f43136b;
            um.c h17 = cVar.h("image_large_url");
            str3 = z1Var.f44171f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f43136b;
            um.c h18 = cVar.h("image_medium_url");
            str2 = z1Var.f44172g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43136b == null) {
                this.f43136b = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f43136b;
            um.c h19 = cVar.h("title");
            str = z1Var.f44173h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
