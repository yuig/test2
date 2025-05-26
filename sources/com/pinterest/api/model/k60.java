package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.appsflyer.AdRevenueScheme;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class k60 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39302a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39303b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("category")
    private String f39304c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("category_join")
    private o60 f39305d;

    /* renamed from: e, reason: collision with root package name */
    @om.b(AdRevenueScheme.COUNTRY)
    private String f39306e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("extra_street")
    private String f39307f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("hours")
    private List<Map<String, Object>> f39308g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("image")
    private s60 f39309h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("images")
    private List<s60> f39310i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("latitude")
    private Double f39311j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("locality")
    private String f39312k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("longitude")
    private Double f39313l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("name")
    private String f39314m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("phone")
    private String f39315n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("postal_code")
    private String f39316o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("region")
    private String f39317p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("simple_tips")
    private List<String> f39318q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("source_icon")
    private String f39319r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("source_id")
    private String f39320s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("source_name")
    private String f39321t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("source_url")
    private String f39322u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("street")
    private String f39323v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("url")
    private String f39324w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean[] f39325x;

    public /* synthetic */ k60(String str, String str2, String str3, o60 o60Var, String str4, String str5, List list, s60 s60Var, List list2, Double d2, String str6, Double d13, String str7, String str8, String str9, String str10, List list3, String str11, String str12, String str13, String str14, String str15, String str16, boolean[] zArr, int i13) {
        this(str, str2, str3, o60Var, str4, str5, list, s60Var, list2, d2, str6, d13, str7, str8, str9, str10, list3, str11, str12, str13, str14, str15, str16, zArr);
    }

    public final String G() {
        return this.f39306e;
    }

    public final String H() {
        return this.f39307f;
    }

    public final Double I() {
        Double d2 = this.f39311j;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String J() {
        return this.f39312k;
    }

    public final Double K() {
        Double d2 = this.f39313l;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String L() {
        return this.f39316o;
    }

    public final String M() {
        return this.f39317p;
    }

    public final String N() {
        return this.f39323v;
    }

    @Override // dl1.s
    public final String b() {
        return this.f39302a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k60 k60Var = (k60) obj;
        return Objects.equals(this.f39313l, k60Var.f39313l) && Objects.equals(this.f39311j, k60Var.f39311j) && Objects.equals(this.f39302a, k60Var.f39302a) && Objects.equals(this.f39303b, k60Var.f39303b) && Objects.equals(this.f39304c, k60Var.f39304c) && Objects.equals(this.f39305d, k60Var.f39305d) && Objects.equals(this.f39306e, k60Var.f39306e) && Objects.equals(this.f39307f, k60Var.f39307f) && Objects.equals(this.f39308g, k60Var.f39308g) && Objects.equals(this.f39309h, k60Var.f39309h) && Objects.equals(this.f39310i, k60Var.f39310i) && Objects.equals(this.f39312k, k60Var.f39312k) && Objects.equals(this.f39314m, k60Var.f39314m) && Objects.equals(this.f39315n, k60Var.f39315n) && Objects.equals(this.f39316o, k60Var.f39316o) && Objects.equals(this.f39317p, k60Var.f39317p) && Objects.equals(this.f39318q, k60Var.f39318q) && Objects.equals(this.f39319r, k60Var.f39319r) && Objects.equals(this.f39320s, k60Var.f39320s) && Objects.equals(this.f39321t, k60Var.f39321t) && Objects.equals(this.f39322u, k60Var.f39322u) && Objects.equals(this.f39323v, k60Var.f39323v) && Objects.equals(this.f39324w, k60Var.f39324w);
    }

    public final int hashCode() {
        return Objects.hash(this.f39302a, this.f39303b, this.f39304c, this.f39305d, this.f39306e, this.f39307f, this.f39308g, this.f39309h, this.f39310i, this.f39311j, this.f39312k, this.f39313l, this.f39314m, this.f39315n, this.f39316o, this.f39317p, this.f39318q, this.f39319r, this.f39320s, this.f39321t, this.f39322u, this.f39323v, this.f39324w);
    }

    @Override // dl1.s
    public final String o() {
        return this.f39303b;
    }

    public k60() {
        this.f39325x = new boolean[23];
    }

    private k60(@NonNull String str, String str2, String str3, o60 o60Var, String str4, String str5, List<Map<String, Object>> list, s60 s60Var, List<s60> list2, Double d2, String str6, Double d13, String str7, String str8, String str9, String str10, List<String> list3, String str11, String str12, String str13, String str14, String str15, String str16, boolean[] zArr) {
        this.f39302a = str;
        this.f39303b = str2;
        this.f39304c = str3;
        this.f39305d = o60Var;
        this.f39306e = str4;
        this.f39307f = str5;
        this.f39308g = list;
        this.f39309h = s60Var;
        this.f39310i = list2;
        this.f39311j = d2;
        this.f39312k = str6;
        this.f39313l = d13;
        this.f39314m = str7;
        this.f39315n = str8;
        this.f39316o = str9;
        this.f39317p = str10;
        this.f39318q = list3;
        this.f39319r = str11;
        this.f39320s = str12;
        this.f39321t = str13;
        this.f39322u = str14;
        this.f39323v = str15;
        this.f39324w = str16;
        this.f39325x = zArr;
    }
}
