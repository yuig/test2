package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class iq0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("alignment")
    private Integer f38847a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("color")
    private Integer f38848b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("font")
    private yl0 f38849c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("font_id")
    private Integer f38850d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("font_size")
    private Double f38851e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("hex_color")
    private String f38852f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("highlight_color")
    private String f38853g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("vertical_alignment")
    private Integer f38854h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f38855i;

    public /* synthetic */ iq0(Integer num, Integer num2, yl0 yl0Var, Integer num3, Double d2, String str, String str2, Integer num4, boolean[] zArr, int i13) {
        this(num, num2, yl0Var, num3, d2, str, str2, num4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iq0 iq0Var = (iq0) obj;
        return Objects.equals(this.f38854h, iq0Var.f38854h) && Objects.equals(this.f38851e, iq0Var.f38851e) && Objects.equals(this.f38850d, iq0Var.f38850d) && Objects.equals(this.f38848b, iq0Var.f38848b) && Objects.equals(this.f38847a, iq0Var.f38847a) && Objects.equals(this.f38849c, iq0Var.f38849c) && Objects.equals(this.f38852f, iq0Var.f38852f) && Objects.equals(this.f38853g, iq0Var.f38853g);
    }

    public final int hashCode() {
        return Objects.hash(this.f38847a, this.f38848b, this.f38849c, this.f38850d, this.f38851e, this.f38852f, this.f38853g, this.f38854h);
    }

    public final Integer i() {
        Integer num = this.f38847a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final yl0 j() {
        return this.f38849c;
    }

    public final Double k() {
        Double d2 = this.f38851e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String l() {
        return this.f38852f;
    }

    public final String m() {
        return this.f38853g;
    }

    public final Integer n() {
        Integer num = this.f38854h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public iq0() {
        this.f38855i = new boolean[8];
    }

    private iq0(Integer num, Integer num2, yl0 yl0Var, Integer num3, Double d2, String str, String str2, Integer num4, boolean[] zArr) {
        this.f38847a = num;
        this.f38848b = num2;
        this.f38849c = yl0Var;
        this.f38850d = num3;
        this.f38851e = d2;
        this.f38852f = str;
        this.f38853g = str2;
        this.f38854h = num4;
        this.f38855i = zArr;
    }
}
