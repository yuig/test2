package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ud0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("corner_radius")
    private Double f42518a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("height")
    private Double f42519b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("width")
    private Double f42520c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("x_coord")
    private Double f42521d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("y_coord")
    private Double f42522e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f42523f;

    public /* synthetic */ ud0(Double d2, Double d13, Double d14, Double d15, Double d16, boolean[] zArr, int i13) {
        this(d2, d13, d14, d15, d16, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ud0 ud0Var = (ud0) obj;
        return Objects.equals(this.f42522e, ud0Var.f42522e) && Objects.equals(this.f42521d, ud0Var.f42521d) && Objects.equals(this.f42520c, ud0Var.f42520c) && Objects.equals(this.f42519b, ud0Var.f42519b) && Objects.equals(this.f42518a, ud0Var.f42518a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42518a, this.f42519b, this.f42520c, this.f42521d, this.f42522e);
    }

    public ud0() {
        this.f42523f = new boolean[5];
    }

    private ud0(Double d2, Double d13, Double d14, Double d15, Double d16, boolean[] zArr) {
        this.f42518a = d2;
        this.f42519b = d13;
        this.f42520c = d14;
        this.f42521d = d15;
        this.f42522e = d16;
        this.f42523f = zArr;
    }
}
