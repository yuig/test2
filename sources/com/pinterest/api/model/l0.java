package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39577a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39578b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("geo_postal_code")
    private String f39579c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("geo_region")
    private String f39580d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_actalike_matched")
    private Boolean f39581e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_age_matched")
    private Boolean f39582f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("is_behavior_targeting_matched")
    private Boolean f39583g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("is_customer_list_matched")
    private Boolean f39584h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("is_engagement_matched")
    private Boolean f39585i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_expand_targeting_matched")
    private Boolean f39586j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("is_first_party_ad_personalization_enabled")
    private Boolean f39587k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("is_from_gps_location")
    private Boolean f39588l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("is_geo_postal_code_matched")
    private Boolean f39589m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("is_geo_region_matched")
    private Boolean f39590n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("is_pl_persona_matched")
    private Boolean f39591o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("is_shopping_prospecting_matched")
    private Boolean f39592p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("is_shopping_retargeting_matched")
    private Boolean f39593q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("is_third_party_ad_personalization_enabled")
    private Boolean f39594r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("is_visitor_matched")
    private Boolean f39595s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("matched_age_bucket")
    private String f39596t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("matched_device")
    private String f39597u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("matched_gender")
    private String f39598v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("matched_interest")
    private String f39599w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("matched_keyword")
    private String f39600x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("matched_locale")
    private String f39601y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f39602z;

    public /* synthetic */ l0(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, String str5, String str6, String str7, String str8, String str9, String str10, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, str5, str6, str7, str8, str9, str10, zArr);
    }

    public final String A() {
        return this.f39580d;
    }

    public final Boolean B() {
        Boolean bool = this.f39581e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean C() {
        Boolean bool = this.f39584h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean D() {
        Boolean bool = this.f39585i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean E() {
        Boolean bool = this.f39586j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean F() {
        Boolean bool = this.f39587k;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean G() {
        Boolean bool = this.f39588l;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean H() {
        Boolean bool = this.f39589m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean I() {
        Boolean bool = this.f39590n;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean J() {
        Boolean bool = this.f39591o;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean K() {
        Boolean bool = this.f39592p;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean L() {
        Boolean bool = this.f39593q;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean M() {
        Boolean bool = this.f39594r;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean N() {
        Boolean bool = this.f39595s;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String O() {
        return this.f39596t;
    }

    public final String P() {
        return this.f39597u;
    }

    public final String Q() {
        return this.f39598v;
    }

    public final String R() {
        return this.f39600x;
    }

    public final String S() {
        return this.f39601y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Objects.equals(this.f39595s, l0Var.f39595s) && Objects.equals(this.f39594r, l0Var.f39594r) && Objects.equals(this.f39593q, l0Var.f39593q) && Objects.equals(this.f39592p, l0Var.f39592p) && Objects.equals(this.f39591o, l0Var.f39591o) && Objects.equals(this.f39590n, l0Var.f39590n) && Objects.equals(this.f39589m, l0Var.f39589m) && Objects.equals(this.f39588l, l0Var.f39588l) && Objects.equals(this.f39587k, l0Var.f39587k) && Objects.equals(this.f39586j, l0Var.f39586j) && Objects.equals(this.f39585i, l0Var.f39585i) && Objects.equals(this.f39584h, l0Var.f39584h) && Objects.equals(this.f39583g, l0Var.f39583g) && Objects.equals(this.f39582f, l0Var.f39582f) && Objects.equals(this.f39581e, l0Var.f39581e) && Objects.equals(this.f39577a, l0Var.f39577a) && Objects.equals(this.f39578b, l0Var.f39578b) && Objects.equals(this.f39579c, l0Var.f39579c) && Objects.equals(this.f39580d, l0Var.f39580d) && Objects.equals(this.f39596t, l0Var.f39596t) && Objects.equals(this.f39597u, l0Var.f39597u) && Objects.equals(this.f39598v, l0Var.f39598v) && Objects.equals(this.f39599w, l0Var.f39599w) && Objects.equals(this.f39600x, l0Var.f39600x) && Objects.equals(this.f39601y, l0Var.f39601y);
    }

    public final int hashCode() {
        return Objects.hash(this.f39577a, this.f39578b, this.f39579c, this.f39580d, this.f39581e, this.f39582f, this.f39583g, this.f39584h, this.f39585i, this.f39586j, this.f39587k, this.f39588l, this.f39589m, this.f39590n, this.f39591o, this.f39592p, this.f39593q, this.f39594r, this.f39595s, this.f39596t, this.f39597u, this.f39598v, this.f39599w, this.f39600x, this.f39601y);
    }

    public final String z() {
        return this.f39579c;
    }

    public l0() {
        this.f39602z = new boolean[25];
    }

    private l0(@NonNull String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, String str5, String str6, String str7, String str8, String str9, String str10, boolean[] zArr) {
        this.f39577a = str;
        this.f39578b = str2;
        this.f39579c = str3;
        this.f39580d = str4;
        this.f39581e = bool;
        this.f39582f = bool2;
        this.f39583g = bool3;
        this.f39584h = bool4;
        this.f39585i = bool5;
        this.f39586j = bool6;
        this.f39587k = bool7;
        this.f39588l = bool8;
        this.f39589m = bool9;
        this.f39590n = bool10;
        this.f39591o = bool11;
        this.f39592p = bool12;
        this.f39593q = bool13;
        this.f39594r = bool14;
        this.f39595s = bool15;
        this.f39596t = str5;
        this.f39597u = str6;
        this.f39598v = str7;
        this.f39599w = str8;
        this.f39600x = str9;
        this.f39601y = str10;
        this.f39602z = zArr;
    }
}
