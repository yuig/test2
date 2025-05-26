package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class al extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35786a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35787b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35788c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35789d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f35790e;

    public al(nm.o oVar) {
        this.f35786a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zk zkVar = new zk(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1827607409:
                    if (k03.equals("has_expanded_sections")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1605895487:
                    if (k03.equals("board_tag")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -670183326:
                    if (k03.equals("show_curator_attribution_on_slp")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 287502673:
                    if (k03.equals("board_subtitle")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 542331806:
                    if (k03.equals("is_sponsored_content")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1126448022:
                    if (k03.equals("curator")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35786a;
            if (c13 == 0) {
                if (this.f35787b == null) {
                    this.f35787b = a.cb.q(oVar, Boolean.class);
                }
                zkVar.f44370d = (Boolean) this.f35787b.c(aVar);
                boolean[] zArr = zkVar.f44373g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f35788c == null) {
                    this.f35788c = a.cb.q(oVar, Integer.class);
                }
                zkVar.f44368b = (Integer) this.f35788c.c(aVar);
                boolean[] zArr2 = zkVar.f44373g;
                if (zArr2.length > 1) {
                    zArr2[1] = true;
                }
            } else if (c13 == 2) {
                if (this.f35787b == null) {
                    this.f35787b = a.cb.q(oVar, Boolean.class);
                }
                zkVar.f44372f = (Boolean) this.f35787b.c(aVar);
                boolean[] zArr3 = zkVar.f44373g;
                if (zArr3.length > 5) {
                    zArr3[5] = true;
                }
            } else if (c13 == 3) {
                if (this.f35789d == null) {
                    this.f35789d = a.cb.q(oVar, String.class);
                }
                zkVar.f44367a = (String) this.f35789d.c(aVar);
                boolean[] zArr4 = zkVar.f44373g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f35787b == null) {
                    this.f35787b = a.cb.q(oVar, Boolean.class);
                }
                zkVar.f44371e = (Boolean) this.f35787b.c(aVar);
                boolean[] zArr5 = zkVar.f44373g;
                if (zArr5.length > 4) {
                    zArr5[4] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f35790e == null) {
                    this.f35790e = a.cb.q(oVar, wy0.class);
                }
                zkVar.f44369c = (wy0) this.f35790e.c(aVar);
                boolean[] zArr6 = zkVar.f44373g;
                if (zArr6.length > 2) {
                    zArr6[2] = true;
                }
            }
        }
        aVar.g();
        return new cl(zkVar.f44367a, zkVar.f44368b, zkVar.f44369c, zkVar.f44370d, zkVar.f44371e, zkVar.f44372f, zkVar.f44373g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        wy0 wy0Var;
        Integer num;
        String str;
        cl clVar = (cl) obj;
        if (clVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = clVar.f36465g;
        int length = zArr.length;
        nm.o oVar = this.f35786a;
        if (length > 0 && zArr[0]) {
            if (this.f35789d == null) {
                this.f35789d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35789d;
            um.c h10 = cVar.h("board_subtitle");
            str = clVar.f36459a;
            mVar.e(h10, str);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35788c == null) {
                this.f35788c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f35788c;
            um.c h13 = cVar.h("board_tag");
            num = clVar.f36460b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35790e == null) {
                this.f35790e = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar3 = this.f35790e;
            um.c h14 = cVar.h("curator");
            wy0Var = clVar.f36461c;
            mVar3.e(h14, wy0Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35787b == null) {
                this.f35787b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f35787b;
            um.c h15 = cVar.h("has_expanded_sections");
            bool3 = clVar.f36462d;
            mVar4.e(h15, bool3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35787b == null) {
                this.f35787b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f35787b;
            um.c h16 = cVar.h("is_sponsored_content");
            bool2 = clVar.f36463e;
            mVar5.e(h16, bool2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35787b == null) {
                this.f35787b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f35787b;
            um.c h17 = cVar.h("show_curator_attribution_on_slp");
            bool = clVar.f36464f;
            mVar6.e(h17, bool);
        }
        cVar.g();
    }
}
