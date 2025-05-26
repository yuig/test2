package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class x6 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("author_name")
    private String f43599a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("author_url")
    private String f43600b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("provider_icon_url")
    private String f43601c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("provider_name")
    private String f43602d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("title")
    private String f43603e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("url")
    private String f43604f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f43605g;

    public /* synthetic */ x6(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, str6, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return Objects.equals(this.f43599a, x6Var.f43599a) && Objects.equals(this.f43600b, x6Var.f43600b) && Objects.equals(this.f43601c, x6Var.f43601c) && Objects.equals(this.f43602d, x6Var.f43602d) && Objects.equals(this.f43603e, x6Var.f43603e) && Objects.equals(this.f43604f, x6Var.f43604f);
    }

    public final int hashCode() {
        return Objects.hash(this.f43599a, this.f43600b, this.f43601c, this.f43602d, this.f43603e, this.f43604f);
    }

    public x6() {
        this.f43605g = new boolean[6];
    }

    private x6(String str, String str2, String str3, String str4, String str5, String str6, boolean[] zArr) {
        this.f43599a = str;
        this.f43600b = str2;
        this.f43601c = str3;
        this.f43602d = str4;
        this.f43603e = str5;
        this.f43604f = str6;
        this.f43605g = zArr;
    }
}
