package com.pinterest.api.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class se0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("actions")
    private List<String> f41869a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("aggregate_rating")
    private v2 f41870b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("apple_touch_icon_images")
    private Map<String, String> f41871c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("apple_touch_icon_link")
    private String f41872d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("display_cook_time")
    private Integer f41873e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("display_description")
    private String f41874f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("display_name")
    private String f41875g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("favicon_images")
    private Map<String, String> f41876h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("favicon_link")
    private String f41877i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("has_instant_content")
    private Boolean f41878j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("id")
    private String f41879k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("is_product_pin_v2")
    private Boolean f41880l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("mobile_app")
    private dw f41881m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("products")
    private List<we0> f41882n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("site_name")
    private String f41883o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("type")
    private String f41884p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("type_name")
    private String f41885q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("url")
    private String f41886r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f41887s;

    public /* synthetic */ se0(List list, v2 v2Var, Map map, String str, Integer num, String str2, String str3, Map map2, String str4, Boolean bool, String str5, Boolean bool2, dw dwVar, List list2, String str6, String str7, String str8, String str9, boolean[] zArr, int i13) {
        this(list, v2Var, map, str, num, str2, str3, map2, str4, bool, str5, bool2, dwVar, list2, str6, str7, str8, str9, zArr);
    }

    public final String A() {
        return this.f41885q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        se0 se0Var = (se0) obj;
        return Objects.equals(this.f41880l, se0Var.f41880l) && Objects.equals(this.f41878j, se0Var.f41878j) && Objects.equals(this.f41873e, se0Var.f41873e) && Objects.equals(this.f41869a, se0Var.f41869a) && Objects.equals(this.f41870b, se0Var.f41870b) && Objects.equals(this.f41871c, se0Var.f41871c) && Objects.equals(this.f41872d, se0Var.f41872d) && Objects.equals(this.f41874f, se0Var.f41874f) && Objects.equals(this.f41875g, se0Var.f41875g) && Objects.equals(this.f41876h, se0Var.f41876h) && Objects.equals(this.f41877i, se0Var.f41877i) && Objects.equals(this.f41879k, se0Var.f41879k) && Objects.equals(this.f41881m, se0Var.f41881m) && Objects.equals(this.f41882n, se0Var.f41882n) && Objects.equals(this.f41883o, se0Var.f41883o) && Objects.equals(this.f41884p, se0Var.f41884p) && Objects.equals(this.f41885q, se0Var.f41885q) && Objects.equals(this.f41886r, se0Var.f41886r);
    }

    public final int hashCode() {
        return Objects.hash(this.f41869a, this.f41870b, this.f41871c, this.f41872d, this.f41873e, this.f41874f, this.f41875g, this.f41876h, this.f41877i, this.f41878j, this.f41879k, this.f41880l, this.f41881m, this.f41882n, this.f41883o, this.f41884p, this.f41885q, this.f41886r);
    }

    public final v2 s() {
        return this.f41870b;
    }

    public final String t() {
        return this.f41872d;
    }

    public final Integer u() {
        Integer num = this.f41873e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String v() {
        return this.f41875g;
    }

    public final String w() {
        return this.f41877i;
    }

    public final Boolean x() {
        Boolean bool = this.f41880l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List y() {
        return this.f41882n;
    }

    public final String z() {
        return this.f41883o;
    }

    public se0() {
        this.f41887s = new boolean[18];
    }

    private se0(List<String> list, v2 v2Var, Map<String, String> map, String str, Integer num, String str2, String str3, Map<String, String> map2, String str4, Boolean bool, String str5, Boolean bool2, dw dwVar, List<we0> list2, String str6, String str7, String str8, String str9, boolean[] zArr) {
        this.f41869a = list;
        this.f41870b = v2Var;
        this.f41871c = map;
        this.f41872d = str;
        this.f41873e = num;
        this.f41874f = str2;
        this.f41875g = str3;
        this.f41876h = map2;
        this.f41877i = str4;
        this.f41878j = bool;
        this.f41879k = str5;
        this.f41880l = bool2;
        this.f41881m = dwVar;
        this.f41882n = list2;
        this.f41883o = str6;
        this.f41884p = str7;
        this.f41885q = str8;
        this.f41886r = str9;
        this.f41887s = zArr;
    }
}
