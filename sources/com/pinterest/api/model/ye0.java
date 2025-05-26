package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ye0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44018a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44019b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44020c;

    public ye0(nm.o oVar) {
        this.f44018a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xe0 xe0Var = new xe0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
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
                case 3321850:
                    if (k03.equals("link")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1583758243:
                    if (k03.equals("action_type")) {
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
            nm.o oVar = this.f44018a;
            if (c13 == 0) {
                if (this.f44020c == null) {
                    this.f44020c = a.cb.q(oVar, String.class);
                }
                xe0Var.f43658d = (String) this.f44020c.c(aVar);
                boolean[] zArr = xe0Var.f43661g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f44020c == null) {
                    this.f44020c = a.cb.q(oVar, String.class);
                }
                xe0Var.f43655a = (String) this.f44020c.c(aVar);
                boolean[] zArr2 = xe0Var.f43661g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f44020c == null) {
                    this.f44020c = a.cb.q(oVar, String.class);
                }
                xe0Var.f43659e = (String) this.f44020c.c(aVar);
                boolean[] zArr3 = xe0Var.f43661g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f44020c == null) {
                    this.f44020c = a.cb.q(oVar, String.class);
                }
                xe0Var.f43660f = (String) this.f44020c.c(aVar);
                boolean[] zArr4 = xe0Var.f43661g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f44019b == null) {
                    this.f44019b = a.cb.q(oVar, Integer.class);
                }
                xe0Var.f43657c = (Integer) this.f44019b.c(aVar);
                boolean[] zArr5 = xe0Var.f43661g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f44020c == null) {
                    this.f44020c = a.cb.q(oVar, String.class);
                }
                xe0Var.f43656b = (String) this.f44020c.c(aVar);
                boolean[] zArr6 = xe0Var.f43661g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new af0(xe0Var.f43655a, xe0Var.f43656b, xe0Var.f43657c, xe0Var.f43658d, xe0Var.f43659e, xe0Var.f43660f, xe0Var.f43661g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        String str4;
        String str5;
        af0 af0Var = (af0) obj;
        if (af0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = af0Var.f35725g;
        int length = zArr.length;
        nm.o oVar = this.f44018a;
        if (length > 0 && zArr[0]) {
            if (this.f44020c == null) {
                this.f44020c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44020c;
            um.c h10 = cVar.h("id");
            str5 = af0Var.f35719a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44020c == null) {
                this.f44020c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44020c;
            um.c h13 = cVar.h("node_id");
            str4 = af0Var.f35720b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44019b == null) {
                this.f44019b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f44019b;
            um.c h14 = cVar.h("action_type");
            num = af0Var.f35721c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44020c == null) {
                this.f44020c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44020c;
            um.c h15 = cVar.h("description");
            str3 = af0Var.f35722d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44020c == null) {
                this.f44020c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f44020c;
            um.c h16 = cVar.h("link");
            str2 = af0Var.f35723e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44020c == null) {
                this.f44020c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f44020c;
            um.c h17 = cVar.h("title");
            str = af0Var.f35724f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
