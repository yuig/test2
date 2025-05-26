package com.pinterest.api.model;

import androidx.annotation.NonNull;
import com.appsflyer.AdRevenueScheme;
import java.util.Objects;

/* loaded from: classes.dex */
public class xs0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43784a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f43785b;

    /* renamed from: c, reason: collision with root package name */
    @om.b(AdRevenueScheme.COUNTRY)
    private String f43786c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("gma")
    private bt0 f43787d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f43788e;

    public /* synthetic */ xs0(String str, String str2, String str3, bt0 bt0Var, boolean[] zArr, int i13) {
        this(str, str2, str3, bt0Var, zArr);
    }

    public final String e() {
        return this.f43786c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xs0 xs0Var = (xs0) obj;
        return Objects.equals(this.f43784a, xs0Var.f43784a) && Objects.equals(this.f43785b, xs0Var.f43785b) && Objects.equals(this.f43786c, xs0Var.f43786c) && Objects.equals(this.f43787d, xs0Var.f43787d);
    }

    public final bt0 f() {
        return this.f43787d;
    }

    public final int hashCode() {
        return Objects.hash(this.f43784a, this.f43785b, this.f43786c, this.f43787d);
    }

    public xs0() {
        this.f43788e = new boolean[4];
    }

    private xs0(@NonNull String str, String str2, String str3, bt0 bt0Var, boolean[] zArr) {
        this.f43784a = str;
        this.f43785b = str2;
        this.f43786c = str3;
        this.f43787d = bt0Var;
        this.f43788e = zArr;
    }
}
