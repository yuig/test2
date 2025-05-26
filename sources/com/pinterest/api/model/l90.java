package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.util.List;

/* loaded from: classes.dex */
public final class l90 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f39674a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f39675b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f39676c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f39677d;

    public l90(nm.o oVar) {
        this.f39674a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        k90 k90Var = new k90(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1883717471:
                    if (k03.equals("pin_promotion_id")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1782234803:
                    if (k03.equals("questions")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1592448404:
                    if (k03.equals("policy_links")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1317736796:
                    if (k03.equals("completion_message")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1115058732:
                    if (k03.equals("headline")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -605411181:
                    if (k03.equals(SbaPinRep.AUXDATA_LEADAD_FORM_ID)) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -127926097:
                    if (k03.equals("advertiser_id")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -85224585:
                    if (k03.equals("ad_group_id")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 50349278:
                    if (k03.equals("lead_id")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 255699120:
                    if (k03.equals("privacy_policy_link")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1122776426:
                    if (k03.equals("disclosure_language")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1617221919:
                    if (k03.equals("advertiser_name")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2083788458:
                    if (k03.equals("campaign_id")) {
                        c13 = '\r';
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f39674a;
            switch (c13) {
                case 0:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.l((String) this.f39677d.c(aVar));
                    break;
                case 1:
                    if (this.f39676c == null) {
                        this.f39676c = oVar.g(new TypeToken<List<v90>>(this) { // from class: com.pinterest.api.model.PromotedLeadForm$PromotedLeadFormTypeAdapter$4
                        }).b();
                    }
                    k90Var.o((List) this.f39676c.c(aVar));
                    break;
                case 2:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.g((String) this.f39677d.c(aVar));
                    break;
                case 3:
                    if (this.f39675b == null) {
                        this.f39675b = oVar.g(new TypeToken<List<r90>>(this) { // from class: com.pinterest.api.model.PromotedLeadForm$PromotedLeadFormTypeAdapter$3
                        }).b();
                    }
                    k90Var.m((List) this.f39675b.c(aVar));
                    break;
                case 4:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.f((String) this.f39677d.c(aVar));
                    break;
                case 5:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.i((String) this.f39677d.c(aVar));
                    break;
                case 6:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.j((String) this.f39677d.c(aVar));
                    break;
                case 7:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.c((String) this.f39677d.c(aVar));
                    break;
                case '\b':
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.b((String) this.f39677d.c(aVar));
                    break;
                case '\t':
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.k((String) this.f39677d.c(aVar));
                    break;
                case '\n':
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.n((String) this.f39677d.c(aVar));
                    break;
                case 11:
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.h((String) this.f39677d.c(aVar));
                    break;
                case '\f':
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.d((String) this.f39677d.c(aVar));
                    break;
                case '\r':
                    if (this.f39677d == null) {
                        this.f39677d = a.cb.q(oVar, String.class);
                    }
                    k90Var.e((String) this.f39677d.c(aVar));
                    break;
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return k90Var.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        String str;
        List list2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        n90 n90Var = (n90) obj;
        if (n90Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = n90Var.f40371o;
        int length = zArr.length;
        nm.o oVar = this.f39674a;
        if (length > 0 && zArr[0]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f39677d;
            um.c h10 = cVar.h("ad_group_id");
            str12 = n90Var.f40357a;
            mVar.e(h10, str12);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f39677d;
            um.c h13 = cVar.h("advertiser_id");
            str11 = n90Var.f40358b;
            mVar2.e(h13, str11);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f39677d;
            um.c h14 = cVar.h("advertiser_name");
            str10 = n90Var.f40359c;
            mVar3.e(h14, str10);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f39677d;
            um.c h15 = cVar.h("campaign_id");
            str9 = n90Var.f40360d;
            mVar4.e(h15, str9);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f39677d;
            um.c h16 = cVar.h("completion_message");
            str8 = n90Var.f40361e;
            mVar5.e(h16, str8);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f39677d;
            um.c h17 = cVar.h("description");
            str7 = n90Var.f40362f;
            mVar6.e(h17, str7);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f39677d;
            um.c h18 = cVar.h("disclosure_language");
            str6 = n90Var.f40363g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar8 = this.f39677d;
            um.c h19 = cVar.h("headline");
            str5 = n90Var.f40364h;
            mVar8.e(h19, str5);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f39677d;
            um.c h23 = cVar.h(SbaPinRep.AUXDATA_LEADAD_FORM_ID);
            str4 = n90Var.f40365i;
            mVar9.e(h23, str4);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f39677d;
            um.c h24 = cVar.h("lead_id");
            str3 = n90Var.f40366j;
            mVar10.e(h24, str3);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f39677d;
            um.c h25 = cVar.h("pin_promotion_id");
            str2 = n90Var.f40367k;
            mVar11.e(h25, str2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f39675b == null) {
                this.f39675b = oVar.g(new TypeToken<List<r90>>(this) { // from class: com.pinterest.api.model.PromotedLeadForm$PromotedLeadFormTypeAdapter$1
                }).b();
            }
            nm.m mVar12 = this.f39675b;
            um.c h26 = cVar.h("policy_links");
            list2 = n90Var.f40368l;
            mVar12.e(h26, list2);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f39677d == null) {
                this.f39677d = a.cb.q(oVar, String.class);
            }
            nm.m mVar13 = this.f39677d;
            um.c h27 = cVar.h("privacy_policy_link");
            str = n90Var.f40369m;
            mVar13.e(h27, str);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f39676c == null) {
                this.f39676c = oVar.g(new TypeToken<List<v90>>(this) { // from class: com.pinterest.api.model.PromotedLeadForm$PromotedLeadFormTypeAdapter$2
                }).b();
            }
            nm.m mVar14 = this.f39676c;
            um.c h28 = cVar.h("questions");
            list = n90Var.f40370n;
            mVar14.e(h28, list);
        }
        cVar.g();
    }
}
