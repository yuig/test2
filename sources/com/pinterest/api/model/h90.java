package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class h90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38352a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38353b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38354c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38355d;

    public h90(nm.o oVar) {
        this.f38352a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        g90 g90Var = new g90(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1249853396:
                    if (k03.equals("is_default")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -906953308:
                    if (k03.equals("tab_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38352a;
            if (c13 == 0) {
                if (this.f38353b == null) {
                    this.f38353b = a.cb.q(oVar, Boolean.class);
                }
                g90Var.b((Boolean) this.f38353b.c(aVar));
            } else if (c13 != 1) {
                boolean[] zArr = g90Var.f38001f;
                if (c13 == 2) {
                    if (this.f38355d == null) {
                        this.f38355d = a.cb.q(oVar, String.class);
                    }
                    g90Var.f37996a = (String) this.f38355d.c(aVar);
                    if (zArr.length > 0) {
                        zArr[0] = true;
                    }
                } else if (c13 == 3) {
                    if (this.f38355d == null) {
                        this.f38355d = a.cb.q(oVar, String.class);
                    }
                    g90Var.c((String) this.f38355d.c(aVar));
                } else if (c13 != 4) {
                    aVar.E();
                } else {
                    if (this.f38355d == null) {
                        this.f38355d = a.cb.q(oVar, String.class);
                    }
                    g90Var.f37997b = (String) this.f38355d.c(aVar);
                    if (zArr.length > 1) {
                        zArr[1] = true;
                    }
                }
            } else {
                if (this.f38354c == null) {
                    this.f38354c = a.cb.q(oVar, Integer.class);
                }
                g90Var.d((Integer) this.f38354c.c(aVar));
            }
        }
        aVar.g();
        return g90Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Boolean bool;
        String str2;
        String str3;
        j90 j90Var = (j90) obj;
        if (j90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = j90Var.f39017f;
        int length = zArr.length;
        nm.o oVar = this.f38352a;
        if (length > 0 && zArr[0]) {
            if (this.f38355d == null) {
                this.f38355d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38355d;
            um.c h10 = cVar.h("id");
            str3 = j90Var.f39012a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38355d == null) {
                this.f38355d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38355d;
            um.c h13 = cVar.h("node_id");
            str2 = j90Var.f39013b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38353b == null) {
                this.f38353b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f38353b;
            um.c h14 = cVar.h("is_default");
            bool = j90Var.f39014c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38355d == null) {
                this.f38355d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38355d;
            um.c h15 = cVar.h("name");
            str = j90Var.f39015d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38354c == null) {
                this.f38354c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f38354c;
            um.c h16 = cVar.h("tab_type");
            num = j90Var.f39016e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
