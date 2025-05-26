package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class r70 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("brandName")
    private String f41496a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("finish")
    private String f41497b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("gtin")
    private String f41498c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("productLine")
    private String f41499d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("productType")
    private String f41500e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("shadeName")
    private String f41501f;

    /* renamed from: g, reason: collision with root package name */
    @om.b("sku")
    private String f41502g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f41503h;

    public /* synthetic */ r70(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, str7, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r70 r70Var = (r70) obj;
        return Objects.equals(this.f41496a, r70Var.f41496a) && Objects.equals(this.f41497b, r70Var.f41497b) && Objects.equals(this.f41498c, r70Var.f41498c) && Objects.equals(this.f41499d, r70Var.f41499d) && Objects.equals(this.f41500e, r70Var.f41500e) && Objects.equals(this.f41501f, r70Var.f41501f) && Objects.equals(this.f41502g, r70Var.f41502g);
    }

    public final String h() {
        return this.f41496a;
    }

    public final int hashCode() {
        return Objects.hash(this.f41496a, this.f41497b, this.f41498c, this.f41499d, this.f41500e, this.f41501f, this.f41502g);
    }

    public final String i() {
        return this.f41498c;
    }

    public final String j() {
        return this.f41499d;
    }

    public final String k() {
        return this.f41500e;
    }

    public final String l() {
        return this.f41501f;
    }

    public final String m() {
        return this.f41502g;
    }

    public r70() {
        this.f41503h = new boolean[7];
    }

    private r70(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean[] zArr) {
        this.f41496a = str;
        this.f41497b = str2;
        this.f41498c = str3;
        this.f41499d = str4;
        this.f41500e = str5;
        this.f41501f = str6;
        this.f41502g = str7;
        this.f41503h = zArr;
    }
}
