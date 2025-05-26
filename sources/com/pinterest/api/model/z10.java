package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class z10 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("checkout_url")
    private String f44175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f44176b;

    public /* synthetic */ z10(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f44175a, ((z10) obj).f44175a);
    }

    public final int hashCode() {
        return Objects.hash(this.f44175a);
    }

    public z10() {
        this.f44176b = new boolean[1];
    }

    private z10(String str, boolean[] zArr) {
        this.f44175a = str;
        this.f44176b = zArr;
    }
}
