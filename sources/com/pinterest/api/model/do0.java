package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class do0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36906a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36907b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36908c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36909d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36910e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36911f;

    public do0(nm.o oVar) {
        this.f36906a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        co0 co0Var = new co0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1702821301:
                    if (k03.equals("is_removed")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1573145462:
                    if (k03.equals("start_time")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -147132913:
                    if (k03.equals("user_id")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1227548543:
                    if (k03.equals("block_style")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1286558636:
                    if (k03.equals("block_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1725551537:
                    if (k03.equals("end_time")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36906a;
            switch (c13) {
                case 0:
                    if (this.f36907b == null) {
                        this.f36907b = a.cb.q(oVar, Boolean.class);
                    }
                    co0Var.f36485d = (Boolean) this.f36907b.c(aVar);
                    boolean[] zArr = co0Var.f36489h;
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 1:
                    if (this.f36908c == null) {
                        this.f36908c = a.cb.q(oVar, Double.class);
                    }
                    co0Var.f36486e = (Double) this.f36908c.c(aVar);
                    boolean[] zArr2 = co0Var.f36489h;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f36911f == null) {
                        this.f36911f = a.cb.q(oVar, String.class);
                    }
                    co0Var.f36488g = (String) this.f36911f.c(aVar);
                    boolean[] zArr3 = co0Var.f36489h;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f36911f == null) {
                        this.f36911f = a.cb.q(oVar, String.class);
                    }
                    co0Var.f36487f = (String) this.f36911f.c(aVar);
                    boolean[] zArr4 = co0Var.f36489h;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f36910e == null) {
                        this.f36910e = a.cb.q(oVar, zk0.class);
                    }
                    co0Var.f36483b = (zk0) this.f36910e.c(aVar);
                    boolean[] zArr5 = co0Var.f36489h;
                    if (zArr5.length <= 1) {
                        break;
                    } else {
                        zArr5[1] = true;
                        break;
                    }
                case 5:
                    if (this.f36909d == null) {
                        this.f36909d = a.cb.q(oVar, Integer.class);
                    }
                    co0Var.f36482a = (Integer) this.f36909d.c(aVar);
                    boolean[] zArr6 = co0Var.f36489h;
                    if (zArr6.length <= 0) {
                        break;
                    } else {
                        zArr6[0] = true;
                        break;
                    }
                case 6:
                    if (this.f36908c == null) {
                        this.f36908c = a.cb.q(oVar, Double.class);
                    }
                    co0Var.f36484c = (Double) this.f36908c.c(aVar);
                    boolean[] zArr7 = co0Var.f36489h;
                    if (zArr7.length <= 2) {
                        break;
                    } else {
                        zArr7[2] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new fo0(co0Var.f36482a, co0Var.f36483b, co0Var.f36484c, co0Var.f36485d, co0Var.f36486e, co0Var.f36487f, co0Var.f36488g, co0Var.f36489h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Double d2;
        Boolean bool;
        Double d13;
        zk0 zk0Var;
        Integer num;
        fo0 fo0Var = (fo0) obj;
        if (fo0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fo0Var.f37733h;
        int length = zArr.length;
        nm.o oVar = this.f36906a;
        if (length > 0 && zArr[0]) {
            if (this.f36909d == null) {
                this.f36909d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f36909d;
            um.c h10 = cVar.h("block_type");
            num = fo0Var.f37726a;
            mVar.e(h10, num);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36910e == null) {
                this.f36910e = a.cb.q(oVar, zk0.class);
            }
            nm.m mVar2 = this.f36910e;
            um.c h13 = cVar.h("block_style");
            zk0Var = fo0Var.f37727b;
            mVar2.e(h13, zk0Var);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36908c == null) {
                this.f36908c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar3 = this.f36908c;
            um.c h14 = cVar.h("end_time");
            d13 = fo0Var.f37728c;
            mVar3.e(h14, d13);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36907b == null) {
                this.f36907b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f36907b;
            um.c h15 = cVar.h("is_removed");
            bool = fo0Var.f37729d;
            mVar4.e(h15, bool);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36908c == null) {
                this.f36908c = a.cb.q(oVar, Double.class);
            }
            nm.m mVar5 = this.f36908c;
            um.c h16 = cVar.h("start_time");
            d2 = fo0Var.f37730e;
            mVar5.e(h16, d2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36911f == null) {
                this.f36911f = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36911f;
            um.c h17 = cVar.h("type");
            str2 = fo0Var.f37731f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36911f == null) {
                this.f36911f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f36911f;
            um.c h18 = cVar.h("user_id");
            str = fo0Var.f37732g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
