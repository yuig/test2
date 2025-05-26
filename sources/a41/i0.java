package a41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f622a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f623b;

    public i0(k0 visibilityState, boolean z13) {
        Intrinsics.checkNotNullParameter(visibilityState, "visibilityState");
        this.f622a = visibilityState;
        this.f623b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f622a == i0Var.f622a && this.f623b == i0Var.f623b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f623b) + (this.f622a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderState(visibilityState=" + this.f622a + ", shouldAnimateStateChange=" + this.f623b + ")";
    }
}
