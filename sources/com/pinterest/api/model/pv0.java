package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class pv0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41121a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41122b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41123c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41124d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41125e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41126f;

    public pv0(nm.o oVar) {
        this.f41121a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ov0 ov0Var = new ov0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1877369177:
                    if (k03.equals("object_fill_color")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1277195731:
                    if (k03.equals("object_text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1277176774:
                    if (k03.equals("object_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1875529192:
                    if (k03.equals("object_graphic")) {
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
            nm.o oVar = this.f41121a;
            if (c13 == 0) {
                if (this.f41124d == null) {
                    this.f41124d = a.cb.q(oVar, jv0.class);
                }
                ov0Var.f40820c = (jv0) this.f41124d.c(aVar);
                boolean[] zArr = ov0Var.f40824g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41126f == null) {
                    this.f41126f = a.cb.q(oVar, vv0.class);
                }
                ov0Var.f40822e = (vv0) this.f41126f.c(aVar);
                boolean[] zArr2 = ov0Var.f40824g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f41122b == null) {
                    this.f41122b = a.cb.q(oVar, Integer.class);
                }
                ov0Var.f40823f = (Integer) this.f41122b.c(aVar);
                boolean[] zArr3 = ov0Var.f40824g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f41123c == null) {
                    this.f41123c = a.cb.q(oVar, String.class);
                }
                ov0Var.f40818a = (String) this.f41123c.c(aVar);
                boolean[] zArr4 = ov0Var.f40824g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f41125e == null) {
                    this.f41125e = a.cb.q(oVar, nv0.class);
                }
                ov0Var.f40821d = (nv0) this.f41125e.c(aVar);
                boolean[] zArr5 = ov0Var.f40824g;
                if (zArr5.length > 3) {
                    zArr5[3] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41123c == null) {
                    this.f41123c = a.cb.q(oVar, String.class);
                }
                ov0Var.f40819b = (String) this.f41123c.c(aVar);
                boolean[] zArr6 = ov0Var.f40824g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return ov0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        vv0 vv0Var;
        nv0 nv0Var;
        jv0 jv0Var;
        String str;
        String str2;
        rv0 rv0Var = (rv0) obj;
        if (rv0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rv0Var.f41689g;
        int length = zArr.length;
        nm.o oVar = this.f41121a;
        if (length > 0 && zArr[0]) {
            if (this.f41123c == null) {
                this.f41123c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41123c;
            um.c h10 = cVar.h("id");
            str2 = rv0Var.f41683a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41123c == null) {
                this.f41123c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41123c;
            um.c h13 = cVar.h("node_id");
            str = rv0Var.f41684b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41124d == null) {
                this.f41124d = a.cb.q(oVar, jv0.class);
            }
            nm.m mVar3 = this.f41124d;
            um.c h14 = cVar.h("object_fill_color");
            jv0Var = rv0Var.f41685c;
            mVar3.e(h14, jv0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41125e == null) {
                this.f41125e = a.cb.q(oVar, nv0.class);
            }
            nm.m mVar4 = this.f41125e;
            um.c h15 = cVar.h("object_graphic");
            nv0Var = rv0Var.f41686d;
            mVar4.e(h15, nv0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41126f == null) {
                this.f41126f = a.cb.q(oVar, vv0.class);
            }
            nm.m mVar5 = this.f41126f;
            um.c h16 = cVar.h("object_text");
            vv0Var = rv0Var.f41687e;
            mVar5.e(h16, vv0Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41122b == null) {
                this.f41122b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f41122b;
            um.c h17 = cVar.h("object_type");
            num = rv0Var.f41688f;
            mVar6.e(h17, num);
        }
        cVar.g();
    }
}
