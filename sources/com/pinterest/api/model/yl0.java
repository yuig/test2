package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class yl0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f44072a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("key")
    private String f44073b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("line_height")
    private Double f44074c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f44075d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    @om.b("url")
    private String f44076e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f44077f;

    public /* synthetic */ yl0(String str, String str2, Double d2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, d2, str3, str4, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        yl0 yl0Var = (yl0) obj;
        return Objects.equals(this.f44074c, yl0Var.f44074c) && Objects.equals(this.f44072a, yl0Var.f44072a) && Objects.equals(this.f44073b, yl0Var.f44073b) && Objects.equals(this.f44075d, yl0Var.f44075d) && Objects.equals(this.f44076e, yl0Var.f44076e);
    }

    public final String f() {
        return this.f44073b;
    }

    public final Double g() {
        Double d2 = this.f44074c;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final String h() {
        return this.f44075d;
    }

    public final int hashCode() {
        return Objects.hash(this.f44072a, this.f44073b, this.f44074c, this.f44075d, this.f44076e);
    }

    public final String i() {
        return this.f44072a;
    }

    public final String j() {
        return this.f44076e;
    }

    public yl0() {
        this.f44077f = new boolean[5];
    }

    private yl0(@NonNull String str, @NonNull String str2, Double d2, @NonNull String str3, @NonNull String str4, boolean[] zArr) {
        this.f44072a = str;
        this.f44073b = str2;
        this.f44074c = d2;
        this.f44075d = str3;
        this.f44076e = str4;
        this.f44077f = zArr;
    }
}
