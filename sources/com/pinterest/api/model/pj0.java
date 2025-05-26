package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class pj0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("height")
    private Double f41011a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("width")
    private Double f41012b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f41013c;

    public /* synthetic */ pj0(Double d2, Double d13, boolean[] zArr, int i13) {
        this(d2, d13, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return Objects.equals(this.f41012b, pj0Var.f41012b) && Objects.equals(this.f41011a, pj0Var.f41011a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41011a, this.f41012b);
    }

    public pj0() {
        this.f41013c = new boolean[2];
    }

    private pj0(Double d2, Double d13, boolean[] zArr) {
        this.f41011a = d2;
        this.f41012b = d13;
        this.f41013c = zArr;
    }
}
