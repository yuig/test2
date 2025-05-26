package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class lo0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39846a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39847b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39848c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39849d;

    public lo0(nm.o oVar) {
        this.f39846a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ko0 ko0Var = new ko0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1044400713:
                    if (k03.equals("provider_recording_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 93166550:
                    if (k03.equals("audio")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39846a;
            if (c13 == 0) {
                if (this.f39849d == null) {
                    this.f39849d = a.cb.q(oVar, String.class);
                }
                ko0Var.f39504c = (String) this.f39849d.c(aVar);
                boolean[] zArr = ko0Var.f39506e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f39849d == null) {
                    this.f39849d = a.cb.q(oVar, String.class);
                }
                ko0Var.f39505d = (String) this.f39849d.c(aVar);
                boolean[] zArr2 = ko0Var.f39506e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f39848c == null) {
                    this.f39848c = a.cb.q(oVar, mk0.class);
                }
                ko0Var.f39503b = (mk0) this.f39848c.c(aVar);
                boolean[] zArr3 = ko0Var.f39506e;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f39847b == null) {
                    this.f39847b = a.cb.q(oVar, Integer.class);
                }
                ko0Var.f39502a = (Integer) this.f39847b.c(aVar);
                boolean[] zArr4 = ko0Var.f39506e;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new no0(ko0Var.f39502a, ko0Var.f39503b, ko0Var.f39504c, ko0Var.f39505d, ko0Var.f39506e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        mk0 mk0Var;
        Integer num;
        no0 no0Var = (no0) obj;
        if (no0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = no0Var.f40452e;
        int length = zArr.length;
        nm.o oVar = this.f39846a;
        if (length > 0 && zArr[0]) {
            if (this.f39847b == null) {
                this.f39847b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f39847b;
            um.c h10 = cVar.h("block_type");
            num = no0Var.f40448a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39848c == null) {
                this.f39848c = a.cb.q(oVar, mk0.class);
            }
            nm.m mVar2 = this.f39848c;
            um.c h13 = cVar.h("audio");
            mk0Var = no0Var.f40449b;
            mVar2.e(h13, mk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39849d == null) {
                this.f39849d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39849d;
            um.c h14 = cVar.h("provider_recording_id");
            str2 = no0Var.f40450c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39849d == null) {
                this.f39849d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f39849d;
            um.c h15 = cVar.h("type");
            str = no0Var.f40451d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
