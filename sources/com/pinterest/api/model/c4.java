package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class c4 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f36287a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f36288b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("metrics")
    private y3 f36289c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("overall_data_status")
    private String f36290d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("timestamp")
    private Double f36291e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f36292f;

    public /* synthetic */ c4(String str, String str2, y3 y3Var, String str3, Double d2, boolean[] zArr, int i13) {
        this(str, str2, y3Var, str3, d2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Objects.equals(this.f36291e, c4Var.f36291e) && Objects.equals(this.f36287a, c4Var.f36287a) && Objects.equals(this.f36288b, c4Var.f36288b) && Objects.equals(this.f36289c, c4Var.f36289c) && Objects.equals(this.f36290d, c4Var.f36290d);
    }

    public final y3 f() {
        return this.f36289c;
    }

    public final Double g() {
        Double d2 = this.f36291e;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f36287a, this.f36288b, this.f36289c, this.f36290d, this.f36291e);
    }

    public c4() {
        this.f36292f = new boolean[5];
    }

    private c4(@NonNull String str, String str2, y3 y3Var, String str3, Double d2, boolean[] zArr) {
        this.f36287a = str;
        this.f36288b = str2;
        this.f36289c = y3Var;
        this.f36290d = str3;
        this.f36291e = d2;
        this.f36292f = zArr;
    }
}
