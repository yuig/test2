package com.pinterest.api.model;

import java.util.Objects;

/* loaded from: classes.dex */
public class s4 {

    /* renamed from: a, reason: collision with root package name */
    @om.b("all")
    private w4 f41781a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean[] f41782b;

    public /* synthetic */ s4(w4 w4Var, boolean[] zArr, int i13) {
        this(w4Var, zArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f41781a, ((s4) obj).f41781a);
    }

    public final int hashCode() {
        return Objects.hash(this.f41781a);
    }

    private s4(w4 w4Var, boolean[] zArr) {
        this.f41781a = w4Var;
        this.f41782b = zArr;
    }
}
