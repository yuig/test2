package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ud extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f42514a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f42515b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f42516c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f42517d;

    public ud(nm.o oVar) {
        this.f42514a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        td tdVar = new td(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2030994180:
                    if (k03.equals("sticker_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -877823861:
                    if (k03.equals("image_url")) {
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
                case 106079:
                    if (k03.equals("key")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 523149226:
                    if (k03.equals("keywords")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 604341972:
                    if (k03.equals("image_signature")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 862817528:
                    if (k03.equals("thumbnail_image_url")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1047385473:
                    if (k03.equals("thumbnail_image_signature")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1615086568:
                    if (k03.equals("display_name")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f42514a;
            switch (c13) {
                case 0:
                    if (this.f42515b == null) {
                        this.f42515b = a.cb.q(oVar, Integer.class);
                    }
                    tdVar.f42173h = (Integer) this.f42515b.c(aVar);
                    boolean[] zArr = tdVar.f42176k;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42170e = (String) this.f42517d.c(aVar);
                    boolean[] zArr2 = tdVar.f42176k;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42166a = (String) this.f42517d.c(aVar);
                    boolean[] zArr3 = tdVar.f42176k;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 3:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42171f = (String) this.f42517d.c(aVar);
                    boolean[] zArr4 = tdVar.f42176k;
                    if (zArr4.length <= 5) {
                        break;
                    } else {
                        zArr4[5] = true;
                        break;
                    }
                case 4:
                    if (this.f42516c == null) {
                        this.f42516c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommentSticker$CommentStickerTypeAdapter$2
                        }).b();
                    }
                    tdVar.f42172g = (List) this.f42516c.c(aVar);
                    boolean[] zArr5 = tdVar.f42176k;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 5:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42169d = (String) this.f42517d.c(aVar);
                    boolean[] zArr6 = tdVar.f42176k;
                    if (zArr6.length <= 3) {
                        break;
                    } else {
                        zArr6[3] = true;
                        break;
                    }
                case 6:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42175j = (String) this.f42517d.c(aVar);
                    boolean[] zArr7 = tdVar.f42176k;
                    if (zArr7.length <= 9) {
                        break;
                    } else {
                        zArr7[9] = true;
                        break;
                    }
                case 7:
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42174i = (String) this.f42517d.c(aVar);
                    boolean[] zArr8 = tdVar.f42176k;
                    if (zArr8.length <= 8) {
                        break;
                    } else {
                        zArr8[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42168c = (String) this.f42517d.c(aVar);
                    boolean[] zArr9 = tdVar.f42176k;
                    if (zArr9.length <= 2) {
                        break;
                    } else {
                        zArr9[2] = true;
                        break;
                    }
                case '\t':
                    if (this.f42517d == null) {
                        this.f42517d = a.cb.q(oVar, String.class);
                    }
                    tdVar.f42167b = (String) this.f42517d.c(aVar);
                    boolean[] zArr10 = tdVar.f42176k;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new wd(tdVar.f42166a, tdVar.f42167b, tdVar.f42168c, tdVar.f42169d, tdVar.f42170e, tdVar.f42171f, tdVar.f42172g, tdVar.f42173h, tdVar.f42174i, tdVar.f42175j, tdVar.f42176k, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        wd wdVar = (wd) obj;
        if (wdVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wdVar.f43229k;
        int length = zArr.length;
        nm.o oVar = this.f42514a;
        if (length > 0 && zArr[0]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f42517d;
            um.c h10 = cVar.h("id");
            str8 = wdVar.f43219a;
            mVar.e(h10, str8);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f42517d;
            um.c h13 = cVar.h("node_id");
            str7 = wdVar.f43220b;
            mVar2.e(h13, str7);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f42517d;
            um.c h14 = cVar.h("display_name");
            str6 = wdVar.f43221c;
            mVar3.e(h14, str6);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f42517d;
            um.c h15 = cVar.h("image_signature");
            str5 = wdVar.f43222d;
            mVar4.e(h15, str5);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f42517d;
            um.c h16 = cVar.h("image_url");
            str4 = wdVar.f43223e;
            mVar5.e(h16, str4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f42517d;
            um.c h17 = cVar.h("key");
            str3 = wdVar.f43224f;
            mVar6.e(h17, str3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f42516c == null) {
                this.f42516c = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.CommentSticker$CommentStickerTypeAdapter$1
                }).b();
            }
            nm.m mVar7 = this.f42516c;
            um.c h18 = cVar.h("keywords");
            list = wdVar.f43225g;
            mVar7.e(h18, list);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f42515b == null) {
                this.f42515b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f42515b;
            um.c h19 = cVar.h("sticker_type");
            num = wdVar.f43226h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f42517d;
            um.c h23 = cVar.h("thumbnail_image_signature");
            str2 = wdVar.f43227i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f42517d == null) {
                this.f42517d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f42517d;
            um.c h24 = cVar.h("thumbnail_image_url");
            str = wdVar.f43228j;
            mVar10.e(h24, str);
        }
        cVar.g();
    }
}
