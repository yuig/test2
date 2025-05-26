package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class h2 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38236a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38237b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f38238c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("category_id")
    private String f38239d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("h")
    private Double f38240e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("label")
    private String f38241f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("slot_id")
    private Integer f38242g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("thumbnail_url")
    private String f38243h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("w")
    private Double f38244i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("x")
    private Double f38245j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("y")
    private Double f38246k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f38247l;

    public /* synthetic */ h2(String str, String str2, String str3, String str4, Double d2, String str5, Integer num, String str6, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, d2, str5, num, str6, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Objects.equals(this.f38246k, h2Var.f38246k) && Objects.equals(this.f38245j, h2Var.f38245j) && Objects.equals(this.f38244i, h2Var.f38244i) && Objects.equals(this.f38242g, h2Var.f38242g) && Objects.equals(this.f38240e, h2Var.f38240e) && Objects.equals(this.f38236a, h2Var.f38236a) && Objects.equals(this.f38237b, h2Var.f38237b) && Objects.equals(this.f38238c, h2Var.f38238c) && Objects.equals(this.f38239d, h2Var.f38239d) && Objects.equals(this.f38241f, h2Var.f38241f) && Objects.equals(this.f38243h, h2Var.f38243h);
    }

    public final int hashCode() {
        return Objects.hash(this.f38236a, this.f38237b, this.f38238c, this.f38239d, this.f38240e, this.f38241f, this.f38242g, this.f38243h, this.f38244i, this.f38245j, this.f38246k);
    }

    public final String l() {
        return this.f38238c;
    }

    public final String m() {
        return this.f38239d;
    }

    public final Double n() {
        Double d2 = this.f38240e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String o() {
        return this.f38241f;
    }

    public final Integer p() {
        Integer num = this.f38242g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String q() {
        return this.f38243h;
    }

    public final Double r() {
        Double d2 = this.f38244i;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double s() {
        Double d2 = this.f38245j;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double t() {
        Double d2 = this.f38246k;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public h2() {
        this.f38247l = new boolean[11];
    }

    private h2(@NonNull String str, String str2, String str3, String str4, Double d2, String str5, Integer num, String str6, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f38236a = str;
        this.f38237b = str2;
        this.f38238c = str3;
        this.f38239d = str4;
        this.f38240e = d2;
        this.f38241f = str5;
        this.f38242g = num;
        this.f38243h = str6;
        this.f38244i = d13;
        this.f38245j = d14;
        this.f38246k = d15;
        this.f38247l = zArr;
    }
}
