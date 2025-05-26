package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class zv0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @om.b("article_creator_user")
    private wy0 f44471a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("article_description")
    private String f44472b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("content_pin")
    private f30 f44473c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_pin")
    private f30 f44474d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("cover_pins")
    private List<f30> f44475e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("creators")
    private List<wy0> f44476f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("display_color")
    private String f44477g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("display_type")
    private Integer f44478h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("has_dark_display_color")
    private Boolean f44479i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("header_pin_id")
    private String f44480j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("id")
    private String f44481k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("image_urls")
    private List<String> f44482l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("is_feed_single_column")
    private Boolean f44483m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("is_product_pin_feed")
    private Boolean f44484n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("is_story_pin_animated")
    private Boolean f44485o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("is_video_cover")
    private Boolean f44486p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("override_navigation_url")
    private String f44487q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("show_creator")
    private Boolean f44488r;

    /* renamed from: s, reason: collision with root package name */
    @om.b("subtitle")
    private String f44489s;

    /* renamed from: t, reason: collision with root package name */
    @om.b("title")
    private String f44490t;

    /* renamed from: u, reason: collision with root package name */
    @om.b("video_pin")
    private f30 f44491u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f44492v;

    public /* synthetic */ zv0(wy0 wy0Var, String str, f30 f30Var, f30 f30Var2, List list, List list2, String str2, Integer num, Boolean bool, String str3, String str4, List list3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str5, Boolean bool6, String str6, String str7, f30 f30Var3, boolean[] zArr, int i13) {
        this(wy0Var, str, f30Var, f30Var2, list, list2, str2, num, bool, str3, str4, list3, bool2, bool3, bool4, bool5, str5, bool6, str6, str7, f30Var3, zArr);
    }

    public final wy0 E() {
        return this.f44471a;
    }

    public final String F() {
        return this.f44472b;
    }

    public final f30 G() {
        return this.f44473c;
    }

    public final f30 H() {
        return this.f44474d;
    }

    public final List I() {
        return this.f44475e;
    }

    public final List J() {
        return this.f44476f;
    }

    public final String K() {
        return this.f44477g;
    }

    public final Integer L() {
        Integer num = this.f44478h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Boolean M() {
        Boolean bool = this.f44479i;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List N() {
        return this.f44482l;
    }

    public final Boolean O() {
        Boolean bool = this.f44483m;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean P() {
        Boolean bool = this.f44484n;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final Boolean Q() {
        Boolean bool = this.f44486p;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String R() {
        return this.f44487q;
    }

    public final boolean S() {
        boolean[] zArr = this.f44492v;
        return zArr.length > 16 && zArr[16];
    }

    public final Boolean T() {
        Boolean bool = this.f44488r;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String U() {
        return this.f44489s;
    }

    public final String V() {
        return this.f44490t;
    }

    public final f30 W() {
        return this.f44491u;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f44481k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zv0 zv0Var = (zv0) obj;
        return Objects.equals(this.f44488r, zv0Var.f44488r) && Objects.equals(this.f44486p, zv0Var.f44486p) && Objects.equals(this.f44485o, zv0Var.f44485o) && Objects.equals(this.f44484n, zv0Var.f44484n) && Objects.equals(this.f44483m, zv0Var.f44483m) && Objects.equals(this.f44479i, zv0Var.f44479i) && Objects.equals(this.f44478h, zv0Var.f44478h) && Objects.equals(this.f44471a, zv0Var.f44471a) && Objects.equals(this.f44472b, zv0Var.f44472b) && Objects.equals(this.f44473c, zv0Var.f44473c) && Objects.equals(this.f44474d, zv0Var.f44474d) && Objects.equals(this.f44475e, zv0Var.f44475e) && Objects.equals(this.f44476f, zv0Var.f44476f) && Objects.equals(this.f44477g, zv0Var.f44477g) && Objects.equals(this.f44480j, zv0Var.f44480j) && Objects.equals(this.f44481k, zv0Var.f44481k) && Objects.equals(this.f44482l, zv0Var.f44482l) && Objects.equals(this.f44487q, zv0Var.f44487q) && Objects.equals(this.f44489s, zv0Var.f44489s) && Objects.equals(this.f44490t, zv0Var.f44490t) && Objects.equals(this.f44491u, zv0Var.f44491u);
    }

    public final int hashCode() {
        return Objects.hash(this.f44471a, this.f44472b, this.f44473c, this.f44474d, this.f44475e, this.f44476f, this.f44477g, this.f44478h, this.f44479i, this.f44480j, this.f44481k, this.f44482l, this.f44483m, this.f44484n, this.f44485o, this.f44486p, this.f44487q, this.f44488r, this.f44489s, this.f44490t, this.f44491u);
    }

    public zv0() {
        this.f44492v = new boolean[21];
    }

    private zv0(wy0 wy0Var, String str, f30 f30Var, f30 f30Var2, List<f30> list, List<wy0> list2, String str2, Integer num, Boolean bool, String str3, String str4, List<String> list3, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str5, Boolean bool6, String str6, String str7, f30 f30Var3, boolean[] zArr) {
        this.f44471a = wy0Var;
        this.f44472b = str;
        this.f44473c = f30Var;
        this.f44474d = f30Var2;
        this.f44475e = list;
        this.f44476f = list2;
        this.f44477g = str2;
        this.f44478h = num;
        this.f44479i = bool;
        this.f44480j = str3;
        this.f44481k = str4;
        this.f44482l = list3;
        this.f44483m = bool2;
        this.f44484n = bool3;
        this.f44485o = bool4;
        this.f44486p = bool5;
        this.f44487q = str5;
        this.f44488r = bool6;
        this.f44489s = str6;
        this.f44490t = str7;
        this.f44491u = f30Var3;
        this.f44492v = zArr;
    }
}
