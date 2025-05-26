package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class z80 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44245a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44246b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44247c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44248d;

    public z80(nm.o oVar) {
        this.f44245a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        y80 y80Var = new y80(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1698410561:
                    if (k03.equals("source_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -896505829:
                    if (k03.equals("source")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 112202875:
                    if (k03.equals("video")) {
                        c13 = 3;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f44245a;
            if (c13 == 0) {
                if (this.f44247c == null) {
                    this.f44247c = a.cb.q(oVar, String.class);
                }
                y80Var.c((String) this.f44247c.c(aVar));
            } else if (c13 == 1) {
                if (this.f44246b == null) {
                    this.f44246b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ProfileCoverSource$ProfileCoverSourceTypeAdapter$2
                    }).b();
                }
                y80Var.a((Map) this.f44246b.c(aVar));
            } else if (c13 == 2) {
                if (this.f44247c == null) {
                    this.f44247c = a.cb.q(oVar, String.class);
                }
                y80Var.b((String) this.f44247c.c(aVar));
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f44248d == null) {
                    this.f44248d = a.cb.q(oVar, b01.class);
                }
                y80Var.d((b01) this.f44248d.c(aVar));
            }
        }
        aVar.g();
        return new b90(y80Var.f43973a, y80Var.f43974b, y80Var.f43975c, y80Var.f43976d, y80Var.f43977e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        b01 b01Var;
        String str;
        String str2;
        Map map;
        b90 b90Var = (b90) obj;
        if (b90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = b90Var.f36023e;
        int length = zArr.length;
        nm.o oVar = this.f44245a;
        if (length > 0 && zArr[0]) {
            if (this.f44246b == null) {
                this.f44246b = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.ProfileCoverSource$ProfileCoverSourceTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f44246b;
            um.c h10 = cVar.h("images");
            map = b90Var.f36019a;
            mVar.e(h10, map);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44247c == null) {
                this.f44247c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44247c;
            um.c h13 = cVar.h("source");
            str2 = b90Var.f36020b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44247c == null) {
                this.f44247c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44247c;
            um.c h14 = cVar.h("source_id");
            str = b90Var.f36021c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44248d == null) {
                this.f44248d = a.cb.q(oVar, b01.class);
            }
            nm.m mVar4 = this.f44248d;
            um.c h15 = cVar.h("video");
            b01Var = b90Var.f36022d;
            mVar4.e(h15, b01Var);
        }
        cVar.g();
    }
}
