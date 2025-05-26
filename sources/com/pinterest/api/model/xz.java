package com.pinterest.api.model;

import com.pinterest.api.model.wz;
import java.util.Date;

/* loaded from: classes.dex */
public final class xz extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43851a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43852b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43853c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43854d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f43855e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f43856f;

    public xz(nm.o oVar) {
        this.f43851a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        vz vzVar = new vz(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1645973177:
                    if (k03.equals("standard_price")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1395113590:
                    if (k03.equals("sale_end_date")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1119116623:
                    if (k03.equals("amazon_3p_percentage_off")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -861311717:
                    if (k03.equals("condition")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -714345910:
                    if (k03.equals("percentage_off")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -237166930:
                    if (k03.equals("max_price")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -17811588:
                    if (k03.equals("in_stock")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 106934601:
                    if (k03.equals("price")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 535311644:
                    if (k03.equals("min_price")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1997542747:
                    if (k03.equals("availability")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2114569315:
                    if (k03.equals("sale_start_date")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f43851a;
            switch (c13) {
                case 0:
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.f43112l = (String) this.f43856f.c(aVar);
                    boolean[] zArr = vzVar.f43113m;
                    if (zArr.length <= 11) {
                        break;
                    } else {
                        zArr[11] = true;
                        break;
                    }
                case 1:
                    if (this.f43853c == null) {
                        this.f43853c = a.cb.q(oVar, Date.class);
                    }
                    vzVar.d((Date) this.f43853c.c(aVar));
                    break;
                case 2:
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.a((String) this.f43856f.c(aVar));
                    break;
                case 3:
                    if (this.f43855e == null) {
                        this.f43855e = a.cb.q(oVar, wz.b.class);
                    }
                    vzVar.f43103c = (wz.b) this.f43855e.c(aVar);
                    boolean[] zArr2 = vzVar.f43113m;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 4:
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.f43108h = (String) this.f43856f.c(aVar);
                    boolean[] zArr3 = vzVar.f43113m;
                    if (zArr3.length <= 7) {
                        break;
                    } else {
                        zArr3[7] = true;
                        break;
                    }
                case 5:
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.b((String) this.f43856f.c(aVar));
                    break;
                case 6:
                    if (this.f43852b == null) {
                        this.f43852b = a.cb.q(oVar, Boolean.class);
                    }
                    vzVar.f43105e = (Boolean) this.f43852b.c(aVar);
                    boolean[] zArr4 = vzVar.f43113m;
                    if (zArr4.length <= 4) {
                        break;
                    } else {
                        zArr4[4] = true;
                        break;
                    }
                case 7:
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.f43104d = (String) this.f43856f.c(aVar);
                    boolean[] zArr5 = vzVar.f43113m;
                    if (zArr5.length <= 3) {
                        break;
                    } else {
                        zArr5[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.f43109i = (String) this.f43856f.c(aVar);
                    boolean[] zArr6 = vzVar.f43113m;
                    if (zArr6.length <= 8) {
                        break;
                    } else {
                        zArr6[8] = true;
                        break;
                    }
                case '\t':
                    if (this.f43856f == null) {
                        this.f43856f = a.cb.q(oVar, String.class);
                    }
                    vzVar.c((String) this.f43856f.c(aVar));
                    break;
                case '\n':
                    if (this.f43854d == null) {
                        this.f43854d = a.cb.q(oVar, wz.a.class);
                    }
                    vzVar.f43102b = (wz.a) this.f43854d.c(aVar);
                    boolean[] zArr7 = vzVar.f43113m;
                    if (zArr7.length <= 1) {
                        break;
                    } else {
                        zArr7[1] = true;
                        break;
                    }
                case 11:
                    if (this.f43853c == null) {
                        this.f43853c = a.cb.q(oVar, Date.class);
                    }
                    vzVar.e((Date) this.f43853c.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new wz(vzVar.f43101a, vzVar.f43102b, vzVar.f43103c, vzVar.f43104d, vzVar.f43105e, vzVar.f43106f, vzVar.f43107g, vzVar.f43108h, vzVar.f43109i, vzVar.f43110j, vzVar.f43111k, vzVar.f43112l, vzVar.f43113m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Date date;
        Date date2;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        String str6;
        wz.b bVar;
        wz.a aVar;
        String str7;
        wz wzVar = (wz) obj;
        if (wzVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = wzVar.f43514m;
        int length = zArr.length;
        nm.o oVar = this.f43851a;
        if (length > 0 && zArr[0]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43856f;
            um.c h10 = cVar.h("amazon_3p_percentage_off");
            str7 = wzVar.f43502a;
            mVar.e(h10, str7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43854d == null) {
                this.f43854d = a.cb.q(oVar, wz.a.class);
            }
            nm.m mVar2 = this.f43854d;
            um.c h13 = cVar.h("availability");
            aVar = wzVar.f43503b;
            mVar2.e(h13, aVar);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43855e == null) {
                this.f43855e = a.cb.q(oVar, wz.b.class);
            }
            nm.m mVar3 = this.f43855e;
            um.c h14 = cVar.h("condition");
            bVar = wzVar.f43504c;
            mVar3.e(h14, bVar);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43856f;
            um.c h15 = cVar.h("id");
            str6 = wzVar.f43505d;
            mVar4.e(h15, str6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43852b == null) {
                this.f43852b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f43852b;
            um.c h16 = cVar.h("in_stock");
            bool = wzVar.f43506e;
            mVar5.e(h16, bool);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f43856f;
            um.c h17 = cVar.h("max_price");
            str5 = wzVar.f43507f;
            mVar6.e(h17, str5);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f43856f;
            um.c h18 = cVar.h("min_price");
            str4 = wzVar.f43508g;
            mVar7.e(h18, str4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f43856f;
            um.c h19 = cVar.h("percentage_off");
            str3 = wzVar.f43509h;
            mVar8.e(h19, str3);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f43856f;
            um.c h23 = cVar.h("price");
            str2 = wzVar.f43510i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f43853c == null) {
                this.f43853c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar10 = this.f43853c;
            um.c h24 = cVar.h("sale_end_date");
            date2 = wzVar.f43511j;
            mVar10.e(h24, date2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f43853c == null) {
                this.f43853c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar11 = this.f43853c;
            um.c h25 = cVar.h("sale_start_date");
            date = wzVar.f43512k;
            mVar11.e(h25, date);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f43856f == null) {
                this.f43856f = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f43856f;
            um.c h26 = cVar.h("standard_price");
            str = wzVar.f43513l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
