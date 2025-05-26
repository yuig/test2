package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class rl extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41619a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41620b;

    public rl(nm.o oVar) {
        this.f41619a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ql qlVar = new ql(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -877823861) {
                if (hashCode != 3355) {
                    if (hashCode != 102727412) {
                        if (hashCode == 2114448504 && k03.equals("node_id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("label")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("image_url")) {
                c13 = 0;
            }
            nm.o oVar = this.f41619a;
            if (c13 == 0) {
                if (this.f41620b == null) {
                    this.f41620b = a.cb.q(oVar, String.class);
                }
                qlVar.f41329c = (String) this.f41620b.c(aVar);
                boolean[] zArr = qlVar.f41331e;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f41620b == null) {
                    this.f41620b = a.cb.q(oVar, String.class);
                }
                qlVar.f41327a = (String) this.f41620b.c(aVar);
                boolean[] zArr2 = qlVar.f41331e;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f41620b == null) {
                    this.f41620b = a.cb.q(oVar, String.class);
                }
                qlVar.f41330d = (String) this.f41620b.c(aVar);
                boolean[] zArr3 = qlVar.f41331e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f41620b == null) {
                    this.f41620b = a.cb.q(oVar, String.class);
                }
                qlVar.f41328b = (String) this.f41620b.c(aVar);
                boolean[] zArr4 = qlVar.f41331e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new tl(qlVar.f41327a, qlVar.f41328b, qlVar.f41329c, qlVar.f41330d, qlVar.f41331e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        tl tlVar = (tl) obj;
        if (tlVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = tlVar.f42235e;
        int length = zArr.length;
        nm.o oVar = this.f41619a;
        if (length > 0 && zArr[0]) {
            if (this.f41620b == null) {
                this.f41620b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41620b;
            um.c h10 = cVar.h("id");
            str4 = tlVar.f42231a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41620b == null) {
                this.f41620b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41620b;
            um.c h13 = cVar.h("node_id");
            str3 = tlVar.f42232b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41620b == null) {
                this.f41620b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41620b;
            um.c h14 = cVar.h("image_url");
            str2 = tlVar.f42233c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41620b == null) {
                this.f41620b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41620b;
            um.c h15 = cVar.h("label");
            str = tlVar.f42234d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
