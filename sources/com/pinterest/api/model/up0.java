package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class up0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42622a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42623b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42624c;

    public up0(nm.o oVar) {
        this.f42622a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tp0 tp0Var = new tp0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 96712:
                    if (k03.equals("amt")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
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
            nm.o oVar = this.f42622a;
            if (c13 == 0) {
                if (this.f42624c == null) {
                    this.f42624c = a.cb.q(oVar, String.class);
                }
                tp0Var.f42267b = (String) this.f42624c.c(aVar);
                boolean[] zArr = tp0Var.f42270e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f42624c == null) {
                    this.f42624c = a.cb.q(oVar, String.class);
                }
                tp0Var.f42268c = (String) this.f42624c.c(aVar);
                boolean[] zArr2 = tp0Var.f42270e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f42624c == null) {
                    this.f42624c = a.cb.q(oVar, String.class);
                }
                tp0Var.f42269d = (String) this.f42624c.c(aVar);
                boolean[] zArr3 = tp0Var.f42270e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f42623b == null) {
                    this.f42623b = a.cb.q(oVar, Integer.class);
                }
                tp0Var.f42266a = (Integer) this.f42623b.c(aVar);
                boolean[] zArr4 = tp0Var.f42270e;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            }
        }
        aVar.g();
        return new wp0(tp0Var.f42266a, tp0Var.f42267b, tp0Var.f42268c, tp0Var.f42269d, tp0Var.f42270e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        wp0 wp0Var = (wp0) obj;
        if (wp0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wp0Var.f43329e;
        int length = zArr.length;
        nm.o oVar = this.f42622a;
        if (length > 0 && zArr[0]) {
            if (this.f42623b == null) {
                this.f42623b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f42623b;
            um.c h10 = cVar.h("block_type");
            num = wp0Var.f43325a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42624c == null) {
                this.f42624c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42624c;
            um.c h13 = cVar.h("amt");
            str3 = wp0Var.f43326b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42624c == null) {
                this.f42624c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42624c;
            um.c h14 = cVar.h("name");
            str2 = wp0Var.f43327c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42624c == null) {
                this.f42624c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42624c;
            um.c h15 = cVar.h("type");
            str = wp0Var.f43328d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
