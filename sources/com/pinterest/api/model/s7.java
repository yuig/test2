package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s7 extends nm.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final nm.o f41802a;

    /* renamed from: b, reason: collision with root package name */
    public nm.m f41803b;

    /* renamed from: c, reason: collision with root package name */
    public nm.m f41804c;

    /* renamed from: d, reason: collision with root package name */
    public nm.m f41805d;

    /* renamed from: e, reason: collision with root package name */
    public nm.m f41806e;

    /* renamed from: f, reason: collision with root package name */
    public nm.m f41807f;

    /* renamed from: g, reason: collision with root package name */
    public nm.m f41808g;

    /* renamed from: h, reason: collision with root package name */
    public nm.m f41809h;

    /* renamed from: i, reason: collision with root package name */
    public nm.m f41810i;

    /* renamed from: j, reason: collision with root package name */
    public nm.m f41811j;

    /* renamed from: k, reason: collision with root package name */
    public nm.m f41812k;

    /* renamed from: l, reason: collision with root package name */
    public nm.m f41813l;

    /* renamed from: m, reason: collision with root package name */
    public nm.m f41814m;

    /* renamed from: n, reason: collision with root package name */
    public nm.m f41815n;

    /* renamed from: o, reason: collision with root package name */
    public nm.m f41816o;

    /* renamed from: p, reason: collision with root package name */
    public nm.m f41817p;

    /* renamed from: q, reason: collision with root package name */
    public nm.m f41818q;

    /* renamed from: r, reason: collision with root package name */
    public nm.m f41819r;

    /* renamed from: s, reason: collision with root package name */
    public nm.m f41820s;

    /* renamed from: t, reason: collision with root package name */
    public nm.m f41821t;

    /* renamed from: u, reason: collision with root package name */
    public nm.m f41822u;

    /* renamed from: v, reason: collision with root package name */
    public nm.m f41823v;

    /* renamed from: w, reason: collision with root package name */
    public nm.m f41824w;

    public s7(nm.o oVar) {
        this.f41802a = oVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // nm.i0
    public final Object c(um.a aVar) {
        if (aVar.K() == um.b.NULL) {
            aVar.B1();
            return null;
        }
        u7 x03 = v7.x0();
        aVar.c();
        while (aVar.hasNext()) {
            String k03 = aVar.k0();
            k03.getClass();
            char c13 = 65535;
            switch (k03.hashCode()) {
                case -2107390546:
                    if (k03.equals("follower_count")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -2105104881:
                    if (k03.equals("archived_by_me_at")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -2014985151:
                    if (k03.equals("pin_thumbnail_urls")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1924616156:
                    if (k03.equals("pear_insights_count")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case -1897061412:
                    if (k03.equals("collaborator_permissions_setting")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case -1806370072:
                    if (k03.equals("should_show_more_ideas")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case -1780264834:
                    if (k03.equals("has_fresh_more_ideas_tab")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case -1761671274:
                    if (k03.equals("collaborator_count")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case -1724546052:
                    if (k03.equals("description")) {
                        c13 = '\b';
                        break;
                    }
                    break;
                case -1687851682:
                    if (k03.equals("automagical_board_metadata")) {
                        c13 = '\t';
                        break;
                    }
                    break;
                case -1649467243:
                    if (k03.equals("suggestion_type")) {
                        c13 = '\n';
                        break;
                    }
                    break;
                case -1649256717:
                    if (k03.equals("blocking_actions")) {
                        c13 = 11;
                        break;
                    }
                    break;
                case -1648186991:
                    if (k03.equals("followed_by_me")) {
                        c13 = '\f';
                        break;
                    }
                    break;
                case -1645491506:
                    if (k03.equals("allow_homefeed_recommendations")) {
                        c13 = '\r';
                        break;
                    }
                    break;
                case -1624110951:
                    if (k03.equals("featured_board_metadata")) {
                        c13 = 14;
                        break;
                    }
                    break;
                case -1550701885:
                    if (k03.equals("collaborated_by_me")) {
                        c13 = 15;
                        break;
                    }
                    break;
                case -1541562032:
                    if (k03.equals("is_ads_only")) {
                        c13 = 16;
                        break;
                    }
                    break;
                case -1422950858:
                    if (k03.equals("action")) {
                        c13 = 17;
                        break;
                    }
                    break;
                case -1324371147:
                    if (k03.equals("section_count")) {
                        c13 = 18;
                        break;
                    }
                    break;
                case -1303086019:
                    if (k03.equals("suggestion_title_id")) {
                        c13 = 19;
                        break;
                    }
                    break;
                case -1221270899:
                    if (k03.equals("header")) {
                        c13 = 20;
                        break;
                    }
                    break;
                case -1185250696:
                    if (k03.equals("images")) {
                        c13 = 21;
                        break;
                    }
                    break;
                case -1127621238:
                    if (k03.equals("recommendation_reason")) {
                        c13 = 22;
                        break;
                    }
                    break;
                case -1109722326:
                    if (k03.equals("layout")) {
                        c13 = 23;
                        break;
                    }
                    break;
                case -885823029:
                    if (k03.equals("collaborator_permissions")) {
                        c13 = 24;
                        break;
                    }
                    break;
                case -859098029:
                    if (k03.equals("collaborator_invites_enabled")) {
                        c13 = 25;
                        break;
                    }
                    break;
                case -853875768:
                    if (k03.equals("eligible_pin_type_filters")) {
                        c13 = 26;
                        break;
                    }
                    break;
                case -806975296:
                    if (k03.equals("is_collaborative")) {
                        c13 = 27;
                        break;
                    }
                    break;
                case -797665304:
                    if (k03.equals("collaborating_users")) {
                        c13 = 28;
                        break;
                    }
                    break;
                case -783368692:
                    if (k03.equals("sensitivity_screen")) {
                        c13 = 29;
                        break;
                    }
                    break;
                case -749958418:
                    if (k03.equals("has_custom_cover")) {
                        c13 = 30;
                        break;
                    }
                    break;
                case -604167707:
                    if (k03.equals("pin_count")) {
                        c13 = 31;
                        break;
                    }
                    break;
                case -545144509:
                    if (k03.equals("viewer_contact_request")) {
                        c13 = ' ';
                        break;
                    }
                    break;
                case -435507117:
                    if (k03.equals("has_new_activity")) {
                        c13 = '!';
                        break;
                    }
                    break;
                case -376506666:
                    if (k03.equals("featured_in")) {
                        c13 = '\"';
                        break;
                    }
                    break;
                case -314498168:
                    if (k03.equals("privacy")) {
                        c13 = '#';
                        break;
                    }
                    break;
                case -150011881:
                    if (k03.equals("is_featured_for_active_campaign")) {
                        c13 = '$';
                        break;
                    }
                    break;
                case -94753778:
                    if (k03.equals("tracking_params")) {
                        c13 = '%';
                        break;
                    }
                    break;
                case -67594391:
                    if (k03.equals("subscribed_to_notifications")) {
                        c13 = '&';
                        break;
                    }
                    break;
                case 3355:
                    if (k03.equals("id")) {
                        c13 = '\'';
                        break;
                    }
                    break;
                case 116079:
                    if (k03.equals("url")) {
                        c13 = '(';
                        break;
                    }
                    break;
                case 3373707:
                    if (k03.equals("name")) {
                        c13 = ')';
                        break;
                    }
                    break;
                case 3938544:
                    if (k03.equals("is_eligible_for_seasonal_share_treatment")) {
                        c13 = '*';
                        break;
                    }
                    break;
                case 50511102:
                    if (k03.equals("category")) {
                        c13 = '+';
                        break;
                    }
                    break;
                case 106164915:
                    if (k03.equals("owner")) {
                        c13 = ',';
                        break;
                    }
                    break;
                case 114395067:
                    if (k03.equals("image_thumbnail_urls")) {
                        c13 = '-';
                        break;
                    }
                    break;
                case 172769189:
                    if (k03.equals("suggestion_confidence")) {
                        c13 = '.';
                        break;
                    }
                    break;
                case 280784824:
                    if (k03.equals("image_thumbnail_url")) {
                        c13 = '/';
                        break;
                    }
                    break;
                case 384437342:
                    if (k03.equals("should_show_board_collaborators")) {
                        c13 = '0';
                        break;
                    }
                    break;
                case 502611593:
                    if (k03.equals("interests")) {
                        c13 = '1';
                        break;
                    }
                    break;
                case 564403871:
                    if (k03.equals("sensitivity")) {
                        c13 = '2';
                        break;
                    }
                    break;
                case 834155333:
                    if (k03.equals("viewer_collaborator_join_requested")) {
                        c13 = '3';
                        break;
                    }
                    break;
                case 898181505:
                    if (k03.equals("board_owner_has_active_ads")) {
                        c13 = '4';
                        break;
                    }
                    break;
                case 930832763:
                    if (k03.equals("board_note_count")) {
                        c13 = '5';
                        break;
                    }
                    break;
                case 1053220864:
                    if (k03.equals("cover_images")) {
                        c13 = '6';
                        break;
                    }
                    break;
                case 1203575007:
                    if (k03.equals("board_order_modified_at")) {
                        c13 = '7';
                        break;
                    }
                    break;
                case 1326577239:
                    if (k03.equals("is_eligible_for_homefeed_tabs")) {
                        c13 = '8';
                        break;
                    }
                    break;
                case 1363423932:
                    if (k03.equals("has_active_ads")) {
                        c13 = '9';
                        break;
                    }
                    break;
                case 1369680106:
                    if (k03.equals("created_at")) {
                        c13 = ':';
                        break;
                    }
                    break;
                case 1427834513:
                    if (k03.equals("should_show_shop_feed")) {
                        c13 = ';';
                        break;
                    }
                    break;
                case 1510834947:
                    if (k03.equals("image_cover_url")) {
                        c13 = '<';
                        break;
                    }
                    break;
                case 1548569823:
                    if (k03.equals("collaborator_requests_enabled")) {
                        c13 = '=';
                        break;
                    }
                    break;
                case 1691049188:
                    if (k03.equals("sectionless_pin_count")) {
                        c13 = '>';
                        break;
                    }
                    break;
                case 1936231832:
                    if (k03.equals("image_cover_hd_url")) {
                        c13 = '?';
                        break;
                    }
                    break;
                case 2114448504:
                    if (k03.equals("node_id")) {
                        c13 = '@';
                        break;
                    }
                    break;
            }
            boolean[] zArr = x03.f42452n0;
            nm.o oVar = this.f41802a;
            switch (c13) {
                case 0:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.r((Integer) this.f41810i.c(aVar));
                    break;
                case 1:
                    if (this.f41807f == null) {
                        this.f41807f = a.cb.q(oVar, Date.class);
                    }
                    x03.c((Date) this.f41807f.c(aVar));
                    break;
                case 2:
                    if (this.f41815n == null) {
                        this.f41815n = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$20
                        }).b();
                    }
                    x03.F((List) this.f41815n.c(aVar));
                    break;
                case 3:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.D((Integer) this.f41810i.c(aVar));
                    break;
                case 4:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.j((Integer) this.f41810i.c(aVar));
                    break;
                case 5:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.K((Boolean) this.f41805d.c(aVar));
                    break;
                case 6:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.t((Boolean) this.f41805d.c(aVar));
                    break;
                case 7:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.f42451n = (Integer) this.f41810i.c(aVar);
                    boolean[] zArr2 = x03.f42452n0;
                    if (zArr2.length <= 13) {
                        break;
                    } else {
                        zArr2[13] = true;
                        break;
                    }
                case '\b':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.m((String) this.f41823v.c(aVar));
                    break;
                case '\t':
                    if (this.f41803b == null) {
                        this.f41803b = a.cb.q(oVar, c7.class);
                    }
                    x03.f42435f = (c7) this.f41803b.c(aVar);
                    boolean[] zArr3 = x03.f42452n0;
                    if (zArr3.length <= 5) {
                        break;
                    } else {
                        zArr3[5] = true;
                        break;
                    }
                case '\n':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.O((String) this.f41823v.c(aVar));
                    break;
                case 11:
                    if (this.f41811j == null) {
                        this.f41811j = oVar.g(new TypeToken<List<lb>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$11
                        }).b();
                    }
                    x03.d((List) this.f41811j.c(aVar));
                    break;
                case '\f':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.q((Boolean) this.f41805d.c(aVar));
                    break;
                case '\r':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.b((Boolean) this.f41805d.c(aVar));
                    break;
                case 14:
                    if (this.f41809h == null) {
                        this.f41809h = a.cb.q(oVar, cl.class);
                    }
                    x03.o((cl) this.f41809h.c(aVar));
                    break;
                case 15:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.g((Boolean) this.f41805d.c(aVar));
                    break;
                case 16:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.L = (Boolean) this.f41805d.c(aVar);
                    if (zArr.length <= 37) {
                        break;
                    } else {
                        zArr[37] = true;
                        break;
                    }
                case 17:
                    if (this.f41822u == null) {
                        this.f41822u = a.cb.q(oVar, dk0.class);
                    }
                    x03.f42429c = (dk0) this.f41822u.c(aVar);
                    if (zArr.length <= 2) {
                        break;
                    } else {
                        zArr[2] = true;
                        break;
                    }
                case 18:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.Y = (Integer) this.f41810i.c(aVar);
                    boolean[] zArr4 = x03.f42452n0;
                    if (zArr4.length <= 50) {
                        break;
                    } else {
                        zArr4[50] = true;
                        break;
                    }
                case 19:
                    if (this.f41808g == null) {
                        this.f41808g = a.cb.q(oVar, Double.class);
                    }
                    x03.N((Double) this.f41808g.c(aVar));
                    break;
                case 20:
                    if (this.f41804c == null) {
                        this.f41804c = a.cb.q(oVar, e8.class);
                    }
                    x03.v((e8) this.f41804c.c(aVar));
                    break;
                case 21:
                    if (this.f41818q == null) {
                        this.f41818q = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$18
                        }).b();
                    }
                    x03.f42424J = (Map) this.f41818q.c(aVar);
                    boolean[] zArr5 = x03.f42452n0;
                    if (zArr5.length <= 35) {
                        break;
                    } else {
                        zArr5[35] = true;
                        break;
                    }
                case 22:
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.G((String) this.f41823v.c(aVar));
                    break;
                case 23:
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.Q = (String) this.f41823v.c(aVar);
                    if (zArr.length <= 42) {
                        break;
                    } else {
                        zArr[42] = true;
                        break;
                    }
                case 24:
                    if (this.f41812k == null) {
                        this.f41812k = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$13
                        }).b();
                    }
                    x03.i((List) this.f41812k.c(aVar));
                    break;
                case 25:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.h((Boolean) this.f41805d.c(aVar));
                    break;
                case 26:
                    if (this.f41814m == null) {
                        this.f41814m = oVar.g(new TypeToken<List<b60>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$15
                        }).b();
                    }
                    x03.n((List) this.f41814m.c(aVar));
                    break;
                case 27:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.M = (Boolean) this.f41805d.c(aVar);
                    if (zArr.length <= 38) {
                        break;
                    } else {
                        zArr[38] = true;
                        break;
                    }
                case 28:
                    if (this.f41816o == null) {
                        this.f41816o = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$12
                        }).b();
                    }
                    x03.f42449m = (List) this.f41816o.c(aVar);
                    if (zArr.length <= 12) {
                        break;
                    } else {
                        zArr[12] = true;
                        break;
                    }
                case 29:
                    if (this.f41821t == null) {
                        this.f41821t = a.cb.q(oVar, ph0.class);
                    }
                    x03.J((ph0) this.f41821t.c(aVar));
                    break;
                case 30:
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.B = (Boolean) this.f41805d.c(aVar);
                    if (zArr.length <= 27) {
                        break;
                    } else {
                        zArr[27] = true;
                        break;
                    }
                case 31:
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.E((Integer) this.f41810i.c(aVar));
                    break;
                case ' ':
                    if (this.f41806e == null) {
                        this.f41806e = a.cb.q(oVar, ke.class);
                    }
                    x03.R((ke) this.f41806e.c(aVar));
                    break;
                case '!':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.u((Boolean) this.f41805d.c(aVar));
                    break;
                case '\"':
                    if (this.f41815n == null) {
                        this.f41815n = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$16
                        }).b();
                    }
                    x03.p((List) this.f41815n.c(aVar));
                    break;
                case '#':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.W = (String) this.f41823v.c(aVar);
                    boolean[] zArr6 = x03.f42452n0;
                    if (zArr6.length <= 48) {
                        break;
                    } else {
                        zArr6[48] = true;
                        break;
                    }
                case '$':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.B((Boolean) this.f41805d.c(aVar));
                    break;
                case '%':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.f42444j0 = (String) this.f41823v.c(aVar);
                    if (zArr.length <= 61) {
                        break;
                    } else {
                        zArr[61] = true;
                        break;
                    }
                case '&':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.L((Boolean) this.f41805d.c(aVar));
                    break;
                case '\'':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.P((String) this.f41823v.c(aVar));
                    break;
                case '(':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.f42446k0 = (String) this.f41823v.c(aVar);
                    if (zArr.length <= 62) {
                        break;
                    } else {
                        zArr[62] = true;
                        break;
                    }
                case ')':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.C((String) this.f41823v.c(aVar));
                    break;
                case '*':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.A((Boolean) this.f41805d.c(aVar));
                    break;
                case '+':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.f42445k = (String) this.f41823v.c(aVar);
                    if (zArr.length <= 10) {
                        break;
                    } else {
                        zArr[10] = true;
                        break;
                    }
                case ',':
                    if (this.f41824w == null) {
                        this.f41824w = a.cb.q(oVar, wy0.class);
                    }
                    x03.S = (wy0) this.f41824w.c(aVar);
                    if (zArr.length <= 44) {
                        break;
                    } else {
                        zArr[44] = true;
                        break;
                    }
                case '-':
                    if (this.f41819r == null) {
                        this.f41819r = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$17
                        }).b();
                    }
                    x03.x((Map) this.f41819r.c(aVar));
                    break;
                case '.':
                    if (this.f41808g == null) {
                        this.f41808g = a.cb.q(oVar, Double.class);
                    }
                    x03.M((Double) this.f41808g.c(aVar));
                    break;
                case '/':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.H = (String) this.f41823v.c(aVar);
                    boolean[] zArr7 = x03.f42452n0;
                    if (zArr7.length <= 33) {
                        break;
                    } else {
                        zArr7[33] = true;
                        break;
                    }
                case '0':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.f42430c0 = (Boolean) this.f41805d.c(aVar);
                    if (zArr.length <= 54) {
                        break;
                    } else {
                        zArr[54] = true;
                        break;
                    }
                case '1':
                    if (this.f41813l == null) {
                        this.f41813l = oVar.g(new TypeToken<List<zs>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$19
                        }).b();
                    }
                    x03.y((List) this.f41813l.c(aVar));
                    break;
                case '2':
                    if (this.f41820s == null) {
                        this.f41820s = a.cb.q(oVar, lh0.class);
                    }
                    x03.I((lh0) this.f41820s.c(aVar));
                    break;
                case '3':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.Q((Boolean) this.f41805d.c(aVar));
                    break;
                case '4':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.f((Boolean) this.f41805d.c(aVar));
                    break;
                case '5':
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.e((Integer) this.f41810i.c(aVar));
                    break;
                case '6':
                    if (this.f41817p == null) {
                        this.f41817p = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$14
                        }).b();
                    }
                    x03.l((Map) this.f41817p.c(aVar));
                    break;
                case '7':
                    if (this.f41807f == null) {
                        this.f41807f = a.cb.q(oVar, Date.class);
                    }
                    x03.f42441i = (Date) this.f41807f.c(aVar);
                    boolean[] zArr8 = x03.f42452n0;
                    if (zArr8.length <= 8) {
                        break;
                    } else {
                        zArr8[8] = true;
                        break;
                    }
                case '8':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.z((Boolean) this.f41805d.c(aVar));
                    break;
                case '9':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.s((Boolean) this.f41805d.c(aVar));
                    break;
                case ':':
                    if (this.f41807f == null) {
                        this.f41807f = a.cb.q(oVar, Date.class);
                    }
                    x03.f42458t = (Date) this.f41807f.c(aVar);
                    if (zArr.length <= 19) {
                        break;
                    } else {
                        zArr[19] = true;
                        break;
                    }
                case ';':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.f42434e0 = (Boolean) this.f41805d.c(aVar);
                    if (zArr.length <= 56) {
                        break;
                    } else {
                        zArr[56] = true;
                        break;
                    }
                case '<':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.G = (String) this.f41823v.c(aVar);
                    boolean[] zArr9 = x03.f42452n0;
                    if (zArr9.length <= 32) {
                        break;
                    } else {
                        zArr9[32] = true;
                        break;
                    }
                case '=':
                    if (this.f41805d == null) {
                        this.f41805d = a.cb.q(oVar, Boolean.class);
                    }
                    x03.k((Boolean) this.f41805d.c(aVar));
                    break;
                case '>':
                    if (this.f41810i == null) {
                        this.f41810i = a.cb.q(oVar, Integer.class);
                    }
                    x03.H((Integer) this.f41810i.c(aVar));
                    break;
                case '?':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.w((String) this.f41823v.c(aVar));
                    break;
                case '@':
                    if (this.f41823v == null) {
                        this.f41823v = a.cb.q(oVar, String.class);
                    }
                    x03.f42427b = (String) this.f41823v.c(aVar);
                    boolean[] zArr10 = x03.f42452n0;
                    if (zArr10.length <= 1) {
                        break;
                    } else {
                        zArr10[1] = true;
                        break;
                    }
                default:
                    aVar.E();
                    break;
            }
        }
        aVar.g();
        return x03.a();
    }

    @Override // nm.i0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void e(um.c cVar, v7 v7Var) {
        boolean[] zArr;
        boolean[] zArr2;
        boolean[] zArr3;
        boolean[] zArr4;
        boolean[] zArr5;
        boolean[] zArr6;
        boolean[] zArr7;
        boolean[] zArr8;
        boolean[] zArr9;
        boolean[] zArr10;
        boolean[] zArr11;
        boolean[] zArr12;
        boolean[] zArr13;
        boolean[] zArr14;
        boolean[] zArr15;
        boolean[] zArr16;
        boolean[] zArr17;
        boolean[] zArr18;
        boolean[] zArr19;
        boolean[] zArr20;
        boolean[] zArr21;
        boolean[] zArr22;
        boolean[] zArr23;
        boolean[] zArr24;
        boolean[] zArr25;
        boolean[] zArr26;
        boolean[] zArr27;
        boolean[] zArr28;
        boolean[] zArr29;
        boolean[] zArr30;
        boolean[] zArr31;
        boolean[] zArr32;
        boolean[] zArr33;
        boolean[] zArr34;
        boolean[] zArr35;
        boolean[] zArr36;
        boolean[] zArr37;
        boolean[] zArr38;
        boolean[] zArr39;
        boolean[] zArr40;
        boolean[] zArr41;
        boolean[] zArr42;
        boolean[] zArr43;
        boolean[] zArr44;
        boolean[] zArr45;
        boolean[] zArr46;
        boolean[] zArr47;
        boolean[] zArr48;
        boolean[] zArr49;
        boolean[] zArr50;
        boolean[] zArr51;
        boolean[] zArr52;
        boolean[] zArr53;
        boolean[] zArr54;
        boolean[] zArr55;
        boolean[] zArr56;
        boolean[] zArr57;
        boolean[] zArr58;
        boolean[] zArr59;
        boolean[] zArr60;
        boolean[] zArr61;
        boolean[] zArr62;
        boolean[] zArr63;
        boolean[] zArr64;
        boolean[] zArr65;
        boolean[] zArr66;
        boolean[] zArr67;
        boolean[] zArr68;
        boolean[] zArr69;
        boolean[] zArr70;
        boolean[] zArr71;
        boolean[] zArr72;
        boolean[] zArr73;
        boolean[] zArr74;
        boolean[] zArr75;
        boolean[] zArr76;
        boolean[] zArr77;
        boolean[] zArr78;
        boolean[] zArr79;
        boolean[] zArr80;
        boolean[] zArr81;
        boolean[] zArr82;
        boolean[] zArr83;
        boolean[] zArr84;
        boolean[] zArr85;
        boolean[] zArr86;
        boolean[] zArr87;
        boolean[] zArr88;
        boolean[] zArr89;
        boolean[] zArr90;
        boolean[] zArr91;
        boolean[] zArr92;
        boolean[] zArr93;
        boolean[] zArr94;
        boolean[] zArr95;
        boolean[] zArr96;
        boolean[] zArr97;
        boolean[] zArr98;
        boolean[] zArr99;
        boolean[] zArr100;
        boolean[] zArr101;
        boolean[] zArr102;
        boolean[] zArr103;
        boolean[] zArr104;
        boolean[] zArr105;
        boolean[] zArr106;
        boolean[] zArr107;
        boolean[] zArr108;
        boolean[] zArr109;
        boolean[] zArr110;
        boolean[] zArr111;
        boolean[] zArr112;
        boolean[] zArr113;
        boolean[] zArr114;
        boolean[] zArr115;
        boolean[] zArr116;
        boolean[] zArr117;
        boolean[] zArr118;
        boolean[] zArr119;
        boolean[] zArr120;
        boolean[] zArr121;
        boolean[] zArr122;
        boolean[] zArr123;
        boolean[] zArr124;
        boolean[] zArr125;
        boolean[] zArr126;
        boolean[] zArr127;
        boolean[] zArr128;
        boolean[] zArr129;
        boolean[] zArr130;
        if (v7Var == null) {
            cVar.m();
            return;
        }
        cVar.d();
        zArr = v7Var.f42764n0;
        int length = zArr.length;
        nm.o oVar = this.f41802a;
        if (length > 0) {
            zArr130 = v7Var.f42764n0;
            if (zArr130[0]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("id"), v7Var.f42737a);
            }
        }
        zArr2 = v7Var.f42764n0;
        if (zArr2.length > 1) {
            zArr129 = v7Var.f42764n0;
            if (zArr129[1]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("node_id"), v7Var.f42739b);
            }
        }
        zArr3 = v7Var.f42764n0;
        if (zArr3.length > 2) {
            zArr128 = v7Var.f42764n0;
            if (zArr128[2]) {
                if (this.f41822u == null) {
                    this.f41822u = oVar.h(dk0.class).b();
                }
                this.f41822u.e(cVar.h("action"), v7Var.f42741c);
            }
        }
        zArr4 = v7Var.f42764n0;
        if (zArr4.length > 3) {
            zArr127 = v7Var.f42764n0;
            if (zArr127[3]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("allow_homefeed_recommendations"), v7Var.f42743d);
            }
        }
        zArr5 = v7Var.f42764n0;
        if (zArr5.length > 4) {
            zArr126 = v7Var.f42764n0;
            if (zArr126[4]) {
                if (this.f41807f == null) {
                    this.f41807f = oVar.h(Date.class).b();
                }
                this.f41807f.e(cVar.h("archived_by_me_at"), v7Var.f42745e);
            }
        }
        zArr6 = v7Var.f42764n0;
        if (zArr6.length > 5) {
            zArr125 = v7Var.f42764n0;
            if (zArr125[5]) {
                if (this.f41803b == null) {
                    this.f41803b = oVar.h(c7.class).b();
                }
                this.f41803b.e(cVar.h("automagical_board_metadata"), v7Var.f42747f);
            }
        }
        zArr7 = v7Var.f42764n0;
        if (zArr7.length > 6) {
            zArr124 = v7Var.f42764n0;
            if (zArr124[6]) {
                if (this.f41811j == null) {
                    this.f41811j = oVar.g(new TypeToken<List<lb>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$1
                    }).b();
                }
                this.f41811j.e(cVar.h("blocking_actions"), v7Var.f42749g);
            }
        }
        zArr8 = v7Var.f42764n0;
        if (zArr8.length > 7) {
            zArr123 = v7Var.f42764n0;
            if (zArr123[7]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("board_note_count"), v7Var.f42751h);
            }
        }
        zArr9 = v7Var.f42764n0;
        if (zArr9.length > 8) {
            zArr122 = v7Var.f42764n0;
            if (zArr122[8]) {
                if (this.f41807f == null) {
                    this.f41807f = oVar.h(Date.class).b();
                }
                this.f41807f.e(cVar.h("board_order_modified_at"), v7Var.f42753i);
            }
        }
        zArr10 = v7Var.f42764n0;
        if (zArr10.length > 9) {
            zArr121 = v7Var.f42764n0;
            if (zArr121[9]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("board_owner_has_active_ads"), v7Var.f42755j);
            }
        }
        zArr11 = v7Var.f42764n0;
        if (zArr11.length > 10) {
            zArr120 = v7Var.f42764n0;
            if (zArr120[10]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("category"), v7Var.f42757k);
            }
        }
        zArr12 = v7Var.f42764n0;
        if (zArr12.length > 11) {
            zArr119 = v7Var.f42764n0;
            if (zArr119[11]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("collaborated_by_me"), v7Var.f42759l);
            }
        }
        zArr13 = v7Var.f42764n0;
        if (zArr13.length > 12) {
            zArr118 = v7Var.f42764n0;
            if (zArr118[12]) {
                if (this.f41816o == null) {
                    this.f41816o = oVar.g(new TypeToken<List<wy0>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$2
                    }).b();
                }
                this.f41816o.e(cVar.h("collaborating_users"), v7Var.f42761m);
            }
        }
        zArr14 = v7Var.f42764n0;
        if (zArr14.length > 13) {
            zArr117 = v7Var.f42764n0;
            if (zArr117[13]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("collaborator_count"), v7Var.f42763n);
            }
        }
        zArr15 = v7Var.f42764n0;
        if (zArr15.length > 14) {
            zArr116 = v7Var.f42764n0;
            if (zArr116[14]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("collaborator_invites_enabled"), v7Var.f42765o);
            }
        }
        zArr16 = v7Var.f42764n0;
        if (zArr16.length > 15) {
            zArr115 = v7Var.f42764n0;
            if (zArr115[15]) {
                if (this.f41812k == null) {
                    this.f41812k = oVar.g(new TypeToken<List<Integer>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$3
                    }).b();
                }
                this.f41812k.e(cVar.h("collaborator_permissions"), v7Var.f42766p);
            }
        }
        zArr17 = v7Var.f42764n0;
        if (zArr17.length > 16) {
            zArr114 = v7Var.f42764n0;
            if (zArr114[16]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("collaborator_permissions_setting"), v7Var.f42767q);
            }
        }
        zArr18 = v7Var.f42764n0;
        if (zArr18.length > 17) {
            zArr113 = v7Var.f42764n0;
            if (zArr113[17]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("collaborator_requests_enabled"), v7Var.f42768r);
            }
        }
        zArr19 = v7Var.f42764n0;
        if (zArr19.length > 18) {
            zArr112 = v7Var.f42764n0;
            if (zArr112[18]) {
                if (this.f41817p == null) {
                    this.f41817p = oVar.g(new TypeToken<Map<String, sr>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$4
                    }).b();
                }
                this.f41817p.e(cVar.h("cover_images"), v7Var.f42769s);
            }
        }
        zArr20 = v7Var.f42764n0;
        if (zArr20.length > 19) {
            zArr111 = v7Var.f42764n0;
            if (zArr111[19]) {
                if (this.f41807f == null) {
                    this.f41807f = oVar.h(Date.class).b();
                }
                this.f41807f.e(cVar.h("created_at"), v7Var.f42770t);
            }
        }
        zArr21 = v7Var.f42764n0;
        if (zArr21.length > 20) {
            zArr110 = v7Var.f42764n0;
            if (zArr110[20]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("description"), v7Var.f42771u);
            }
        }
        zArr22 = v7Var.f42764n0;
        if (zArr22.length > 21) {
            zArr109 = v7Var.f42764n0;
            if (zArr109[21]) {
                if (this.f41814m == null) {
                    this.f41814m = oVar.g(new TypeToken<List<b60>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$5
                    }).b();
                }
                this.f41814m.e(cVar.h("eligible_pin_type_filters"), v7Var.f42772v);
            }
        }
        zArr23 = v7Var.f42764n0;
        if (zArr23.length > 22) {
            zArr108 = v7Var.f42764n0;
            if (zArr108[22]) {
                if (this.f41809h == null) {
                    this.f41809h = oVar.h(cl.class).b();
                }
                this.f41809h.e(cVar.h("featured_board_metadata"), v7Var.f42773w);
            }
        }
        zArr24 = v7Var.f42764n0;
        if (zArr24.length > 23) {
            zArr107 = v7Var.f42764n0;
            if (zArr107[23]) {
                if (this.f41815n == null) {
                    this.f41815n = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$6
                    }).b();
                }
                this.f41815n.e(cVar.h("featured_in"), v7Var.f42774x);
            }
        }
        zArr25 = v7Var.f42764n0;
        if (zArr25.length > 24) {
            zArr106 = v7Var.f42764n0;
            if (zArr106[24]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("followed_by_me"), v7Var.f42775y);
            }
        }
        zArr26 = v7Var.f42764n0;
        if (zArr26.length > 25) {
            zArr105 = v7Var.f42764n0;
            if (zArr105[25]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("follower_count"), v7Var.f42776z);
            }
        }
        zArr27 = v7Var.f42764n0;
        if (zArr27.length > 26) {
            zArr104 = v7Var.f42764n0;
            if (zArr104[26]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("has_active_ads"), v7Var.A);
            }
        }
        zArr28 = v7Var.f42764n0;
        if (zArr28.length > 27) {
            zArr103 = v7Var.f42764n0;
            if (zArr103[27]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("has_custom_cover"), v7Var.B);
            }
        }
        zArr29 = v7Var.f42764n0;
        if (zArr29.length > 28) {
            zArr102 = v7Var.f42764n0;
            if (zArr102[28]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("has_fresh_more_ideas_tab"), v7Var.C);
            }
        }
        zArr30 = v7Var.f42764n0;
        if (zArr30.length > 29) {
            zArr101 = v7Var.f42764n0;
            if (zArr101[29]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("has_new_activity"), v7Var.D);
            }
        }
        zArr31 = v7Var.f42764n0;
        if (zArr31.length > 30) {
            zArr100 = v7Var.f42764n0;
            if (zArr100[30]) {
                if (this.f41804c == null) {
                    this.f41804c = oVar.h(e8.class).b();
                }
                this.f41804c.e(cVar.h("header"), v7Var.E);
            }
        }
        zArr32 = v7Var.f42764n0;
        if (zArr32.length > 31) {
            zArr99 = v7Var.f42764n0;
            if (zArr99[31]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("image_cover_hd_url"), v7Var.F);
            }
        }
        zArr33 = v7Var.f42764n0;
        if (zArr33.length > 32) {
            zArr98 = v7Var.f42764n0;
            if (zArr98[32]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("image_cover_url"), v7Var.G);
            }
        }
        zArr34 = v7Var.f42764n0;
        if (zArr34.length > 33) {
            zArr97 = v7Var.f42764n0;
            if (zArr97[33]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("image_thumbnail_url"), v7Var.H);
            }
        }
        zArr35 = v7Var.f42764n0;
        if (zArr35.length > 34) {
            zArr96 = v7Var.f42764n0;
            if (zArr96[34]) {
                if (this.f41819r == null) {
                    this.f41819r = oVar.g(new TypeToken<Map<String, String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$7
                    }).b();
                }
                this.f41819r.e(cVar.h("image_thumbnail_urls"), v7Var.I);
            }
        }
        zArr36 = v7Var.f42764n0;
        if (zArr36.length > 35) {
            zArr95 = v7Var.f42764n0;
            if (zArr95[35]) {
                if (this.f41818q == null) {
                    this.f41818q = oVar.g(new TypeToken<Map<String, List<sr>>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$8
                    }).b();
                }
                this.f41818q.e(cVar.h("images"), v7Var.f42736J);
            }
        }
        zArr37 = v7Var.f42764n0;
        if (zArr37.length > 36) {
            zArr94 = v7Var.f42764n0;
            if (zArr94[36]) {
                if (this.f41813l == null) {
                    this.f41813l = oVar.g(new TypeToken<List<zs>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$9
                    }).b();
                }
                this.f41813l.e(cVar.h("interests"), v7Var.K);
            }
        }
        zArr38 = v7Var.f42764n0;
        if (zArr38.length > 37) {
            zArr93 = v7Var.f42764n0;
            if (zArr93[37]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("is_ads_only"), v7Var.L);
            }
        }
        zArr39 = v7Var.f42764n0;
        if (zArr39.length > 38) {
            zArr92 = v7Var.f42764n0;
            if (zArr92[38]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("is_collaborative"), v7Var.M);
            }
        }
        zArr40 = v7Var.f42764n0;
        if (zArr40.length > 39) {
            zArr91 = v7Var.f42764n0;
            if (zArr91[39]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("is_eligible_for_homefeed_tabs"), v7Var.N);
            }
        }
        zArr41 = v7Var.f42764n0;
        if (zArr41.length > 40) {
            zArr90 = v7Var.f42764n0;
            if (zArr90[40]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("is_eligible_for_seasonal_share_treatment"), v7Var.O);
            }
        }
        zArr42 = v7Var.f42764n0;
        if (zArr42.length > 41) {
            zArr89 = v7Var.f42764n0;
            if (zArr89[41]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("is_featured_for_active_campaign"), v7Var.P);
            }
        }
        zArr43 = v7Var.f42764n0;
        if (zArr43.length > 42) {
            zArr88 = v7Var.f42764n0;
            if (zArr88[42]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("layout"), v7Var.Q);
            }
        }
        zArr44 = v7Var.f42764n0;
        if (zArr44.length > 43) {
            zArr87 = v7Var.f42764n0;
            if (zArr87[43]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("name"), v7Var.R);
            }
        }
        zArr45 = v7Var.f42764n0;
        if (zArr45.length > 44) {
            zArr86 = v7Var.f42764n0;
            if (zArr86[44]) {
                if (this.f41824w == null) {
                    this.f41824w = oVar.h(wy0.class).b();
                }
                this.f41824w.e(cVar.h("owner"), v7Var.S);
            }
        }
        zArr46 = v7Var.f42764n0;
        if (zArr46.length > 45) {
            zArr85 = v7Var.f42764n0;
            if (zArr85[45]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("pear_insights_count"), v7Var.T);
            }
        }
        zArr47 = v7Var.f42764n0;
        if (zArr47.length > 46) {
            zArr84 = v7Var.f42764n0;
            if (zArr84[46]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("pin_count"), v7Var.U);
            }
        }
        zArr48 = v7Var.f42764n0;
        if (zArr48.length > 47) {
            zArr83 = v7Var.f42764n0;
            if (zArr83[47]) {
                if (this.f41815n == null) {
                    this.f41815n = oVar.g(new TypeToken<List<String>>(this) { // from class: com.pinterest.api.model.Board$BoardTypeAdapter$10
                    }).b();
                }
                this.f41815n.e(cVar.h("pin_thumbnail_urls"), v7Var.V);
            }
        }
        zArr49 = v7Var.f42764n0;
        if (zArr49.length > 48) {
            zArr82 = v7Var.f42764n0;
            if (zArr82[48]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("privacy"), v7Var.W);
            }
        }
        zArr50 = v7Var.f42764n0;
        if (zArr50.length > 49) {
            zArr81 = v7Var.f42764n0;
            if (zArr81[49]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("recommendation_reason"), v7Var.X);
            }
        }
        zArr51 = v7Var.f42764n0;
        if (zArr51.length > 50) {
            zArr80 = v7Var.f42764n0;
            if (zArr80[50]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("section_count"), v7Var.Y);
            }
        }
        zArr52 = v7Var.f42764n0;
        if (zArr52.length > 51) {
            zArr79 = v7Var.f42764n0;
            if (zArr79[51]) {
                if (this.f41810i == null) {
                    this.f41810i = oVar.h(Integer.class).b();
                }
                this.f41810i.e(cVar.h("sectionless_pin_count"), v7Var.Z);
            }
        }
        zArr53 = v7Var.f42764n0;
        if (zArr53.length > 52) {
            zArr78 = v7Var.f42764n0;
            if (zArr78[52]) {
                if (this.f41820s == null) {
                    this.f41820s = oVar.h(lh0.class).b();
                }
                this.f41820s.e(cVar.h("sensitivity"), v7Var.f42738a0);
            }
        }
        zArr54 = v7Var.f42764n0;
        if (zArr54.length > 53) {
            zArr77 = v7Var.f42764n0;
            if (zArr77[53]) {
                if (this.f41821t == null) {
                    this.f41821t = oVar.h(ph0.class).b();
                }
                this.f41821t.e(cVar.h("sensitivity_screen"), v7Var.f42740b0);
            }
        }
        zArr55 = v7Var.f42764n0;
        if (zArr55.length > 54) {
            zArr76 = v7Var.f42764n0;
            if (zArr76[54]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("should_show_board_collaborators"), v7Var.f42742c0);
            }
        }
        zArr56 = v7Var.f42764n0;
        if (zArr56.length > 55) {
            zArr75 = v7Var.f42764n0;
            if (zArr75[55]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("should_show_more_ideas"), v7Var.f42744d0);
            }
        }
        zArr57 = v7Var.f42764n0;
        if (zArr57.length > 56) {
            zArr74 = v7Var.f42764n0;
            if (zArr74[56]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("should_show_shop_feed"), v7Var.f42746e0);
            }
        }
        zArr58 = v7Var.f42764n0;
        if (zArr58.length > 57) {
            zArr73 = v7Var.f42764n0;
            if (zArr73[57]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("subscribed_to_notifications"), v7Var.f42748f0);
            }
        }
        zArr59 = v7Var.f42764n0;
        if (zArr59.length > 58) {
            zArr72 = v7Var.f42764n0;
            if (zArr72[58]) {
                if (this.f41808g == null) {
                    this.f41808g = oVar.h(Double.class).b();
                }
                this.f41808g.e(cVar.h("suggestion_confidence"), v7Var.f42750g0);
            }
        }
        zArr60 = v7Var.f42764n0;
        if (zArr60.length > 59) {
            zArr71 = v7Var.f42764n0;
            if (zArr71[59]) {
                if (this.f41808g == null) {
                    this.f41808g = oVar.h(Double.class).b();
                }
                this.f41808g.e(cVar.h("suggestion_title_id"), v7Var.f42752h0);
            }
        }
        zArr61 = v7Var.f42764n0;
        if (zArr61.length > 60) {
            zArr70 = v7Var.f42764n0;
            if (zArr70[60]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("suggestion_type"), v7Var.f42754i0);
            }
        }
        zArr62 = v7Var.f42764n0;
        if (zArr62.length > 61) {
            zArr69 = v7Var.f42764n0;
            if (zArr69[61]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("tracking_params"), v7Var.f42756j0);
            }
        }
        zArr63 = v7Var.f42764n0;
        if (zArr63.length > 62) {
            zArr68 = v7Var.f42764n0;
            if (zArr68[62]) {
                if (this.f41823v == null) {
                    this.f41823v = oVar.h(String.class).b();
                }
                this.f41823v.e(cVar.h("url"), v7Var.f42758k0);
            }
        }
        zArr64 = v7Var.f42764n0;
        if (zArr64.length > 63) {
            zArr67 = v7Var.f42764n0;
            if (zArr67[63]) {
                if (this.f41805d == null) {
                    this.f41805d = oVar.h(Boolean.class).b();
                }
                this.f41805d.e(cVar.h("viewer_collaborator_join_requested"), v7Var.f42760l0);
            }
        }
        zArr65 = v7Var.f42764n0;
        if (zArr65.length > 64) {
            zArr66 = v7Var.f42764n0;
            if (zArr66[64]) {
                if (this.f41806e == null) {
                    this.f41806e = oVar.h(ke.class).b();
                }
                this.f41806e.e(cVar.h("viewer_contact_request"), v7Var.f42762m0);
            }
        }
        cVar.g();
    }
}
