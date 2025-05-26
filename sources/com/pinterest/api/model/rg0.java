package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class rg0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("allow_shopping_rec")
    private Boolean f41574a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("alt_text")
    private String f41575b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("call_to_create_source_pin_id")
    private String f41576c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("description")
    private String f41577d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("freeform_tags")
    private String f41578e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("freeform_tags_language")
    private String f41579f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("has_not_royalty_free_music")
    private Boolean f41580g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("has_product_pins")
    private Boolean f41581h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("idea_pin_details")
    private qk0 f41582i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("idea_pin_details_template_type")
    private Integer f41583j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("image_signature")
    private String f41584k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("interest_ids")
    private String f41585l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("interest_labels")
    private String f41586m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("invisible_product_stickers")
    private String f41587n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("is_call_to_create")
    private Boolean f41588o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("is_comments_allowed")
    private Boolean f41589p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("is_sponsorable")
    private Boolean f41590q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("link")
    private String f41591r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("product_stickers")
    private String f41592s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("sponsor_id")
    private String f41593t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("template_type")
    private Integer f41594u;

    /* renamed from: v, reason: collision with root package name */
    @om.b("title")
    private String f41595v;

    /* renamed from: w, reason: collision with root package name */
    @om.b("user_mention_tags")
    private List<ts0> f41596w;

    /* renamed from: x, reason: collision with root package name */
    @om.b("video_signature")
    private String f41597x;

    /* renamed from: y, reason: collision with root package name */
    @om.b("video_tracking_id")
    private String f41598y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f41599z;

    public /* synthetic */ rg0(Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, Boolean bool3, qk0 qk0Var, Integer num, String str6, String str7, String str8, String str9, Boolean bool4, Boolean bool5, Boolean bool6, String str10, String str11, String str12, Integer num2, String str13, List list, String str14, String str15, boolean[] zArr, int i13) {
        this(bool, str, str2, str3, str4, str5, bool2, bool3, qk0Var, num, str6, str7, str8, str9, bool4, bool5, bool6, str10, str11, str12, num2, str13, list, str14, str15, zArr);
    }

    public final String A() {
        return this.f41575b;
    }

    public final String B() {
        return this.f41577d;
    }

    public final String C() {
        return this.f41578e;
    }

    public final Boolean D() {
        Boolean bool = this.f41580g;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean E() {
        Boolean bool = this.f41581h;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final qk0 F() {
        return this.f41582i;
    }

    public final Integer G() {
        Integer num = this.f41583j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String H() {
        return this.f41585l;
    }

    public final String I() {
        return this.f41586m;
    }

    public final String J() {
        return this.f41587n;
    }

    public final Boolean K() {
        Boolean bool = this.f41589p;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean L() {
        Boolean bool = this.f41590q;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String M() {
        return this.f41591r;
    }

    public final String N() {
        return this.f41592s;
    }

    public final String O() {
        return this.f41593t;
    }

    public final String P() {
        return this.f41595v;
    }

    public final List Q() {
        return this.f41596w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rg0 rg0Var = (rg0) obj;
        return Objects.equals(this.f41594u, rg0Var.f41594u) && Objects.equals(this.f41590q, rg0Var.f41590q) && Objects.equals(this.f41589p, rg0Var.f41589p) && Objects.equals(this.f41588o, rg0Var.f41588o) && Objects.equals(this.f41583j, rg0Var.f41583j) && Objects.equals(this.f41581h, rg0Var.f41581h) && Objects.equals(this.f41580g, rg0Var.f41580g) && Objects.equals(this.f41574a, rg0Var.f41574a) && Objects.equals(this.f41575b, rg0Var.f41575b) && Objects.equals(this.f41576c, rg0Var.f41576c) && Objects.equals(this.f41577d, rg0Var.f41577d) && Objects.equals(this.f41578e, rg0Var.f41578e) && Objects.equals(this.f41579f, rg0Var.f41579f) && Objects.equals(this.f41582i, rg0Var.f41582i) && Objects.equals(this.f41584k, rg0Var.f41584k) && Objects.equals(this.f41585l, rg0Var.f41585l) && Objects.equals(this.f41586m, rg0Var.f41586m) && Objects.equals(this.f41587n, rg0Var.f41587n) && Objects.equals(this.f41591r, rg0Var.f41591r) && Objects.equals(this.f41592s, rg0Var.f41592s) && Objects.equals(this.f41593t, rg0Var.f41593t) && Objects.equals(this.f41595v, rg0Var.f41595v) && Objects.equals(this.f41596w, rg0Var.f41596w) && Objects.equals(this.f41597x, rg0Var.f41597x) && Objects.equals(this.f41598y, rg0Var.f41598y);
    }

    public final int hashCode() {
        return Objects.hash(this.f41574a, this.f41575b, this.f41576c, this.f41577d, this.f41578e, this.f41579f, this.f41580g, this.f41581h, this.f41582i, this.f41583j, this.f41584k, this.f41585l, this.f41586m, this.f41587n, this.f41588o, this.f41589p, this.f41590q, this.f41591r, this.f41592s, this.f41593t, this.f41594u, this.f41595v, this.f41596w, this.f41597x, this.f41598y);
    }

    public final Boolean z() {
        Boolean bool = this.f41574a;
        return bool == null ? Boolean.FALSE : bool;
    }

    public rg0() {
        this.f41599z = new boolean[25];
    }

    private rg0(Boolean bool, String str, String str2, String str3, String str4, String str5, Boolean bool2, Boolean bool3, qk0 qk0Var, Integer num, String str6, String str7, String str8, String str9, Boolean bool4, Boolean bool5, Boolean bool6, String str10, String str11, String str12, Integer num2, String str13, List<ts0> list, String str14, String str15, boolean[] zArr) {
        this.f41574a = bool;
        this.f41575b = str;
        this.f41576c = str2;
        this.f41577d = str3;
        this.f41578e = str4;
        this.f41579f = str5;
        this.f41580g = bool2;
        this.f41581h = bool3;
        this.f41582i = qk0Var;
        this.f41583j = num;
        this.f41584k = str6;
        this.f41585l = str7;
        this.f41586m = str8;
        this.f41587n = str9;
        this.f41588o = bool4;
        this.f41589p = bool5;
        this.f41590q = bool6;
        this.f41591r = str10;
        this.f41592s = str11;
        this.f41593t = str12;
        this.f41594u = num2;
        this.f41595v = str13;
        this.f41596w = list;
        this.f41597x = str14;
        this.f41598y = str15;
        this.f41599z = zArr;
    }
}
