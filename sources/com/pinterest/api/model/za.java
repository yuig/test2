package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class za extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44255a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44256b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44257c;

    public za(nm.o oVar) {
        this.f44255a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        bb bbVar = new bb(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1240326851:
                    if (k03.equals("is_merchant")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -147132913:
                    if (k03.equals("user_id")) {
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
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44255a;
            if (c13 == 0) {
                if (this.f44256b == null) {
                    this.f44256b = a.cb.q(oVar, Boolean.class);
                }
                bbVar.f36041c = (Boolean) this.f44256b.c(aVar);
                boolean[] zArr = bbVar.f36044f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f44257c == null) {
                    this.f44257c = a.cb.q(oVar, String.class);
                }
                bbVar.f36043e = (String) this.f44257c.c(aVar);
                boolean[] zArr2 = bbVar.f36044f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f44257c == null) {
                    this.f44257c = a.cb.q(oVar, String.class);
                }
                bbVar.f36039a = (String) this.f44257c.c(aVar);
                boolean[] zArr3 = bbVar.f36044f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f44257c == null) {
                    this.f44257c = a.cb.q(oVar, String.class);
                }
                bbVar.f36042d = (String) this.f44257c.c(aVar);
                boolean[] zArr4 = bbVar.f36044f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f44257c == null) {
                    this.f44257c = a.cb.q(oVar, String.class);
                }
                bbVar.a((String) this.f44257c.c(aVar));
            }
        }
        aVar.g();
        return new cb(bbVar.f36039a, bbVar.f36040b, bbVar.f36041c, bbVar.f36042d, bbVar.f36043e, bbVar.f36044f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        cb cbVar = (cb) obj;
        if (cbVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cbVar.f36343f;
        int length = zArr.length;
        nm.o oVar = this.f44255a;
        if (length > 0 && zArr[0]) {
            if (this.f44257c == null) {
                this.f44257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44257c;
            um.c h10 = cVar.h("id");
            str4 = cbVar.f36338a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44257c == null) {
                this.f44257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44257c;
            um.c h13 = cVar.h("node_id");
            str3 = cbVar.f36339b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44256b == null) {
                this.f44256b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f44256b;
            um.c h14 = cVar.h("is_merchant");
            bool = cbVar.f36340c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44257c == null) {
                this.f44257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44257c;
            um.c h15 = cVar.h("name");
            str2 = cbVar.f36341d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44257c == null) {
                this.f44257c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44257c;
            um.c h16 = cVar.h("user_id");
            str = cbVar.f36342e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
