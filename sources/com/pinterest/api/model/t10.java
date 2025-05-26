package com.pinterest.api.model;

/* loaded from: classes.dex */
public final class t10 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42045a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42046b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42047c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42048d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f42049e;

    public t10(nm.o oVar) {
        this.f42045a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        s10 s10Var = new s10(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1453742176:
                    if (k03.equals("biz_ownership_email")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1174198110:
                    if (k03.equals("enable_profile_address")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1118837231:
                    if (k03.equals("is_linked_business")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -717610255:
                    if (k03.equals("profile_place")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 509624234:
                    if (k03.equals("auto_follow_allowed")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 629885866:
                    if (k03.equals("business_name")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 928418997:
                    if (k03.equals("enable_profile_message")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 947010237:
                    if (k03.equals("contact_email")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 957033615:
                    if (k03.equals("contact_phone")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1091441164:
                    if (k03.equals("account_type")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1277731658:
                    if (k03.equals("contact_name")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1493183462:
                    if (k03.equals("contact_phone_country")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 14;
                        break;
                    }
                    break;
            }
            boolean[] zArr = s10Var.f41771p;
            nm.o oVar = this.f42045a;
            switch (c13) {
                case 0:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.b((String) this.f42049e.c(aVar));
                    break;
                case 1:
                    if (this.f42046b == null) {
                        this.f42046b = a.cb.q(oVar, Boolean.class);
                    }
                    s10Var.f41766k = (Boolean) this.f42046b.c(aVar);
                    boolean[] zArr2 = s10Var.f41771p;
                    if (zArr2.length <= 10) {
                        break;
                    } else {
                        zArr2[10] = true;
                        break;
                    }
                case 2:
                    if (this.f42046b == null) {
                        this.f42046b = a.cb.q(oVar, Boolean.class);
                    }
                    s10Var.f41768m = (Boolean) this.f42046b.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case 3:
                    if (this.f42048d == null) {
                        this.f42048d = a.cb.q(oVar, k60.class);
                    }
                    s10Var.g((k60) this.f42048d.c(aVar));
                    break;
                case 4:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.f41756a = (String) this.f42049e.c(aVar);
                    boolean[] zArr3 = s10Var.f41771p;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 5:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.f41770o = (String) this.f42049e.c(aVar);
                    if (zArr.length <= 14) {
                        break;
                    } else {
                        zArr[14] = true;
                        break;
                    }
                case 6:
                    if (this.f42046b == null) {
                        this.f42046b = a.cb.q(oVar, Boolean.class);
                    }
                    s10Var.f41759d = (Boolean) this.f42046b.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 7:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.f41761f = (String) this.f42049e.c(aVar);
                    boolean[] zArr4 = s10Var.f41771p;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case '\b':
                    if (this.f42046b == null) {
                        this.f42046b = a.cb.q(oVar, Boolean.class);
                    }
                    s10Var.f41767l = (Boolean) this.f42046b.c(aVar);
                    boolean[] zArr5 = s10Var.f41771p;
                    if (zArr5.length <= 11) {
                        break;
                    } else {
                        zArr5[11] = true;
                        break;
                    }
                case '\t':
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.c((String) this.f42049e.c(aVar));
                    break;
                case '\n':
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.e((String) this.f42049e.c(aVar));
                    break;
                case 11:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.f41758c = (String) this.f42049e.c(aVar);
                    boolean[] zArr6 = s10Var.f41771p;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case '\f':
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.d((String) this.f42049e.c(aVar));
                    break;
                case '\r':
                    if (this.f42047c == null) {
                        this.f42047c = a.cb.q(oVar, b30.class);
                    }
                    s10Var.f((b30) this.f42047c.c(aVar));
                    break;
                case 14:
                    if (this.f42049e == null) {
                        this.f42049e = a.cb.q(oVar, String.class);
                    }
                    s10Var.f41757b = (String) this.f42049e.c(aVar);
                    boolean[] zArr7 = s10Var.f41771p;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return s10Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        k60 k60Var;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        b30 b30Var;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Boolean bool4;
        String str7;
        String str8;
        String str9;
        v10 v10Var = (v10) obj;
        if (v10Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = v10Var.f42714p;
        int length = zArr.length;
        nm.o oVar = this.f42045a;
        if (length > 0 && zArr[0]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42049e;
            um.c h10 = cVar.h("id");
            str9 = v10Var.f42699a;
            mVar.e(h10, str9);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42049e;
            um.c h13 = cVar.h("node_id");
            str8 = v10Var.f42700b;
            mVar2.e(h13, str8);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42049e;
            um.c h14 = cVar.h("account_type");
            str7 = v10Var.f42701c;
            mVar3.e(h14, str7);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42046b == null) {
                this.f42046b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f42046b;
            um.c h15 = cVar.h("auto_follow_allowed");
            bool4 = v10Var.f42702d;
            mVar4.e(h15, bool4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42049e;
            um.c h16 = cVar.h("biz_ownership_email");
            str6 = v10Var.f42703e;
            mVar5.e(h16, str6);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42049e;
            um.c h17 = cVar.h("business_name");
            str5 = v10Var.f42704f;
            mVar6.e(h17, str5);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f42049e;
            um.c h18 = cVar.h("contact_email");
            str4 = v10Var.f42705g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f42049e;
            um.c h19 = cVar.h("contact_name");
            str3 = v10Var.f42706h;
            mVar8.e(h19, str3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f42049e;
            um.c h23 = cVar.h("contact_phone");
            str2 = v10Var.f42707i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42047c == null) {
                this.f42047c = a.cb.q(oVar, b30.class);
            }
            nm.m mVar10 = this.f42047c;
            um.c h24 = cVar.h("contact_phone_country");
            b30Var = v10Var.f42708j;
            mVar10.e(h24, b30Var);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f42046b == null) {
                this.f42046b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f42046b;
            um.c h25 = cVar.h("enable_profile_address");
            bool3 = v10Var.f42709k;
            mVar11.e(h25, bool3);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f42046b == null) {
                this.f42046b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f42046b;
            um.c h26 = cVar.h("enable_profile_message");
            bool2 = v10Var.f42710l;
            mVar12.e(h26, bool2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f42046b == null) {
                this.f42046b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar13 = this.f42046b;
            um.c h27 = cVar.h("is_linked_business");
            bool = v10Var.f42711m;
            mVar13.e(h27, bool);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f42048d == null) {
                this.f42048d = a.cb.q(oVar, k60.class);
            }
            nm.m mVar14 = this.f42048d;
            um.c h28 = cVar.h("profile_place");
            k60Var = v10Var.f42712n;
            mVar14.e(h28, k60Var);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f42049e == null) {
                this.f42049e = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f42049e;
            um.c h29 = cVar.h("type");
            str = v10Var.f42713o;
            mVar15.e(h29, str);
        }
        cVar.g();
    }
}
