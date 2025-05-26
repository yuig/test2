package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class yg extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44047a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44048b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44049c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44050d;

    public yg(nm.o oVar) {
        this.f44047a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xg xgVar = new xg(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -823812830:
                    if (k03.equals("values")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -236959117:
                    if (k03.equals("dimension_type")) {
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
                case 3373707:
                    if (k03.equals("name")) {
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
            nm.o oVar = this.f44047a;
            if (c13 == 0) {
                if (this.f44049c == null) {
                    this.f44049c = oVar.g(new TypeToken<List<Object>>(this) { // from class: com.pinterest.api.model.DimensionMetadata$DimensionMetadataTypeAdapter$2
                    }).b();
                }
                xgVar.f43680e = (List) this.f44049c.c(aVar);
                boolean[] zArr = xgVar.f43681f;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f44048b == null) {
                    this.f44048b = a.cb.q(oVar, Integer.class);
                }
                xgVar.f43678c = (Integer) this.f44048b.c(aVar);
                boolean[] zArr2 = xgVar.f43681f;
                if (zArr2.length > 2) {
                    zArr2[2] = true;
                }
            } else if (c13 == 2) {
                if (this.f44050d == null) {
                    this.f44050d = a.cb.q(oVar, String.class);
                }
                xgVar.f43676a = (String) this.f44050d.c(aVar);
                boolean[] zArr3 = xgVar.f43681f;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f44050d == null) {
                    this.f44050d = a.cb.q(oVar, String.class);
                }
                xgVar.f43679d = (String) this.f44050d.c(aVar);
                boolean[] zArr4 = xgVar.f43681f;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 != 4) {
                aVar.E();
            } else {
                if (this.f44050d == null) {
                    this.f44050d = a.cb.q(oVar, String.class);
                }
                xgVar.f43677b = (String) this.f44050d.c(aVar);
                boolean[] zArr5 = xgVar.f43681f;
                if (zArr5.length > 1) {
                    zArr5[1] = true;
                }
            }
        }
        aVar.g();
        return new ah(xgVar.f43676a, xgVar.f43677b, xgVar.f43678c, xgVar.f43679d, xgVar.f43680e, xgVar.f43681f, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        Integer num;
        String str2;
        String str3;
        ah ahVar = (ah) obj;
        if (ahVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ahVar.f35741f;
        int length = zArr.length;
        nm.o oVar = this.f44047a;
        if (length > 0 && zArr[0]) {
            if (this.f44050d == null) {
                this.f44050d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44050d;
            um.c h10 = cVar.h("id");
            str3 = ahVar.f35736a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44050d == null) {
                this.f44050d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44050d;
            um.c h13 = cVar.h("node_id");
            str2 = ahVar.f35737b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44048b == null) {
                this.f44048b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f44048b;
            um.c h14 = cVar.h("dimension_type");
            num = ahVar.f35738c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44050d == null) {
                this.f44050d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f44050d;
            um.c h15 = cVar.h("name");
            str = ahVar.f35739d;
            mVar4.e(h15, str);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44049c == null) {
                this.f44049c = oVar.g(new TypeToken<List<Object>>(this) { // from class: com.pinterest.api.model.DimensionMetadata$DimensionMetadataTypeAdapter$1
                }).b();
            }
            nm.m mVar5 = this.f44049c;
            um.c h16 = cVar.h("values");
            list = ahVar.f35740e;
            mVar5.e(h16, list);
        }
        cVar.g();
    }
}
