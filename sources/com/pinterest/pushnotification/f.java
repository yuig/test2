package com.pinterest.pushnotification;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import df.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import pk.a0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f50257a;

    /* renamed from: b, reason: collision with root package name */
    public final String f50258b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f50259c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f50260d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50261e;

    /* renamed from: f, reason: collision with root package name */
    public final String f50262f;

    /* renamed from: g, reason: collision with root package name */
    public final String f50263g;

    /* renamed from: h, reason: collision with root package name */
    public final String f50264h;

    /* renamed from: i, reason: collision with root package name */
    public final Bundle f50265i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f50266j;

    /* renamed from: k, reason: collision with root package name */
    public String f50267k;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f50268l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f50269m;

    /* renamed from: n, reason: collision with root package name */
    public String f50270n;

    /* renamed from: o, reason: collision with root package name */
    public final List f50271o;

    /* renamed from: p, reason: collision with root package name */
    public final List f50272p;

    /* renamed from: q, reason: collision with root package name */
    public final List f50273q;

    /* renamed from: r, reason: collision with root package name */
    public final List f50274r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f50275s;

    public f(Map map) {
        int i13;
        int i14;
        this.f50266j = map;
        String str = (String) map.get("push_id");
        this.f50257a = str == null ? "" : str;
        boolean z13 = false;
        try {
            i13 = Integer.parseInt((String) map.get("type"));
        } catch (NumberFormatException unused) {
            i13 = 0;
        }
        this.f50259c = Integer.valueOf(i13);
        String str2 = (String) map.get("channel_id");
        this.f50258b = str2 == null ? "" : str2;
        try {
            i14 = Integer.parseInt((String) map.get("badge"));
        } catch (NumberFormatException unused2) {
            i14 = 0;
        }
        this.f50260d = Integer.valueOf(i14);
        String str3 = (String) map.get("payload");
        this.f50267k = str3 == null ? "" : str3;
        String str4 = (String) map.get("title");
        this.f50261e = str4 == null ? "" : str4;
        String str5 = (String) map.get("override_collapsed_view_title");
        this.f50262f = str5 == null ? "" : str5;
        String str6 = (String) map.get("override_collapsed_view_body");
        this.f50263g = str6 == null ? "" : str6;
        try {
            z13 = Boolean.parseBoolean((String) map.get("invite_accepted"));
        } catch (NumberFormatException unused3) {
        }
        this.f50275s = z13;
        String str7 = (String) map.get("link");
        str7 = str7 == null ? "" : str7;
        this.f50269m = Uri.parse(str7.startsWith("http") ? str7 : "pinterest://".concat(str7));
        String str8 = (String) map.get("collapsed_view_link");
        str8 = str8 == null ? null : str8;
        this.f50268l = str8 != null ? Uri.parse(str8.startsWith("http") ? str8 : "pinterest://".concat(str8)) : null;
        String str9 = (String) map.get("image");
        this.f50270n = str9 == null ? "" : str9;
        String str10 = (String) map.get("category");
        str10 = str10 == null ? "" : str10;
        this.f50264h = str10;
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h(j1.T("PushData for Id: %s, Type: %s", this.f50257a, this.f50259c));
        if (!"MINI_BOARD_GRID_NOTIFICATION".equals(str10)) {
            "MINI_INTEREST_GRID_NOTIFICATION".equals(str10);
        }
        this.f50272p = new ArrayList();
        String str11 = (String) map.get("pin_count_per_board");
        str11 = str11 == null ? "" : str11;
        if (a0.D0(str11)) {
            try {
                this.f50272p = (List) vd0.c.f125622b.d(str11, new PushNotification$PushData$1().f33847b);
            } catch (Exception e13) {
                r("PinCountParseException", e13.getMessage() != null ? e13.getMessage() : "");
            }
        }
        this.f50271o = new ArrayList();
        String str12 = (String) map.get("media_urls");
        str12 = str12 == null ? "" : str12;
        if (a0.D0(str12)) {
            try {
                this.f50271o = (List) vd0.c.f125622b.d(str12, new PushNotification$PushData$2().f33847b);
            } catch (Exception e14) {
                r("MediaUrlParseException", e14.getMessage() != null ? e14.getMessage() : "");
            }
        }
        this.f50273q = new ArrayList();
        String str13 = (String) map.get("interest_names");
        str13 = str13 == null ? "" : str13;
        if (a0.D0(str13)) {
            try {
                this.f50273q = (List) vd0.c.f125622b.d(str13, new PushNotification$PushData$3().f33847b);
            } catch (Exception e15) {
                r("InterestNameParseException", e15.getMessage() != null ? e15.getMessage() : "");
            }
        }
        new ArrayList();
        String str14 = (String) map.get("previous_replies");
        str14 = str14 == null ? "" : str14;
        if (a0.D0(str14)) {
            try {
                this.f50274r = (List) vd0.c.f125622b.d(str14, new PushNotification$PushData$4().f33847b);
            } catch (Exception e16) {
                r("PreviousRepliesParseException", e16.getMessage() != null ? e16.getMessage() : "");
            }
        }
        this.f50265i = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            this.f50265i.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static void r(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(str, str2));
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.k("RichPushNotification", arrayList);
    }

    public final Integer a() {
        return this.f50260d;
    }

    public final String b() {
        return this.f50258b;
    }

    public final String c() {
        return this.f50263g;
    }

    public final Uri d() {
        return this.f50268l;
    }

    public final String e() {
        return this.f50262f;
    }

    public final String f() {
        return this.f50257a;
    }

    public final String g() {
        return this.f50270n;
    }

    public final List h() {
        return this.f50273q;
    }

    public final Uri i() {
        return this.f50269m;
    }

    public final String j() {
        return this.f50267k;
    }

    public final int k() {
        Uri uri = this.f50269m;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments == null || !pathSegments.contains("conversation")) {
            return this.f50257a.hashCode();
        }
        List<String> pathSegments2 = uri != null ? uri.getPathSegments() : Collections.emptyList();
        String str = pathSegments2.size() >= 2 ? pathSegments2.get(1) : null;
        if (str != null) {
            return str.hashCode();
        }
        return 58902;
    }

    public final String l() {
        List list = this.f50271o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    public final List m() {
        return this.f50272p;
    }

    public final List n() {
        return this.f50271o;
    }

    public final Bundle o() {
        return this.f50265i;
    }

    public final String p() {
        return this.f50264h;
    }

    public final String q() {
        return this.f50261e;
    }
}
