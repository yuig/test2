package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class xv extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43799a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43800b;

    public xv(nm.o oVar) {
        this.f43799a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wv wvVar = new wv(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != 3355) {
                if (hashCode != 275290592) {
                    if (hashCode == 2114448504 && k03.equals("node_id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("developer_name")) {
                    c13 = 1;
                }
            } else if (k03.equals("id")) {
                c13 = 0;
            }
            nm.o oVar = this.f43799a;
            if (c13 == 0) {
                if (this.f43800b == null) {
                    this.f43800b = a.cb.q(oVar, String.class);
                }
                wvVar.d((String) this.f43800b.c(aVar));
            } else if (c13 == 1) {
                if (this.f43800b == null) {
                    this.f43800b = a.cb.q(oVar, String.class);
                }
                wvVar.b((String) this.f43800b.c(aVar));
            } else if (c13 != 2) {
                aVar.E();
            } else {
                if (this.f43800b == null) {
                    this.f43800b = a.cb.q(oVar, String.class);
                }
                wvVar.c((String) this.f43800b.c(aVar));
            }
        }
        aVar.g();
        return wvVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        zv zvVar = (zv) obj;
        if (zvVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zvVar.f44470d;
        int length = zArr.length;
        nm.o oVar = this.f43799a;
        if (length > 0 && zArr[0]) {
            if (this.f43800b == null) {
                this.f43800b = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43800b;
            um.c h10 = cVar.h("id");
            str3 = zvVar.f44467a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43800b == null) {
                this.f43800b = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43800b;
            um.c h13 = cVar.h("node_id");
            str2 = zvVar.f44468b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43800b == null) {
                this.f43800b = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43800b;
            um.c h14 = cVar.h("developer_name");
            str = zvVar.f44469c;
            mVar3.e(h14, str);
        }
        cVar.g();
    }
}
