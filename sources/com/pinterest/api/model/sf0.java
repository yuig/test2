package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class sf0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41894a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41895b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("accent_color_dark_hex")
    private String f41896c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("accent_color_hex")
    private String f41897d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("cover_image_dark_url")
    private String f41898e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f41899f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("dominant_color_dark_hex")
    private String f41900g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("dominant_color_hex")
    private String f41901h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("duration_minutes")
    private Integer f41902i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("font_color_dark_hex")
    private String f41903j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("font_color_hex")
    private String f41904k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("key")
    private String f41905l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("steps")
    private List<pf0> f41906m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("thumbnail_image_dark_url")
    private String f41907n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("thumbnail_image_url")
    private String f41908o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("title")
    private String f41909p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f41910q;

    public /* synthetic */ sf0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, List list, String str12, String str13, String str14, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, list, str12, str13, str14, zArr);
    }

    public final String A() {
        return this.f41899f;
    }

    public final Integer B() {
        Integer num = this.f41902i;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String C() {
        return this.f41903j;
    }

    public final String D() {
        return this.f41904k;
    }

    public final List E() {
        return this.f41906m;
    }

    public final String F() {
        return this.f41907n;
    }

    public final String G() {
        return this.f41908o;
    }

    public final String H() {
        return this.f41909p;
    }

    @Override // dl1.s
    public final String b() {
        return this.f41894a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sf0 sf0Var = (sf0) obj;
        return Objects.equals(this.f41902i, sf0Var.f41902i) && Objects.equals(this.f41894a, sf0Var.f41894a) && Objects.equals(this.f41895b, sf0Var.f41895b) && Objects.equals(this.f41896c, sf0Var.f41896c) && Objects.equals(this.f41897d, sf0Var.f41897d) && Objects.equals(this.f41898e, sf0Var.f41898e) && Objects.equals(this.f41899f, sf0Var.f41899f) && Objects.equals(this.f41900g, sf0Var.f41900g) && Objects.equals(this.f41901h, sf0Var.f41901h) && Objects.equals(this.f41903j, sf0Var.f41903j) && Objects.equals(this.f41904k, sf0Var.f41904k) && Objects.equals(this.f41905l, sf0Var.f41905l) && Objects.equals(this.f41906m, sf0Var.f41906m) && Objects.equals(this.f41907n, sf0Var.f41907n) && Objects.equals(this.f41908o, sf0Var.f41908o) && Objects.equals(this.f41909p, sf0Var.f41909p);
    }

    public final int hashCode() {
        return Objects.hash(this.f41894a, this.f41895b, this.f41896c, this.f41897d, this.f41898e, this.f41899f, this.f41900g, this.f41901h, this.f41902i, this.f41903j, this.f41904k, this.f41905l, this.f41906m, this.f41907n, this.f41908o, this.f41909p);
    }

    @Override // dl1.s
    public final String o() {
        return this.f41895b;
    }

    public final String z() {
        return this.f41898e;
    }

    public sf0() {
        this.f41910q = new boolean[16];
    }

    private sf0(@NonNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, List<pf0> list, String str12, String str13, String str14, boolean[] zArr) {
        this.f41894a = str;
        this.f41895b = str2;
        this.f41896c = str3;
        this.f41897d = str4;
        this.f41898e = str5;
        this.f41899f = str6;
        this.f41900g = str7;
        this.f41901h = str8;
        this.f41902i = num;
        this.f41903j = str9;
        this.f41904k = str10;
        this.f41905l = str11;
        this.f41906m = list;
        this.f41907n = str12;
        this.f41908o = str13;
        this.f41909p = str14;
        this.f41910q = zArr;
    }
}
