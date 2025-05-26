package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41196a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f41197b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("data_status")
    private String f41198c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("value")
    private Double f41199d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f41200e;

    public /* synthetic */ q3(String str, String str2, String str3, Double d2, boolean[] zArr, int i13) {
        this(str, str2, str3, d2, zArr);
    }

    public final String e() {
        return this.f41198c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Objects.equals(this.f41199d, q3Var.f41199d) && Objects.equals(this.f41196a, q3Var.f41196a) && Objects.equals(this.f41197b, q3Var.f41197b) && Objects.equals(this.f41198c, q3Var.f41198c);
    }

    public final Double f() {
        Double d2 = this.f41199d;
        return Double.valueOf(d2 == null ? 0.0d : d2.doubleValue());
    }

    public final int hashCode() {
        return Objects.hash(this.f41196a, this.f41197b, this.f41198c, this.f41199d);
    }

    public q3() {
        this.f41200e = new boolean[4];
    }

    private q3(@NonNull String str, String str2, String str3, Double d2, boolean[] zArr) {
        this.f41196a = str;
        this.f41197b = str2;
        this.f41198c = str3;
        this.f41199d = d2;
        this.f41200e = zArr;
    }
}
