package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kc0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39385a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39386b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("additional_data")
    private p0 f39387c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("aggregate_rating")
    private v2 f39388d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("categorized_ingredients")
    private List<kc> f39389e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("cook_times")
    private kf f39390f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("diets")
    private List<String> f39391g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("from_aggregated_data")
    private Boolean f39392h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("name")
    private String f39393i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("servings_summary")
    private th0 f39394j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f39395k;

    public /* synthetic */ kc0(String str, String str2, p0 p0Var, v2 v2Var, List list, kf kfVar, List list2, Boolean bool, String str3, th0 th0Var, boolean[] zArr, int i13) {
        this(str, str2, p0Var, v2Var, list, kfVar, list2, bool, str3, th0Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kc0 kc0Var = (kc0) obj;
        return Objects.equals(this.f39392h, kc0Var.f39392h) && Objects.equals(this.f39385a, kc0Var.f39385a) && Objects.equals(this.f39386b, kc0Var.f39386b) && Objects.equals(this.f39387c, kc0Var.f39387c) && Objects.equals(this.f39388d, kc0Var.f39388d) && Objects.equals(this.f39389e, kc0Var.f39389e) && Objects.equals(this.f39390f, kc0Var.f39390f) && Objects.equals(this.f39391g, kc0Var.f39391g) && Objects.equals(this.f39393i, kc0Var.f39393i) && Objects.equals(this.f39394j, kc0Var.f39394j);
    }

    public final int hashCode() {
        return Objects.hash(this.f39385a, this.f39386b, this.f39387c, this.f39388d, this.f39389e, this.f39390f, this.f39391g, this.f39392h, this.f39393i, this.f39394j);
    }

    public final List k() {
        return this.f39389e;
    }

    public final kf l() {
        return this.f39390f;
    }

    public final List m() {
        return this.f39391g;
    }

    public final Boolean n() {
        Boolean bool = this.f39392h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String o() {
        return this.f39393i;
    }

    public final th0 p() {
        return this.f39394j;
    }

    public final String q() {
        return this.f39385a;
    }

    public kc0() {
        this.f39395k = new boolean[10];
    }

    private kc0(@NonNull String str, String str2, p0 p0Var, v2 v2Var, List<kc> list, kf kfVar, List<String> list2, Boolean bool, String str3, th0 th0Var, boolean[] zArr) {
        this.f39385a = str;
        this.f39386b = str2;
        this.f39387c = p0Var;
        this.f39388d = v2Var;
        this.f39389e = list;
        this.f39390f = kfVar;
        this.f39391g = list2;
        this.f39392h = bool;
        this.f39393i = str3;
        this.f39394j = th0Var;
        this.f39395k = zArr;
    }
}
