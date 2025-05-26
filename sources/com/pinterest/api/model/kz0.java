package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class kz0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("recommendation_reason_description")
    private String f39567a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("recommendation_reason_details")
    private String f39568b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("recommendation_reason_type")
    private Integer f39569c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f39570d;

    public /* synthetic */ kz0(String str, String str2, Integer num, boolean[] zArr, int i13) {
        this(str, str2, num, zArr);
    }

    public final String d() {
        return this.f39567a;
    }

    public final String e() {
        return this.f39568b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        return Objects.equals(this.f39569c, kz0Var.f39569c) && Objects.equals(this.f39567a, kz0Var.f39567a) && Objects.equals(this.f39568b, kz0Var.f39568b);
    }

    public final Integer f() {
        Integer num = this.f39569c;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f39567a, this.f39568b, this.f39569c);
    }

    public kz0() {
        this.f39570d = new boolean[3];
    }

    private kz0(String str, String str2, Integer num, boolean[] zArr) {
        this.f39567a = str;
        this.f39568b = str2;
        this.f39569c = num;
        this.f39570d = zArr;
    }
}
