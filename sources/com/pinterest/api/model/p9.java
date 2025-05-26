package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class p9 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40917a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40918b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40919c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40920d;

    public p9(nm.o oVar) {
        this.f40917a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        r9 r9Var = new r9(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -968675200) {
                if (hashCode != 3355) {
                    if (hashCode != 1554309810) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("board_note_list")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("board_note_list_item")) {
                c13 = 0;
            }
            nm.o oVar = this.f40917a;
            if (c13 == 0) {
                if (this.f40919c == null) {
                    this.f40919c = a.cb.q(oVar, o9.class);
                }
                r9Var.f41519d = (o9) this.f40919c.c(aVar);
                boolean[] zArr = r9Var.f41520e;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f40920d == null) {
                    this.f40920d = a.cb.q(oVar, String.class);
                }
                r9Var.f41516a = (String) this.f40920d.c(aVar);
                boolean[] zArr2 = r9Var.f41520e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f40918b == null) {
                    this.f40918b = a.cb.q(oVar, k9.class);
                }
                r9Var.f41518c = (k9) this.f40918b.c(aVar);
                boolean[] zArr3 = r9Var.f41520e;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40920d == null) {
                    this.f40920d = a.cb.q(oVar, String.class);
                }
                r9Var.f41517b = (String) this.f40920d.c(aVar);
                boolean[] zArr4 = r9Var.f41520e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new s9(r9Var.f41516a, r9Var.f41517b, r9Var.f41518c, r9Var.f41519d, r9Var.f41520e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        o9 o9Var;
        k9 k9Var;
        String str;
        String str2;
        s9 s9Var = (s9) obj;
        if (s9Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = s9Var.f41831e;
        int length = zArr.length;
        nm.o oVar = this.f40917a;
        if (length > 0 && zArr[0]) {
            if (this.f40920d == null) {
                this.f40920d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40920d;
            um.c h10 = cVar.h("id");
            str2 = s9Var.f41827a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40920d == null) {
                this.f40920d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40920d;
            um.c h13 = cVar.h("node_id");
            str = s9Var.f41828b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40918b == null) {
                this.f40918b = a.cb.q(oVar, k9.class);
            }
            nm.m mVar3 = this.f40918b;
            um.c h14 = cVar.h("board_note_list");
            k9Var = s9Var.f41829c;
            mVar3.e(h14, k9Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40919c == null) {
                this.f40919c = a.cb.q(oVar, o9.class);
            }
            nm.m mVar4 = this.f40919c;
            um.c h15 = cVar.h("board_note_list_item");
            o9Var = s9Var.f41830d;
            mVar4.e(h15, o9Var);
        }
        cVar.g();
    }
}
