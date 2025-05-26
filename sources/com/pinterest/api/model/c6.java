package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class c6 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36296a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36297b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("action_title")
    private String f36298c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("action_uri")
    private String f36299d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f36300e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("description_text_alignment")
    private Integer f36301f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("display_type")
    private Integer f36302g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("icon_alt")
    private String f36303h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("icon_url")
    private String f36304i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("image_alt")
    private String f36305j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("image_aspect_ratio")
    private Double f36306k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("image_url")
    private String f36307l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("title")
    private String f36308m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("type")
    private String f36309n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("video_metadata")
    private g6 f36310o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("video_placeholder_image_url")
    private String f36311p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("video_url")
    private String f36312q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f36313r;

    public /* synthetic */ c6(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, Double d2, String str9, String str10, String str11, g6 g6Var, String str12, String str13, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, num, num2, str6, str7, str8, d2, str9, str10, str11, g6Var, str12, str13, zArr);
    }

    public final String A() {
        return this.f36298c;
    }

    public final String B() {
        return this.f36299d;
    }

    public final String C() {
        return this.f36300e;
    }

    public final Integer D() {
        Integer num = this.f36301f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final Integer E() {
        Integer num = this.f36302g;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String F() {
        return this.f36304i;
    }

    public final Double G() {
        Double d2 = this.f36306k;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String H() {
        return this.f36307l;
    }

    public final String I() {
        return this.f36308m;
    }

    public final g6 J() {
        return this.f36310o;
    }

    public final String K() {
        return this.f36311p;
    }

    public final String L() {
        return this.f36312q;
    }

    @Override // dl1.s
    public final String b() {
        return this.f36296a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return Objects.equals(this.f36306k, c6Var.f36306k) && Objects.equals(this.f36302g, c6Var.f36302g) && Objects.equals(this.f36301f, c6Var.f36301f) && Objects.equals(this.f36296a, c6Var.f36296a) && Objects.equals(this.f36297b, c6Var.f36297b) && Objects.equals(this.f36298c, c6Var.f36298c) && Objects.equals(this.f36299d, c6Var.f36299d) && Objects.equals(this.f36300e, c6Var.f36300e) && Objects.equals(this.f36303h, c6Var.f36303h) && Objects.equals(this.f36304i, c6Var.f36304i) && Objects.equals(this.f36305j, c6Var.f36305j) && Objects.equals(this.f36307l, c6Var.f36307l) && Objects.equals(this.f36308m, c6Var.f36308m) && Objects.equals(this.f36309n, c6Var.f36309n) && Objects.equals(this.f36310o, c6Var.f36310o) && Objects.equals(this.f36311p, c6Var.f36311p) && Objects.equals(this.f36312q, c6Var.f36312q);
    }

    public final int hashCode() {
        return Objects.hash(this.f36296a, this.f36297b, this.f36298c, this.f36299d, this.f36300e, this.f36301f, this.f36302g, this.f36303h, this.f36304i, this.f36305j, this.f36306k, this.f36307l, this.f36308m, this.f36309n, this.f36310o, this.f36311p, this.f36312q);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36297b;
    }

    public c6() {
        this.f36313r = new boolean[17];
    }

    private c6(@NonNull String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, String str7, String str8, Double d2, String str9, String str10, String str11, g6 g6Var, String str12, String str13, boolean[] zArr) {
        this.f36296a = str;
        this.f36297b = str2;
        this.f36298c = str3;
        this.f36299d = str4;
        this.f36300e = str5;
        this.f36301f = num;
        this.f36302g = num2;
        this.f36303h = str6;
        this.f36304i = str7;
        this.f36305j = str8;
        this.f36306k = d2;
        this.f36307l = str9;
        this.f36308m = str10;
        this.f36309n = str11;
        this.f36310o = g6Var;
        this.f36311p = str12;
        this.f36312q = str13;
        this.f36313r = zArr;
    }
}
