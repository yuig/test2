package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f59400a;

    public z(l newMediaVisibility) {
        Intrinsics.checkNotNullParameter(newMediaVisibility, "newMediaVisibility");
        this.f59400a = newMediaVisibility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.f59400a == ((z) obj).f59400a;
    }

    public final int hashCode() {
        return this.f59400a.hashCode();
    }

    public final l j() {
        return this.f59400a;
    }

    public final String toString() {
        return "OnMediaVisibilityChanged(newMediaVisibility=" + this.f59400a + ")";
    }
}
