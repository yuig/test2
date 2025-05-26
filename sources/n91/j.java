package n91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k92.h f90046a;

    public j(k92.h wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f90046a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f90046a, ((j) obj).f90046a);
    }

    public final int hashCode() {
        return this.f90046a.hashCode();
    }

    public final String toString() {
        return "WrappedToastEvent(wrapped=" + this.f90046a + ")";
    }
}
