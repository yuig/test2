package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class bs {

    /* renamed from: a, reason: collision with root package name */
    @om.b("friendly_name")
    private String f36173a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("index")
    private Double f36174b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("name")
    private String f36175c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("ratio")
    private Double f36176d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f36177e;

    public /* synthetic */ bs(String str, Double d2, String str2, Double d13, boolean[] zArr, int i13) {
        this(str, d2, str2, d13, zArr);
    }

    public final String e() {
        return this.f36173a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bs bsVar = (bs) obj;
        return Objects.equals(this.f36176d, bsVar.f36176d) && Objects.equals(this.f36174b, bsVar.f36174b) && Objects.equals(this.f36173a, bsVar.f36173a) && Objects.equals(this.f36175c, bsVar.f36175c);
    }

    public final Double f() {
        Double d2 = this.f36174b;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String g() {
        return this.f36175c;
    }

    public final Double h() {
        Double d2 = this.f36176d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f36173a, this.f36174b, this.f36175c, this.f36176d);
    }

    public bs() {
        this.f36177e = new boolean[4];
    }

    private bs(String str, Double d2, String str2, Double d13, boolean[] zArr) {
        this.f36173a = str;
        this.f36174b = d2;
        this.f36175c = str2;
        this.f36176d = d13;
        this.f36177e = zArr;
    }
}
