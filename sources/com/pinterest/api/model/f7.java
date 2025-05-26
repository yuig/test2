package com.pinterest.api.model;

import com.pinterest.api.model.e7;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;

/* loaded from: classes.dex */
public final class f7 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37577a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37578b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37579c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37580d;

    public f7(nm.o oVar) {
        this.f37577a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        h7 h7Var = new h7(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -859441320:
                    if (k03.equals("badge_label")) {
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
                case 1080916566:
                    if (k03.equals("badge_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2129735048:
                    if (k03.equals(SbaPinRep.AUX_DATA_BADGE_LABEL_ENUM)) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37577a;
            if (c13 == 0) {
                if (this.f37580d == null) {
                    this.f37580d = a.cb.q(oVar, String.class);
                }
                h7Var.f38322c = (String) this.f37580d.c(aVar);
                boolean[] zArr = h7Var.f38325f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f37580d == null) {
                    this.f37580d = a.cb.q(oVar, String.class);
                }
                h7Var.b((String) this.f37580d.c(aVar));
            } else if (c13 == 2) {
                if (this.f37579c == null) {
                    this.f37579c = a.cb.q(oVar, e7.b.class);
                }
                h7Var.f38324e = (e7.b) this.f37579c.c(aVar);
                boolean[] zArr2 = h7Var.f38325f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f37580d == null) {
                    this.f37580d = a.cb.q(oVar, String.class);
                }
                h7Var.a((String) this.f37580d.c(aVar));
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f37578b == null) {
                    this.f37578b = a.cb.q(oVar, e7.a.class);
                }
                h7Var.f38323d = (e7.a) this.f37578b.c(aVar);
                boolean[] zArr3 = h7Var.f38325f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            }
        }
        aVar.g();
        return new e7(h7Var.f38320a, h7Var.f38321b, h7Var.f38322c, h7Var.f38323d, h7Var.f38324e, h7Var.f38325f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        e7.b bVar;
        e7.a aVar;
        String str;
        String str2;
        String str3;
        e7 e7Var = (e7) obj;
        if (e7Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = e7Var.f37193f;
        int length = zArr.length;
        nm.o oVar = this.f37577a;
        if (length > 0 && zArr[0]) {
            if (this.f37580d == null) {
                this.f37580d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37580d;
            um.c h10 = cVar.h("id");
            str3 = e7Var.f37188a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37580d == null) {
                this.f37580d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37580d;
            um.c h13 = cVar.h("node_id");
            str2 = e7Var.f37189b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37580d == null) {
                this.f37580d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f37580d;
            um.c h14 = cVar.h("badge_label");
            str = e7Var.f37190c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37578b == null) {
                this.f37578b = a.cb.q(oVar, e7.a.class);
            }
            nm.m mVar4 = this.f37578b;
            um.c h15 = cVar.h(SbaPinRep.AUX_DATA_BADGE_LABEL_ENUM);
            aVar = e7Var.f37191d;
            mVar4.e(h15, aVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37579c == null) {
                this.f37579c = a.cb.q(oVar, e7.b.class);
            }
            nm.m mVar5 = this.f37579c;
            um.c h16 = cVar.h("badge_type");
            bVar = e7Var.f37192e;
            mVar5.e(h16, bVar);
        }
        cVar.g();
    }
}
