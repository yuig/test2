package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    @om.b("url")
    private String f44164a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f44165b;

    public /* synthetic */ z(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f44164a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f44164a, ((z) obj).f44164a);
    }

    public final int hashCode() {
        return Objects.hash(this.f44164a);
    }

    public z() {
        this.f44165b = new boolean[1];
    }

    private z(String str, boolean[] zArr) {
        this.f44164a = str;
        this.f44165b = zArr;
    }
}
