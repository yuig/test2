package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class or {

    /* renamed from: a, reason: collision with root package name */
    @om.b("max_y")
    private Double f40782a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("min_y")
    private Double f40783b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40784c;

    public /* synthetic */ or(Double d2, Double d13, boolean[] zArr, int i13) {
        this(d2, d13, zArr);
    }

    public final Double c() {
        Double d2 = this.f40782a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double d() {
        Double d2 = this.f40783b;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        or orVar = (or) obj;
        return Objects.equals(this.f40783b, orVar.f40783b) && Objects.equals(this.f40782a, orVar.f40782a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40782a, this.f40783b);
    }

    public or() {
        this.f40784c = new boolean[2];
    }

    private or(Double d2, Double d13, boolean[] zArr) {
        this.f40782a = d2;
        this.f40783b = d13;
        this.f40784c = zArr;
    }
}
