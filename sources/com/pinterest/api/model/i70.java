package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class i70 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38688a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38689b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("brand_name_filters")
    private List<Integer> f38690c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("color_swatch_filters")
    private List<Integer> f38691d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("filter_items")
    private List<m70> f38692e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("price_bucket_filters")
    private List<Integer> f38693f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38694g;

    public /* synthetic */ i70(String str, String str2, List list, List list2, List list3, List list4, boolean[] zArr, int i13) {
        this(str, str2, list, list2, list3, list4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return Objects.equals(this.f38688a, i70Var.f38688a) && Objects.equals(this.f38689b, i70Var.f38689b) && Objects.equals(this.f38690c, i70Var.f38690c) && Objects.equals(this.f38691d, i70Var.f38691d) && Objects.equals(this.f38692e, i70Var.f38692e) && Objects.equals(this.f38693f, i70Var.f38693f);
    }

    public final List g() {
        return this.f38690c;
    }

    public final List h() {
        return this.f38691d;
    }

    public final int hashCode() {
        return Objects.hash(this.f38688a, this.f38689b, this.f38690c, this.f38691d, this.f38692e, this.f38693f);
    }

    public final List i() {
        return this.f38692e;
    }

    public final List j() {
        return this.f38693f;
    }

    public i70() {
        this.f38694g = new boolean[6];
    }

    private i70(@NonNull String str, String str2, List<Integer> list, List<Integer> list2, List<m70> list3, List<Integer> list4, boolean[] zArr) {
        this.f38688a = str;
        this.f38689b = str2;
        this.f38690c = list;
        this.f38691d = list2;
        this.f38692e = list3;
        this.f38693f = list4;
        this.f38694g = zArr;
    }
}
