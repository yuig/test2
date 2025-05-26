package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16998a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f16999b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17000c;

    public y1(boolean z13, Set set, Set set2) {
        this.f16998a = z13;
        this.f16999b = set == null ? Collections.emptySet() : new HashSet(set);
        this.f17000c = set2 == null ? Collections.emptySet() : new HashSet(set2);
    }

    public final boolean a(Class cls, boolean z13) {
        if (this.f16999b.contains(cls)) {
            return true;
        }
        if (this.f17000c.contains(cls)) {
            return false;
        }
        return this.f16998a && z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        y1 y1Var = (y1) obj;
        return this.f16998a == y1Var.f16998a && Objects.equals(this.f16999b, y1Var.f16999b) && Objects.equals(this.f17000c, y1Var.f17000c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f16998a), this.f16999b, this.f17000c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f16998a + ", forceEnabledQuirks=" + this.f16999b + ", forceDisabledQuirks=" + this.f17000c + '}';
    }
}
