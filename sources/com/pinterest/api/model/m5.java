package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class m5 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("delta")
    private Double f39999a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("is_realtime")
    private Boolean f40000b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("latest_available_timestamp")
    private Double f40001c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("num_of_days")
    private Integer f40002d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("value")
    private Double f40003e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f40004f;

    public /* synthetic */ m5(Double d2, Boolean bool, Double d13, Integer num, Double d14, boolean[] zArr, int i13) {
        this(d2, bool, d13, num, d14, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return Objects.equals(this.f40003e, m5Var.f40003e) && Objects.equals(this.f40002d, m5Var.f40002d) && Objects.equals(this.f40001c, m5Var.f40001c) && Objects.equals(this.f40000b, m5Var.f40000b) && Objects.equals(this.f39999a, m5Var.f39999a);
    }

    public final Double f() {
        Double d2 = this.f39999a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean g() {
        Boolean bool = this.f40000b;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Double h() {
        Double d2 = this.f40001c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f39999a, this.f40000b, this.f40001c, this.f40002d, this.f40003e);
    }

    public final Integer i() {
        Integer num = this.f40002d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Double j() {
        Double d2 = this.f40003e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public m5() {
        this.f40004f = new boolean[5];
    }

    private m5(Double d2, Boolean bool, Double d13, Integer num, Double d14, boolean[] zArr) {
        this.f39999a = d2;
        this.f40000b = bool;
        this.f40001c = d13;
        this.f40002d = num;
        this.f40003e = d14;
        this.f40004f = zArr;
    }
}
