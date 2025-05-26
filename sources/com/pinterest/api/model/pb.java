package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class pb {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private List<String> f40931a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40932b;

    public /* synthetic */ pb(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f40931a, ((pb) obj).f40931a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40931a);
    }

    public pb() {
        this.f40932b = new boolean[1];
    }

    private pb(List<String> list, boolean[] zArr) {
        this.f40931a = list;
        this.f40932b = zArr;
    }
}
