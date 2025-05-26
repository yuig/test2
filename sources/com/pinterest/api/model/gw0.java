package com.pinterest.api.model;

import com.pinterest.api.model.fw0;

/* loaded from: classes3.dex */
public final class gw0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f38165a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f38166b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f38167c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f38168d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f38169e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f38170f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f38171g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f38172h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f38173i;

    public gw0(nm.o oVar) {
        this.f38165a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ew0 ew0Var = new ew0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1698410561:
                    if (k03.equals("source_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -208974838:
                    if (k03.equals("user_did_it_data")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -84625186:
                    if (k03.equals("source_type")) {
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
                case 110997:
                    if (k03.equals("pin")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 3526267:
                    if (k03.equals("seen")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 55126294:
                    if (k03.equals("timestamp")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 951530617:
                    if (k03.equals("content")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 991427237:
                    if (k03.equals("aggregated_comment")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 2070327504:
                    if (k03.equals("parent_id")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\f';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f38165a;
            switch (c13) {
                case 0:
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37382h = (String) this.f38170f.c(aVar);
                    boolean[] zArr = ew0Var.f37388n;
                    if (zArr.length <= 7) {
                        break;
                    } else {
                        zArr[7] = true;
                        break;
                    }
                case 1:
                    if (this.f38173i == null) {
                        this.f38173i = a.cb.q(oVar, az0.class);
                    }
                    ew0Var.f37387m = (az0) this.f38173i.c(aVar);
                    boolean[] zArr2 = ew0Var.f37388n;
                    if (zArr2.length <= 12) {
                        break;
                    } else {
                        zArr2[12] = true;
                        break;
                    }
                case 2:
                    if (this.f38171g == null) {
                        this.f38171g = a.cb.q(oVar, fw0.a.class);
                    }
                    ew0Var.f37383i = (fw0.a) this.f38171g.c(aVar);
                    boolean[] zArr3 = ew0Var.f37388n;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 3:
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37375a = (String) this.f38170f.c(aVar);
                    boolean[] zArr4 = ew0Var.f37388n;
                    if (zArr4.length <= 0) {
                        break;
                    } else {
                        zArr4[0] = true;
                        break;
                    }
                case 4:
                    if (this.f38169e == null) {
                        this.f38169e = a.cb.q(oVar, f30.class);
                    }
                    ew0Var.f37380f = (f30) this.f38169e.c(aVar);
                    boolean[] zArr5 = ew0Var.f37388n;
                    if (zArr5.length <= 5) {
                        break;
                    } else {
                        zArr5[5] = true;
                        break;
                    }
                case 5:
                    if (this.f38167c == null) {
                        this.f38167c = a.cb.q(oVar, Boolean.class);
                    }
                    ew0Var.f37381g = (Boolean) this.f38167c.c(aVar);
                    boolean[] zArr6 = ew0Var.f37388n;
                    if (zArr6.length <= 6) {
                        break;
                    } else {
                        zArr6[6] = true;
                        break;
                    }
                case 6:
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37385k = (String) this.f38170f.c(aVar);
                    boolean[] zArr7 = ew0Var.f37388n;
                    if (zArr7.length <= 10) {
                        break;
                    } else {
                        zArr7[10] = true;
                        break;
                    }
                case 7:
                    if (this.f38172h == null) {
                        this.f38172h = a.cb.q(oVar, wy0.class);
                    }
                    ew0Var.f37386l = (wy0) this.f38172h.c(aVar);
                    boolean[] zArr8 = ew0Var.f37388n;
                    if (zArr8.length <= 11) {
                        break;
                    } else {
                        zArr8[11] = true;
                        break;
                    }
                case '\b':
                    if (this.f38168d == null) {
                        this.f38168d = a.cb.q(oVar, Integer.class);
                    }
                    ew0Var.f37384j = (Integer) this.f38168d.c(aVar);
                    boolean[] zArr9 = ew0Var.f37388n;
                    if (zArr9.length <= 9) {
                        break;
                    } else {
                        zArr9[9] = true;
                        break;
                    }
                case '\t':
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37378d = (String) this.f38170f.c(aVar);
                    boolean[] zArr10 = ew0Var.f37388n;
                    if (zArr10.length <= 3) {
                        break;
                    } else {
                        zArr10[3] = true;
                        break;
                    }
                case '\n':
                    if (this.f38166b == null) {
                        this.f38166b = a.cb.q(oVar, z2.class);
                    }
                    ew0Var.f37377c = (z2) this.f38166b.c(aVar);
                    boolean[] zArr11 = ew0Var.f37388n;
                    if (zArr11.length <= 2) {
                        break;
                    } else {
                        zArr11[2] = true;
                        break;
                    }
                case 11:
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37379e = (String) this.f38170f.c(aVar);
                    boolean[] zArr12 = ew0Var.f37388n;
                    if (zArr12.length <= 4) {
                        break;
                    } else {
                        zArr12[4] = true;
                        break;
                    }
                case '\f':
                    if (this.f38170f == null) {
                        this.f38170f = a.cb.q(oVar, String.class);
                    }
                    ew0Var.f37376b = (String) this.f38170f.c(aVar);
                    boolean[] zArr13 = ew0Var.f37388n;
                    if (zArr13.length <= 1) {
                        break;
                    } else {
                        zArr13[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return ew0Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        az0 az0Var;
        wy0 wy0Var;
        String str;
        Integer num;
        fw0.a aVar;
        String str2;
        Boolean bool;
        f30 f30Var;
        String str3;
        String str4;
        z2 z2Var;
        String str5;
        String str6;
        fw0 fw0Var = (fw0) obj;
        if (fw0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fw0Var.f37835n;
        int length = zArr.length;
        nm.o oVar = this.f38165a;
        if (length > 0 && zArr[0]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f38170f;
            um.c h10 = cVar.h("id");
            str6 = fw0Var.f37822a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f38170f;
            um.c h13 = cVar.h("node_id");
            str5 = fw0Var.f37823b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f38166b == null) {
                this.f38166b = a.cb.q(oVar, z2.class);
            }
            nm.m mVar3 = this.f38166b;
            um.c h14 = cVar.h("aggregated_comment");
            z2Var = fw0Var.f37824c;
            mVar3.e(h14, z2Var);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f38170f;
            um.c h15 = cVar.h("content");
            str4 = fw0Var.f37825d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f38170f;
            um.c h16 = cVar.h("parent_id");
            str3 = fw0Var.f37826e;
            mVar5.e(h16, str3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f38169e == null) {
                this.f38169e = a.cb.q(oVar, f30.class);
            }
            nm.m mVar6 = this.f38169e;
            um.c h17 = cVar.h("pin");
            f30Var = fw0Var.f37827f;
            mVar6.e(h17, f30Var);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f38167c == null) {
                this.f38167c = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f38167c;
            um.c h18 = cVar.h("seen");
            bool = fw0Var.f37828g;
            mVar7.e(h18, bool);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f38170f;
            um.c h19 = cVar.h("source_id");
            str2 = fw0Var.f37829h;
            mVar8.e(h19, str2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f38171g == null) {
                this.f38171g = a.cb.q(oVar, fw0.a.class);
            }
            nm.m mVar9 = this.f38171g;
            um.c h23 = cVar.h("source_type");
            aVar = fw0Var.f37830i;
            mVar9.e(h23, aVar);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f38168d == null) {
                this.f38168d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar10 = this.f38168d;
            um.c h24 = cVar.h("timestamp");
            num = fw0Var.f37831j;
            mVar10.e(h24, num);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f38170f == null) {
                this.f38170f = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f38170f;
            um.c h25 = cVar.h("type");
            str = fw0Var.f37832k;
            mVar11.e(h25, str);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f38172h == null) {
                this.f38172h = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar12 = this.f38172h;
            um.c h26 = cVar.h("user");
            wy0Var = fw0Var.f37833l;
            mVar12.e(h26, wy0Var);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f38173i == null) {
                this.f38173i = a.cb.q(oVar, az0.class);
            }
            nm.m mVar13 = this.f38173i;
            um.c h27 = cVar.h("user_did_it_data");
            az0Var = fw0Var.f37834m;
            mVar13.e(h27, az0Var);
        }
        cVar.g();
    }
}
