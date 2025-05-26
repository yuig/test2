package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class hy0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38568a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38569b;

    public hy0(nm.o oVar) {
        this.f38568a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        gy0 gy0Var = new gy0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 19990232:
                    if (k03.equals("key_signature")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 756786664:
                    if (k03.equals("upload_bucket")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1200194290:
                    if (k03.equals("upload_region")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1239095321:
                    if (k03.equals("upload_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38568a;
            if (c13 == 0) {
                if (this.f38569b == null) {
                    this.f38569b = a.cb.q(oVar, String.class);
                }
                gy0Var.f38179a = (String) this.f38569b.c(aVar);
                boolean[] zArr = gy0Var.f38184f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f38569b == null) {
                    this.f38569b = a.cb.q(oVar, String.class);
                }
                gy0Var.f38180b = (String) this.f38569b.c(aVar);
                boolean[] zArr2 = gy0Var.f38184f;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f38569b == null) {
                    this.f38569b = a.cb.q(oVar, String.class);
                }
                gy0Var.f38181c = (String) this.f38569b.c(aVar);
                boolean[] zArr3 = gy0Var.f38184f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f38569b == null) {
                    this.f38569b = a.cb.q(oVar, String.class);
                }
                gy0Var.f38183e = (String) this.f38569b.c(aVar);
                boolean[] zArr4 = gy0Var.f38184f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38569b == null) {
                    this.f38569b = a.cb.q(oVar, String.class);
                }
                gy0Var.f38182d = (String) this.f38569b.c(aVar);
                boolean[] zArr5 = gy0Var.f38184f;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            }
        }
        aVar.g();
        return new jy0(gy0Var.f38179a, gy0Var.f38180b, gy0Var.f38181c, gy0Var.f38182d, gy0Var.f38183e, gy0Var.f38184f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        jy0 jy0Var = (jy0) obj;
        if (jy0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jy0Var.f39178f;
        int length = zArr.length;
        nm.o oVar = this.f38568a;
        if (length > 0 && zArr[0]) {
            if (this.f38569b == null) {
                this.f38569b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38569b;
            um.c h10 = cVar.h("key");
            str5 = jy0Var.f39173a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38569b == null) {
                this.f38569b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38569b;
            um.c h13 = cVar.h("key_signature");
            str4 = jy0Var.f39174b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38569b == null) {
                this.f38569b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38569b;
            um.c h14 = cVar.h("upload_bucket");
            str3 = jy0Var.f39175c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38569b == null) {
                this.f38569b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38569b;
            um.c h15 = cVar.h("upload_id");
            str2 = jy0Var.f39176d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38569b == null) {
                this.f38569b = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38569b;
            um.c h16 = cVar.h("upload_region");
            str = jy0Var.f39177e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
