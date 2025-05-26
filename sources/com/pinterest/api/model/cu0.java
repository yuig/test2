package com.pinterest.api.model;

import com.pinterest.api.model.bu0;

/* loaded from: classes.dex */
public final class cu0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36531a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36532b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36533c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36534d;

    public cu0(nm.o oVar) {
        this.f36531a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        au0 au0Var = new au0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1773565470:
                    if (k03.equals("image_width")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -373202742:
                    if (k03.equals("asset_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -363036377:
                    if (k03.equals("third_party_badge_type")) {
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 421050507:
                    if (k03.equals("image_height")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2116204999:
                    if (k03.equals("item_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36531a;
            switch (c13) {
                case 0:
                    if (this.f36532b == null) {
                        this.f36532b = a.cb.q(oVar, Integer.class);
                    }
                    au0Var.e((Integer) this.f36532b.c(aVar));
                    break;
                case 1:
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.d((String) this.f36533c.c(aVar));
                    break;
                case 2:
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.b((String) this.f36533c.c(aVar));
                    break;
                case 3:
                    if (this.f36534d == null) {
                        this.f36534d = a.cb.q(oVar, bu0.a.class);
                    }
                    au0Var.h((bu0.a) this.f36534d.c(aVar));
                    break;
                case 4:
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.j((String) this.f36533c.c(aVar));
                    break;
                case 5:
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.i((String) this.f36533c.c(aVar));
                    break;
                case 6:
                    if (this.f36532b == null) {
                        this.f36532b = a.cb.q(oVar, Integer.class);
                    }
                    au0Var.c((Integer) this.f36532b.c(aVar));
                    break;
                case 7:
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.g((String) this.f36533c.c(aVar));
                    break;
                case '\b':
                    if (this.f36533c == null) {
                        this.f36533c = a.cb.q(oVar, String.class);
                    }
                    au0Var.f((String) this.f36533c.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return au0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        bu0.a aVar;
        String str2;
        Integer num;
        String str3;
        Integer num2;
        String str4;
        String str5;
        String str6;
        bu0 bu0Var = (bu0) obj;
        if (bu0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = bu0Var.f36213j;
        int length = zArr.length;
        nm.o oVar = this.f36531a;
        if (length > 0 && zArr[0]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36533c;
            um.c h10 = cVar.h("id");
            str6 = bu0Var.f36204a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36533c;
            um.c h13 = cVar.h("node_id");
            str5 = bu0Var.f36205b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36533c;
            um.c h14 = cVar.h("asset_id");
            str4 = bu0Var.f36206c;
            mVar3.e(h14, str4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36532b == null) {
                this.f36532b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36532b;
            um.c h15 = cVar.h("image_height");
            num2 = bu0Var.f36207d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36533c;
            um.c h16 = cVar.h("image_url");
            str3 = bu0Var.f36208e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36532b == null) {
                this.f36532b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f36532b;
            um.c h17 = cVar.h("image_width");
            num = bu0Var.f36209f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36533c;
            um.c h18 = cVar.h("item_id");
            str2 = bu0Var.f36210g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36534d == null) {
                this.f36534d = a.cb.q(oVar, bu0.a.class);
            }
            nm.m mVar8 = this.f36534d;
            um.c h19 = cVar.h("third_party_badge_type");
            aVar = bu0Var.f36211h;
            mVar8.e(h19, aVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36533c == null) {
                this.f36533c = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f36533c;
            um.c h23 = cVar.h("title");
            str = bu0Var.f36212i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
