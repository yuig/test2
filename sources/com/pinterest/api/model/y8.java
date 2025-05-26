package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class y8 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("metadata")
    private String f43970a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("title")
    private String f43971b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f43972c;

    public /* synthetic */ y8(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f43970a;
    }

    public final String d() {
        return this.f43971b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return Objects.equals(this.f43970a, y8Var.f43970a) && Objects.equals(this.f43971b, y8Var.f43971b);
    }

    public final int hashCode() {
        return Objects.hash(this.f43970a, this.f43971b);
    }

    public y8() {
        this.f43972c = new boolean[2];
    }

    private y8(String str, String str2, boolean[] zArr) {
        this.f43970a = str;
        this.f43971b = str2;
        this.f43972c = zArr;
    }
}
