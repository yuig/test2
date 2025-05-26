package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class rs0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41661a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41662b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41663c;

    public rs0(nm.o oVar) {
        this.f41661a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        qs0 h10 = ts0.h();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1489595877:
                    if (k03.equals("object_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1106363674:
                    if (k03.equals("length")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1019779949:
                    if (k03.equals("offset")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -763807553:
                    if (k03.equals("tag_type")) {
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
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            boolean[] zArr = h10.f41369h;
            nm.o oVar = this.f41661a;
            switch (c13) {
                case 0:
                    if (this.f41663c == null) {
                        this.f41663c = a.cb.q(oVar, String.class);
                    }
                    h10.d((String) this.f41663c.c(aVar));
                    break;
                case 1:
                    if (this.f41662b == null) {
                        this.f41662b = a.cb.q(oVar, Integer.class);
                    }
                    h10.b((Integer) this.f41662b.c(aVar));
                    break;
                case 2:
                    if (this.f41662b == null) {
                        this.f41662b = a.cb.q(oVar, Integer.class);
                    }
                    h10.e((Integer) this.f41662b.c(aVar));
                    break;
                case 3:
                    if (this.f41662b == null) {
                        this.f41662b = a.cb.q(oVar, Integer.class);
                    }
                    h10.f((Integer) this.f41662b.c(aVar));
                    break;
                case 4:
                    if (this.f41663c == null) {
                        this.f41663c = a.cb.q(oVar, String.class);
                    }
                    h10.f41362a = (String) this.f41663c.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 5:
                    if (this.f41663c == null) {
                        this.f41663c = a.cb.q(oVar, String.class);
                    }
                    h10.c((String) this.f41663c.c(aVar));
                    break;
                case 6:
                    if (this.f41663c == null) {
                        this.f41663c = a.cb.q(oVar, String.class);
                    }
                    h10.f41368g = (String) this.f41663c.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return h10.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        Integer num3;
        String str4;
        ts0 ts0Var = (ts0) obj;
        if (ts0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ts0Var.f42291h;
        int length = zArr.length;
        nm.o oVar = this.f41661a;
        if (length > 0 && zArr[0]) {
            if (this.f41663c == null) {
                this.f41663c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41663c;
            um.c h10 = cVar.h("id");
            str4 = ts0Var.f42284a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41662b == null) {
                this.f41662b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f41662b;
            um.c h13 = cVar.h("length");
            num3 = ts0Var.f42285b;
            mVar2.e(h13, num3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41663c == null) {
                this.f41663c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f41663c;
            um.c h14 = cVar.h("link");
            str3 = ts0Var.f42286c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41663c == null) {
                this.f41663c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f41663c;
            um.c h15 = cVar.h("object_id");
            str2 = ts0Var.f42287d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41662b == null) {
                this.f41662b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41662b;
            um.c h16 = cVar.h("offset");
            num2 = ts0Var.f42288e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41662b == null) {
                this.f41662b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f41662b;
            um.c h17 = cVar.h("tag_type");
            num = ts0Var.f42289f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41663c == null) {
                this.f41663c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f41663c;
            um.c h18 = cVar.h("type");
            str = ts0Var.f42290g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
