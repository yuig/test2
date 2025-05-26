package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class az extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35904a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35905b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35906c;

    public az(nm.o oVar) {
        this.f35904a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zy zyVar = new zy(0);
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
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1404997203:
                    if (k03.equals("close_button_text")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f35904a;
            if (c13 == 0) {
                if (this.f35905b == null) {
                    this.f35905b = a.cb.q(oVar, tm.class);
                }
                zyVar.f44506d = (tm) this.f35905b.c(aVar);
                boolean[] zArr = zyVar.f44508f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f35906c == null) {
                    this.f35906c = a.cb.q(oVar, String.class);
                }
                zyVar.f44503a = (String) this.f35906c.c(aVar);
                boolean[] zArr2 = zyVar.f44508f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f35906c == null) {
                    this.f35906c = a.cb.q(oVar, String.class);
                }
                zyVar.f44507e = (String) this.f35906c.c(aVar);
                boolean[] zArr3 = zyVar.f44508f;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f35906c == null) {
                    this.f35906c = a.cb.q(oVar, String.class);
                }
                zyVar.f44505c = (String) this.f35906c.c(aVar);
                boolean[] zArr4 = zyVar.f44508f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f35906c == null) {
                    this.f35906c = a.cb.q(oVar, String.class);
                }
                zyVar.f44504b = (String) this.f35906c.c(aVar);
                boolean[] zArr5 = zyVar.f44508f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new cz(zyVar.f44503a, zyVar.f44504b, zyVar.f44505c, zyVar.f44506d, zyVar.f44507e, zyVar.f44508f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        tm tmVar;
        String str2;
        String str3;
        String str4;
        cz czVar = (cz) obj;
        if (czVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = czVar.f36578f;
        int length = zArr.length;
        nm.o oVar = this.f35904a;
        if (length > 0 && zArr[0]) {
            if (this.f35906c == null) {
                this.f35906c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35906c;
            um.c h10 = cVar.h("id");
            str4 = czVar.f36573a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35906c == null) {
                this.f35906c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35906c;
            um.c h13 = cVar.h("node_id");
            str3 = czVar.f36574b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35906c == null) {
                this.f35906c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35906c;
            um.c h14 = cVar.h("close_button_text");
            str2 = czVar.f36575c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35905b == null) {
                this.f35905b = a.cb.q(oVar, tm.class);
            }
            nm.m mVar4 = this.f35905b;
            um.c h15 = cVar.h("description");
            tmVar = czVar.f36576d;
            mVar4.e(h15, tmVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35906c == null) {
                this.f35906c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35906c;
            um.c h16 = cVar.h("title");
            str = czVar.f36577e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
