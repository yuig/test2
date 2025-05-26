package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class yx extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f44142a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f44143b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f44144c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f44145d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f44146e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f44147f;

    public yx(nm.o oVar) {
        this.f44142a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        xx xxVar = new xx(0);
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
                case -1442758754:
                    if (k03.equals("image_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1268861541:
                    if (k03.equals("footer")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1161803523:
                    if (k03.equals("actions")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -302374486:
                    if (k03.equals("suggested_resource")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 109780401:
                    if (k03.equals("style")) {
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
                case 1196237893:
                    if (k03.equals("content_image_url")) {
                        c13 = 7;
                        break;
                    }
                    break;
            }
            boolean[] zArr = xxVar.f43826i;
            nm.o oVar = this.f44142a;
            switch (c13) {
                case 0:
                    if (this.f44143b == null) {
                        this.f44143b = a.cb.q(oVar, tm.class);
                    }
                    xxVar.f43820c = (tm) this.f44143b.c(aVar);
                    boolean[] zArr2 = xxVar.f43826i;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 1:
                    if (this.f44144c == null) {
                        this.f44144c = a.cb.q(oVar, Integer.class);
                    }
                    xxVar.f43822e = (Integer) this.f44144c.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case 2:
                    if (this.f44146e == null) {
                        this.f44146e = a.cb.q(oVar, gz.class);
                    }
                    xxVar.f43821d = (gz) this.f44146e.c(aVar);
                    boolean[] zArr3 = xxVar.f43826i;
                    if (zArr3.length <= 3) {
                        break;
                    } else {
                        zArr3[3] = true;
                        break;
                    }
                case 3:
                    if (this.f44145d == null) {
                        this.f44145d = oVar.g(new TypeToken<List<fy>>(this) { // from class: com.pinterest.api.model.Notice$NoticeTypeAdapter$2
                        }).b();
                    }
                    xxVar.f43818a = (List) this.f44145d.c(aVar);
                    boolean[] zArr4 = xxVar.f43826i;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f44147f == null) {
                        this.f44147f = a.cb.q(oVar, String.class);
                    }
                    xxVar.f43824g = (String) this.f44147f.c(aVar);
                    if (zArr.length <= 6) {
                        break;
                    } else {
                        zArr[6] = true;
                        break;
                    }
                case 5:
                    if (this.f44144c == null) {
                        this.f44144c = a.cb.q(oVar, Integer.class);
                    }
                    xxVar.f43823f = (Integer) this.f44144c.c(aVar);
                    boolean[] zArr5 = xxVar.f43826i;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 6:
                    if (this.f44147f == null) {
                        this.f44147f = a.cb.q(oVar, String.class);
                    }
                    xxVar.f43825h = (String) this.f44147f.c(aVar);
                    boolean[] zArr6 = xxVar.f43826i;
                    if (zArr6.length <= 7) {
                        break;
                    } else {
                        zArr6[7] = true;
                        break;
                    }
                case 7:
                    if (this.f44147f == null) {
                        this.f44147f = a.cb.q(oVar, String.class);
                    }
                    xxVar.f43819b = (String) this.f44147f.c(aVar);
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
        return new ay(xxVar.f43818a, xxVar.f43819b, xxVar.f43820c, xxVar.f43821d, xxVar.f43822e, xxVar.f43823f, xxVar.f43824g, xxVar.f43825h, xxVar.f43826i, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        gz gzVar;
        tm tmVar;
        String str3;
        List list;
        ay ayVar = (ay) obj;
        if (ayVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ayVar.f35903i;
        int length = zArr.length;
        nm.o oVar = this.f44142a;
        if (length > 0 && zArr[0]) {
            if (this.f44145d == null) {
                this.f44145d = oVar.g(new TypeToken<List<fy>>(this) { // from class: com.pinterest.api.model.Notice$NoticeTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f44145d;
            um.c h10 = cVar.h("actions");
            list = ayVar.f35895a;
            mVar.e(h10, list);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f44147f == null) {
                this.f44147f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f44147f;
            um.c h13 = cVar.h("content_image_url");
            str3 = ayVar.f35896b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f44143b == null) {
                this.f44143b = a.cb.q(oVar, tm.class);
            }
            nm.m mVar3 = this.f44143b;
            um.c h14 = cVar.h("description");
            tmVar = ayVar.f35897c;
            mVar3.e(h14, tmVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f44146e == null) {
                this.f44146e = a.cb.q(oVar, gz.class);
            }
            nm.m mVar4 = this.f44146e;
            um.c h15 = cVar.h("footer");
            gzVar = ayVar.f35898d;
            mVar4.e(h15, gzVar);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f44144c == null) {
                this.f44144c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f44144c;
            um.c h16 = cVar.h("image_type");
            num2 = ayVar.f35899e;
            mVar5.e(h16, num2);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f44144c == null) {
                this.f44144c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar6 = this.f44144c;
            um.c h17 = cVar.h("style");
            num = ayVar.f35900f;
            mVar6.e(h17, num);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f44147f == null) {
                this.f44147f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f44147f;
            um.c h18 = cVar.h("suggested_resource");
            str2 = ayVar.f35901g;
            mVar7.e(h18, str2);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f44147f == null) {
                this.f44147f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f44147f;
            um.c h19 = cVar.h("title");
            str = ayVar.f35902h;
            mVar8.e(h19, str);
        }
        cVar.g();
    }
}
