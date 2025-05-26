package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class sc extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41849a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41850b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41851c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41852d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41853e;

    public sc(nm.o oVar) {
        this.f41849a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        rc rcVar = new rc(0);
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 100526016:
                    if (k03.equals("items")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1312811908:
                    if (k03.equals("background_item")) {
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
            nm.o oVar = this.f41849a;
            if (c13 == 0) {
                if (this.f41853e == null) {
                    this.f41853e = a.cb.q(oVar, String.class);
                }
                rcVar.f41540a = (String) this.f41853e.c(aVar);
                boolean[] zArr = rcVar.f41545f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f41852d == null) {
                    this.f41852d = a.cb.q(oVar, f30.class);
                }
                rcVar.f41544e = (f30) this.f41852d.c(aVar);
                boolean[] zArr2 = rcVar.f41545f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f41851c == null) {
                    this.f41851c = oVar.g(new TypeToken<List<kd>>(this) { // from class: com.pinterest.api.model.Collages$CollagesTypeAdapter$2
                    }).b();
                }
                rcVar.f41543d = (List) this.f41851c.c(aVar);
                boolean[] zArr3 = rcVar.f41545f;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f41850b == null) {
                    this.f41850b = a.cb.q(oVar, kd.class);
                }
                rcVar.f41542c = (kd) this.f41850b.c(aVar);
                boolean[] zArr4 = rcVar.f41545f;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f41853e == null) {
                    this.f41853e = a.cb.q(oVar, String.class);
                }
                rcVar.f41541b = (String) this.f41853e.c(aVar);
                boolean[] zArr5 = rcVar.f41545f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new uc(rcVar.f41540a, rcVar.f41541b, rcVar.f41542c, rcVar.f41543d, rcVar.f41544e, rcVar.f41545f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        List list;
        kd kdVar;
        String str;
        String str2;
        uc ucVar = (uc) obj;
        if (ucVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ucVar.f42508f;
        int length = zArr.length;
        nm.o oVar = this.f41849a;
        if (length > 0 && zArr[0]) {
            if (this.f41853e == null) {
                this.f41853e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41853e;
            um.c h10 = cVar.h("id");
            str2 = ucVar.f42503a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41853e == null) {
                this.f41853e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41853e;
            um.c h13 = cVar.h("node_id");
            str = ucVar.f42504b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41850b == null) {
                this.f41850b = a.cb.q(oVar, kd.class);
            }
            nm.m mVar3 = this.f41850b;
            um.c h14 = cVar.h("background_item");
            kdVar = ucVar.f42505c;
            mVar3.e(h14, kdVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41851c == null) {
                this.f41851c = oVar.g(new TypeToken<List<kd>>(this) { // from class: com.pinterest.api.model.Collages$CollagesTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f41851c;
            um.c h15 = cVar.h("items");
            list = ucVar.f42506d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41852d == null) {
                this.f41852d = a.cb.q(oVar, f30.class);
            }
            nm.m mVar5 = this.f41852d;
            um.c h16 = cVar.h("pin");
            f30Var = ucVar.f42507e;
            mVar5.e(h16, f30Var);
        }
        cVar.g();
    }
}
