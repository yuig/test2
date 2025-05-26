package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class a00 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35599a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35600b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35601c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35602d;

    public a00(nm.o oVar) {
        this.f35599a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zz zzVar = new zz(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1604143506:
                    if (k03.equals("background_color_hex")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1390416064:
                    if (k03.equals("icon_type")) {
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
                case 3575610:
                    if (k03.equals("type")) {
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
            nm.o oVar = this.f35599a;
            if (c13 == 0) {
                if (this.f35601c == null) {
                    this.f35601c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmodeicon$OnebarmodeiconTypeAdapter$2
                    }).b();
                }
                zzVar.f44535c = (List) this.f35601c.c(aVar);
                boolean[] zArr = zzVar.f44538f;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f35600b == null) {
                    this.f35600b = a.cb.q(oVar, Integer.class);
                }
                zzVar.f44536d = (Integer) this.f35600b.c(aVar);
                boolean[] zArr2 = zzVar.f44538f;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f35602d == null) {
                    this.f35602d = a.cb.q(oVar, String.class);
                }
                zzVar.f44533a = (String) this.f35602d.c(aVar);
                boolean[] zArr3 = zzVar.f44538f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f35602d == null) {
                    this.f35602d = a.cb.q(oVar, String.class);
                }
                zzVar.f44537e = (String) this.f35602d.c(aVar);
                boolean[] zArr4 = zzVar.f44538f;
                if (zArr4.length > 4) {
                    zArr4[4] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f35602d == null) {
                    this.f35602d = a.cb.q(oVar, String.class);
                }
                zzVar.f44534b = (String) this.f35602d.c(aVar);
                boolean[] zArr5 = zzVar.f44538f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new c00(zzVar.f44533a, zzVar.f44534b, zzVar.f44535c, zzVar.f44536d, zzVar.f44537e, zzVar.f44538f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        List list;
        String str2;
        String str3;
        c00 c00Var = (c00) obj;
        if (c00Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = c00Var.f36268f;
        int length = zArr.length;
        nm.o oVar = this.f35599a;
        if (length > 0 && zArr[0]) {
            if (this.f35602d == null) {
                this.f35602d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35602d;
            um.c h10 = cVar.h("id");
            str3 = c00Var.f36263a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35602d == null) {
                this.f35602d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35602d;
            um.c h13 = cVar.h("node_id");
            str2 = c00Var.f36264b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35601c == null) {
                this.f35601c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Onebarmodeicon$OnebarmodeiconTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f35601c;
            um.c h14 = cVar.h("background_color_hex");
            list = c00Var.f36265c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35600b == null) {
                this.f35600b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f35600b;
            um.c h15 = cVar.h("icon_type");
            num = c00Var.f36266d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35602d == null) {
                this.f35602d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35602d;
            um.c h16 = cVar.h("type");
            str = c00Var.f36267e;
            mVar5.e(h16, str);
        }
        cVar.g();
    }
}
