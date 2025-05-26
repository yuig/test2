package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class ia extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38706a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38707b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38708c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38709d;

    public ia(nm.o oVar) {
        this.f38706a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ka kaVar = new ka(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case 3226745:
                    if (k03.equals("icon")) {
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
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3565976:
                    if (k03.equals("tool")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1109518305:
                    if (k03.equals("show_badge")) {
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
            nm.o oVar = this.f38706a;
            switch (c13) {
                case 0:
                    if (this.f38709d == null) {
                        this.f38709d = a.cb.q(oVar, String.class);
                    }
                    kaVar.f39361a = (String) this.f38709d.c(aVar);
                    boolean[] zArr = kaVar.f39368h;
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 1:
                    if (this.f38709d == null) {
                        this.f38709d = a.cb.q(oVar, String.class);
                    }
                    kaVar.f39363c = (String) this.f38709d.c(aVar);
                    boolean[] zArr2 = kaVar.f39368h;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f38709d == null) {
                        this.f38709d = a.cb.q(oVar, String.class);
                    }
                    kaVar.f39364d = (String) this.f38709d.c(aVar);
                    boolean[] zArr3 = kaVar.f39368h;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f38709d == null) {
                        this.f38709d = a.cb.q(oVar, String.class);
                    }
                    kaVar.f39366f = (String) this.f38709d.c(aVar);
                    boolean[] zArr4 = kaVar.f39368h;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f38708c == null) {
                        this.f38708c = a.cb.q(oVar, Integer.class);
                    }
                    kaVar.f39367g = (Integer) this.f38708c.c(aVar);
                    boolean[] zArr5 = kaVar.f39368h;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f38707b == null) {
                        this.f38707b = a.cb.q(oVar, Boolean.class);
                    }
                    kaVar.f39365e = (Boolean) this.f38707b.c(aVar);
                    boolean[] zArr6 = kaVar.f39368h;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f38709d == null) {
                        this.f38709d = a.cb.q(oVar, String.class);
                    }
                    kaVar.f39362b = (String) this.f38709d.c(aVar);
                    boolean[] zArr7 = kaVar.f39368h;
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
        return new la(kaVar.f39361a, kaVar.f39362b, kaVar.f39363c, kaVar.f39364d, kaVar.f39365e, kaVar.f39366f, kaVar.f39367g, kaVar.f39368h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        String str;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        String str5;
        la laVar = (la) obj;
        if (laVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = laVar.f39685h;
        int length = zArr.length;
        nm.o oVar = this.f38706a;
        if (length > 0 && zArr[0]) {
            if (this.f38709d == null) {
                this.f38709d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38709d;
            um.c h10 = cVar.h("id");
            str5 = laVar.f39678a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38709d == null) {
                this.f38709d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38709d;
            um.c h13 = cVar.h("node_id");
            str4 = laVar.f39679b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38709d == null) {
                this.f38709d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f38709d;
            um.c h14 = cVar.h("icon");
            str3 = laVar.f39680c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38709d == null) {
                this.f38709d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38709d;
            um.c h15 = cVar.h("link");
            str2 = laVar.f39681d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38707b == null) {
                this.f38707b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f38707b;
            um.c h16 = cVar.h("show_badge");
            bool = laVar.f39682e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38709d == null) {
                this.f38709d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38709d;
            um.c h17 = cVar.h("text");
            str = laVar.f39683f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38708c == null) {
                this.f38708c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f38708c;
            um.c h18 = cVar.h("tool");
            num = laVar.f39684g;
            mVar7.e(h18, num);
        }
        cVar.g();
    }
}
