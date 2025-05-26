package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class fv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37814a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37815b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("end_x")
    private Double f37816c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("end_y")
    private Double f37817d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("start_x")
    private Double f37818e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("start_y")
    private Double f37819f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f37820g;

    public /* synthetic */ fv0(String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return Objects.equals(this.f37819f, fv0Var.f37819f) && Objects.equals(this.f37818e, fv0Var.f37818e) && Objects.equals(this.f37817d, fv0Var.f37817d) && Objects.equals(this.f37816c, fv0Var.f37816c) && Objects.equals(this.f37814a, fv0Var.f37814a) && Objects.equals(this.f37815b, fv0Var.f37815b);
    }

    public final Double g() {
        Double d2 = this.f37816c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double h() {
        Double d2 = this.f37817d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f37814a, this.f37815b, this.f37816c, this.f37817d, this.f37818e, this.f37819f);
    }

    public final Double i() {
        Double d2 = this.f37818e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double j() {
        Double d2 = this.f37819f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public fv0() {
        this.f37820g = new boolean[6];
    }

    private fv0(@NonNull String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f37814a = str;
        this.f37815b = str2;
        this.f37816c = d2;
        this.f37817d = d13;
        this.f37818e = d14;
        this.f37819f = d15;
        this.f37820g = zArr;
    }
}
