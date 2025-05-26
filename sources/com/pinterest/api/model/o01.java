package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class o01 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("subtitle")
    private String f40582a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("title")
    private String f40583b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f40584c;

    public /* synthetic */ o01(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f40582a;
    }

    public final String d() {
        return this.f40583b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return Objects.equals(this.f40582a, o01Var.f40582a) && Objects.equals(this.f40583b, o01Var.f40583b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40582a, this.f40583b);
    }

    public o01() {
        this.f40584c = new boolean[2];
    }

    private o01(@NonNull String str, @NonNull String str2, boolean[] zArr) {
        this.f40582a = str;
        this.f40583b = str2;
        this.f40584c = zArr;
    }
}
