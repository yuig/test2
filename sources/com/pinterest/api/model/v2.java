package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("best_rating")
    private String f42715a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("id")
    private String f42716b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("name")
    private String f42717c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("rating_count")
    private Integer f42718d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("rating_value")
    private String f42719e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("review_count")
    private Integer f42720f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f42721g;

    public /* synthetic */ v2(String str, String str2, String str3, Integer num, String str4, Integer num2, boolean[] zArr, int i13) {
        this(str, str2, str3, num, str4, num2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return Objects.equals(this.f42720f, v2Var.f42720f) && Objects.equals(this.f42718d, v2Var.f42718d) && Objects.equals(this.f42715a, v2Var.f42715a) && Objects.equals(this.f42716b, v2Var.f42716b) && Objects.equals(this.f42717c, v2Var.f42717c) && Objects.equals(this.f42719e, v2Var.f42719e);
    }

    public final Integer g() {
        Integer num = this.f42718d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String h() {
        return this.f42719e;
    }

    public final int hashCode() {
        return Objects.hash(this.f42715a, this.f42716b, this.f42717c, this.f42718d, this.f42719e, this.f42720f);
    }

    public final Integer i() {
        Integer num = this.f42720f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public v2() {
        this.f42721g = new boolean[6];
    }

    private v2(String str, String str2, String str3, Integer num, String str4, Integer num2, boolean[] zArr) {
        this.f42715a = str;
        this.f42716b = str2;
        this.f42717c = str3;
        this.f42718d = num;
        this.f42719e = str4;
        this.f42720f = num2;
        this.f42721g = zArr;
    }
}
