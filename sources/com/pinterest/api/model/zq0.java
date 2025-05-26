package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class zq0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("block_type")
    private Integer f44413a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("block_style")
    private zk0 f44414b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("end_time")
    private Double f44415c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("is_removed")
    private Boolean f44416d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("pin_id")
    private String f44417e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("start_time")
    private Double f44418f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    @om.b("type")
    private String f44419g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f44420h;

    public /* synthetic */ zq0(Integer num, zk0 zk0Var, Double d2, Boolean bool, String str, Double d13, String str2, boolean[] zArr, int i13) {
        this(num, zk0Var, d2, bool, str, d13, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zq0 zq0Var = (zq0) obj;
        return Objects.equals(this.f44418f, zq0Var.f44418f) && Objects.equals(this.f44416d, zq0Var.f44416d) && Objects.equals(this.f44415c, zq0Var.f44415c) && Objects.equals(this.f44413a, zq0Var.f44413a) && Objects.equals(this.f44414b, zq0Var.f44414b) && Objects.equals(this.f44417e, zq0Var.f44417e) && Objects.equals(this.f44419g, zq0Var.f44419g);
    }

    public final zk0 h() {
        return this.f44414b;
    }

    public final int hashCode() {
        return Objects.hash(this.f44413a, this.f44414b, this.f44415c, this.f44416d, this.f44417e, this.f44418f, this.f44419g);
    }

    public final Double i() {
        Double d2 = this.f44415c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final Boolean j() {
        Boolean bool = this.f44416d;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final String k() {
        return this.f44417e;
    }

    public final Double l() {
        Double d2 = this.f44418f;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public zq0() {
        this.f44420h = new boolean[7];
    }

    private zq0(Integer num, zk0 zk0Var, Double d2, Boolean bool, @NonNull String str, Double d13, @NonNull String str2, boolean[] zArr) {
        this.f44413a = num;
        this.f44414b = zk0Var;
        this.f44415c = d2;
        this.f44416d = bool;
        this.f44417e = str;
        this.f44418f = d13;
        this.f44419g = str2;
        this.f44420h = zArr;
    }
}
