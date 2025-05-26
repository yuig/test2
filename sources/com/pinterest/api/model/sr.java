package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class sr {

    /* renamed from: a, reason: collision with root package name */
    @om.b("dominant_color")
    private String f41970a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("height")
    private Double f41971b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("type")
    private String f41972c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("url")
    private String f41973d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("width")
    private Double f41974e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f41975f;

    public /* synthetic */ sr(String str, Double d2, String str2, String str3, Double d13, boolean[] zArr, int i13) {
        this(str, d2, str2, str3, d13, zArr);
    }

    public static pr f() {
        return new pr(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sr srVar = (sr) obj;
        return Objects.equals(this.f41974e, srVar.f41974e) && Objects.equals(this.f41971b, srVar.f41971b) && Objects.equals(this.f41970a, srVar.f41970a) && Objects.equals(this.f41972c, srVar.f41972c) && Objects.equals(this.f41973d, srVar.f41973d);
    }

    public final String g() {
        return this.f41970a;
    }

    public final Double h() {
        Double d2 = this.f41971b;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f41970a, this.f41971b, this.f41972c, this.f41973d, this.f41974e);
    }

    public final String i() {
        return this.f41972c;
    }

    public final String j() {
        return this.f41973d;
    }

    public final Double k() {
        Double d2 = this.f41974e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public sr() {
        this.f41975f = new boolean[5];
    }

    private sr(String str, Double d2, String str2, String str3, Double d13, boolean[] zArr) {
        this.f41970a = str;
        this.f41971b = d2;
        this.f41972c = str2;
        this.f41973d = str3;
        this.f41974e = d13;
        this.f41975f = zArr;
    }
}
