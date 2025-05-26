package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class o6 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("session_internal")
    private String f40625a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40626b;

    public /* synthetic */ o6(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f40625a, ((o6) obj).f40625a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40625a);
    }

    public o6() {
        this.f40626b = new boolean[1];
    }

    private o6(String str, boolean[] zArr) {
        this.f40625a = str;
        this.f40626b = zArr;
    }
}
