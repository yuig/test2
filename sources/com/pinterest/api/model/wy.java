package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class wy extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43419a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43420b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43421c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43422d;

    public wy(nm.o oVar) {
        this.f43419a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        sy syVar = new sy(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1269097371:
                    if (k03.equals("pinterest_back_button")) {
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
                case 106111499:
                    if (k03.equals("outro")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 110371416:
                    if (k03.equals("title")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 951530617:
                    if (k03.equals("content")) {
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
            nm.o oVar = this.f43419a;
            if (c13 == 0) {
                if (this.f43422d == null) {
                    this.f43422d = a.cb.q(oVar, String.class);
                }
                syVar.f42017e = (String) this.f43422d.c(aVar);
                boolean[] zArr = syVar.f42019g;
                if (zArr.length > 4) {
                    zArr[4] = true;
                }
            } else if (c13 == 1) {
                if (this.f43422d == null) {
                    this.f43422d = a.cb.q(oVar, String.class);
                }
                syVar.f42013a = (String) this.f43422d.c(aVar);
                boolean[] zArr2 = syVar.f42019g;
                if (zArr2.length > 0) {
                    zArr2[0] = true;
                }
            } else if (c13 == 2) {
                if (this.f43421c == null) {
                    this.f43421c = a.cb.q(oVar, cz.class);
                }
                syVar.f42016d = (cz) this.f43421c.c(aVar);
                boolean[] zArr3 = syVar.f42019g;
                if (zArr3.length > 3) {
                    zArr3[3] = true;
                }
            } else if (c13 == 3) {
                if (this.f43422d == null) {
                    this.f43422d = a.cb.q(oVar, String.class);
                }
                syVar.f42018f = (String) this.f43422d.c(aVar);
                boolean[] zArr4 = syVar.f42019g;
                if (zArr4.length > 5) {
                    zArr4[5] = true;
                }
            } else if (c13 == 4) {
                if (this.f43420b == null) {
                    this.f43420b = oVar.g(new TypeToken<List<vy>>(this) { // from class: com.pinterest.api.model.NoticeActionSafetyRoot$NoticeActionSafetyRootTypeAdapter$2
                    }).b();
                }
                syVar.f42015c = (List) this.f43420b.c(aVar);
                boolean[] zArr5 = syVar.f42019g;
                if (zArr5.length > 2) {
                    zArr5[2] = true;
                }
            } else if (c13 != 5) {
                aVar.E();
            } else {
                if (this.f43422d == null) {
                    this.f43422d = a.cb.q(oVar, String.class);
                }
                syVar.f42014b = (String) this.f43422d.c(aVar);
                boolean[] zArr6 = syVar.f42019g;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
            }
        }
        aVar.g();
        return new yy(syVar.f42013a, syVar.f42014b, syVar.f42015c, syVar.f42016d, syVar.f42017e, syVar.f42018f, syVar.f42019g, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        cz czVar;
        List list;
        String str3;
        String str4;
        yy yyVar = (yy) obj;
        if (yyVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = yyVar.f44158g;
        int length = zArr.length;
        nm.o oVar = this.f43419a;
        if (length > 0 && zArr[0]) {
            if (this.f43422d == null) {
                this.f43422d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43422d;
            um.c h10 = cVar.h("id");
            str4 = yyVar.f44152a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43422d == null) {
                this.f43422d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43422d;
            um.c h13 = cVar.h("node_id");
            str3 = yyVar.f44153b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43420b == null) {
                this.f43420b = oVar.g(new TypeToken<List<vy>>(this) { // from class: com.pinterest.api.model.NoticeActionSafetyRoot$NoticeActionSafetyRootTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f43420b;
            um.c h14 = cVar.h("content");
            list = yyVar.f44154c;
            mVar3.e(h14, list);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43421c == null) {
                this.f43421c = a.cb.q(oVar, cz.class);
            }
            nm.m mVar4 = this.f43421c;
            um.c h15 = cVar.h("outro");
            czVar = yyVar.f44155d;
            mVar4.e(h15, czVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43422d == null) {
                this.f43422d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f43422d;
            um.c h16 = cVar.h("pinterest_back_button");
            str2 = yyVar.f44156e;
            mVar5.e(h16, str2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43422d == null) {
                this.f43422d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f43422d;
            um.c h17 = cVar.h("title");
            str = yyVar.f44157f;
            mVar6.e(h17, str);
        }
        cVar.g();
    }
}
