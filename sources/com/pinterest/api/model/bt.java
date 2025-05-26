package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class bt extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36185a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36186b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36187c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36188d;

    public bt(nm.o oVar) {
        this.f36185a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        at atVar = new at(0);
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
                case -1175525148:
                    if (k03.equals("l1_interest")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
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
                case 1053220864:
                    if (k03.equals("cover_images")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36185a;
            if (c13 == 0) {
                if (this.f36188d == null) {
                    this.f36188d = a.cb.q(oVar, String.class);
                }
                atVar.f35854b = (String) this.f36188d.c(aVar);
                boolean[] zArr = atVar.f35858f;
                if (zArr.length > 1) {
                    zArr[1] = true;
                }
            } else if (c13 == 1) {
                if (this.f36186b == null) {
                    this.f36186b = a.cb.q(oVar, zs.class);
                }
                atVar.f35856d = (zs) this.f36186b.c(aVar);
                boolean[] zArr2 = atVar.f35858f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f36188d == null) {
                    this.f36188d = a.cb.q(oVar, String.class);
                }
                atVar.f35855c = (String) this.f36188d.c(aVar);
                boolean[] zArr3 = atVar.f35858f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f36188d == null) {
                    this.f36188d = a.cb.q(oVar, String.class);
                }
                atVar.f35857e = (String) this.f36188d.c(aVar);
                boolean[] zArr4 = atVar.f35858f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f36187c == null) {
                    this.f36187c = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.InterestCard$InterestCardTypeAdapter$2
                    }).b();
                }
                atVar.f35853a = (Map) this.f36187c.c(aVar);
                boolean[] zArr5 = atVar.f35858f;
                if (zArr5.length > 0) {
                    zArr5[0] = true;
                }
            }
        }
        aVar.g();
        return new dt(atVar.f35853a, atVar.f35854b, atVar.f35855c, atVar.f35856d, atVar.f35857e, atVar.f35858f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        zs zsVar;
        String str2;
        String str3;
        Map map;
        dt dtVar = (dt) obj;
        if (dtVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dtVar.f36955f;
        int length = zArr.length;
        nm.o oVar = this.f36185a;
        if (length > 0 && zArr[0]) {
            if (this.f36187c == null) {
                this.f36187c = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.InterestCard$InterestCardTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36187c;
            um.c h10 = cVar.h("cover_images");
            map = dtVar.f36950a;
            mVar.e(h10, map);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36188d == null) {
                this.f36188d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f36188d;
            um.c h13 = cVar.h("description");
            str3 = dtVar.f36951b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36188d == null) {
                this.f36188d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f36188d;
            um.c h14 = cVar.h("id");
            str2 = dtVar.f36952c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36186b == null) {
                this.f36186b = a.cb.q(oVar, zs.class);
            }
            nm.m mVar4 = this.f36186b;
            um.c h15 = cVar.h("l1_interest");
            zsVar = dtVar.f36953d;
            mVar4.e(h15, zsVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36188d == null) {
                this.f36188d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f36188d;
            um.c h16 = cVar.h("title");
            str = dtVar.f36954e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
