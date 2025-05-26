package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i2 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38599a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38600b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38601c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38602d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38603e;

    public i2(nm.o oVar) {
        this.f38599a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        k2 k2Var = new k2(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1496002765:
                    if (k03.equals("creator_analytics")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
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
                case 93908710:
                    if (k03.equals("board")) {
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
            nm.o oVar = this.f38599a;
            if (c13 == 0) {
                if (this.f38601c == null) {
                    this.f38601c = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.AdvertiserBoardFeed$AdvertiserBoardFeedTypeAdapter$3
                    }).b();
                }
                k2Var.f39258d = (Map) this.f38601c.c(aVar);
                boolean[] zArr = k2Var.f39261g;
                if (zArr.length > 3) {
                    zArr[3] = true;
                }
            } else if (c13 == 1) {
                if (this.f38602d == null) {
                    this.f38602d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.AdvertiserBoardFeed$AdvertiserBoardFeedTypeAdapter$4
                    }).b();
                }
                k2Var.f39259e = (Map) this.f38602d.c(aVar);
                boolean[] zArr2 = k2Var.f39261g;
                if (zArr2.length > 4) {
                    zArr2[4] = true;
                }
            } else if (c13 == 2) {
                if (this.f38603e == null) {
                    this.f38603e = a.cb.q(oVar, String.class);
                }
                k2Var.f39255a = (String) this.f38603e.c(aVar);
                boolean[] zArr3 = k2Var.f39261g;
                if (zArr3.length > 0) {
                    zArr3[0] = true;
                }
            } else if (c13 == 3) {
                if (this.f38600b == null) {
                    this.f38600b = a.cb.q(oVar, v7.class);
                }
                k2Var.f39257c = (v7) this.f38600b.c(aVar);
                boolean[] zArr4 = k2Var.f39261g;
                if (zArr4.length > 2) {
                    zArr4[2] = true;
                }
            } else if (c13 == 4) {
                if (this.f38603e == null) {
                    this.f38603e = a.cb.q(oVar, String.class);
                }
                k2Var.f39260f = (String) this.f38603e.c(aVar);
                boolean[] zArr5 = k2Var.f39261g;
                if (zArr5.length > 5) {
                    zArr5[5] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f38603e == null) {
                    this.f38603e = a.cb.q(oVar, String.class);
                }
                k2Var.f39256b = (String) this.f38603e.c(aVar);
                boolean[] zArr6 = k2Var.f39261g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new l2(k2Var.f39255a, k2Var.f39256b, k2Var.f39257c, k2Var.f39258d, k2Var.f39259e, k2Var.f39260f, k2Var.f39261g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Map map;
        Map map2;
        v7 v7Var;
        String str2;
        String str3;
        l2 l2Var = (l2) obj;
        if (l2Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = l2Var.f39626g;
        int length = zArr.length;
        nm.o oVar = this.f38599a;
        if (length > 0 && zArr[0]) {
            if (this.f38603e == null) {
                this.f38603e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38603e;
            um.c h10 = cVar.h("id");
            str3 = l2Var.f39620a;
            mVar.e(h10, str3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38603e == null) {
                this.f38603e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38603e;
            um.c h13 = cVar.h("node_id");
            str2 = l2Var.f39621b;
            mVar2.e(h13, str2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38600b == null) {
                this.f38600b = a.cb.q(oVar, v7.class);
            }
            nm.m mVar3 = this.f38600b;
            um.c h14 = cVar.h("board");
            v7Var = l2Var.f39622c;
            mVar3.e(h14, v7Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38601c == null) {
                this.f38601c = oVar.g(new TypeToken<Map<String, bg>>(this) { // from class: com.pinterest.api.model.AdvertiserBoardFeed$AdvertiserBoardFeedTypeAdapter$1
                }).b();
            }
            nm.m mVar4 = this.f38601c;
            um.c h15 = cVar.h("creator_analytics");
            map2 = l2Var.f39623d;
            mVar4.e(h15, map2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38602d == null) {
                this.f38602d = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.AdvertiserBoardFeed$AdvertiserBoardFeedTypeAdapter$2
                }).b();
            }
            nm.m mVar5 = this.f38602d;
            um.c h16 = cVar.h("images");
            map = l2Var.f39624e;
            mVar5.e(h16, map);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38603e == null) {
                this.f38603e = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f38603e;
            um.c h17 = cVar.h("title");
            str = l2Var.f39625f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
