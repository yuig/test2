package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class i8 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f38695a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f38696b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("crop_x")
    private Double f38697c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("crop_y")
    private Double f38698d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("height")
    private Double f38699e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("width")
    private Double f38700f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f38701g;

    public /* synthetic */ i8(String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return Objects.equals(this.f38700f, i8Var.f38700f) && Objects.equals(this.f38699e, i8Var.f38699e) && Objects.equals(this.f38698d, i8Var.f38698d) && Objects.equals(this.f38697c, i8Var.f38697c) && Objects.equals(this.f38695a, i8Var.f38695a) && Objects.equals(this.f38696b, i8Var.f38696b);
    }

    public final Double g() {
        Double d2 = this.f38697c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double h() {
        Double d2 = this.f38698d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f38695a, this.f38696b, this.f38697c, this.f38698d, this.f38699e, this.f38700f);
    }

    public i8() {
        this.f38701g = new boolean[6];
    }

    private i8(@NonNull String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f38695a = str;
        this.f38696b = str2;
        this.f38697c = d2;
        this.f38698d = d13;
        this.f38699e = d14;
        this.f38700f = d15;
        this.f38701g = zArr;
    }
}
