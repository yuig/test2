package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class cm0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("all")
    private List<yl0> f36468a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("tags")
    private List<yl0> f36469b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f36470c;

    public /* synthetic */ cm0(List list, List list2, boolean[] zArr, int i13) {
        this(list, list2, zArr);
    }

    public final List c() {
        return this.f36468a;
    }

    public final List d() {
        return this.f36469b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cm0 cm0Var = (cm0) obj;
        return Objects.equals(this.f36468a, cm0Var.f36468a) && Objects.equals(this.f36469b, cm0Var.f36469b);
    }

    public final int hashCode() {
        return Objects.hash(this.f36468a, this.f36469b);
    }

    public cm0() {
        this.f36470c = new boolean[2];
    }

    private cm0(List<yl0> list, List<yl0> list2, boolean[] zArr) {
        this.f36468a = list;
        this.f36469b = list2;
        this.f36470c = zArr;
    }
}
