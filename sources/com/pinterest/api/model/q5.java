package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class q5 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f41210a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("delta")
    private Double f41211b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("is_realtime")
    private Boolean f41212c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("latest_available_timestamp")
    private String f41213d;

    /* renamed from: e, reason: collision with root package name */
    @om.b("num_of_days")
    private Integer f41214e;

    /* renamed from: f, reason: collision with root package name */
    @om.b("value")
    private Integer f41215f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f41216g;

    public /* synthetic */ q5(String str, Double d2, Boolean bool, String str2, Integer num, Integer num2, boolean[] zArr, int i13) {
        this(str, d2, bool, str2, num, num2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return Objects.equals(this.f41215f, q5Var.f41215f) && Objects.equals(this.f41214e, q5Var.f41214e) && Objects.equals(this.f41212c, q5Var.f41212c) && Objects.equals(this.f41211b, q5Var.f41211b) && Objects.equals(this.f41210a, q5Var.f41210a) && Objects.equals(this.f41213d, q5Var.f41213d);
    }

    public final int hashCode() {
        return Objects.hash(this.f41210a, this.f41211b, this.f41212c, this.f41213d, this.f41214e, this.f41215f);
    }

    public q5() {
        this.f41216g = new boolean[6];
    }

    private q5(@NonNull String str, Double d2, Boolean bool, String str2, Integer num, Integer num2, boolean[] zArr) {
        this.f41210a = str;
        this.f41211b = d2;
        this.f41212c = bool;
        this.f41213d = str2;
        this.f41214e = num;
        this.f41215f = num2;
        this.f41216g = zArr;
    }
}
