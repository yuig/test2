package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public final class q6 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41222a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41223b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41224c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41225d;

    public q6(nm.o oVar) {
        this.f41222a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        s6 s6Var = new s6(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -762819939:
                    if (k03.equals("date_published")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -646508472:
                    if (k03.equals("authors")) {
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
                case 3373707:
                    if (k03.equals("name")) {
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
            nm.o oVar = this.f41222a;
            if (c13 == 0) {
                if (this.f41225d == null) {
                    this.f41225d = a.cb.q(oVar, String.class);
                }
                s6Var.f41795e = (String) this.f41225d.c(aVar);
                boolean[] zArr = s6Var.f41797g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f41223b == null) {
                    this.f41223b = a.cb.q(oVar, Date.class);
                }
                s6Var.f41794d = (Date) this.f41223b.c(aVar);
                boolean[] zArr2 = s6Var.f41797g;
                if (zArr2.length > 3) {
                    zArr2[3] = true;
                }
            } else if (c13 == 2) {
                if (this.f41224c == null) {
                    this.f41224c = oVar.g(new TypeToken<List<x20>>(this) { // from class: com.pinterest.api.model.ArticleRichData$ArticleRichDataTypeAdapter$2
                    }).b();
                }
                s6Var.f41793c = (List) this.f41224c.c(aVar);
                boolean[] zArr3 = s6Var.f41797g;
                if (zArr3.length > 2) {
                    zArr3[2] = true;
                }
            } else if (c13 == 3) {
                if (this.f41225d == null) {
                    this.f41225d = a.cb.q(oVar, String.class);
                }
                s6Var.f41791a = (String) this.f41225d.c(aVar);
                boolean[] zArr4 = s6Var.f41797g;
                if (zArr4.length > 0) {
                    zArr4[0] = true;
                }
            } else if (c13 == 4) {
                if (this.f41225d == null) {
                    this.f41225d = a.cb.q(oVar, String.class);
                }
                s6Var.f41796f = (String) this.f41225d.c(aVar);
                boolean[] zArr5 = s6Var.f41797g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f41225d == null) {
                    this.f41225d = a.cb.q(oVar, String.class);
                }
                s6Var.a((String) this.f41225d.c(aVar));
            }
        }
        aVar.g();
        return new t6(s6Var.f41791a, s6Var.f41792b, s6Var.f41793c, s6Var.f41794d, s6Var.f41795e, s6Var.f41796f, s6Var.f41797g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Date date;
        List list;
        String str3;
        String str4;
        t6 t6Var = (t6) obj;
        if (t6Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = t6Var.f42107g;
        int length = zArr.length;
        nm.o oVar = this.f41222a;
        if (length > 0 && zArr[0]) {
            if (this.f41225d == null) {
                this.f41225d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41225d;
            um.c h10 = cVar.h("id");
            str4 = t6Var.f42101a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41225d == null) {
                this.f41225d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41225d;
            um.c h13 = cVar.h("node_id");
            str3 = t6Var.f42102b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41224c == null) {
                this.f41224c = oVar.g(new TypeToken<List<x20>>(this) { // from class: com.pinterest.api.model.ArticleRichData$ArticleRichDataTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41224c;
            um.c h14 = cVar.h("authors");
            list = t6Var.f42103c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41223b == null) {
                this.f41223b = a.cb.q(oVar, Date.class);
            }
            nm.m mVar4 = this.f41223b;
            um.c h15 = cVar.h("date_published");
            date = t6Var.f42104d;
            mVar4.e(h15, date);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41225d == null) {
                this.f41225d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f41225d;
            um.c h16 = cVar.h("description");
            str2 = t6Var.f42105e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41225d == null) {
                this.f41225d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f41225d;
            um.c h17 = cVar.h("name");
            str = t6Var.f42106f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
