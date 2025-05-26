package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("PIN_PROMOTION_ID")
    private Double f41461a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("SPEND_IN_DOLLAR")
    private Double f41462b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("TOTAL_CLICKTHROUGH")
    private Integer f41463c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("TOTAL_IMPRESSION")
    private Integer f41464d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("TOTAL_REPIN")
    private Integer f41465e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41466f;

    public /* synthetic */ r1(Double d2, Double d13, Integer num, Integer num2, Integer num3, boolean[] zArr, int i13) {
        this(d2, d13, num, num2, num3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return Objects.equals(this.f41465e, r1Var.f41465e) && Objects.equals(this.f41464d, r1Var.f41464d) && Objects.equals(this.f41463c, r1Var.f41463c) && Objects.equals(this.f41462b, r1Var.f41462b) && Objects.equals(this.f41461a, r1Var.f41461a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41461a, this.f41462b, this.f41463c, this.f41464d, this.f41465e);
    }

    public r1() {
        this.f41466f = new boolean[5];
    }

    private r1(Double d2, Double d13, Integer num, Integer num2, Integer num3, boolean[] zArr) {
        this.f41461a = d2;
        this.f41462b = d13;
        this.f41463c = num;
        this.f41464d = num2;
        this.f41465e = num3;
        this.f41466f = zArr;
    }
}
