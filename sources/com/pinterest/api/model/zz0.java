package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes.dex */
public final class zz0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44539a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44540b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44541c;

    public zz0(nm.o oVar) {
        this.f44539a = oVar;
    }

    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        yz0 yz0Var = new yz0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            int hashCode = k03.hashCode();
            char c13 = 65535;
            if (hashCode != -1992012396) {
                if (hashCode != -1618089502) {
                    if (hashCode != 3355) {
                        if (hashCode == 1073584312 && k03.equals("signature")) {
                            c13 = 3;
                        }
                    } else if (k03.equals("id")) {
                        c13 = 2;
                    }
                } else if (k03.equals("video_list")) {
                    c13 = 1;
                }
            } else if (k03.equals("duration")) {
                c13 = 0;
            }
            nm.o oVar = this.f44539a;
            if (c13 == 0) {
                if (this.f44541c == null) {
                    this.f44541c = a.cb.q(oVar, String.class);
                }
                yz0Var.f44159a = (String) this.f44541c.c(aVar);
                boolean[] zArr = yz0Var.f44163e;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f44540b == null) {
                    this.f44540b = oVar.g(new TypeToken<Map<String, h01>>(this) { // from class: com.pinterest.api.model.Video$VideoTypeAdapter$2
                    }).b();
                }
                yz0Var.f44162d = (Map) this.f44540b.c(aVar);
                boolean[] zArr2 = yz0Var.f44163e;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f44541c == null) {
                    this.f44541c = a.cb.q(oVar, String.class);
                }
                yz0Var.f44160b = (String) this.f44541c.c(aVar);
                boolean[] zArr3 = yz0Var.f44163e;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 != 3) {
                aVar.E();
            } else {
                if (this.f44541c == null) {
                    this.f44541c = a.cb.q(oVar, String.class);
                }
                yz0Var.a((String) this.f44541c.c(aVar));
            }
        }
        aVar.g();
        return new b01(yz0Var.f44159a, yz0Var.f44160b, yz0Var.f44161c, yz0Var.f44162d, yz0Var.f44163e, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Map map;
        String str;
        String str2;
        String str3;
        b01 b01Var = (b01) obj;
        if (b01Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = b01Var.f35935e;
        int length = zArr.length;
        nm.o oVar = this.f44539a;
        if (length > 0 && zArr[0]) {
            if (this.f44541c == null) {
                this.f44541c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44541c;
            um.c h10 = cVar.h("duration");
            str3 = b01Var.f35931a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44541c == null) {
                this.f44541c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44541c;
            um.c h13 = cVar.h("id");
            str2 = b01Var.f35932b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44541c == null) {
                this.f44541c = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f44541c;
            um.c h14 = cVar.h("signature");
            str = b01Var.f35933c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44540b == null) {
                this.f44540b = oVar.g(new TypeToken<Map<String, h01>>(this) { // from class: com.pinterest.api.model.Video$VideoTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f44540b;
            um.c h15 = cVar.h("video_list");
            map = b01Var.f35934d;
            mVar4.e(h15, map);
        }
        cVar.g();
    }
}
