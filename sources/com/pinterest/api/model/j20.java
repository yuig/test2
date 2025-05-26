package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class j20 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38933a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38934b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38935c;

    public j20(nm.o oVar) {
        this.f38933a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        i20 i20Var = new i20(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1082920240:
                    if (k03.equals("cover_image_urls")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -235369287:
                    if (k03.equals("short_description")) {
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
                case 107944136:
                    if (k03.equals("query")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
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
            nm.o oVar = this.f38933a;
            if (c13 == 0) {
                if (this.f38934b == null) {
                    this.f38934b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearSimpleStyle$PearSimpleStyleTypeAdapter$2
                    }).b();
                }
                i20Var.f38606c = (List) this.f38934b.c(aVar);
                boolean[] zArr = i20Var.f38610g;
                if (zArr.length > 2) {
                    zArr[2] = true;
                }
            } else if (c13 == 1) {
                if (this.f38935c == null) {
                    this.f38935c = a.cb.q(oVar, String.class);
                }
                i20Var.f38608e = (String) this.f38935c.c(aVar);
                boolean[] zArr2 = i20Var.f38610g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f38935c == null) {
                    this.f38935c = a.cb.q(oVar, String.class);
                }
                i20Var.f38604a = (String) this.f38935c.c(aVar);
                boolean[] zArr3 = i20Var.f38610g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38935c == null) {
                    this.f38935c = a.cb.q(oVar, String.class);
                }
                i20Var.f38607d = (String) this.f38935c.c(aVar);
                boolean[] zArr4 = i20Var.f38610g;
                if (zArr4.length > 3) {
                    zArr4[3] = true;
                }
            } else if (c13 == 4) {
                if (this.f38935c == null) {
                    this.f38935c = a.cb.q(oVar, String.class);
                }
                i20Var.f38609f = (String) this.f38935c.c(aVar);
                boolean[] zArr5 = i20Var.f38610g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38935c == null) {
                    this.f38935c = a.cb.q(oVar, String.class);
                }
                i20Var.f38605b = (String) this.f38935c.c(aVar);
                boolean[] zArr6 = i20Var.f38610g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new l20(i20Var.f38604a, i20Var.f38605b, i20Var.f38606c, i20Var.f38607d, i20Var.f38608e, i20Var.f38609f, i20Var.f38610g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        String str5;
        l20 l20Var = (l20) obj;
        if (l20Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = l20Var.f39633g;
        int length = zArr.length;
        nm.o oVar = this.f38933a;
        if (length > 0 && zArr[0]) {
            if (this.f38935c == null) {
                this.f38935c = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38935c;
            um.c h10 = cVar.h("id");
            str5 = l20Var.f39627a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38935c == null) {
                this.f38935c = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38935c;
            um.c h13 = cVar.h("node_id");
            str4 = l20Var.f39628b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38934b == null) {
                this.f38934b = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.PearSimpleStyle$PearSimpleStyleTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f38934b;
            um.c h14 = cVar.h("cover_image_urls");
            list = l20Var.f39629c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38935c == null) {
                this.f38935c = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38935c;
            um.c h15 = cVar.h("query");
            str3 = l20Var.f39630d;
            mVar4.e(h15, str3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38935c == null) {
                this.f38935c = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38935c;
            um.c h16 = cVar.h("short_description");
            str2 = l20Var.f39631e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38935c == null) {
                this.f38935c = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38935c;
            um.c h17 = cVar.h("title");
            str = l20Var.f39632f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
