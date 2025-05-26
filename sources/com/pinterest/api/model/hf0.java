package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class hf0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38411a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38412b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("accent_color_dark_hex")
    private String f38413c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("accent_color_hex")
    private String f38414d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("audio_animation_url")
    private String f38415e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("audio_dark_animation_url")
    private String f38416f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("cover_image_dark_url")
    private String f38417g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f38418h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("dominant_color_dark_hex")
    private String f38419i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("dominant_color_hex")
    private String f38420j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("duration_minutes")
    private Integer f38421k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("font_color_dark_hex")
    private String f38422l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("font_color_hex")
    private String f38423m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("key")
    private String f38424n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("steps")
    private List<ef0> f38425o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("thumbnail_image_dark_url")
    private String f38426p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("thumbnail_image_url")
    private String f38427q;

    /* renamed from: r, reason: collision with root package name */
    @om.b("title")
    private String f38428r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f38429s;

    public /* synthetic */ hf0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, List list, String str14, String str15, String str16, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, num, str11, str12, str13, list, str14, str15, str16, zArr);
    }

    public final String B() {
        return this.f38413c;
    }

    public final String C() {
        return this.f38414d;
    }

    public final String D() {
        return this.f38415e;
    }

    public final String E() {
        return this.f38416f;
    }

    public final String F() {
        return this.f38417g;
    }

    public final String G() {
        return this.f38418h;
    }

    public final String H() {
        return this.f38419i;
    }

    public final String I() {
        return this.f38420j;
    }

    public final Integer J() {
        Integer num = this.f38421k;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String K() {
        return this.f38422l;
    }

    public final String L() {
        return this.f38423m;
    }

    public final List M() {
        return this.f38425o;
    }

    public final String N() {
        return this.f38426p;
    }

    public final String O() {
        return this.f38427q;
    }

    public final String P() {
        return this.f38428r;
    }

    @Override // dl1.s
    public final String b() {
        return this.f38411a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hf0 hf0Var = (hf0) obj;
        return Objects.equals(this.f38421k, hf0Var.f38421k) && Objects.equals(this.f38411a, hf0Var.f38411a) && Objects.equals(this.f38412b, hf0Var.f38412b) && Objects.equals(this.f38413c, hf0Var.f38413c) && Objects.equals(this.f38414d, hf0Var.f38414d) && Objects.equals(this.f38415e, hf0Var.f38415e) && Objects.equals(this.f38416f, hf0Var.f38416f) && Objects.equals(this.f38417g, hf0Var.f38417g) && Objects.equals(this.f38418h, hf0Var.f38418h) && Objects.equals(this.f38419i, hf0Var.f38419i) && Objects.equals(this.f38420j, hf0Var.f38420j) && Objects.equals(this.f38422l, hf0Var.f38422l) && Objects.equals(this.f38423m, hf0Var.f38423m) && Objects.equals(this.f38424n, hf0Var.f38424n) && Objects.equals(this.f38425o, hf0Var.f38425o) && Objects.equals(this.f38426p, hf0Var.f38426p) && Objects.equals(this.f38427q, hf0Var.f38427q) && Objects.equals(this.f38428r, hf0Var.f38428r);
    }

    public final int hashCode() {
        return Objects.hash(this.f38411a, this.f38412b, this.f38413c, this.f38414d, this.f38415e, this.f38416f, this.f38417g, this.f38418h, this.f38419i, this.f38420j, this.f38421k, this.f38422l, this.f38423m, this.f38424n, this.f38425o, this.f38426p, this.f38427q, this.f38428r);
    }

    @Override // dl1.s
    public final String o() {
        return this.f38412b;
    }

    public hf0() {
        this.f38429s = new boolean[18];
    }

    private hf0(@NonNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Integer num, String str11, String str12, String str13, List<ef0> list, String str14, String str15, String str16, boolean[] zArr) {
        this.f38411a = str;
        this.f38412b = str2;
        this.f38413c = str3;
        this.f38414d = str4;
        this.f38415e = str5;
        this.f38416f = str6;
        this.f38417g = str7;
        this.f38418h = str8;
        this.f38419i = str9;
        this.f38420j = str10;
        this.f38421k = num;
        this.f38422l = str11;
        this.f38423m = str12;
        this.f38424n = str13;
        this.f38425o = list;
        this.f38426p = str14;
        this.f38427q = str15;
        this.f38428r = str16;
        this.f38429s = zArr;
    }
}
