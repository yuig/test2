package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class q40 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("results")
    private List<m40> f41208a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f41209b;

    public /* synthetic */ q40(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final List b() {
        return this.f41208a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f41208a, ((q40) obj).f41208a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41208a);
    }

    public q40() {
        this.f41209b = new boolean[1];
    }

    private q40(List<m40> list, boolean[] zArr) {
        this.f41208a = list;
        this.f41209b = zArr;
    }
}
