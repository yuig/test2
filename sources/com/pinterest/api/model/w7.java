package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class w7 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43184a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43185b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43186c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43187d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43188e;

    public w7(nm.o oVar) {
        this.f43184a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y7 y7Var = new y7(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1606747453:
                    if (k03.equals("last_message_in_thread")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1213032310:
                    if (k03.equals("num_messages_in_thread")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -419323305:
                    if (k03.equals("conversation_id")) {
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
                case 1640038690:
                    if (k03.equals("anchor_message_in_thread")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1804934860:
                    if (k03.equals("is_eligible_for_conversation")) {
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
            nm.o oVar = this.f43184a;
            switch (c13) {
                case 0:
                    if (this.f43187d == null) {
                        this.f43187d = a.cb.q(oVar, mv.class);
                    }
                    y7Var.f43967f = (mv) this.f43187d.c(aVar);
                    boolean[] zArr = y7Var.f43969h;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f43186c == null) {
                        this.f43186c = a.cb.q(oVar, Integer.class);
                    }
                    y7Var.f43968g = (Integer) this.f43186c.c(aVar);
                    boolean[] zArr2 = y7Var.f43969h;
                    if (zArr2.length <= 6) {
                        break;
                    } else {
                        zArr2[6] = true;
                        break;
                    }
                case 2:
                    if (this.f43188e == null) {
                        this.f43188e = a.cb.q(oVar, String.class);
                    }
                    y7Var.f43965d = (String) this.f43188e.c(aVar);
                    boolean[] zArr3 = y7Var.f43969h;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f43188e == null) {
                        this.f43188e = a.cb.q(oVar, String.class);
                    }
                    y7Var.f43962a = (String) this.f43188e.c(aVar);
                    boolean[] zArr4 = y7Var.f43969h;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f43187d == null) {
                        this.f43187d = a.cb.q(oVar, mv.class);
                    }
                    y7Var.f43964c = (mv) this.f43187d.c(aVar);
                    boolean[] zArr5 = y7Var.f43969h;
                    if (zArr5.length <= 2) {
                        break;
                    } else {
                        zArr5[2] = true;
                        break;
                    }
                case 5:
                    if (this.f43185b == null) {
                        this.f43185b = a.cb.q(oVar, Boolean.class);
                    }
                    y7Var.f43966e = (Boolean) this.f43185b.c(aVar);
                    boolean[] zArr6 = y7Var.f43969h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f43188e == null) {
                        this.f43188e = a.cb.q(oVar, String.class);
                    }
                    y7Var.f43963b = (String) this.f43188e.c(aVar);
                    boolean[] zArr7 = y7Var.f43969h;
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
        return new z7(y7Var.f43962a, y7Var.f43963b, y7Var.f43964c, y7Var.f43965d, y7Var.f43966e, y7Var.f43967f, y7Var.f43968g, y7Var.f43969h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        mv mvVar;
        Boolean bool;
        String str;
        mv mvVar2;
        String str2;
        String str3;
        z7 z7Var = (z7) obj;
        if (z7Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = z7Var.f44239h;
        int length = zArr.length;
        nm.o oVar = this.f43184a;
        if (length > 0 && zArr[0]) {
            if (this.f43188e == null) {
                this.f43188e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43188e;
            um.c h10 = cVar.h("id");
            str3 = z7Var.f44232a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43188e == null) {
                this.f43188e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43188e;
            um.c h13 = cVar.h("node_id");
            str2 = z7Var.f44233b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43187d == null) {
                this.f43187d = a.cb.q(oVar, mv.class);
            }
            nm.m mVar3 = this.f43187d;
            um.c h14 = cVar.h("anchor_message_in_thread");
            mvVar2 = z7Var.f44234c;
            mVar3.e(h14, mvVar2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43188e == null) {
                this.f43188e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43188e;
            um.c h15 = cVar.h("conversation_id");
            str = z7Var.f44235d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43185b == null) {
                this.f43185b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f43185b;
            um.c h16 = cVar.h("is_eligible_for_conversation");
            bool = z7Var.f44236e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43187d == null) {
                this.f43187d = a.cb.q(oVar, mv.class);
            }
            nm.m mVar6 = this.f43187d;
            um.c h17 = cVar.h("last_message_in_thread");
            mvVar = z7Var.f44237f;
            mVar6.e(h17, mvVar);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43186c == null) {
                this.f43186c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f43186c;
            um.c h18 = cVar.h("num_messages_in_thread");
            num = z7Var.f44238g;
            mVar7.e(h18, num);
        }
        cVar.g();
    }
}
