package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class qa extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41240a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41241b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41242c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41243d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41244e;

    public qa(nm.o oVar) {
        this.f41240a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        sa saVar = new sa(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2076650431:
                    if (k03.equals("timeline")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1563525418:
                    if (k03.equals("watermark_id")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -309882753:
                    if (k03.equals("attribution")) {
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
                case 206681204:
                    if (k03.equals("frame_width")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 351608024:
                    if (k03.equals("version")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 390482005:
                    if (k03.equals("music_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1679155257:
                    if (k03.equals("frame_height")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f41240a;
            switch (c13) {
                case 0:
                    if (this.f41244e == null) {
                        this.f41244e = a.cb.q(oVar, ps0.class);
                    }
                    saVar.b((ps0) this.f41244e.c(aVar));
                    break;
                case 1:
                    if (this.f41242c == null) {
                        this.f41242c = a.cb.q(oVar, String.class);
                    }
                    saVar.f41845i = (String) this.f41242c.c(aVar);
                    boolean[] zArr = saVar.f41846j;
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 2:
                    if (this.f41243d == null) {
                        this.f41243d = a.cb.q(oVar, ls0.class);
                    }
                    saVar.f41839c = (ls0) this.f41243d.c(aVar);
                    boolean[] zArr2 = saVar.f41846j;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 3:
                    if (this.f41242c == null) {
                        this.f41242c = a.cb.q(oVar, String.class);
                    }
                    saVar.f41837a = (String) this.f41242c.c(aVar);
                    boolean[] zArr3 = saVar.f41846j;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 4:
                    if (this.f41241b == null) {
                        this.f41241b = a.cb.q(oVar, Integer.class);
                    }
                    saVar.f41841e = (Integer) this.f41241b.c(aVar);
                    boolean[] zArr4 = saVar.f41846j;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 5:
                    if (this.f41241b == null) {
                        this.f41241b = a.cb.q(oVar, Integer.class);
                    }
                    saVar.f41844h = (Integer) this.f41241b.c(aVar);
                    boolean[] zArr5 = saVar.f41846j;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 6:
                    if (this.f41242c == null) {
                        this.f41242c = a.cb.q(oVar, String.class);
                    }
                    saVar.f41842f = (String) this.f41242c.c(aVar);
                    boolean[] zArr6 = saVar.f41846j;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 7:
                    if (this.f41241b == null) {
                        this.f41241b = a.cb.q(oVar, Integer.class);
                    }
                    saVar.f41840d = (Integer) this.f41241b.c(aVar);
                    boolean[] zArr7 = saVar.f41846j;
                    if (zArr7.length <= 3) {
                        break;
                    } else {
                        zArr7[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f41242c == null) {
                        this.f41242c = a.cb.q(oVar, String.class);
                    }
                    saVar.f41838b = (String) this.f41242c.c(aVar);
                    boolean[] zArr8 = saVar.f41846j;
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
        return saVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        ps0 ps0Var;
        String str2;
        Integer num2;
        Integer num3;
        ls0 ls0Var;
        String str3;
        String str4;
        ta taVar = (ta) obj;
        if (taVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = taVar.f42150j;
        int length = zArr.length;
        nm.o oVar = this.f41240a;
        if (length > 0 && zArr[0]) {
            if (this.f41242c == null) {
                this.f41242c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41242c;
            um.c h10 = cVar.h("id");
            str4 = taVar.f42141a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41242c == null) {
                this.f41242c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41242c;
            um.c h13 = cVar.h("node_id");
            str3 = taVar.f42142b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41243d == null) {
                this.f41243d = a.cb.q(oVar, ls0.class);
            }
            nm.m mVar3 = this.f41243d;
            um.c h14 = cVar.h("attribution");
            ls0Var = taVar.f42143c;
            mVar3.e(h14, ls0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41241b == null) {
                this.f41241b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f41241b;
            um.c h15 = cVar.h("frame_height");
            num3 = taVar.f42144d;
            mVar4.e(h15, num3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41241b == null) {
                this.f41241b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f41241b;
            um.c h16 = cVar.h("frame_width");
            num2 = taVar.f42145e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41242c == null) {
                this.f41242c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41242c;
            um.c h17 = cVar.h("music_url");
            str2 = taVar.f42146f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41244e == null) {
                this.f41244e = a.cb.q(oVar, ps0.class);
            }
            nm.m mVar7 = this.f41244e;
            um.c h18 = cVar.h("timeline");
            ps0Var = taVar.f42147g;
            mVar7.e(h18, ps0Var);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41241b == null) {
                this.f41241b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f41241b;
            um.c h19 = cVar.h("version");
            num = taVar.f42148h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41242c == null) {
                this.f41242c = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f41242c;
            um.c h23 = cVar.h("watermark_id");
            str = taVar.f42149i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
