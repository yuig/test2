package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    @om.b("api_key")
    private String f42691a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f42692b;

    public /* synthetic */ v(String str, boolean[] zArr, int i13) {
        this(str, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f42691a, ((v) obj).f42691a);
    }

    public final int hashCode() {
        return Objects.hash(this.f42691a);
    }

    public v() {
        this.f42692b = new boolean[1];
    }

    private v(String str, boolean[] zArr) {
        this.f42691a = str;
        this.f42692b = zArr;
    }
}
