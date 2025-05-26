package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class dj0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("alignment")
    private Double f36855a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("background_color_hex")
    private String f36856b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("color_hex")
    private String f36857c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("font_size")
    private Double f36858d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("font_type")
    private Double f36859e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("text")
    private String f36860f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36861g;

    public /* synthetic */ dj0(Double d2, String str, String str2, Double d13, Double d14, String str3, boolean[] zArr, int i13) {
        this(d2, str, str2, d13, d14, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dj0 dj0Var = (dj0) obj;
        return Objects.equals(this.f36859e, dj0Var.f36859e) && Objects.equals(this.f36858d, dj0Var.f36858d) && Objects.equals(this.f36855a, dj0Var.f36855a) && Objects.equals(this.f36856b, dj0Var.f36856b) && Objects.equals(this.f36857c, dj0Var.f36857c) && Objects.equals(this.f36860f, dj0Var.f36860f);
    }

    public final Double g() {
        Double d2 = this.f36855a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String h() {
        return this.f36856b;
    }

    public final int hashCode() {
        return Objects.hash(this.f36855a, this.f36856b, this.f36857c, this.f36858d, this.f36859e, this.f36860f);
    }

    public final String i() {
        return this.f36857c;
    }

    public final Double j() {
        Double d2 = this.f36858d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double k() {
        Double d2 = this.f36859e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String l() {
        return this.f36860f;
    }

    public dj0() {
        this.f36861g = new boolean[6];
    }

    private dj0(Double d2, String str, String str2, Double d13, Double d14, String str3, boolean[] zArr) {
        this.f36855a = d2;
        this.f36856b = str;
        this.f36857c = str2;
        this.f36858d = d13;
        this.f36859e = d14;
        this.f36860f = str3;
        this.f36861g = zArr;
    }
}
