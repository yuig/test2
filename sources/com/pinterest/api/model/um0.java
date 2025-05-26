package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class um0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42592a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42593b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42594c;

    public um0(nm.o oVar) {
        this.f42592a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        tm0 tm0Var = new tm0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 106079) {
                if (hashCode != 111972721) {
                    if (hashCode == 338885083 && k03.equals("category_type")) {
                        c13 = 2;
                    }
                } else if (k03.equals("value")) {
                    c13 = 1;
                }
            } else if (k03.equals("key")) {
                c13 = 0;
            }
            nm.o oVar = this.f42592a;
            if (c13 == 0) {
                if (this.f42594c == null) {
                    this.f42594c = a.cb.q(oVar, String.class);
                }
                tm0Var.f42240b = (String) this.f42594c.c(aVar);
                boolean[] zArr = tm0Var.f42242d;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f42594c == null) {
                    this.f42594c = a.cb.q(oVar, String.class);
                }
                tm0Var.f42241c = (String) this.f42594c.c(aVar);
                boolean[] zArr2 = tm0Var.f42242d;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f42593b == null) {
                    this.f42593b = a.cb.q(oVar, Integer.class);
                }
                tm0Var.f42239a = (Integer) this.f42593b.c(aVar);
                boolean[] zArr3 = tm0Var.f42242d;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            }
        }
        aVar.g();
        return new wm0(tm0Var.f42239a, tm0Var.f42240b, tm0Var.f42241c, tm0Var.f42242d, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        wm0 wm0Var = (wm0) obj;
        if (wm0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wm0Var.f43294d;
        int length = zArr.length;
        nm.o oVar = this.f42592a;
        if (length > 0 && zArr[0]) {
            if (this.f42593b == null) {
                this.f42593b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f42593b;
            um.c h10 = cVar.h("category_type");
            num = wm0Var.f43291a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42594c == null) {
                this.f42594c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42594c;
            um.c h13 = cVar.h("key");
            str2 = wm0Var.f43292b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42594c == null) {
                this.f42594c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42594c;
            um.c h14 = cVar.h("value");
            str = wm0Var.f43293c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
