package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40557a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40558b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40559c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40560d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40561e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40562f;

    public o(nm.o oVar) {
        this.f40557a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        q qVar = new q(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1809421292:
                    if (k03.equals("extensions")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1401072996:
                    if (k03.equals("ad_verifications")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -667238030:
                    if (k03.equals("ad_payload")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -173671634:
                    if (k03.equals("client_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 831846208:
                    if (k03.equals("content_type")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 851126169:
                    if (k03.equals("sideswipe_pin")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40557a;
            switch (c13) {
                case 0:
                    if (this.f40559c == null) {
                        this.f40559c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AdDataThirdParty$AdDataThirdPartyTypeAdapter$2
                        }).b();
                    }
                    qVar.f41153g = (Map) this.f40559c.c(aVar);
                    boolean[] zArr = qVar.f41155i;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 1:
                    if (this.f40562f == null) {
                        this.f40562f = a.cb.q(oVar, zt0.class);
                    }
                    qVar.f41150d = (zt0) this.f40562f.c(aVar);
                    boolean[] zArr2 = qVar.f41155i;
                    if (zArr2.length <= 3) {
                        break;
                    } else {
                        zArr2[3] = true;
                        break;
                    }
                case 2:
                    if (this.f40561e == null) {
                        this.f40561e = a.cb.q(oVar, String.class);
                    }
                    qVar.f41149c = (String) this.f40561e.c(aVar);
                    boolean[] zArr3 = qVar.f41155i;
                    if (zArr3.length <= 2) {
                        break;
                    } else {
                        zArr3[2] = true;
                        break;
                    }
                case 3:
                    if (this.f40558b == null) {
                        this.f40558b = a.cb.q(oVar, Integer.class);
                    }
                    qVar.f41151e = (Integer) this.f40558b.c(aVar);
                    boolean[] zArr4 = qVar.f41155i;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 4:
                    if (this.f40561e == null) {
                        this.f40561e = a.cb.q(oVar, String.class);
                    }
                    qVar.f41147a = (String) this.f40561e.c(aVar);
                    boolean[] zArr5 = qVar.f41155i;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f40561e == null) {
                        this.f40561e = a.cb.q(oVar, String.class);
                    }
                    qVar.f41152f = (String) this.f40561e.c(aVar);
                    boolean[] zArr6 = qVar.f41155i;
                    if (zArr6.length <= 5) {
                        break;
                    } else {
                        zArr6[5] = true;
                        break;
                    }
                case 6:
                    if (this.f40560d == null) {
                        this.f40560d = a.cb.q(oVar, f30.class);
                    }
                    qVar.f41154h = (f30) this.f40560d.c(aVar);
                    boolean[] zArr7 = qVar.f41155i;
                    if (zArr7.length <= 7) {
                        break;
                    } else {
                        zArr7[7] = true;
                        break;
                    }
                case 7:
                    if (this.f40561e == null) {
                        this.f40561e = a.cb.q(oVar, String.class);
                    }
                    qVar.f41148b = (String) this.f40561e.c(aVar);
                    boolean[] zArr8 = qVar.f41155i;
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
        return new r(qVar.f41147a, qVar.f41148b, qVar.f41149c, qVar.f41150d, qVar.f41151e, qVar.f41152f, qVar.f41153g, qVar.f41154h, qVar.f41155i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        f30 f30Var;
        Map map;
        String str;
        Integer num;
        zt0 zt0Var;
        String str2;
        String str3;
        String str4;
        r rVar = (r) obj;
        if (rVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = rVar.f41460i;
        int length = zArr.length;
        nm.o oVar = this.f40557a;
        if (length > 0 && zArr[0]) {
            if (this.f40561e == null) {
                this.f40561e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40561e;
            um.c h10 = cVar.h("id");
            str4 = rVar.f41452a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40561e == null) {
                this.f40561e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40561e;
            um.c h13 = cVar.h("node_id");
            str3 = rVar.f41453b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40561e == null) {
                this.f40561e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f40561e;
            um.c h14 = cVar.h("ad_payload");
            str2 = rVar.f41454c;
            mVar3.e(h14, str2);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40562f == null) {
                this.f40562f = a.cb.q(oVar, zt0.class);
            }
            nm.m mVar4 = this.f40562f;
            um.c h15 = cVar.h("ad_verifications");
            zt0Var = rVar.f41455d;
            mVar4.e(h15, zt0Var);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40558b == null) {
                this.f40558b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f40558b;
            um.c h16 = cVar.h("client_type");
            num = rVar.f41456e;
            mVar5.e(h16, num);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40561e == null) {
                this.f40561e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f40561e;
            um.c h17 = cVar.h("content_type");
            str = rVar.f41457f;
            mVar6.e(h17, str);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f40559c == null) {
                this.f40559c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.AdDataThirdParty$AdDataThirdPartyTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f40559c;
            um.c h18 = cVar.h("extensions");
            map = rVar.f41458g;
            mVar7.e(h18, map);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f40560d == null) {
                this.f40560d = a.cb.q(oVar, f30.class);
            }
            nm.m mVar8 = this.f40560d;
            um.c h19 = cVar.h("sideswipe_pin");
            f30Var = rVar.f41459h;
            mVar8.e(h19, f30Var);
        }
        cVar.g();
    }
}
