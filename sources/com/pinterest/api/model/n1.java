package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class n1 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("access_token")
    private String f40278a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("expires_in_timestamp")
    private Integer f40279b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("temporary_token")
    private Boolean f40280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f40281d;

    public /* synthetic */ n1(String str, Integer num, Boolean bool, boolean[] zArr, int i13) {
        this(str, num, bool, zArr);
    }

    public final String d() {
        return this.f40278a;
    }

    public final Boolean e() {
        Boolean bool = this.f40280c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Objects.equals(this.f40280c, n1Var.f40280c) && Objects.equals(this.f40279b, n1Var.f40279b) && Objects.equals(this.f40278a, n1Var.f40278a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40278a, this.f40279b, this.f40280c);
    }

    public n1() {
        this.f40281d = new boolean[3];
    }

    private n1(String str, Integer num, Boolean bool, boolean[] zArr) {
        this.f40278a = str;
        this.f40279b = num;
        this.f40280c = bool;
        this.f40281d = zArr;
    }
}
