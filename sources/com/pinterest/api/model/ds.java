package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ds extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f36931a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f36932b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f36933c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f36934d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f36935e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f36936f;

    public ds(nm.o oVar) {
        this.f36931a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        cs csVar = new cs(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2015407780:
                    if (k03.equals("audience_size")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1744890419:
                    if (k03.equals("device_distribution")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1518771713:
                    if (k03.equals("l1_interest_distribution")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1355996346:
                    if (k03.equals("top_categories")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1290264454:
                    if (k03.equals("interests_distribution")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -763241494:
                    if (k03.equals("metro_distribution")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -529197628:
                    if (k03.equals("age_distribution")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3575610:
                    if (k03.equals("type")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 246884687:
                    if (k03.equals("audience_size_is_upper_bound")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 1070597954:
                    if (k03.equals("gender_distribution")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1613358221:
                    if (k03.equals("country_distribution")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1725067410:
                    if (k03.equals("end_date")) {
                        c13 = 11;
                        break;
                    }
                    break;
            }
            nm.o oVar = this.f36931a;
            switch (c13) {
                case 0:
                    if (this.f36933c == null) {
                        this.f36933c = a.cb.q(oVar, Integer.class);
                    }
                    csVar.f36504b = (Integer) this.f36933c.c(aVar);
                    boolean[] zArr = csVar.f36515m;
                    if (zArr.length <= 1) {
                        break;
                    } else {
                        zArr[1] = true;
                        break;
                    }
                case 1:
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$11
                        }).b();
                    }
                    csVar.f36507e = (List) this.f36934d.c(aVar);
                    boolean[] zArr2 = csVar.f36515m;
                    if (zArr2.length <= 4) {
                        break;
                    } else {
                        zArr2[4] = true;
                        break;
                    }
                case 2:
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$14
                        }).b();
                    }
                    csVar.f36511i = (List) this.f36934d.c(aVar);
                    boolean[] zArr3 = csVar.f36515m;
                    if (zArr3.length <= 8) {
                        break;
                    } else {
                        zArr3[8] = true;
                        break;
                    }
                case 3:
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$16
                        }).b();
                    }
                    csVar.f36513k = (List) this.f36934d.c(aVar);
                    boolean[] zArr4 = csVar.f36515m;
                    if (zArr4.length <= 10) {
                        break;
                    } else {
                        zArr4[10] = true;
                        break;
                    }
                case 4:
                    if (this.f36935e == null) {
                        this.f36935e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$13
                        }).b();
                    }
                    csVar.f36510h = (Map) this.f36935e.c(aVar);
                    boolean[] zArr5 = csVar.f36515m;
                    if (zArr5.length <= 7) {
                        break;
                    } else {
                        zArr5[7] = true;
                        break;
                    }
                case 5:
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$15
                        }).b();
                    }
                    csVar.f36512j = (List) this.f36934d.c(aVar);
                    boolean[] zArr6 = csVar.f36515m;
                    if (zArr6.length <= 9) {
                        break;
                    } else {
                        zArr6[9] = true;
                        break;
                    }
                case 6:
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$9
                        }).b();
                    }
                    csVar.f36503a = (List) this.f36934d.c(aVar);
                    boolean[] zArr7 = csVar.f36515m;
                    if (zArr7.length <= 0) {
                        break;
                    } else {
                        zArr7[0] = true;
                        break;
                    }
                case 7:
                    if (this.f36936f == null) {
                        this.f36936f = a.cb.q(oVar, String.class);
                    }
                    csVar.f36514l = (String) this.f36936f.c(aVar);
                    boolean[] zArr8 = csVar.f36515m;
                    if (zArr8.length <= 11) {
                        break;
                    } else {
                        zArr8[11] = true;
                        break;
                    }
                case '\b':
                    if (this.f36932b == null) {
                        this.f36932b = a.cb.q(oVar, Boolean.class);
                    }
                    csVar.f36505c = (Boolean) this.f36932b.c(aVar);
                    boolean[] zArr9 = csVar.f36515m;
                    if (zArr9.length <= 2) {
                        break;
                    } else {
                        zArr9[2] = true;
                        break;
                    }
                case '\t':
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$12
                        }).b();
                    }
                    csVar.f36509g = (List) this.f36934d.c(aVar);
                    boolean[] zArr10 = csVar.f36515m;
                    if (zArr10.length <= 6) {
                        break;
                    } else {
                        zArr10[6] = true;
                        break;
                    }
                case '\n':
                    if (this.f36934d == null) {
                        this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$10
                        }).b();
                    }
                    csVar.f36506d = (List) this.f36934d.c(aVar);
                    boolean[] zArr11 = csVar.f36515m;
                    if (zArr11.length <= 3) {
                        break;
                    } else {
                        zArr11[3] = true;
                        break;
                    }
                case 11:
                    if (this.f36936f == null) {
                        this.f36936f = a.cb.q(oVar, String.class);
                    }
                    csVar.f36508f = (String) this.f36936f.c(aVar);
                    boolean[] zArr12 = csVar.f36515m;
                    if (zArr12.length <= 5) {
                        break;
                    } else {
                        zArr12[5] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return new fs(csVar.f36503a, csVar.f36504b, csVar.f36505c, csVar.f36506d, csVar.f36507e, csVar.f36508f, csVar.f36509g, csVar.f36510h, csVar.f36511i, csVar.f36512j, csVar.f36513k, csVar.f36514l, csVar.f36515m, 0);
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        String str;
        List list;
        List list2;
        List list3;
        Map map;
        List list4;
        String str2;
        List list5;
        List list6;
        Boolean bool;
        Integer num;
        List list7;
        fs fsVar = (fs) obj;
        if (fsVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = fsVar.f37782m;
        int length = zArr.length;
        nm.o oVar = this.f36931a;
        if (length > 0 && zArr[0]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$1
                }).b();
            }
            nm.m mVar = this.f36934d;
            um.c h10 = cVar.h("age_distribution");
            list7 = fsVar.f37770a;
            mVar.e(h10, list7);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f36933c == null) {
                this.f36933c = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar2 = this.f36933c;
            um.c h13 = cVar.h("audience_size");
            num = fsVar.f37771b;
            mVar2.e(h13, num);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f36932b == null) {
                this.f36932b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar3 = this.f36932b;
            um.c h14 = cVar.h("audience_size_is_upper_bound");
            bool = fsVar.f37772c;
            mVar3.e(h14, bool);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f36934d;
            um.c h15 = cVar.h("country_distribution");
            list6 = fsVar.f37773d;
            mVar4.e(h15, list6);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$3
                }).b();
            }
            nm.m mVar5 = this.f36934d;
            um.c h16 = cVar.h("device_distribution");
            list5 = fsVar.f37774e;
            mVar5.e(h16, list5);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f36936f == null) {
                this.f36936f = a.cb.q(oVar, String.class);
            }
            nm.m mVar6 = this.f36936f;
            um.c h17 = cVar.h("end_date");
            str2 = fsVar.f37775f;
            mVar6.e(h17, str2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$4
                }).b();
            }
            nm.m mVar7 = this.f36934d;
            um.c h18 = cVar.h("gender_distribution");
            list4 = fsVar.f37776g;
            mVar7.e(h18, list4);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f36935e == null) {
                this.f36935e = oVar.g(new TypeToken<Map<String, Object>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$5
                }).b();
            }
            nm.m mVar8 = this.f36935e;
            um.c h19 = cVar.h("interests_distribution");
            map = fsVar.f37777h;
            mVar8.e(h19, map);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$6
                }).b();
            }
            nm.m mVar9 = this.f36934d;
            um.c h23 = cVar.h("l1_interest_distribution");
            list3 = fsVar.f37778i;
            mVar9.e(h23, list3);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$7
                }).b();
            }
            nm.m mVar10 = this.f36934d;
            um.c h24 = cVar.h("metro_distribution");
            list2 = fsVar.f37779j;
            mVar10.e(h24, list2);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f36934d == null) {
                this.f36934d = oVar.g(new TypeToken<List<bs>>(this) { // from class: com.pinterest.api.model.InsightsAudienceMetrics$InsightsAudienceMetricsTypeAdapter$8
                }).b();
            }
            nm.m mVar11 = this.f36934d;
            um.c h25 = cVar.h("top_categories");
            list = fsVar.f37780k;
            mVar11.e(h25, list);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f36936f == null) {
                this.f36936f = a.cb.q(oVar, String.class);
            }
            nm.m mVar12 = this.f36936f;
            um.c h26 = cVar.h("type");
            str = fsVar.f37781l;
            mVar12.e(h26, str);
        }
        cVar.g();
    }
}
