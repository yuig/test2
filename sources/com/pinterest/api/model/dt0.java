package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class dt0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36956a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36957b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36958c;

    public dt0(nm.o oVar) {
        this.f36956a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ct0 ct0Var = new ct0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1303620827:
                    if (k03.equals("qi_cache_size")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -916463307:
                    if (k03.equals("aspect_ratio_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -167061094:
                    if (k03.equals("ad_unit_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 600739505:
                    if (k03.equals("qi_cool_down_seconds")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1184122483:
                    if (k03.equals("header_size")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1458614914:
                    if (k03.equals("format_type")) {
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
            }
            nm.o oVar = this.f36956a;
            switch (c13) {
                case 0:
                    if (this.f36957b == null) {
                        this.f36957b = a.cb.q(oVar, Integer.class);
                    }
                    ct0Var.f36522g = (Integer) this.f36957b.c(aVar);
                    boolean[] zArr = ct0Var.f36524i;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f36957b == null) {
                        this.f36957b = a.cb.q(oVar, Integer.class);
                    }
                    ct0Var.f36519d = (Integer) this.f36957b.c(aVar);
                    boolean[] zArr2 = ct0Var.f36524i;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f36958c == null) {
                        this.f36958c = a.cb.q(oVar, String.class);
                    }
                    ct0Var.f36518c = (String) this.f36958c.c(aVar);
                    boolean[] zArr3 = ct0Var.f36524i;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f36958c == null) {
                        this.f36958c = a.cb.q(oVar, String.class);
                    }
                    ct0Var.f36516a = (String) this.f36958c.c(aVar);
                    boolean[] zArr4 = ct0Var.f36524i;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f36957b == null) {
                        this.f36957b = a.cb.q(oVar, Integer.class);
                    }
                    ct0Var.f36523h = (Integer) this.f36957b.c(aVar);
                    boolean[] zArr5 = ct0Var.f36524i;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f36957b == null) {
                        this.f36957b = a.cb.q(oVar, Integer.class);
                    }
                    ct0Var.f36521f = (Integer) this.f36957b.c(aVar);
                    boolean[] zArr6 = ct0Var.f36524i;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f36957b == null) {
                        this.f36957b = a.cb.q(oVar, Integer.class);
                    }
                    ct0Var.f36520e = (Integer) this.f36957b.c(aVar);
                    boolean[] zArr7 = ct0Var.f36524i;
                    if (zArr7.length <= 4) {
                        break;
                    } else {
                        zArr7[4] = true;
                        break;
                    }
                case 7:
                    if (this.f36958c == null) {
                        this.f36958c = a.cb.q(oVar, String.class);
                    }
                    ct0Var.f36517b = (String) this.f36958c.c(aVar);
                    boolean[] zArr8 = ct0Var.f36524i;
                    if (zArr8.length <= 1) {
                        break;
                    } else {
                        zArr8[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new ft0(ct0Var.f36516a, ct0Var.f36517b, ct0Var.f36518c, ct0Var.f36519d, ct0Var.f36520e, ct0Var.f36521f, ct0Var.f36522g, ct0Var.f36523h, ct0Var.f36524i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str;
        String str2;
        String str3;
        ft0 ft0Var = (ft0) obj;
        if (ft0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ft0Var.f37808i;
        int length = zArr.length;
        nm.o oVar = this.f36956a;
        if (length > 0 && zArr[0]) {
            if (this.f36958c == null) {
                this.f36958c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f36958c;
            um.c h10 = cVar.h("id");
            str3 = ft0Var.f37800a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36958c == null) {
                this.f36958c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36958c;
            um.c h13 = cVar.h("node_id");
            str2 = ft0Var.f37801b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36958c == null) {
                this.f36958c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36958c;
            um.c h14 = cVar.h("ad_unit_id");
            str = ft0Var.f37802c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36957b == null) {
                this.f36957b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f36957b;
            um.c h15 = cVar.h("aspect_ratio_type");
            num5 = ft0Var.f37803d;
            mVar4.e(h15, num5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36957b == null) {
                this.f36957b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f36957b;
            um.c h16 = cVar.h("format_type");
            num4 = ft0Var.f37804e;
            mVar5.e(h16, num4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36957b == null) {
                this.f36957b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f36957b;
            um.c h17 = cVar.h("header_size");
            num3 = ft0Var.f37805f;
            mVar6.e(h17, num3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36957b == null) {
                this.f36957b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f36957b;
            um.c h18 = cVar.h("qi_cache_size");
            num2 = ft0Var.f37806g;
            mVar7.e(h18, num2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36957b == null) {
                this.f36957b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f36957b;
            um.c h19 = cVar.h("qi_cool_down_seconds");
            num = ft0Var.f37807h;
            mVar8.e(h19, num);
        }
        cVar.g();
    }
}
