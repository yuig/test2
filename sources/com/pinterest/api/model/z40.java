package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.y40;
import java.util.List;

/* loaded from: classes3.dex */
public final class z40 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44215a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44216b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44217c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44218d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44219e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44220f;

    public z40(nm.o oVar) {
        this.f44215a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        x40 x40Var = new x40(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1915778980:
                    if (k03.equals("reward_messages")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1030695407:
                    if (k03.equals("reward_preview_title")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -916074049:
                    if (k03.equals("reward_preview_subtitle")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -504976737:
                    if (k03.equals("decision_pool")) {
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
                case 3357091:
                    if (k03.equals("mode")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1948985295:
                    if (k03.equals("quiz_path")) {
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
            boolean[] zArr = x40Var.f43589j;
            nm.o oVar = this.f44215a;
            switch (c13) {
                case 0:
                    if (this.f44216b == null) {
                        this.f44216b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinOrSpin$PinOrSpinTypeAdapter$2
                        }).b();
                    }
                    x40Var.f43585f = (List) this.f44216b.c(aVar);
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f44220f == null) {
                        this.f44220f = a.cb.q(oVar, String.class);
                    }
                    x40Var.f43587h = (String) this.f44220f.c(aVar);
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 2:
                    if (this.f44220f == null) {
                        this.f44220f = a.cb.q(oVar, String.class);
                    }
                    x40Var.f43586g = (String) this.f44220f.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 3:
                    if (this.f44217c == null) {
                        this.f44217c = a.cb.q(oVar, e50.class);
                    }
                    x40Var.f43582c = (e50) this.f44217c.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 4:
                    if (this.f44220f == null) {
                        this.f44220f = a.cb.q(oVar, String.class);
                    }
                    x40Var.f43580a = (String) this.f44220f.c(aVar);
                    if (zArr.length <= 0) {
                        break;
                    } else {
                        zArr[0] = true;
                        break;
                    }
                case 5:
                    if (this.f44218d == null) {
                        this.f44218d = a.cb.q(oVar, y40.a.class);
                    }
                    x40Var.f43583d = (y40.a) this.f44218d.c(aVar);
                    if (zArr.length <= 3) {
                        break;
                    } else {
                        zArr[3] = true;
                        break;
                    }
                case 6:
                    if (this.f44220f == null) {
                        this.f44220f = a.cb.q(oVar, String.class);
                    }
                    x40Var.f43588i = (String) this.f44220f.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case 7:
                    if (this.f44219e == null) {
                        this.f44219e = a.cb.q(oVar, m50.class);
                    }
                    x40Var.f43584e = (m50) this.f44219e.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case '\b':
                    if (this.f44220f == null) {
                        this.f44220f = a.cb.q(oVar, String.class);
                    }
                    x40Var.f43581b = (String) this.f44220f.c(aVar);
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new y40(x40Var.f43580a, x40Var.f43581b, x40Var.f43582c, x40Var.f43583d, x40Var.f43584e, x40Var.f43585f, x40Var.f43586g, x40Var.f43587h, x40Var.f43588i, x40Var.f43589j, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        List list;
        m50 m50Var;
        y40.a aVar;
        e50 e50Var;
        String str4;
        String str5;
        y40 y40Var = (y40) obj;
        if (y40Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = y40Var.f43948j;
        int length = zArr.length;
        nm.o oVar = this.f44215a;
        if (length > 0 && zArr[0]) {
            if (this.f44220f == null) {
                this.f44220f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f44220f;
            um.c h10 = cVar.h("id");
            str5 = y40Var.f43939a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44220f == null) {
                this.f44220f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44220f;
            um.c h13 = cVar.h("node_id");
            str4 = y40Var.f43940b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44217c == null) {
                this.f44217c = a.cb.q(oVar, e50.class);
            }
            nm.m mVar3 = this.f44217c;
            um.c h14 = cVar.h("decision_pool");
            e50Var = y40Var.f43941c;
            mVar3.e(h14, e50Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44218d == null) {
                this.f44218d = a.cb.q(oVar, y40.a.class);
            }
            nm.m mVar4 = this.f44218d;
            um.c h15 = cVar.h("mode");
            aVar = y40Var.f43942d;
            mVar4.e(h15, aVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44219e == null) {
                this.f44219e = a.cb.q(oVar, m50.class);
            }
            nm.m mVar5 = this.f44219e;
            um.c h16 = cVar.h("quiz_path");
            m50Var = y40Var.f43943e;
            mVar5.e(h16, m50Var);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44216b == null) {
                this.f44216b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PinOrSpin$PinOrSpinTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f44216b;
            um.c h17 = cVar.h("reward_messages");
            list = y40Var.f43944f;
            mVar6.e(h17, list);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44220f == null) {
                this.f44220f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f44220f;
            um.c h18 = cVar.h("reward_preview_subtitle");
            str3 = y40Var.f43945g;
            mVar7.e(h18, str3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44220f == null) {
                this.f44220f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f44220f;
            um.c h19 = cVar.h("reward_preview_title");
            str2 = y40Var.f43946h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f44220f == null) {
                this.f44220f = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f44220f;
            um.c h23 = cVar.h("title");
            str = y40Var.f43947i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
