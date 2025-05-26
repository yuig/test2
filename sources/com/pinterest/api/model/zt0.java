package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class zt0 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("is_enabled")
    private Boolean f44459a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("verification_configs")
    private List<vt0> f44460b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f44461c;

    public /* synthetic */ zt0(Boolean bool, List list, boolean[] zArr, int i13) {
        this(bool, list, zArr);
    }

    public final Boolean c() {
        Boolean bool = this.f44459a;
        return bool == null ? Boolean.FALSE : bool;
    }

    public final List d() {
        return this.f44460b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zt0 zt0Var = (zt0) obj;
        return Objects.equals(this.f44459a, zt0Var.f44459a) && Objects.equals(this.f44460b, zt0Var.f44460b);
    }

    public final int hashCode() {
        return Objects.hash(this.f44459a, this.f44460b);
    }

    public zt0() {
        this.f44461c = new boolean[2];
    }

    private zt0(Boolean bool, List<vt0> list, boolean[] zArr) {
        this.f44459a = bool;
        this.f44460b = list;
        this.f44461c = zArr;
    }
}
