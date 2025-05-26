package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class zk0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("corner_radius")
    private Double f44374a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("height")
    private Double f44375b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("rotation")
    private Double f44376c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("width")
    private Double f44377d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("x_coord")
    private Double f44378e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("y_coord")
    private Double f44379f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f44380g;

    public /* synthetic */ zk0(Double d2, Double d13, Double d14, Double d15, Double d16, Double d17, boolean[] zArr, int i13) {
        this(d2, d13, d14, d15, d16, d17, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zk0 zk0Var = (zk0) obj;
        return Objects.equals(this.f44379f, zk0Var.f44379f) && Objects.equals(this.f44378e, zk0Var.f44378e) && Objects.equals(this.f44377d, zk0Var.f44377d) && Objects.equals(this.f44376c, zk0Var.f44376c) && Objects.equals(this.f44375b, zk0Var.f44375b) && Objects.equals(this.f44374a, zk0Var.f44374a);
    }

    public final Double g() {
        Double d2 = this.f44374a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double h() {
        Double d2 = this.f44375b;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f44374a, this.f44375b, this.f44376c, this.f44377d, this.f44378e, this.f44379f);
    }

    public final Double i() {
        Double d2 = this.f44376c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double j() {
        Double d2 = this.f44377d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double k() {
        Double d2 = this.f44378e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double l() {
        Double d2 = this.f44379f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public zk0() {
        this.f44380g = new boolean[6];
    }

    private zk0(Double d2, Double d13, Double d14, Double d15, Double d16, Double d17, boolean[] zArr) {
        this.f44374a = d2;
        this.f44375b = d13;
        this.f44376c = d14;
        this.f44377d = d15;
        this.f44378e = d16;
        this.f44379f = d17;
        this.f44380g = zArr;
    }
}
