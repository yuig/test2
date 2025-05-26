package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private List<t0> f43519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f43520b;

    public /* synthetic */ x0(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f43519a, ((x0) obj).f43519a);
    }

    public final int hashCode() {
        return Objects.hash(this.f43519a);
    }

    public x0() {
        this.f43520b = new boolean[1];
    }

    private x0(List<t0> list, boolean[] zArr) {
        this.f43519a = list;
        this.f43520b = zArr;
    }
}
