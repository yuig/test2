package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gt extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38134a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38135b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38136c;

    public gt(nm.o oVar) {
        this.f38134a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ft ftVar = new ft(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1268779017:
                    if (k03.equals("format")) {
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
                case 3002589:
                    if (k03.equals("args")) {
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
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38134a;
            if (c13 == 0) {
                if (this.f38136c == null) {
                    this.f38136c = a.cb.q(oVar, String.class);
                }
                ftVar.f37797d = (String) this.f38136c.c(aVar);
                boolean[] zArr = ftVar.f37799f;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38136c == null) {
                    this.f38136c = a.cb.q(oVar, String.class);
                }
                ftVar.f37794a = (String) this.f38136c.c(aVar);
                boolean[] zArr2 = ftVar.f37799f;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f38135b == null) {
                    this.f38135b = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.InterestTitle$InterestTitleTypeAdapter$2
                    }).b();
                }
                ftVar.f37796c = (List) this.f38135b.c(aVar);
                boolean[] zArr3 = ftVar.f37799f;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f38136c == null) {
                    this.f38136c = a.cb.q(oVar, String.class);
                }
                ftVar.f37798e = (String) this.f38136c.c(aVar);
                boolean[] zArr4 = ftVar.f37799f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f38136c == null) {
                    this.f38136c = a.cb.q(oVar, String.class);
                }
                ftVar.f37795b = (String) this.f38136c.c(aVar);
                boolean[] zArr5 = ftVar.f37799f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new jt(ftVar.f37794a, ftVar.f37795b, ftVar.f37796c, ftVar.f37797d, ftVar.f37798e, ftVar.f37799f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        jt jtVar = (jt) obj;
        if (jtVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = jtVar.f39146f;
        int length = zArr.length;
        nm.o oVar = this.f38134a;
        if (length > 0 && zArr[0]) {
            if (this.f38136c == null) {
                this.f38136c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38136c;
            um.c h10 = cVar.h("id");
            str4 = jtVar.f39141a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38136c == null) {
                this.f38136c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38136c;
            um.c h13 = cVar.h("node_id");
            str3 = jtVar.f39142b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38135b == null) {
                this.f38135b = oVar.g(new TypeToken<List<Map<String, Object>>>(this) { // from class: com.pinterest.api.model.InterestTitle$InterestTitleTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f38135b;
            um.c h14 = cVar.h("args");
            list = jtVar.f39143c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38136c == null) {
                this.f38136c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38136c;
            um.c h15 = cVar.h("format");
            str2 = jtVar.f39144d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38136c == null) {
                this.f38136c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38136c;
            um.c h16 = cVar.h("text");
            str = jtVar.f39145e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
