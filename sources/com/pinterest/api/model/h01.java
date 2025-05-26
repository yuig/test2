package com.pinterest.api.model;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class h01 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("bitrate")
    private Double f38225a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("captions_urls")
    private Map<String, String> f38226b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("duration")
    private Double f38227c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("height")
    private Double f38228d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("manifest")
    private String f38229e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("thumbnail")
    private String f38230f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("transcoded_height")
    private Double f38231g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("transcoded_width")
    private Double f38232h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("url")
    private String f38233i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("width")
    private Double f38234j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean[] f38235k;

    public /* synthetic */ h01(Double d2, Map map, Double d13, Double d14, String str, String str2, Double d15, Double d16, String str3, Double d17, boolean[] zArr, int i13) {
        this(d2, map, d13, d14, str, str2, d15, d16, str3, d17, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h01 h01Var = (h01) obj;
        return Objects.equals(this.f38234j, h01Var.f38234j) && Objects.equals(this.f38232h, h01Var.f38232h) && Objects.equals(this.f38231g, h01Var.f38231g) && Objects.equals(this.f38228d, h01Var.f38228d) && Objects.equals(this.f38227c, h01Var.f38227c) && Objects.equals(this.f38225a, h01Var.f38225a) && Objects.equals(this.f38226b, h01Var.f38226b) && Objects.equals(this.f38229e, h01Var.f38229e) && Objects.equals(this.f38230f, h01Var.f38230f) && Objects.equals(this.f38233i, h01Var.f38233i);
    }

    public final int hashCode() {
        return Objects.hash(this.f38225a, this.f38226b, this.f38227c, this.f38228d, this.f38229e, this.f38230f, this.f38231g, this.f38232h, this.f38233i, this.f38234j);
    }

    public final Double k() {
        Double d2 = this.f38225a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Map l() {
        return this.f38226b;
    }

    public final Double m() {
        Double d2 = this.f38227c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double n() {
        Double d2 = this.f38228d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String o() {
        return this.f38229e;
    }

    public final String p() {
        return this.f38230f;
    }

    public final Double q() {
        Double d2 = this.f38231g;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double r() {
        Double d2 = this.f38232h;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String s() {
        return this.f38233i;
    }

    public final Double t() {
        Double d2 = this.f38234j;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public h01() {
        this.f38235k = new boolean[10];
    }

    private h01(Double d2, Map<String, String> map, Double d13, Double d14, String str, String str2, Double d15, Double d16, String str3, Double d17, boolean[] zArr) {
        this.f38225a = d2;
        this.f38226b = map;
        this.f38227c = d13;
        this.f38228d = d14;
        this.f38229e = str;
        this.f38230f = str2;
        this.f38231g = d15;
        this.f38232h = d16;
        this.f38233i = str3;
        this.f38234j = d17;
        this.f38235k = zArr;
    }
}
