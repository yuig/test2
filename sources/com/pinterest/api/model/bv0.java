package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class bv0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36214a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36215b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("center_x")
    private Double f36216c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("center_y")
    private Double f36217d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("end_scale")
    private Double f36218e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("start_scale")
    private Double f36219f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f36220g;

    public /* synthetic */ bv0(String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bv0 bv0Var = (bv0) obj;
        return Objects.equals(this.f36219f, bv0Var.f36219f) && Objects.equals(this.f36218e, bv0Var.f36218e) && Objects.equals(this.f36217d, bv0Var.f36217d) && Objects.equals(this.f36216c, bv0Var.f36216c) && Objects.equals(this.f36214a, bv0Var.f36214a) && Objects.equals(this.f36215b, bv0Var.f36215b);
    }

    public final Double g() {
        Double d2 = this.f36216c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double h() {
        Double d2 = this.f36217d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f36214a, this.f36215b, this.f36216c, this.f36217d, this.f36218e, this.f36219f);
    }

    public final Double i() {
        Double d2 = this.f36218e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Double j() {
        Double d2 = this.f36219f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public bv0() {
        this.f36220g = new boolean[6];
    }

    private bv0(@NonNull String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f36214a = str;
        this.f36215b = str2;
        this.f36216c = d2;
        this.f36217d = d13;
        this.f36218e = d14;
        this.f36219f = d15;
        this.f36220g = zArr;
    }
}
