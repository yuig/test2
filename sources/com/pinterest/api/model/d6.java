package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class d6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36657a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36658b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36659c;

    public d6(nm.o oVar) {
        this.f36657a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        f6 f6Var = new f6(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1221029593:
                    if (k03.equals("height")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 113126854:
                    if (k03.equals("width")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1825632156:
                    if (k03.equals("thumbnail_url")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36657a;
            if (c13 == 0) {
                if (this.f36658b == null) {
                    this.f36658b = a.cb.q(oVar, Integer.class);
                }
                f6Var.f37572a = (Integer) this.f36658b.c(aVar);
                boolean[] zArr = f6Var.f37576e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f36659c == null) {
                    this.f36659c = a.cb.q(oVar, String.class);
                }
                f6Var.f37574c = (String) this.f36659c.c(aVar);
                boolean[] zArr2 = f6Var.f37576e;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f36658b == null) {
                    this.f36658b = a.cb.q(oVar, Integer.class);
                }
                f6Var.f37575d = (Integer) this.f36658b.c(aVar);
                boolean[] zArr3 = f6Var.f37576e;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f36659c == null) {
                    this.f36659c = a.cb.q(oVar, String.class);
                }
                f6Var.f37573b = (String) this.f36659c.c(aVar);
                boolean[] zArr4 = f6Var.f37576e;
                if (zArr4.length > 1) {
                    zArr4[1] = true;
                }
            }
        }
        aVar.g();
        return new g6(f6Var.f37572a, f6Var.f37573b, f6Var.f37574c, f6Var.f37575d, f6Var.f37576e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        String str2;
        Integer num2;
        g6 g6Var = (g6) obj;
        if (g6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = g6Var.f37971e;
        int length = zArr.length;
        nm.o oVar = this.f36657a;
        if (length > 0 && zArr[0]) {
            if (this.f36658b == null) {
                this.f36658b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f36658b;
            um.c h10 = cVar.h("height");
            num2 = g6Var.f37967a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36659c == null) {
                this.f36659c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36659c;
            um.c h13 = cVar.h("thumbnail_url");
            str2 = g6Var.f37968b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36659c == null) {
                this.f36659c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36659c;
            um.c h14 = cVar.h("type");
            str = g6Var.f37969c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36658b == null) {
                this.f36658b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36658b;
            um.c h15 = cVar.h("width");
            num = g6Var.f37970d;
            mVar4.e(h15, num);
        }
        cVar.g();
    }
}
