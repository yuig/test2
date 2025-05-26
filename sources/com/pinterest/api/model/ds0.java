package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ds0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("answers")
    private List<jr0> f36937a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("background_color")
    private String f36938b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("conditionals")
    private List<sr0> f36939c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("end_survey")
    private Boolean f36940d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36941e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("layout")
    private String f36942f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("max_num_answers")
    private Double f36943g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("min_num_answers")
    private Double f36944h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("required")
    private Boolean f36945i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("skip_to")
    private String f36946j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("story")
    private Map<String, Object> f36947k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("text")
    private String f36948l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f36949m;

    public /* synthetic */ ds0(List list, String str, List list2, Boolean bool, String str2, String str3, Double d2, Double d13, Boolean bool2, String str4, Map map, String str5, boolean[] zArr, int i13) {
        this(list, str, list2, bool, str2, str3, d2, d13, bool2, str4, map, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ds0 ds0Var = (ds0) obj;
        return Objects.equals(this.f36945i, ds0Var.f36945i) && Objects.equals(this.f36944h, ds0Var.f36944h) && Objects.equals(this.f36943g, ds0Var.f36943g) && Objects.equals(this.f36940d, ds0Var.f36940d) && Objects.equals(this.f36937a, ds0Var.f36937a) && Objects.equals(this.f36938b, ds0Var.f36938b) && Objects.equals(this.f36939c, ds0Var.f36939c) && Objects.equals(this.f36941e, ds0Var.f36941e) && Objects.equals(this.f36942f, ds0Var.f36942f) && Objects.equals(this.f36946j, ds0Var.f36946j) && Objects.equals(this.f36947k, ds0Var.f36947k) && Objects.equals(this.f36948l, ds0Var.f36948l);
    }

    public final int hashCode() {
        return Objects.hash(this.f36937a, this.f36938b, this.f36939c, this.f36940d, this.f36941e, this.f36942f, this.f36943g, this.f36944h, this.f36945i, this.f36946j, this.f36947k, this.f36948l);
    }

    public final List m() {
        return this.f36937a;
    }

    public final String n() {
        return this.f36938b;
    }

    public final List o() {
        return this.f36939c;
    }

    public final Boolean p() {
        Boolean bool = this.f36940d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String q() {
        return this.f36942f;
    }

    public final Double r() {
        Double d2 = this.f36943g;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double s() {
        Double d2 = this.f36944h;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean t() {
        Boolean bool = this.f36945i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String u() {
        return this.f36946j;
    }

    public final Map v() {
        return this.f36947k;
    }

    public final String w() {
        return this.f36948l;
    }

    public final String x() {
        return this.f36941e;
    }

    public ds0() {
        this.f36949m = new boolean[12];
    }

    private ds0(List<jr0> list, String str, List<sr0> list2, Boolean bool, @NonNull String str2, String str3, Double d2, Double d13, Boolean bool2, String str4, Map<String, Object> map, String str5, boolean[] zArr) {
        this.f36937a = list;
        this.f36938b = str;
        this.f36939c = list2;
        this.f36940d = bool;
        this.f36941e = str2;
        this.f36942f = str3;
        this.f36943g = d2;
        this.f36944h = d13;
        this.f36945i = bool2;
        this.f36946j = str4;
        this.f36947k = map;
        this.f36948l = str5;
        this.f36949m = zArr;
    }
}
