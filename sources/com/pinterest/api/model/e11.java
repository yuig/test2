package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class e11 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("session_internal")
    private String f37033a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37034b;

    public /* synthetic */ e11(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f37033a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f37033a, ((e11) obj).f37033a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37033a);
    }

    public e11() {
        this.f37034b = new boolean[1];
    }

    private e11(String str, boolean[] zArr) {
        this.f37033a = str;
        this.f37034b = zArr;
    }
}
