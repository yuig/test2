package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class px0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41132a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41133b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("applied_filter_options")
    private List<tx0> f41134c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("error_state_label")
    private String f41135d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("filter_component_type")
    private Integer f41136e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    @om.b("filter_options")
    private List<tx0> f41137f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("label")
    private String f41138g;

    /* renamed from: h, reason: collision with root package name */
    @om.b("product_filter_type")
    private Integer f41139h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f41140i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean[] f41141j;

    public /* synthetic */ px0(String str, String str2, List list, String str3, Integer num, List list2, String str4, Integer num2, String str5, boolean[] zArr, int i13) {
        this(str, str2, list, str3, num, list2, str4, num2, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        px0 px0Var = (px0) obj;
        return Objects.equals(this.f41139h, px0Var.f41139h) && Objects.equals(this.f41136e, px0Var.f41136e) && Objects.equals(this.f41132a, px0Var.f41132a) && Objects.equals(this.f41133b, px0Var.f41133b) && Objects.equals(this.f41134c, px0Var.f41134c) && Objects.equals(this.f41135d, px0Var.f41135d) && Objects.equals(this.f41137f, px0Var.f41137f) && Objects.equals(this.f41138g, px0Var.f41138g) && Objects.equals(this.f41140i, px0Var.f41140i);
    }

    public final int hashCode() {
        return Objects.hash(this.f41132a, this.f41133b, this.f41134c, this.f41135d, this.f41136e, this.f41137f, this.f41138g, this.f41139h, this.f41140i);
    }

    public final List j() {
        return this.f41134c;
    }

    public final String k() {
        return this.f41135d;
    }

    public final Integer l() {
        Integer num = this.f41136e;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final List m() {
        return this.f41137f;
    }

    public final String n() {
        return this.f41138g;
    }

    public final Integer o() {
        Integer num = this.f41139h;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final String p() {
        return this.f41140i;
    }

    public final String q() {
        return this.f41132a;
    }

    public px0() {
        this.f41141j = new boolean[9];
    }

    private px0(@NonNull String str, String str2, List<tx0> list, String str3, Integer num, @NonNull List<tx0> list2, String str4, Integer num2, @NonNull String str5, boolean[] zArr) {
        this.f41132a = str;
        this.f41133b = str2;
        this.f41134c = list;
        this.f41135d = str3;
        this.f41136e = num;
        this.f41137f = list2;
        this.f41138g = str4;
        this.f41139h = num2;
        this.f41140i = str5;
        this.f41141j = zArr;
    }
}
