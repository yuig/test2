package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class br extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36169a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36170b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36171c;

    public br(nm.o oVar) {
        this.f36169a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ar arVar = new ar(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1715701617:
                    if (k03.equals("hero_image_signature")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -536830209:
                    if (k03.equals("contributor_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -247981657:
                    if (k03.equals("fill_color")) {
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
                case 3559906:
                    if (k03.equals("tier")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1258230406:
                    if (k03.equals("hero_image_url")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1615086568:
                    if (k03.equals("display_name")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36169a;
            switch (c13) {
                case 0:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35832d = (String) this.f36171c.c(aVar);
                    boolean[] zArr = arVar.f35839k;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35835g = (String) this.f36171c.c(aVar);
                    boolean[] zArr2 = arVar.f35839k;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35831c = (String) this.f36171c.c(aVar);
                    boolean[] zArr3 = arVar.f35839k;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35834f = (String) this.f36171c.c(aVar);
                    boolean[] zArr4 = arVar.f35839k;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35829a = (String) this.f36171c.c(aVar);
                    boolean[] zArr5 = arVar.f35839k;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f36170b == null) {
                        this.f36170b = a.cb.q(oVar, Integer.class);
                    }
                    arVar.f35837i = (Integer) this.f36170b.c(aVar);
                    boolean[] zArr6 = arVar.f35839k;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case 6:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35838j = (String) this.f36171c.c(aVar);
                    boolean[] zArr7 = arVar.f35839k;
                    if (zArr7.length <= 9) {
                        break;
                    } else {
                        zArr7[9] = true;
                        break;
                    }
                case 7:
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35836h = (String) this.f36171c.c(aVar);
                    boolean[] zArr8 = arVar.f35839k;
                    if (zArr8.length <= 7) {
                        break;
                    } else {
                        zArr8[7] = true;
                        break;
                    }
                case '\b':
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35833e = (String) this.f36171c.c(aVar);
                    boolean[] zArr9 = arVar.f35839k;
                    if (zArr9.length <= 4) {
                        break;
                    } else {
                        zArr9[4] = true;
                        break;
                    }
                case '\t':
                    if (this.f36171c == null) {
                        this.f36171c = a.cb.q(oVar, String.class);
                    }
                    arVar.f35830b = (String) this.f36171c.c(aVar);
                    boolean[] zArr10 = arVar.f35839k;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new dr(arVar.f35829a, arVar.f35830b, arVar.f35831c, arVar.f35832d, arVar.f35833e, arVar.f35834f, arVar.f35835g, arVar.f35836h, arVar.f35837i, arVar.f35838j, arVar.f35839k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        dr drVar = (dr) obj;
        if (drVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = drVar.f36925k;
        int length = zArr.length;
        nm.o oVar = this.f36169a;
        if (length > 0 && zArr[0]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36171c;
            um.c h10 = cVar.h("id");
            str9 = drVar.f36915a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36171c;
            um.c h13 = cVar.h("node_id");
            str8 = drVar.f36916b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36171c;
            um.c h14 = cVar.h("contributor_id");
            str7 = drVar.f36917c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36171c;
            um.c h15 = cVar.h("description");
            str6 = drVar.f36918d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36171c;
            um.c h16 = cVar.h("display_name");
            str5 = drVar.f36919e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36171c;
            um.c h17 = cVar.h("fill_color");
            str4 = drVar.f36920f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36171c;
            um.c h18 = cVar.h("hero_image_signature");
            str3 = drVar.f36921g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f36171c;
            um.c h19 = cVar.h("hero_image_url");
            str2 = drVar.f36922h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36170b == null) {
                this.f36170b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f36170b;
            um.c h23 = cVar.h("tier");
            num = drVar.f36923i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36171c == null) {
                this.f36171c = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f36171c;
            um.c h24 = cVar.h("type");
            str = drVar.f36924j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
