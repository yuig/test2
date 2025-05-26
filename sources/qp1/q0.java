package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final do1.d f104824a;

    public q0(do1.d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f104824a = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && Intrinsics.d(this.f104824a, ((q0) obj).f104824a);
    }

    public final int hashCode() {
        return this.f104824a.hashCode();
    }

    public final String toString() {
        return "ShowToast(displayState=" + this.f104824a + ")";
    }
}
