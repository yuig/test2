package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class bt0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36189a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36190b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("ad_unit_ids")
    private List<String> f36191c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("country_allow_list")
    private List<String> f36192d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("country_deny_list")
    private List<String> f36193e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("enable_header_compression")
    private Boolean f36194f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("load")
    private Boolean f36195g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("publisher_id")
    private String f36196h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("qi_cache_size")
    private Integer f36197i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("qi_ttl_seconds")
    private Integer f36198j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("surface_ad_unit_config")
    private jt0 f36199k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("surface_ad_unit_ids")
    private nt0 f36200l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("surface_header_size")
    private rt0 f36201m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("ttl_seconds")
    private Integer f36202n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f36203o;

    public /* synthetic */ bt0(String str, String str2, List list, List list2, List list3, Boolean bool, Boolean bool2, String str3, Integer num, Integer num2, jt0 jt0Var, nt0 nt0Var, rt0 rt0Var, Integer num3, boolean[] zArr, int i13) {
        this(str, str2, list, list2, list3, bool, bool2, str3, num, num2, jt0Var, nt0Var, rt0Var, num3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bt0 bt0Var = (bt0) obj;
        return Objects.equals(this.f36202n, bt0Var.f36202n) && Objects.equals(this.f36198j, bt0Var.f36198j) && Objects.equals(this.f36197i, bt0Var.f36197i) && Objects.equals(this.f36195g, bt0Var.f36195g) && Objects.equals(this.f36194f, bt0Var.f36194f) && Objects.equals(this.f36189a, bt0Var.f36189a) && Objects.equals(this.f36190b, bt0Var.f36190b) && Objects.equals(this.f36191c, bt0Var.f36191c) && Objects.equals(this.f36192d, bt0Var.f36192d) && Objects.equals(this.f36193e, bt0Var.f36193e) && Objects.equals(this.f36196h, bt0Var.f36196h) && Objects.equals(this.f36199k, bt0Var.f36199k) && Objects.equals(this.f36200l, bt0Var.f36200l) && Objects.equals(this.f36201m, bt0Var.f36201m);
    }

    public final int hashCode() {
        return Objects.hash(this.f36189a, this.f36190b, this.f36191c, this.f36192d, this.f36193e, this.f36194f, this.f36195g, this.f36196h, this.f36197i, this.f36198j, this.f36199k, this.f36200l, this.f36201m, this.f36202n);
    }

    public final List o() {
        return this.f36191c;
    }

    public final List p() {
        return this.f36192d;
    }

    public final List q() {
        return this.f36193e;
    }

    public final Boolean r() {
        Boolean bool = this.f36194f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean s() {
        Boolean bool = this.f36195g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer t() {
        Integer num = this.f36197i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer u() {
        Integer num = this.f36198j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final jt0 v() {
        return this.f36199k;
    }

    public final nt0 w() {
        return this.f36200l;
    }

    public final rt0 x() {
        return this.f36201m;
    }

    public final Integer y() {
        Integer num = this.f36202n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public bt0() {
        this.f36203o = new boolean[14];
    }

    private bt0(@NonNull String str, String str2, List<String> list, List<String> list2, List<String> list3, Boolean bool, Boolean bool2, String str3, Integer num, Integer num2, jt0 jt0Var, nt0 nt0Var, rt0 rt0Var, Integer num3, boolean[] zArr) {
        this.f36189a = str;
        this.f36190b = str2;
        this.f36191c = list;
        this.f36192d = list2;
        this.f36193e = list3;
        this.f36194f = bool;
        this.f36195g = bool2;
        this.f36196h = str3;
        this.f36197i = num;
        this.f36198j = num2;
        this.f36199k = jt0Var;
        this.f36200l = nt0Var;
        this.f36201m = rt0Var;
        this.f36202n = num3;
        this.f36203o = zArr;
    }
}
