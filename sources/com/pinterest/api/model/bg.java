package com.pinterest.api.model;

import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public class bg {

    /* renamed from: a, reason: collision with root package name */
    @om.b("full_screen_play")
    private Integer f36072a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("full_screen_playtime")
    private Double f36073b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("id")
    private String f36074c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("impression")
    private Integer f36075d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("is_realtime")
    private Boolean f36076e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_unified_pin")
    private Boolean f36077f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("outbound_click")
    private Integer f36078g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("pin_click")
    private Integer f36079h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("product_tag_click")
    private Integer f36080i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("product_tag_impression")
    private Integer f36081j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("product_tag_outbound_click")
    private Integer f36082k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("product_tag_save")
    private Integer f36083l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("profile_visit")
    private Integer f36084m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("save")
    private Integer f36085n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("timestamp")
    private Date f36086o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("user_follow")
    private Integer f36087p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("video_10s_view")
    private Integer f36088q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("video_average_time")
    private Integer f36089r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("video_p95_views")
    private Integer f36090s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("video_total_time")
    private Double f36091t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("video_views")
    private Integer f36092u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f36093v;

    public /* synthetic */ bg(Integer num, Double d2, String str, Integer num2, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Date date, Integer num11, Integer num12, Integer num13, Integer num14, Double d13, Integer num15, boolean[] zArr, int i13) {
        this(num, d2, str, num2, bool, bool2, num3, num4, num5, num6, num7, num8, num9, num10, date, num11, num12, num13, num14, d13, num15, zArr);
    }

    public final Integer A() {
        Integer num = this.f36084m;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer B() {
        Integer num = this.f36085n;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Date C() {
        return this.f36086o;
    }

    public final Integer D() {
        Integer num = this.f36087p;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer E() {
        Integer num = this.f36088q;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer F() {
        Integer num = this.f36089r;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer G() {
        Integer num = this.f36090s;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Double H() {
        Double d2 = this.f36091t;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Integer I() {
        Integer num = this.f36092u;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bg bgVar = (bg) obj;
        return Objects.equals(this.f36092u, bgVar.f36092u) && Objects.equals(this.f36091t, bgVar.f36091t) && Objects.equals(this.f36090s, bgVar.f36090s) && Objects.equals(this.f36089r, bgVar.f36089r) && Objects.equals(this.f36088q, bgVar.f36088q) && Objects.equals(this.f36087p, bgVar.f36087p) && Objects.equals(this.f36085n, bgVar.f36085n) && Objects.equals(this.f36084m, bgVar.f36084m) && Objects.equals(this.f36083l, bgVar.f36083l) && Objects.equals(this.f36082k, bgVar.f36082k) && Objects.equals(this.f36081j, bgVar.f36081j) && Objects.equals(this.f36080i, bgVar.f36080i) && Objects.equals(this.f36079h, bgVar.f36079h) && Objects.equals(this.f36078g, bgVar.f36078g) && Objects.equals(this.f36077f, bgVar.f36077f) && Objects.equals(this.f36076e, bgVar.f36076e) && Objects.equals(this.f36075d, bgVar.f36075d) && Objects.equals(this.f36073b, bgVar.f36073b) && Objects.equals(this.f36072a, bgVar.f36072a) && Objects.equals(this.f36074c, bgVar.f36074c) && Objects.equals(this.f36086o, bgVar.f36086o);
    }

    public final int hashCode() {
        return Objects.hash(this.f36072a, this.f36073b, this.f36074c, this.f36075d, this.f36076e, this.f36077f, this.f36078g, this.f36079h, this.f36080i, this.f36081j, this.f36082k, this.f36083l, this.f36084m, this.f36085n, this.f36086o, this.f36087p, this.f36088q, this.f36089r, this.f36090s, this.f36091t, this.f36092u);
    }

    public final Integer v() {
        Integer num = this.f36075d;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean w() {
        Boolean bool = this.f36076e;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean x() {
        Boolean bool = this.f36077f;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Integer y() {
        Integer num = this.f36078g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer z() {
        Integer num = this.f36079h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public bg() {
        this.f36093v = new boolean[21];
    }

    private bg(Integer num, Double d2, String str, Integer num2, Boolean bool, Boolean bool2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Date date, Integer num11, Integer num12, Integer num13, Integer num14, Double d13, Integer num15, boolean[] zArr) {
        this.f36072a = num;
        this.f36073b = d2;
        this.f36074c = str;
        this.f36075d = num2;
        this.f36076e = bool;
        this.f36077f = bool2;
        this.f36078g = num3;
        this.f36079h = num4;
        this.f36080i = num5;
        this.f36081j = num6;
        this.f36082k = num7;
        this.f36083l = num8;
        this.f36084m = num9;
        this.f36085n = num10;
        this.f36086o = date;
        this.f36087p = num11;
        this.f36088q = num12;
        this.f36089r = num13;
        this.f36090s = num14;
        this.f36091t = d13;
        this.f36092u = num15;
        this.f36093v = zArr;
    }
}
