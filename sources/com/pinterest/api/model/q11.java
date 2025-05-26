package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class q11 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41171a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41172b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("detection")
    private Boolean f41173c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("h")
    private Double f41174d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("index")
    private Integer f41175e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_stela")
    private Boolean f41176f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("label")
    private String f41177g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("label_x")
    private Double f41178h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("label_y")
    private Double f41179i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("score")
    private Double f41180j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("title")
    private String f41181k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("w")
    private Double f41182l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("x")
    private Double f41183m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("y")
    private Double f41184n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f41185o;

    public /* synthetic */ q11(String str, String str2, Boolean bool, Double d2, Integer num, Boolean bool2, String str3, Double d13, Double d14, Double d15, String str4, Double d16, Double d17, Double d18, boolean[] zArr, int i13) {
        this(str, str2, bool, d2, num, bool2, str3, d13, d14, d15, str4, d16, d17, d18, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q11 q11Var = (q11) obj;
        return Objects.equals(this.f41184n, q11Var.f41184n) && Objects.equals(this.f41183m, q11Var.f41183m) && Objects.equals(this.f41182l, q11Var.f41182l) && Objects.equals(this.f41180j, q11Var.f41180j) && Objects.equals(this.f41179i, q11Var.f41179i) && Objects.equals(this.f41178h, q11Var.f41178h) && Objects.equals(this.f41176f, q11Var.f41176f) && Objects.equals(this.f41175e, q11Var.f41175e) && Objects.equals(this.f41174d, q11Var.f41174d) && Objects.equals(this.f41173c, q11Var.f41173c) && Objects.equals(this.f41171a, q11Var.f41171a) && Objects.equals(this.f41172b, q11Var.f41172b) && Objects.equals(this.f41177g, q11Var.f41177g) && Objects.equals(this.f41181k, q11Var.f41181k);
    }

    public final int hashCode() {
        return Objects.hash(this.f41171a, this.f41172b, this.f41173c, this.f41174d, this.f41175e, this.f41176f, this.f41177g, this.f41178h, this.f41179i, this.f41180j, this.f41181k, this.f41182l, this.f41183m, this.f41184n);
    }

    public final Double o() {
        Double d2 = this.f41174d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean p() {
        Boolean bool = this.f41176f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String q() {
        return this.f41177g;
    }

    public final String r() {
        return this.f41181k;
    }

    public final Double s() {
        Double d2 = this.f41182l;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double t() {
        Double d2 = this.f41183m;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double u() {
        Double d2 = this.f41184n;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public q11() {
        this.f41185o = new boolean[14];
    }

    private q11(@NonNull String str, String str2, Boolean bool, Double d2, Integer num, Boolean bool2, String str3, Double d13, Double d14, Double d15, String str4, Double d16, Double d17, Double d18, boolean[] zArr) {
        this.f41171a = str;
        this.f41172b = str2;
        this.f41173c = bool;
        this.f41174d = d2;
        this.f41175e = num;
        this.f41176f = bool2;
        this.f41177g = str3;
        this.f41178h = d13;
        this.f41179i = d14;
        this.f41180j = d15;
        this.f41181k = str4;
        this.f41182l = d16;
        this.f41183m = d17;
        this.f41184n = d18;
        this.f41185o = zArr;
    }
}
