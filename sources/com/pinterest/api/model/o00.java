package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class o00 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40568a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40569b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("alt_text")
    private String f40570c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("background_color_hex")
    private List<String> f40571d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("display_text")
    private String f40572e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("icon")
    private Integer f40573f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("icon_url")
    private String f40574g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("image_medium_url")
    private String f40575h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("image_urls")
    private List<String> f40576i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("is_selected")
    private Boolean f40577j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("selected_background_color_hex")
    private List<String> f40578k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("text_color_hex")
    private List<String> f40579l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("type")
    private String f40580m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f40581n;

    public /* synthetic */ o00(String str, String str2, String str3, List list, String str4, Integer num, String str5, String str6, List list2, Boolean bool, List list3, List list4, String str7, boolean[] zArr, int i13) {
        this(str, str2, str3, list, str4, num, str5, str6, list2, bool, list3, list4, str7, zArr);
    }

    public final String A() {
        return this.f40568a;
    }

    public final l00 B() {
        return new l00(this, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return Objects.equals(this.f40577j, o00Var.f40577j) && Objects.equals(this.f40573f, o00Var.f40573f) && Objects.equals(this.f40568a, o00Var.f40568a) && Objects.equals(this.f40569b, o00Var.f40569b) && Objects.equals(this.f40570c, o00Var.f40570c) && Objects.equals(this.f40571d, o00Var.f40571d) && Objects.equals(this.f40572e, o00Var.f40572e) && Objects.equals(this.f40574g, o00Var.f40574g) && Objects.equals(this.f40575h, o00Var.f40575h) && Objects.equals(this.f40576i, o00Var.f40576i) && Objects.equals(this.f40578k, o00Var.f40578k) && Objects.equals(this.f40579l, o00Var.f40579l) && Objects.equals(this.f40580m, o00Var.f40580m);
    }

    public final int hashCode() {
        return Objects.hash(this.f40568a, this.f40569b, this.f40570c, this.f40571d, this.f40572e, this.f40573f, this.f40574g, this.f40575h, this.f40576i, this.f40577j, this.f40578k, this.f40579l, this.f40580m);
    }

    public final String n() {
        return this.f40570c;
    }

    public final List o() {
        return this.f40571d;
    }

    public final String p() {
        return this.f40572e;
    }

    public final boolean q() {
        boolean[] zArr = this.f40581n;
        return zArr.length > 4 && zArr[4];
    }

    public final Integer r() {
        Integer num = this.f40573f;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String s() {
        return this.f40574g;
    }

    public final String t() {
        return this.f40575h;
    }

    public final List u() {
        return this.f40576i;
    }

    public final Boolean v() {
        Boolean bool = this.f40577j;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String w() {
        return this.f40569b;
    }

    public final List x() {
        return this.f40578k;
    }

    public final List y() {
        return this.f40579l;
    }

    public final String z() {
        return this.f40580m;
    }

    public o00() {
        this.f40581n = new boolean[13];
    }

    private o00(@NonNull String str, String str2, String str3, List<String> list, String str4, Integer num, String str5, String str6, List<String> list2, Boolean bool, List<String> list3, List<String> list4, String str7, boolean[] zArr) {
        this.f40568a = str;
        this.f40569b = str2;
        this.f40570c = str3;
        this.f40571d = list;
        this.f40572e = str4;
        this.f40573f = num;
        this.f40574g = str5;
        this.f40575h = str6;
        this.f40576i = list2;
        this.f40577j = bool;
        this.f40578k = list3;
        this.f40579l = list4;
        this.f40580m = str7;
        this.f40581n = zArr;
    }
}
