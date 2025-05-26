package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class b30 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f35956a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f35957b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("code")
    private String f35958c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("phone_code")
    private String f35959d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f35960e;

    public /* synthetic */ b30(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f35958c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return Objects.equals(this.f35956a, b30Var.f35956a) && Objects.equals(this.f35957b, b30Var.f35957b) && Objects.equals(this.f35958c, b30Var.f35958c) && Objects.equals(this.f35959d, b30Var.f35959d);
    }

    public final String f() {
        return this.f35959d;
    }

    public final int hashCode() {
        return Objects.hash(this.f35956a, this.f35957b, this.f35958c, this.f35959d);
    }

    public b30() {
        this.f35960e = new boolean[4];
    }

    private b30(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f35956a = str;
        this.f35957b = str2;
        this.f35958c = str3;
        this.f35959d = str4;
        this.f35960e = zArr;
    }
}
