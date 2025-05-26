package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.api.model.dk0;
import java.util.Map;

/* loaded from: classes.dex */
public final class ek0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f37283a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f37284b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f37285c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f37286d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f37287e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f37288f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f37289g;

    public ek0(nm.o oVar) {
        this.f37283a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        ck0 ck0Var = new ck0(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1807755978:
                    if (k03.equals("request_params")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1619790295:
                    if (k03.equals("quick_save_icon")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1238668566:
                    if (k03.equals("view_parameter_type")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -234429695:
                    if (k03.equals("pins_display")) {
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
                case 116079:
                    if (k03.equals("url")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3002589:
                    if (k03.equals("args")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3556653:
                    if (k03.equals("text")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 3599307:
                    if (k03.equals("user")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 109780401:
                    if (k03.equals("style")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 661838087:
                    if (k03.equals("landing_page_header_style")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1234800679:
                    if (k03.equals("full_feed_title")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1901043637:
                    if (k03.equals("location")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f37283a;
            switch (c13) {
                case 0:
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.h((String) this.f37288f.c(aVar));
                    break;
                case 1:
                    if (this.f37284b == null) {
                        this.f37284b = a.cb.q(oVar, Integer.class);
                    }
                    ck0Var.g((Integer) this.f37284b.c(aVar));
                    break;
                case 2:
                    if (this.f37284b == null) {
                        this.f37284b = a.cb.q(oVar, Integer.class);
                    }
                    ck0Var.n((Integer) this.f37284b.c(aVar));
                    break;
                case 3:
                    if (this.f37284b == null) {
                        this.f37284b = a.cb.q(oVar, Integer.class);
                    }
                    ck0Var.f((Integer) this.f37284b.c(aVar));
                    break;
                case 4:
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.k((String) this.f37288f.c(aVar));
                    break;
                case 5:
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.l((String) this.f37288f.c(aVar));
                    break;
                case 6:
                    if (this.f37285c == null) {
                        this.f37285c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.StoryAction$StoryActionTypeAdapter$2
                        }).b();
                    }
                    ck0Var.a((Map) this.f37285c.c(aVar));
                    break;
                case 7:
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.j((String) this.f37288f.c(aVar));
                    break;
                case '\b':
                    if (this.f37289g == null) {
                        this.f37289g = a.cb.q(oVar, wy0.class);
                    }
                    ck0Var.m((wy0) this.f37289g.c(aVar));
                    break;
                case '\t':
                    if (this.f37287e == null) {
                        this.f37287e = a.cb.q(oVar, dk0.b.class);
                    }
                    ck0Var.i((dk0.b) this.f37287e.c(aVar));
                    break;
                case '\n':
                    if (this.f37284b == null) {
                        this.f37284b = a.cb.q(oVar, Integer.class);
                    }
                    ck0Var.c((Integer) this.f37284b.c(aVar));
                    break;
                case 11:
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.b((String) this.f37288f.c(aVar));
                    break;
                case '\f':
                    if (this.f37286d == null) {
                        this.f37286d = a.cb.q(oVar, dk0.a.class);
                    }
                    ck0Var.d((dk0.a) this.f37286d.c(aVar));
                    break;
                case '\r':
                    if (this.f37288f == null) {
                        this.f37288f = a.cb.q(oVar, String.class);
                    }
                    ck0Var.e((String) this.f37288f.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new dk0(ck0Var.f36444a, ck0Var.f36445b, ck0Var.f36446c, ck0Var.f36447d, ck0Var.f36448e, ck0Var.f36449f, ck0Var.f36450g, ck0Var.f36451h, ck0Var.f36452i, ck0Var.f36453j, ck0Var.f36454k, ck0Var.f36455l, ck0Var.f36456m, ck0Var.f36457n, ck0Var.f36458o, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        Integer num;
        wy0 wy0Var;
        String str;
        String str2;
        dk0.b bVar;
        String str3;
        Integer num2;
        Integer num3;
        dk0.a aVar;
        Integer num4;
        String str4;
        Map map;
        String str5;
        String str6;
        dk0 dk0Var = (dk0) obj;
        if (dk0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = dk0Var.f36876o;
        int length = zArr.length;
        nm.o oVar = this.f37283a;
        if (length > 0 && zArr[0]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f37288f;
            um.c h10 = cVar.h("id");
            str6 = dk0Var.f36862a;
            mVar.e(h10, str6);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f37288f;
            um.c h13 = cVar.h("node_id");
            str5 = dk0Var.f36863b;
            mVar2.e(h13, str5);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f37285c == null) {
                this.f37285c = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.StoryAction$StoryActionTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f37285c;
            um.c h14 = cVar.h("args");
            map = dk0Var.f36864c;
            mVar3.e(h14, map);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f37288f;
            um.c h15 = cVar.h("full_feed_title");
            str4 = dk0Var.f36865d;
            mVar4.e(h15, str4);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f37284b == null) {
                this.f37284b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar5 = this.f37284b;
            um.c h16 = cVar.h("landing_page_header_style");
            num4 = dk0Var.f36866e;
            mVar5.e(h16, num4);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f37286d == null) {
                this.f37286d = a.cb.q(oVar, dk0.a.class);
            }
            nm.m mVar6 = this.f37286d;
            um.c h17 = cVar.h("location");
            aVar = dk0Var.f36867f;
            mVar6.e(h17, aVar);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f37284b == null) {
                this.f37284b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar7 = this.f37284b;
            um.c h18 = cVar.h("pins_display");
            num3 = dk0Var.f36868g;
            mVar7.e(h18, num3);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f37284b == null) {
                this.f37284b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar8 = this.f37284b;
            um.c h19 = cVar.h("quick_save_icon");
            num2 = dk0Var.f36869h;
            mVar8.e(h19, num2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f37288f;
            um.c h23 = cVar.h("request_params");
            str3 = dk0Var.f36870i;
            mVar9.e(h23, str3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f37287e == null) {
                this.f37287e = a.cb.q(oVar, dk0.b.class);
            }
            nm.m mVar10 = this.f37287e;
            um.c h24 = cVar.h("style");
            bVar = dk0Var.f36871j;
            mVar10.e(h24, bVar);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f37288f;
            um.c h25 = cVar.h("text");
            str2 = dk0Var.f36872k;
            mVar11.e(h25, str2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f37288f == null) {
                this.f37288f = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f37288f;
            um.c h26 = cVar.h("url");
            str = dk0Var.f36873l;
            mVar12.e(h26, str);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f37289g == null) {
                this.f37289g = a.cb.q(oVar, wy0.class);
            }
            nm.m mVar13 = this.f37289g;
            um.c h27 = cVar.h("user");
            wy0Var = dk0Var.f36874m;
            mVar13.e(h27, wy0Var);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f37284b == null) {
                this.f37284b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar14 = this.f37284b;
            um.c h28 = cVar.h("view_parameter_type");
            num = dk0Var.f36875n;
            mVar14.e(h28, num);
        }
        cVar.g();
    }
}
