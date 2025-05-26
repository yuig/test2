package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class jr0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("end_survey")
    private Boolean f39127a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("feed_forward")
    private String f39128b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("is_exclusive")
    private Boolean f39129c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("skip_to")
    private String f39130d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("text")
    private String f39131e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("value")
    private Double f39132f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39133g;

    public /* synthetic */ jr0(Boolean bool, String str, Boolean bool2, String str2, String str3, Double d2, boolean[] zArr, int i13) {
        this(bool, str, bool2, str2, str3, d2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jr0 jr0Var = (jr0) obj;
        return Objects.equals(this.f39132f, jr0Var.f39132f) && Objects.equals(this.f39129c, jr0Var.f39129c) && Objects.equals(this.f39127a, jr0Var.f39127a) && Objects.equals(this.f39128b, jr0Var.f39128b) && Objects.equals(this.f39130d, jr0Var.f39130d) && Objects.equals(this.f39131e, jr0Var.f39131e);
    }

    public final Boolean g() {
        Boolean bool = this.f39127a;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String h() {
        return this.f39128b;
    }

    public final int hashCode() {
        return Objects.hash(this.f39127a, this.f39128b, this.f39129c, this.f39130d, this.f39131e, this.f39132f);
    }

    public final Boolean i() {
        Boolean bool = this.f39129c;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String j() {
        return this.f39130d;
    }

    public final String k() {
        return this.f39131e;
    }

    public final Double l() {
        Double d2 = this.f39132f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public jr0() {
        this.f39133g = new boolean[6];
    }

    private jr0(Boolean bool, String str, Boolean bool2, String str2, String str3, Double d2, boolean[] zArr) {
        this.f39127a = bool;
        this.f39128b = str;
        this.f39129c = bool2;
        this.f39130d = str2;
        this.f39131e = str3;
        this.f39132f = d2;
        this.f39133g = zArr;
    }
}
