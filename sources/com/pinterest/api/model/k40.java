package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class k40 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39288a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39289b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39290c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39291d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f39292e;

    public k40(nm.o oVar) {
        this.f39288a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        j40 j40Var = new j40(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -826854053:
                    if (k03.equals("taxonomy_text")) {
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
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 102865796:
                    if (k03.equals("level")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 404417804:
                    if (k03.equals("ancestors_text")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 440240320:
                    if (k03.equals("isFreeformTag")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1053208377:
                    if (k03.equals("taxonomy_minimal_text")) {
                        c13 = 6;
                        break;
                    }
                    break;
            }
            boolean[] zArr = j40Var.f38977h;
            nm.o oVar = this.f39288a;
            switch (c13) {
                case 0:
                    if (this.f39292e == null) {
                        this.f39292e = a.cb.q(oVar, String.class);
                    }
                    j40Var.f38975f = (String) this.f39292e.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f39292e == null) {
                        this.f39292e = a.cb.q(oVar, String.class);
                    }
                    j40Var.f38971b = (String) this.f39292e.c(aVar);
                    boolean[] zArr2 = j40Var.f38977h;
                    if (zArr2.length <= 1) {
                        break;
                    } else {
                        zArr2[1] = true;
                        break;
                    }
                case 2:
                    if (this.f39292e == null) {
                        this.f39292e = a.cb.q(oVar, String.class);
                    }
                    j40Var.c((String) this.f39292e.c(aVar));
                    break;
                case 3:
                    if (this.f39290c == null) {
                        this.f39290c = a.cb.q(oVar, Integer.class);
                    }
                    j40Var.f38973d = (Integer) this.f39290c.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 4:
                    if (this.f39291d == null) {
                        this.f39291d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinInterestTag$PinInterestTagTypeAdapter$2
                        }).b();
                    }
                    j40Var.f38970a = (List) this.f39291d.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 5:
                    if (this.f39289b == null) {
                        this.f39289b = a.cb.q(oVar, Boolean.class);
                    }
                    j40Var.b((Boolean) this.f39289b.c(aVar));
                    break;
                case 6:
                    if (this.f39292e == null) {
                        this.f39292e = a.cb.q(oVar, String.class);
                    }
                    j40Var.f38974e = (String) this.f39292e.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return j40Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        Integer num;
        Boolean bool;
        String str4;
        List list;
        m40 m40Var = (m40) obj;
        if (m40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = m40Var.f39998h;
        int length = zArr.length;
        nm.o oVar = this.f39288a;
        if (length > 0 && zArr[0]) {
            if (this.f39291d == null) {
                this.f39291d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinInterestTag$PinInterestTagTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f39291d;
            um.c h10 = cVar.h("ancestors_text");
            list = m40Var.f39991a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39292e == null) {
                this.f39292e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39292e;
            um.c h13 = cVar.h("id");
            str4 = m40Var.f39992b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39289b == null) {
                this.f39289b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f39289b;
            um.c h14 = cVar.h("isFreeformTag");
            bool = m40Var.f39993c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39290c == null) {
                this.f39290c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar4 = this.f39290c;
            um.c h15 = cVar.h("level");
            num = m40Var.f39994d;
            mVar4.e(h15, num);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39292e == null) {
                this.f39292e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39292e;
            um.c h16 = cVar.h("taxonomy_minimal_text");
            str3 = m40Var.f39995e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39292e == null) {
                this.f39292e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39292e;
            um.c h17 = cVar.h("taxonomy_text");
            str2 = m40Var.f39996f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39292e == null) {
                this.f39292e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39292e;
            um.c h18 = cVar.h("text");
            str = m40Var.f39997g;
            mVar7.e(h18, str);
        }
        cVar.g();
    }
}
