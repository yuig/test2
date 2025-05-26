package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class xq extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f43762a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f43763b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f43764c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f43765d;

    public xq(nm.o oVar) {
        this.f43762a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        wq wqVar = new wq(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2115258507:
                    if (k03.equals("is_color_editable")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2030994180:
                    if (k03.equals("sticker_type")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1195974646:
                    if (k03.equals("should_show_color_picker_after_selection")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -52566561:
                    if (k03.equals("closeup_image_url")) {
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
                case 55527806:
                    if (k03.equals("has_color")) {
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
                case 1615086568:
                    if (k03.equals("display_name")) {
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
            nm.o oVar = this.f43762a;
            switch (c13) {
                case 0:
                    if (this.f43763b == null) {
                        this.f43763b = a.cb.q(oVar, Boolean.class);
                    }
                    wqVar.f43335f = (Boolean) this.f43763b.c(aVar);
                    boolean[] zArr = wqVar.f43339j;
                    if (zArr.length <= 5) {
                        break;
                    } else {
                        zArr[5] = true;
                        break;
                    }
                case 1:
                    if (this.f43764c == null) {
                        this.f43764c = a.cb.q(oVar, Integer.class);
                    }
                    wqVar.f43337h = (Integer) this.f43764c.c(aVar);
                    boolean[] zArr2 = wqVar.f43339j;
                    if (zArr2.length <= 7) {
                        break;
                    } else {
                        zArr2[7] = true;
                        break;
                    }
                case 2:
                    if (this.f43763b == null) {
                        this.f43763b = a.cb.q(oVar, Boolean.class);
                    }
                    wqVar.f43336g = (Boolean) this.f43763b.c(aVar);
                    boolean[] zArr3 = wqVar.f43339j;
                    if (zArr3.length <= 6) {
                        break;
                    } else {
                        zArr3[6] = true;
                        break;
                    }
                case 3:
                    if (this.f43765d == null) {
                        this.f43765d = a.cb.q(oVar, String.class);
                    }
                    wqVar.f43332c = (String) this.f43765d.c(aVar);
                    boolean[] zArr4 = wqVar.f43339j;
                    if (zArr4.length <= 2) {
                        break;
                    } else {
                        zArr4[2] = true;
                        break;
                    }
                case 4:
                    if (this.f43765d == null) {
                        this.f43765d = a.cb.q(oVar, String.class);
                    }
                    wqVar.f43330a = (String) this.f43765d.c(aVar);
                    boolean[] zArr5 = wqVar.f43339j;
                    if (zArr5.length <= 0) {
                        break;
                    } else {
                        zArr5[0] = true;
                        break;
                    }
                case 5:
                    if (this.f43763b == null) {
                        this.f43763b = a.cb.q(oVar, Boolean.class);
                    }
                    wqVar.f43334e = (Boolean) this.f43763b.c(aVar);
                    boolean[] zArr6 = wqVar.f43339j;
                    if (zArr6.length <= 4) {
                        break;
                    } else {
                        zArr6[4] = true;
                        break;
                    }
                case 6:
                    if (this.f43765d == null) {
                        this.f43765d = a.cb.q(oVar, String.class);
                    }
                    wqVar.f43338i = (String) this.f43765d.c(aVar);
                    boolean[] zArr7 = wqVar.f43339j;
                    if (zArr7.length <= 8) {
                        break;
                    } else {
                        zArr7[8] = true;
                        break;
                    }
                case 7:
                    if (this.f43765d == null) {
                        this.f43765d = a.cb.q(oVar, String.class);
                    }
                    wqVar.f43333d = (String) this.f43765d.c(aVar);
                    boolean[] zArr8 = wqVar.f43339j;
                    if (zArr8.length <= 3) {
                        break;
                    } else {
                        zArr8[3] = true;
                        break;
                    }
                case '\b':
                    if (this.f43765d == null) {
                        this.f43765d = a.cb.q(oVar, String.class);
                    }
                    wqVar.f43331b = (String) this.f43765d.c(aVar);
                    boolean[] zArr9 = wqVar.f43339j;
                    if (zArr9.length <= 1) {
                        break;
                    } else {
                        zArr9[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new zq(wqVar.f43330a, wqVar.f43331b, wqVar.f43332c, wqVar.f43333d, wqVar.f43334e, wqVar.f43335f, wqVar.f43336g, wqVar.f43337h, wqVar.f43338i, wqVar.f43339j, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        Integer num;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        String str2;
        String str3;
        String str4;
        String str5;
        zq zqVar = (zq) obj;
        if (zqVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = zqVar.f44412j;
        int length = zArr.length;
        nm.o oVar = this.f43762a;
        if (length > 0 && zArr[0]) {
            if (this.f43765d == null) {
                this.f43765d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f43765d;
            um.c h10 = cVar.h("id");
            str5 = zqVar.f44403a;
            mVar.e(h10, str5);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f43765d == null) {
                this.f43765d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f43765d;
            um.c h13 = cVar.h("node_id");
            str4 = zqVar.f44404b;
            mVar2.e(h13, str4);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f43765d == null) {
                this.f43765d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f43765d;
            um.c h14 = cVar.h("closeup_image_url");
            str3 = zqVar.f44405c;
            mVar3.e(h14, str3);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f43765d == null) {
                this.f43765d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f43765d;
            um.c h15 = cVar.h("display_name");
            str2 = zqVar.f44406d;
            mVar4.e(h15, str2);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f43763b == null) {
                this.f43763b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar5 = this.f43763b;
            um.c h16 = cVar.h("has_color");
            bool3 = zqVar.f44407e;
            mVar5.e(h16, bool3);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f43763b == null) {
                this.f43763b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar6 = this.f43763b;
            um.c h17 = cVar.h("is_color_editable");
            bool2 = zqVar.f44408f;
            mVar6.e(h17, bool2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f43763b == null) {
                this.f43763b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f43763b;
            um.c h18 = cVar.h("should_show_color_picker_after_selection");
            bool = zqVar.f44409g;
            mVar7.e(h18, bool);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f43764c == null) {
                this.f43764c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f43764c;
            um.c h19 = cVar.h("sticker_type");
            num = zqVar.f44410h;
            mVar8.e(h19, num);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f43765d == null) {
                this.f43765d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f43765d;
            um.c h23 = cVar.h("thumbnail_image_url");
            str = zqVar.f44411i;
            mVar9.e(h23, str);
        }
        cVar.g();
    }
}
