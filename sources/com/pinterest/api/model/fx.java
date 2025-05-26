package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class fx extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37836a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37837b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37838c;

    public fx(nm.o oVar) {
        this.f37836a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ex exVar = new ex(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1409097913:
                    if (k03.equals("artist")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1044400713:
                    if (k03.equals("provider_recording_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3242203:
                    if (k03.equals("isrc")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 50818559:
                    if (k03.equals("is_embedded")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37836a;
            if (c13 == 0) {
                if (this.f37838c == null) {
                    this.f37838c = a.cb.q(oVar, String.class);
                }
                exVar.b((String) this.f37838c.c(aVar));
            } else if (c13 == 1) {
                if (this.f37838c == null) {
                    this.f37838c = a.cb.q(oVar, String.class);
                }
                exVar.e((String) this.f37838c.c(aVar));
            } else if (c13 == 2) {
                if (this.f37838c == null) {
                    this.f37838c = a.cb.q(oVar, String.class);
                }
                exVar.d((String) this.f37838c.c(aVar));
            } else if (c13 == 3) {
                if (this.f37837b == null) {
                    this.f37837b = a.cb.q(oVar, Boolean.class);
                }
                exVar.c((Boolean) this.f37837b.c(aVar));
            } else if (c13 == 4) {
                if (this.f37838c == null) {
                    this.f37838c = a.cb.q(oVar, String.class);
                }
                exVar.g((String) this.f37838c.c(aVar));
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f37838c == null) {
                    this.f37838c = a.cb.q(oVar, String.class);
                }
                exVar.f((String) this.f37838c.c(aVar));
            }
        }
        aVar.g();
        return exVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        hx hxVar = (hx) obj;
        if (hxVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hxVar.f38560g;
        int length = zArr.length;
        nm.o oVar = this.f37836a;
        if (length > 0 && zArr[0]) {
            if (this.f37838c == null) {
                this.f37838c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37838c;
            um.c h10 = cVar.h("artist");
            str5 = hxVar.f38554a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37837b == null) {
                this.f37837b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar2 = this.f37837b;
            um.c h13 = cVar.h("is_embedded");
            bool = hxVar.f38555b;
            mVar2.e(h13, bool);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37838c == null) {
                this.f37838c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37838c;
            um.c h14 = cVar.h("isrc");
            str4 = hxVar.f38556c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37838c == null) {
                this.f37838c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37838c;
            um.c h15 = cVar.h("provider_recording_id");
            str3 = hxVar.f38557d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37838c == null) {
                this.f37838c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f37838c;
            um.c h16 = cVar.h("thumbnail_image_url");
            str2 = hxVar.f38558e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37838c == null) {
                this.f37838c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f37838c;
            um.c h17 = cVar.h("title");
            str = hxVar.f38559f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
