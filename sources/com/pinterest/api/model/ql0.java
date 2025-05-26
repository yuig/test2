package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class ql0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("difficulty")
    private Integer f41332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f41333b;

    public /* synthetic */ ql0(Integer num, boolean[] zArr, int i13) {
        this(num, zArr);
    }

    public final Integer b() {
        Integer num = this.f41332a;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f41332a, ((ql0) obj).f41332a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41332a);
    }

    public ql0() {
        this.f41333b = new boolean[1];
    }

    private ql0(Integer num, boolean[] zArr) {
        this.f41332a = num;
        this.f41333b = zArr;
    }
}
