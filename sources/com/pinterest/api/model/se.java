package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class se extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41859a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41860b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41861c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41862d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41863e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41864f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41865g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41866h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41867i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f41868j;

    public se(nm.o oVar) {
        this.f41859a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        re reVar = new re(0);
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -1603789368:
                    if (k03.equals("read_times_ms")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1299765161:
                    if (k03.equals("emails")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1045119986:
                    if (k03.equals("unread_pins")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -840272977:
                    if (k03.equals("unread")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -697013602:
                    if (k03.equals("cached_email_list")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -156910755:
                    if (k03.equals("read_times")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 111578632:
                    if (k03.equals("users")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case 370949510:
                    if (k03.equals("snooze_time")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case 1107908447:
                    if (k03.equals("pinsub_topic_id")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case 1528054622:
                    if (k03.equals("last_message")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case 1729581227:
                    if (k03.equals("cached_users")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case 1868130240:
                    if (k03.equals("is_eligible_for_threads")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = 15;
                        break;
                    }
                    break;
            }
            boolean[] zArr = reVar.f41573q;
            nm.o oVar = this.f41859a;
            switch (c13) {
                case 0:
                    if (this.f41866h == null) {
                        this.f41866h = oVar.g(new TypeToken<Map<String, Double>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$11
                        }).b();
                    }
                    reVar.f((Map) this.f41866h.c(aVar));
                    break;
                case 1:
                    if (this.f41863e == null) {
                        this.f41863e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$9
                        }).b();
                    }
                    reVar.d((List) this.f41863e.c(aVar));
                    break;
                case 2:
                    if (this.f41862d == null) {
                        this.f41862d = a.cb.q(oVar, Integer.class);
                    }
                    reVar.f41571o = (Integer) this.f41862d.c(aVar);
                    if (zArr.length <= 14) {
                        break;
                    } else {
                        zArr[14] = true;
                        break;
                    }
                case 3:
                    if (this.f41862d == null) {
                        this.f41862d = a.cb.q(oVar, Integer.class);
                    }
                    reVar.f41570n = (Integer) this.f41862d.c(aVar);
                    boolean[] zArr2 = reVar.f41573q;
                    if (zArr2.length <= 13) {
                        break;
                    } else {
                        zArr2[13] = true;
                        break;
                    }
                case 4:
                    if (this.f41863e == null) {
                        this.f41863e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$7
                        }).b();
                    }
                    reVar.f41559c = (List) this.f41863e.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 5:
                    if (this.f41865g == null) {
                        this.f41865g = oVar.g(new TypeToken<Map<String, Date>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$10
                        }).b();
                    }
                    reVar.f41567k = (Map) this.f41865g.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case 6:
                    if (this.f41868j == null) {
                        this.f41868j = a.cb.q(oVar, String.class);
                    }
                    reVar.f41557a = (String) this.f41868j.c(aVar);
                    boolean[] zArr3 = reVar.f41573q;
                    if (zArr3.length <= 0) {
                        break;
                    } else {
                        zArr3[0] = true;
                        break;
                    }
                case 7:
                    if (this.f41868j == null) {
                        this.f41868j = a.cb.q(oVar, String.class);
                    }
                    reVar.f41565i = (String) this.f41868j.c(aVar);
                    if (zArr.length <= 8) {
                        break;
                    } else {
                        zArr[8] = true;
                        break;
                    }
                case '\b':
                    if (this.f41864f == null) {
                        this.f41864f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$12
                        }).b();
                    }
                    reVar.g((List) this.f41864f.c(aVar));
                    break;
                case '\t':
                    if (this.f41862d == null) {
                        this.f41862d = a.cb.q(oVar, Integer.class);
                    }
                    reVar.f41569m = (Integer) this.f41862d.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case '\n':
                    if (this.f41868j == null) {
                        this.f41868j = a.cb.q(oVar, String.class);
                    }
                    reVar.f41566j = (String) this.f41868j.c(aVar);
                    boolean[] zArr4 = reVar.f41573q;
                    if (zArr4.length <= 9) {
                        break;
                    } else {
                        zArr4[9] = true;
                        break;
                    }
                case 11:
                    if (this.f41861c == null) {
                        this.f41861c = a.cb.q(oVar, Date.class);
                    }
                    reVar.f41561e = (Date) this.f41861c.c(aVar);
                    if (zArr.length <= 4) {
                        break;
                    } else {
                        zArr[4] = true;
                        break;
                    }
                case '\f':
                    if (this.f41867i == null) {
                        this.f41867i = a.cb.q(oVar, mv.class);
                    }
                    reVar.e((mv) this.f41867i.c(aVar));
                    break;
                case '\r':
                    if (this.f41864f == null) {
                        this.f41864f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$8
                        }).b();
                    }
                    reVar.c((List) this.f41864f.c(aVar));
                    break;
                case 14:
                    if (this.f41860b == null) {
                        this.f41860b = a.cb.q(oVar, Boolean.class);
                    }
                    reVar.f41563g = (Boolean) this.f41860b.c(aVar);
                    boolean[] zArr5 = reVar.f41573q;
                    if (zArr5.length <= 6) {
                        break;
                    } else {
                        zArr5[6] = true;
                        break;
                    }
                case 15:
                    if (this.f41868j == null) {
                        this.f41868j = a.cb.q(oVar, String.class);
                    }
                    reVar.f41558b = (String) this.f41868j.c(aVar);
                    boolean[] zArr6 = reVar.f41573q;
                    if (zArr6.length <= 1) {
                        break;
                    } else {
                        zArr6[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return reVar.a();
    }

    @Override // nm.i0
    public final void e(um.c cVar, Object obj) {
        List list;
        Integer num;
        Integer num2;
        Integer num3;
        Map map;
        Map map2;
        String str;
        String str2;
        mv mvVar;
        Boolean bool;
        List list2;
        Date date;
        List list3;
        List list4;
        String str3;
        String str4;
        ue ueVar = (ue) obj;
        if (ueVar == null) {
            cVar.m();
            return;
        }
        cVar.d();
        boolean[] zArr = ueVar.f42540q;
        int length = zArr.length;
        nm.o oVar = this.f41859a;
        if (length > 0 && zArr[0]) {
            if (this.f41868j == null) {
                this.f41868j = a.cb.q(oVar, String.class);
            }
            nm.m mVar = this.f41868j;
            um.c h10 = cVar.h("id");
            str4 = ueVar.f42524a;
            mVar.e(h10, str4);
        }
        if (zArr.length > 1 && zArr[1]) {
            if (this.f41868j == null) {
                this.f41868j = a.cb.q(oVar, String.class);
            }
            nm.m mVar2 = this.f41868j;
            um.c h13 = cVar.h("node_id");
            str3 = ueVar.f42525b;
            mVar2.e(h13, str3);
        }
        if (zArr.length > 2 && zArr[2]) {
            if (this.f41863e == null) {
                this.f41863e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$1
                }).b();
            }
            nm.m mVar3 = this.f41863e;
            um.c h14 = cVar.h("cached_email_list");
            list4 = ueVar.f42526c;
            mVar3.e(h14, list4);
        }
        if (zArr.length > 3 && zArr[3]) {
            if (this.f41864f == null) {
                this.f41864f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$2
                }).b();
            }
            nm.m mVar4 = this.f41864f;
            um.c h15 = cVar.h("cached_users");
            list3 = ueVar.f42527d;
            mVar4.e(h15, list3);
        }
        if (zArr.length > 4 && zArr[4]) {
            if (this.f41861c == null) {
                this.f41861c = a.cb.q(oVar, Date.class);
            }
            nm.m mVar5 = this.f41861c;
            um.c h16 = cVar.h("created_at");
            date = ueVar.f42528e;
            mVar5.e(h16, date);
        }
        if (zArr.length > 5 && zArr[5]) {
            if (this.f41863e == null) {
                this.f41863e = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$3
                }).b();
            }
            nm.m mVar6 = this.f41863e;
            um.c h17 = cVar.h("emails");
            list2 = ueVar.f42529f;
            mVar6.e(h17, list2);
        }
        if (zArr.length > 6 && zArr[6]) {
            if (this.f41860b == null) {
                this.f41860b = a.cb.q(oVar, Boolean.class);
            }
            nm.m mVar7 = this.f41860b;
            um.c h18 = cVar.h("is_eligible_for_threads");
            bool = ueVar.f42530g;
            mVar7.e(h18, bool);
        }
        if (zArr.length > 7 && zArr[7]) {
            if (this.f41867i == null) {
                this.f41867i = a.cb.q(oVar, mv.class);
            }
            nm.m mVar8 = this.f41867i;
            um.c h19 = cVar.h("last_message");
            mvVar = ueVar.f42531h;
            mVar8.e(h19, mvVar);
        }
        if (zArr.length > 8 && zArr[8]) {
            if (this.f41868j == null) {
                this.f41868j = a.cb.q(oVar, String.class);
            }
            nm.m mVar9 = this.f41868j;
            um.c h23 = cVar.h("name");
            str2 = ueVar.f42532i;
            mVar9.e(h23, str2);
        }
        if (zArr.length > 9 && zArr[9]) {
            if (this.f41868j == null) {
                this.f41868j = a.cb.q(oVar, String.class);
            }
            nm.m mVar10 = this.f41868j;
            um.c h24 = cVar.h("pinsub_topic_id");
            str = ueVar.f42533j;
            mVar10.e(h24, str);
        }
        if (zArr.length > 10 && zArr[10]) {
            if (this.f41865g == null) {
                this.f41865g = oVar.g(new TypeToken<Map<String, Date>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$4
                }).b();
            }
            nm.m mVar11 = this.f41865g;
            um.c h25 = cVar.h("read_times");
            map2 = ueVar.f42534k;
            mVar11.e(h25, map2);
        }
        if (zArr.length > 11 && zArr[11]) {
            if (this.f41866h == null) {
                this.f41866h = oVar.g(new TypeToken<Map<String, Double>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$5
                }).b();
            }
            nm.m mVar12 = this.f41866h;
            um.c h26 = cVar.h("read_times_ms");
            map = ueVar.f42535l;
            mVar12.e(h26, map);
        }
        if (zArr.length > 12 && zArr[12]) {
            if (this.f41862d == null) {
                this.f41862d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar13 = this.f41862d;
            um.c h27 = cVar.h("snooze_time");
            num3 = ueVar.f42536m;
            mVar13.e(h27, num3);
        }
        if (zArr.length > 13 && zArr[13]) {
            if (this.f41862d == null) {
                this.f41862d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar14 = this.f41862d;
            um.c h28 = cVar.h("unread");
            num2 = ueVar.f42537n;
            mVar14.e(h28, num2);
        }
        if (zArr.length > 14 && zArr[14]) {
            if (this.f41862d == null) {
                this.f41862d = a.cb.q(oVar, Integer.class);
            }
            nm.m mVar15 = this.f41862d;
            um.c h29 = cVar.h("unread_pins");
            num = ueVar.f42538o;
            mVar15.e(h29, num);
        }
        if (zArr.length > 15 && zArr[15]) {
            if (this.f41864f == null) {
                this.f41864f = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Conversation$ConversationTypeAdapter$6
                }).b();
            }
            nm.m mVar16 = this.f41864f;
            um.c h33 = cVar.h("users");
            list = ueVar.f42539p;
            mVar16.e(h33, list);
        }
        cVar.g();
    }
}
