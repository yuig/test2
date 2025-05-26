package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cd0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36374a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36375b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("detail_page_additional_text")
    private String f36376c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("detail_page_header_text")
    private String f36377d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("detail_page_non_removal_example_header")
    private String f36378e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("detail_page_non_removal_examples")
    private List<String> f36379f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("detail_page_removal_example_header")
    private String f36380g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    @om.b("detail_page_removal_examples")
    private List<String> f36381h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("element_type")
    private Integer f36382i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f36383j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("open_web_url")
    private String f36384k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    @om.b("primary_text")
    private String f36385l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    @om.b("secondary_reasons")
    private List<kd0> f36386m;

    /* renamed from: n, reason: collision with root package name */
    @om.b("secondary_text")
    private String f36387n;

    /* renamed from: o, reason: collision with root package name */
    @om.b("sensitivity_type")
    private String f36388o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f36389p;

    public /* synthetic */ cd0(String str, String str2, String str3, String str4, String str5, List list, String str6, List list2, Integer num, String str7, String str8, String str9, List list3, String str10, String str11, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, list, str6, list2, num, str7, str8, str9, list3, str10, str11, zArr);
    }

    public static zc0 y() {
        return new zc0(0);
    }

    public final String A() {
        return this.f36377d;
    }

    public final String B() {
        return this.f36378e;
    }

    public final List C() {
        return this.f36379f;
    }

    public final String D() {
        return this.f36380g;
    }

    public final List E() {
        return this.f36381h;
    }

    public final String F() {
        return this.f36383j;
    }

    public final String G() {
        return this.f36384k;
    }

    public final String H() {
        return this.f36385l;
    }

    public final List I() {
        return this.f36386m;
    }

    public final String J() {
        return this.f36387n;
    }

    public final String K() {
        return this.f36388o;
    }

    @Override // dl1.s
    public final String b() {
        return this.f36374a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cd0 cd0Var = (cd0) obj;
        return Objects.equals(this.f36382i, cd0Var.f36382i) && Objects.equals(this.f36374a, cd0Var.f36374a) && Objects.equals(this.f36375b, cd0Var.f36375b) && Objects.equals(this.f36376c, cd0Var.f36376c) && Objects.equals(this.f36377d, cd0Var.f36377d) && Objects.equals(this.f36378e, cd0Var.f36378e) && Objects.equals(this.f36379f, cd0Var.f36379f) && Objects.equals(this.f36380g, cd0Var.f36380g) && Objects.equals(this.f36381h, cd0Var.f36381h) && Objects.equals(this.f36383j, cd0Var.f36383j) && Objects.equals(this.f36384k, cd0Var.f36384k) && Objects.equals(this.f36385l, cd0Var.f36385l) && Objects.equals(this.f36386m, cd0Var.f36386m) && Objects.equals(this.f36387n, cd0Var.f36387n) && Objects.equals(this.f36388o, cd0Var.f36388o);
    }

    public final int hashCode() {
        return Objects.hash(this.f36374a, this.f36375b, this.f36376c, this.f36377d, this.f36378e, this.f36379f, this.f36380g, this.f36381h, this.f36382i, this.f36383j, this.f36384k, this.f36385l, this.f36386m, this.f36387n, this.f36388o);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36375b;
    }

    public final String z() {
        return this.f36376c;
    }

    public cd0() {
        this.f36389p = new boolean[15];
    }

    private cd0(@NonNull String str, String str2, String str3, String str4, String str5, @NonNull List<String> list, String str6, @NonNull List<String> list2, Integer num, @NonNull String str7, String str8, @NonNull String str9, @NonNull List<kd0> list3, String str10, String str11, boolean[] zArr) {
        this.f36374a = str;
        this.f36375b = str2;
        this.f36376c = str3;
        this.f36377d = str4;
        this.f36378e = str5;
        this.f36379f = list;
        this.f36380g = str6;
        this.f36381h = list2;
        this.f36382i = num;
        this.f36383j = str7;
        this.f36384k = str8;
        this.f36385l = str9;
        this.f36386m = list3;
        this.f36387n = str10;
        this.f36388o = str11;
        this.f36389p = zArr;
    }
}
