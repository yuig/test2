package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class y0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43859a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43860b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43861c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43862d;

    public y0(nm.o oVar) {
        this.f43859a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        a1 a1Var = new a1(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1538152596:
                    if (k03.equals("industry_product_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1507633789:
                    if (k03.equals("retailers")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 492528685:
                    if (k03.equals("industry_product_id_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1251954791:
                    if (k03.equals("platform_id")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1874684019:
                    if (k03.equals("platform")) {
                        c13 = 4;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43859a;
            if (c13 == 0) {
                if (this.f43862d == null) {
                    this.f43862d = a.cb.q(oVar, String.class);
                }
                a1Var.f35603a = (String) this.f43862d.c(aVar);
                boolean[] zArr = a1Var.f35608f;
                if (zArr.length > 0) {
                    zArr[0] = true;
                }
            } else if (c13 == 1) {
                if (this.f43861c == null) {
                    this.f43861c = oVar.g(new TypeToken<List<f1>>(this) { // from class: com.pinterest.api.model.AdsCartingData$AdsCartingDataTypeAdapter$2
                    }).b();
                }
                a1Var.f35607e = (List) this.f43861c.c(aVar);
                boolean[] zArr2 = a1Var.f35608f;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f43862d == null) {
                    this.f43862d = a.cb.q(oVar, String.class);
                }
                a1Var.f35604b = (String) this.f43862d.c(aVar);
                boolean[] zArr3 = a1Var.f35608f;
                if (zArr3.length > 1) {
                    zArr3[1] = true;
                }
            } else if (c13 == 3) {
                if (this.f43860b == null) {
                    this.f43860b = a.cb.q(oVar, Integer.class);
                }
                a1Var.f35606d = (Integer) this.f43860b.c(aVar);
                boolean[] zArr4 = a1Var.f35608f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f43862d == null) {
                    this.f43862d = a.cb.q(oVar, String.class);
                }
                a1Var.f35605c = (String) this.f43862d.c(aVar);
                boolean[] zArr5 = a1Var.f35608f;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            }
        }
        aVar.g();
        return new b1(a1Var.f35603a, a1Var.f35604b, a1Var.f35605c, a1Var.f35606d, a1Var.f35607e, a1Var.f35608f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Integer num;
        String str;
        String str2;
        String str3;
        b1 b1Var = (b1) obj;
        if (b1Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = b1Var.f35941f;
        int length = zArr.length;
        nm.o oVar = this.f43859a;
        if (length > 0 && zArr[0]) {
            if (this.f43862d == null) {
                this.f43862d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43862d;
            um.c h10 = cVar.h("industry_product_id");
            str3 = b1Var.f35936a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43862d == null) {
                this.f43862d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43862d;
            um.c h13 = cVar.h("industry_product_id_type");
            str2 = b1Var.f35937b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43862d == null) {
                this.f43862d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43862d;
            um.c h14 = cVar.h("platform");
            str = b1Var.f35938c;
            mVar3.e(h14, str);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43860b == null) {
                this.f43860b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f43860b;
            um.c h15 = cVar.h("platform_id");
            num = b1Var.f35939d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43861c == null) {
                this.f43861c = oVar.g(new TypeToken<List<f1>>(this) { // from class: com.pinterest.api.model.AdsCartingData$AdsCartingDataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f43861c;
            um.c h16 = cVar.h("retailers");
            list = b1Var.f35940e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
