package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class bi extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36109a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36110b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36111c;

    public bi(nm.o oVar) {
        this.f36109a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ai aiVar = new ai(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1833163180:
                    if (k03.equals("show_timestamp")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1804482769:
                    if (k03.equals("metadata_text_style")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1606827728:
                    if (k03.equals("show_sections")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1297891331:
                    if (k03.equals("max_title_lines")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -931133568:
                    if (k03.equals("show_pinterest_icon")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -730812174:
                    if (k03.equals("show_owner_and_collaborators_avatars")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -139818213:
                    if (k03.equals("show_update_indicator")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 493989161:
                    if (k03.equals("show_upcoming_update_date_text")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 753107028:
                    if (k03.equals("show_board_topic")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1022835061:
                    if (k03.equals("show_owner_and_collaborators_text")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1343258446:
                    if (k03.equals("covers_style")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1802510115:
                    if (k03.equals("show_pin_count")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36109a;
            switch (c13) {
                case 0:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35758j = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr = aiVar.f35761m;
                    if (zArr.length <= 9) {
                        break;
                    } else {
                        zArr[9] = true;
                        break;
                    }
                case 1:
                    if (this.f36111c == null) {
                        this.f36111c = a.cb.q(oVar, Integer.class);
                    }
                    aiVar.f35751c = (Integer) this.f36111c.c(aVar);
                    boolean[] zArr2 = aiVar.f35761m;
                    if (zArr2.length <= 2) {
                        break;
                    } else {
                        zArr2[2] = true;
                        break;
                    }
                case 2:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35757i = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr3 = aiVar.f35761m;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 3:
                    if (this.f36111c == null) {
                        this.f36111c = a.cb.q(oVar, Integer.class);
                    }
                    aiVar.f35750b = (Integer) this.f36111c.c(aVar);
                    boolean[] zArr4 = aiVar.f35761m;
                    if (zArr4.length <= 1) {
                        break;
                    } else {
                        zArr4[1] = true;
                        break;
                    }
                case 4:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35756h = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr5 = aiVar.f35761m;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35753e = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr6 = aiVar.f35761m;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35760l = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr7 = aiVar.f35761m;
                    if (zArr7.length <= 11) {
                        break;
                    } else {
                        zArr7[11] = true;
                        break;
                    }
                case 7:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35759k = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr8 = aiVar.f35761m;
                    if (zArr8.length <= 10) {
                        break;
                    } else {
                        zArr8[10] = true;
                        break;
                    }
                case '\b':
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35752d = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr9 = aiVar.f35761m;
                    if (zArr9.length <= 3) {
                        break;
                    } else {
                        zArr9[3] = true;
                        break;
                    }
                case '\t':
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35754f = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr10 = aiVar.f35761m;
                    if (zArr10.length <= 5) {
                        break;
                    } else {
                        zArr10[5] = true;
                        break;
                    }
                case '\n':
                    if (this.f36111c == null) {
                        this.f36111c = a.cb.q(oVar, Integer.class);
                    }
                    aiVar.f35749a = (Integer) this.f36111c.c(aVar);
                    boolean[] zArr11 = aiVar.f35761m;
                    if (zArr11.length <= 0) {
                        break;
                    } else {
                        zArr11[0] = true;
                        break;
                    }
                case 11:
                    if (this.f36110b == null) {
                        this.f36110b = a.cb.q(oVar, Boolean.class);
                    }
                    aiVar.f35755g = (Boolean) this.f36110b.c(aVar);
                    boolean[] zArr12 = aiVar.f35761m;
                    if (zArr12.length <= 6) {
                        break;
                    } else {
                        zArr12[6] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new di(aiVar.f35749a, aiVar.f35750b, aiVar.f35751c, aiVar.f35752d, aiVar.f35753e, aiVar.f35754f, aiVar.f35755g, aiVar.f35756h, aiVar.f35757i, aiVar.f35758j, aiVar.f35759k, aiVar.f35760l, aiVar.f35761m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Integer num;
        Integer num2;
        Integer num3;
        di diVar = (di) obj;
        if (diVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = diVar.f36841m;
        int length = zArr.length;
        nm.o oVar = this.f36109a;
        if (length > 0 && zArr[0]) {
            if (this.f36111c == null) {
                this.f36111c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar = this.f36111c;
            um.c h10 = cVar.h("covers_style");
            num3 = diVar.f36829a;
            mVar.e(h10, num3);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36111c == null) {
                this.f36111c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f36111c;
            um.c h13 = cVar.h("max_title_lines");
            num2 = diVar.f36830b;
            mVar2.e(h13, num2);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36111c == null) {
                this.f36111c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar3 = this.f36111c;
            um.c h14 = cVar.h("metadata_text_style");
            num = diVar.f36831c;
            mVar3.e(h14, num);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar4 = this.f36110b;
            um.c h15 = cVar.h("show_board_topic");
            bool9 = diVar.f36832d;
            mVar4.e(h15, bool9);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f36110b;
            um.c h16 = cVar.h("show_owner_and_collaborators_avatars");
            bool8 = diVar.f36833e;
            mVar5.e(h16, bool8);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f36110b;
            um.c h17 = cVar.h("show_owner_and_collaborators_text");
            bool7 = diVar.f36834f;
            mVar6.e(h17, bool7);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f36110b;
            um.c h18 = cVar.h("show_pin_count");
            bool6 = diVar.f36835g;
            mVar7.e(h18, bool6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar8 = this.f36110b;
            um.c h19 = cVar.h("show_pinterest_icon");
            bool5 = diVar.f36836h;
            mVar8.e(h19, bool5);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar9 = this.f36110b;
            um.c h23 = cVar.h("show_sections");
            bool4 = diVar.f36837i;
            mVar9.e(h23, bool4);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar10 = this.f36110b;
            um.c h24 = cVar.h("show_timestamp");
            bool3 = diVar.f36838j;
            mVar10.e(h24, bool3);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar11 = this.f36110b;
            um.c h25 = cVar.h("show_upcoming_update_date_text");
            bool2 = diVar.f36839k;
            mVar11.e(h25, bool2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36110b == null) {
                this.f36110b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar12 = this.f36110b;
            um.c h26 = cVar.h("show_update_indicator");
            bool = diVar.f36840l;
            mVar12.e(h26, bool);
        }
        cVar.g();
    }
}
