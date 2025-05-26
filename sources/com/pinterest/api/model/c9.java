package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class c9 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("confidence")
    private Double f36321a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("kind")
    private String f36322b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("value")
    private Double f36323c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f36324d;

    public /* synthetic */ c9(Double d2, String str, Double d13, boolean[] zArr, int i13) {
        this(d2, str, d13, zArr);
    }

    public final Double d() {
        Double d2 = this.f36321a;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String e() {
        return this.f36322b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c9 c9Var = (c9) obj;
        return Objects.equals(this.f36323c, c9Var.f36323c) && Objects.equals(this.f36321a, c9Var.f36321a) && Objects.equals(this.f36322b, c9Var.f36322b);
    }

    public final Double f() {
        Double d2 = this.f36323c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f36321a, this.f36322b, this.f36323c);
    }

    public c9() {
        this.f36324d = new boolean[3];
    }

    private c9(Double d2, String str, Double d13, boolean[] zArr) {
        this.f36321a = d2;
        this.f36322b = str;
        this.f36323c = d13;
        this.f36324d = zArr;
    }
}
