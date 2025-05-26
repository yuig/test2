package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class g60 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f37972a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("node_id")
    private String f37973b;

    /* renamed from: c, reason: collision with root package name */
    @om.b("country_code")
    private String f37974c;

    /* renamed from: d, reason: collision with root package name */
    @om.b("postal_code")
    private String f37975d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f37976e;

    public /* synthetic */ g60(String str, String str2, String str3, String str4, boolean[] zArr, int i13) {
        this(str, str2, str3, str4, zArr);
    }

    public final String e() {
        return this.f37974c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g60 g60Var = (g60) obj;
        return Objects.equals(this.f37972a, g60Var.f37972a) && Objects.equals(this.f37973b, g60Var.f37973b) && Objects.equals(this.f37974c, g60Var.f37974c) && Objects.equals(this.f37975d, g60Var.f37975d);
    }

    public final String f() {
        return this.f37975d;
    }

    public final int hashCode() {
        return Objects.hash(this.f37972a, this.f37973b, this.f37974c, this.f37975d);
    }

    public g60() {
        this.f37976e = new boolean[4];
    }

    private g60(@NonNull String str, String str2, String str3, String str4, boolean[] zArr) {
        this.f37972a = str;
        this.f37973b = str2;
        this.f37974c = str3;
        this.f37975d = str4;
        this.f37976e = zArr;
    }
}
