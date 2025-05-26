package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;

/* loaded from: classes3.dex */
public final class ad0 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f35703a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f35704b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f35705c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f35706d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f35707e;

    public ad0(nm.o oVar) {
        this.f35703a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        zc0 y13 = cd0.y();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1962773286:
                    if (k03.equals("sensitivity_type")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1768037347:
                    if (k03.equals("detail_page_header_text")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1377264343:
                    if (k03.equals("detail_page_non_removal_example_header")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1356282498:
                    if (k03.equals("detail_page_removal_examples")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1170385640:
                    if (k03.equals("secondary_text")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1114218166:
                    if (k03.equals("primary_text")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -573167971:
                    if (k03.equals("element_type")) {
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
                case 106079:
                    if (k03.equals("key")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 206233520:
                    if (k03.equals("detail_page_non_removal_examples")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 949276611:
                    if (k03.equals("detail_page_additional_text")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1710676239:
                    if (k03.equals("open_web_url")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 2068476023:
                    if (k03.equals("detail_page_removal_example_header")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 2084707044:
                    if (k03.equals("secondary_reasons")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 14;
                        break;
                    }
                    break;
            }
            boolean[] zArr = y13.f44303p;
            nm.o oVar = this.f35703a;
            switch (c13) {
                case 0:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.f44302o = (String) this.f35707e.c(aVar);
                    if (zArr.length <= 14) {
                        break;
                    } else {
                        zArr[14] = true;
                        break;
                    }
                case 1:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.c((String) this.f35707e.c(aVar));
                    break;
                case 2:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.d((String) this.f35707e.c(aVar));
                    break;
                case 3:
                    if (this.f35706d == null) {
                        this.f35706d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$5
                        }).b();
                    }
                    y13.g((List) this.f35706d.c(aVar));
                    break;
                case 4:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.m((String) this.f35707e.c(aVar));
                    break;
                case 5:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.k((String) this.f35707e.c(aVar));
                    break;
                case 6:
                    if (this.f35704b == null) {
                        this.f35704b = a.cb.q(oVar, Integer.class);
                    }
                    y13.h((Integer) this.f35704b.c(aVar));
                    break;
                case 7:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.n((String) this.f35707e.c(aVar));
                    break;
                case '\b':
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.i((String) this.f35707e.c(aVar));
                    break;
                case '\t':
                    if (this.f35706d == null) {
                        this.f35706d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$4
                        }).b();
                    }
                    y13.e((List) this.f35706d.c(aVar));
                    break;
                case '\n':
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.b((String) this.f35707e.c(aVar));
                    break;
                case 11:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.j((String) this.f35707e.c(aVar));
                    break;
                case '\f':
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.f((String) this.f35707e.c(aVar));
                    break;
                case '\r':
                    if (this.f35705c == null) {
                        this.f35705c = oVar.g(new TypeToken<List<kd0>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$6
                        }).b();
                    }
                    y13.l((List) this.f35705c.c(aVar));
                    break;
                case 14:
                    if (this.f35707e == null) {
                        this.f35707e = a.cb.q(oVar, String.class);
                    }
                    y13.f44289b = (String) this.f35707e.c(aVar);
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
        return y13.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        Integer num;
        List list2;
        String str6;
        List list3;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        cd0 cd0Var = (cd0) obj;
        if (cd0Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = cd0Var.f36389p;
        int length = zArr.length;
        nm.o oVar = this.f35703a;
        if (length > 0 && zArr[0]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f35707e;
            um.c h10 = cVar.h("id");
            str11 = cd0Var.f36374a;
            mVar.e(h10, str11);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f35707e;
            um.c h13 = cVar.h("node_id");
            str10 = cd0Var.f36375b;
            mVar2.e(h13, str10);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar3 = this.f35707e;
            um.c h14 = cVar.h("detail_page_additional_text");
            str9 = cd0Var.f36376c;
            mVar3.e(h14, str9);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar4 = this.f35707e;
            um.c h15 = cVar.h("detail_page_header_text");
            str8 = cd0Var.f36377d;
            mVar4.e(h15, str8);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar5 = this.f35707e;
            um.c h16 = cVar.h("detail_page_non_removal_example_header");
            str7 = cd0Var.f36378e;
            mVar5.e(h16, str7);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f35706d == null) {
                this.f35706d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$1
                }).b();
            }
            nm.m mVar6 = this.f35706d;
            um.c h17 = cVar.h("detail_page_non_removal_examples");
            list3 = cd0Var.f36379f;
            mVar6.e(h17, list3);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar7 = this.f35707e;
            um.c h18 = cVar.h("detail_page_removal_example_header");
            str6 = cd0Var.f36380g;
            mVar7.e(h18, str6);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f35706d == null) {
                this.f35706d = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$2
                }).b();
            }
            nm.m mVar8 = this.f35706d;
            um.c h19 = cVar.h("detail_page_removal_examples");
            list2 = cd0Var.f36381h;
            mVar8.e(h19, list2);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f35704b == null) {
                this.f35704b = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar9 = this.f35704b;
            um.c h23 = cVar.h("element_type");
            num = cd0Var.f36382i;
            mVar9.e(h23, num);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f35707e;
            um.c h24 = cVar.h("key");
            str5 = cd0Var.f36383j;
            mVar10.e(h24, str5);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar11 = this.f35707e;
            um.c h25 = cVar.h("open_web_url");
            str4 = cd0Var.f36384k;
            mVar11.e(h25, str4);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f35707e;
            um.c h26 = cVar.h("primary_text");
            str3 = cd0Var.f36385l;
            mVar12.e(h26, str3);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f35705c == null) {
                this.f35705c = oVar.g(new TypeToken<List<kd0>>(this) { // from class: com.pinterest.api.model.ReportReason$ReportReasonTypeAdapter$3
                }).b();
            }
            nm.m mVar13 = this.f35705c;
            um.c h27 = cVar.h("secondary_reasons");
            list = cd0Var.f36386m;
            mVar13.e(h27, list);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar14 = this.f35707e;
            um.c h28 = cVar.h("secondary_text");
            str2 = cd0Var.f36387n;
            mVar14.e(h28, str2);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f35707e == null) {
                this.f35707e = a.cb.q(oVar, String.class);
            }
            nm.m mVar15 = this.f35707e;
            um.c h29 = cVar.h("sensitivity_type");
            str = cd0Var.f36388o;
            mVar15.e(h29, str);
        }
        cVar.g();
    }
}
