package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class qk0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("key_value_blocks")
    private List<wm0> f41324a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("list_blocks")
    private List<en0> f41325b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41326c;

    public /* synthetic */ qk0(List list, List list2, boolean[] zArr, int i13) {
        this(list, list2, zArr);
    }

    public final List c() {
        return this.f41324a;
    }

    public final List d() {
        return this.f41325b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qk0 qk0Var = (qk0) obj;
        return Objects.equals(this.f41324a, qk0Var.f41324a) && Objects.equals(this.f41325b, qk0Var.f41325b);
    }

    public final int hashCode() {
        return Objects.hash(this.f41324a, this.f41325b);
    }

    public qk0() {
        this.f41326c = new boolean[2];
    }

    private qk0(List<wm0> list, List<en0> list2, boolean[] zArr) {
        this.f41324a = list;
        this.f41325b = list2;
        this.f41326c = zArr;
    }
}
