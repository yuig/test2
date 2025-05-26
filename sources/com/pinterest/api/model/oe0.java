package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class oe0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40684a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40685b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("apple_touch_icon_link")
    private String f40686c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("article")
    private t6 f40687d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("favicon_link")
    private String f40688e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("is_product_pin_v2")
    private Boolean f40689f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("locale")
    private String f40690g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("mobile_app")
    private zv f40691h;

    /* renamed from: i, reason: collision with root package name */
    @om.b("products")
    private List<h80> f40692i;

    /* renamed from: j, reason: collision with root package name */
    @om.b("recipe")
    private kc0 f40693j;

    /* renamed from: k, reason: collision with root package name */
    @om.b("site_name")
    private String f40694k;

    /* renamed from: l, reason: collision with root package name */
    @om.b("title")
    private String f40695l;

    /* renamed from: m, reason: collision with root package name */
    @om.b("url")
    private String f40696m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f40697n;

    public /* synthetic */ oe0(String str, String str2, String str3, t6 t6Var, String str4, Boolean bool, String str5, zv zvVar, List list, kc0 kc0Var, String str6, String str7, String str8, boolean[] zArr, int i13) {
        this(str, str2, str3, t6Var, str4, bool, str5, zvVar, list, kc0Var, str6, str7, str8, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oe0 oe0Var = (oe0) obj;
        return Objects.equals(this.f40689f, oe0Var.f40689f) && Objects.equals(this.f40684a, oe0Var.f40684a) && Objects.equals(this.f40685b, oe0Var.f40685b) && Objects.equals(this.f40686c, oe0Var.f40686c) && Objects.equals(this.f40687d, oe0Var.f40687d) && Objects.equals(this.f40688e, oe0Var.f40688e) && Objects.equals(this.f40690g, oe0Var.f40690g) && Objects.equals(this.f40691h, oe0Var.f40691h) && Objects.equals(this.f40692i, oe0Var.f40692i) && Objects.equals(this.f40693j, oe0Var.f40693j) && Objects.equals(this.f40694k, oe0Var.f40694k) && Objects.equals(this.f40695l, oe0Var.f40695l) && Objects.equals(this.f40696m, oe0Var.f40696m);
    }

    public final int hashCode() {
        return Objects.hash(this.f40684a, this.f40685b, this.f40686c, this.f40687d, this.f40688e, this.f40689f, this.f40690g, this.f40691h, this.f40692i, this.f40693j, this.f40694k, this.f40695l, this.f40696m);
    }

    public final String n() {
        return this.f40686c;
    }

    public final t6 o() {
        return this.f40687d;
    }

    public final String p() {
        return this.f40688e;
    }

    public final String q() {
        return this.f40690g;
    }

    public final List r() {
        return this.f40692i;
    }

    public final kc0 s() {
        return this.f40693j;
    }

    public final String t() {
        return this.f40694k;
    }

    public final String u() {
        return this.f40695l;
    }

    public final String v() {
        return this.f40684a;
    }

    public final String w() {
        return this.f40696m;
    }

    public oe0() {
        this.f40697n = new boolean[13];
    }

    private oe0(@NonNull String str, String str2, String str3, t6 t6Var, String str4, Boolean bool, String str5, zv zvVar, List<h80> list, kc0 kc0Var, String str6, String str7, String str8, boolean[] zArr) {
        this.f40684a = str;
        this.f40685b = str2;
        this.f40686c = str3;
        this.f40687d = t6Var;
        this.f40688e = str4;
        this.f40689f = bool;
        this.f40690g = str5;
        this.f40691h = zvVar;
        this.f40692i = list;
        this.f40693j = kc0Var;
        this.f40694k = str6;
        this.f40695l = str7;
        this.f40696m = str8;
        this.f40697n = zArr;
    }
}
