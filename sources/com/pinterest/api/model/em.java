package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class em {

    /* renamed from: a, reason: collision with root package name */
    @om.b("components")
    private List<bm> f37302a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f37303b;

    public /* synthetic */ em(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final List b() {
        return this.f37302a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f37302a, ((em) obj).f37302a);
    }

    public final int hashCode() {
        return Objects.hash(this.f37302a);
    }

    public em() {
        this.f37303b = new boolean[1];
    }

    private em(List<bm> list, boolean[] zArr) {
        this.f37302a = list;
        this.f37303b = zArr;
    }
}
