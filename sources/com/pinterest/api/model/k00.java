package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class k00 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39224a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39225b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("annotated_title")
    private y5 f39226c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("contents")
    private List<g00> f39227d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("feed_url")
    private String f39228e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("filter")
    private px0 f39229f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("filter_keys")
    private List<String> f39230g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("filters")
    private List<xl> f39231h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("product_filter_type")
    private Integer f39232i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("request_params")
    private Map<String, Object> f39233j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("search_parameters")
    private List<String> f39234k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("search_query")
    private String f39235l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("title")
    private String f39236m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("type")
    private String f39237n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f39238o;

    public /* synthetic */ k00(String str, String str2, y5 y5Var, List list, String str3, px0 px0Var, List list2, List list3, Integer num, Map map, List list4, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, y5Var, list, str3, px0Var, list2, list3, num, map, list4, str4, str5, str6, zArr);
    }

    public final String A() {
        return this.f39237n;
    }

    public final String B() {
        return this.f39224a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k00 k00Var = (k00) obj;
        return Objects.equals(this.f39232i, k00Var.f39232i) && Objects.equals(this.f39224a, k00Var.f39224a) && Objects.equals(this.f39225b, k00Var.f39225b) && Objects.equals(this.f39226c, k00Var.f39226c) && Objects.equals(this.f39227d, k00Var.f39227d) && Objects.equals(this.f39228e, k00Var.f39228e) && Objects.equals(this.f39229f, k00Var.f39229f) && Objects.equals(this.f39230g, k00Var.f39230g) && Objects.equals(this.f39231h, k00Var.f39231h) && Objects.equals(this.f39233j, k00Var.f39233j) && Objects.equals(this.f39234k, k00Var.f39234k) && Objects.equals(this.f39235l, k00Var.f39235l) && Objects.equals(this.f39236m, k00Var.f39236m) && Objects.equals(this.f39237n, k00Var.f39237n);
    }

    public final int hashCode() {
        return Objects.hash(this.f39224a, this.f39225b, this.f39226c, this.f39227d, this.f39228e, this.f39229f, this.f39230g, this.f39231h, this.f39232i, this.f39233j, this.f39234k, this.f39235l, this.f39236m, this.f39237n);
    }

    public final y5 o() {
        return this.f39226c;
    }

    public final List p() {
        return this.f39227d;
    }

    public final String q() {
        return this.f39228e;
    }

    public final px0 r() {
        return this.f39229f;
    }

    public final List s() {
        return this.f39230g;
    }

    public final List t() {
        return this.f39231h;
    }

    public final String u() {
        return this.f39225b;
    }

    public final Integer v() {
        Integer num = this.f39232i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Map w() {
        return this.f39233j;
    }

    public final List x() {
        return this.f39234k;
    }

    public final String y() {
        return this.f39235l;
    }

    public final String z() {
        return this.f39236m;
    }

    public k00() {
        this.f39238o = new boolean[14];
    }

    private k00(@NonNull String str, String str2, y5 y5Var, List<g00> list, String str3, px0 px0Var, List<String> list2, List<xl> list3, Integer num, Map<String, Object> map, List<String> list4, String str4, String str5, String str6, boolean[] zArr) {
        this.f39224a = str;
        this.f39225b = str2;
        this.f39226c = y5Var;
        this.f39227d = list;
        this.f39228e = str3;
        this.f39229f = px0Var;
        this.f39230g = list2;
        this.f39231h = list3;
        this.f39232i = num;
        this.f39233j = map;
        this.f39234k = list4;
        this.f39235l = str4;
        this.f39236m = str5;
        this.f39237n = str6;
        this.f39238o = zArr;
    }
}
