package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class gq extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38109a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38110b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38111c;

    public gq(nm.o oVar) {
        this.f38109a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        fq fqVar = new fq(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -763807553:
                    if (k03.equals("tag_type")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38109a;
            if (c13 == 0) {
                if (this.f38110b == null) {
                    this.f38110b = a.cb.q(oVar, Integer.class);
                }
                fqVar.f37742d = (Integer) this.f38110b.c(aVar);
                boolean[] zArr = fqVar.f37745g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38111c == null) {
                    this.f38111c = a.cb.q(oVar, String.class);
                }
                fqVar.f37739a = (String) this.f38111c.c(aVar);
                boolean[] zArr2 = fqVar.f37745g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f38111c == null) {
                    this.f38111c = a.cb.q(oVar, String.class);
                }
                fqVar.f37741c = (String) this.f38111c.c(aVar);
                boolean[] zArr3 = fqVar.f37745g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f38111c == null) {
                    this.f38111c = a.cb.q(oVar, String.class);
                }
                fqVar.f37744f = (String) this.f38111c.c(aVar);
                boolean[] zArr4 = fqVar.f37745g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f38111c == null) {
                    this.f38111c = a.cb.q(oVar, String.class);
                }
                fqVar.f37743e = (String) this.f38111c.c(aVar);
                boolean[] zArr5 = fqVar.f37745g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38111c == null) {
                    this.f38111c = a.cb.q(oVar, String.class);
                }
                fqVar.f37740b = (String) this.f38111c.c(aVar);
                boolean[] zArr6 = fqVar.f37745g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new iq(fqVar.f37739a, fqVar.f37740b, fqVar.f37741c, fqVar.f37742d, fqVar.f37743e, fqVar.f37744f, fqVar.f37745g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        iq iqVar = (iq) obj;
        if (iqVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = iqVar.f38846g;
        int length = zArr.length;
        nm.o oVar = this.f38109a;
        if (length > 0 && zArr[0]) {
            if (this.f38111c == null) {
                this.f38111c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38111c;
            um.c h10 = cVar.h("id");
            str5 = iqVar.f38840a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38111c == null) {
                this.f38111c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38111c;
            um.c h13 = cVar.h("node_id");
            str4 = iqVar.f38841b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38111c == null) {
                this.f38111c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38111c;
            um.c h14 = cVar.h("name");
            str3 = iqVar.f38842c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38110b == null) {
                this.f38110b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f38110b;
            um.c h15 = cVar.h("tag_type");
            num = iqVar.f38843d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38111c == null) {
                this.f38111c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38111c;
            um.c h16 = cVar.h("thumbnail_image_url");
            str2 = iqVar.f38844e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38111c == null) {
                this.f38111c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38111c;
            um.c h17 = cVar.h("type");
            str = iqVar.f38845f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
