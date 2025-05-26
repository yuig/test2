package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class cq extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36490a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36491b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36492c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36493d;

    public cq(nm.o oVar) {
        this.f36490a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bq bqVar = new bq(0);
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
                case 3355:
                    if (k03.equals("id")) {
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
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1075881727:
                    if (k03.equals("royalty_free")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\n';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36490a;
            switch (c13) {
                case 0:
                    if (this.f36492c == null) {
                        this.f36492c = a.cb.q(oVar, Double.class);
                    }
                    bqVar.f36160f = (Double) this.f36492c.c(aVar);
                    boolean[] zArr = bqVar.f36166l;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36157c = (String) this.f36493d.c(aVar);
                    boolean[] zArr2 = bqVar.f36166l;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36159e = (String) this.f36493d.c(aVar);
                    boolean[] zArr3 = bqVar.f36166l;
                    if (zArr3.length <= 4) {
                        break;
                    } else {
                        zArr3[4] = true;
                        break;
                    }
                case 3:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36161g = (String) this.f36493d.c(aVar);
                    boolean[] zArr4 = bqVar.f36166l;
                    if (zArr4.length <= 6) {
                        break;
                    } else {
                        zArr4[6] = true;
                        break;
                    }
                case 4:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36155a = (String) this.f36493d.c(aVar);
                    boolean[] zArr5 = bqVar.f36166l;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36165k = (String) this.f36493d.c(aVar);
                    boolean[] zArr6 = bqVar.f36166l;
                    if (zArr6.length <= 10) {
                        break;
                    } else {
                        zArr6[10] = true;
                        break;
                    }
                case 6:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36164j = (String) this.f36493d.c(aVar);
                    boolean[] zArr7 = bqVar.f36166l;
                    if (zArr7.length <= 9) {
                        break;
                    } else {
                        zArr7[9] = true;
                        break;
                    }
                case 7:
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36158d = (String) this.f36493d.c(aVar);
                    boolean[] zArr8 = bqVar.f36166l;
                    if (zArr8.length <= 3) {
                        break;
                    } else {
                        zArr8[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36163i = (String) this.f36493d.c(aVar);
                    boolean[] zArr9 = bqVar.f36166l;
                    if (zArr9.length <= 8) {
                        break;
                    } else {
                        zArr9[8] = true;
                        break;
                    }
                case '\t':
                    if (this.f36491b == null) {
                        this.f36491b = a.cb.q(oVar, Boolean.class);
                    }
                    bqVar.f36162h = (Boolean) this.f36491b.c(aVar);
                    boolean[] zArr10 = bqVar.f36166l;
                    if (zArr10.length <= 7) {
                        break;
                    } else {
                        zArr10[7] = true;
                        break;
                    }
                case '\n':
                    if (this.f36493d == null) {
                        this.f36493d = a.cb.q(oVar, String.class);
                    }
                    bqVar.f36156b = (String) this.f36493d.c(aVar);
                    boolean[] zArr11 = bqVar.f36166l;
                    if (zArr11.length <= 1) {
                        break;
                    } else {
                        zArr11[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new eq(bqVar.f36155a, bqVar.f36156b, bqVar.f36157c, bqVar.f36158d, bqVar.f36159e, bqVar.f36160f, bqVar.f36161g, bqVar.f36162h, bqVar.f36163i, bqVar.f36164j, bqVar.f36165k, bqVar.f36166l, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        String str4;
        Double d2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        eq eqVar = (eq) obj;
        if (eqVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = eqVar.f37331l;
        int length = zArr.length;
        nm.o oVar = this.f36490a;
        if (length > 0 && zArr[0]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36493d;
            um.c h10 = cVar.h("id");
            str9 = eqVar.f37320a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36493d;
            um.c h13 = cVar.h("node_id");
            str8 = eqVar.f37321b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36493d;
            um.c h14 = cVar.h("artist_name");
            str7 = eqVar.f37322c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36493d;
            um.c h15 = cVar.h("audio_url");
            str6 = eqVar.f37323d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36493d;
            um.c h16 = cVar.h("description");
            str5 = eqVar.f37324e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36492c == null) {
                this.f36492c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar6 = this.f36492c;
            um.c h17 = cVar.h("duration");
            d2 = eqVar.f37325f;
            mVar6.e(h17, d2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36493d;
            um.c h18 = cVar.h("provider_recording_id");
            str4 = eqVar.f37326g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36491b == null) {
                this.f36491b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f36491b;
            um.c h19 = cVar.h("royalty_free");
            bool = eqVar.f37327h;
            mVar8.e(h19, bool);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f36493d;
            um.c h23 = cVar.h("thumbnail_image_url");
            str3 = eqVar.f37328i;
            mVar9.e(h23, str3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f36493d;
            um.c h24 = cVar.h("title");
            str2 = eqVar.f37329j;
            mVar10.e(h24, str2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36493d == null) {
                this.f36493d = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f36493d;
            um.c h25 = cVar.h("type");
            str = eqVar.f37330k;
            mVar11.e(h25, str);
        }
        cVar.g();
    }
}
