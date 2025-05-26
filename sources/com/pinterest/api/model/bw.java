package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class bw extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36221a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36222b;

    public bw(nm.o oVar) {
        this.f36221a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        aw awVar = new aw(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1612962708) {
                if (hashCode != -1287148950) {
                    if (hashCode != -686192603) {
                        if (hashCode == 3355 && k03.equals("id")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("icon_url_large")) {
                        c13 = 2;
                    }
                } else if (k03.equals("application_id")) {
                    c13 = 1;
                }
            } else if (k03.equals("app_link_scheme")) {
                c13 = 0;
            }
            nm.o oVar = this.f36221a;
            if (c13 == 0) {
                if (this.f36222b == null) {
                    this.f36222b = a.cb.q(oVar, String.class);
                }
                awVar.b((String) this.f36222b.c(aVar));
            } else if (c13 == 1) {
                if (this.f36222b == null) {
                    this.f36222b = a.cb.q(oVar, String.class);
                }
                awVar.c((String) this.f36222b.c(aVar));
            } else if (c13 == 2) {
                if (this.f36222b == null) {
                    this.f36222b = a.cb.q(oVar, String.class);
                }
                awVar.d((String) this.f36222b.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f36222b == null) {
                    this.f36222b = a.cb.q(oVar, String.class);
                }
                awVar.e((String) this.f36222b.c(aVar));
            }
        }
        aVar.g();
        return awVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        dw dwVar = (dw) obj;
        if (dwVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dwVar.f36977e;
        int length = zArr.length;
        nm.o oVar = this.f36221a;
        if (length > 0 && zArr[0]) {
            if (this.f36222b == null) {
                this.f36222b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36222b;
            um.c h10 = cVar.h("app_link_scheme");
            str4 = dwVar.f36973a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36222b == null) {
                this.f36222b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36222b;
            um.c h13 = cVar.h("application_id");
            str3 = dwVar.f36974b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36222b == null) {
                this.f36222b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36222b;
            um.c h14 = cVar.h("icon_url_large");
            str2 = dwVar.f36975c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36222b == null) {
                this.f36222b = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f36222b;
            um.c h15 = cVar.h("id");
            str = dwVar.f36976d;
            mVar4.e(h15, str);
        }
        cVar.g();
    }
}
