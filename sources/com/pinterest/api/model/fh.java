package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class fh extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37669a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37670b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37671c;

    public fh(nm.o oVar) {
        this.f37669a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        eh ehVar = new eh(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1147001697) {
                if (hashCode != 3355) {
                    if (hashCode == 3373707 && k03.equals("name")) {
                        c13 = 2;
                    }
                } else if (k03.equals("id")) {
                    c13 = 1;
                }
            } else if (k03.equals("official_user")) {
                c13 = 0;
            }
            nm.o oVar = this.f37669a;
            if (c13 == 0) {
                if (this.f37671c == null) {
                    this.f37671c = a.cb.q(oVar, wy0.class);
                }
                ehVar.c((wy0) this.f37671c.c(aVar));
            } else if (c13 == 1) {
                if (this.f37670b == null) {
                    this.f37670b = a.cb.q(oVar, String.class);
                }
                ehVar.d((String) this.f37670b.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f37670b == null) {
                    this.f37670b = a.cb.q(oVar, String.class);
                }
                ehVar.b((String) this.f37670b.c(aVar));
            }
        }
        aVar.g();
        return ehVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        wy0 wy0Var;
        String str;
        String str2;
        hh hhVar = (hh) obj;
        if (hhVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = hhVar.f38439d;
        int length = zArr.length;
        nm.o oVar = this.f37669a;
        if (length > 0 && zArr[0]) {
            if (this.f37670b == null) {
                this.f37670b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37670b;
            um.c h10 = cVar.h("id");
            str2 = hhVar.f38436a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37670b == null) {
                this.f37670b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37670b;
            um.c h13 = cVar.h("name");
            str = hhVar.f38437b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37671c == null) {
                this.f37671c = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar3 = this.f37671c;
            um.c h14 = cVar.h("official_user");
            wy0Var = hhVar.f38438c;
            mVar3.e(h14, wy0Var);
        }
        cVar.g();
    }
}
