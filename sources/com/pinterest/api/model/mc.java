package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class mc extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40054a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40055b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40056c;

    public mc(nm.o oVar) {
        this.f40054a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        lc lcVar = new lc(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1489980461:
                    if (k03.equals("cluster_title")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 240280960:
                    if (k03.equals("cluster_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 570402602:
                    if (k03.equals("interest")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40054a;
            if (c13 == 0) {
                if (this.f40056c == null) {
                    this.f40056c = a.cb.q(oVar, String.class);
                }
                lcVar.f39700b = (String) this.f40056c.c(aVar);
                boolean[] zArr = lcVar.f39703e;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f40055b == null) {
                    this.f40055b = a.cb.q(oVar, Integer.class);
                }
                lcVar.f39702d = (Integer) this.f40055b.c(aVar);
                boolean[] zArr2 = lcVar.f39703e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f40056c == null) {
                    this.f40056c = a.cb.q(oVar, String.class);
                }
                lcVar.f39699a = (String) this.f40056c.c(aVar);
                boolean[] zArr3 = lcVar.f39703e;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f40056c == null) {
                    this.f40056c = a.cb.q(oVar, String.class);
                }
                lcVar.f39701c = (String) this.f40056c.c(aVar);
                boolean[] zArr4 = lcVar.f39703e;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            }
        }
        aVar.g();
        return new oc(lcVar.f39699a, lcVar.f39700b, lcVar.f39701c, lcVar.f39702d, lcVar.f39703e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        String str3;
        oc ocVar = (oc) obj;
        if (ocVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ocVar.f40672e;
        int length = zArr.length;
        nm.o oVar = this.f40054a;
        if (length > 0 && zArr[0]) {
            if (this.f40056c == null) {
                this.f40056c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40056c;
            um.c h10 = cVar.h("cluster_id");
            str3 = ocVar.f40668a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40056c == null) {
                this.f40056c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40056c;
            um.c h13 = cVar.h("cluster_title");
            str2 = ocVar.f40669b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40056c == null) {
                this.f40056c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40056c;
            um.c h14 = cVar.h("interest");
            str = ocVar.f40670c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40055b == null) {
                this.f40055b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40055b;
            um.c h15 = cVar.h("pin_count");
            num = ocVar.f40671d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
