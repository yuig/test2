package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class a extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35595a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35596b;

    public a(nm.o oVar) {
        this.f35595a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        c cVar = new c(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2092131245:
                    if (k03.equals("image_small_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1677176261:
                    if (k03.equals("full_name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -160985414:
                    if (k03.equals("first_name")) {
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
                case 1285125719:
                    if (k03.equals("image_xlarge_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2013122196:
                    if (k03.equals("last_name")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35595a;
            switch (c13) {
                case 0:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36252g = (String) this.f35596b.c(aVar);
                    boolean[] zArr = cVar.f36255j;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36249d = (String) this.f35596b.c(aVar);
                    boolean[] zArr2 = cVar.f36255j;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36248c = (String) this.f35596b.c(aVar);
                    boolean[] zArr3 = cVar.f36255j;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36246a = (String) this.f35596b.c(aVar);
                    boolean[] zArr4 = cVar.f36255j;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36250e = (String) this.f35596b.c(aVar);
                    boolean[] zArr5 = cVar.f36255j;
                    if (zArr5.length <= 4) {
                        break;
                    } else {
                        zArr5[4] = true;
                        break;
                    }
                case 5:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36251f = (String) this.f35596b.c(aVar);
                    boolean[] zArr6 = cVar.f36255j;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36253h = (String) this.f35596b.c(aVar);
                    boolean[] zArr7 = cVar.f36255j;
                    if (zArr7.length <= 7) {
                        break;
                    } else {
                        zArr7[7] = true;
                        break;
                    }
                case 7:
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36254i = (String) this.f35596b.c(aVar);
                    boolean[] zArr8 = cVar.f36255j;
                    if (zArr8.length <= 8) {
                        break;
                    } else {
                        zArr8[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f35596b == null) {
                        this.f35596b = a.cb.q(oVar, String.class);
                    }
                    cVar.f36247b = (String) this.f35596b.c(aVar);
                    boolean[] zArr9 = cVar.f36255j;
                    if (zArr9.length <= 1) {
                        break;
                    } else {
                        zArr9[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new d(cVar.f36246a, cVar.f36247b, cVar.f36248c, cVar.f36249d, cVar.f36250e, cVar.f36251f, cVar.f36252g, cVar.f36253h, cVar.f36254i, cVar.f36255j, 0);
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
        String str9;
        d dVar = (d) obj;
        if (dVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dVar.f36588j;
        int length = zArr.length;
        nm.o oVar = this.f35595a;
        if (length > 0 && zArr[0]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35596b;
            um.c h10 = cVar.h("id");
            str9 = dVar.f36579a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35596b;
            um.c h13 = cVar.h("node_id");
            str8 = dVar.f36580b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35596b;
            um.c h14 = cVar.h("first_name");
            str7 = dVar.f36581c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35596b;
            um.c h15 = cVar.h("full_name");
            str6 = dVar.f36582d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35596b;
            um.c h16 = cVar.h("image_large_url");
            str5 = dVar.f36583e;
            mVar5.e(h16, str5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f35596b;
            um.c h17 = cVar.h("image_medium_url");
            str4 = dVar.f36584f;
            mVar6.e(h17, str4);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f35596b;
            um.c h18 = cVar.h("image_small_url");
            str3 = dVar.f36585g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f35596b;
            um.c h19 = cVar.h("image_xlarge_url");
            str2 = dVar.f36586h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f35596b == null) {
                this.f35596b = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f35596b;
            um.c h23 = cVar.h("last_name");
            str = dVar.f36587i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
