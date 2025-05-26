package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("industry_product_id")
    private String f35936a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("industry_product_id_type")
    private String f35937b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("platform")
    private String f35938c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("platform_id")
    private Integer f35939d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("retailers")
    private List<f1> f35940e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f35941f;

    public /* synthetic */ b1(String str, String str2, String str3, Integer num, List list, boolean[] zArr, int i13) {
        this(str, str2, str3, num, list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Objects.equals(this.f35939d, b1Var.f35939d) && Objects.equals(this.f35936a, b1Var.f35936a) && Objects.equals(this.f35937b, b1Var.f35937b) && Objects.equals(this.f35938c, b1Var.f35938c) && Objects.equals(this.f35940e, b1Var.f35940e);
    }

    public final String f() {
        return this.f35936a;
    }

    public final String g() {
        return this.f35938c;
    }

    public final Integer h() {
        Integer num = this.f35939d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f35936a, this.f35937b, this.f35938c, this.f35939d, this.f35940e);
    }

    public final List i() {
        return this.f35940e;
    }

    public b1() {
        this.f35941f = new boolean[5];
    }

    private b1(String str, String str2, String str3, Integer num, List<f1> list, boolean[] zArr) {
        this.f35936a = str;
        this.f35937b = str2;
        this.f35938c = str3;
        this.f35939d = num;
        this.f35940e = list;
        this.f35941f = zArr;
    }
}
