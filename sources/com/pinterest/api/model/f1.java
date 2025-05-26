package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class f1 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("external_id")
    private String f37403a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("fulfillment_options")
    private List<ec> f37404b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("logo_url")
    private String f37405c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("name")
    private String f37406d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("product_currency")
    private String f37407e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("product_price")
    private Double f37408f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("url")
    private String f37409g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f37410h;

    public /* synthetic */ f1(String str, List list, String str2, String str3, String str4, Double d2, String str5, boolean[] zArr, int i13) {
        this(str, list, str2, str3, str4, d2, str5, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return Objects.equals(this.f37408f, f1Var.f37408f) && Objects.equals(this.f37403a, f1Var.f37403a) && Objects.equals(this.f37404b, f1Var.f37404b) && Objects.equals(this.f37405c, f1Var.f37405c) && Objects.equals(this.f37406d, f1Var.f37406d) && Objects.equals(this.f37407e, f1Var.f37407e) && Objects.equals(this.f37409g, f1Var.f37409g);
    }

    public final String h() {
        return this.f37403a;
    }

    public final int hashCode() {
        return Objects.hash(this.f37403a, this.f37404b, this.f37405c, this.f37406d, this.f37407e, this.f37408f, this.f37409g);
    }

    public final List i() {
        return this.f37404b;
    }

    public final String j() {
        return this.f37405c;
    }

    public final String k() {
        return this.f37406d;
    }

    public final String l() {
        return this.f37407e;
    }

    public final Double m() {
        Double d2 = this.f37408f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String n() {
        return this.f37409g;
    }

    public f1() {
        this.f37410h = new boolean[7];
    }

    private f1(String str, List<ec> list, String str2, String str3, String str4, Double d2, String str5, boolean[] zArr) {
        this.f37403a = str;
        this.f37404b = list;
        this.f37405c = str2;
        this.f37406d = str3;
        this.f37407e = str4;
        this.f37408f = d2;
        this.f37409g = str5;
        this.f37410h = zArr;
    }
}
