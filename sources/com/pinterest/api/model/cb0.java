package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cb0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36344a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36345b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("background_color")
    private String f36346c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("cover_image_url")
    private String f36347d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("description")
    private String f36348e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("footer")
    private ua0 f36349f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("header_section")
    private gb0 f36350g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("output_key")
    private String f36351h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("sections")
    private List<kb0> f36352i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("survey")
    private gc0 f36353j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("title")
    private String f36354k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean[] f36355l;

    public /* synthetic */ cb0(String str, String str2, String str3, String str4, String str5, ua0 ua0Var, gb0 gb0Var, String str6, List list, gc0 gc0Var, String str7, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, ua0Var, gb0Var, str6, list, gc0Var, str7, zArr);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f36344a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return Objects.equals(this.f36344a, cb0Var.f36344a) && Objects.equals(this.f36345b, cb0Var.f36345b) && Objects.equals(this.f36346c, cb0Var.f36346c) && Objects.equals(this.f36347d, cb0Var.f36347d) && Objects.equals(this.f36348e, cb0Var.f36348e) && Objects.equals(this.f36349f, cb0Var.f36349f) && Objects.equals(this.f36350g, cb0Var.f36350g) && Objects.equals(this.f36351h, cb0Var.f36351h) && Objects.equals(this.f36352i, cb0Var.f36352i) && Objects.equals(this.f36353j, cb0Var.f36353j) && Objects.equals(this.f36354k, cb0Var.f36354k);
    }

    public final int hashCode() {
        return Objects.hash(this.f36344a, this.f36345b, this.f36346c, this.f36347d, this.f36348e, this.f36349f, this.f36350g, this.f36351h, this.f36352i, this.f36353j, this.f36354k);
    }

    @Override // dl1.s
    public final String o() {
        return this.f36345b;
    }

    public final ua0 u() {
        return this.f36349f;
    }

    public final gb0 v() {
        return this.f36350g;
    }

    public final String w() {
        return this.f36351h;
    }

    public final gc0 x() {
        return this.f36353j;
    }

    public final String y() {
        return this.f36354k;
    }

    public cb0() {
        this.f36355l = new boolean[11];
    }

    private cb0(@NonNull String str, String str2, String str3, String str4, String str5, ua0 ua0Var, gb0 gb0Var, String str6, List<kb0> list, gc0 gc0Var, String str7, boolean[] zArr) {
        this.f36344a = str;
        this.f36345b = str2;
        this.f36346c = str3;
        this.f36347d = str4;
        this.f36348e = str5;
        this.f36349f = ua0Var;
        this.f36350g = gb0Var;
        this.f36351h = str6;
        this.f36352i = list;
        this.f36353j = gc0Var;
        this.f36354k = str7;
        this.f36355l = zArr;
    }
}
