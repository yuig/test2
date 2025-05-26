package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class jh0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39064a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39065b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39066c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39067d;

    public jh0(nm.o oVar) {
        this.f39064a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ih0 ih0Var = new ih0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -711288647:
                    if (k03.equals("advisory")) {
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
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 1013332736:
                    if (k03.equals("advisory_type")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 1460458597:
                    if (k03.equals("resource_country")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1478300413:
                    if (k03.equals("severity")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 2129347739:
                    if (k03.equals("notices")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            boolean[] zArr = ih0Var.f38792h;
            nm.o oVar = this.f39064a;
            switch (c13) {
                case 0:
                    if (this.f39065b == null) {
                        this.f39065b = a.cb.q(oVar, Integer.class);
                    }
                    ih0Var.f38785a = (Integer) this.f39065b.c(aVar);
                    boolean[] zArr2 = ih0Var.f38792h;
                    if (zArr2.length <= 0) {
                        break;
                    } else {
                        zArr2[0] = true;
                        break;
                    }
                case 1:
                    if (this.f39067d == null) {
                        this.f39067d = a.cb.q(oVar, String.class);
                    }
                    ih0Var.f38787c = (String) this.f39067d.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 2:
                    if (this.f39067d == null) {
                        this.f39067d = a.cb.q(oVar, String.class);
                    }
                    ih0Var.f38791g = (String) this.f39067d.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 3:
                    if (this.f39067d == null) {
                        this.f39067d = a.cb.q(oVar, String.class);
                    }
                    ih0Var.f38786b = (String) this.f39067d.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 4:
                    if (this.f39067d == null) {
                        this.f39067d = a.cb.q(oVar, String.class);
                    }
                    ih0Var.f38789e = (String) this.f39067d.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 5:
                    if (this.f39065b == null) {
                        this.f39065b = a.cb.q(oVar, Integer.class);
                    }
                    ih0Var.f38790f = (Integer) this.f39065b.c(aVar);
                    boolean[] zArr3 = ih0Var.f38792h;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case 6:
                    if (this.f39066c == null) {
                        this.f39066c = oVar.g(new TypeToken<List<ay>>(this) { // from class: com.pinterest.api.model.Sensitivity$SensitivityTypeAdapter$2
                        }).b();
                    }
                    ih0Var.f38788d = (List) this.f39066c.c(aVar);
                    boolean[] zArr4 = ih0Var.f38792h;
                    if (zArr4.length <= 3) {
                        break;
                    } else {
                        zArr4[3] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new lh0(ih0Var.f38785a, ih0Var.f38786b, ih0Var.f38787c, ih0Var.f38788d, ih0Var.f38789e, ih0Var.f38790f, ih0Var.f38791g, ih0Var.f38792h, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        String str2;
        List list;
        String str3;
        String str4;
        Integer num2;
        lh0 lh0Var = (lh0) obj;
        if (lh0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = lh0Var.f39770h;
        int length = zArr.length;
        nm.o oVar = this.f39064a;
        if (length > 0 && zArr[0]) {
            if (this.f39065b == null) {
                this.f39065b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f39065b;
            um.c h10 = cVar.h("advisory");
            num2 = lh0Var.f39763a;
            mVar.e(h10, num2);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39067d == null) {
                this.f39067d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39067d;
            um.c h13 = cVar.h("advisory_type");
            str4 = lh0Var.f39764b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39067d == null) {
                this.f39067d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39067d;
            um.c h14 = cVar.h("id");
            str3 = lh0Var.f39765c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39066c == null) {
                this.f39066c = oVar.g(new TypeToken<List<ay>>(this) { // from class: com.pinterest.api.model.Sensitivity$SensitivityTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f39066c;
            um.c h15 = cVar.h("notices");
            list = lh0Var.f39766d;
            mVar4.e(h15, list);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39067d == null) {
                this.f39067d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39067d;
            um.c h16 = cVar.h("resource_country");
            str2 = lh0Var.f39767e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39065b == null) {
                this.f39065b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f39065b;
            um.c h17 = cVar.h("severity");
            num = lh0Var.f39768f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39067d == null) {
                this.f39067d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39067d;
            um.c h18 = cVar.h("type");
            str = lh0Var.f39769g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
