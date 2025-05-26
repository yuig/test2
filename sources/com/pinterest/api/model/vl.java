package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class vl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42912a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42913b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42914c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42915d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42916e;

    public vl(nm.o oVar) {
        this.f42912a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ul ulVar = new ul(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1422950858:
                    if (k03.equals("action")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 270940796:
                    if (k03.equals("disabled")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 456541712:
                    if (k03.equals("is_selected")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1671764162:
                    if (k03.equals("display")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42912a;
            switch (c13) {
                case 0:
                    if (this.f42914c == null) {
                        this.f42914c = a.cb.q(oVar, k00.class);
                    }
                    ulVar.f42574c = (k00) this.f42914c.c(aVar);
                    boolean[] zArr = ulVar.f42579h;
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 1:
                    if (this.f42916e == null) {
                        this.f42916e = a.cb.q(oVar, String.class);
                    }
                    ulVar.f42572a = (String) this.f42916e.c(aVar);
                    boolean[] zArr2 = ulVar.f42579h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 2:
                    if (this.f42916e == null) {
                        this.f42916e = a.cb.q(oVar, String.class);
                    }
                    ulVar.f42578g = (String) this.f42916e.c(aVar);
                    boolean[] zArr3 = ulVar.f42579h;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f42913b == null) {
                        this.f42913b = a.cb.q(oVar, Boolean.class);
                    }
                    ulVar.f42575d = (Boolean) this.f42913b.c(aVar);
                    boolean[] zArr4 = ulVar.f42579h;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                case 4:
                    if (this.f42913b == null) {
                        this.f42913b = a.cb.q(oVar, Boolean.class);
                    }
                    ulVar.f42577f = (Boolean) this.f42913b.c(aVar);
                    boolean[] zArr5 = ulVar.f42579h;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f42915d == null) {
                        this.f42915d = a.cb.q(oVar, o00.class);
                    }
                    ulVar.f42576e = (o00) this.f42915d.c(aVar);
                    boolean[] zArr6 = ulVar.f42579h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f42916e == null) {
                        this.f42916e = a.cb.q(oVar, String.class);
                    }
                    ulVar.f42573b = (String) this.f42916e.c(aVar);
                    boolean[] zArr7 = ulVar.f42579h;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return ulVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Boolean bool;
        o00 o00Var;
        Boolean bool2;
        k00 k00Var;
        String str2;
        String str3;
        xl xlVar = (xl) obj;
        if (xlVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = xlVar.f43742h;
        int length = zArr.length;
        nm.o oVar = this.f42912a;
        if (length > 0 && zArr[0]) {
            if (this.f42916e == null) {
                this.f42916e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42916e;
            um.c h10 = cVar.h("id");
            str3 = xlVar.f43735a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42916e == null) {
                this.f42916e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42916e;
            um.c h13 = cVar.h("node_id");
            str2 = xlVar.f43736b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42914c == null) {
                this.f42914c = a.cb.q(oVar, k00.class);
            }
            nm.m mVar3 = this.f42914c;
            um.c h14 = cVar.h("action");
            k00Var = xlVar.f43737c;
            mVar3.e(h14, k00Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42913b == null) {
                this.f42913b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f42913b;
            um.c h15 = cVar.h("disabled");
            bool2 = xlVar.f43738d;
            mVar4.e(h15, bool2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42915d == null) {
                this.f42915d = a.cb.q(oVar, o00.class);
            }
            nm.m mVar5 = this.f42915d;
            um.c h16 = cVar.h("display");
            o00Var = xlVar.f43739e;
            mVar5.e(h16, o00Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42913b == null) {
                this.f42913b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f42913b;
            um.c h17 = cVar.h("is_selected");
            bool = xlVar.f43740f;
            mVar6.e(h17, bool);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42916e == null) {
                this.f42916e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42916e;
            um.c h18 = cVar.h("type");
            str = xlVar.f43741g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
