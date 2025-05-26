package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class o30 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f40600a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f40601b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f40602c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f40603d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f40604e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f40605f;

    public o30(nm.o oVar) {
        this.f40600a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        n30 n30Var = new n30(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1703162617:
                    if (k03.equals("thumbnails")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -588175025:
                    if (k03.equals("pin_types")) {
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
                case 104585032:
                    if (k03.equals("names")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f40600a;
            if (c13 == 0) {
                if (this.f40603d == null) {
                    this.f40603d = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$6
                    }).b();
                }
                n30Var.f40312f = (List) this.f40603d.c(aVar);
                boolean[] zArr = n30Var.f40313g;
                if (zArr.length > 5) {
                    zArr[5] = true;
                }
            } else if (c13 == 1) {
                if (this.f40601b == null) {
                    this.f40601b = a.cb.q(oVar, Integer.class);
                }
                n30Var.f40310d = (Integer) this.f40601b.c(aVar);
                boolean[] zArr2 = n30Var.f40313g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f40602c == null) {
                    this.f40602c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$5
                    }).b();
                }
                n30Var.f40311e = (List) this.f40602c.c(aVar);
                boolean[] zArr3 = n30Var.f40313g;
                if (zArr3.length > 4) {
                    zArr3[4] = true;
                }
            } else if (c13 == 3) {
                if (this.f40605f == null) {
                    this.f40605f = a.cb.q(oVar, String.class);
                }
                n30Var.f40307a = (String) this.f40605f.c(aVar);
                boolean[] zArr4 = n30Var.f40313g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f40604e == null) {
                    this.f40604e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$4
                    }).b();
                }
                n30Var.f40309c = (List) this.f40604e.c(aVar);
                boolean[] zArr5 = n30Var.f40313g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f40605f == null) {
                    this.f40605f = a.cb.q(oVar, String.class);
                }
                n30Var.f40308b = (String) this.f40605f.c(aVar);
                boolean[] zArr6 = n30Var.f40313g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new q30(n30Var.f40307a, n30Var.f40308b, n30Var.f40309c, n30Var.f40310d, n30Var.f40311e, n30Var.f40312f, n30Var.f40313g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        List list2;
        Integer num;
        List list3;
        String str;
        String str2;
        q30 q30Var = (q30) obj;
        if (q30Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = q30Var.f41207g;
        int length = zArr.length;
        nm.o oVar = this.f40600a;
        if (length > 0 && zArr[0]) {
            if (this.f40605f == null) {
                this.f40605f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f40605f;
            um.c h10 = cVar.h("id");
            str2 = q30Var.f41201a;
            mVar.e(h10, str2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f40605f == null) {
                this.f40605f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f40605f;
            um.c h13 = cVar.h("node_id");
            str = q30Var.f41202b;
            mVar2.e(h13, str);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f40604e == null) {
                this.f40604e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f40604e;
            um.c h14 = cVar.h("names");
            list3 = q30Var.f41203c;
            mVar3.e(h14, list3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f40601b == null) {
                this.f40601b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f40601b;
            um.c h15 = cVar.h("pin_count");
            num = q30Var.f41204d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f40602c == null) {
                this.f40602c = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f40602c;
            um.c h16 = cVar.h("pin_types");
            list2 = q30Var.f41205e;
            mVar5.e(h16, list2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f40603d == null) {
                this.f40603d = oVar.g(new TypeToken<List<Map<String, sr>>>(this) { // from class: com.pinterest.api.model.PinCluster$PinClusterTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f40603d;
            um.c h17 = cVar.h("thumbnails");
            list = q30Var.f41206f;
            mVar6.e(h17, list);
        }
        cVar.g();
    }
}
