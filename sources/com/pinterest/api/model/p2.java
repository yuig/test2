package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("data")
    private List<l2> f40855a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f40856b;

    public /* synthetic */ p2(List list, boolean[] zArr, int i13) {
        this(list, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f40855a, ((p2) obj).f40855a);
    }

    public final int hashCode() {
        return Objects.hash(this.f40855a);
    }

    public p2() {
        this.f40856b = new boolean[1];
    }

    private p2(List<l2> list, boolean[] zArr) {
        this.f40855a = list;
        this.f40856b = zArr;
    }
}
