package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class gb0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38019a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38020b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("cover_image_urls")
    private List<String> f38021c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_urls_dark")
    private List<String> f38022d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("cover_pins")
    private List<f30> f38023e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("custom_background_color")
    private String f38024f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("description")
    private String f38025g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("layout_type")
    private Integer f38026h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("nav_title")
    private String f38027i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("share_cta_subtitle")
    private String f38028j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("share_cta_title")
    private String f38029k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("share_option")
    private Integer f38030l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("subtitle")
    private String f38031m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("title")
    private String f38032n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f38033o;

    public /* synthetic */ gb0(String str, String str2, List list, List list2, List list3, String str3, String str4, Integer num, String str5, String str6, String str7, Integer num2, String str8, String str9, boolean[] zArr, int i13) {
        this(str, str2, list, list2, list3, str3, str4, num, str5, str6, str7, num2, str8, str9, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        return Objects.equals(this.f38030l, gb0Var.f38030l) && Objects.equals(this.f38026h, gb0Var.f38026h) && Objects.equals(this.f38019a, gb0Var.f38019a) && Objects.equals(this.f38020b, gb0Var.f38020b) && Objects.equals(this.f38021c, gb0Var.f38021c) && Objects.equals(this.f38022d, gb0Var.f38022d) && Objects.equals(this.f38023e, gb0Var.f38023e) && Objects.equals(this.f38024f, gb0Var.f38024f) && Objects.equals(this.f38025g, gb0Var.f38025g) && Objects.equals(this.f38027i, gb0Var.f38027i) && Objects.equals(this.f38028j, gb0Var.f38028j) && Objects.equals(this.f38029k, gb0Var.f38029k) && Objects.equals(this.f38031m, gb0Var.f38031m) && Objects.equals(this.f38032n, gb0Var.f38032n);
    }

    public final int hashCode() {
        return Objects.hash(this.f38019a, this.f38020b, this.f38021c, this.f38022d, this.f38023e, this.f38024f, this.f38025g, this.f38026h, this.f38027i, this.f38028j, this.f38029k, this.f38030l, this.f38031m, this.f38032n);
    }

    public final List o() {
        return this.f38021c;
    }

    public final List p() {
        return this.f38022d;
    }

    public final List q() {
        return this.f38023e;
    }

    public final String r() {
        return this.f38025g;
    }

    public final Integer s() {
        Integer num = this.f38026h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String t() {
        return this.f38027i;
    }

    public final String u() {
        return this.f38028j;
    }

    public final String v() {
        return this.f38029k;
    }

    public final Integer w() {
        Integer num = this.f38030l;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String x() {
        return this.f38031m;
    }

    public final String y() {
        return this.f38032n;
    }

    public gb0() {
        this.f38033o = new boolean[14];
    }

    private gb0(@NonNull String str, String str2, List<String> list, List<String> list2, List<f30> list3, String str3, String str4, Integer num, String str5, String str6, String str7, Integer num2, String str8, String str9, boolean[] zArr) {
        this.f38019a = str;
        this.f38020b = str2;
        this.f38021c = list;
        this.f38022d = list2;
        this.f38023e = list3;
        this.f38024f = str3;
        this.f38025g = str4;
        this.f38026h = num;
        this.f38027i = str5;
        this.f38028j = str6;
        this.f38029k = str7;
        this.f38030l = num2;
        this.f38031m = str8;
        this.f38032n = str9;
        this.f38033o = zArr;
    }
}
