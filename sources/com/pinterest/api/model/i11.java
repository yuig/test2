package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class i11 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("pin_id")
    private String f38596a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("session_id")
    private String f38597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f38598c;

    public /* synthetic */ i11(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i11 i11Var = (i11) obj;
        return Objects.equals(this.f38596a, i11Var.f38596a) && Objects.equals(this.f38597b, i11Var.f38597b);
    }

    public final int hashCode() {
        return Objects.hash(this.f38596a, this.f38597b);
    }

    public i11() {
        this.f38598c = new boolean[2];
    }

    private i11(String str, String str2, boolean[] zArr) {
        this.f38596a = str;
        this.f38597b = str2;
        this.f38598c = zArr;
    }
}
