package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class h20 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38248a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38249b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_pins")
    private List<f30> f38250c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("board")
    private v7 f38251d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("brand")
    private wy0 f38252e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("cover_pins")
    private List<f30> f38253f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("description")
    private String f38254g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("description_detail")
    private String f38255h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("domain")
    private String f38256i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("feed_pins")
    private List<f30> f38257j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("insight_type")
    private String f38258k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("pear_simple_styles")
    private List<l20> f38259l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("pear_styles")
    private List<p20> f38260m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("primary_style_names")
    private List<String> f38261n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("secondary_style_names")
    private List<String> f38262o;

    /* renamed from: p, reason: collision with root package name */
    @om.b("subtitle")
    private String f38263p;

    /* renamed from: q, reason: collision with root package name */
    @om.b("title")
    private String f38264q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f38265r;

    public /* synthetic */ h20(String str, String str2, List list, v7 v7Var, wy0 wy0Var, List list2, String str3, String str4, String str5, List list3, String str6, List list4, List list5, List list6, List list7, String str7, String str8, boolean[] zArr, int i13) {
        this(str, str2, list, v7Var, wy0Var, list2, str3, str4, str5, list3, str6, list4, list5, list6, list7, str7, str8, zArr);
    }

    public final List A() {
        return this.f38250c;
    }

    public final v7 B() {
        return this.f38251d;
    }

    public final List C() {
        return this.f38253f;
    }

    public final String D() {
        return this.f38254g;
    }

    public final String E() {
        return this.f38255h;
    }

    public final String F() {
        return this.f38256i;
    }

    public final String G() {
        return this.f38258k;
    }

    public final List H() {
        return this.f38259l;
    }

    public final List I() {
        return this.f38260m;
    }

    public final List J() {
        return this.f38261n;
    }

    public final List K() {
        return this.f38262o;
    }

    public final String L() {
        return this.f38263p;
    }

    public final String M() {
        return this.f38264q;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f38248a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h20 h20Var = (h20) obj;
        return Objects.equals(this.f38248a, h20Var.f38248a) && Objects.equals(this.f38249b, h20Var.f38249b) && Objects.equals(this.f38250c, h20Var.f38250c) && Objects.equals(this.f38251d, h20Var.f38251d) && Objects.equals(this.f38252e, h20Var.f38252e) && Objects.equals(this.f38253f, h20Var.f38253f) && Objects.equals(this.f38254g, h20Var.f38254g) && Objects.equals(this.f38255h, h20Var.f38255h) && Objects.equals(this.f38256i, h20Var.f38256i) && Objects.equals(this.f38257j, h20Var.f38257j) && Objects.equals(this.f38258k, h20Var.f38258k) && Objects.equals(this.f38259l, h20Var.f38259l) && Objects.equals(this.f38260m, h20Var.f38260m) && Objects.equals(this.f38261n, h20Var.f38261n) && Objects.equals(this.f38262o, h20Var.f38262o) && Objects.equals(this.f38263p, h20Var.f38263p) && Objects.equals(this.f38264q, h20Var.f38264q);
    }

    public final int hashCode() {
        return Objects.hash(this.f38248a, this.f38249b, this.f38250c, this.f38251d, this.f38252e, this.f38253f, this.f38254g, this.f38255h, this.f38256i, this.f38257j, this.f38258k, this.f38259l, this.f38260m, this.f38261n, this.f38262o, this.f38263p, this.f38264q);
    }

    @Override // dl1.s
    public final String o() {
        return this.f38249b;
    }

    public h20() {
        this.f38265r = new boolean[17];
    }

    private h20(@NonNull String str, String str2, List<f30> list, v7 v7Var, wy0 wy0Var, List<f30> list2, String str3, String str4, String str5, List<f30> list3, String str6, List<l20> list4, List<p20> list5, List<String> list6, List<String> list7, String str7, String str8, boolean[] zArr) {
        this.f38248a = str;
        this.f38249b = str2;
        this.f38250c = list;
        this.f38251d = v7Var;
        this.f38252e = wy0Var;
        this.f38253f = list2;
        this.f38254g = str3;
        this.f38255h = str4;
        this.f38256i = str5;
        this.f38257j = list3;
        this.f38258k = str6;
        this.f38259l = list4;
        this.f38260m = list5;
        this.f38261n = list6;
        this.f38262o = list7;
        this.f38263p = str7;
        this.f38264q = str8;
        this.f38265r = zArr;
    }
}
