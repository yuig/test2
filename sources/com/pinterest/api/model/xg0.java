package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class xg0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("id")
    private String f43682a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    @om.b("name")
    private String f43683b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    @om.b("tab_type")
    private String f43684c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f43685d;

    public /* synthetic */ xg0(String str, String str2, String str3, boolean[] zArr, int i13) {
        this(str, str2, str3, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        return Objects.equals(this.f43682a, xg0Var.f43682a) && Objects.equals(this.f43683b, xg0Var.f43683b) && Objects.equals(this.f43684c, xg0Var.f43684c);
    }

    public final int hashCode() {
        return Objects.hash(this.f43682a, this.f43683b, this.f43684c);
    }

    public xg0() {
        this.f43685d = new boolean[3];
    }

    private xg0(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean[] zArr) {
        this.f43682a = str;
        this.f43683b = str2;
        this.f43684c = str3;
        this.f43685d = zArr;
    }
}
