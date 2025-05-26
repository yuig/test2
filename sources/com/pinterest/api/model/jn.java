package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class jn extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39099a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39100b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39101c;

    public jn(nm.o oVar) {
        this.f39099a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        in inVar = new in(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -362067290:
                    if (k03.equals("promo_ad_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -333394867:
                    if (k03.equals("cta_description")) {
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
                case 3226745:
                    if (k03.equals("icon")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
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
            nm.o oVar = this.f39099a;
            if (c13 == 0) {
                if (this.f39100b == null) {
                    this.f39100b = a.cb.q(oVar, Integer.class);
                }
                inVar.e((Integer) this.f39100b.c(aVar));
            } else if (c13 == 1) {
                if (this.f39101c == null) {
                    this.f39101c = a.cb.q(oVar, String.class);
                }
                inVar.b((String) this.f39101c.c(aVar));
            } else if (c13 == 2) {
                if (this.f39101c == null) {
                    this.f39101c = a.cb.q(oVar, String.class);
                }
                inVar.g((String) this.f39101c.c(aVar));
            } else if (c13 == 3) {
                if (this.f39100b == null) {
                    this.f39100b = a.cb.q(oVar, Integer.class);
                }
                inVar.c((Integer) this.f39100b.c(aVar));
            } else if (c13 == 4) {
                if (this.f39101c == null) {
                    this.f39101c = a.cb.q(oVar, String.class);
                }
                inVar.f((String) this.f39101c.c(aVar));
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f39101c == null) {
                    this.f39101c = a.cb.q(oVar, String.class);
                }
                inVar.d((String) this.f39101c.c(aVar));
            }
        }
        aVar.g();
        return inVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        String str3;
        String str4;
        ln lnVar = (ln) obj;
        if (lnVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lnVar.f39830g;
        int length = zArr.length;
        nm.o oVar = this.f39099a;
        if (length > 0 && zArr[0]) {
            if (this.f39101c == null) {
                this.f39101c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39101c;
            um.c h10 = cVar.h("id");
            str4 = lnVar.f39824a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39101c == null) {
                this.f39101c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39101c;
            um.c h13 = cVar.h("node_id");
            str3 = lnVar.f39825b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39101c == null) {
                this.f39101c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39101c;
            um.c h14 = cVar.h("cta_description");
            str2 = lnVar.f39826c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39100b == null) {
                this.f39100b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39100b;
            um.c h15 = cVar.h("icon");
            num2 = lnVar.f39827d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39100b == null) {
                this.f39100b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f39100b;
            um.c h16 = cVar.h("promo_ad_type");
            num = lnVar.f39828e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39101c == null) {
                this.f39101c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39101c;
            um.c h17 = cVar.h("text");
            str = lnVar.f39829f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
