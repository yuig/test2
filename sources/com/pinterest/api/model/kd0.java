package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kd0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39403a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39404b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("detail_page_additional_text")
    private String f39405c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("detail_page_header_text")
    private String f39406d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("detail_page_non_removal_example_header")
    private String f39407e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("detail_page_non_removal_examples")
    private List<String> f39408f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("detail_page_removal_example_header")
    private String f39409g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    @om.b("detail_page_removal_examples")
    private List<String> f39410h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("element_type")
    private Integer f39411i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f39412j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("open_web_url")
    private String f39413k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    @om.b("primary_text")
    private String f39414l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("secondary_text")
    private String f39415m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("sensitivity_type")
    private String f39416n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f39417o;

    public /* synthetic */ kd0(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Integer num, String str7, String str8, String str9, String str10, String str11, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, list, str6, list2, num, str7, str8, str9, str10, str11, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kd0 kd0Var = (kd0) obj;
        return Objects.equals(this.f39411i, kd0Var.f39411i) && Objects.equals(this.f39403a, kd0Var.f39403a) && Objects.equals(this.f39404b, kd0Var.f39404b) && Objects.equals(this.f39405c, kd0Var.f39405c) && Objects.equals(this.f39406d, kd0Var.f39406d) && Objects.equals(this.f39407e, kd0Var.f39407e) && Objects.equals(this.f39408f, kd0Var.f39408f) && Objects.equals(this.f39409g, kd0Var.f39409g) && Objects.equals(this.f39410h, kd0Var.f39410h) && Objects.equals(this.f39412j, kd0Var.f39412j) && Objects.equals(this.f39413k, kd0Var.f39413k) && Objects.equals(this.f39414l, kd0Var.f39414l) && Objects.equals(this.f39415m, kd0Var.f39415m) && Objects.equals(this.f39416n, kd0Var.f39416n);
    }

    public final int hashCode() {
        return Objects.hash(this.f39403a, this.f39404b, this.f39405c, this.f39406d, this.f39407e, this.f39408f, this.f39409g, this.f39410h, this.f39411i, this.f39412j, this.f39413k, this.f39414l, this.f39415m, this.f39416n);
    }

    public final String o() {
        return this.f39405c;
    }

    public final String p() {
        return this.f39406d;
    }

    public final String q() {
        return this.f39407e;
    }

    public final List r() {
        return this.f39408f;
    }

    public final String s() {
        return this.f39409g;
    }

    public final List t() {
        return this.f39410h;
    }

    public final Integer u() {
        Integer num = this.f39411i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String v() {
        return this.f39412j;
    }

    public final String w() {
        return this.f39413k;
    }

    public final String x() {
        return this.f39414l;
    }

    public final String y() {
        return this.f39415m;
    }

    public final String z() {
        return this.f39416n;
    }

    public kd0() {
        this.f39417o = new boolean[14];
    }

    private kd0(@NonNull String str, String str2, String str3, String str4, String str5, @NonNull List<String> list, String str6, @NonNull List<String> list2, Integer num, @NonNull String str7, String str8, @NonNull String str9, String str10, String str11, boolean[] zArr) {
        this.f39403a = str;
        this.f39404b = str2;
        this.f39405c = str3;
        this.f39406d = str4;
        this.f39407e = str5;
        this.f39408f = list;
        this.f39409g = str6;
        this.f39410h = list2;
        this.f39411i = num;
        this.f39412j = str7;
        this.f39413k = str8;
        this.f39414l = str9;
        this.f39415m = str10;
        this.f39416n = str11;
        this.f39417o = zArr;
    }
}
