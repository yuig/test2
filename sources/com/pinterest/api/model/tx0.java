package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class tx0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f42349a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f42350b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("aux_data")
    private Map<String, Object> f42351c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("image_url")
    private String f42352d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_selected")
    private Boolean f42353e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_verified")
    private Boolean f42354f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("label")
    private String f42355g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("numeric_value")
    private Double f42356h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("rules")
    private List<Integer> f42357i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("search_type")
    private Integer f42358j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("string_value")
    private String f42359k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("unit")
    private String f42360l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f42361m;

    public /* synthetic */ tx0(String str, String str2, Map map, String str3, Boolean bool, Boolean bool2, String str4, Double d2, List list, Integer num, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, map, str3, bool, bool2, str4, d2, list, num, str5, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return Objects.equals(this.f42358j, tx0Var.f42358j) && Objects.equals(this.f42356h, tx0Var.f42356h) && Objects.equals(this.f42354f, tx0Var.f42354f) && Objects.equals(this.f42353e, tx0Var.f42353e) && Objects.equals(this.f42349a, tx0Var.f42349a) && Objects.equals(this.f42350b, tx0Var.f42350b) && Objects.equals(this.f42351c, tx0Var.f42351c) && Objects.equals(this.f42352d, tx0Var.f42352d) && Objects.equals(this.f42355g, tx0Var.f42355g) && Objects.equals(this.f42357i, tx0Var.f42357i) && Objects.equals(this.f42359k, tx0Var.f42359k) && Objects.equals(this.f42360l, tx0Var.f42360l);
    }

    public final int hashCode() {
        return Objects.hash(this.f42349a, this.f42350b, this.f42351c, this.f42352d, this.f42353e, this.f42354f, this.f42355g, this.f42356h, this.f42357i, this.f42358j, this.f42359k, this.f42360l);
    }

    public final Map m() {
        return this.f42351c;
    }

    public final String n() {
        return this.f42352d;
    }

    public final Boolean o() {
        Boolean bool = this.f42353e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String p() {
        return this.f42355g;
    }

    public final Double q() {
        Double d2 = this.f42356h;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final List r() {
        return this.f42357i;
    }

    public final Integer s() {
        Integer num = this.f42358j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String t() {
        return this.f42359k;
    }

    public final String u() {
        return this.f42349a;
    }

    public final String v() {
        return this.f42360l;
    }

    public final qx0 w() {
        return new qx0(this, 0);
    }

    public tx0() {
        this.f42361m = new boolean[12];
    }

    private tx0(@NonNull String str, String str2, Map<String, Object> map, String str3, Boolean bool, Boolean bool2, @NonNull String str4, Double d2, List<Integer> list, Integer num, String str5, String str6, boolean[] zArr) {
        this.f42349a = str;
        this.f42350b = str2;
        this.f42351c = map;
        this.f42352d = str3;
        this.f42353e = bool;
        this.f42354f = bool2;
        this.f42355g = str4;
        this.f42356h = d2;
        this.f42357i = list;
        this.f42358j = num;
        this.f42359k = str5;
        this.f42360l = str6;
        this.f42361m = zArr;
    }
}
