package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class kn0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("key_value_blocks")
    private List<pn0> f39498a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("list_blocks")
    private List<tn0> f39499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39500c;

    public /* synthetic */ kn0(List list, List list2, boolean[] zArr, int i13) {
        this(list, list2, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kn0 kn0Var = (kn0) obj;
        return Objects.equals(this.f39498a, kn0Var.f39498a) && Objects.equals(this.f39499b, kn0Var.f39499b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39498a, this.f39499b);
    }

    public kn0() {
        this.f39500c = new boolean[2];
    }

    private kn0(List<pn0> list, List<tn0> list2, boolean[] zArr) {
        this.f39498a = list;
        this.f39499b = list2;
        this.f39500c = zArr;
    }
}
