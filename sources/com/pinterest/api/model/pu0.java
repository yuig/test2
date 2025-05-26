package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class pu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41102a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41103b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("animations")
    private List<tu0> f41104c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("begin_frame")
    private Integer f41105d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("end_frame")
    private Integer f41106e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("frame_corner_radius")
    private Double f41107f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("media_id")
    private String f41108g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    @om.b("media_type")
    private rv0 f41109h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("related_rect_frame_width")
    private Double f41110i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("related_rect_origin_x")
    private Double f41111j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("related_rect_origin_y")
    private Double f41112k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("related_rect_rame_height")
    private Double f41113l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f41114m;

    public /* synthetic */ pu0(String str, String str2, List list, Integer num, Integer num2, Double d2, String str3, rv0 rv0Var, Double d13, Double d14, Double d15, Double d16, boolean[] zArr, int i13) {
        this(str, str2, list, num, num2, d2, str3, rv0Var, d13, d14, d15, d16, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pu0 pu0Var = (pu0) obj;
        return Objects.equals(this.f41113l, pu0Var.f41113l) && Objects.equals(this.f41112k, pu0Var.f41112k) && Objects.equals(this.f41111j, pu0Var.f41111j) && Objects.equals(this.f41110i, pu0Var.f41110i) && Objects.equals(this.f41107f, pu0Var.f41107f) && Objects.equals(this.f41106e, pu0Var.f41106e) && Objects.equals(this.f41105d, pu0Var.f41105d) && Objects.equals(this.f41102a, pu0Var.f41102a) && Objects.equals(this.f41103b, pu0Var.f41103b) && Objects.equals(this.f41104c, pu0Var.f41104c) && Objects.equals(this.f41108g, pu0Var.f41108g) && Objects.equals(this.f41109h, pu0Var.f41109h);
    }

    public final int hashCode() {
        return Objects.hash(this.f41102a, this.f41103b, this.f41104c, this.f41105d, this.f41106e, this.f41107f, this.f41108g, this.f41109h, this.f41110i, this.f41111j, this.f41112k, this.f41113l);
    }

    public final List m() {
        return this.f41104c;
    }

    public final Integer n() {
        Integer num = this.f41105d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer o() {
        Integer num = this.f41106e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Double p() {
        Double d2 = this.f41107f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String q() {
        return this.f41108g;
    }

    public final rv0 r() {
        return this.f41109h;
    }

    public final Double s() {
        Double d2 = this.f41110i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double t() {
        Double d2 = this.f41111j;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double u() {
        Double d2 = this.f41112k;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double v() {
        Double d2 = this.f41113l;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String w() {
        return this.f41102a;
    }

    public pu0() {
        this.f41114m = new boolean[12];
    }

    private pu0(@NonNull String str, String str2, @NonNull List<tu0> list, Integer num, Integer num2, Double d2, @NonNull String str3, @NonNull rv0 rv0Var, Double d13, Double d14, Double d15, Double d16, boolean[] zArr) {
        this.f41102a = str;
        this.f41103b = str2;
        this.f41104c = list;
        this.f41105d = num;
        this.f41106e = num2;
        this.f41107f = d2;
        this.f41108g = str3;
        this.f41109h = rv0Var;
        this.f41110i = d13;
        this.f41111j = d14;
        this.f41112k = d15;
        this.f41113l = d16;
        this.f41114m = zArr;
    }
}
