package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class of {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private List<sf> f40698a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40699b;

    public /* synthetic */ of(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final List b() {
        return this.f40698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f40698a, ((of) obj).f40698a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40698a);
    }

    public of() {
        this.f40699b = new boolean[1];
    }

    private of(List<sf> list, boolean[] zArr) {
        this.f40698a = list;
        this.f40699b = zArr;
    }
}
