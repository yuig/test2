package com.pinterest.api.model;

import java.util.Date;

/* loaded from: classes3.dex */
public final class af extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35714a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35715b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35716c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35717d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f35718e;

    public af(nm.o oVar) {
        this.f35714a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ze zeVar = new ze(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1450074344:
                    if (k03.equals("replies_count")) {
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
                case 1069409405:
                    if (k03.equals("anchor_message")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
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
            nm.o oVar = this.f35714a;
            if (c13 == 0) {
                if (this.f35716c == null) {
                    this.f35716c = a.cb.q(oVar, Integer.class);
                }
                zeVar.f44316e = (Integer) this.f35716c.c(aVar);
                boolean[] zArr = zeVar.f44317f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f35718e == null) {
                    this.f35718e = a.cb.q(oVar, String.class);
                }
                zeVar.f44312a = (String) this.f35718e.c(aVar);
                boolean[] zArr2 = zeVar.f44317f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f35717d == null) {
                    this.f35717d = a.cb.q(oVar, mv.class);
                }
                zeVar.f44314c = (mv) this.f35717d.c(aVar);
                boolean[] zArr3 = zeVar.f44317f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f35715b == null) {
                    this.f35715b = a.cb.q(oVar, Date.class);
                }
                zeVar.f44315d = (Date) this.f35715b.c(aVar);
                boolean[] zArr4 = zeVar.f44317f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f35718e == null) {
                    this.f35718e = a.cb.q(oVar, String.class);
                }
                zeVar.f44313b = (String) this.f35718e.c(aVar);
                boolean[] zArr5 = zeVar.f44317f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new cf(zeVar.f44312a, zeVar.f44313b, zeVar.f44314c, zeVar.f44315d, zeVar.f44316e, zeVar.f44317f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        Date date;
        mv mvVar;
        String str;
        String str2;
        cf cfVar = (cf) obj;
        if (cfVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cfVar.f36407f;
        int length = zArr.length;
        nm.o oVar = this.f35714a;
        if (length > 0 && zArr[0]) {
            if (this.f35718e == null) {
                this.f35718e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35718e;
            um.c h10 = cVar.h("id");
            str2 = cfVar.f36402a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35718e == null) {
                this.f35718e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35718e;
            um.c h13 = cVar.h("node_id");
            str = cfVar.f36403b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35717d == null) {
                this.f35717d = a.cb.q(oVar, mv.class);
            }
            nm.m mVar3 = this.f35717d;
            um.c h14 = cVar.h("anchor_message");
            mvVar = cfVar.f36404c;
            mVar3.e(h14, mvVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35715b == null) {
                this.f35715b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f35715b;
            um.c h15 = cVar.h("created_at");
            date = cfVar.f36405d;
            mVar4.e(h15, date);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35716c == null) {
                this.f35716c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f35716c;
            um.c h16 = cVar.h("replies_count");
            num = cfVar.f36406e;
            mVar5.e(h16, num);
        }
        cVar.g();
    }
}
