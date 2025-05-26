package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class zr extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44421a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44422b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44423c;

    public zr(nm.o oVar) {
        this.f44421a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yr yrVar = new yr(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 100346066:
                    if (k03.equals("index")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 108285963:
                    if (k03.equals("ratio")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1451097503:
                    if (k03.equals("friendly_name")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44421a;
            if (c13 == 0) {
                if (this.f44423c == null) {
                    this.f44423c = a.cb.q(oVar, String.class);
                }
                yrVar.f44102c = (String) this.f44423c.c(aVar);
                boolean[] zArr = yrVar.f44104e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f44422b == null) {
                    this.f44422b = a.cb.q(oVar, Double.class);
                }
                yrVar.f44101b = (Double) this.f44422b.c(aVar);
                boolean[] zArr2 = yrVar.f44104e;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f44422b == null) {
                    this.f44422b = a.cb.q(oVar, Double.class);
                }
                yrVar.f44103d = (Double) this.f44422b.c(aVar);
                boolean[] zArr3 = yrVar.f44104e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f44423c == null) {
                    this.f44423c = a.cb.q(oVar, String.class);
                }
                yrVar.f44100a = (String) this.f44423c.c(aVar);
                boolean[] zArr4 = yrVar.f44104e;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new bs(yrVar.f44100a, yrVar.f44101b, yrVar.f44102c, yrVar.f44103d, yrVar.f44104e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Double d2;
        String str;
        Double d13;
        String str2;
        bs bsVar = (bs) obj;
        if (bsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bsVar.f36177e;
        int length = zArr.length;
        nm.o oVar = this.f44421a;
        if (length > 0 && zArr[0]) {
            if (this.f44423c == null) {
                this.f44423c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44423c;
            um.c h10 = cVar.h("friendly_name");
            str2 = bsVar.f36173a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44422b == null) {
                this.f44422b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar2 = this.f44422b;
            um.c h13 = cVar.h("index");
            d13 = bsVar.f36174b;
            mVar2.e(h13, d13);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44423c == null) {
                this.f44423c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44423c;
            um.c h14 = cVar.h("name");
            str = bsVar.f36175c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44422b == null) {
                this.f44422b = a.cb.q(oVar, Double.class);
            }
            nm.m mVar4 = this.f44422b;
            um.c h15 = cVar.h("ratio");
            d2 = bsVar.f36176d;
            mVar4.e(h15, d2);
        }
        cVar.g();
    }
}
