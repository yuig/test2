package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class lj0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("height")
    private Double f39805a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("width")
    private Double f39806b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("x")
    private Double f39807c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("y")
    private Double f39808d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f39809e;

    public /* synthetic */ lj0(Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lj0 lj0Var = (lj0) obj;
        return Objects.equals(this.f39808d, lj0Var.f39808d) && Objects.equals(this.f39807c, lj0Var.f39807c) && Objects.equals(this.f39806b, lj0Var.f39806b) && Objects.equals(this.f39805a, lj0Var.f39805a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39805a, this.f39806b, this.f39807c, this.f39808d);
    }

    public lj0() {
        this.f39809e = new boolean[4];
    }

    private lj0(Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f39805a = d2;
        this.f39806b = d13;
        this.f39807c = d14;
        this.f39808d = d15;
        this.f39809e = zArr;
    }
}
