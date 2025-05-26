package iu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final du1.b f73717a;

    public r(du1.b wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f73717a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f73717a, ((r) obj).f73717a);
    }

    public final int hashCode() {
        return this.f73717a.hashCode();
    }

    public final String toString() {
        return "WrappedNavigationEffectRequest(wrapped=" + this.f73717a + ")";
    }
}
