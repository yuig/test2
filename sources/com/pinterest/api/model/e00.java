package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37002a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37003b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37004c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37005d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37006e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37007f;

    public e00(nm.o oVar) {
        this.f37002a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        d00 d00Var = new d00(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1422950858:
                    if (k03.equals("action")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1194801875:
                    if (k03.equals("module_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -94753778:
                    if (k03.equals("tracking_params")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1118509956:
                    if (k03.equals("animation")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1538934853:
                    if (k03.equals("aux_data")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1671764162:
                    if (k03.equals("display")) {
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
            nm.o oVar = this.f37002a;
            switch (c13) {
                case 0:
                    if (this.f37005d == null) {
                        this.f37005d = a.cb.q(oVar, k00.class);
                    }
                    d00Var.b((k00) this.f37005d.c(aVar));
                    break;
                case 1:
                    if (this.f37003b == null) {
                        this.f37003b = a.cb.q(oVar, Integer.class);
                    }
                    d00Var.f36602g = (Integer) this.f37003b.c(aVar);
                    boolean[] zArr = d00Var.f36605j;
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 2:
                    if (this.f37007f == null) {
                        this.f37007f = a.cb.q(oVar, String.class);
                    }
                    d00Var.f36603h = (String) this.f37007f.c(aVar);
                    boolean[] zArr2 = d00Var.f36605j;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 3:
                    if (this.f37007f == null) {
                        this.f37007f = a.cb.q(oVar, String.class);
                    }
                    d00Var.f36596a = (String) this.f37007f.c(aVar);
                    boolean[] zArr3 = d00Var.f36605j;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 4:
                    if (this.f37007f == null) {
                        this.f37007f = a.cb.q(oVar, String.class);
                    }
                    d00Var.f36604i = (String) this.f37007f.c(aVar);
                    boolean[] zArr4 = d00Var.f36605j;
                    if (zArr4.length <= 8) {
                        break;
                    } else {
                        zArr4[8] = true;
                        break;
                    }
                case 5:
                    if (this.f37003b == null) {
                        this.f37003b = a.cb.q(oVar, Integer.class);
                    }
                    d00Var.f36599d = (Integer) this.f37003b.c(aVar);
                    boolean[] zArr5 = d00Var.f36605j;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case 6:
                    if (this.f37004c == null) {
                        this.f37004c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Onebarmodule$OnebarmoduleTypeAdapter$2
                        }).b();
                    }
                    d00Var.f36600e = (Map) this.f37004c.c(aVar);
                    boolean[] zArr6 = d00Var.f36605j;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 7:
                    if (this.f37006e == null) {
                        this.f37006e = a.cb.q(oVar, o00.class);
                    }
                    d00Var.c((o00) this.f37006e.c(aVar));
                    break;
                case '\b':
                    if (this.f37007f == null) {
                        this.f37007f = a.cb.q(oVar, String.class);
                    }
                    d00Var.f36597b = (String) this.f37007f.c(aVar);
                    boolean[] zArr7 = d00Var.f36605j;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return d00Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        o00 o00Var;
        Map map;
        Integer num2;
        k00 k00Var;
        String str3;
        String str4;
        g00 g00Var = (g00) obj;
        if (g00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = g00Var.f37898j;
        int length = zArr.length;
        nm.o oVar = this.f37002a;
        if (length > 0 && zArr[0]) {
            if (this.f37007f == null) {
                this.f37007f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37007f;
            um.c h10 = cVar.h("id");
            str4 = g00Var.f37889a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37007f == null) {
                this.f37007f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37007f;
            um.c h13 = cVar.h("node_id");
            str3 = g00Var.f37890b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37005d == null) {
                this.f37005d = a.cb.q(oVar, k00.class);
            }
            nm.m mVar3 = this.f37005d;
            um.c h14 = cVar.h("action");
            k00Var = g00Var.f37891c;
            mVar3.e(h14, k00Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37003b == null) {
                this.f37003b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f37003b;
            um.c h15 = cVar.h("animation");
            num2 = g00Var.f37892d;
            mVar4.e(h15, num2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37004c == null) {
                this.f37004c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.Onebarmodule$OnebarmoduleTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f37004c;
            um.c h16 = cVar.h("aux_data");
            map = g00Var.f37893e;
            mVar5.e(h16, map);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37006e == null) {
                this.f37006e = a.cb.q(oVar, o00.class);
            }
            nm.m mVar6 = this.f37006e;
            um.c h17 = cVar.h("display");
            o00Var = g00Var.f37894f;
            mVar6.e(h17, o00Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37003b == null) {
                this.f37003b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f37003b;
            um.c h18 = cVar.h("module_type");
            num = g00Var.f37895g;
            mVar7.e(h18, num);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37007f == null) {
                this.f37007f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f37007f;
            um.c h19 = cVar.h("tracking_params");
            str2 = g00Var.f37896h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37007f == null) {
                this.f37007f = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37007f;
            um.c h23 = cVar.h("type");
            str = g00Var.f37897i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
