package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class eu extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37346a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37347b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37348c;

    public eu(nm.o oVar) {
        this.f37346a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        du duVar = new du(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1762229826:
                    if (k03.equals("destination_url")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1170366683:
                    if (k03.equals("secondary_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -869037020:
                    if (k03.equals("secondary_url")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -821500874:
                    if (k03.equals("secondary_destination_type")) {
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
                case 1205427403:
                    if (k03.equals("destination_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37346a;
            switch (c13) {
                case 0:
                    if (this.f37348c == null) {
                        this.f37348c = a.cb.q(oVar, String.class);
                    }
                    duVar.f36962d = (String) this.f37348c.c(aVar);
                    boolean[] zArr = duVar.f36966h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f37347b == null) {
                        this.f37347b = a.cb.q(oVar, Integer.class);
                    }
                    duVar.f36964f = (Integer) this.f37347b.c(aVar);
                    boolean[] zArr2 = duVar.f36966h;
                    if (zArr2.length <= 5) {
                        break;
                    } else {
                        zArr2[5] = true;
                        break;
                    }
                case 2:
                    if (this.f37348c == null) {
                        this.f37348c = a.cb.q(oVar, String.class);
                    }
                    duVar.f36965g = (String) this.f37348c.c(aVar);
                    boolean[] zArr3 = duVar.f36966h;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f37347b == null) {
                        this.f37347b = a.cb.q(oVar, Integer.class);
                    }
                    duVar.f36963e = (Integer) this.f37347b.c(aVar);
                    boolean[] zArr4 = duVar.f36966h;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f37348c == null) {
                        this.f37348c = a.cb.q(oVar, String.class);
                    }
                    duVar.f36959a = (String) this.f37348c.c(aVar);
                    boolean[] zArr5 = duVar.f36966h;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f37347b == null) {
                        this.f37347b = a.cb.q(oVar, Integer.class);
                    }
                    duVar.f36961c = (Integer) this.f37347b.c(aVar);
                    boolean[] zArr6 = duVar.f36966h;
                    if (zArr6.length <= 2) {
                        break;
                    } else {
                        zArr6[2] = true;
                        break;
                    }
                case 6:
                    if (this.f37348c == null) {
                        this.f37348c = a.cb.q(oVar, String.class);
                    }
                    duVar.f36960b = (String) this.f37348c.c(aVar);
                    boolean[] zArr7 = duVar.f36966h;
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
        return new gu(duVar.f36959a, duVar.f36960b, duVar.f36961c, duVar.f36962d, duVar.f36963e, duVar.f36964f, duVar.f36965g, duVar.f36966h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Integer num2;
        String str2;
        Integer num3;
        String str3;
        String str4;
        gu guVar = (gu) obj;
        if (guVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = guVar.f38150h;
        int length = zArr.length;
        nm.o oVar = this.f37346a;
        if (length > 0 && zArr[0]) {
            if (this.f37348c == null) {
                this.f37348c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37348c;
            um.c h10 = cVar.h("id");
            str4 = guVar.f38143a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37348c == null) {
                this.f37348c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37348c;
            um.c h13 = cVar.h("node_id");
            str3 = guVar.f38144b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37347b == null) {
                this.f37347b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f37347b;
            um.c h14 = cVar.h("destination_type");
            num3 = guVar.f38145c;
            mVar3.e(h14, num3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37348c == null) {
                this.f37348c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37348c;
            um.c h15 = cVar.h("destination_url");
            str2 = guVar.f38146d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37347b == null) {
                this.f37347b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f37347b;
            um.c h16 = cVar.h("secondary_destination_type");
            num2 = guVar.f38147e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37347b == null) {
                this.f37347b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f37347b;
            um.c h17 = cVar.h("secondary_type");
            num = guVar.f38148f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37348c == null) {
                this.f37348c = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f37348c;
            um.c h18 = cVar.h("secondary_url");
            str = guVar.f38149g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
