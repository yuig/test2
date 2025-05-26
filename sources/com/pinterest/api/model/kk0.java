package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class kk0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39484a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39485b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39486c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39487d;

    public kk0(nm.o oVar) {
        this.f39484a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        jk0 jk0Var = new jk0(0);
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
                case -1937323901:
                    if (k03.equals("artist_name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1044400713:
                    if (k03.equals("provider_recording_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -979053636:
                    if (k03.equals("aac_signature")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 188528006:
                    if (k03.equals("audio_url")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 267639695:
                    if (k03.equals("audio_signature")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1075881727:
                    if (k03.equals("royalty_free")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39484a;
            switch (c13) {
                case 0:
                    if (this.f39486c == null) {
                        this.f39486c = a.cb.q(oVar, Double.class);
                    }
                    jk0Var.f39087h = (Double) this.f39486c.c(aVar);
                    boolean[] zArr = jk0Var.f39092m;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39083d = (String) this.f39487d.c(aVar);
                    boolean[] zArr2 = jk0Var.f39092m;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39086g = (String) this.f39487d.c(aVar);
                    boolean[] zArr3 = jk0Var.f39092m;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39089j = (String) this.f39487d.c(aVar);
                    boolean[] zArr4 = jk0Var.f39092m;
                    if (zArr4.length <= 9) {
                        break;
                    } else {
                        zArr4[9] = true;
                        break;
                    }
                case 4:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39082c = (String) this.f39487d.c(aVar);
                    boolean[] zArr5 = jk0Var.f39092m;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39080a = (String) this.f39487d.c(aVar);
                    boolean[] zArr6 = jk0Var.f39092m;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39091l = (String) this.f39487d.c(aVar);
                    boolean[] zArr7 = jk0Var.f39092m;
                    if (zArr7.length <= 11) {
                        break;
                    } else {
                        zArr7[11] = true;
                        break;
                    }
                case 7:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39085f = (String) this.f39487d.c(aVar);
                    boolean[] zArr8 = jk0Var.f39092m;
                    if (zArr8.length <= 5) {
                        break;
                    } else {
                        zArr8[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39084e = (String) this.f39487d.c(aVar);
                    boolean[] zArr9 = jk0Var.f39092m;
                    if (zArr9.length <= 4) {
                        break;
                    } else {
                        zArr9[4] = true;
                        break;
                    }
                case '\t':
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39088i = (String) this.f39487d.c(aVar);
                    boolean[] zArr10 = jk0Var.f39092m;
                    if (zArr10.length <= 8) {
                        break;
                    } else {
                        zArr10[8] = true;
                        break;
                    }
                case '\n':
                    if (this.f39485b == null) {
                        this.f39485b = a.cb.q(oVar, Boolean.class);
                    }
                    jk0Var.f39090k = (Boolean) this.f39485b.c(aVar);
                    boolean[] zArr11 = jk0Var.f39092m;
                    if (zArr11.length <= 10) {
                        break;
                    } else {
                        zArr11[10] = true;
                        break;
                    }
                case 11:
                    if (this.f39487d == null) {
                        this.f39487d = a.cb.q(oVar, String.class);
                    }
                    jk0Var.f39081b = (String) this.f39487d.c(aVar);
                    boolean[] zArr12 = jk0Var.f39092m;
                    if (zArr12.length <= 1) {
                        break;
                    } else {
                        zArr12[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new mk0(jk0Var.f39080a, jk0Var.f39081b, jk0Var.f39082c, jk0Var.f39083d, jk0Var.f39084e, jk0Var.f39085f, jk0Var.f39086g, jk0Var.f39087h, jk0Var.f39088i, jk0Var.f39089j, jk0Var.f39090k, jk0Var.f39091l, jk0Var.f39092m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Boolean bool;
        String str2;
        String str3;
        Double d2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        mk0 mk0Var = (mk0) obj;
        if (mk0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = mk0Var.f40156m;
        int length = zArr.length;
        nm.o oVar = this.f39484a;
        if (length > 0 && zArr[0]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39487d;
            um.c h10 = cVar.h("id");
            str10 = mk0Var.f40144a;
            mVar.e(h10, str10);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39487d;
            um.c h13 = cVar.h("node_id");
            str9 = mk0Var.f40145b;
            mVar2.e(h13, str9);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39487d;
            um.c h14 = cVar.h("aac_signature");
            str8 = mk0Var.f40146c;
            mVar3.e(h14, str8);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f39487d;
            um.c h15 = cVar.h("artist_name");
            str7 = mk0Var.f40147d;
            mVar4.e(h15, str7);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39487d;
            um.c h16 = cVar.h("audio_signature");
            str6 = mk0Var.f40148e;
            mVar5.e(h16, str6);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39487d;
            um.c h17 = cVar.h("audio_url");
            str5 = mk0Var.f40149f;
            mVar6.e(h17, str5);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39487d;
            um.c h18 = cVar.h("description");
            str4 = mk0Var.f40150g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f39486c == null) {
                this.f39486c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar8 = this.f39486c;
            um.c h19 = cVar.h("duration");
            d2 = mk0Var.f40151h;
            mVar8.e(h19, d2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f39487d;
            um.c h23 = cVar.h("image_signature");
            str3 = mk0Var.f40152i;
            mVar9.e(h23, str3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f39487d;
            um.c h24 = cVar.h("provider_recording_id");
            str2 = mk0Var.f40153j;
            mVar10.e(h24, str2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f39485b == null) {
                this.f39485b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f39485b;
            um.c h25 = cVar.h("royalty_free");
            bool = mk0Var.f40154k;
            mVar11.e(h25, bool);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f39487d == null) {
                this.f39487d = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f39487d;
            um.c h26 = cVar.h("title");
            str = mk0Var.f40155l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
