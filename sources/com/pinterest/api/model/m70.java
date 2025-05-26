package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class m70 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f40014a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f40015b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("color_swatch_items")
    private List<ll> f40016c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("filter_id")
    private String f40017d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("filter_title")
    private String f40018e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("standard_list_items")
    private List<tl> f40019f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f40020g;

    public /* synthetic */ m70(String str, String str2, List list, String str3, String str4, List list2, boolean[] zArr, int i13) {
        this(str, str2, list, str3, str4, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m70 m70Var = (m70) obj;
        return Objects.equals(this.f40014a, m70Var.f40014a) && Objects.equals(this.f40015b, m70Var.f40015b) && Objects.equals(this.f40016c, m70Var.f40016c) && Objects.equals(this.f40017d, m70Var.f40017d) && Objects.equals(this.f40018e, m70Var.f40018e) && Objects.equals(this.f40019f, m70Var.f40019f);
    }

    public final List g() {
        return this.f40016c;
    }

    public final String h() {
        return this.f40017d;
    }

    public final int hashCode() {
        return Objects.hash(this.f40014a, this.f40015b, this.f40016c, this.f40017d, this.f40018e, this.f40019f);
    }

    public final String i() {
        return this.f40018e;
    }

    public final List j() {
        return this.f40019f;
    }

    public m70() {
        this.f40020g = new boolean[6];
    }

    private m70(@NonNull String str, String str2, List<ll> list, String str3, String str4, List<tl> list2, boolean[] zArr) {
        this.f40014a = str;
        this.f40015b = str2;
        this.f40016c = list;
        this.f40017d = str3;
        this.f40018e = str4;
        this.f40019f = list2;
        this.f40020g = zArr;
    }
}
