package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class b8 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36009a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36010b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36011c;

    public b8(nm.o oVar) {
        this.f36009a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        d8 d8Var = new d8(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1175084785:
                    if (k03.equals("xlarge_image_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -988161019:
                    if (k03.equals("pin_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -68291070:
                    if (k03.equals("root_pin_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -40525689:
                    if (k03.equals("large_image_url")) {
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
                case 41605835:
                    if (k03.equals("cropping_info")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36009a;
            switch (c13) {
                case 0:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36673h = (String) this.f36011c.c(aVar);
                    boolean[] zArr = d8Var.f36674i;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36671f = (String) this.f36011c.c(aVar);
                    boolean[] zArr2 = d8Var.f36674i;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36672g = (String) this.f36011c.c(aVar);
                    boolean[] zArr3 = d8Var.f36674i;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36670e = (String) this.f36011c.c(aVar);
                    boolean[] zArr4 = d8Var.f36674i;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36666a = (String) this.f36011c.c(aVar);
                    boolean[] zArr5 = d8Var.f36674i;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f36010b == null) {
                        this.f36010b = a.cb.q(oVar, i8.class);
                    }
                    d8Var.f36668c = (i8) this.f36010b.c(aVar);
                    boolean[] zArr6 = d8Var.f36674i;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36669d = (String) this.f36011c.c(aVar);
                    boolean[] zArr7 = d8Var.f36674i;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case 7:
                    if (this.f36011c == null) {
                        this.f36011c = a.cb.q(oVar, String.class);
                    }
                    d8Var.f36667b = (String) this.f36011c.c(aVar);
                    boolean[] zArr8 = d8Var.f36674i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new e8(d8Var.f36666a, d8Var.f36667b, d8Var.f36668c, d8Var.f36669d, d8Var.f36670e, d8Var.f36671f, d8Var.f36672g, d8Var.f36673h, d8Var.f36674i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        i8 i8Var;
        String str6;
        String str7;
        e8 e8Var = (e8) obj;
        if (e8Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e8Var.f37204i;
        int length = zArr.length;
        nm.o oVar = this.f36009a;
        if (length > 0 && zArr[0]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36011c;
            um.c h10 = cVar.h("id");
            str7 = e8Var.f37196a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36011c;
            um.c h13 = cVar.h("node_id");
            str6 = e8Var.f37197b;
            mVar2.e(h13, str6);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36010b == null) {
                this.f36010b = a.cb.q(oVar, i8.class);
            }
            nm.m mVar3 = this.f36010b;
            um.c h14 = cVar.h("cropping_info");
            i8Var = e8Var.f37198c;
            mVar3.e(h14, i8Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36011c;
            um.c h15 = cVar.h("image_signature");
            str5 = e8Var.f37199d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36011c;
            um.c h16 = cVar.h("large_image_url");
            str4 = e8Var.f37200e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36011c;
            um.c h17 = cVar.h("pin_id");
            str3 = e8Var.f37201f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36011c;
            um.c h18 = cVar.h("root_pin_id");
            str2 = e8Var.f37202g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36011c == null) {
                this.f36011c = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f36011c;
            um.c h19 = cVar.h("xlarge_image_url");
            str = e8Var.f37203h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
