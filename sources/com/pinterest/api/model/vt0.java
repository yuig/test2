package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class vt0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("failure_tracking_url")
    private String f42978a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("framework")
    private Integer f42979b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("params")
    private String f42980c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("script_url")
    private String f42981d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("vendor")
    private String f42982e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42983f;

    public /* synthetic */ vt0(String str, Integer num, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, num, str2, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vt0 vt0Var = (vt0) obj;
        return Objects.equals(this.f42979b, vt0Var.f42979b) && Objects.equals(this.f42978a, vt0Var.f42978a) && Objects.equals(this.f42980c, vt0Var.f42980c) && Objects.equals(this.f42981d, vt0Var.f42981d) && Objects.equals(this.f42982e, vt0Var.f42982e);
    }

    public final String f() {
        return this.f42978a;
    }

    public final Integer g() {
        Integer num = this.f42979b;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String h() {
        return this.f42980c;
    }

    public final int hashCode() {
        return Objects.hash(this.f42978a, this.f42979b, this.f42980c, this.f42981d, this.f42982e);
    }

    public final String i() {
        return this.f42981d;
    }

    public final String j() {
        return this.f42982e;
    }

    public vt0() {
        this.f42983f = new boolean[5];
    }

    private vt0(String str, Integer num, String str2, String str3, String str4, boolean[] zArr) {
        this.f42978a = str;
        this.f42979b = num;
        this.f42980c = str2;
        this.f42981d = str3;
        this.f42982e = str4;
        this.f42983f = zArr;
    }
}
