package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class lu0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f39899a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f39900b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("x_1")
    private Double f39901c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("x_2")
    private Double f39902d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("y_1")
    private Double f39903e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("y_2")
    private Double f39904f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f39905g;

    public /* synthetic */ lu0(String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr, int i13) {
        this(str, str2, d2, d13, d14, d15, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return Objects.equals(this.f39904f, lu0Var.f39904f) && Objects.equals(this.f39903e, lu0Var.f39903e) && Objects.equals(this.f39902d, lu0Var.f39902d) && Objects.equals(this.f39901c, lu0Var.f39901c) && Objects.equals(this.f39899a, lu0Var.f39899a) && Objects.equals(this.f39900b, lu0Var.f39900b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39899a, this.f39900b, this.f39901c, this.f39902d, this.f39903e, this.f39904f);
    }

    public lu0() {
        this.f39905g = new boolean[6];
    }

    private lu0(@NonNull String str, String str2, Double d2, Double d13, Double d14, Double d15, boolean[] zArr) {
        this.f39899a = str;
        this.f39900b = str2;
        this.f39901c = d2;
        this.f39902d = d13;
        this.f39903e = d14;
        this.f39904f = d15;
        this.f39905g = zArr;
    }
}
