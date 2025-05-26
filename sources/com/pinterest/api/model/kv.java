package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class kv {

    /* renamed from: a, reason: collision with root package name */
    @om.b("failure_code")
    private String f39544a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("signature")
    private String f39545b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("status")
    private String f39546c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("type")
    private String f39547d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("upload_id")
    private String f39548e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("uploaded_time")
    private Double f39549f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39550g;

    public /* synthetic */ kv(String str, String str2, String str3, String str4, String str5, Double d2, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, str5, d2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kv kvVar = (kv) obj;
        return Objects.equals(this.f39549f, kvVar.f39549f) && Objects.equals(this.f39544a, kvVar.f39544a) && Objects.equals(this.f39545b, kvVar.f39545b) && Objects.equals(this.f39546c, kvVar.f39546c) && Objects.equals(this.f39547d, kvVar.f39547d) && Objects.equals(this.f39548e, kvVar.f39548e);
    }

    public final String g() {
        return this.f39544a;
    }

    public final String h() {
        return this.f39545b;
    }

    public final int hashCode() {
        return Objects.hash(this.f39544a, this.f39545b, this.f39546c, this.f39547d, this.f39548e, this.f39549f);
    }

    public final String i() {
        return this.f39546c;
    }

    public final String j() {
        return this.f39547d;
    }

    public final String k() {
        return this.f39548e;
    }

    public final Double l() {
        Double d2 = this.f39549f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public kv() {
        this.f39550g = new boolean[6];
    }

    private kv(String str, String str2, String str3, String str4, String str5, Double d2, boolean[] zArr) {
        this.f39544a = str;
        this.f39545b = str2;
        this.f39546c = str3;
        this.f39547d = str4;
        this.f39548e = str5;
        this.f39549f = d2;
        this.f39550g = zArr;
    }
}
