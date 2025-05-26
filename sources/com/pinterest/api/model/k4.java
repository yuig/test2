package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class k4 {
    public final boolean[] A;

    /* renamed from: a, reason: collision with root package name */
    @om.b("CLICKTHROUGH")
    private Double f39262a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("CLOSEUP")
    private Double f39263b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("ENGAGEMENT")
    private Double f39264c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("ENGAGEMENT_RATE")
    private Double f39265d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("ENGAGERS")
    private Double f39266e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("IMPRESSION")
    private Double f39267f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("MONTHLY_ENGAGERS")
    private Double f39268g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("MONTHLY_TOTAL_AUDIENCE")
    private Double f39269h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("OUTBOUND_CLICK")
    private Double f39270i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("OUTBOUND_CLICK_RATE")
    private Double f39271j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("PIN_CLICK")
    private Double f39272k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("PIN_CLICK_RATE")
    private Double f39273l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("PRODUCT_TAG_CLICK")
    private Double f39274m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("PRODUCT_TAG_IMPRESSION")
    private Double f39275n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("PRODUCT_TAG_OUTBOUND_CLICK")
    private Double f39276o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("PRODUCT_TAG_SAVE")
    private Double f39277p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("PROFILE_VISIT")
    private Double f39278q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("QUARTILE_95_PERCENT_VIEW")
    private Double f39279r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("SAVE")
    private Double f39280s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("SAVE_RATE")
    private Double f39281t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("TOTAL_AUDIENCE")
    private Double f39282u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("USER_FOLLOW")
    private Double f39283v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("VIDEO_10S_VIEW")
    private Double f39284w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("VIDEO_AVG_WATCH_TIME")
    private Double f39285x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("VIDEO_MRC_VIEW")
    private Double f39286y;

    /* renamed from: z, reason: collision with root package name */
    @om.b("VIDEO_V50_WATCH_TIME")
    private Double f39287z;

    public /* synthetic */ k4(Double d2, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d23, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d33, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d43, Double d44, Double d45, Double d46, boolean[] zArr, int i13) {
        this(d2, d13, d14, d15, d16, d17, d18, d19, d23, d24, d25, d26, d27, d28, d29, d33, d34, d35, d36, d37, d38, d39, d43, d44, d45, d46, zArr);
    }

    public final Double A() {
        Double d2 = this.f39264c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double B() {
        Double d2 = this.f39267f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double C() {
        Double d2 = this.f39270i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double D() {
        Double d2 = this.f39272k;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double E() {
        Double d2 = this.f39279r;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double F() {
        Double d2 = this.f39280s;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double G() {
        Double d2 = this.f39284w;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double H() {
        Double d2 = this.f39285x;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double I() {
        Double d2 = this.f39286y;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double J() {
        Double d2 = this.f39287z;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return Objects.equals(this.f39287z, k4Var.f39287z) && Objects.equals(this.f39286y, k4Var.f39286y) && Objects.equals(this.f39285x, k4Var.f39285x) && Objects.equals(this.f39284w, k4Var.f39284w) && Objects.equals(this.f39283v, k4Var.f39283v) && Objects.equals(this.f39282u, k4Var.f39282u) && Objects.equals(this.f39281t, k4Var.f39281t) && Objects.equals(this.f39280s, k4Var.f39280s) && Objects.equals(this.f39279r, k4Var.f39279r) && Objects.equals(this.f39278q, k4Var.f39278q) && Objects.equals(this.f39277p, k4Var.f39277p) && Objects.equals(this.f39276o, k4Var.f39276o) && Objects.equals(this.f39275n, k4Var.f39275n) && Objects.equals(this.f39274m, k4Var.f39274m) && Objects.equals(this.f39273l, k4Var.f39273l) && Objects.equals(this.f39272k, k4Var.f39272k) && Objects.equals(this.f39271j, k4Var.f39271j) && Objects.equals(this.f39270i, k4Var.f39270i) && Objects.equals(this.f39269h, k4Var.f39269h) && Objects.equals(this.f39268g, k4Var.f39268g) && Objects.equals(this.f39267f, k4Var.f39267f) && Objects.equals(this.f39266e, k4Var.f39266e) && Objects.equals(this.f39265d, k4Var.f39265d) && Objects.equals(this.f39264c, k4Var.f39264c) && Objects.equals(this.f39263b, k4Var.f39263b) && Objects.equals(this.f39262a, k4Var.f39262a);
    }

    public final int hashCode() {
        return Objects.hash(this.f39262a, this.f39263b, this.f39264c, this.f39265d, this.f39266e, this.f39267f, this.f39268g, this.f39269h, this.f39270i, this.f39271j, this.f39272k, this.f39273l, this.f39274m, this.f39275n, this.f39276o, this.f39277p, this.f39278q, this.f39279r, this.f39280s, this.f39281t, this.f39282u, this.f39283v, this.f39284w, this.f39285x, this.f39286y, this.f39287z);
    }

    public k4() {
        this.A = new boolean[26];
    }

    private k4(Double d2, Double d13, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d23, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d33, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Double d43, Double d44, Double d45, Double d46, boolean[] zArr) {
        this.f39262a = d2;
        this.f39263b = d13;
        this.f39264c = d14;
        this.f39265d = d15;
        this.f39266e = d16;
        this.f39267f = d17;
        this.f39268g = d18;
        this.f39269h = d19;
        this.f39270i = d23;
        this.f39271j = d24;
        this.f39272k = d25;
        this.f39273l = d26;
        this.f39274m = d27;
        this.f39275n = d28;
        this.f39276o = d29;
        this.f39277p = d33;
        this.f39278q = d34;
        this.f39279r = d35;
        this.f39280s = d36;
        this.f39281t = d37;
        this.f39282u = d38;
        this.f39283v = d39;
        this.f39284w = d43;
        this.f39285x = d44;
        this.f39286y = d45;
        this.f39287z = d46;
        this.A = zArr;
    }
}
