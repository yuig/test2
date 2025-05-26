package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class gd0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private List<cd0> f38046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f38047b;

    public /* synthetic */ gd0(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final List b() {
        return this.f38046a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38046a, ((gd0) obj).f38046a);
    }

    public final int hashCode() {
        return Objects.hash(this.f38046a);
    }

    public gd0() {
        this.f38047b = new boolean[1];
    }

    private gd0(List<cd0> list, boolean[] zArr) {
        this.f38046a = list;
        this.f38047b = zArr;
    }
}
