package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class e70 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("privacy_url")
    private String f37194a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37195b;

    public /* synthetic */ e70(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final String b() {
        return this.f37194a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f37194a, ((e70) obj).f37194a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37194a);
    }

    public e70() {
        this.f37195b = new boolean[1];
    }

    private e70(String str, boolean[] zArr) {
        this.f37194a = str;
        this.f37195b = zArr;
    }
}
