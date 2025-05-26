package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class b80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36012a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36013b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36014c;

    public b80(nm.o oVar) {
        this.f36012a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        a80 a80Var = new a80(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -938102371:
                    if (k03.equals("rating")) {
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1359928756:
                    if (k03.equals("review_text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1695724615:
                    if (k03.equals("post_time_since")) {
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
            nm.o oVar = this.f36012a;
            if (c13 == 0) {
                if (this.f36013b == null) {
                    this.f36013b = a.cb.q(oVar, Integer.class);
                }
                a80Var.f35667d = (Integer) this.f36013b.c(aVar);
                boolean[] zArr = a80Var.f35670g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f36014c == null) {
                    this.f36014c = a.cb.q(oVar, String.class);
                }
                a80Var.f35664a = (String) this.f36014c.c(aVar);
                boolean[] zArr2 = a80Var.f35670g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f36014c == null) {
                    this.f36014c = a.cb.q(oVar, String.class);
                }
                a80Var.f35669f = (String) this.f36014c.c(aVar);
                boolean[] zArr3 = a80Var.f35670g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f36014c == null) {
                    this.f36014c = a.cb.q(oVar, String.class);
                }
                a80Var.f35668e = (String) this.f36014c.c(aVar);
                boolean[] zArr4 = a80Var.f35670g;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 == 4) {
                if (this.f36014c == null) {
                    this.f36014c = a.cb.q(oVar, String.class);
                }
                a80Var.f35666c = (String) this.f36014c.c(aVar);
                boolean[] zArr5 = a80Var.f35670g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f36014c == null) {
                    this.f36014c = a.cb.q(oVar, String.class);
                }
                a80Var.f35665b = (String) this.f36014c.c(aVar);
                boolean[] zArr6 = a80Var.f35670g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new d80(a80Var.f35664a, a80Var.f35665b, a80Var.f35666c, a80Var.f35667d, a80Var.f35668e, a80Var.f35669f, a80Var.f35670g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        d80 d80Var = (d80) obj;
        if (d80Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = d80Var.f36681g;
        int length = zArr.length;
        nm.o oVar = this.f36012a;
        if (length > 0 && zArr[0]) {
            if (this.f36014c == null) {
                this.f36014c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36014c;
            um.c h10 = cVar.h("id");
            str5 = d80Var.f36675a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36014c == null) {
                this.f36014c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36014c;
            um.c h13 = cVar.h("node_id");
            str4 = d80Var.f36676b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36014c == null) {
                this.f36014c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36014c;
            um.c h14 = cVar.h("post_time_since");
            str3 = d80Var.f36677c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36013b == null) {
                this.f36013b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36013b;
            um.c h15 = cVar.h("rating");
            num = d80Var.f36678d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36014c == null) {
                this.f36014c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36014c;
            um.c h16 = cVar.h("review_text");
            str2 = d80Var.f36679e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36014c == null) {
                this.f36014c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36014c;
            um.c h17 = cVar.h("title");
            str = d80Var.f36680f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
